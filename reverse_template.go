package reversetemplate

import (
	"bytes"
	"io"
	"strings"

	"github.com/antlr/antlr4/runtime/Go/antlr/v4"
	"github.com/pkg/errors"
	"github.com/suifengpiao14/reversetemplate/parser"
	"github.com/tidwall/sjson"
)

const (
	LeftDim     = "{{"
	RightDim    = "}}"
	TOKEN_GJSON = "gjson"
)

var IsTrimSpace = true

type Reversetemplate struct {
	*parser.BaseReversetemplateListener
	p *parser.ParseTplContext
}

func (rev *Reversetemplate) ExitParseTpl(ctx *parser.ParseTplContext) {
	rev.p = ctx
}

func Parse(tpl string) (revTpl *Reversetemplate) {
	tpl = strings.TrimSpace(tpl)
	inputStream := antlr.NewInputStream(tpl)

	// Create the Lexer
	lexer := parser.NewReversetemplateLexer(inputStream)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	// Create the Parser
	p := parser.NewReversetemplateParser(stream)

	// Finally parse the expression
	l := &Reversetemplate{}
	antlr.ParseTreeWalkerDefault.Walk(l, p.ParseTpl())

	return l
}

func (rev *Reversetemplate) Execute(data []byte) (out []byte, err error) {
	parseRuleContext := rev.p.GetRuleContext()
	nodes, err := convertToTerminalNodeImpl(parseRuleContext.GetChildren())
	if err != nil {
		return nil, err
	}
	imp := newParserImp(nodes, data)
	out, err = imp.Parse()
	if err != nil {
		return nil, err
	}
	return out, nil
}

type parserImp struct {
	nodes        []*antlr.TerminalNodeImpl
	originalData []byte
	buf          *bytes.Buffer
	out          []byte
}

func newParserImp(nodes []*antlr.TerminalNodeImpl, data []byte) (imp *parserImp) {
	out := make([]byte, 0)
	imp = &parserImp{
		nodes:        nodes,
		originalData: data,
		buf:          bytes.NewBuffer(data),
		out:          out,
	}
	return imp
}

func (pi *parserImp) GetNodeByIndex(index int) (node *antlr.TerminalNodeImpl, ok bool) {
	if index < 0 || index >= len(pi.nodes) {
		return nil, false
	}
	return pi.nodes[index], true
}

func (pi *parserImp) Parse() (out []byte, err error) {

	for i, node := range pi.nodes {
		typ := node.GetSymbol().GetTokenType()
		switch typ {
		case parser.ReversetemplateLexerSegment:
			err = pi.ParserSegment(i)
		case parser.ReversetemplateLexerEmpty:
			err = pi.ParseEmpy(i)
		case parser.ReversetemplateLexerGjson:
			err = pi.ParseGjson(i)
		default:
			err = errors.Errorf("not implemented type %d", typ)
		}
		if err != nil {
			return nil, err
		}
	}
	out = pi.out
	return out, nil
}

type TokenParser interface {
	Parse(nodes *antlr.TerminalNodeImpl, reader *bytes.Reader, out *string) (err error)
}
type TokenParserFn func(node *antlr.TerminalNodeImpl, reader *bytes.Reader, out *string) (err error)

func (fn TokenParserFn) Parse(node *antlr.TerminalNodeImpl, reader *bytes.Reader, out *string) (err error) {
	return fn(node, reader, out)
}

func (pi *parserImp) ParserSegment(index int) (err error) {
	node, _ := pi.GetNodeByIndex(index)
	text := node.GetText()
	data := make([]byte, len(text))
	_, err = pi.buf.Read(data)
	if err != nil {
		return err
	}
	dataStr := string(data)
	if text != dataStr {
		err = errors.Errorf("not found tpl string:%s,got:%s", text, dataStr)
		return err
	}
	return nil
}

func (pi *parserImp) ParseEmpy(index int) (err error) {
	nextNode, ok := pi.GetNodeByIndex(index + 1)
	if !ok {
		return nil
	}
	n, err := pi.getStrTokenDataIndex(nextNode)
	if err != nil {
		return err
	}
	pi.buf.Next(n)
	return nil
}

func (pi *parserImp) ParseGjson(index int) (err error) {
	node, _ := pi.GetNodeByIndex(index)
	gjsonTpl := node.GetText()
	value := ""
	nextNode, ok := pi.GetNodeByIndex(index + 1)
	if !ok {
		value = pi.buf.String()
	} else {
		n, err := pi.getStrTokenDataIndex(nextNode)
		if err != nil {
			return err
		}
		b := make([]byte, n)
		_, err = pi.buf.Read(b)
		if err != nil {
			return err
		}
		value = string(b)
	}
	str := strings.TrimSuffix(gjsonTpl, RightDim)
	lastIndex := strings.LastIndex(strings.TrimSpace(str), " ")
	if lastIndex < 0 {
		err = errors.Errorf("gjson token err:required arg path,got:%s", gjsonTpl)
		return err
	}
	path := str[lastIndex+1:]
	if IsTrimSpace {
		value = strings.TrimSpace(value)
	}
	pi.out, err = sjson.SetBytes(pi.out, path, value)
	if err != nil {
		return err
	}
	return nil
}

func (pi *parserImp) getStrTokenDataIndex(node *antlr.TerminalNodeImpl) (strTokenIndex int, err error) {
	typ := node.GetSymbol().GetTokenType()
	if typ != parser.ReversetemplateLexerSegment {
		err = errors.Errorf("getStrTokenDataIndex.err: node type want:%d,got:%d", parser.ReversetemplateLexerSegment, typ)
		return 0, err
	}
	strToken := node.GetText()
	s := pi.buf.String()
	if s == "" || s == io.EOF.Error() {
		return 0, nil
	}
	strTokenIndex = strings.Index(s, strToken)
	if strTokenIndex < 0 {
		err = errors.Errorf("not found tpl string:%s,got:%s", strToken, s)
		return 0, err
	}
	pi.buf.Reset()
	_, err = pi.buf.WriteString(s)
	if err != nil {
		return 0, err
	}
	return strTokenIndex, nil
}

func convertToTerminalNodeImpl(trees []antlr.Tree) (tokens []*antlr.TerminalNodeImpl, err error) {
	tokens = make([]*antlr.TerminalNodeImpl, 0)
	for _, tree := range trees {
		terminalNodeImpl, ok := tree.(*antlr.TerminalNodeImpl)
		if ok {
			tokens = append(tokens, terminalNodeImpl)
		}
		childtokens, err := convertToTerminalNodeImpl(tree.GetChildren())
		if err != nil {
			return nil, err
		}
		tokens = append(tokens, childtokens...)
	}
	if err != nil {
		return nil, err
	}
	return tokens, nil
}
