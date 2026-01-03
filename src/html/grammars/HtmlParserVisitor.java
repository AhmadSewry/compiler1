// Generated from C:/Users/mazen/Desktop/compiler1/src/html/grammars/HtmlParser.g4 by ANTLR 4.13.2
package html.grammars;



import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlParser#html_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_program(HtmlParser.Html_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#html_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_item(HtmlParser.Html_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#html_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_text(HtmlParser.Html_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#html_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_tag(HtmlParser.Html_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#jinja_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_block(HtmlParser.Jinja_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#jinja_var_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_var_expr(HtmlParser.Jinja_var_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#jinja_block_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_block_expr(HtmlParser.Jinja_block_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#jinja_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_name(HtmlParser.Jinja_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaFor}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFor(HtmlParser.JinjaForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaEndFor}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaEndFor(HtmlParser.JinjaEndForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIf}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIf(HtmlParser.JinjaIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaEndIf}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaEndIf(HtmlParser.JinjaEndIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#style_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle_block(HtmlParser.Style_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#css_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_rule(HtmlParser.Css_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#css_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_selector(HtmlParser.Css_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#css_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_decl(HtmlParser.Css_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#css_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_value(HtmlParser.Css_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#css_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_atom(HtmlParser.Css_atomContext ctx);
}