// Generated from C:/Ahmad/compiler/src/html/grammars/HtmlParser.g4 by ANTLR 4.13.2
package html.grammars;



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, DOT=2, WS=3, HTML_OPEN_TAG=4, JINJA_VAR_OPEN=5, JINJA_BLOCK_OPEN=6, 
		HTML_TEXT=7, HTML_WS=8, HTML_CLOSE_TAG=9, HTML_TEXT_INNER=10, HTML_JINJA_VAR_OPEN=11, 
		HTML_JINJA_BLOCK_OPEN=12, JINJA_VAR_CLOSE=13, JINJA_VAR_WS=14, JINJA_VAR_NAME=15, 
		JINJA_VAR_DOT=16, JINJA_BLOCK_CLOSE=17, FOR=18, IN=19, IF=20, ENDIF=21, 
		ENDFOR=22, JINJA_BLOCK_NAME=23, JINJA_BLOCK_DOT=24, JINJA_BLOCK_WS=25;
	public static final int
		RULE_html_program = 0, RULE_html_item = 1, RULE_html_text = 2, RULE_html_tag = 3, 
		RULE_jinja_block = 4, RULE_jinja_var_expr = 5, RULE_jinja_block_expr = 6, 
		RULE_jinja_name = 7, RULE_jinja_stmt = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"html_program", "html_item", "html_text", "html_tag", "jinja_block", 
			"jinja_var_expr", "jinja_block_expr", "jinja_name", "jinja_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.'", null, null, null, null, null, null, null, null, null, 
			null, "'}}'", null, null, null, "'%}'", "'for'", "'in'", "'if'", "'endif'", 
			"'endfor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "DOT", "WS", "HTML_OPEN_TAG", "JINJA_VAR_OPEN", "JINJA_BLOCK_OPEN", 
			"HTML_TEXT", "HTML_WS", "HTML_CLOSE_TAG", "HTML_TEXT_INNER", "HTML_JINJA_VAR_OPEN", 
			"HTML_JINJA_BLOCK_OPEN", "JINJA_VAR_CLOSE", "JINJA_VAR_WS", "JINJA_VAR_NAME", 
			"JINJA_VAR_DOT", "JINJA_BLOCK_CLOSE", "FOR", "IN", "IF", "ENDIF", "ENDFOR", 
			"JINJA_BLOCK_NAME", "JINJA_BLOCK_DOT", "JINJA_BLOCK_WS"
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

	@Override
	public String getGrammarFileName() { return "HtmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_programContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HtmlParser.EOF, 0); }
		public List<Html_itemContext> html_item() {
			return getRuleContexts(Html_itemContext.class);
		}
		public Html_itemContext html_item(int i) {
			return getRuleContext(Html_itemContext.class,i);
		}
		public Html_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterHtml_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitHtml_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtml_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_programContext html_program() throws RecognitionException {
		Html_programContext _localctx = new Html_programContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_html_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7408L) != 0)) {
				{
				{
				setState(18);
				html_item();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_itemContext extends ParserRuleContext {
		public Html_tagContext html_tag() {
			return getRuleContext(Html_tagContext.class,0);
		}
		public Jinja_blockContext jinja_block() {
			return getRuleContext(Jinja_blockContext.class,0);
		}
		public Html_textContext html_text() {
			return getRuleContext(Html_textContext.class,0);
		}
		public Html_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterHtml_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitHtml_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtml_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_itemContext html_item() throws RecognitionException {
		Html_itemContext _localctx = new Html_itemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_html_item);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_OPEN_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				html_tag();
				}
				break;
			case JINJA_VAR_OPEN:
			case JINJA_BLOCK_OPEN:
			case HTML_JINJA_VAR_OPEN:
			case HTML_JINJA_BLOCK_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				jinja_block();
				}
				break;
			case HTML_TEXT:
			case HTML_TEXT_INNER:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				html_text();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_textContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(HtmlParser.HTML_TEXT, 0); }
		public TerminalNode HTML_TEXT_INNER() { return getToken(HtmlParser.HTML_TEXT_INNER, 0); }
		public Html_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterHtml_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitHtml_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtml_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_textContext html_text() throws RecognitionException {
		Html_textContext _localctx = new Html_textContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_html_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(_la==HTML_TEXT || _la==HTML_TEXT_INNER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_tagContext extends ParserRuleContext {
		public TerminalNode HTML_OPEN_TAG() { return getToken(HtmlParser.HTML_OPEN_TAG, 0); }
		public TerminalNode HTML_CLOSE_TAG() { return getToken(HtmlParser.HTML_CLOSE_TAG, 0); }
		public List<Html_itemContext> html_item() {
			return getRuleContexts(Html_itemContext.class);
		}
		public Html_itemContext html_item(int i) {
			return getRuleContext(Html_itemContext.class,i);
		}
		public Html_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterHtml_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitHtml_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtml_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_tagContext html_tag() throws RecognitionException {
		Html_tagContext _localctx = new Html_tagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_html_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(HTML_OPEN_TAG);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7408L) != 0)) {
				{
				{
				setState(34);
				html_item();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(HTML_CLOSE_TAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_blockContext extends ParserRuleContext {
		public Jinja_var_exprContext jinja_var_expr() {
			return getRuleContext(Jinja_var_exprContext.class,0);
		}
		public TerminalNode JINJA_VAR_CLOSE() { return getToken(HtmlParser.JINJA_VAR_CLOSE, 0); }
		public TerminalNode JINJA_VAR_OPEN() { return getToken(HtmlParser.JINJA_VAR_OPEN, 0); }
		public TerminalNode HTML_JINJA_VAR_OPEN() { return getToken(HtmlParser.HTML_JINJA_VAR_OPEN, 0); }
		public Jinja_stmtContext jinja_stmt() {
			return getRuleContext(Jinja_stmtContext.class,0);
		}
		public TerminalNode JINJA_BLOCK_CLOSE() { return getToken(HtmlParser.JINJA_BLOCK_CLOSE, 0); }
		public TerminalNode JINJA_BLOCK_OPEN() { return getToken(HtmlParser.JINJA_BLOCK_OPEN, 0); }
		public TerminalNode HTML_JINJA_BLOCK_OPEN() { return getToken(HtmlParser.HTML_JINJA_BLOCK_OPEN, 0); }
		public Jinja_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterJinja_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitJinja_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinja_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_blockContext jinja_block() throws RecognitionException {
		Jinja_blockContext _localctx = new Jinja_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jinja_block);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_VAR_OPEN:
			case HTML_JINJA_VAR_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				_la = _input.LA(1);
				if ( !(_la==JINJA_VAR_OPEN || _la==HTML_JINJA_VAR_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				jinja_var_expr();
				setState(44);
				match(JINJA_VAR_CLOSE);
				}
				break;
			case JINJA_BLOCK_OPEN:
			case HTML_JINJA_BLOCK_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				_la = _input.LA(1);
				if ( !(_la==JINJA_BLOCK_OPEN || _la==HTML_JINJA_BLOCK_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				jinja_stmt();
				setState(48);
				match(JINJA_BLOCK_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_var_exprContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_VAR_NAME() { return getTokens(HtmlParser.JINJA_VAR_NAME); }
		public TerminalNode JINJA_VAR_NAME(int i) {
			return getToken(HtmlParser.JINJA_VAR_NAME, i);
		}
		public List<TerminalNode> JINJA_VAR_DOT() { return getTokens(HtmlParser.JINJA_VAR_DOT); }
		public TerminalNode JINJA_VAR_DOT(int i) {
			return getToken(HtmlParser.JINJA_VAR_DOT, i);
		}
		public Jinja_var_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_var_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterJinja_var_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitJinja_var_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinja_var_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_var_exprContext jinja_var_expr() throws RecognitionException {
		Jinja_var_exprContext _localctx = new Jinja_var_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jinja_var_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(JINJA_VAR_NAME);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_VAR_DOT) {
				{
				{
				setState(53);
				match(JINJA_VAR_DOT);
				setState(54);
				match(JINJA_VAR_NAME);
				}
				}
				setState(59);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_block_exprContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_BLOCK_NAME() { return getTokens(HtmlParser.JINJA_BLOCK_NAME); }
		public TerminalNode JINJA_BLOCK_NAME(int i) {
			return getToken(HtmlParser.JINJA_BLOCK_NAME, i);
		}
		public List<TerminalNode> JINJA_BLOCK_DOT() { return getTokens(HtmlParser.JINJA_BLOCK_DOT); }
		public TerminalNode JINJA_BLOCK_DOT(int i) {
			return getToken(HtmlParser.JINJA_BLOCK_DOT, i);
		}
		public Jinja_block_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_block_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterJinja_block_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitJinja_block_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinja_block_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_block_exprContext jinja_block_expr() throws RecognitionException {
		Jinja_block_exprContext _localctx = new Jinja_block_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jinja_block_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(JINJA_BLOCK_NAME);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_BLOCK_DOT) {
				{
				{
				setState(61);
				match(JINJA_BLOCK_DOT);
				setState(62);
				match(JINJA_BLOCK_NAME);
				}
				}
				setState(67);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_nameContext extends ParserRuleContext {
		public TerminalNode JINJA_VAR_NAME() { return getToken(HtmlParser.JINJA_VAR_NAME, 0); }
		public TerminalNode JINJA_BLOCK_NAME() { return getToken(HtmlParser.JINJA_BLOCK_NAME, 0); }
		public Jinja_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterJinja_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitJinja_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinja_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_nameContext jinja_name() throws RecognitionException {
		Jinja_nameContext _localctx = new Jinja_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jinja_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==JINJA_VAR_NAME || _la==JINJA_BLOCK_NAME) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_stmtContext extends ParserRuleContext {
		public Jinja_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_stmt; }
	 
		public Jinja_stmtContext() { }
		public void copyFrom(Jinja_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaEndForContext extends Jinja_stmtContext {
		public TerminalNode ENDFOR() { return getToken(HtmlParser.ENDFOR, 0); }
		public JinjaEndForContext(Jinja_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterJinjaEndFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitJinjaEndFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaEndFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaEndIfContext extends Jinja_stmtContext {
		public TerminalNode ENDIF() { return getToken(HtmlParser.ENDIF, 0); }
		public JinjaEndIfContext(Jinja_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterJinjaEndIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitJinjaEndIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaEndIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfContext extends Jinja_stmtContext {
		public TerminalNode IF() { return getToken(HtmlParser.IF, 0); }
		public Jinja_block_exprContext jinja_block_expr() {
			return getRuleContext(Jinja_block_exprContext.class,0);
		}
		public JinjaIfContext(Jinja_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterJinjaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitJinjaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForContext extends Jinja_stmtContext {
		public TerminalNode FOR() { return getToken(HtmlParser.FOR, 0); }
		public TerminalNode JINJA_BLOCK_NAME() { return getToken(HtmlParser.JINJA_BLOCK_NAME, 0); }
		public TerminalNode IN() { return getToken(HtmlParser.IN, 0); }
		public Jinja_block_exprContext jinja_block_expr() {
			return getRuleContext(Jinja_block_exprContext.class,0);
		}
		public JinjaForContext(Jinja_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterJinjaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitJinjaFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_stmtContext jinja_stmt() throws RecognitionException {
		Jinja_stmtContext _localctx = new Jinja_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinja_stmt);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new JinjaForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(FOR);
				setState(71);
				match(JINJA_BLOCK_NAME);
				setState(72);
				match(IN);
				setState(73);
				jinja_block_expr();
				}
				break;
			case ENDFOR:
				_localctx = new JinjaEndForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(ENDFOR);
				}
				break;
			case IF:
				_localctx = new JinjaIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(IF);
				setState(76);
				jinja_block_expr();
				}
				break;
			case ENDIF:
				_localctx = new JinjaEndIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(ENDIF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\u0019Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005"+
		"\u0003$\b\u0003\n\u0003\f\u0003\'\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u00043\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u00058\b\u0005\n\u0005\f\u0005;\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006@\b\u0006\n\u0006\f\u0006C\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bO\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0000\u0004\u0002\u0000\u0007\u0007\n\n\u0002\u0000"+
		"\u0005\u0005\u000b\u000b\u0002\u0000\u0006\u0006\f\f\u0002\u0000\u000f"+
		"\u000f\u0017\u0017Q\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001d\u0001"+
		"\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006!\u0001\u0000"+
		"\u0000\u0000\b2\u0001\u0000\u0000\u0000\n4\u0001\u0000\u0000\u0000\f<"+
		"\u0001\u0000\u0000\u0000\u000eD\u0001\u0000\u0000\u0000\u0010N\u0001\u0000"+
		"\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000"+
		"\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000"+
		"\u0000\u0001\u0019\u0001\u0001\u0000\u0000\u0000\u001a\u001e\u0003\u0006"+
		"\u0003\u0000\u001b\u001e\u0003\b\u0004\u0000\u001c\u001e\u0003\u0004\u0002"+
		"\u0000\u001d\u001a\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000"+
		"\u0000\u001f \u0007\u0000\u0000\u0000 \u0005\u0001\u0000\u0000\u0000!"+
		"%\u0005\u0004\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005"+
		"\t\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*+\u0007\u0001\u0000\u0000"+
		"+,\u0003\n\u0005\u0000,-\u0005\r\u0000\u0000-3\u0001\u0000\u0000\u0000"+
		"./\u0007\u0002\u0000\u0000/0\u0003\u0010\b\u000001\u0005\u0011\u0000\u0000"+
		"13\u0001\u0000\u0000\u00002*\u0001\u0000\u0000\u00002.\u0001\u0000\u0000"+
		"\u00003\t\u0001\u0000\u0000\u000049\u0005\u000f\u0000\u000056\u0005\u0010"+
		"\u0000\u000068\u0005\u000f\u0000\u000075\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":\u000b\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<A\u0005\u0017"+
		"\u0000\u0000=>\u0005\u0018\u0000\u0000>@\u0005\u0017\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B\r\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DE\u0007\u0003\u0000\u0000E\u000f\u0001\u0000\u0000\u0000FG\u0005"+
		"\u0012\u0000\u0000GH\u0005\u0017\u0000\u0000HI\u0005\u0013\u0000\u0000"+
		"IO\u0003\f\u0006\u0000JO\u0005\u0016\u0000\u0000KL\u0005\u0014\u0000\u0000"+
		"LO\u0003\f\u0006\u0000MO\u0005\u0015\u0000\u0000NF\u0001\u0000\u0000\u0000"+
		"NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000O\u0011\u0001\u0000\u0000\u0000\u0007\u0015\u001d%29AN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}