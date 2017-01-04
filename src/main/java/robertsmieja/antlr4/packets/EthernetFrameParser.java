// Generated from robertsmieja\antlr4\packets\EthernetFrame.g4 by ANTLR 4.6

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
public class EthernetFrameParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_12=1, BYTE_4=2, BYTE_2=3, BYTE=4;
	public static final int
		RULE_ethernetFrame = 0, RULE_preAmble = 1, RULE_frameDelimiter = 2, RULE_macAddress = 3, 
		RULE_qTag = 4, RULE_etherType = 5, RULE_payload = 6, RULE_frameCheck = 7, 
		RULE_interpacketGap = 8;
	public static final String[] ruleNames = {
		"ethernetFrame", "preAmble", "frameDelimiter", "macAddress", "qTag", "etherType", 
		"payload", "frameCheck", "interpacketGap"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYTE_12", "BYTE_4", "BYTE_2", "BYTE"
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
	public String getGrammarFileName() { return "EthernetFrame.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EthernetFrameParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EthernetFrameContext extends ParserRuleContext {
		public MacAddressContext sourceMac;
		public MacAddressContext destinationMac;
		public PreAmbleContext preAmble() {
			return getRuleContext(PreAmbleContext.class,0);
		}
		public FrameDelimiterContext frameDelimiter() {
			return getRuleContext(FrameDelimiterContext.class,0);
		}
		public EtherTypeContext etherType() {
			return getRuleContext(EtherTypeContext.class,0);
		}
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public FrameCheckContext frameCheck() {
			return getRuleContext(FrameCheckContext.class,0);
		}
		public InterpacketGapContext interpacketGap() {
			return getRuleContext(InterpacketGapContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EthernetFrameParser.EOF, 0); }
		public List<MacAddressContext> macAddress() {
			return getRuleContexts(MacAddressContext.class);
		}
		public MacAddressContext macAddress(int i) {
			return getRuleContext(MacAddressContext.class,i);
		}
		public QTagContext qTag() {
			return getRuleContext(QTagContext.class,0);
		}
		public EthernetFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ethernetFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).enterEthernetFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).exitEthernetFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EthernetFrameVisitor ) return ((EthernetFrameVisitor<? extends T>)visitor).visitEthernetFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EthernetFrameContext ethernetFrame() throws RecognitionException {
		EthernetFrameContext _localctx = new EthernetFrameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ethernetFrame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			preAmble();
			setState(19);
			frameDelimiter();
			setState(20);
			((EthernetFrameContext)_localctx).sourceMac = macAddress();
			setState(21);
			((EthernetFrameContext)_localctx).destinationMac = macAddress();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_4) {
				{
				setState(22);
				qTag();
				}
			}

			setState(25);
			etherType();
			setState(26);
			payload();
			setState(27);
			frameCheck();
			setState(28);
			interpacketGap();
			setState(29);
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

	public static class PreAmbleContext extends ParserRuleContext {
		public TerminalNode BYTE_4() { return getToken(EthernetFrameParser.BYTE_4, 0); }
		public TerminalNode BYTE_2() { return getToken(EthernetFrameParser.BYTE_2, 0); }
		public TerminalNode BYTE() { return getToken(EthernetFrameParser.BYTE, 0); }
		public PreAmbleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preAmble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).enterPreAmble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).exitPreAmble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EthernetFrameVisitor ) return ((EthernetFrameVisitor<? extends T>)visitor).visitPreAmble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreAmbleContext preAmble() throws RecognitionException {
		PreAmbleContext _localctx = new PreAmbleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preAmble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(BYTE_4);
			setState(32);
			match(BYTE_2);
			setState(33);
			match(BYTE);
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

	public static class FrameDelimiterContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(EthernetFrameParser.BYTE, 0); }
		public FrameDelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameDelimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).enterFrameDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).exitFrameDelimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EthernetFrameVisitor ) return ((EthernetFrameVisitor<? extends T>)visitor).visitFrameDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameDelimiterContext frameDelimiter() throws RecognitionException {
		FrameDelimiterContext _localctx = new FrameDelimiterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_frameDelimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(BYTE);
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

	public static class MacAddressContext extends ParserRuleContext {
		public TerminalNode BYTE_4() { return getToken(EthernetFrameParser.BYTE_4, 0); }
		public MacAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).enterMacAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).exitMacAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EthernetFrameVisitor ) return ((EthernetFrameVisitor<? extends T>)visitor).visitMacAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacAddressContext macAddress() throws RecognitionException {
		MacAddressContext _localctx = new MacAddressContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_macAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(BYTE_4);
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

	public static class QTagContext extends ParserRuleContext {
		public TerminalNode BYTE_4() { return getToken(EthernetFrameParser.BYTE_4, 0); }
		public QTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).enterQTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).exitQTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EthernetFrameVisitor ) return ((EthernetFrameVisitor<? extends T>)visitor).visitQTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QTagContext qTag() throws RecognitionException {
		QTagContext _localctx = new QTagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(BYTE_4);
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

	public static class EtherTypeContext extends ParserRuleContext {
		public TerminalNode BYTE_2() { return getToken(EthernetFrameParser.BYTE_2, 0); }
		public EtherTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etherType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).enterEtherType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).exitEtherType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EthernetFrameVisitor ) return ((EthernetFrameVisitor<? extends T>)visitor).visitEtherType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtherTypeContext etherType() throws RecognitionException {
		EtherTypeContext _localctx = new EtherTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_etherType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(BYTE_2);
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

	public static class PayloadContext extends ParserRuleContext {
		public List<TerminalNode> BYTE() { return getTokens(EthernetFrameParser.BYTE); }
		public TerminalNode BYTE(int i) {
			return getToken(EthernetFrameParser.BYTE, i);
		}
		public PayloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).enterPayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).exitPayload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EthernetFrameVisitor ) return ((EthernetFrameVisitor<? extends T>)visitor).visitPayload(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_payload);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BYTE) {
				{
				{
				setState(43);
				match(BYTE);
				}
				}
				setState(48);
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

	public static class FrameCheckContext extends ParserRuleContext {
		public TerminalNode BYTE_4() { return getToken(EthernetFrameParser.BYTE_4, 0); }
		public FrameCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).enterFrameCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).exitFrameCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EthernetFrameVisitor ) return ((EthernetFrameVisitor<? extends T>)visitor).visitFrameCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameCheckContext frameCheck() throws RecognitionException {
		FrameCheckContext _localctx = new FrameCheckContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_frameCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(BYTE_4);
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

	public static class InterpacketGapContext extends ParserRuleContext {
		public TerminalNode BYTE_12() { return getToken(EthernetFrameParser.BYTE_12, 0); }
		public InterpacketGapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpacketGap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).enterInterpacketGap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EthernetFrameListener ) ((EthernetFrameListener)listener).exitInterpacketGap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EthernetFrameVisitor ) return ((EthernetFrameVisitor<? extends T>)visitor).visitInterpacketGap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpacketGapContext interpacketGap() throws RecognitionException {
		InterpacketGapContext _localctx = new InterpacketGapContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interpacketGap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(BYTE_12);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\68\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\7\b/\n\b\f\b\16\b\62\13\b\3\t\3\t\3\n\3\n\3"+
		"\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\60\2\24\3\2\2\2\4!\3\2\2\2\6%\3\2\2"+
		"\2\b\'\3\2\2\2\n)\3\2\2\2\f+\3\2\2\2\16\60\3\2\2\2\20\63\3\2\2\2\22\65"+
		"\3\2\2\2\24\25\5\4\3\2\25\26\5\6\4\2\26\27\5\b\5\2\27\31\5\b\5\2\30\32"+
		"\5\n\6\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\5\f\7\2\34\35"+
		"\5\16\b\2\35\36\5\20\t\2\36\37\5\22\n\2\37 \7\2\2\3 \3\3\2\2\2!\"\7\4"+
		"\2\2\"#\7\5\2\2#$\7\6\2\2$\5\3\2\2\2%&\7\6\2\2&\7\3\2\2\2\'(\7\4\2\2("+
		"\t\3\2\2\2)*\7\4\2\2*\13\3\2\2\2+,\7\5\2\2,\r\3\2\2\2-/\7\6\2\2.-\3\2"+
		"\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\17\3\2\2\2\62\60\3\2\2\2"+
		"\63\64\7\4\2\2\64\21\3\2\2\2\65\66\7\3\2\2\66\23\3\2\2\2\4\31\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}