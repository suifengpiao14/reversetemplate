// Generated from Reversetemplate.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReversetemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LeftDim=1, RightDim=2, Empty=3, Loop=4, End=5, Gjson=6, Str=7, Path=8, 
		Space=9;
	public static final int
		RULE_parseTpl = 0, RULE_empty = 1, RULE_gjson = 2, RULE_loop = 3, RULE_str = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"parseTpl", "empty", "gjson", "loop", "str"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'}}'", null, null, "'{{end}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LeftDim", "RightDim", "Empty", "Loop", "End", "Gjson", "Str", 
			"Path", "Space"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Reversetemplate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReversetemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseTplContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public GjsonContext gjson() {
			return getRuleContext(GjsonContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public ParseTplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseTpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).enterParseTpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).exitParseTpl(this);
		}
	}

	public final ParseTplContext parseTpl() throws RecognitionException {
		ParseTplContext _localctx = new ParseTplContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseTpl);
		try {
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Empty:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				empty();
				}
				break;
			case Gjson:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				gjson();
				}
				break;
			case Loop:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				loop();
				}
				break;
			case Str:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				str();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyContext extends ParserRuleContext {
		public TerminalNode Empty() { return getToken(ReversetemplateParser.Empty, 0); }
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).exitEmpty(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(Empty);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GjsonContext extends ParserRuleContext {
		public TerminalNode Gjson() { return getToken(ReversetemplateParser.Gjson, 0); }
		public GjsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gjson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).enterGjson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).exitGjson(this);
		}
	}

	public final GjsonContext gjson() throws RecognitionException {
		GjsonContext _localctx = new GjsonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gjson);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(Gjson);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode Loop() { return getToken(ReversetemplateParser.Loop, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(Loop);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrContext extends ParserRuleContext {
		public TerminalNode Str() { return getToken(ReversetemplateParser.Str, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReversetemplateListener ) ((ReversetemplateListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(Str);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t\u0019\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000f\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0000\u0016\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0010\u0001"+
		"\u0000\u0000\u0000\u0004\u0012\u0001\u0000\u0000\u0000\u0006\u0014\u0001"+
		"\u0000\u0000\u0000\b\u0016\u0001\u0000\u0000\u0000\n\u000f\u0003\u0002"+
		"\u0001\u0000\u000b\u000f\u0003\u0004\u0002\u0000\f\u000f\u0003\u0006\u0003"+
		"\u0000\r\u000f\u0003\b\u0004\u0000\u000e\n\u0001\u0000\u0000\u0000\u000e"+
		"\u000b\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000e\r"+
		"\u0001\u0000\u0000\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0005\u0003\u0000\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0006\u0000\u0000\u0013\u0005\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0005\u0004\u0000\u0000\u0015\u0007\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0005\u0007\u0000\u0000\u0017\t\u0001\u0000\u0000\u0000\u0001\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}