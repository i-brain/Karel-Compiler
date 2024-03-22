// Generated from /Users/ibrain/Project Lab 1/karel/src/statemodel/StateModel.g4 by ANTLR 4.13.1
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(StateModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(StateModelParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(StateModelParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#frontIsClear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrontIsClear(StateModelParser.FrontIsClearContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#leftIsClear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftIsClear(StateModelParser.LeftIsClearContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#rightIsClear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightIsClear(StateModelParser.RightIsClearContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#facingNorth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacingNorth(StateModelParser.FacingNorthContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#facingSouth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacingSouth(StateModelParser.FacingSouthContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#facingEast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacingEast(StateModelParser.FacingEastContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#facingWest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacingWest(StateModelParser.FacingWestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#beeperPresent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeeperPresent(StateModelParser.BeeperPresentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#noBeepersPresent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoBeepersPresent(StateModelParser.NoBeepersPresentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StateModelParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(StateModelParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(StateModelParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(StateModelParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#turnLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnLeft(StateModelParser.TurnLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#turnRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnRight(StateModelParser.TurnRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#pickBeeper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickBeeper(StateModelParser.PickBeeperContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#putBeeper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutBeeper(StateModelParser.PutBeeperContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#paint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaint(StateModelParser.PaintContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(StateModelParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(StateModelParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(StateModelParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#functionTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTarget(StateModelParser.FunctionTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(StateModelParser.ConditionContext ctx);
}