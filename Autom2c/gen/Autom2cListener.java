// Generated from /home/juli/Documents/Maestria2dot0/Temas_Avanzados_en_Lenguajes/Tasks/Autom2c/grammar/Autom2c.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Autom2cParser}.
 */
public interface Autom2cListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#automata}.
	 * @param ctx the parse tree
	 */
	void enterAutomata(Autom2cParser.AutomataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#automata}.
	 * @param ctx the parse tree
	 */
	void exitAutomata(Autom2cParser.AutomataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#state_set}.
	 * @param ctx the parse tree
	 */
	void enterState_set(Autom2cParser.State_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#state_set}.
	 * @param ctx the parse tree
	 */
	void exitState_set(Autom2cParser.State_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#event_set}.
	 * @param ctx the parse tree
	 */
	void enterEvent_set(Autom2cParser.Event_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#event_set}.
	 * @param ctx the parse tree
	 */
	void exitEvent_set(Autom2cParser.Event_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(Autom2cParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(Autom2cParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(Autom2cParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(Autom2cParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#autonm}.
	 * @param ctx the parse tree
	 */
	void enterAutonm(Autom2cParser.AutonmContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#autonm}.
	 * @param ctx the parse tree
	 */
	void exitAutonm(Autom2cParser.AutonmContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#selfloop}.
	 * @param ctx the parse tree
	 */
	void enterSelfloop(Autom2cParser.SelfloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#selfloop}.
	 * @param ctx the parse tree
	 */
	void exitSelfloop(Autom2cParser.SelfloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(Autom2cParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(Autom2cParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(Autom2cParser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(Autom2cParser.TransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(Autom2cParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(Autom2cParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(Autom2cParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(Autom2cParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#prints}.
	 * @param ctx the parse tree
	 */
	void enterPrints(Autom2cParser.PrintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#prints}.
	 * @param ctx the parse tree
	 */
	void exitPrints(Autom2cParser.PrintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(Autom2cParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(Autom2cParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#tests}.
	 * @param ctx the parse tree
	 */
	void enterTests(Autom2cParser.TestsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#tests}.
	 * @param ctx the parse tree
	 */
	void exitTests(Autom2cParser.TestsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(Autom2cParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(Autom2cParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Autom2cParser#testnm}.
	 * @param ctx the parse tree
	 */
	void enterTestnm(Autom2cParser.TestnmContext ctx);
	/**
	 * Exit a parse tree produced by {@link Autom2cParser#testnm}.
	 * @param ctx the parse tree
	 */
	void exitTestnm(Autom2cParser.TestnmContext ctx);
}