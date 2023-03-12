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
		LPAREN=1, RPAREN=2, PLUS=3, MINUS=4, TIMES=5, ID=6, DIV=7, GT=8, LT=9, 
		EQ=10, POINT=11, POW=12, NEWLINE=13, INT=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VALID_ID_START", "VALID_ID_CHAR", "NUMBER", "UNSIGNED_INTEGER", "E", 
			"SIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "ID", "DIV", "GT", 
			"LT", "EQ", "POINT", "POW", "NEWLINE", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", null, "'/'", "'>'", "'<'", "'='", 
			"'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "ID", "DIV", "GT", 
			"LT", "EQ", "POINT", "POW", "NEWLINE", "INT", "WS"
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
		"\u0004\u0000\u000ft\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0003\u0000-\b\u0000\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001"+
		"\u0001\u0002\u0004\u00024\b\u0002\u000b\u0002\f\u00025\u0001\u0002\u0001"+
		"\u0002\u0004\u0002:\b\u0002\u000b\u0002\f\u0002;\u0003\u0002>\b\u0002"+
		"\u0001\u0003\u0004\u0003A\b\u0003\u000b\u0003\f\u0003B\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004"+
		"\u000bT\b\u000b\u000b\u000b\f\u000bU\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0003\u0012e\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0004\u0013j\b\u0013\u000b\u0013\f\u0013k\u0001\u0014"+
		"\u0004\u0014o\b\u0014\u000b\u0014\f\u0014p\u0001\u0014\u0001\u0014\u0000"+
		"\u0000\u0015\u0001\u0000\u0003\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b"+
		"\u0000\r\u0001\u000f\u0002\u0011\u0003\u0013\u0004\u0015\u0005\u0017\u0006"+
		"\u0019\u0007\u001b\b\u001d\t\u001f\n!\u000b#\f%\r\'\u000e)\u000f\u0001"+
		"\u0000\u0006\u0003\u0000AZ__az\u0002\u0000EEee\u0002\u0000++--\u0002\u0000"+
		"AZaz\u0001\u000009\u0002\u0000\t\t  v\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001,\u0001\u0000\u0000"+
		"\u0000\u00030\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u0007"+
		"@\u0001\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000\u000bF\u0001\u0000"+
		"\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000"+
		"\u0011L\u0001\u0000\u0000\u0000\u0013N\u0001\u0000\u0000\u0000\u0015P"+
		"\u0001\u0000\u0000\u0000\u0017S\u0001\u0000\u0000\u0000\u0019W\u0001\u0000"+
		"\u0000\u0000\u001bY\u0001\u0000\u0000\u0000\u001d[\u0001\u0000\u0000\u0000"+
		"\u001f]\u0001\u0000\u0000\u0000!_\u0001\u0000\u0000\u0000#a\u0001\u0000"+
		"\u0000\u0000%d\u0001\u0000\u0000\u0000\'i\u0001\u0000\u0000\u0000)n\u0001"+
		"\u0000\u0000\u0000+-\u0007\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000"+
		"-\u0002\u0001\u0000\u0000\u0000.1\u0003\u0001\u0000\u0000/1\u000209\u0000"+
		"0.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0004\u0001\u0000"+
		"\u0000\u000024\u000209\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006=\u0001\u0000"+
		"\u0000\u000079\u0005.\u0000\u00008:\u000209\u000098\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<>\u0001\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>\u0006\u0001\u0000\u0000\u0000?A\u000209\u0000@?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000C\b\u0001\u0000\u0000\u0000DE\u0007\u0001\u0000"+
		"\u0000E\n\u0001\u0000\u0000\u0000FG\u0007\u0002\u0000\u0000G\f\u0001\u0000"+
		"\u0000\u0000HI\u0005(\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005"+
		")\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005+\u0000\u0000M\u0012"+
		"\u0001\u0000\u0000\u0000NO\u0005-\u0000\u0000O\u0014\u0001\u0000\u0000"+
		"\u0000PQ\u0005*\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RT\u0007\u0003"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0018\u0001\u0000\u0000"+
		"\u0000WX\u0005/\u0000\u0000X\u001a\u0001\u0000\u0000\u0000YZ\u0005>\u0000"+
		"\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0005<\u0000\u0000\\\u001e\u0001"+
		"\u0000\u0000\u0000]^\u0005=\u0000\u0000^ \u0001\u0000\u0000\u0000_`\u0005"+
		".\u0000\u0000`\"\u0001\u0000\u0000\u0000ab\u0005^\u0000\u0000b$\u0001"+
		"\u0000\u0000\u0000ce\u0005\r\u0000\u0000dc\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\n\u0000\u0000g&\u0001"+
		"\u0000\u0000\u0000hj\u0007\u0004\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000l(\u0001\u0000\u0000\u0000mo\u0007\u0005\u0000\u0000nm\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u0014\u0000\u0000"+
		"s*\u0001\u0000\u0000\u0000\u000b\u0000,05;=BUdkp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}