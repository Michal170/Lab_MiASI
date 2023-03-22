// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class calcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PRZ=2, IF=3, WHILE=4, FOR=5, VARIABLE=6, SCIENTIFIC_NUMBER=7, 
		LPAREN=8, RPAREN=9, PLUS=10, ŚREDNIK=11, MINUS=12, TIMES=13, ID=14, DIV=15, 
		GT=16, LT=17, EQ=18, POINT=19, POW=20, NEWLINE=21, INT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PRZ", "IF", "WHILE", "FOR", "VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", 
			"SCIENTIFIC_NUMBER", "NUMBER", "UNSIGNED_INTEGER", "E", "SIGN", "LPAREN", 
			"RPAREN", "PLUS", "ŚREDNIK", "MINUS", "TIMES", "ID", "DIV", "GT", "LT", 
			"EQ", "POINT", "POW", "NEWLINE", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "':='", "'if'", "'while'", "'for'", null, null, "'('", 
			"')'", "'+'", "';'", "'-'", "'*'", null, "'/'", "'>'", "'<'", "'='", 
			"'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PRZ", "IF", "WHILE", "FOR", "VARIABLE", "SCIENTIFIC_NUMBER", 
			"LPAREN", "RPAREN", "PLUS", "\u0000\u0001REDNIK", "MINUS", "TIMES", "ID", 
			"DIV", "GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "INT", "WS"
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


	public calcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calc.g4"; }

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
		"\u0004\u0000\u0017\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005S\b\u0005\n\u0005\f\u0005"+
		"V\t\u0005\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007]\b\u0007\u0001\b\u0001\b\u0001\b\u0003\bb\b\b\u0001\b\u0001\b\u0003"+
		"\bf\b\b\u0001\t\u0004\ti\b\t\u000b\t\f\tj\u0001\t\u0001\t\u0004\to\b\t"+
		"\u000b\t\f\tp\u0003\ts\b\t\u0001\n\u0004\nv\b\n\u000b\n\f\nw\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u008b\b\u0013\u000b\u0013\f"+
		"\u0013\u008c\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0003\u001a\u009c\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0004\u001b\u00a1\b\u001b\u000b\u001b\f\u001b\u00a2\u0001"+
		"\u001c\u0004\u001c\u00a6\b\u001c\u000b\u001c\f\u001c\u00a7\u0001\u001c"+
		"\u0001\u001c\u0000\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0000\u000f\u0000\u0011\u0007\u0013\u0000"+
		"\u0015\u0000\u0017\u0000\u0019\u0000\u001b\b\u001d\t\u001f\n!\u000b#\f"+
		"%\r\'\u000e)\u000f+\u0010-\u0011/\u00121\u00133\u00145\u00157\u00169\u0017"+
		"\u0001\u0000\u0006\u0003\u0000AZ__az\u0002\u0000EEee\u0002\u0000++--\u0002"+
		"\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00b0\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003@\u0001\u0000\u0000"+
		"\u0000\u0005C\u0001\u0000\u0000\u0000\u0007F\u0001\u0000\u0000\u0000\t"+
		"L\u0001\u0000\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rX\u0001\u0000"+
		"\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011^\u0001\u0000\u0000"+
		"\u0000\u0013h\u0001\u0000\u0000\u0000\u0015u\u0001\u0000\u0000\u0000\u0017"+
		"y\u0001\u0000\u0000\u0000\u0019{\u0001\u0000\u0000\u0000\u001b}\u0001"+
		"\u0000\u0000\u0000\u001d\u007f\u0001\u0000\u0000\u0000\u001f\u0081\u0001"+
		"\u0000\u0000\u0000!\u0083\u0001\u0000\u0000\u0000#\u0085\u0001\u0000\u0000"+
		"\u0000%\u0087\u0001\u0000\u0000\u0000\'\u008a\u0001\u0000\u0000\u0000"+
		")\u008e\u0001\u0000\u0000\u0000+\u0090\u0001\u0000\u0000\u0000-\u0092"+
		"\u0001\u0000\u0000\u0000/\u0094\u0001\u0000\u0000\u00001\u0096\u0001\u0000"+
		"\u0000\u00003\u0098\u0001\u0000\u0000\u00005\u009b\u0001\u0000\u0000\u0000"+
		"7\u00a0\u0001\u0000\u0000\u00009\u00a5\u0001\u0000\u0000\u0000;<\u0005"+
		"e\u0000\u0000<=\u0005l\u0000\u0000=>\u0005s\u0000\u0000>?\u0005e\u0000"+
		"\u0000?\u0002\u0001\u0000\u0000\u0000@A\u0005:\u0000\u0000AB\u0005=\u0000"+
		"\u0000B\u0004\u0001\u0000\u0000\u0000CD\u0005i\u0000\u0000DE\u0005f\u0000"+
		"\u0000E\u0006\u0001\u0000\u0000\u0000FG\u0005w\u0000\u0000GH\u0005h\u0000"+
		"\u0000HI\u0005i\u0000\u0000IJ\u0005l\u0000\u0000JK\u0005e\u0000\u0000"+
		"K\b\u0001\u0000\u0000\u0000LM\u0005f\u0000\u0000MN\u0005o\u0000\u0000"+
		"NO\u0005r\u0000\u0000O\n\u0001\u0000\u0000\u0000PT\u0003\r\u0006\u0000"+
		"QS\u0003\u000f\u0007\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\f\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0007\u0000\u0000\u0000XW\u0001"+
		"\u0000\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z]\u0003\r\u0006\u0000"+
		"[]\u000209\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"]\u0010\u0001\u0000\u0000\u0000^e\u0003\u0013\t\u0000_a\u0003\u0017\u000b"+
		"\u0000`b\u0003\u0019\f\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0003\u0015\n\u0000df\u0001\u0000\u0000"+
		"\u0000e_\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0012\u0001"+
		"\u0000\u0000\u0000gi\u000209\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kr\u0001"+
		"\u0000\u0000\u0000ln\u0005.\u0000\u0000mo\u000209\u0000nm\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000s\u0014\u0001\u0000\u0000\u0000tv\u000209\u0000"+
		"ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u0016\u0001\u0000\u0000\u0000yz\u0007"+
		"\u0001\u0000\u0000z\u0018\u0001\u0000\u0000\u0000{|\u0007\u0002\u0000"+
		"\u0000|\u001a\u0001\u0000\u0000\u0000}~\u0005(\u0000\u0000~\u001c\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005)\u0000\u0000\u0080\u001e\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005+\u0000\u0000\u0082 \u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005;\u0000\u0000\u0084\"\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005-\u0000\u0000\u0086$\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"*\u0000\u0000\u0088&\u0001\u0000\u0000\u0000\u0089\u008b\u0007\u0003\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d(\u0001\u0000\u0000\u0000\u008e\u008f\u0005/\u0000\u0000\u008f"+
		"*\u0001\u0000\u0000\u0000\u0090\u0091\u0005>\u0000\u0000\u0091,\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005<\u0000\u0000\u0093.\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005=\u0000\u0000\u00950\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005.\u0000\u0000\u00972\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"^\u0000\u0000\u00994\u0001\u0000\u0000\u0000\u009a\u009c\u0005\r\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\n\u0000\u0000"+
		"\u009e6\u0001\u0000\u0000\u0000\u009f\u00a1\u0007\u0004\u0000\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"8\u0001\u0000\u0000\u0000\u00a4\u00a6\u0007\u0005\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0006\u001c\u0000\u0000\u00aa:\u0001"+
		"\u0000\u0000\u0000\u000e\u0000TX\\aejprw\u008c\u009b\u00a2\u00a7\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}