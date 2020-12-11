// Generated from /home/juli/Documents/Maestria2dot0/Temas_Avanzados_en_Lenguajes/Tasks/Autom2c/grammar/Autom2c.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Autom2cParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Autom2cVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#automata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomata(Autom2cParser.AutomataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#state_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_set(Autom2cParser.State_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#event_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_set(Autom2cParser.Event_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(Autom2cParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(Autom2cParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#autonm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutonm(Autom2cParser.AutonmContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#selfloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfloop(Autom2cParser.SelfloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(Autom2cParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#transitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitions(Autom2cParser.TransitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActions(Autom2cParser.ActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#prints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrints(Autom2cParser.PrintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Autom2cParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#tests}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTests(Autom2cParser.TestsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Autom2cParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(Autom2cParser.TestContext ctx);
}