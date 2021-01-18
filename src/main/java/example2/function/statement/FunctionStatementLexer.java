// Generated from D:/LTS/Antlr/src/main/resources\FunctionStatement.g4 by ANTLR 4.9
package example2.function.statement;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionStatementLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, WS=5, DECIMAL_LITERAL=6, TEXT_STRING=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ID", "WS", "DEC_DIGIT", "DECIMAL_LITERAL", "TEXT_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "WS", "DECIMAL_LITERAL", "TEXT_STRING"
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


	public FunctionStatementLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FunctionStatement.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tP\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\7\5\34\n\5\f\5\16\5\37\13\5\3\6\6\6\"\n\6\r\6\16\6#\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\5\7,\n\7\3\b\6\b/\n\b\r\b\16\b\60\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t;\n\t\f\t\16\t>\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\tI\n\t\f\t\16\tL\13\t\3\t\5\tO\n\t\2\2\n\3\3\5\4\7\5\t\6\13"+
		"\7\r\2\17\b\21\t\3\2\b\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\3\2\62;\3\2))\3\2$$\2[\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2"+
		"\7\27\3\2\2\2\t\31\3\2\2\2\13!\3\2\2\2\r+\3\2\2\2\17.\3\2\2\2\21N\3\2"+
		"\2\2\23\24\7*\2\2\24\4\3\2\2\2\25\26\7.\2\2\26\6\3\2\2\2\27\30\7+\2\2"+
		"\30\b\3\2\2\2\31\35\t\2\2\2\32\34\t\3\2\2\33\32\3\2\2\2\34\37\3\2\2\2"+
		"\35\33\3\2\2\2\35\36\3\2\2\2\36\n\3\2\2\2\37\35\3\2\2\2 \"\t\4\2\2! \3"+
		"\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\b\6\2\2&\f\3\2\2\2\'"+
		",\t\5\2\2()\t\5\2\2)*\7\60\2\2*,\t\5\2\2+\'\3\2\2\2+(\3\2\2\2,\16\3\2"+
		"\2\2-/\5\r\7\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\20\3"+
		"\2\2\2\62<\7)\2\2\63\64\7^\2\2\64;\7^\2\2\65\66\7)\2\2\66;\7)\2\2\678"+
		"\7^\2\28;\7)\2\29;\n\6\2\2:\63\3\2\2\2:\65\3\2\2\2:\67\3\2\2\2:9\3\2\2"+
		"\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?O\7)\2\2@J\7$\2\2"+
		"AB\7^\2\2BI\7^\2\2CD\7$\2\2DI\7$\2\2EF\7^\2\2FI\7$\2\2GI\n\7\2\2HA\3\2"+
		"\2\2HC\3\2\2\2HE\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2"+
		"\2\2LJ\3\2\2\2MO\7$\2\2N\62\3\2\2\2N@\3\2\2\2O\22\3\2\2\2\f\2\35#+\60"+
		":<HJN\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}