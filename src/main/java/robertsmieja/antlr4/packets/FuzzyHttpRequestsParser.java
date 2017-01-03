// Generated from robertsmieja\antlr4\packets\FuzzyHttpRequests.g4 by ANTLR 4.6
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
		BYTE=1, DOT=2, FORWARD_SLASH=3, HTTP_GET=4, HTTP_DELETE=5, HTTP_POST=6, 
		HTTP_PUT=7, WORD=8;
	public static final int
		RULE_httpRequest = 0, RULE_binaryJunk = 1, RULE_fileExtension = 2, RULE_httpUrl = 3, 
		RULE_httpMethod = 4;
	public static final String[] ruleNames = {
		"httpRequest", "binaryJunk", "fileExtension", "httpUrl", "httpMethod"
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
	public static class HttpRequestContext extends ParserRuleContext {
		public List<BinaryJunkContext> binaryJunk() {
			return getRuleContexts(BinaryJunkContext.class);
		}
		public BinaryJunkContext binaryJunk(int i) {
			return getRuleContext(BinaryJunkContext.class,i);
		}
		public List<HttpMethodContext> httpMethod() {
			return getRuleContexts(HttpMethodContext.class);
		}
		public HttpMethodContext httpMethod(int i) {
			return getRuleContext(HttpMethodContext.class,i);
		}
		public List<HttpUrlContext> httpUrl() {
			return getRuleContexts(HttpUrlContext.class);
		}
		public HttpUrlContext httpUrl(int i) {
			return getRuleContext(HttpUrlContext.class,i);
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
		enterRule(_localctx, 0, RULE_httpRequest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			binaryJunk();
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11);
				httpMethod();
				setState(12);
				httpUrl();
				setState(13);
				binaryJunk();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTTP_GET) | (1L << HTTP_DELETE) | (1L << HTTP_POST) | (1L << HTTP_PUT))) != 0) );
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
		public List<TerminalNode> BYTE() { return getTokens(FuzzyHttpRequestsParser.BYTE); }
		public TerminalNode BYTE(int i) {
			return getToken(FuzzyHttpRequestsParser.BYTE, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(19);
					match(BYTE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(22); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(24);
			match(DOT);
			setState(25);
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

	public static class HttpUrlContext extends ParserRuleContext {
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
		enterRule(_localctx, 6, RULE_httpUrl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(FORWARD_SLASH);
			setState(28);
			match(WORD);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(29);
					match(FORWARD_SLASH);
					setState(30);
					match(WORD);
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(36);
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
		enterRule(_localctx, 8, RULE_httpMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\6\3\27\n\3\r\3\16\3\30\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\"\n\5\f\5"+
		"\16\5%\13\5\3\5\5\5(\n\5\3\6\3\6\3\6\4\30#\2\7\2\4\6\b\n\2\3\3\2\6\t*"+
		"\2\f\3\2\2\2\4\26\3\2\2\2\6\32\3\2\2\2\b\35\3\2\2\2\n)\3\2\2\2\f\21\5"+
		"\4\3\2\r\16\5\n\6\2\16\17\5\b\5\2\17\20\5\4\3\2\20\22\3\2\2\2\21\r\3\2"+
		"\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\27\7\3"+
		"\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\30\26\3\2\2\2\31\5\3\2"+
		"\2\2\32\33\7\4\2\2\33\34\7\n\2\2\34\7\3\2\2\2\35\36\7\5\2\2\36#\7\n\2"+
		"\2\37 \7\5\2\2 \"\7\n\2\2!\37\3\2\2\2\"%\3\2\2\2#$\3\2\2\2#!\3\2\2\2$"+
		"\'\3\2\2\2%#\3\2\2\2&(\5\6\4\2\'&\3\2\2\2\'(\3\2\2\2(\t\3\2\2\2)*\t\2"+
		"\2\2*\13\3\2\2\2\6\23\30#\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}