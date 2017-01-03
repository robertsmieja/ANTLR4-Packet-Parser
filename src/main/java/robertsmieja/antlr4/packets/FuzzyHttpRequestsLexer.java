// Generated from robertsmieja\antlr4\packets\FuzzyHttpRequests.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FuzzyHttpRequestsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE=1, DOT=2, FORWARD_SLASH=3, HTTP_GET=4, HTTP_DELETE=5, HTTP_POST=6, 
		HTTP_PUT=7, WORD=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BYTE", "DOT", "FORWARD_SLASH", "HTTP_GET", "HTTP_DELETE", "HTTP_POST", 
		"HTTP_PUT", "WORD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'.'", "'/'", "'GET'", "'DELETE'", "'POST'", "'PUT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYTE", "DOT", "FORWARD_SLASH", "HTTP_GET", "HTTP_DELETE", "HTTP_POST", 
		"HTTP_PUT", "WORD"
	};
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


	public FuzzyHttpRequestsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FuzzyHttpRequests.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\63\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\6\t\60\n\t\r\t\16\t\61\2\2\n\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\3\2\3\5\2\62;C\\c|\64\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\27\3\2\2\2\t\31\3\2\2\2\13\35\3\2\2"+
		"\2\r$\3\2\2\2\17)\3\2\2\2\21/\3\2\2\2\23\24\4\2\u0101\2\24\4\3\2\2\2\25"+
		"\26\7\60\2\2\26\6\3\2\2\2\27\30\7\61\2\2\30\b\3\2\2\2\31\32\7I\2\2\32"+
		"\33\7G\2\2\33\34\7V\2\2\34\n\3\2\2\2\35\36\7F\2\2\36\37\7G\2\2\37 \7N"+
		"\2\2 !\7G\2\2!\"\7V\2\2\"#\7G\2\2#\f\3\2\2\2$%\7R\2\2%&\7Q\2\2&\'\7U\2"+
		"\2\'(\7V\2\2(\16\3\2\2\2)*\7R\2\2*+\7W\2\2+,\7V\2\2,\20\3\2\2\2-\60\5"+
		"\5\3\2.\60\t\2\2\2/-\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\22\3\2\2\2\5\2/\61\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}