// Code generated from Reversetemplate.g4 by ANTLR 4.12.0. DO NOT EDIT.

package parser // Reversetemplate

import "github.com/antlr/antlr4/runtime/Go/antlr/v4"

// ReversetemplateListener is a complete listener for a parse tree produced by ReversetemplateParser.
type ReversetemplateListener interface {
	antlr.ParseTreeListener

	// EnterParseTpl is called when entering the parseTpl production.
	EnterParseTpl(c *ParseTplContext)

	// EnterEvery is called when entering the every production.
	EnterEvery(c *EveryContext)

	// ExitParseTpl is called when exiting the parseTpl production.
	ExitParseTpl(c *ParseTplContext)

	// ExitEvery is called when exiting the every production.
	ExitEvery(c *EveryContext)
}
