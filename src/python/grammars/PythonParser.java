// Generated from C:/Users/mazen/Desktop/ANTLRCompilerProject/src/python/grammars/PythonParser.g4 by ANTLR 4.13.2
package python.grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			NEWLINE=1, WS=2, DEF=3, IF=4, ELSE=5, FOR=6, IN=7, WHILE=8, PRINT=9, ASSIGN=10,
			PLUS=11, MINUS=12, MULT=13, DIV=14, LPAREN=15, RPAREN=16, COLON=17, COMMA=18,
			DOT=19, GT=20, LT=21, GTE=22, LTE=23, EQ=24, NEQ=25, NUMBER=26, STRING=27,
			IDENTIFIER=28, INDENT=29, DEDENT=30;
	public static final int
			RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_simpleStatement = 3,
			RULE_compoundStatement = 4, RULE_funcDef = 5, RULE_forStmt = 6, RULE_ifStmt = 7,
			RULE_whileStmt = 8, RULE_assignment = 9, RULE_printStmt = 10, RULE_exprStmt = 11,
			RULE_paramList = 12, RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
				"program", "statements", "statement", "simpleStatement", "compoundStatement",
				"funcDef", "forStmt", "ifStmt", "whileStmt", "assignment", "printStmt",
				"exprStmt", "paramList", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, null, null, "'def'", "'if'", "'else'", "'for'", "'in'", "'while'",
				"'print'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "':'", "','",
				"'.'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "NEWLINE", "WS", "DEF", "IF", "ELSE", "FOR", "IN", "WHILE", "PRINT",
				"ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "COLON",
				"COMMA", "DOT", "GT", "LT", "GTE", "LTE", "EQ", "NEQ", "NUMBER", "STRING",
				"IDENTIFIER", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469795672L) != 0)) {
					{
						setState(28);
						statements();
					}
				}

				setState(31);
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
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(33);
							statement();
						}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 469795672L) != 0) );
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
	public static class StatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case PRINT:
				case LPAREN:
				case NUMBER:
				case STRING:
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(38);
					simpleStatement();
				}
				break;
				case DEF:
				case IF:
				case FOR:
				case WHILE:
					enterOuterAlt(_localctx, 2);
				{
					setState(39);
					compoundStatement();
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
	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleStatement);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(42);
					assignment();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(43);
					printStmt();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(44);
					exprStmt();
				}
				break;
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
	public static class CompoundStatementContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compoundStatement);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case DEF:
					enterOuterAlt(_localctx, 1);
				{
					setState(47);
					funcDef();
				}
				break;
				case FOR:
					enterOuterAlt(_localctx, 2);
				{
					setState(48);
					forStmt();
				}
				break;
				case IF:
					enterOuterAlt(_localctx, 3);
				{
					setState(49);
					ifStmt();
				}
				break;
				case WHILE:
					enterOuterAlt(_localctx, 4);
				{
					setState(50);
					whileStmt();
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
	public static class FuncDefContext extends ParserRuleContext {
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }

		public FuncDefContext() { }
		public void copyFrom(FuncDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefNodeContext extends FuncDefContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDefNodeContext(FuncDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunctionDefNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunctionDefNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionDefNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcDef);
		int _la;
		try {
			_localctx = new FunctionDefNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(53);
				match(DEF);
				setState(54);
				match(IDENTIFIER);
				setState(55);
				match(LPAREN);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
						setState(56);
						paramList();
					}
				}

				setState(59);
				match(RPAREN);
				setState(60);
				match(COLON);
				setState(61);
				match(NEWLINE);
				setState(62);
				match(INDENT);
				setState(63);
				statements();
				setState(64);
				match(DEDENT);
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
	public static class ForStmtContext extends ParserRuleContext {
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }

		public ForStmtContext() { }
		public void copyFrom(ForStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementNodeContext extends ForStmtContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public ForStatementNodeContext(ForStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterForStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitForStatementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForStatementNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forStmt);
		try {
			_localctx = new ForStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(66);
				match(FOR);
				setState(67);
				match(IDENTIFIER);
				setState(68);
				match(IN);
				setState(69);
				match(IDENTIFIER);
				setState(70);
				match(COLON);
				setState(71);
				match(NEWLINE);
				setState(72);
				match(INDENT);
				setState(73);
				statements();
				setState(74);
				match(DEDENT);
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
	public static class IfStmtContext extends ParserRuleContext {
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }

		public IfStmtContext() { }
		public void copyFrom(IfStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementNodeContext extends IfStmtContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(PythonParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(PythonParser.DEDENT, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public IfStatementNodeContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIfStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIfStatementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfStatementNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		int _la;
		try {
			_localctx = new IfStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(76);
				match(IF);
				setState(77);
				expr(0);
				setState(78);
				match(COLON);
				setState(79);
				match(NEWLINE);
				setState(80);
				match(INDENT);
				setState(81);
				statements();
				setState(82);
				match(DEDENT);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
						setState(83);
						match(ELSE);
						setState(84);
						match(COLON);
						setState(85);
						match(NEWLINE);
						setState(86);
						match(INDENT);
						setState(87);
						statements();
						setState(88);
						match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }

		public WhileStmtContext() { }
		public void copyFrom(WhileStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementNodeContext extends WhileStmtContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public WhileStatementNodeContext(WhileStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhileStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhileStatementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhileStatementNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStmt);
		try {
			_localctx = new WhileStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(92);
				match(WHILE);
				setState(93);
				expr(0);
				setState(94);
				match(COLON);
				setState(95);
				match(NEWLINE);
				setState(96);
				match(INDENT);
				setState(97);
				statements();
				setState(98);
				match(DEDENT);
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
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }

		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentNodeContext extends AssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AssignmentNodeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssignmentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssignmentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssignmentNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			_localctx = new AssignmentNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(100);
				match(IDENTIFIER);
				setState(101);
				match(ASSIGN);
				setState(102);
				expr(0);
				setState(103);
				match(NEWLINE);
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
	public static class PrintStmtContext extends ParserRuleContext {
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }

		public PrintStmtContext() { }
		public void copyFrom(PrintStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintNodeContext extends PrintStmtContext {
		public TerminalNode PRINT() { return getToken(PythonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public PrintNodeContext(PrintStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPrintNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPrintNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPrintNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printStmt);
		try {
			_localctx = new PrintNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(105);
				match(PRINT);
				setState(106);
				match(LPAREN);
				setState(107);
				expr(0);
				setState(108);
				match(RPAREN);
				setState(109);
				match(NEWLINE);
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
	public static class ExprStmtContext extends ParserRuleContext {
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }

		public ExprStmtContext() { }
		public void copyFrom(ExprStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatementNodeContext extends ExprStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ExprStatementNodeContext(ExprStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExprStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExprStatementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExprStatementNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprStmt);
		try {
			_localctx = new ExprStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(111);
				expr(0);
				setState(112);
				match(NEWLINE);
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
	public static class ParamListContext extends ParserRuleContext {
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }

		public ParamListContext() { }
		public void copyFrom(ParamListContext ctx) {
			super.copyFrom(ctx);
		}

		public List<TerminalNode> IDENTIFIER() {
			return null;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListNodeContext extends ParamListContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ParameterListNodeContext(ParamListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParameterListNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParameterListNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParameterListNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_paramList);
		int _la;
		try {
			_localctx = new ParameterListNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(114);
				match(IDENTIFIER);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(115);
							match(COMMA);
							setState(116);
							match(IDENTIFIER);
						}
					}
					setState(121);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }

		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(PythonParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PythonParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ParenthesizedContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParenthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParenthesized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParenthesized(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public CompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case NUMBER:
					{
						_localctx = new NumberContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(123);
						match(NUMBER);
					}
					break;
					case STRING:
					{
						_localctx = new StringContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(124);
						match(STRING);
					}
					break;
					case IDENTIFIER:
					{
						_localctx = new IdentifierContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(125);
						match(IDENTIFIER);
					}
					break;
					case LPAREN:
					{
						_localctx = new ParenthesizedContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(126);
						match(LPAREN);
						setState(127);
						expr(0);
						setState(128);
						match(RPAREN);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(141);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
								case 1:
								{
									_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(132);
									if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(133);
									((CompareContext)_localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
										((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(134);
									expr(8);
								}
								break;
								case 2:
								{
									_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(135);
									if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(136);
									((AddSubContext)_localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if ( !(_la==PLUS || _la==MINUS) ) {
										((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(137);
									expr(7);
								}
								break;
								case 3:
								{
									_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(138);
									if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(139);
									((MulDivContext)_localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if ( !(_la==MULT || _la==DIV) ) {
										((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(140);
									expr(6);
								}
								break;
							}
						}
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 13:
				return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 7);
			case 1:
				return precpred(_ctx, 6);
			case 2:
				return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
			"\u0004\u0001\u001e\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
					"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
					"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
					"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
					"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0003\u0000\u001e\b\u0000"+
					"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001#\b\u0001\u000b\u0001"+
					"\f\u0001$\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0003\u0001"+
					"\u0003\u0001\u0003\u0003\u0003.\b\u0003\u0001\u0004\u0001\u0004\u0001"+
					"\u0004\u0001\u0004\u0003\u00044\b\u0004\u0001\u0005\u0001\u0005\u0001"+
					"\u0005\u0001\u0005\u0003\u0005:\b\u0005\u0001\u0005\u0001\u0005\u0001"+
					"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
					"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
					"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007[\b"+
					"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
					"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
					"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
					"\u0001\f\u0005\fv\b\f\n\f\f\fy\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
					"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0083\b\r\u0001\r\u0001\r\u0001\r\u0001"+
					"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u008e\b\r\n\r\f\r\u0091"+
					"\t\r\u0001\r\u0000\u0001\u001a\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
					"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0003\u0001\u0000\u0014\u0019"+
					"\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u0095\u0000\u001d\u0001\u0000"+
					"\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000"+
					"\u0000\u0006-\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n5\u0001"+
					"\u0000\u0000\u0000\fB\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000"+
					"\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000"+
					"\u0014i\u0001\u0000\u0000\u0000\u0016o\u0001\u0000\u0000\u0000\u0018r"+
					"\u0001\u0000\u0000\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c\u001e"+
					"\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001d\u001e"+
					"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005"+
					"\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!#\u0003\u0004\u0002"+
					"\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
					"\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000"+
					"&)\u0003\u0006\u0003\u0000\')\u0003\b\u0004\u0000(&\u0001\u0000\u0000"+
					"\u0000(\'\u0001\u0000\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*.\u0003"+
					"\u0012\t\u0000+.\u0003\u0014\n\u0000,.\u0003\u0016\u000b\u0000-*\u0001"+
					"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000"+
					".\u0007\u0001\u0000\u0000\u0000/4\u0003\n\u0005\u000004\u0003\f\u0006"+
					"\u000014\u0003\u000e\u0007\u000024\u0003\u0010\b\u00003/\u0001\u0000\u0000"+
					"\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000"+
					"\u0000\u00004\t\u0001\u0000\u0000\u000056\u0005\u0003\u0000\u000067\u0005"+
					"\u001c\u0000\u000079\u0005\u000f\u0000\u00008:\u0003\u0018\f\u000098\u0001"+
					"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
					";<\u0005\u0010\u0000\u0000<=\u0005\u0011\u0000\u0000=>\u0005\u0001\u0000"+
					"\u0000>?\u0005\u001d\u0000\u0000?@\u0003\u0002\u0001\u0000@A\u0005\u001e"+
					"\u0000\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005\u0006\u0000\u0000"+
					"CD\u0005\u001c\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0005\u001c\u0000"+
					"\u0000FG\u0005\u0011\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0005\u001d"+
					"\u0000\u0000IJ\u0003\u0002\u0001\u0000JK\u0005\u001e\u0000\u0000K\r\u0001"+
					"\u0000\u0000\u0000LM\u0005\u0004\u0000\u0000MN\u0003\u001a\r\u0000NO\u0005"+
					"\u0011\u0000\u0000OP\u0005\u0001\u0000\u0000PQ\u0005\u001d\u0000\u0000"+
					"QR\u0003\u0002\u0001\u0000RZ\u0005\u001e\u0000\u0000ST\u0005\u0005\u0000"+
					"\u0000TU\u0005\u0011\u0000\u0000UV\u0005\u0001\u0000\u0000VW\u0005\u001d"+
					"\u0000\u0000WX\u0003\u0002\u0001\u0000XY\u0005\u001e\u0000\u0000Y[\u0001"+
					"\u0000\u0000\u0000ZS\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
					"[\u000f\u0001\u0000\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0003\u001a\r"+
					"\u0000^_\u0005\u0011\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u0005\u001d"+
					"\u0000\u0000ab\u0003\u0002\u0001\u0000bc\u0005\u001e\u0000\u0000c\u0011"+
					"\u0001\u0000\u0000\u0000de\u0005\u001c\u0000\u0000ef\u0005\n\u0000\u0000"+
					"fg\u0003\u001a\r\u0000gh\u0005\u0001\u0000\u0000h\u0013\u0001\u0000\u0000"+
					"\u0000ij\u0005\t\u0000\u0000jk\u0005\u000f\u0000\u0000kl\u0003\u001a\r"+
					"\u0000lm\u0005\u0010\u0000\u0000mn\u0005\u0001\u0000\u0000n\u0015\u0001"+
					"\u0000\u0000\u0000op\u0003\u001a\r\u0000pq\u0005\u0001\u0000\u0000q\u0017"+
					"\u0001\u0000\u0000\u0000rw\u0005\u001c\u0000\u0000st\u0005\u0012\u0000"+
					"\u0000tv\u0005\u001c\u0000\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000"+
					"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0019"+
					"\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0006\r\uffff\uffff"+
					"\u0000{\u0083\u0005\u001a\u0000\u0000|\u0083\u0005\u001b\u0000\u0000}"+
					"\u0083\u0005\u001c\u0000\u0000~\u007f\u0005\u000f\u0000\u0000\u007f\u0080"+
					"\u0003\u001a\r\u0000\u0080\u0081\u0005\u0010\u0000\u0000\u0081\u0083\u0001"+
					"\u0000\u0000\u0000\u0082z\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000"+
					"\u0000\u0082}\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083"+
					"\u008f\u0001\u0000\u0000\u0000\u0084\u0085\n\u0007\u0000\u0000\u0085\u0086"+
					"\u0007\u0000\u0000\u0000\u0086\u008e\u0003\u001a\r\b\u0087\u0088\n\u0006"+
					"\u0000\u0000\u0088\u0089\u0007\u0001\u0000\u0000\u0089\u008e\u0003\u001a"+
					"\r\u0007\u008a\u008b\n\u0005\u0000\u0000\u008b\u008c\u0007\u0002\u0000"+
					"\u0000\u008c\u008e\u0003\u001a\r\u0006\u008d\u0084\u0001\u0000\u0000\u0000"+
					"\u008d\u0087\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000"+
					"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
					"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u001b\u0001\u0000\u0000\u0000"+
					"\u0091\u008f\u0001\u0000\u0000\u0000\u000b\u001d$(-39Zw\u0082\u008d\u008f";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}