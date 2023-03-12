// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link arithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface arithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#file_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_(arithmeticParser.File_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code plus_min}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_min(arithmeticParser.Plus_minContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(arithmeticParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plmn_atom}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlmn_atom(arithmeticParser.Plmn_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(arithmeticParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul_div}
	 * labeled alternative in {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div(arithmeticParser.Mul_divContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(arithmeticParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(arithmeticParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(arithmeticParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(arithmeticParser.RelopContext ctx);
}