// Generated from C:/Users/mazen/Desktop/compiler1/src/html/grammars/HtmlParser.g4 by ANTLR 4.13.2
package html.grammars;



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlParser}.
 */
public interface HtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_program}.
	 * @param ctx the parse tree
	 */
	void enterHtml_program(HtmlParser.Html_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_program}.
	 * @param ctx the parse tree
	 */
	void exitHtml_program(HtmlParser.Html_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_item}.
	 * @param ctx the parse tree
	 */
	void enterHtml_item(HtmlParser.Html_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_item}.
	 * @param ctx the parse tree
	 */
	void exitHtml_item(HtmlParser.Html_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_text}.
	 * @param ctx the parse tree
	 */
	void enterHtml_text(HtmlParser.Html_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_text}.
	 * @param ctx the parse tree
	 */
	void exitHtml_text(HtmlParser.Html_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_tag}.
	 * @param ctx the parse tree
	 */
	void enterHtml_tag(HtmlParser.Html_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_tag}.
	 * @param ctx the parse tree
	 */
	void exitHtml_tag(HtmlParser.Html_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#jinja_block}.
	 * @param ctx the parse tree
	 */
	void enterJinja_block(HtmlParser.Jinja_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#jinja_block}.
	 * @param ctx the parse tree
	 */
	void exitJinja_block(HtmlParser.Jinja_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#jinja_var_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinja_var_expr(HtmlParser.Jinja_var_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#jinja_var_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinja_var_expr(HtmlParser.Jinja_var_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#jinja_block_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinja_block_expr(HtmlParser.Jinja_block_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#jinja_block_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinja_block_expr(HtmlParser.Jinja_block_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#jinja_name}.
	 * @param ctx the parse tree
	 */
	void enterJinja_name(HtmlParser.Jinja_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#jinja_name}.
	 * @param ctx the parse tree
	 */
	void exitJinja_name(HtmlParser.Jinja_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaFor}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFor(HtmlParser.JinjaForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaFor}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFor(HtmlParser.JinjaForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaEndFor}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaEndFor(HtmlParser.JinjaEndForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaEndFor}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaEndFor(HtmlParser.JinjaEndForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIf}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIf(HtmlParser.JinjaIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIf}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIf(HtmlParser.JinjaIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaEndIf}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaEndIf(HtmlParser.JinjaEndIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaEndIf}
	 * labeled alternative in {@link HtmlParser#jinja_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaEndIf(HtmlParser.JinjaEndIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#style_block}.
	 * @param ctx the parse tree
	 */
	void enterStyle_block(HtmlParser.Style_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#style_block}.
	 * @param ctx the parse tree
	 */
	void exitStyle_block(HtmlParser.Style_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void enterCss_rule(HtmlParser.Css_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void exitCss_rule(HtmlParser.Css_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#css_selector}.
	 * @param ctx the parse tree
	 */
	void enterCss_selector(HtmlParser.Css_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#css_selector}.
	 * @param ctx the parse tree
	 */
	void exitCss_selector(HtmlParser.Css_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#css_decl}.
	 * @param ctx the parse tree
	 */
	void enterCss_decl(HtmlParser.Css_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#css_decl}.
	 * @param ctx the parse tree
	 */
	void exitCss_decl(HtmlParser.Css_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#css_value}.
	 * @param ctx the parse tree
	 */
	void enterCss_value(HtmlParser.Css_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#css_value}.
	 * @param ctx the parse tree
	 */
	void exitCss_value(HtmlParser.Css_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#css_atom}.
	 * @param ctx the parse tree
	 */
	void enterCss_atom(HtmlParser.Css_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#css_atom}.
	 * @param ctx the parse tree
	 */
	void exitCss_atom(HtmlParser.Css_atomContext ctx);
}