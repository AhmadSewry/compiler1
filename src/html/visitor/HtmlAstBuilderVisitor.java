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
        List<HtmlAstNode> children = new ArrayList<>();

        for (int i = 0; i < ctx.html_item().size(); i++) {
            HtmlParser.Html_itemContext itemCtx = ctx.html_item(i);
            HtmlAstNode node = visit(itemCtx);

            // إذا كان JinjaFor
            if (node instanceof JinjaForNode forNode) {
                List<HtmlAstNode> body = new ArrayList<>();
                i++; // ابدأ من العنصر التالي
                while (i < ctx.html_item().size()) {
                    HtmlParser.Html_itemContext nextItem = ctx.html_item(i);
                    HtmlAstNode childNode = visit(nextItem);

                    if (childNode instanceof JinjaEndNode endNode && endNode.type.equals("endfor")) {
                        break; // نهاية الـ body
                    }
                    body.add(childNode);
                    i++;
                }
                forNode.body = body;
                children.add(forNode);
            }
            // إذا كان JinjaIf
            else if (node instanceof JinjaIfNode ifNode) {
                List<HtmlAstNode> body = new ArrayList<>();
                i++;
                while (i < ctx.html_item().size()) {
                    HtmlParser.Html_itemContext nextItem = ctx.html_item(i);
                    HtmlAstNode childNode = visit(nextItem);

                    if (childNode instanceof JinjaEndNode endNode && endNode.type.equals("endif")) {
                        break; // نهاية الـ body
                    }
                    body.add(childNode);
                    i++;
                }
                ifNode.body = body;
                children.add(ifNode);
            }
            else {
                children.add(node);
            }
        }

        return new HtmlProgramNode(children);
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

        // متوافق مع constructor عندك (ثالث باراميتر فارغ)
        return new HtmlTagNode(tagName, children, null);
    }

    // ===============================
    // JINJA BLOCK ({{ ... }} أو {% ... %})
    // ===============================
    @Override
    public HtmlAstNode visitJinja_block(HtmlParser.Jinja_blockContext ctx) {
        // {{ variable }}
        if (ctx.jinja_var_expr() != null) {
            return new JinjaVariableNode(ctx.jinja_var_expr().getText());
        }

        // {% for / if %}
        return visit(ctx.jinja_stmt());
    }

    // ===============================
    // JINJA FOR
    // ===============================
    @Override
    public HtmlAstNode visitJinjaFor(HtmlParser.JinjaForContext ctx) {
        String variable = ctx.JINJA_BLOCK_NAME().getText();
        String iterable = ctx.jinja_block_expr().getText();

        // body سيتم ملؤه لاحقاً في visitHtml_program
        return new JinjaForNode(variable, iterable, new ArrayList<>());
    }

    // ===============================
    // JINJA IF
    // ===============================
    @Override
    public HtmlAstNode visitJinjaIf(HtmlParser.JinjaIfContext ctx) {
        String condition = ctx.jinja_block_expr().getText();

        // body سيتم ملؤه لاحقاً في visitHtml_program
        return new JinjaIfNode(condition, new ArrayList<>());
    }

    // ===============================
    // JINJA END
    // ===============================
    @Override
    public HtmlAstNode visitJinjaEndFor(HtmlParser.JinjaEndForContext ctx) {
        return new JinjaEndNode("endfor");
    }

    @Override
    public HtmlAstNode visitJinjaEndIf(HtmlParser.JinjaEndIfContext ctx) {
        return new JinjaEndNode("endif");
    }
}