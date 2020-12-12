// Generated from /home/juli/Documents/Maestria2dot0/Temas_Avanzados_en_Lenguajes/Tasks/Autom2c/grammar/Autom2c.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Autom2cParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TAG=11, ATSGN=12, STATE=13, EVENT=14, ID=15, END=16, COMMENT=17, 
		LINE_COMMENT=18, WS=19;
	public static final int
		RULE_automata = 0, RULE_state_set = 1, RULE_event_set = 2, RULE_event = 3, 
		RULE_state = 4, RULE_autonm = 5, RULE_selfloop = 6, RULE_transition = 7, 
		RULE_transitions = 8, RULE_actions = 9, RULE_action = 10, RULE_prints = 11, 
		RULE_print = 12, RULE_tests = 13, RULE_test = 14, RULE_testnm = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"automata", "state_set", "event_set", "event", "state", "autonm", "selfloop", 
			"transition", "transitions", "actions", "action", "prints", "print", 
			"tests", "test", "testnm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'loop'", "'('", "')'", "'from'", "'to'", 
			"'print'", "','", "'Automata'", "'@'", "'estado'", "'evento'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TAG", 
			"ATSGN", "STATE", "EVENT", "ID", "END", "COMMENT", "LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Autom2c.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Autom2cParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AutomataContext extends ParserRuleContext {
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public List<AutonmContext> autonm() {
			return getRuleContexts(AutonmContext.class);
		}
		public AutonmContext autonm(int i) {
			return getRuleContext(AutonmContext.class,i);
		}
		public List<State_setContext> state_set() {
			return getRuleContexts(State_setContext.class);
		}
		public State_setContext state_set(int i) {
			return getRuleContext(State_setContext.class,i);
		}
		public List<Event_setContext> event_set() {
			return getRuleContexts(Event_setContext.class);
		}
		public Event_setContext event_set(int i) {
			return getRuleContext(Event_setContext.class,i);
		}
		public List<TransitionsContext> transitions() {
			return getRuleContexts(TransitionsContext.class);
		}
		public TransitionsContext transitions(int i) {
			return getRuleContext(TransitionsContext.class,i);
		}
		public AutomataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterAutomata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitAutomata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitAutomata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomataContext automata() throws RecognitionException {
		AutomataContext _localctx = new AutomataContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_automata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				autonm();
				setState(33);
				match(T__0);
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					state_set();
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STATE );
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39);
					event_set();
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EVENT );
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44);
					transitions();
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 || _la==T__6 );
				setState(49);
				match(T__1);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAG );
			setState(55);
			actions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class State_setContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public State_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterState_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitState_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitState_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_setContext state_set() throws RecognitionException {
		State_setContext _localctx = new State_setContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state_set);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(57);
					state();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_setContext extends ParserRuleContext {
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public Event_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterEvent_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitEvent_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitEvent_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_setContext event_set() throws RecognitionException {
		Event_setContext _localctx = new Event_setContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_event_set);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
					event();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(Autom2cParser.EVENT, 0); }
		public TerminalNode ID() { return getToken(Autom2cParser.ID, 0); }
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(EVENT);
			setState(68);
			match(ID);
			setState(69);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(Autom2cParser.STATE, 0); }
		public TerminalNode ID() { return getToken(Autom2cParser.ID, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(STATE);
			setState(72);
			match(ID);
			setState(73);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutonmContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(Autom2cParser.TAG, 0); }
		public TerminalNode ATSGN() { return getToken(Autom2cParser.ATSGN, 0); }
		public TerminalNode ID() { return getToken(Autom2cParser.ID, 0); }
		public AutonmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autonm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterAutonm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitAutonm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitAutonm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutonmContext autonm() throws RecognitionException {
		AutonmContext _localctx = new AutonmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_autonm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TAG);
			setState(76);
			match(ATSGN);
			setState(77);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfloopContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Autom2cParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Autom2cParser.ID, i);
		}
		public SelfloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterSelfloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitSelfloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitSelfloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfloopContext selfloop() throws RecognitionException {
		SelfloopContext _localctx = new SelfloopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selfloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__3);
			setState(80);
			match(ID);
			setState(81);
			match(T__4);
			setState(82);
			match(ID);
			setState(83);
			match(T__5);
			setState(84);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Autom2cParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Autom2cParser.ID, i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transition);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(86);
				match(T__6);
				setState(87);
				match(ID);
				setState(88);
				match(T__4);
				setState(89);
				match(ID);
				setState(90);
				match(T__5);
				setState(91);
				match(T__7);
				setState(92);
				match(ID);
				setState(93);
				match(T__2);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(94);
				match(T__3);
				setState(95);
				match(ID);
				setState(96);
				match(T__4);
				setState(97);
				match(ID);
				setState(98);
				match(T__5);
				setState(99);
				match(T__2);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionsContext extends ParserRuleContext {
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterTransitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitTransitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitTransitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(102);
					transition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionsContext extends ParserRuleContext {
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				action();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 || _la==ATSGN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public PrintsContext prints() {
			return getRuleContext(PrintsContext.class,0);
		}
		public TestsContext tests() {
			return getRuleContext(TestsContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_action);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				prints();
				}
				break;
			case ATSGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				tests();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintsContext extends ParserRuleContext {
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public PrintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterPrints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitPrints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitPrints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintsContext prints() throws RecognitionException {
		PrintsContext _localctx = new PrintsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(116);
					print();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(119); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Autom2cParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__8);
			setState(122);
			match(T__4);
			setState(123);
			match(ID);
			setState(124);
			match(T__5);
			setState(125);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestsContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TestsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tests; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterTests(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitTests(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitTests(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestsContext tests() throws RecognitionException {
		TestsContext _localctx = new TestsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tests);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(127);
					test();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestContext extends ParserRuleContext {
		public TestnmContext testnm() {
			return getRuleContext(TestnmContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Autom2cParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Autom2cParser.ID, i);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			testnm();
			setState(133);
			match(T__4);
			setState(134);
			match(ID);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(135);
				match(T__9);
				setState(136);
				match(ID);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(T__5);
			setState(143);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestnmContext extends ParserRuleContext {
		public TerminalNode ATSGN() { return getToken(Autom2cParser.ATSGN, 0); }
		public TerminalNode ID() { return getToken(Autom2cParser.ID, 0); }
		public TestnmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testnm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).enterTestnm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Autom2cListener ) ((Autom2cListener)listener).exitTestnm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Autom2cVisitor ) return ((Autom2cVisitor<? extends T>)visitor).visitTestnm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestnmContext testnm() throws RecognitionException {
		TestnmContext _localctx = new TestnmContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_testnm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ATSGN);
			setState(146);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\6\2+\n\2\r\2\16\2,\3\2\6\2\60\n\2\r\2\16"+
		"\2\61\3\2\3\2\6\2\66\n\2\r\2\16\2\67\3\2\3\2\3\3\6\3=\n\3\r\3\16\3>\3"+
		"\4\6\4B\n\4\r\4\16\4C\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\tg\n\t\3\n\6\nj\n\n\r\n\16\nk\3\13\6\13o\n\13\r\13\16"+
		"\13p\3\f\3\f\5\fu\n\f\3\r\6\rx\n\r\r\r\16\ry\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\6\17\u0083\n\17\r\17\16\17\u0084\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u008c\n\20\f\20\16\20\u008f\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u0093\2\65\3"+
		"\2\2\2\4<\3\2\2\2\6A\3\2\2\2\bE\3\2\2\2\nI\3\2\2\2\fM\3\2\2\2\16Q\3\2"+
		"\2\2\20f\3\2\2\2\22i\3\2\2\2\24n\3\2\2\2\26t\3\2\2\2\30w\3\2\2\2\32{\3"+
		"\2\2\2\34\u0082\3\2\2\2\36\u0086\3\2\2\2 \u0093\3\2\2\2\"#\5\f\7\2#%\7"+
		"\3\2\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2"+
		")+\5\6\4\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5\22"+
		"\n\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63"+
		"\64\7\4\2\2\64\66\3\2\2\2\65\"\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\67"+
		"8\3\2\2\289\3\2\2\29:\5\24\13\2:\3\3\2\2\2;=\5\n\6\2<;\3\2\2\2=>\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?\5\3\2\2\2@B\5\b\5\2A@\3\2\2\2BC\3\2\2\2CA\3\2"+
		"\2\2CD\3\2\2\2D\7\3\2\2\2EF\7\20\2\2FG\7\21\2\2GH\7\5\2\2H\t\3\2\2\2I"+
		"J\7\17\2\2JK\7\21\2\2KL\7\5\2\2L\13\3\2\2\2MN\7\r\2\2NO\7\16\2\2OP\7\21"+
		"\2\2P\r\3\2\2\2QR\7\6\2\2RS\7\21\2\2ST\7\7\2\2TU\7\21\2\2UV\7\b\2\2VW"+
		"\7\5\2\2W\17\3\2\2\2XY\7\t\2\2YZ\7\21\2\2Z[\7\7\2\2[\\\7\21\2\2\\]\7\b"+
		"\2\2]^\7\n\2\2^_\7\21\2\2_g\7\5\2\2`a\7\6\2\2ab\7\21\2\2bc\7\7\2\2cd\7"+
		"\21\2\2de\7\b\2\2eg\7\5\2\2fX\3\2\2\2f`\3\2\2\2g\21\3\2\2\2hj\5\20\t\2"+
		"ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\23\3\2\2\2mo\5\26\f\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\25\3\2\2\2ru\5\30\r\2su\5\34\17\2"+
		"tr\3\2\2\2ts\3\2\2\2u\27\3\2\2\2vx\5\32\16\2wv\3\2\2\2xy\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z\31\3\2\2\2{|\7\13\2\2|}\7\7\2\2}~\7\21\2\2~\177\7\b\2"+
		"\2\177\u0080\7\5\2\2\u0080\33\3\2\2\2\u0081\u0083\5\36\20\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\35\3\2\2\2\u0086\u0087\5 \21\2\u0087\u0088\7\7\2\2\u0088\u008d\7\21\2"+
		"\2\u0089\u008a\7\f\2\2\u008a\u008c\7\21\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\b\2\2\u0091\u0092\7\5\2\2\u0092"+
		"\37\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0095\7\21\2\2\u0095!\3\2\2\2\17"+
		"\',\61\67>Cfkpty\u0084\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}