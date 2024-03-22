// Generated from /Users/ibrain/Project Lab 1/karel/src/statemodel/StateModel.g4 by ANTLR 4.13.1
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateModelParser}.
 */
public interface StateModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(StateModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(StateModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(StateModelParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(StateModelParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(StateModelParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(StateModelParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#frontIsClear}.
	 * @param ctx the parse tree
	 */
	void enterFrontIsClear(StateModelParser.FrontIsClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#frontIsClear}.
	 * @param ctx the parse tree
	 */
	void exitFrontIsClear(StateModelParser.FrontIsClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#leftIsClear}.
	 * @param ctx the parse tree
	 */
	void enterLeftIsClear(StateModelParser.LeftIsClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#leftIsClear}.
	 * @param ctx the parse tree
	 */
	void exitLeftIsClear(StateModelParser.LeftIsClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#rightIsClear}.
	 * @param ctx the parse tree
	 */
	void enterRightIsClear(StateModelParser.RightIsClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#rightIsClear}.
	 * @param ctx the parse tree
	 */
	void exitRightIsClear(StateModelParser.RightIsClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#facingNorth}.
	 * @param ctx the parse tree
	 */
	void enterFacingNorth(StateModelParser.FacingNorthContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#facingNorth}.
	 * @param ctx the parse tree
	 */
	void exitFacingNorth(StateModelParser.FacingNorthContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#facingSouth}.
	 * @param ctx the parse tree
	 */
	void enterFacingSouth(StateModelParser.FacingSouthContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#facingSouth}.
	 * @param ctx the parse tree
	 */
	void exitFacingSouth(StateModelParser.FacingSouthContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#facingEast}.
	 * @param ctx the parse tree
	 */
	void enterFacingEast(StateModelParser.FacingEastContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#facingEast}.
	 * @param ctx the parse tree
	 */
	void exitFacingEast(StateModelParser.FacingEastContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#facingWest}.
	 * @param ctx the parse tree
	 */
	void enterFacingWest(StateModelParser.FacingWestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#facingWest}.
	 * @param ctx the parse tree
	 */
	void exitFacingWest(StateModelParser.FacingWestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#beeperPresent}.
	 * @param ctx the parse tree
	 */
	void enterBeeperPresent(StateModelParser.BeeperPresentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#beeperPresent}.
	 * @param ctx the parse tree
	 */
	void exitBeeperPresent(StateModelParser.BeeperPresentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#noBeepersPresent}.
	 * @param ctx the parse tree
	 */
	void enterNoBeepersPresent(StateModelParser.NoBeepersPresentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#noBeepersPresent}.
	 * @param ctx the parse tree
	 */
	void exitNoBeepersPresent(StateModelParser.NoBeepersPresentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StateModelParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StateModelParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(StateModelParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(StateModelParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(StateModelParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(StateModelParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(StateModelParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(StateModelParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#turnLeft}.
	 * @param ctx the parse tree
	 */
	void enterTurnLeft(StateModelParser.TurnLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#turnLeft}.
	 * @param ctx the parse tree
	 */
	void exitTurnLeft(StateModelParser.TurnLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#turnRight}.
	 * @param ctx the parse tree
	 */
	void enterTurnRight(StateModelParser.TurnRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#turnRight}.
	 * @param ctx the parse tree
	 */
	void exitTurnRight(StateModelParser.TurnRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#pickBeeper}.
	 * @param ctx the parse tree
	 */
	void enterPickBeeper(StateModelParser.PickBeeperContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#pickBeeper}.
	 * @param ctx the parse tree
	 */
	void exitPickBeeper(StateModelParser.PickBeeperContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#putBeeper}.
	 * @param ctx the parse tree
	 */
	void enterPutBeeper(StateModelParser.PutBeeperContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#putBeeper}.
	 * @param ctx the parse tree
	 */
	void exitPutBeeper(StateModelParser.PutBeeperContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#paint}.
	 * @param ctx the parse tree
	 */
	void enterPaint(StateModelParser.PaintContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#paint}.
	 * @param ctx the parse tree
	 */
	void exitPaint(StateModelParser.PaintContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(StateModelParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(StateModelParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(StateModelParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(StateModelParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(StateModelParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(StateModelParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#functionTarget}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTarget(StateModelParser.FunctionTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#functionTarget}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTarget(StateModelParser.FunctionTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(StateModelParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(StateModelParser.ConditionContext ctx);
}