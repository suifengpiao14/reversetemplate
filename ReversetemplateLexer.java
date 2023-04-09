// Generated from Reversetemplate.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReversetemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\t\\\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002\u001b\b\u0002\u0001"+
		"\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003-\b\u0003\n\u0003\f\u0003"+
		"0\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005F\b\u0005\n\u0005\f\u0005"+
		"I\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006"+
		"O\b\u0006\u000b\u0006\f\u0006P\u0001\u0007\u0004\u0007T\b\u0007\u000b"+
		"\u0007\f\u0007U\u0001\b\u0004\bY\b\b\u000b\b\f\bZ\u0003\u001f.G\u0000"+
		"\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0001\u0000\u0003\u0002\u0000{{}}\u0005\u0000"+
		"..09AZ__az\u0002\u0000\t\n\f\rb\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001"+
		"\u0000\u0000\u0000\u0003\u0016\u0001\u0000\u0000\u0000\u0005\u001a\u0001"+
		"\u0000\u0000\u0000\u0007$\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000"+
		"\u0000\u000b<\u0001\u0000\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000f"+
		"S\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000\u0013\u0014\u0005"+
		"{\u0000\u0000\u0014\u0015\u0005{\u0000\u0000\u0015\u0002\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0005}\u0000\u0000\u0017\u0018\u0005}\u0000\u0000\u0018"+
		"\u0004\u0001\u0000\u0000\u0000\u0019\u001b\u0003\u0001\u0000\u0000\u001a"+
		"\u0019\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u001f\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0011\b\u0000\u001d\u001c"+
		"\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0003\u0003\u0001\u0000#\u0006"+
		"\u0001\u0000\u0000\u0000$%\u0005{\u0000\u0000%&\u0005{\u0000\u0000&\'"+
		"\u0005l\u0000\u0000\'(\u0005o\u0000\u0000()\u0005o\u0000\u0000)*\u0005"+
		"p\u0000\u0000*.\u0001\u0000\u0000\u0000+-\t\u0000\u0000\u0000,+\u0001"+
		"\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000012\u0005}\u0000\u000023\u0005}\u0000\u00003\b\u0001\u0000\u0000"+
		"\u000045\u0005{\u0000\u000056\u0005{\u0000\u000067\u0005e\u0000\u0000"+
		"78\u0005n\u0000\u000089\u0005d\u0000\u00009:\u0005}\u0000\u0000:;\u0005"+
		"}\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005{\u0000\u0000=>\u0005"+
		"{\u0000\u0000>?\u0005g\u0000\u0000?@\u0005j\u0000\u0000@A\u0005s\u0000"+
		"\u0000AB\u0005o\u0000\u0000BC\u0005n\u0000\u0000CG\u0001\u0000\u0000\u0000"+
		"DF\t\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JK\u0005}\u0000\u0000KL\u0005}\u0000\u0000"+
		"L\f\u0001\u0000\u0000\u0000MO\b\u0000\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000Q\u000e\u0001\u0000\u0000\u0000RT\u0007\u0001\u0000\u0000"+
		"SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000V\u0010\u0001\u0000\u0000\u0000WY\u0007"+
		"\u0002\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0012\u0001\u0000"+
		"\u0000\u0000\b\u0000\u001a\u001f.GPUZ\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}