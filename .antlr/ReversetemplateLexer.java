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
		LeftDim=1, RightDim=2, Empty=3, Loop=4, End=5, Gjson=6, Str=7, Path=8, 
		Space=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LeftDim", "RightDim", "Empty", "Loop", "End", "Gjson", "Str", "Path", 
			"Space"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\5\4\35\n\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"H\n\7\f\7\16\7K\13\7\3\7\3\7\3\7\3\b\6\bQ\n\b\r\b\16\bR\3\t\6\tV\n\t\r"+
		"\t\16\tW\3\n\6\n[\n\n\r\n\16\n\\\5!\60I\2\13\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\3\2\5\4\2}}\177\177\7\2\60\60\62;C\\aac|\4\2\13\f\16"+
		"\17\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\30\3"+
		"\2\2\2\7\34\3\2\2\2\t&\3\2\2\2\13\66\3\2\2\2\r>\3\2\2\2\17P\3\2\2\2\21"+
		"U\3\2\2\2\23Z\3\2\2\2\25\26\7}\2\2\26\27\7}\2\2\27\4\3\2\2\2\30\31\7\177"+
		"\2\2\31\32\7\177\2\2\32\6\3\2\2\2\33\35\5\3\2\2\34\33\3\2\2\2\34\35\3"+
		"\2\2\2\35!\3\2\2\2\36 \5\23\n\2\37\36\3\2\2\2 #\3\2\2\2!\"\3\2\2\2!\37"+
		"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\5\5\3\2%\b\3\2\2\2&\'\7}\2\2\'(\7}\2\2"+
		"()\7n\2\2)*\7q\2\2*+\7q\2\2+,\7r\2\2,\60\3\2\2\2-/\13\2\2\2.-\3\2\2\2"+
		"/\62\3\2\2\2\60\61\3\2\2\2\60.\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63"+
		"\64\7\177\2\2\64\65\7\177\2\2\65\n\3\2\2\2\66\67\7}\2\2\678\7}\2\289\7"+
		"g\2\29:\7p\2\2:;\7f\2\2;<\7\177\2\2<=\7\177\2\2=\f\3\2\2\2>?\7}\2\2?@"+
		"\7}\2\2@A\7i\2\2AB\7l\2\2BC\7u\2\2CD\7q\2\2DE\7p\2\2EI\3\2\2\2FH\13\2"+
		"\2\2GF\3\2\2\2HK\3\2\2\2IJ\3\2\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\177"+
		"\2\2MN\7\177\2\2N\16\3\2\2\2OQ\n\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2R"+
		"S\3\2\2\2S\20\3\2\2\2TV\t\3\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2X\22\3\2\2\2Y[\t\4\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\24"+
		"\3\2\2\2\n\2\34!\60IRW\\\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}