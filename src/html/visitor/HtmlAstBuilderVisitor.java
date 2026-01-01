package html.visitor;

import html.ast.html.*;
import html.ast.jinja.*;
import html.grammars.HtmlParser;
import html.grammars.HtmlParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlAstBuilderVisitor extends HtmlParserBaseVisitor<HtmlAstNode> {

    // ===============================
    // PROGRAM
    // ===============================
    @Override
    public HtmlAstNode visitHtml_program(HtmlParser.Html_programContext ctx) {
        List<HtmlAstNode> items = new ArrayList<>();

        for (HtmlParser.Html_itemContext itemCtx : ctx.html_item()) {
            HtmlAstNode node = visit(itemCtx);
            if (node != null) {
                items.add(node);
            }
        }

        return new HtmlProgramNode(items);
    }



    // ===============================
    // HTML TEXT
    // ===============================
    @Override
    public HtmlAstNode visitHtml_text(HtmlParser.Html_textContext ctx) {
        return new HtmlTextNode(ctx.getText());
    }

    // ===============================
    // HTML TAG
    // ===============================
    @Override
    public HtmlAstNode visitHtml_tag(HtmlParser.Html_tagContext ctx) {
        String tagName = ctx.HTML_OPEN_TAG().getText()
                .replace("<", "")
                .replace(">", "");

        List<HtmlAstNode> children = new ArrayList<>();
        for (HtmlParser.Html_itemContext item : ctx.html_item()) {
            HtmlAstNode node = visit(item);
            if (node != null) children.add(node);
        }

        return new HtmlTagNode(tagName, new ArrayList<>(), children);
    }

    // ===============================
    // {{ JINJA VARIABLE }}
    // ===============================
    @Override
    public HtmlAstNode visitJinja_block(HtmlParser.Jinja_blockContext ctx) {

        // {{ user.name }}
        if (ctx.jinja_var_expr() != null) {
            return new JinjaVariableNode(ctx.jinja_var_expr().getText());
        }

        // {% for / if %}
        return visit(ctx.jinja_stmt());
    }

    // ===============================
    // JINJA STATEMENTS
    // ===============================
    @Override
    public HtmlAstNode visitJinjaFor(HtmlParser.JinjaForContext ctx) {
        String variable = ctx.JINJA_BLOCK_NAME().getText();
        String iterable = ctx.jinja_block_expr().getText();
        return new JinjaForNode(variable, iterable, new ArrayList<>());
    }

    @Override
    public HtmlAstNode visitJinjaIf(HtmlParser.JinjaIfContext ctx) {
        String condition = ctx.jinja_block_expr().getText();
        return new JinjaIfNode(condition, new ArrayList<>());
    }

    @Override
    public HtmlAstNode visitJinjaEndFor(HtmlParser.JinjaEndForContext ctx) {
        return new JinjaEndNode("endfor");
    }

    @Override
    public HtmlAstNode visitJinjaEndIf(HtmlParser.JinjaEndIfContext ctx) {
        return new JinjaEndNode("endif");
    }
}
