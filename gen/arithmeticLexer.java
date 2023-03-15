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
		T__0=1, PI=2, IF=3, LPAREN=4, RPAREN=5, PLUS=6, MINUS=7, TIMES=8, ID=9, 
		DIV=10, GT=11, LT=12, EQ=13, POINT=14, POW=15, NEWLINE=16, INT=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PI", "VALID_ID_START", "VALID_ID_CHAR", "NUMBER", "UNSIGNED_INTEGER", 
			"E", "SIGN", "IF", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "ID", 
			"DIV", "GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'pi'", "'if'", "'('", "')'", "'+'", "'-'", "'*'", null, 
			"'/'", "'>'", "'<'", "'='", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PI", "IF", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
			"ID", "DIV", "GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "INT", "WS"
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
		"\u0004\u0000\u0012\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003?\b\u0003\u0001\u0004\u0004\u0004B\b\u0004\u000b"+
		"\u0004\f\u0004C\u0001\u0004\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004"+
		"\f\u0004I\u0003\u0004L\b\u0004\u0001\u0005\u0004\u0005O\b\u0005\u000b"+
		"\u0005\f\u0005P\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0004\u000ee\b\u000e\u000b"+
		"\u000e\f\u000ef\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0003\u0015v\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0004\u0016{\b\u0016\u000b\u0016\f\u0016|\u0001\u0017"+
		"\u0004\u0017\u0080\b\u0017\u000b\u0017\f\u0017\u0081\u0001\u0017\u0001"+
		"\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0000\u0007\u0000"+
		"\t\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0003\u0013\u0004\u0015"+
		"\u0005\u0017\u0006\u0019\u0007\u001b\b\u001d\t\u001f\n!\u000b#\f%\r\'"+
		"\u000e)\u000f+\u0010-\u0011/\u0012\u0001\u0000\u0006\u0003\u0000AZ__a"+
		"z\u0002\u0000EEee\u0002\u0000++--\u0002\u0000AZaz\u0001\u000009\u0002"+
		"\u0000\t\t  \u0087\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000"+
		"\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u0005:\u0001\u0000\u0000\u0000"+
		"\u0007>\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bN\u0001"+
		"\u0000\u0000\u0000\rR\u0001\u0000\u0000\u0000\u000fT\u0001\u0000\u0000"+
		"\u0000\u0011V\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015"+
		"[\u0001\u0000\u0000\u0000\u0017]\u0001\u0000\u0000\u0000\u0019_\u0001"+
		"\u0000\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001dd\u0001\u0000\u0000"+
		"\u0000\u001fh\u0001\u0000\u0000\u0000!j\u0001\u0000\u0000\u0000#l\u0001"+
		"\u0000\u0000\u0000%n\u0001\u0000\u0000\u0000\'p\u0001\u0000\u0000\u0000"+
		")r\u0001\u0000\u0000\u0000+u\u0001\u0000\u0000\u0000-z\u0001\u0000\u0000"+
		"\u0000/\u007f\u0001\u0000\u0000\u000012\u0005e\u0000\u000023\u0005l\u0000"+
		"\u000034\u0005s\u0000\u000045\u0005e\u0000\u00005\u0002\u0001\u0000\u0000"+
		"\u000067\u0005p\u0000\u000078\u0005i\u0000\u00008\u0004\u0001\u0000\u0000"+
		"\u00009;\u0007\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;\u0006\u0001"+
		"\u0000\u0000\u0000<?\u0003\u0005\u0002\u0000=?\u000209\u0000><\u0001\u0000"+
		"\u0000\u0000>=\u0001\u0000\u0000\u0000?\b\u0001\u0000\u0000\u0000@B\u0002"+
		"09\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DK\u0001\u0000\u0000\u0000EG\u0005"+
		".\u0000\u0000FH\u000209\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001"+
		"\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"L\n\u0001\u0000\u0000\u0000MO\u000209\u0000NM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\f\u0001\u0000\u0000\u0000RS\u0007\u0001\u0000\u0000S\u000e\u0001"+
		"\u0000\u0000\u0000TU\u0007\u0002\u0000\u0000U\u0010\u0001\u0000\u0000"+
		"\u0000VW\u0005i\u0000\u0000WX\u0005f\u0000\u0000X\u0012\u0001\u0000\u0000"+
		"\u0000YZ\u0005(\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[\\\u0005)\u0000"+
		"\u0000\\\u0016\u0001\u0000\u0000\u0000]^\u0005+\u0000\u0000^\u0018\u0001"+
		"\u0000\u0000\u0000_`\u0005-\u0000\u0000`\u001a\u0001\u0000\u0000\u0000"+
		"ab\u0005*\u0000\u0000b\u001c\u0001\u0000\u0000\u0000ce\u0007\u0003\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000g\u001e\u0001\u0000\u0000\u0000"+
		"hi\u0005/\u0000\u0000i \u0001\u0000\u0000\u0000jk\u0005>\u0000\u0000k"+
		"\"\u0001\u0000\u0000\u0000lm\u0005<\u0000\u0000m$\u0001\u0000\u0000\u0000"+
		"no\u0005=\u0000\u0000o&\u0001\u0000\u0000\u0000pq\u0005.\u0000\u0000q"+
		"(\u0001\u0000\u0000\u0000rs\u0005^\u0000\u0000s*\u0001\u0000\u0000\u0000"+
		"tv\u0005\r\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wx\u0005\n\u0000\u0000x,\u0001\u0000\u0000\u0000"+
		"y{\u0007\u0004\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}.\u0001\u0000"+
		"\u0000\u0000~\u0080\u0007\u0005\u0000\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0006\u0017\u0000\u0000\u00840\u0001\u0000\u0000\u0000\u000b"+
		"\u0000:>CIKPfu|\u0081\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}