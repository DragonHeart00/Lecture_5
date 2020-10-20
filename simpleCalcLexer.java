// Generated from simpleCalc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MULDEV=3, STRIG=4, IDENTIFIER=5, CONST=6, HVIDRUM=7, KOMMENTAR=8, 
		MULTILINECOMMENTS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "MULDEV", "STRIG", "IDENTIFIER", "CONST", "HVIDRUM", 
			"KOMMENTAR", "MULTILINECOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "MULDEV", "STRIG", "IDENTIFIER", "CONST", "HVIDRUM", 
			"KOMMENTAR", "MULTILINECOMMENTS"
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


	public simpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\6\6 \n\6\r\6\16\6!\3\7\6\7%\n\7\r\7\16"+
		"\7&\3\7\3\7\6\7+\n\7\r\7\16\7,\5\7/\n\7\3\b\6\b\62\n\b\r\b\16\b\63\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\7\t<\n\t\f\t\16\t?\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\nI\n\n\f\n\16\nL\13\n\3\n\3\n\3\n\3\n\3\n\2\2\13\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\3\2\13\4\2,,\61\61\4\2--//\5\2C\\aac|\6"+
		"\2\62;C\\aac|\3\2\62;\4\2\13\f\"\"\3\2\f\f\3\2\61\61\3\2,,\2Y\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\31\3\2"+
		"\2\2\t\33\3\2\2\2\13\35\3\2\2\2\r$\3\2\2\2\17\61\3\2\2\2\21\67\3\2\2\2"+
		"\23B\3\2\2\2\25\26\7*\2\2\26\4\3\2\2\2\27\30\7+\2\2\30\6\3\2\2\2\31\32"+
		"\t\2\2\2\32\b\3\2\2\2\33\34\t\3\2\2\34\n\3\2\2\2\35\37\t\4\2\2\36 \t\5"+
		"\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\f\3\2\2\2#%\t\6"+
		"\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'.\3\2\2\2(*\7\60\2\2)+"+
		"\t\6\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.(\3\2\2\2."+
		"/\3\2\2\2/\16\3\2\2\2\60\62\t\7\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\b\2\2\66\20\3\2\2\2\678\7"+
		"\61\2\289\7\61\2\29=\3\2\2\2:<\n\b\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2="+
		">\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\b\t\2\2A\22\3\2\2\2BC\7\61\2\2CD\7,\2"+
		"\2DJ\3\2\2\2EF\7,\2\2FI\n\t\2\2GI\n\n\2\2HE\3\2\2\2HG\3\2\2\2IL\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7,\2\2NO\7\61\2\2OP\3\2\2"+
		"\2PQ\b\n\2\2Q\24\3\2\2\2\13\2!&,.\63=HJ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}