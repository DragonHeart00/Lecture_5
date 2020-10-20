// Generated from simpleCalc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(simpleCalcParser.MinusContext ctx);
}