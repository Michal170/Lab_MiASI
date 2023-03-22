// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calcParser#file_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_(calcParser.File_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_stat}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_stat(calcParser.Expression_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(calcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(calcParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(calcParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_loop}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(calcParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_stat}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(calcParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(calcParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nawias}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNawias(calcParser.NawiasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(calcParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(calcParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparision}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparision(calcParser.ComparisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(calcParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(calcParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stala}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStala(calcParser.StalaContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(calcParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(calcParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(calcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(calcParser.RelopContext ctx);
}