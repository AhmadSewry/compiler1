// Generated from C:/Users/mazen/Desktop/compiler1/src/html/grammars/HtmlParser.g4 by ANTLR 4.13.2
package html.grammars;



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, DOT=2, WS=3, STYLE_OPEN=4, HTML_OPEN_TAG=5, JINJA_VAR_OPEN=6, 
		JINJA_BLOCK_OPEN=7, HTML_TEXT=8, HTML_WS=9, STYLE_OPEN_IN_HTML=10, HTML_CLOSE_TAG=11, 
		HTML_TEXT_INNER=12, HTML_JINJA_VAR_OPEN=13, HTML_JINJA_BLOCK_OPEN=14, 
		JINJA_VAR_CLOSE=15, JINJA_VAR_WS=16, JINJA_VAR_NAME=17, JINJA_VAR_DOT=18, 
		JINJA_BLOCK_CLOSE=19, FOR=20, IN=21, IF=22, ENDIF=23, ENDFOR=24, JINJA_BLOCK_NAME=25, 
		JINJA_BLOCK_DOT=26, JINJA_BLOCK_WS=27, STYLE_CLOSE=28, CSS_DOT=29, CSS_HASH=30, 
		CSS_IDENT=31, CSS_NUMBER=32, CSS_UNIT=33, CSS_STRING=34, CSS_COLON=35, 
		CSS_SEMI=36, CSS_LBRACE=37, CSS_RBRACE=38, CSS_WS=39;
	public static final int
		RULE_html_program = 0, RULE_html_item = 1, RULE_html_text = 2, RULE_html_tag = 3, 
		RULE_jinja_block = 4, RULE_jinja_var_expr = 5, RULE_jinja_block_expr = 6, 
		RULE_jinja_name = 7, RULE_jinja_stmt = 8, RULE_style_block = 9, RULE_css_rule = 10, 
		RULE_css_selector = 11, RULE_css_decl = 12, RULE_css_value = 13, RULE_css_atom = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"html_program", "html_item", "html_text", "html_tag", "jinja_block", 
			"jinja_var_expr", "jinja_block_expr", "jinja_name", "jinja_stmt", "style_block", 
			"css_rule", "css_selector", "css_decl", "css_value", "css_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'}}'", null, null, null, "'%}'", "'for'", "'in'", 
			"'if'", "'endif'", "'endfor'", null, null, null, "'</style>'", null, 
			"'#'", null, null, null, null, "':'", "';'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "DOT", "WS", "STYLE_OPEN", "HTML_OPEN_TAG", "JINJA_VAR_OPEN", 
			"JINJA_BLOCK_OPEN", "HTML_TEXT", "HTML_WS", "STYLE_OPEN_IN_HTML", "HTML_CLOSE_TAG", 
			"HTML_TEXT_INNER", "HTML_JINJA_VAR_OPEN", "HTML_JINJA_BLOCK_OPEN", "JINJA_VAR_CLOSE", 
			"JINJA_VAR_WS", "JINJA_VAR_NAME", "JINJA_VAR_DOT", "JINJA_BLOCK_CLOSE", 
			"FOR", "IN", "IF", "ENDIF", "ENDFOR", "JINJA_BLOCK_NAME", "JINJA_BLOCK_DOT", 
			"JINJA_BLOCK_WS", "STYLE_CLOSE", "CSS_DOT", "CSS_HASH", "CSS_IDENT", 
			"CSS_NUMBER", "CSS_UNIT", "CSS_STRING", "CSS_COLON", "CSS_SEMI", "CSS_LBRACE", 
			"CSS_RBRACE", "CSS_WS"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29168L) != 0)) {
				{
				{
				setState(30);
				html_item();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
		public Style_blockContext style_block() {
			return getRuleContext(Style_blockContext.class,0);
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_OPEN_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				html_tag();
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				style_block();
				}
				break;
			case JINJA_VAR_OPEN:
			case JINJA_BLOCK_OPEN:
			case HTML_JINJA_VAR_OPEN:
			case HTML_JINJA_BLOCK_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				jinja_block();
				}
				break;
			case HTML_TEXT:
			case HTML_TEXT_INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
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
			setState(44);
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
			setState(46);
			match(HTML_OPEN_TAG);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29168L) != 0)) {
				{
				{
				setState(47);
				html_item();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_VAR_OPEN:
			case HTML_JINJA_VAR_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==JINJA_VAR_OPEN || _la==HTML_JINJA_VAR_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				jinja_var_expr();
				setState(57);
				match(JINJA_VAR_CLOSE);
				}
				break;
			case JINJA_BLOCK_OPEN:
			case HTML_JINJA_BLOCK_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==JINJA_BLOCK_OPEN || _la==HTML_JINJA_BLOCK_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				jinja_stmt();
				setState(61);
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
			setState(65);
			match(JINJA_VAR_NAME);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_VAR_DOT) {
				{
				{
				setState(66);
				match(JINJA_VAR_DOT);
				setState(67);
				match(JINJA_VAR_NAME);
				}
				}
				setState(72);
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
			setState(73);
			match(JINJA_BLOCK_NAME);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_BLOCK_DOT) {
				{
				{
				setState(74);
				match(JINJA_BLOCK_DOT);
				setState(75);
				match(JINJA_BLOCK_NAME);
				}
				}
				setState(80);
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
			setState(81);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new JinjaForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(FOR);
				setState(84);
				match(JINJA_BLOCK_NAME);
				setState(85);
				match(IN);
				setState(86);
				jinja_block_expr();
				}
				break;
			case ENDFOR:
				_localctx = new JinjaEndForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(ENDFOR);
				}
				break;
			case IF:
				_localctx = new JinjaIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(IF);
				setState(89);
				jinja_block_expr();
				}
				break;
			case ENDIF:
				_localctx = new JinjaEndIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Style_blockContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HtmlParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_CLOSE() { return getToken(HtmlParser.STYLE_CLOSE, 0); }
		public List<Css_ruleContext> css_rule() {
			return getRuleContexts(Css_ruleContext.class);
		}
		public Css_ruleContext css_rule(int i) {
			return getRuleContext(Css_ruleContext.class,i);
		}
		public Style_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterStyle_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitStyle_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitStyle_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_blockContext style_block() throws RecognitionException {
		Style_blockContext _localctx = new Style_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_style_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(STYLE_OPEN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
				{
				{
				setState(94);
				css_rule();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(STYLE_CLOSE);
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
	public static class Css_ruleContext extends ParserRuleContext {
		public Css_selectorContext css_selector() {
			return getRuleContext(Css_selectorContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(HtmlParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(HtmlParser.CSS_RBRACE, 0); }
		public List<Css_declContext> css_decl() {
			return getRuleContexts(Css_declContext.class);
		}
		public Css_declContext css_decl(int i) {
			return getRuleContext(Css_declContext.class,i);
		}
		public Css_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterCss_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitCss_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCss_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_ruleContext css_rule() throws RecognitionException {
		Css_ruleContext _localctx = new Css_ruleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_css_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			css_selector();
			setState(103);
			match(CSS_LBRACE);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_IDENT) {
				{
				{
				setState(104);
				css_decl();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(CSS_RBRACE);
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
	public static class Css_selectorContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(HtmlParser.CSS_IDENT, 0); }
		public TerminalNode CSS_DOT() { return getToken(HtmlParser.CSS_DOT, 0); }
		public TerminalNode CSS_HASH() { return getToken(HtmlParser.CSS_HASH, 0); }
		public Css_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterCss_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitCss_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCss_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_selectorContext css_selector() throws RecognitionException {
		Css_selectorContext _localctx = new Css_selectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_css_selector);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(CSS_IDENT);
				}
				break;
			case CSS_DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(CSS_DOT);
				setState(114);
				match(CSS_IDENT);
				}
				break;
			case CSS_HASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(CSS_HASH);
				setState(116);
				match(CSS_IDENT);
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
	public static class Css_declContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(HtmlParser.CSS_IDENT, 0); }
		public TerminalNode CSS_COLON() { return getToken(HtmlParser.CSS_COLON, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(HtmlParser.CSS_SEMI, 0); }
		public Css_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterCss_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitCss_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCss_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_declContext css_decl() throws RecognitionException {
		Css_declContext _localctx = new Css_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_css_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(CSS_IDENT);
			setState(120);
			match(CSS_COLON);
			setState(121);
			css_value();
			setState(122);
			match(CSS_SEMI);
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
	public static class Css_valueContext extends ParserRuleContext {
		public List<Css_atomContext> css_atom() {
			return getRuleContexts(Css_atomContext.class);
		}
		public Css_atomContext css_atom(int i) {
			return getRuleContext(Css_atomContext.class,i);
		}
		public Css_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterCss_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitCss_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCss_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_css_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				css_atom();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0) );
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
	public static class Css_atomContext extends ParserRuleContext {
		public TerminalNode CSS_NUMBER() { return getToken(HtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(HtmlParser.CSS_UNIT, 0); }
		public TerminalNode CSS_STRING() { return getToken(HtmlParser.CSS_STRING, 0); }
		public TerminalNode CSS_IDENT() { return getToken(HtmlParser.CSS_IDENT, 0); }
		public Css_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterCss_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitCss_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCss_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_atomContext css_atom() throws RecognitionException {
		Css_atomContext _localctx = new Css_atomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_css_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
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
		"\u0004\u0001\'\u0084\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u00031\b\u0003\n\u0003\f\u0003"+
		"4\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"@\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005E\b\u0005\n\u0005"+
		"\f\u0005H\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006M\b\u0006"+
		"\n\u0006\f\u0006P\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\\\b\b\u0001\t\u0001"+
		"\t\u0005\t`\b\t\n\t\f\tc\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\nj\b\n\n\n\f\nm\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bv\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0004\r~\b\r\u000b\r\f\r\u007f\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0005\u0002\u0000\b\b"+
		"\f\f\u0002\u0000\u0006\u0006\r\r\u0002\u0000\u0007\u0007\u000e\u000e\u0002"+
		"\u0000\u0011\u0011\u0019\u0019\u0001\u0000\u001f\"\u0084\u0000!\u0001"+
		"\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000"+
		"\u0000\u0006.\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nA\u0001"+
		"\u0000\u0000\u0000\fI\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000"+
		"\u0000\u0010[\u0001\u0000\u0000\u0000\u0012]\u0001\u0000\u0000\u0000\u0014"+
		"f\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000\u0000\u0018w\u0001"+
		"\u0000\u0000\u0000\u001a}\u0001\u0000\u0000\u0000\u001c\u0081\u0001\u0000"+
		"\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&+\u0003\u0006"+
		"\u0003\u0000\'+\u0003\u0012\t\u0000(+\u0003\b\u0004\u0000)+\u0003\u0004"+
		"\u0002\u0000*&\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000"+
		"\u0000,-\u0007\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.2\u0005"+
		"\u0005\u0000\u0000/1\u0003\u0002\u0001\u00000/\u0001\u0000\u0000\u0000"+
		"14\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000035\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005\u000b"+
		"\u0000\u00006\u0007\u0001\u0000\u0000\u000078\u0007\u0001\u0000\u0000"+
		"89\u0003\n\u0005\u00009:\u0005\u000f\u0000\u0000:@\u0001\u0000\u0000\u0000"+
		";<\u0007\u0002\u0000\u0000<=\u0003\u0010\b\u0000=>\u0005\u0013\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?7\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000"+
		"\u0000@\t\u0001\u0000\u0000\u0000AF\u0005\u0011\u0000\u0000BC\u0005\u0012"+
		"\u0000\u0000CE\u0005\u0011\u0000\u0000DB\u0001\u0000\u0000\u0000EH\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"G\u000b\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IN\u0005\u0019"+
		"\u0000\u0000JK\u0005\u001a\u0000\u0000KM\u0005\u0019\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000O\r\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QR\u0007\u0003\u0000\u0000R\u000f\u0001\u0000\u0000\u0000ST\u0005"+
		"\u0014\u0000\u0000TU\u0005\u0019\u0000\u0000UV\u0005\u0015\u0000\u0000"+
		"V\\\u0003\f\u0006\u0000W\\\u0005\u0018\u0000\u0000XY\u0005\u0016\u0000"+
		"\u0000Y\\\u0003\f\u0006\u0000Z\\\u0005\u0017\u0000\u0000[S\u0001\u0000"+
		"\u0000\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\\u0011\u0001\u0000\u0000\u0000]a\u0005\u0004\u0000"+
		"\u0000^`\u0003\u0014\n\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u001c\u0000\u0000e\u0013"+
		"\u0001\u0000\u0000\u0000fg\u0003\u0016\u000b\u0000gk\u0005%\u0000\u0000"+
		"hj\u0003\u0018\f\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000no\u0005&\u0000\u0000o\u0015\u0001\u0000"+
		"\u0000\u0000pv\u0005\u001f\u0000\u0000qr\u0005\u001d\u0000\u0000rv\u0005"+
		"\u001f\u0000\u0000st\u0005\u001e\u0000\u0000tv\u0005\u001f\u0000\u0000"+
		"up\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000v\u0017\u0001\u0000\u0000\u0000wx\u0005\u001f\u0000\u0000xy\u0005"+
		"#\u0000\u0000yz\u0003\u001a\r\u0000z{\u0005$\u0000\u0000{\u0019\u0001"+
		"\u0000\u0000\u0000|~\u0003\u001c\u000e\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u001b\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0007\u0004\u0000\u0000\u0082\u001d\u0001\u0000\u0000\u0000\u000b!*2"+
		"?FN[aku\u007f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}