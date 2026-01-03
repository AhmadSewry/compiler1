package python.visitor;

import python.ast.*;
import python.ast.expressions.*;
import python.ast.statementNode.*;
import python.grammars.PythonParser;
import python.grammars.PythonParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class PythonAstBuilderVisitor extends PythonParserBaseVisitor<PythonAstNode> {

    // ================= PROGRAM =================
    @Override
    public PythonAstNode visitProgram(PythonParser.ProgramContext ctx) {
        List<PythonAstNode> statements = new ArrayList<>();
        if (ctx.statements() != null) {
            for (PythonParser.StatementContext st : ctx.statements().statement()) {
                statements.add(visit(st));
            }
        }
        return new ProgramNode(statements);
    }

    // ================= STATEMENTS SIMPLE =================
    @Override
    public PythonAstNode visitAssignmentNode(PythonParser.AssignmentNodeContext ctx) {
        return new AssignmentNode(
                new IdentifierNode(ctx.IDENTIFIER().getText()),
                (ExpressionNode) visit(ctx.expr()),
                ctx.start.getLine(),                  // line
                ctx.start.getCharPositionInLine()    // column
        );
    }

    @Override
    public PythonAstNode visitExprStatementNode(PythonParser.ExprStatementNodeContext ctx) {
        return new ExprStatementNode(
                (ExpressionNode) visit(ctx.expr()),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public PythonAstNode visitPrintNode(PythonParser.PrintNodeContext ctx) {
        return new PrintNode(
                (ExpressionNode) visit(ctx.expr()),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    // ================= STATEMENTS COMPOUND =================
    @Override
    public PythonAstNode visitFunctionDefNode(PythonParser.FunctionDefNodeContext ctx) {
        List<String> params = new ArrayList<>();
        if (ctx.paramList() != null) {
            ctx.paramList().IDENTIFIER().forEach(id -> params.add(id.getText()));
        }

        List<StatementNode> body = new ArrayList<>();
        for (PythonParser.StatementContext st : ctx.statements().statement()) {
            body.add((StatementNode) visit(st));
        }

        return new FunctionDefNode(
                ctx.IDENTIFIER().getText(),
                params,
                body,
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        ) {};
    }

    @Override
    public PythonAstNode visitIfStatementNode(PythonParser.IfStatementNodeContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expr());

        List<StatementNode> thenBody = new ArrayList<>();
        for (PythonParser.StatementContext st : ctx.statements(0).statement()) {
            thenBody.add((StatementNode) visit(st));
        }

        List<StatementNode> elseBody = null;
        if (ctx.statements().size() > 1) {
            elseBody = new ArrayList<>();
            for (PythonParser.StatementContext st : ctx.statements(1).statement()) {
                elseBody.add((StatementNode) visit(st));
            }
        }

        return new IfStatementNode(condition, thenBody, elseBody,
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        ) {};
    }

    @Override
    public PythonAstNode visitWhileStatementNode(PythonParser.WhileStatementNodeContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expr());

        List<StatementNode> body = new ArrayList<>();
        for (PythonParser.StatementContext st : ctx.statements().statement()) {
            body.add((StatementNode) visit(st));
        }

        return new WhileStatementNode(condition, body,
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public PythonAstNode visitForStatementNode(PythonParser.ForStatementNodeContext ctx) {
        List<StatementNode> body = new ArrayList<>();
        for (PythonParser.StatementContext st : ctx.statements().statement()) {
            body.add((StatementNode) visit(st));
        }

        return new ForStatementNode(
                ctx.IDENTIFIER(0).getText(),   // iterator
                ctx.IDENTIFIER(1).getText(),   // iterable
                body,
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    // ================= EXPRESSIONS =================
    @Override
    public PythonAstNode visitCompare(PythonParser.CompareContext ctx) {
        return new BinaryExprNode(
                ctx.op.getText(),
                (ExpressionNode) visit(ctx.expr(0)),
                (ExpressionNode) visit(ctx.expr(1))
        );
    }

    @Override
    public PythonAstNode visitAddSub(PythonParser.AddSubContext ctx) {
        return new BinaryExprNode(
                ctx.op.getText(),
                (ExpressionNode) visit(ctx.expr(0)),
                (ExpressionNode) visit(ctx.expr(1))
        );
    }

    @Override
    public PythonAstNode visitMulDiv(PythonParser.MulDivContext ctx) {
        return new BinaryExprNode(
                ctx.op.getText(),
                (ExpressionNode) visit(ctx.expr(0)),
                (ExpressionNode) visit(ctx.expr(1))
        );
    }

    @Override
    public PythonAstNode visitNumber(PythonParser.NumberContext ctx) {
        return new LiteralNode(ctx.NUMBER().getText());
    }

    @Override
    public PythonAstNode visitString(PythonParser.StringContext ctx) {
        return new LiteralNode(ctx.STRING().getText());
    }

    @Override
    public PythonAstNode visitIdentifier(PythonParser.IdentifierContext ctx) {
        return new IdentifierNode(ctx.IDENTIFIER().getText());
    }
}
