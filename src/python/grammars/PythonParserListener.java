// Generated from C:/Users/mazen/Desktop/compiler1/src/python/grammars/PythonParser.g4 by ANTLR 4.13.2
package python.grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PythonParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PythonParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefNode}
	 * labeled alternative in {@link PythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefNode(PythonParser.FunctionDefNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefNode}
	 * labeled alternative in {@link PythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefNode(PythonParser.FunctionDefNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatementNode}
	 * labeled alternative in {@link PythonParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNode(PythonParser.ForStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatementNode}
	 * labeled alternative in {@link PythonParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNode(PythonParser.ForStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatementNode}
	 * labeled alternative in {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementNode(PythonParser.IfStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatementNode}
	 * labeled alternative in {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementNode(PythonParser.IfStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatementNode}
	 * labeled alternative in {@link PythonParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNode(PythonParser.WhileStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatementNode}
	 * labeled alternative in {@link PythonParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNode(PythonParser.WhileStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentNode}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentNode(PythonParser.AssignmentNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentNode}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentNode(PythonParser.AssignmentNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintNode}
	 * labeled alternative in {@link PythonParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintNode(PythonParser.PrintNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintNode}
	 * labeled alternative in {@link PythonParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintNode(PythonParser.PrintNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStatementNode}
	 * labeled alternative in {@link PythonParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStatementNode(PythonParser.ExprStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStatementNode}
	 * labeled alternative in {@link PythonParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStatementNode(PythonParser.ExprStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterListNode}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParameterListNode(PythonParser.ParameterListNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterListNode}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParameterListNode(PythonParser.ParameterListNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PythonParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PythonParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PythonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PythonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(PythonParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(PythonParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(PythonParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(PythonParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesized}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized(PythonParser.ParenthesizedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesized}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized(PythonParser.ParenthesizedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(PythonParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(PythonParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(PythonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(PythonParser.StringContext ctx);
}