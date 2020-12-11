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
		RULE_transitions = 8, RULE_actions = 9, RULE_prints = 10, RULE_print = 11, 
		RULE_tests = 12, RULE_test = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"automata", "state_set", "event_set", "event", "state", "autonm", "selfloop", 
			"transition", "transitions", "actions", "prints", "print", "tests", "test"
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
		public List<AutonmContext> autonm() {
			return getRuleContexts(AutonmContext.class);
		}
		public AutonmContext autonm(int i) {
			return getRuleContext(AutonmContext.class,i);
		}
		public List<ActionsContext> actions() {
			return getRuleContexts(ActionsContext.class);
		}
		public ActionsContext actions(int i) {
			return getRuleContext(ActionsContext.class,i);
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				autonm();
				setState(29);
				match(T__0);
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(30);
					state_set();
					}
					}
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STATE );
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					event_set();
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EVENT );
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(40);
					transitions();
					}
					}
					setState(43); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 || _la==T__6 );
				setState(45);
				match(T__1);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAG );
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				actions();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << ATSGN) | (1L << END))) != 0) );
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
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					state();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
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
			setState(62); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(61);
					event();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(64); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(66);
			match(EVENT);
			setState(67);
			match(ID);
			setState(68);
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
			setState(70);
			match(STATE);
			setState(71);
			match(ID);
			setState(72);
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
			setState(74);
			match(TAG);
			setState(75);
			match(ATSGN);
			setState(76);
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
			setState(78);
			match(T__3);
			setState(79);
			match(ID);
			setState(80);
			match(T__4);
			setState(81);
			match(ID);
			setState(82);
			match(T__5);
			setState(83);
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(85);
				match(T__6);
				setState(86);
				match(ID);
				setState(87);
				match(T__4);
				setState(88);
				match(ID);
				setState(89);
				match(T__5);
				setState(90);
				match(T__7);
				setState(91);
				match(ID);
				setState(92);
				match(T__2);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(93);
				match(T__3);
				setState(94);
				match(ID);
				setState(95);
				match(T__4);
				setState(96);
				match(ID);
				setState(97);
				match(T__5);
				setState(98);
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
			setState(102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(101);
					transition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public PrintsContext prints() {
			return getRuleContext(PrintsContext.class,0);
		}
		public TestsContext tests() {
			return getRuleContext(TestsContext.class,0);
		}
		public TerminalNode END() { return getToken(Autom2cParser.END, 0); }
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
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				prints();
				}
				break;
			case ATSGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				tests();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(END);
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
		enterRule(_localctx, 20, RULE_prints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(111);
					print();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114); 
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
		enterRule(_localctx, 22, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__8);
			setState(117);
			match(T__4);
			setState(118);
			match(ID);
			setState(119);
			match(T__5);
			setState(120);
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
		enterRule(_localctx, 24, RULE_tests);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(122);
					test();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125); 
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
		public TerminalNode ATSGN() { return getToken(Autom2cParser.ATSGN, 0); }
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
		enterRule(_localctx, 26, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ATSGN);
			setState(128);
			match(ID);
			setState(129);
			match(T__4);
			setState(130);
			match(ID);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(131);
				match(T__9);
				setState(132);
				match(ID);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__5);
			setState(139);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\2\6\2\'\n\2\r\2\16\2(\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\6\2\62\n\2"+
		"\r\2\16\2\63\3\2\6\2\67\n\2\r\2\16\28\3\3\6\3<\n\3\r\3\16\3=\3\4\6\4A"+
		"\n\4\r\4\16\4B\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\tf\n\t\3\n\6\ni\n\n\r\n\16\nj\3\13\3\13\3\13\5\13p\n\13\3\f\6"+
		"\fs\n\f\r\f\16\ft\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16~\n\16\r\16\16\16\177"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0088\n\17\f\17\16\17\u008b\13\17"+
		"\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2"+
		"\u008f\2\61\3\2\2\2\4;\3\2\2\2\6@\3\2\2\2\bD\3\2\2\2\nH\3\2\2\2\fL\3\2"+
		"\2\2\16P\3\2\2\2\20e\3\2\2\2\22h\3\2\2\2\24o\3\2\2\2\26r\3\2\2\2\30v\3"+
		"\2\2\2\32}\3\2\2\2\34\u0081\3\2\2\2\36\37\5\f\7\2\37!\7\3\2\2 \"\5\4\3"+
		"\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\'\5\6\4\2&%\3\2"+
		"\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5\22\n\2+*\3\2\2\2,-\3"+
		"\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\4\2\2\60\62\3\2\2\2\61\36\3"+
		"\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5"+
		"\24\13\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:<"+
		"\5\n\6\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?A\5\b\5\2"+
		"@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DE\7\20\2\2EF\7\21"+
		"\2\2FG\7\5\2\2G\t\3\2\2\2HI\7\17\2\2IJ\7\21\2\2JK\7\5\2\2K\13\3\2\2\2"+
		"LM\7\r\2\2MN\7\16\2\2NO\7\21\2\2O\r\3\2\2\2PQ\7\6\2\2QR\7\21\2\2RS\7\7"+
		"\2\2ST\7\21\2\2TU\7\b\2\2UV\7\5\2\2V\17\3\2\2\2WX\7\t\2\2XY\7\21\2\2Y"+
		"Z\7\7\2\2Z[\7\21\2\2[\\\7\b\2\2\\]\7\n\2\2]^\7\21\2\2^f\7\5\2\2_`\7\6"+
		"\2\2`a\7\21\2\2ab\7\7\2\2bc\7\21\2\2cd\7\b\2\2df\7\5\2\2eW\3\2\2\2e_\3"+
		"\2\2\2f\21\3\2\2\2gi\5\20\t\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"k\23\3\2\2\2lp\5\26\f\2mp\5\32\16\2np\7\22\2\2ol\3\2\2\2om\3\2\2\2on\3"+
		"\2\2\2p\25\3\2\2\2qs\5\30\r\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2"+
		"u\27\3\2\2\2vw\7\13\2\2wx\7\7\2\2xy\7\21\2\2yz\7\b\2\2z{\7\5\2\2{\31\3"+
		"\2\2\2|~\5\34\17\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\33\3\2\2\2\u0081\u0082\7\16\2\2\u0082\u0083\7\21\2\2\u0083\u0084"+
		"\7\7\2\2\u0084\u0089\7\21\2\2\u0085\u0086\7\f\2\2\u0086\u0088\7\21\2\2"+
		"\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\b\2\2\u008d"+
		"\u008e\7\5\2\2\u008e\35\3\2\2\2\17#(-\638=Bejot\177\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}