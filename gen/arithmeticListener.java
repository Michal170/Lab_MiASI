// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link arithmeticParser}.
 */
public interface arithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#file_}.
	 * @param ctx the parse tree
	 */
	void enterFile_(arithmeticParser.File_Context ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#file_}.
	 * @param ctx the parse tree
	 */
	void exitFile_(arithmeticParser.File_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code plus_min}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus_min(arithmeticParser.Plus_minContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus_min}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus_min(arithmeticParser.Plus_minContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(arithmeticParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(arithmeticParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plmn_atom}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlmn_atom(arithmeticParser.Plmn_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plmn_atom}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlmn_atom(arithmeticParser.Plmn_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(arithmeticParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(arithmeticParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul_div}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul_div(arithmeticParser.Mul_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul_div}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul_div(arithmeticParser.Mul_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(arithmeticParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(arithmeticParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(arithmeticParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(arithmeticParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(arithmeticParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(arithmeticParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(arithmeticParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(arithmeticParser.RelopContext ctx);
}