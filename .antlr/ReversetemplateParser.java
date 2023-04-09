// Generated from /Users/admin/Documents/go/reversetemplate/Reversetemplate.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReversetemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LeftDim=1, RightDim=2, Empty=3, Loop=4, End=5, Gjson=6, Str=7, Path=8, 
		Space=9;
	public static final int
		RULE_parseTpl = 0, RULE_every = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"parseTpl", "every"
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

	public static class ParseTplContext extends ParserRuleContext {
		public EveryContext every() {
			return getRuleContext(EveryContext.class,0);
		}
		public ParseTplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseTpl; }
	}

	public final ParseTplContext parseTpl() throws RecognitionException {
		ParseTplContext _localctx = new ParseTplContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseTpl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			every();
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

	public static class EveryContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReversetemplateParser.EOF, 0); }
		public EveryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every; }
	}

	public final EveryContext every() throws RecognitionException {
		EveryContext _localctx = new EveryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_every);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(6);
					matchWildcard();
					}
					} 
				}
				setState(11);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(12);
			match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\21\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\7\3\n\n\3\f\3\16\3\r\13\3\3\3\3\3\3\3\3\13\2\4\2\4\2"+
		"\2\2\17\2\6\3\2\2\2\4\13\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\n\13\2\2\2"+
		"\t\b\3\2\2\2\n\r\3\2\2\2\13\f\3\2\2\2\13\t\3\2\2\2\f\16\3\2\2\2\r\13\3"+
		"\2\2\2\16\17\7\2\2\3\17\5\3\2\2\2\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}