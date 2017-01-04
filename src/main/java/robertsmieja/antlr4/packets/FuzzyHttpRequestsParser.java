// Generated from robertsmieja\antlr4\packets\FuzzyHttpRequests.g4 by ANTLR 4.6

package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FuzzyHttpRequestsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, DIGIT=2, FORWARD_SLASH=3, LETTER=4, HTTP=5, HTTP_GET=6, HTTP_DELETE=7, 
		HTTP_POST=8, HTTP_PUT=9, SPACE=10, VERSION_NUMBER=11, WORD=12, WS=13, 
		BYTE=14;
	public static final int
		RULE_binaryFile = 0, RULE_binaryJunk = 1, RULE_fileExtension = 2, RULE_httpRequest = 3, 
		RULE_httpUrl = 4, RULE_httpMethod = 5, RULE_httpVersion = 6;
	public static final String[] ruleNames = {
		"binaryFile", "binaryJunk", "fileExtension", "httpRequest", "httpUrl", 
		"httpMethod", "httpVersion"
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

	@Override
	public String getGrammarFileName() { return "FuzzyHttpRequests.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FuzzyHttpRequestsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BinaryFileContext extends ParserRuleContext {
		public List<BinaryJunkContext> binaryJunk() {
			return getRuleContexts(BinaryJunkContext.class);
		}
		public BinaryJunkContext binaryJunk(int i) {
			return getRuleContext(BinaryJunkContext.class,i);
		}
		public TerminalNode EOF() { return getToken(FuzzyHttpRequestsParser.EOF, 0); }
		public List<HttpRequestContext> httpRequest() {
			return getRuleContexts(HttpRequestContext.class);
		}
		public HttpRequestContext httpRequest(int i) {
			return getRuleContext(HttpRequestContext.class,i);
		}
		public BinaryFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).enterBinaryFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).exitBinaryFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuzzyHttpRequestsVisitor ) return ((FuzzyHttpRequestsVisitor<? extends T>)visitor).visitBinaryFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryFileContext binaryFile() throws RecognitionException {
		BinaryFileContext _localctx = new BinaryFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_binaryFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			binaryJunk();
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				httpRequest();
				setState(16);
				binaryJunk();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTTP_GET) | (1L << HTTP_DELETE) | (1L << HTTP_POST) | (1L << HTTP_PUT))) != 0) );
			setState(22);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryJunkContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(FuzzyHttpRequestsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(FuzzyHttpRequestsParser.WORD, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(FuzzyHttpRequestsParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(FuzzyHttpRequestsParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(FuzzyHttpRequestsParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(FuzzyHttpRequestsParser.DIGIT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(FuzzyHttpRequestsParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(FuzzyHttpRequestsParser.SPACE, i);
		}
		public List<TerminalNode> DOT() { return getTokens(FuzzyHttpRequestsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FuzzyHttpRequestsParser.DOT, i);
		}
		public List<TerminalNode> FORWARD_SLASH() { return getTokens(FuzzyHttpRequestsParser.FORWARD_SLASH); }
		public TerminalNode FORWARD_SLASH(int i) {
			return getToken(FuzzyHttpRequestsParser.FORWARD_SLASH, i);
		}
		public List<TerminalNode> WS() { return getTokens(FuzzyHttpRequestsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FuzzyHttpRequestsParser.WS, i);
		}
		public List<TerminalNode> BYTE() { return getTokens(FuzzyHttpRequestsParser.BYTE); }
		public TerminalNode BYTE(int i) {
			return getToken(FuzzyHttpRequestsParser.BYTE, i);
		}
		public List<TerminalNode> VERSION_NUMBER() { return getTokens(FuzzyHttpRequestsParser.VERSION_NUMBER); }
		public TerminalNode VERSION_NUMBER(int i) {
			return getToken(FuzzyHttpRequestsParser.VERSION_NUMBER, i);
		}
		public BinaryJunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryJunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).enterBinaryJunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).exitBinaryJunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuzzyHttpRequestsVisitor ) return ((FuzzyHttpRequestsVisitor<? extends T>)visitor).visitBinaryJunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryJunkContext binaryJunk() throws RecognitionException {
		BinaryJunkContext _localctx = new BinaryJunkContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_binaryJunk);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(24);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << DIGIT) | (1L << FORWARD_SLASH) | (1L << LETTER) | (1L << SPACE) | (1L << VERSION_NUMBER) | (1L << WORD) | (1L << WS) | (1L << BYTE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileExtensionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(FuzzyHttpRequestsParser.DOT, 0); }
		public TerminalNode WORD() { return getToken(FuzzyHttpRequestsParser.WORD, 0); }
		public FileExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).enterFileExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).exitFileExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuzzyHttpRequestsVisitor ) return ((FuzzyHttpRequestsVisitor<? extends T>)visitor).visitFileExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileExtensionContext fileExtension() throws RecognitionException {
		FileExtensionContext _localctx = new FileExtensionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fileExtension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(DOT);
			setState(31);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpRequestContext extends ParserRuleContext {
		public HttpMethodContext httpMethod() {
			return getRuleContext(HttpMethodContext.class,0);
		}
		public HttpUrlContext httpUrl() {
			return getRuleContext(HttpUrlContext.class,0);
		}
		public HttpVersionContext httpVersion() {
			return getRuleContext(HttpVersionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(FuzzyHttpRequestsParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(FuzzyHttpRequestsParser.SPACE, i);
		}
		public HttpRequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpRequest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).enterHttpRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).exitHttpRequest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuzzyHttpRequestsVisitor ) return ((FuzzyHttpRequestsVisitor<? extends T>)visitor).visitHttpRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpRequestContext httpRequest() throws RecognitionException {
		HttpRequestContext _localctx = new HttpRequestContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_httpRequest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			httpMethod();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(34);
				match(SPACE);
				}
			}

			setState(37);
			httpUrl();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(38);
				match(SPACE);
				}
			}

			setState(41);
			httpVersion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpUrlContext extends ParserRuleContext {
		public List<TerminalNode> FORWARD_SLASH() { return getTokens(FuzzyHttpRequestsParser.FORWARD_SLASH); }
		public TerminalNode FORWARD_SLASH(int i) {
			return getToken(FuzzyHttpRequestsParser.FORWARD_SLASH, i);
		}
		public List<TerminalNode> WORD() { return getTokens(FuzzyHttpRequestsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(FuzzyHttpRequestsParser.WORD, i);
		}
		public FileExtensionContext fileExtension() {
			return getRuleContext(FileExtensionContext.class,0);
		}
		public HttpUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).enterHttpUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).exitHttpUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuzzyHttpRequestsVisitor ) return ((FuzzyHttpRequestsVisitor<? extends T>)visitor).visitHttpUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpUrlContext httpUrl() throws RecognitionException {
		HttpUrlContext _localctx = new HttpUrlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_httpUrl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(FORWARD_SLASH);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(44);
				match(WORD);
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FORWARD_SLASH) {
				{
				{
				setState(47);
				match(FORWARD_SLASH);
				setState(48);
				match(WORD);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(54);
				fileExtension();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpMethodContext extends ParserRuleContext {
		public TerminalNode HTTP_DELETE() { return getToken(FuzzyHttpRequestsParser.HTTP_DELETE, 0); }
		public TerminalNode HTTP_GET() { return getToken(FuzzyHttpRequestsParser.HTTP_GET, 0); }
		public TerminalNode HTTP_POST() { return getToken(FuzzyHttpRequestsParser.HTTP_POST, 0); }
		public TerminalNode HTTP_PUT() { return getToken(FuzzyHttpRequestsParser.HTTP_PUT, 0); }
		public HttpMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).enterHttpMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).exitHttpMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuzzyHttpRequestsVisitor ) return ((FuzzyHttpRequestsVisitor<? extends T>)visitor).visitHttpMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpMethodContext httpMethod() throws RecognitionException {
		HttpMethodContext _localctx = new HttpMethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_httpMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTTP_GET) | (1L << HTTP_DELETE) | (1L << HTTP_POST) | (1L << HTTP_PUT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpVersionContext extends ParserRuleContext {
		public TerminalNode HTTP() { return getToken(FuzzyHttpRequestsParser.HTTP, 0); }
		public TerminalNode FORWARD_SLASH() { return getToken(FuzzyHttpRequestsParser.FORWARD_SLASH, 0); }
		public TerminalNode VERSION_NUMBER() { return getToken(FuzzyHttpRequestsParser.VERSION_NUMBER, 0); }
		public HttpVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).enterHttpVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyHttpRequestsListener ) ((FuzzyHttpRequestsListener)listener).exitHttpVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuzzyHttpRequestsVisitor ) return ((FuzzyHttpRequestsVisitor<? extends T>)visitor).visitHttpVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpVersionContext httpVersion() throws RecognitionException {
		HttpVersionContext _localctx = new HttpVersionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_httpVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(HTTP);
			setState(60);
			match(FORWARD_SLASH);
			setState(61);
			match(VERSION_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\6\2\25\n\2"+
		"\r\2\16\2\26\3\2\3\2\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\3\5\3"+
		"\5\5\5&\n\5\3\5\3\5\5\5*\n\5\3\5\3\5\3\6\3\6\5\6\60\n\6\3\6\3\6\7\6\64"+
		"\n\6\f\6\16\6\67\13\6\3\6\5\6:\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\35\2"+
		"\t\2\4\6\b\n\f\16\2\4\4\2\3\6\f\20\3\2\b\13A\2\20\3\2\2\2\4\35\3\2\2\2"+
		"\6 \3\2\2\2\b#\3\2\2\2\n-\3\2\2\2\f;\3\2\2\2\16=\3\2\2\2\20\24\5\4\3\2"+
		"\21\22\5\b\5\2\22\23\5\4\3\2\23\25\3\2\2\2\24\21\3\2\2\2\25\26\3\2\2\2"+
		"\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2"+
		"\32\34\t\2\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\36\3\2\2\2\35\33\3\2\2\2"+
		"\36\5\3\2\2\2\37\35\3\2\2\2 !\7\3\2\2!\"\7\16\2\2\"\7\3\2\2\2#%\5\f\7"+
		"\2$&\7\f\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\')\5\n\6\2(*\7\f\2\2)(\3\2"+
		"\2\2)*\3\2\2\2*+\3\2\2\2+,\5\16\b\2,\t\3\2\2\2-/\7\5\2\2.\60\7\16\2\2"+
		"/.\3\2\2\2/\60\3\2\2\2\60\65\3\2\2\2\61\62\7\5\2\2\62\64\7\16\2\2\63\61"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67\65\3"+
		"\2\2\28:\5\6\4\298\3\2\2\29:\3\2\2\2:\13\3\2\2\2;<\t\3\2\2<\r\3\2\2\2"+
		"=>\7\7\2\2>?\7\5\2\2?@\7\r\2\2@\17\3\2\2\2\t\26\35%)/\659";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}