// Generated from /home/juli/Documents/Maestria2dot0/Temas_Avanzados_en_Lenguajes/Tasks/Autom2c/grammar/Autom2c.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Autom2cLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TAG=11, ATSGN=12, STATE=13, EVENT=14, ID=15, END=16, COMMENT=17, 
		LINE_COMMENT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "TAG", "ATSGN", "STATE", "EVENT", "ID", "END", "COMMENT", "LINE_COMMENT", 
			"WS"
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


	public Autom2cLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Autom2c.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20"+
		"d\n\20\f\20\16\20g\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\7\22s\n\22\f\22\16\22v\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\7\23\177\n\23\f\23\16\23\u0082\13\23\3\23\3\23\3\24\6\24\u0087\n\24\r"+
		"\24\16\24\u0088\3\24\3\24\3t\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\4\2C\\c|"+
		"\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u008f\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\64\3\2\2\2"+
		"\r\66\3\2\2\2\178\3\2\2\2\21=\3\2\2\2\23@\3\2\2\2\25F\3\2\2\2\27H\3\2"+
		"\2\2\31Q\3\2\2\2\33S\3\2\2\2\35Z\3\2\2\2\37a\3\2\2\2!h\3\2\2\2#n\3\2\2"+
		"\2%|\3\2\2\2\'\u0086\3\2\2\2)*\7}\2\2*\4\3\2\2\2+,\7\177\2\2,\6\3\2\2"+
		"\2-.\7=\2\2.\b\3\2\2\2/\60\7n\2\2\60\61\7q\2\2\61\62\7q\2\2\62\63\7r\2"+
		"\2\63\n\3\2\2\2\64\65\7*\2\2\65\f\3\2\2\2\66\67\7+\2\2\67\16\3\2\2\28"+
		"9\7h\2\29:\7t\2\2:;\7q\2\2;<\7o\2\2<\20\3\2\2\2=>\7v\2\2>?\7q\2\2?\22"+
		"\3\2\2\2@A\7r\2\2AB\7t\2\2BC\7k\2\2CD\7p\2\2DE\7v\2\2E\24\3\2\2\2FG\7"+
		".\2\2G\26\3\2\2\2HI\7C\2\2IJ\7w\2\2JK\7v\2\2KL\7q\2\2LM\7o\2\2MN\7c\2"+
		"\2NO\7v\2\2OP\7c\2\2P\30\3\2\2\2QR\7B\2\2R\32\3\2\2\2ST\7g\2\2TU\7u\2"+
		"\2UV\7v\2\2VW\7c\2\2WX\7f\2\2XY\7q\2\2Y\34\3\2\2\2Z[\7g\2\2[\\\7x\2\2"+
		"\\]\7g\2\2]^\7p\2\2^_\7v\2\2_`\7q\2\2`\36\3\2\2\2ae\t\2\2\2bd\t\3\2\2"+
		"cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f \3\2\2\2ge\3\2\2\2hi\7g\2\2"+
		"ij\7p\2\2jk\7f\2\2kl\3\2\2\2lm\7=\2\2m\"\3\2\2\2no\7\61\2\2op\7,\2\2p"+
		"t\3\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2uw\3\2\2\2"+
		"vt\3\2\2\2wx\7,\2\2xy\7\61\2\2yz\3\2\2\2z{\b\22\2\2{$\3\2\2\2|\u0080\7"+
		"%\2\2}\177\n\4\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\b\23\2\2"+
		"\u0084&\3\2\2\2\u0085\u0087\t\5\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\24\2\2\u008b(\3\2\2\2\7\2et\u0080\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}