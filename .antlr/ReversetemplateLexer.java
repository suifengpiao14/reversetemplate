// Generated from /Users/admin/Documents/go/reversetemplate/Reversetemplate.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReversetemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LeftDim=1, RightDim=2, Empty=3, Loop=4, End=5, Gjson=6, Segment=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LeftDim", "RightDim", "Empty", "Loop", "End", "Gjson", "Segment"
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
			null, "LeftDim", "RightDim", "Empty", "Loop", "End", "Gjson", "Segment"
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


	public ReversetemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Reversetemplate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tQ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\7\4\34\n\4\f\4\16\4\37\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7E\n\7\f\7\16\7"+
		"H\13\7\3\7\3\7\3\7\3\b\6\bN\n\b\r\b\16\bO\4-F\2\t\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\3\2\4\4\2\13\f\16\17\4\2}}\177\177\2T\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21"+
		"\3\2\2\2\5\24\3\2\2\2\7\27\3\2\2\2\t#\3\2\2\2\13\63\3\2\2\2\r;\3\2\2\2"+
		"\17M\3\2\2\2\21\22\7}\2\2\22\23\7}\2\2\23\4\3\2\2\2\24\25\7\177\2\2\25"+
		"\26\7\177\2\2\26\6\3\2\2\2\27\30\7}\2\2\30\31\7}\2\2\31\35\3\2\2\2\32"+
		"\34\t\2\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		" \3\2\2\2\37\35\3\2\2\2 !\7\177\2\2!\"\7\177\2\2\"\b\3\2\2\2#$\7}\2\2"+
		"$%\7}\2\2%&\7n\2\2&\'\7q\2\2\'(\7q\2\2()\7r\2\2)-\3\2\2\2*,\13\2\2\2+"+
		"*\3\2\2\2,/\3\2\2\2-.\3\2\2\2-+\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7"+
		"\177\2\2\61\62\7\177\2\2\62\n\3\2\2\2\63\64\7}\2\2\64\65\7}\2\2\65\66"+
		"\7g\2\2\66\67\7p\2\2\678\7f\2\289\7\177\2\29:\7\177\2\2:\f\3\2\2\2;<\7"+
		"}\2\2<=\7}\2\2=>\7i\2\2>?\7l\2\2?@\7u\2\2@A\7q\2\2AB\7p\2\2BF\3\2\2\2"+
		"CE\13\2\2\2DC\3\2\2\2EH\3\2\2\2FG\3\2\2\2FD\3\2\2\2GI\3\2\2\2HF\3\2\2"+
		"\2IJ\7\177\2\2JK\7\177\2\2K\16\3\2\2\2LN\n\3\2\2ML\3\2\2\2NO\3\2\2\2O"+
		"M\3\2\2\2OP\3\2\2\2P\20\3\2\2\2\7\2\35-FO\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}