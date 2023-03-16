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
public class arithmeticLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PI=2, IF=3, WHILE=4, LPAREN=5, RPAREN=6, PLUS=7, MINUS=8, TIMES=9, 
		ID=10, DIV=11, GT=12, LT=13, EQ=14, POINT=15, POW=16, NEWLINE=17, INT=18, 
		WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PI", "VALID_ID_START", "VALID_ID_CHAR", "NUMBER", "UNSIGNED_INTEGER", 
			"E", "SIGN", "IF", "WHILE", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
			"ID", "DIV", "GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'pi'", "'if'", "'while'", "'('", "')'", "'+'", "'-'", 
			"'*'", null, "'/'", "'>'", "'<'", "'='", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PI", "IF", "WHILE", "LPAREN", "RPAREN", "PLUS", "MINUS", 
			"TIMES", "ID", "DIV", "GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "INT", 
			"WS"
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


	public arithmeticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "arithmetic.g4"; }

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
		"\u0004\u0000\u0013\u008d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002"+
		"=\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0004"+
		"\u0004D\b\u0004\u000b\u0004\f\u0004E\u0001\u0004\u0001\u0004\u0004\u0004"+
		"J\b\u0004\u000b\u0004\f\u0004K\u0003\u0004N\b\u0004\u0001\u0005\u0004"+
		"\u0005Q\b\u0005\u000b\u0005\f\u0005R\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000fm\b\u000f\u000b"+
		"\u000f\f\u000fn\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0003\u0016~\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0004\u0017\u0083\b\u0017\u000b\u0017\f\u0017\u0084"+
		"\u0001\u0018\u0004\u0018\u0088\b\u0018\u000b\u0018\f\u0018\u0089\u0001"+
		"\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0000"+
		"\u0007\u0000\t\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0003\u0013"+
		"\u0004\u0015\u0005\u0017\u0006\u0019\u0007\u001b\b\u001d\t\u001f\n!\u000b"+
		"#\f%\r\'\u000e)\u000f+\u0010-\u0011/\u00121\u0013\u0001\u0000\u0006\u0003"+
		"\u0000AZ__az\u0002\u0000EEee\u0002\u0000++--\u0002\u0000AZaz\u0001\u0000"+
		"09\u0002\u0000\t\t  \u008f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00038\u0001\u0000\u0000"+
		"\u0000\u0005<\u0001\u0000\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\t"+
		"C\u0001\u0000\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rT\u0001\u0000"+
		"\u0000\u0000\u000fV\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000"+
		"\u0013[\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017c"+
		"\u0001\u0000\u0000\u0000\u0019e\u0001\u0000\u0000\u0000\u001bg\u0001\u0000"+
		"\u0000\u0000\u001di\u0001\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000"+
		"!p\u0001\u0000\u0000\u0000#r\u0001\u0000\u0000\u0000%t\u0001\u0000\u0000"+
		"\u0000\'v\u0001\u0000\u0000\u0000)x\u0001\u0000\u0000\u0000+z\u0001\u0000"+
		"\u0000\u0000-}\u0001\u0000\u0000\u0000/\u0082\u0001\u0000\u0000\u0000"+
		"1\u0087\u0001\u0000\u0000\u000034\u0005e\u0000\u000045\u0005l\u0000\u0000"+
		"56\u0005s\u0000\u000067\u0005e\u0000\u00007\u0002\u0001\u0000\u0000\u0000"+
		"89\u0005p\u0000\u00009:\u0005i\u0000\u0000:\u0004\u0001\u0000\u0000\u0000"+
		";=\u0007\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0006\u0001\u0000"+
		"\u0000\u0000>A\u0003\u0005\u0002\u0000?A\u000209\u0000@>\u0001\u0000\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000A\b\u0001\u0000\u0000\u0000BD\u000209"+
		"\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FM\u0001\u0000\u0000\u0000GI\u0005"+
		".\u0000\u0000HJ\u000209\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\n\u0001\u0000\u0000\u0000OQ\u000209\u0000PO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000S\f\u0001\u0000\u0000\u0000TU\u0007\u0001\u0000\u0000U\u000e\u0001"+
		"\u0000\u0000\u0000VW\u0007\u0002\u0000\u0000W\u0010\u0001\u0000\u0000"+
		"\u0000XY\u0005i\u0000\u0000YZ\u0005f\u0000\u0000Z\u0012\u0001\u0000\u0000"+
		"\u0000[\\\u0005w\u0000\u0000\\]\u0005h\u0000\u0000]^\u0005i\u0000\u0000"+
		"^_\u0005l\u0000\u0000_`\u0005e\u0000\u0000`\u0014\u0001\u0000\u0000\u0000"+
		"ab\u0005(\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005)\u0000\u0000"+
		"d\u0018\u0001\u0000\u0000\u0000ef\u0005+\u0000\u0000f\u001a\u0001\u0000"+
		"\u0000\u0000gh\u0005-\u0000\u0000h\u001c\u0001\u0000\u0000\u0000ij\u0005"+
		"*\u0000\u0000j\u001e\u0001\u0000\u0000\u0000km\u0007\u0003\u0000\u0000"+
		"lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000o \u0001\u0000\u0000\u0000pq\u0005/\u0000"+
		"\u0000q\"\u0001\u0000\u0000\u0000rs\u0005>\u0000\u0000s$\u0001\u0000\u0000"+
		"\u0000tu\u0005<\u0000\u0000u&\u0001\u0000\u0000\u0000vw\u0005=\u0000\u0000"+
		"w(\u0001\u0000\u0000\u0000xy\u0005.\u0000\u0000y*\u0001\u0000\u0000\u0000"+
		"z{\u0005^\u0000\u0000{,\u0001\u0000\u0000\u0000|~\u0005\r\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080.\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0007\u0004\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u00850\u0001\u0000\u0000\u0000"+
		"\u0086\u0088\u0007\u0005\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0006\u0018\u0000\u0000\u008c2\u0001\u0000\u0000\u0000\u000b"+
		"\u0000<@EKMRn}\u0084\u0089\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}