// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#file_}.
	 * @param ctx the parse tree
	 */
	void enterFile_(calcParser.File_Context ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#file_}.
	 * @param ctx the parse tree
	 */
	void exitFile_(calcParser.File_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_stat}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpression_stat(calcParser.Expression_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_stat}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpression_stat(calcParser.Expression_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(calcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(calcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(calcParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(calcParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(calcParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(calcParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(calcParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(calcParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nawias}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNawias(calcParser.NawiasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nawias}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNawias(calcParser.NawiasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(calcParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(calcParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(calcParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(calcParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparision}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparision(calcParser.ComparisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparision}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparision(calcParser.ComparisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(calcParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(calcParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(calcParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(calcParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stala}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStala(calcParser.StalaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stala}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStala(calcParser.StalaContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(calcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(calcParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(calcParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(calcParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(calcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(calcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(calcParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(calcParser.RelopContext ctx);
}