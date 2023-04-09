package reversetemplate

import (
	"bytes"
	"io"
	"strings"

	"github.com/antlr/antlr4/runtime/Go/antlr/v4"
	"github.com/pkg/errors"
	"github.com/suifengpiao14/reversetemplate/parser"
)

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

func (rev *Reversetemplate) Execute(data []byte) (out string, err error) {
	parseRuleContext := rev.p.GetRuleContext()
	reader := bytes.NewReader(data)
	nodes, err := convertToTerminalNodeImpl(parseRuleContext.GetChildren())
	if err != nil {
		return "", err
	}

	for _, node := range nodes {
		typ := node.GetSymbol().GetTokenType()
		tokenParsers, err := makeTokenParser(typ)
		if err != nil {
			return "", err
		}
		tokenParsers.Parse(node, reader, &out)
	}

	return out, nil
}

func makeTokenParser(typ int) (tokenParser TokenParser, err error) {
	switch typ {
	case parser.ReversetemplateLexerStr:
		return TokenParserFn(ParserStr), nil
	case parser.ReversetemplateLexerEmpty:
		return TokenParserFn(ParseEmpy), nil

	}
	err = errors.Errorf("not implemented")
	return nil, err
}

type TokenParser interface {
	Parse(nodes *antlr.TerminalNodeImpl, reader *bytes.Reader, out *string) (err error)
}
type TokenParserFn func(node *antlr.TerminalNodeImpl, reader *bytes.Reader, out *string) (err error)

func (fn TokenParserFn) Parse(node *antlr.TerminalNodeImpl, reader *bytes.Reader, out *string) (err error) {
	return fn(node, reader, out)
}

func ParserStr(node *antlr.TerminalNodeImpl, reader *bytes.Reader, out *string) (err error) {
	text := node.GetText()
	data := make([]byte, len(text))
	_, err = reader.Read(data)
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

func ParseEmpy(node *antlr.TerminalNodeImpl, reader *bytes.Reader, out *string) (err error) {
	node.GetParent()
	nextToken := node.GetSymbol().GetTokenSource().NextToken()
	node.GetSymbol().GetTokenSource().GetTokenFactory()
	nextText := nextToken.GetText()
	var b bytes.Buffer
	n, err := reader.WriteTo(&b)
	if err != nil {
		return err
	}
	_, err = reader.Seek(-n, io.SeekCurrent)
	if err != nil {
		return err
	}
	index := strings.Index(b.String(), nextText)
	if index < 0 {
		err = errors.Errorf("not found tpl str:%s,got:%s", nextText, b.String())
		return err
	}
	_, err = reader.Seek(int64(index), io.SeekCurrent)
	if err != nil {
		return err
	}
	return nil
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
