// Generated from robertsmieja\antlr4\packets\FuzzyHttpRequests.g4 by ANTLR 4.6

package robertsmieja.antlr4.packets;

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
		DOT=1, DIGIT=2, FORWARD_SLASH=3, LETTER=4, HTTP=5, HTTP_GET=6, HTTP_DELETE=7, 
		HTTP_POST=8, HTTP_PUT=9, SPACE=10, VERSION_NUMBER=11, WORD=12, WS=13, 
		BYTE=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DOT", "DIGIT", "FORWARD_SLASH", "LETTER", "HTTP", "HTTP_GET", "HTTP_DELETE", 
		"HTTP_POST", "HTTP_PUT", "SPACE", "VERSION_NUMBER", "WORD", "WS", "BYTE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", null, "'/'", null, "'HTTP'", "'GET'", "'DELETE'", "'POST'", 
		"'PUT'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOT", "DIGIT", "FORWARD_SLASH", "LETTER", "HTTP", "HTTP_GET", "HTTP_DELETE", 
		"HTTP_POST", "HTTP_PUT", "SPACE", "VERSION_NUMBER", "WORD", "WS", "BYTE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\6\rJ\n\r\r\r\16\rK\3\16\6\16O\n\16\r\16\16\16P\3\16\3\16\3\17\3\17\2"+
		"\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\3\2\5\3\2\62;\4\2C\\c|\t\2\13\f\17\17CCEEGGRRUUY\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'"+
		"\3\2\2\2\r,\3\2\2\2\17\60\3\2\2\2\21\67\3\2\2\2\23<\3\2\2\2\25@\3\2\2"+
		"\2\27B\3\2\2\2\31I\3\2\2\2\33N\3\2\2\2\35T\3\2\2\2\37 \7\60\2\2 \4\3\2"+
		"\2\2!\"\t\2\2\2\"\6\3\2\2\2#$\7\61\2\2$\b\3\2\2\2%&\t\3\2\2&\n\3\2\2\2"+
		"\'(\7J\2\2()\7V\2\2)*\7V\2\2*+\7R\2\2+\f\3\2\2\2,-\7I\2\2-.\7G\2\2./\7"+
		"V\2\2/\16\3\2\2\2\60\61\7F\2\2\61\62\7G\2\2\62\63\7N\2\2\63\64\7G\2\2"+
		"\64\65\7V\2\2\65\66\7G\2\2\66\20\3\2\2\2\678\7R\2\289\7Q\2\29:\7U\2\2"+
		":;\7V\2\2;\22\3\2\2\2<=\7R\2\2=>\7W\2\2>?\7V\2\2?\24\3\2\2\2@A\7\"\2\2"+
		"A\26\3\2\2\2BC\5\5\3\2CD\5\3\2\2DE\5\5\3\2E\30\3\2\2\2FJ\5\3\2\2GJ\5\t"+
		"\5\2HJ\5\5\3\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2L\32\3\2\2\2MO\t\4\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3"+
		"\2\2\2RS\b\16\2\2S\34\3\2\2\2TU\4\2\1\2U\36\3\2\2\2\6\2IKP\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}