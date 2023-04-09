// Code generated from Reversetemplate.g4 by ANTLR 4.12.0. DO NOT EDIT.

package parser // Reversetemplate

import "github.com/antlr/antlr4/runtime/Go/antlr/v4"

// BaseReversetemplateListener is a complete listener for a parse tree produced by ReversetemplateParser.
type BaseReversetemplateListener struct{}

var _ ReversetemplateListener = &BaseReversetemplateListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseReversetemplateListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseReversetemplateListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseReversetemplateListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseReversetemplateListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterParseTpl is called when production parseTpl is entered.
func (s *BaseReversetemplateListener) EnterParseTpl(ctx *ParseTplContext) {}

// ExitParseTpl is called when production parseTpl is exited.
func (s *BaseReversetemplateListener) ExitParseTpl(ctx *ParseTplContext) {}

// EnterEvery is called when production every is entered.
func (s *BaseReversetemplateListener) EnterEvery(ctx *EveryContext) {}

// ExitEvery is called when production every is exited.
func (s *BaseReversetemplateListener) ExitEvery(ctx *EveryContext) {}
