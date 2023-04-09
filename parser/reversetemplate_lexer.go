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
		"", "LeftDim", "RightDim", "Empty", "Loop", "End", "Gjson", "Str", "Path",
		"Space",
	}
	staticData.ruleNames = []string{
		"LeftDim", "RightDim", "Empty", "Loop", "End", "Gjson", "Str", "Path",
		"Space",
	}
	staticData.predictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 0, 9, 92, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2,
		4, 7, 4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 1, 0, 1, 0, 1,
		0, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 27, 8, 2, 1, 2, 5, 2, 30, 8, 2, 10, 2,
		12, 2, 33, 9, 2, 1, 2, 1, 2, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3,
		1, 3, 5, 3, 45, 8, 3, 10, 3, 12, 3, 48, 9, 3, 1, 3, 1, 3, 1, 3, 1, 4, 1,
		4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1,
		5, 1, 5, 1, 5, 1, 5, 5, 5, 70, 8, 5, 10, 5, 12, 5, 73, 9, 5, 1, 5, 1, 5,
		1, 5, 1, 6, 4, 6, 79, 8, 6, 11, 6, 12, 6, 80, 1, 7, 4, 7, 84, 8, 7, 11,
		7, 12, 7, 85, 1, 8, 4, 8, 89, 8, 8, 11, 8, 12, 8, 90, 3, 31, 46, 71, 0,
		9, 1, 1, 3, 2, 5, 3, 7, 4, 9, 5, 11, 6, 13, 7, 15, 8, 17, 9, 1, 0, 3, 2,
		0, 123, 123, 125, 125, 5, 0, 46, 46, 48, 57, 65, 90, 95, 95, 97, 122, 2,
		0, 9, 10, 12, 13, 98, 0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 5, 1, 0, 0,
		0, 0, 7, 1, 0, 0, 0, 0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0, 13, 1, 0,
		0, 0, 0, 15, 1, 0, 0, 0, 0, 17, 1, 0, 0, 0, 1, 19, 1, 0, 0, 0, 3, 22, 1,
		0, 0, 0, 5, 26, 1, 0, 0, 0, 7, 36, 1, 0, 0, 0, 9, 52, 1, 0, 0, 0, 11, 60,
		1, 0, 0, 0, 13, 78, 1, 0, 0, 0, 15, 83, 1, 0, 0, 0, 17, 88, 1, 0, 0, 0,
		19, 20, 5, 123, 0, 0, 20, 21, 5, 123, 0, 0, 21, 2, 1, 0, 0, 0, 22, 23,
		5, 125, 0, 0, 23, 24, 5, 125, 0, 0, 24, 4, 1, 0, 0, 0, 25, 27, 3, 1, 0,
		0, 26, 25, 1, 0, 0, 0, 26, 27, 1, 0, 0, 0, 27, 31, 1, 0, 0, 0, 28, 30,
		3, 17, 8, 0, 29, 28, 1, 0, 0, 0, 30, 33, 1, 0, 0, 0, 31, 32, 1, 0, 0, 0,
		31, 29, 1, 0, 0, 0, 32, 34, 1, 0, 0, 0, 33, 31, 1, 0, 0, 0, 34, 35, 3,
		3, 1, 0, 35, 6, 1, 0, 0, 0, 36, 37, 5, 123, 0, 0, 37, 38, 5, 123, 0, 0,
		38, 39, 5, 108, 0, 0, 39, 40, 5, 111, 0, 0, 40, 41, 5, 111, 0, 0, 41, 42,
		5, 112, 0, 0, 42, 46, 1, 0, 0, 0, 43, 45, 9, 0, 0, 0, 44, 43, 1, 0, 0,
		0, 45, 48, 1, 0, 0, 0, 46, 47, 1, 0, 0, 0, 46, 44, 1, 0, 0, 0, 47, 49,
		1, 0, 0, 0, 48, 46, 1, 0, 0, 0, 49, 50, 5, 125, 0, 0, 50, 51, 5, 125, 0,
		0, 51, 8, 1, 0, 0, 0, 52, 53, 5, 123, 0, 0, 53, 54, 5, 123, 0, 0, 54, 55,
		5, 101, 0, 0, 55, 56, 5, 110, 0, 0, 56, 57, 5, 100, 0, 0, 57, 58, 5, 125,
		0, 0, 58, 59, 5, 125, 0, 0, 59, 10, 1, 0, 0, 0, 60, 61, 5, 123, 0, 0, 61,
		62, 5, 123, 0, 0, 62, 63, 5, 103, 0, 0, 63, 64, 5, 106, 0, 0, 64, 65, 5,
		115, 0, 0, 65, 66, 5, 111, 0, 0, 66, 67, 5, 110, 0, 0, 67, 71, 1, 0, 0,
		0, 68, 70, 9, 0, 0, 0, 69, 68, 1, 0, 0, 0, 70, 73, 1, 0, 0, 0, 71, 72,
		1, 0, 0, 0, 71, 69, 1, 0, 0, 0, 72, 74, 1, 0, 0, 0, 73, 71, 1, 0, 0, 0,
		74, 75, 5, 125, 0, 0, 75, 76, 5, 125, 0, 0, 76, 12, 1, 0, 0, 0, 77, 79,
		8, 0, 0, 0, 78, 77, 1, 0, 0, 0, 79, 80, 1, 0, 0, 0, 80, 78, 1, 0, 0, 0,
		80, 81, 1, 0, 0, 0, 81, 14, 1, 0, 0, 0, 82, 84, 7, 1, 0, 0, 83, 82, 1,
		0, 0, 0, 84, 85, 1, 0, 0, 0, 85, 83, 1, 0, 0, 0, 85, 86, 1, 0, 0, 0, 86,
		16, 1, 0, 0, 0, 87, 89, 7, 2, 0, 0, 88, 87, 1, 0, 0, 0, 89, 90, 1, 0, 0,
		0, 90, 88, 1, 0, 0, 0, 90, 91, 1, 0, 0, 0, 91, 18, 1, 0, 0, 0, 8, 0, 26,
		31, 46, 71, 80, 85, 90, 0,
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
	ReversetemplateLexerStr      = 7
	ReversetemplateLexerPath     = 8
	ReversetemplateLexerSpace    = 9
)
