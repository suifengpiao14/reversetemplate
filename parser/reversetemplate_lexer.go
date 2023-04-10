// Code generated from Reversetemplate.g4 by ANTLR 4.12.0. DO NOT EDIT.

package parser

import (
	"fmt"
	"sync"
	"unicode"

	"github.com/antlr/antlr4/runtime/Go/antlr/v4"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = sync.Once{}
var _ = unicode.IsLetter

type ReversetemplateLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

var reversetemplatelexerLexerStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	channelNames           []string
	modeNames              []string
	literalNames           []string
	symbolicNames          []string
	ruleNames              []string
	predictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func reversetemplatelexerLexerInit() {
	staticData := &reversetemplatelexerLexerStaticData
	staticData.channelNames = []string{
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
	}
	staticData.modeNames = []string{
		"DEFAULT_MODE",
	}
	staticData.literalNames = []string{
		"", "'{{'", "'}}'", "", "", "'{{end}}'",
	}
	staticData.symbolicNames = []string{
		"", "LeftDim", "RightDim", "Empty", "Loop", "End", "Gjson", "Segment",
	}
	staticData.ruleNames = []string{
		"LeftDim", "RightDim", "Empty", "Loop", "End", "Gjson", "Segment",
	}
	staticData.predictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 0, 7, 79, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2,
		4, 7, 4, 2, 5, 7, 5, 2, 6, 7, 6, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1,
		2, 1, 2, 1, 2, 1, 2, 5, 2, 26, 8, 2, 10, 2, 12, 2, 29, 9, 2, 1, 2, 1, 2,
		1, 2, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 5, 3, 42, 8, 3, 10,
		3, 12, 3, 45, 9, 3, 1, 3, 1, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1,
		4, 1, 4, 1, 4, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 5,
		5, 67, 8, 5, 10, 5, 12, 5, 70, 9, 5, 1, 5, 1, 5, 1, 5, 1, 6, 4, 6, 76,
		8, 6, 11, 6, 12, 6, 77, 2, 43, 68, 0, 7, 1, 1, 3, 2, 5, 3, 7, 4, 9, 5,
		11, 6, 13, 7, 1, 0, 2, 2, 0, 9, 10, 12, 13, 2, 0, 123, 123, 125, 125, 82,
		0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 7, 1, 0, 0, 0,
		0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0, 13, 1, 0, 0, 0, 1, 15, 1, 0, 0,
		0, 3, 18, 1, 0, 0, 0, 5, 21, 1, 0, 0, 0, 7, 33, 1, 0, 0, 0, 9, 49, 1, 0,
		0, 0, 11, 57, 1, 0, 0, 0, 13, 75, 1, 0, 0, 0, 15, 16, 5, 123, 0, 0, 16,
		17, 5, 123, 0, 0, 17, 2, 1, 0, 0, 0, 18, 19, 5, 125, 0, 0, 19, 20, 5, 125,
		0, 0, 20, 4, 1, 0, 0, 0, 21, 22, 5, 123, 0, 0, 22, 23, 5, 123, 0, 0, 23,
		27, 1, 0, 0, 0, 24, 26, 7, 0, 0, 0, 25, 24, 1, 0, 0, 0, 26, 29, 1, 0, 0,
		0, 27, 25, 1, 0, 0, 0, 27, 28, 1, 0, 0, 0, 28, 30, 1, 0, 0, 0, 29, 27,
		1, 0, 0, 0, 30, 31, 5, 125, 0, 0, 31, 32, 5, 125, 0, 0, 32, 6, 1, 0, 0,
		0, 33, 34, 5, 123, 0, 0, 34, 35, 5, 123, 0, 0, 35, 36, 5, 108, 0, 0, 36,
		37, 5, 111, 0, 0, 37, 38, 5, 111, 0, 0, 38, 39, 5, 112, 0, 0, 39, 43, 1,
		0, 0, 0, 40, 42, 9, 0, 0, 0, 41, 40, 1, 0, 0, 0, 42, 45, 1, 0, 0, 0, 43,
		44, 1, 0, 0, 0, 43, 41, 1, 0, 0, 0, 44, 46, 1, 0, 0, 0, 45, 43, 1, 0, 0,
		0, 46, 47, 5, 125, 0, 0, 47, 48, 5, 125, 0, 0, 48, 8, 1, 0, 0, 0, 49, 50,
		5, 123, 0, 0, 50, 51, 5, 123, 0, 0, 51, 52, 5, 101, 0, 0, 52, 53, 5, 110,
		0, 0, 53, 54, 5, 100, 0, 0, 54, 55, 5, 125, 0, 0, 55, 56, 5, 125, 0, 0,
		56, 10, 1, 0, 0, 0, 57, 58, 5, 123, 0, 0, 58, 59, 5, 123, 0, 0, 59, 60,
		5, 103, 0, 0, 60, 61, 5, 106, 0, 0, 61, 62, 5, 115, 0, 0, 62, 63, 5, 111,
		0, 0, 63, 64, 5, 110, 0, 0, 64, 68, 1, 0, 0, 0, 65, 67, 9, 0, 0, 0, 66,
		65, 1, 0, 0, 0, 67, 70, 1, 0, 0, 0, 68, 69, 1, 0, 0, 0, 68, 66, 1, 0, 0,
		0, 69, 71, 1, 0, 0, 0, 70, 68, 1, 0, 0, 0, 71, 72, 5, 125, 0, 0, 72, 73,
		5, 125, 0, 0, 73, 12, 1, 0, 0, 0, 74, 76, 8, 1, 0, 0, 75, 74, 1, 0, 0,
		0, 76, 77, 1, 0, 0, 0, 77, 75, 1, 0, 0, 0, 77, 78, 1, 0, 0, 0, 78, 14,
		1, 0, 0, 0, 5, 0, 27, 43, 68, 77, 0,
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

// ReversetemplateLexerInit initializes any static state used to implement ReversetemplateLexer. By default the
// static state used to implement the lexer is lazily initialized during the first call to
// NewReversetemplateLexer(). You can call this function if you wish to initialize the static state ahead
// of time.
func ReversetemplateLexerInit() {
	staticData := &reversetemplatelexerLexerStaticData
	staticData.once.Do(reversetemplatelexerLexerInit)
}

// NewReversetemplateLexer produces a new lexer instance for the optional input antlr.CharStream.
func NewReversetemplateLexer(input antlr.CharStream) *ReversetemplateLexer {
	ReversetemplateLexerInit()
	l := new(ReversetemplateLexer)
	l.BaseLexer = antlr.NewBaseLexer(input)
	staticData := &reversetemplatelexerLexerStaticData
	l.Interpreter = antlr.NewLexerATNSimulator(l, staticData.atn, staticData.decisionToDFA, staticData.predictionContextCache)
	l.channelNames = staticData.channelNames
	l.modeNames = staticData.modeNames
	l.RuleNames = staticData.ruleNames
	l.LiteralNames = staticData.literalNames
	l.SymbolicNames = staticData.symbolicNames
	l.GrammarFileName = "Reversetemplate.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// ReversetemplateLexer tokens.
const (
	ReversetemplateLexerLeftDim  = 1
	ReversetemplateLexerRightDim = 2
	ReversetemplateLexerEmpty    = 3
	ReversetemplateLexerLoop     = 4
	ReversetemplateLexerEnd      = 5
	ReversetemplateLexerGjson    = 6
	ReversetemplateLexerSegment  = 7
)
