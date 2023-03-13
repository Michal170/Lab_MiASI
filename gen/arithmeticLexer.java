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
		PI=1, LPAREN=2, RPAREN=3, PLUS=4, MINUS=5, TIMES=6, ID=7, DIV=8, GT=9, 
		LT=10, EQ=11, POINT=12, POW=13, NEWLINE=14, INT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PI", "VALID_ID_START", "VALID_ID_CHAR", "NUMBER", "UNSIGNED_INTEGER", 
			"E", "SIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "ID", "DIV", 
			"GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pi'", "'('", "')'", "'+'", "'-'", "'*'", null, "'/'", "'>'", 
			"'<'", "'='", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PI", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "ID", "DIV", 
			"GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "INT", "WS"
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
		"\u0004\u0000\u0010y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003"+
		"\u00012\b\u0001\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003"+
		"\u0004\u00039\b\u0003\u000b\u0003\f\u0003:\u0001\u0003\u0001\u0003\u0004"+
		"\u0003?\b\u0003\u000b\u0003\f\u0003@\u0003\u0003C\b\u0003\u0001\u0004"+
		"\u0004\u0004F\b\u0004\u000b\u0004\f\u0004G\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0004\fY\b\f\u000b"+
		"\f\f\fZ\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0003\u0013j\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0004\u0014o\b\u0014\u000b\u0014\f\u0014p\u0001\u0015\u0004\u0015t\b"+
		"\u0015\u000b\u0015\f\u0015u\u0001\u0015\u0001\u0015\u0000\u0000\u0016"+
		"\u0001\u0001\u0003\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r"+
		"\u0000\u000f\u0002\u0011\u0003\u0013\u0004\u0015\u0005\u0017\u0006\u0019"+
		"\u0007\u001b\b\u001d\t\u001f\n!\u000b#\f%\r\'\u000e)\u000f+\u0010\u0001"+
		"\u0000\u0006\u0003\u0000AZ__az\u0002\u0000EEee\u0002\u0000++--\u0002\u0000"+
		"AZaz\u0001\u000009\u0002\u0000\t\t  {\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0001-\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u0005"+
		"5\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\tE\u0001\u0000"+
		"\u0000\u0000\u000bI\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000"+
		"\u000fM\u0001\u0000\u0000\u0000\u0011O\u0001\u0000\u0000\u0000\u0013Q"+
		"\u0001\u0000\u0000\u0000\u0015S\u0001\u0000\u0000\u0000\u0017U\u0001\u0000"+
		"\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001b\\\u0001\u0000\u0000"+
		"\u0000\u001d^\u0001\u0000\u0000\u0000\u001f`\u0001\u0000\u0000\u0000!"+
		"b\u0001\u0000\u0000\u0000#d\u0001\u0000\u0000\u0000%f\u0001\u0000\u0000"+
		"\u0000\'i\u0001\u0000\u0000\u0000)n\u0001\u0000\u0000\u0000+s\u0001\u0000"+
		"\u0000\u0000-.\u0005p\u0000\u0000./\u0005i\u0000\u0000/\u0002\u0001\u0000"+
		"\u0000\u000002\u0007\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0004"+
		"\u0001\u0000\u0000\u000036\u0003\u0003\u0001\u000046\u000209\u000053\u0001"+
		"\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0006\u0001\u0000\u0000"+
		"\u000079\u000209\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;B\u0001\u0000\u0000"+
		"\u0000<>\u0005.\u0000\u0000=?\u000209\u0000>=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AC\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000C\b\u0001\u0000\u0000\u0000DF\u000209\u0000ED\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000H\n\u0001\u0000\u0000\u0000IJ\u0007\u0001\u0000\u0000"+
		"J\f\u0001\u0000\u0000\u0000KL\u0007\u0002\u0000\u0000L\u000e\u0001\u0000"+
		"\u0000\u0000MN\u0005(\u0000\u0000N\u0010\u0001\u0000\u0000\u0000OP\u0005"+
		")\u0000\u0000P\u0012\u0001\u0000\u0000\u0000QR\u0005+\u0000\u0000R\u0014"+
		"\u0001\u0000\u0000\u0000ST\u0005-\u0000\u0000T\u0016\u0001\u0000\u0000"+
		"\u0000UV\u0005*\u0000\u0000V\u0018\u0001\u0000\u0000\u0000WY\u0007\u0003"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u001a\u0001\u0000\u0000"+
		"\u0000\\]\u0005/\u0000\u0000]\u001c\u0001\u0000\u0000\u0000^_\u0005>\u0000"+
		"\u0000_\u001e\u0001\u0000\u0000\u0000`a\u0005<\u0000\u0000a \u0001\u0000"+
		"\u0000\u0000bc\u0005=\u0000\u0000c\"\u0001\u0000\u0000\u0000de\u0005."+
		"\u0000\u0000e$\u0001\u0000\u0000\u0000fg\u0005^\u0000\u0000g&\u0001\u0000"+
		"\u0000\u0000hj\u0005\r\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005\n\u0000\u0000l(\u0001\u0000"+
		"\u0000\u0000mo\u0007\u0004\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"q*\u0001\u0000\u0000\u0000rt\u0007\u0005\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0006\u0015\u0000\u0000x,\u0001"+
		"\u0000\u0000\u0000\u000b\u000015:@BGZipu\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}