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
	 * Enter a parse tree produced by the {@code if_statment}
	 * labeled alternative in {@link arithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_statment(arithmeticParser.If_statmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_statment}
	 * labeled alternative in {@link arithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_statment(arithmeticParser.If_statmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link arithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(arithmeticParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link arithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(arithmeticParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link arithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(arithmeticParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link arithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(arithmeticParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link arithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(arithmeticParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link arithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(arithmeticParser.BlankContext ctx);
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
	 * Enter a parse tree produced by the {@code const}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConst(arithmeticParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConst(arithmeticParser.ConstContext ctx);
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
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(arithmeticParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(arithmeticParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(arithmeticParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(arithmeticParser.IntContext ctx);
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
	 * Enter a parse tree produced by {@link arithmeticParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(arithmeticParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(arithmeticParser.ConstantContext ctx);
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