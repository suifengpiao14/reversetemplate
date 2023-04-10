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
	 * Enter a parse tree produced by {@link ReversetemplateParser#every}.
	 * @param ctx the parse tree
	 */
	void enterEvery(ReversetemplateParser.EveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversetemplateParser#every}.
	 * @param ctx the parse tree
	 */
	void exitEvery(ReversetemplateParser.EveryContext ctx);
}