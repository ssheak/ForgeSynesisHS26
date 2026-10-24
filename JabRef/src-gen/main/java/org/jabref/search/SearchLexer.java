// Generated from /home/shahriar/Schreibtisch/SoftwareEngineering/Project/ForgeSynesisHS26/JabRef/src/main/antlr4/org/jabref/search/Search.g4 by ANTLR 4.13.1
package org.jabref.search;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SearchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LPAREN=2, RPAREN=3, EQUAL=4, EEQUAL=5, NEQUAL=6, AND=7, OR=8, CONTAINS=9, 
		MATCHES=10, NOT=11, STRING=12, QUOTE=13, FIELDTYPE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LPAREN", "RPAREN", "EQUAL", "EEQUAL", "NEQUAL", "AND", "OR", "CONTAINS", 
			"MATCHES", "NOT", "STRING", "QUOTE", "FIELDTYPE", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'='", "'=='", "'!='", null, null, null, null, 
			null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LPAREN", "RPAREN", "EQUAL", "EEQUAL", "NEQUAL", "AND", "OR", 
			"CONTAINS", "MATCHES", "NOT", "STRING", "QUOTE", "FIELDTYPE"
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


	public SearchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Search.g4"; }

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
		"\u0004\u0000\u000e]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bN\b\u000b\n\u000b\f\u000b"+
		"Q\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\rX\b\r"+
		"\u000b\r\f\rY\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u0000\u0001\u0000"+
		"\u000f\u0002\u0000\t\t  \u0002\u0000AAaa\u0002\u0000NNnn\u0002\u0000D"+
		"Ddd\u0002\u0000OOoo\u0002\u0000RRrr\u0002\u0000CCcc\u0002\u0000TTtt\u0002"+
		"\u0000IIii\u0002\u0000SSss\u0002\u0000MMmm\u0002\u0000HHhh\u0002\u0000"+
		"EEee\u0001\u0000\"\"\u0004\u0000\t\t \"()==]\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003"+
		"#\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001"+
		"\u0000\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b,\u0001\u0000\u0000"+
		"\u0000\r/\u0001\u0000\u0000\u0000\u000f3\u0001\u0000\u0000\u0000\u0011"+
		"6\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015G\u0001"+
		"\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019T\u0001\u0000\u0000"+
		"\u0000\u001bW\u0001\u0000\u0000\u0000\u001d[\u0001\u0000\u0000\u0000\u001f"+
		" \u0007\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0006\u0000\u0000"+
		"\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005(\u0000\u0000$\u0004\u0001"+
		"\u0000\u0000\u0000%&\u0005)\u0000\u0000&\u0006\u0001\u0000\u0000\u0000"+
		"\'(\u0005=\u0000\u0000(\b\u0001\u0000\u0000\u0000)*\u0005=\u0000\u0000"+
		"*+\u0005=\u0000\u0000+\n\u0001\u0000\u0000\u0000,-\u0005!\u0000\u0000"+
		"-.\u0005=\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0007\u0001\u0000\u0000"+
		"01\u0007\u0002\u0000\u000012\u0007\u0003\u0000\u00002\u000e\u0001\u0000"+
		"\u0000\u000034\u0007\u0004\u0000\u000045\u0007\u0005\u0000\u00005\u0010"+
		"\u0001\u0000\u0000\u000067\u0007\u0006\u0000\u000078\u0007\u0004\u0000"+
		"\u000089\u0007\u0002\u0000\u00009:\u0007\u0007\u0000\u0000:;\u0007\u0001"+
		"\u0000\u0000;<\u0007\b\u0000\u0000<=\u0007\u0002\u0000\u0000=>\u0007\t"+
		"\u0000\u0000>\u0012\u0001\u0000\u0000\u0000?@\u0007\n\u0000\u0000@A\u0007"+
		"\u0001\u0000\u0000AB\u0007\u0007\u0000\u0000BC\u0007\u0006\u0000\u0000"+
		"CD\u0007\u000b\u0000\u0000DE\u0007\f\u0000\u0000EF\u0007\t\u0000\u0000"+
		"F\u0014\u0001\u0000\u0000\u0000GH\u0007\u0002\u0000\u0000HI\u0007\u0004"+
		"\u0000\u0000IJ\u0007\u0007\u0000\u0000J\u0016\u0001\u0000\u0000\u0000"+
		"KO\u0003\u0019\f\u0000LN\b\r\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0003\u0019\f\u0000"+
		"S\u0018\u0001\u0000\u0000\u0000TU\u0005\"\u0000\u0000U\u001a\u0001\u0000"+
		"\u0000\u0000VX\u0003\u001d\u000e\u0000WV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u001c\u0001\u0000\u0000\u0000[\\\b\u000e\u0000\u0000\\\u001e\u0001\u0000"+
		"\u0000\u0000\u0003\u0000OY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}