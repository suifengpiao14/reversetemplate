// Code generated from Reversetemplate.g4 by ANTLR 4.12.0. DO NOT EDIT.

package parser // Reversetemplate

import (
	"fmt"
	"strconv"
	"sync"

	"github.com/antlr/antlr4/runtime/Go/antlr/v4"
)

// Suppress unused import errors
var _ = fmt.Printf
var _ = strconv.Itoa
var _ = sync.Once{}

type ReversetemplateParser struct {
	*antlr.BaseParser
}

var reversetemplateParserStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	literalNames           []string
	symbolicNames          []string
	ruleNames              []string
	predictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func reversetemplateParserInit() {
	staticData := &reversetemplateParserStaticData
	staticData.literalNames = []string{
		"", "'{{'", "'}}'", "", "", "'{{end}}'",
	}
	staticData.symbolicNames = []string{
		"", "LeftDim", "RightDim", "Empty", "Loop", "End", "Gjson", "Segment",
	}
	staticData.ruleNames = []string{
		"parseTpl", "every",
	}
	staticData.predictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 1, 7, 15, 2, 0, 7, 0, 2, 1, 7, 1, 1, 0, 1, 0, 1, 1, 5, 1, 8, 8, 1, 10,
		1, 12, 1, 11, 9, 1, 1, 1, 1, 1, 1, 1, 1, 9, 0, 2, 0, 2, 0, 0, 13, 0, 4,
		1, 0, 0, 0, 2, 9, 1, 0, 0, 0, 4, 5, 3, 2, 1, 0, 5, 1, 1, 0, 0, 0, 6, 8,
		9, 0, 0, 0, 7, 6, 1, 0, 0, 0, 8, 11, 1, 0, 0, 0, 9, 10, 1, 0, 0, 0, 9,
		7, 1, 0, 0, 0, 10, 12, 1, 0, 0, 0, 11, 9, 1, 0, 0, 0, 12, 13, 5, 0, 0,
		1, 13, 3, 1, 0, 0, 0, 1, 9,
	}
	deserializer := antlr.NewATNDeserializer(nil)
	staticData.atn = deserializer.Deserialize(staticData.serializedATN)
	atn := staticData.atn
	staticData.decisionToDFA = make([]*antlr.DFA, len(atn.DecisionToState))
	decisionToDFA := staticData.decisionToDFA
	for index, state := range atn.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(state, index)
	}
}

// ReversetemplateParserInit initializes any static state used to implement ReversetemplateParser. By default the
// static state used to implement the parser is lazily initialized during the first call to
// NewReversetemplateParser(). You can call this function if you wish to initialize the static state ahead
// of time.
func ReversetemplateParserInit() {
	staticData := &reversetemplateParserStaticData
	staticData.once.Do(reversetemplateParserInit)
}

// NewReversetemplateParser produces a new parser instance for the optional input antlr.TokenStream.
func NewReversetemplateParser(input antlr.TokenStream) *ReversetemplateParser {
	ReversetemplateParserInit()
	this := new(ReversetemplateParser)
	this.BaseParser = antlr.NewBaseParser(input)
	staticData := &reversetemplateParserStaticData
	this.Interpreter = antlr.NewParserATNSimulator(this, staticData.atn, staticData.decisionToDFA, staticData.predictionContextCache)
	this.RuleNames = staticData.ruleNames
	this.LiteralNames = staticData.literalNames
	this.SymbolicNames = staticData.symbolicNames
	this.GrammarFileName = "Reversetemplate.g4"

	return this
}

// ReversetemplateParser tokens.
const (
	ReversetemplateParserEOF      = antlr.TokenEOF
	ReversetemplateParserLeftDim  = 1
	ReversetemplateParserRightDim = 2
	ReversetemplateParserEmpty    = 3
	ReversetemplateParserLoop     = 4
	ReversetemplateParserEnd      = 5
	ReversetemplateParserGjson    = 6
	ReversetemplateParserSegment  = 7
)

// ReversetemplateParser rules.
const (
	ReversetemplateParserRULE_parseTpl = 0
	ReversetemplateParserRULE_every    = 1
)

// IParseTplContext is an interface to support dynamic dispatch.
type IParseTplContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	Every() IEveryContext

	// IsParseTplContext differentiates from other interfaces.
	IsParseTplContext()
}

type ParseTplContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyParseTplContext() *ParseTplContext {
	var p = new(ParseTplContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ReversetemplateParserRULE_parseTpl
	return p
}

func (*ParseTplContext) IsParseTplContext() {}

func NewParseTplContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ParseTplContext {
	var p = new(ParseTplContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ReversetemplateParserRULE_parseTpl

	return p
}

func (s *ParseTplContext) GetParser() antlr.Parser { return s.parser }

func (s *ParseTplContext) Every() IEveryContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IEveryContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IEveryContext)
}

func (s *ParseTplContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ParseTplContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ParseTplContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ReversetemplateListener); ok {
		listenerT.EnterParseTpl(s)
	}
}

func (s *ParseTplContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ReversetemplateListener); ok {
		listenerT.ExitParseTpl(s)
	}
}

func (p *ReversetemplateParser) ParseTpl() (localctx IParseTplContext) {
	this := p
	_ = this

	localctx = NewParseTplContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, ReversetemplateParserRULE_parseTpl)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(4)
		p.Every()
	}

	return localctx
}

// IEveryContext is an interface to support dynamic dispatch.
type IEveryContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	EOF() antlr.TerminalNode

	// IsEveryContext differentiates from other interfaces.
	IsEveryContext()
}

type EveryContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyEveryContext() *EveryContext {
	var p = new(EveryContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ReversetemplateParserRULE_every
	return p
}

func (*EveryContext) IsEveryContext() {}

func NewEveryContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *EveryContext {
	var p = new(EveryContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ReversetemplateParserRULE_every

	return p
}

func (s *EveryContext) GetParser() antlr.Parser { return s.parser }

func (s *EveryContext) EOF() antlr.TerminalNode {
	return s.GetToken(ReversetemplateParserEOF, 0)
}

func (s *EveryContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *EveryContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *EveryContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ReversetemplateListener); ok {
		listenerT.EnterEvery(s)
	}
}

func (s *EveryContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ReversetemplateListener); ok {
		listenerT.ExitEvery(s)
	}
}

func (p *ReversetemplateParser) Every() (localctx IEveryContext) {
	this := p
	_ = this

	localctx = NewEveryContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, ReversetemplateParserRULE_every)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(9)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 0, p.GetParserRuleContext())

	for _alt != 1 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1+1 {
			p.SetState(6)
			p.MatchWildcard()

		}
		p.SetState(11)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 0, p.GetParserRuleContext())
	}
	{
		p.SetState(12)
		p.Match(ReversetemplateParserEOF)
	}

	return localctx
}
