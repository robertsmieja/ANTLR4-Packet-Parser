// Generated from robertsmieja\antlr4\xml\Xml.g4 by ANTLR 4.6

package robertsmieja.antlr4.xml;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DASH=1, EQUALS=2, FORWARD_SLASH=3, LEFT_CARROT=4, QUESTION_MARK=5, QUOTES=6, 
		RIGHT_CARROT=7, XML_HEADER_START=8, XML_HEADER_END=9, LETTER=10, NUMBER=11, 
		WORD=12, WS=13, FOWARD_SLASH=14;
	public static final int
		RULE_xmlDocument = 0, RULE_xmlHeader = 1, RULE_xmlElement = 2, RULE_xmlElementStart = 3, 
		RULE_xmlElementEnd = 4, RULE_xmlAttribute = 5;
	public static final String[] ruleNames = {
		"xmlDocument", "xmlHeader", "xmlElement", "xmlElementStart", "xmlElementEnd", 
		"xmlAttribute"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'='", "'/'", "'<'", "'?'", "'\"'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DASH", "EQUALS", "FORWARD_SLASH", "LEFT_CARROT", "QUESTION_MARK", 
		"QUOTES", "RIGHT_CARROT", "XML_HEADER_START", "XML_HEADER_END", "LETTER", 
		"NUMBER", "WORD", "WS", "FOWARD_SLASH"
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
	public String getGrammarFileName() { return "Xml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XmlDocumentContext extends ParserRuleContext {
		public XmlHeaderContext xmlHeader() {
			return getRuleContext(XmlHeaderContext.class,0);
		}
		public List<XmlElementContext> xmlElement() {
			return getRuleContexts(XmlElementContext.class);
		}
		public XmlElementContext xmlElement(int i) {
			return getRuleContext(XmlElementContext.class,i);
		}
		public XmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).enterXmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).exitXmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlVisitor ) return ((XmlVisitor<? extends T>)visitor).visitXmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlDocumentContext xmlDocument() throws RecognitionException {
		XmlDocumentContext _localctx = new XmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			xmlHeader();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_CARROT) {
				{
				{
				setState(13);
				xmlElement();
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class XmlHeaderContext extends ParserRuleContext {
		public Token headerValue;
		public TerminalNode XML_HEADER_START() { return getToken(XmlParser.XML_HEADER_START, 0); }
		public TerminalNode XML_HEADER_END() { return getToken(XmlParser.XML_HEADER_END, 0); }
		public List<TerminalNode> WORD() { return getTokens(XmlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(XmlParser.WORD, i);
		}
		public List<TerminalNode> QUOTES() { return getTokens(XmlParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(XmlParser.QUOTES, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(XmlParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(XmlParser.EQUALS, i);
		}
		public XmlHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).enterXmlHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).exitXmlHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlVisitor ) return ((XmlVisitor<? extends T>)visitor).visitXmlHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlHeaderContext xmlHeader() throws RecognitionException {
		XmlHeaderContext _localctx = new XmlHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_xmlHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(XML_HEADER_START);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << QUOTES) | (1L << WORD))) != 0)) {
				{
				{
				setState(20);
				((XmlHeaderContext)_localctx).headerValue = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << QUOTES) | (1L << WORD))) != 0)) ) {
					((XmlHeaderContext)_localctx).headerValue = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(XML_HEADER_END);
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

	public static class XmlElementContext extends ParserRuleContext {
		public Token elementValue;
		public XmlElementStartContext xmlElementStart() {
			return getRuleContext(XmlElementStartContext.class,0);
		}
		public XmlElementEndContext xmlElementEnd() {
			return getRuleContext(XmlElementEndContext.class,0);
		}
		public XmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).enterXmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).exitXmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlVisitor ) return ((XmlVisitor<? extends T>)visitor).visitXmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlElementContext xmlElement() throws RecognitionException {
		XmlElementContext _localctx = new XmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_xmlElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			xmlElementStart();
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(29);
					((XmlElementContext)_localctx).elementValue = matchWildcard();
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(35);
			xmlElementEnd();
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

	public static class XmlElementStartContext extends ParserRuleContext {
		public Token elementName;
		public TerminalNode LEFT_CARROT() { return getToken(XmlParser.LEFT_CARROT, 0); }
		public TerminalNode RIGHT_CARROT() { return getToken(XmlParser.RIGHT_CARROT, 0); }
		public TerminalNode WORD() { return getToken(XmlParser.WORD, 0); }
		public List<XmlAttributeContext> xmlAttribute() {
			return getRuleContexts(XmlAttributeContext.class);
		}
		public XmlAttributeContext xmlAttribute(int i) {
			return getRuleContext(XmlAttributeContext.class,i);
		}
		public TerminalNode FORWARD_SLASH() { return getToken(XmlParser.FORWARD_SLASH, 0); }
		public XmlElementStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlElementStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).enterXmlElementStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).exitXmlElementStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlVisitor ) return ((XmlVisitor<? extends T>)visitor).visitXmlElementStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlElementStartContext xmlElementStart() throws RecognitionException {
		XmlElementStartContext _localctx = new XmlElementStartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_xmlElementStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LEFT_CARROT);
			setState(38);
			((XmlElementStartContext)_localctx).elementName = match(WORD);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(39);
				xmlAttribute();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORWARD_SLASH) {
				{
				setState(45);
				match(FORWARD_SLASH);
				}
			}

			setState(48);
			match(RIGHT_CARROT);
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

	public static class XmlElementEndContext extends ParserRuleContext {
		public Token elementName;
		public TerminalNode LEFT_CARROT() { return getToken(XmlParser.LEFT_CARROT, 0); }
		public TerminalNode FOWARD_SLASH() { return getToken(XmlParser.FOWARD_SLASH, 0); }
		public TerminalNode RIGHT_CARROT() { return getToken(XmlParser.RIGHT_CARROT, 0); }
		public TerminalNode WORD() { return getToken(XmlParser.WORD, 0); }
		public XmlElementEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlElementEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).enterXmlElementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).exitXmlElementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlVisitor ) return ((XmlVisitor<? extends T>)visitor).visitXmlElementEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlElementEndContext xmlElementEnd() throws RecognitionException {
		XmlElementEndContext _localctx = new XmlElementEndContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_xmlElementEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LEFT_CARROT);
			setState(51);
			match(FOWARD_SLASH);
			setState(52);
			((XmlElementEndContext)_localctx).elementName = match(WORD);
			setState(53);
			match(RIGHT_CARROT);
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

	public static class XmlAttributeContext extends ParserRuleContext {
		public Token attributeName;
		public Token attributeValue;
		public TerminalNode EQUALS() { return getToken(XmlParser.EQUALS, 0); }
		public List<TerminalNode> QUOTES() { return getTokens(XmlParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(XmlParser.QUOTES, i);
		}
		public List<TerminalNode> WORD() { return getTokens(XmlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(XmlParser.WORD, i);
		}
		public XmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).enterXmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlListener ) ((XmlListener)listener).exitXmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlVisitor ) return ((XmlVisitor<? extends T>)visitor).visitXmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlAttributeContext xmlAttribute() throws RecognitionException {
		XmlAttributeContext _localctx = new XmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_xmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((XmlAttributeContext)_localctx).attributeName = match(WORD);
			setState(56);
			match(EQUALS);
			setState(57);
			match(QUOTES);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				((XmlAttributeContext)_localctx).attributeValue = match(WORD);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(63);
			match(QUOTES);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\4\3\4\7\4!\n\4\f\4\16\4"+
		"$\13\4\3\4\3\4\3\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\5\5\5\61\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\6\7>\n\7\r\7\16\7?\3\7\3\7\3"+
		"\7\3\"\2\b\2\4\6\b\n\f\2\3\5\2\4\4\b\b\16\16C\2\16\3\2\2\2\4\25\3\2\2"+
		"\2\6\36\3\2\2\2\b\'\3\2\2\2\n\64\3\2\2\2\f9\3\2\2\2\16\22\5\4\3\2\17\21"+
		"\5\6\4\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3"+
		"\3\2\2\2\24\22\3\2\2\2\25\31\7\n\2\2\26\30\t\2\2\2\27\26\3\2\2\2\30\33"+
		"\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35"+
		"\7\13\2\2\35\5\3\2\2\2\36\"\5\b\5\2\37!\13\2\2\2 \37\3\2\2\2!$\3\2\2\2"+
		"\"#\3\2\2\2\" \3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\5\n\6\2&\7\3\2\2\2\'(\7"+
		"\6\2\2(,\7\16\2\2)+\5\f\7\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\60"+
		"\3\2\2\2.,\3\2\2\2/\61\7\5\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2"+
		"\62\63\7\t\2\2\63\t\3\2\2\2\64\65\7\6\2\2\65\66\7\20\2\2\66\67\7\16\2"+
		"\2\678\7\t\2\28\13\3\2\2\29:\7\16\2\2:;\7\4\2\2;=\7\b\2\2<>\7\16\2\2="+
		"<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\b\2\2B\r\3\2\2\2"+
		"\b\22\31\",\60?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}