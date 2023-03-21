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
		T__0=1, PRZ=2, IF=3, WHILE=4, VARIABLE=5, SCIENTIFIC_NUMBER=6, LPAREN=7, 
		RPAREN=8, PLUS=9, MINUS=10, TIMES=11, ID=12, DIV=13, GT=14, LT=15, EQ=16, 
		POINT=17, POW=18, NEWLINE=19, INT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PRZ", "IF", "WHILE", "VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", 
			"SCIENTIFIC_NUMBER", "NUMBER", "UNSIGNED_INTEGER", "E", "SIGN", "LPAREN", 
			"RPAREN", "PLUS", "MINUS", "TIMES", "ID", "DIV", "GT", "LT", "EQ", "POINT", 
			"POW", "NEWLINE", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "':='", "'if'", "'while'", null, null, "'('", "')'", 
			"'+'", "'-'", "'*'", null, "'/'", "'>'", "'<'", "'='", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PRZ", "IF", "WHILE", "VARIABLE", "SCIENTIFIC_NUMBER", "LPAREN", 
			"RPAREN", "PLUS", "MINUS", "TIMES", "ID", "DIV", "GT", "LT", "EQ", "POINT", 
			"POW", "NEWLINE", "INT", "WS"
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
		"\u0004\u0000\u0015\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0005\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001\u0005"+
		"\u0003\u0005Q\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006U\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007Z\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007^\b\u0007\u0001\b\u0004\ba\b\b\u000b\b\f\bb\u0001\b"+
		"\u0001\b\u0004\bg\b\b\u000b\b\f\bh\u0003\bk\b\b\u0001\t\u0004\tn\b\t\u000b"+
		"\t\f\to\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011\u0081\b\u0011\u000b\u0011\f\u0011"+
		"\u0082\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0003\u0018\u0092\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0004\u0019\u0097\b\u0019\u000b\u0019\f\u0019\u0098\u0001\u001a"+
		"\u0004\u001a\u009c\b\u001a\u000b\u001a\f\u001a\u009d\u0001\u001a\u0001"+
		"\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0000\r\u0000\u000f\u0006\u0011\u0000\u0013\u0000\u0015"+
		"\u0000\u0017\u0000\u0019\u0007\u001b\b\u001d\t\u001f\n!\u000b#\f%\r\'"+
		"\u000e)\u000f+\u0010-\u0011/\u00121\u00133\u00145\u0015\u0001\u0000\u0006"+
		"\u0003\u0000AZ__az\u0002\u0000EEee\u0002\u0000++--\u0002\u0000AZaz\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u00a6\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u0003<\u0001\u0000\u0000\u0000"+
		"\u0005?\u0001\u0000\u0000\u0000\u0007B\u0001\u0000\u0000\u0000\tH\u0001"+
		"\u0000\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rT\u0001\u0000\u0000"+
		"\u0000\u000fV\u0001\u0000\u0000\u0000\u0011`\u0001\u0000\u0000\u0000\u0013"+
		"m\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017s\u0001"+
		"\u0000\u0000\u0000\u0019u\u0001\u0000\u0000\u0000\u001bw\u0001\u0000\u0000"+
		"\u0000\u001dy\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000!"+
		"}\u0001\u0000\u0000\u0000#\u0080\u0001\u0000\u0000\u0000%\u0084\u0001"+
		"\u0000\u0000\u0000\'\u0086\u0001\u0000\u0000\u0000)\u0088\u0001\u0000"+
		"\u0000\u0000+\u008a\u0001\u0000\u0000\u0000-\u008c\u0001\u0000\u0000\u0000"+
		"/\u008e\u0001\u0000\u0000\u00001\u0091\u0001\u0000\u0000\u00003\u0096"+
		"\u0001\u0000\u0000\u00005\u009b\u0001\u0000\u0000\u000078\u0005e\u0000"+
		"\u000089\u0005l\u0000\u00009:\u0005s\u0000\u0000:;\u0005e\u0000\u0000"+
		";\u0002\u0001\u0000\u0000\u0000<=\u0005:\u0000\u0000=>\u0005=\u0000\u0000"+
		">\u0004\u0001\u0000\u0000\u0000?@\u0005i\u0000\u0000@A\u0005f\u0000\u0000"+
		"A\u0006\u0001\u0000\u0000\u0000BC\u0005w\u0000\u0000CD\u0005h\u0000\u0000"+
		"DE\u0005i\u0000\u0000EF\u0005l\u0000\u0000FG\u0005e\u0000\u0000G\b\u0001"+
		"\u0000\u0000\u0000HL\u0003\u000b\u0005\u0000IK\u0003\r\u0006\u0000JI\u0001"+
		"\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\n\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000OQ\u0007\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\f\u0001\u0000"+
		"\u0000\u0000RU\u0003\u000b\u0005\u0000SU\u000209\u0000TR\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000U\u000e\u0001\u0000\u0000\u0000V]\u0003"+
		"\u0011\b\u0000WY\u0003\u0015\n\u0000XZ\u0003\u0017\u000b\u0000YX\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0003\u0013\t\u0000\\^\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\u0010\u0001\u0000\u0000\u0000_a\u0002"+
		"09\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cj\u0001\u0000\u0000\u0000df\u0005"+
		".\u0000\u0000eg\u000209\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001"+
		"\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"k\u0012\u0001\u0000\u0000\u0000ln\u000209\u0000ml\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p\u0014\u0001\u0000\u0000\u0000qr\u0007\u0001\u0000\u0000r\u0016"+
		"\u0001\u0000\u0000\u0000st\u0007\u0002\u0000\u0000t\u0018\u0001\u0000"+
		"\u0000\u0000uv\u0005(\u0000\u0000v\u001a\u0001\u0000\u0000\u0000wx\u0005"+
		")\u0000\u0000x\u001c\u0001\u0000\u0000\u0000yz\u0005+\u0000\u0000z\u001e"+
		"\u0001\u0000\u0000\u0000{|\u0005-\u0000\u0000| \u0001\u0000\u0000\u0000"+
		"}~\u0005*\u0000\u0000~\"\u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0003"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083$\u0001\u0000\u0000\u0000\u0084\u0085\u0005/\u0000\u0000"+
		"\u0085&\u0001\u0000\u0000\u0000\u0086\u0087\u0005>\u0000\u0000\u0087("+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005<\u0000\u0000\u0089*\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005=\u0000\u0000\u008b,\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005.\u0000\u0000\u008d.\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005^\u0000\u0000\u008f0\u0001\u0000\u0000\u0000\u0090\u0092\u0005\r"+
		"\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005\n\u0000"+
		"\u0000\u00942\u0001\u0000\u0000\u0000\u0095\u0097\u0007\u0004\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u00994\u0001\u0000\u0000\u0000\u009a\u009c\u0007\u0005\u0000\u0000\u009b"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0006\u001a\u0000\u0000\u00a0"+
		"6\u0001\u0000\u0000\u0000\u000e\u0000LPTY]bhjo\u0082\u0091\u0098\u009d"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}