// Generated from Reversetemplate.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReversetemplateParser}.
 */
public interface ReversetemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReversetemplateParser#parseTpl}.
	 * @param ctx the parse tree
	 */
	void enterParseTpl(ReversetemplateParser.ParseTplContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversetemplateParser#parseTpl}.
	 * @param ctx the parse tree
	 */
	void exitParseTpl(ReversetemplateParser.ParseTplContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReversetemplateParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(ReversetemplateParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversetemplateParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(ReversetemplateParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReversetemplateParser#gjson}.
	 * @param ctx the parse tree
	 */
	void enterGjson(ReversetemplateParser.GjsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversetemplateParser#gjson}.
	 * @param ctx the parse tree
	 */
	void exitGjson(ReversetemplateParser.GjsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReversetemplateParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ReversetemplateParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversetemplateParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ReversetemplateParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReversetemplateParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(ReversetemplateParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversetemplateParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(ReversetemplateParser.StrContext ctx);
}