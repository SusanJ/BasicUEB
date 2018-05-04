// Generated from aPlusLexer.g4 by ANTLR 4.7.1
 package aplus; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aPlusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZERO=1, ONE=2, TWO=3, THREE=4, FOUR=5, FIVE=6, SIX=7, SEVEN=8, EIGHT=9, 
		NINE=10, OFENCE=11, CFENCE=12, NEU=13, PERIODorDEC=14, SEMICOLON=15, PUNC=16, 
		SPEC=17, FSLASH=18, BACK_TICK=19, HYP=20, USCORE=21, WEIRD=22, WEIRD_TC=23, 
		WEIRD_UC=24, LARGE=25, LARGE_TC=26, LARGE_UC=27, ILC45=28, ILC45_TC=29, 
		ILC45_UC=30, ILC456=31, ILC456_TC=32, ILC456_UC=33, ILC5=34, ILC5_TC=35, 
		ILC5_UC=36, LETTERA=37, LETTERB=38, LETTERC=39, LETTERD=40, LETTERE=41, 
		LETTERF=42, LETTERG=43, LETTERH=44, LETTERI=45, LETTERJ=46, LETTERK=47, 
		LETTERL=48, LETTERM=49, LETTERN=50, LETTERO=51, LETTERP=52, LETTERQ=53, 
		LETTERR=54, LETTERS=55, LETTERT=56, LETTERU=57, LETTERV=58, LETTERW=59, 
		LETTERX=60, LETTERY=61, LETTERZ=62, CAPS=63, BE_TC=64, EN=65, EN_TC=66, 
		EN_UC=67, IN=68, IN_TC=69, IN_UC=70, STRONG_GS=71, STRONG_GS_TC=72, STRONG_GS_UC=73, 
		FLC=74, FLC_TC=75, FLC_UC=76, BEGCON_TC=77, BEGCON_UC=78, MIDCON=79, MIDCON_TC=80, 
		MIDCON_UC=81, MDASH=82, NDASH=83, ODQUO=84, CDQUO=85, OSQUO=86, CSQUO=87, 
		SPACE=88, NEWLINE=89;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", 
		"NINE", "OFENCE", "CFENCE", "NEU", "PERIODorDEC", "SEMICOLON", "PUNC", 
		"SPEC", "FSLASH", "BACK_TICK", "HYP", "USCORE", "WEIRD", "WEIRD_TC", "WEIRD_UC", 
		"LARGE", "LARGE_TC", "LARGE_UC", "ILC45", "ILC45_TC", "ILC45_UC", "ILC456", 
		"ILC456_TC", "ILC456_UC", "ILC5", "ILC5_TC", "ILC5_UC", "LETTERA", "LETTERB", 
		"LETTERC", "LETTERD", "LETTERE", "LETTERF", "LETTERG", "LETTERH", "LETTERI", 
		"LETTERJ", "LETTERK", "LETTERL", "LETTERM", "LETTERN", "LETTERO", "LETTERP", 
		"LETTERQ", "LETTERR", "LETTERS", "LETTERT", "LETTERU", "LETTERV", "LETTERW", 
		"LETTERX", "LETTERY", "LETTERZ", "CAPS", "BE_TC", "EN", "EN_TC", "EN_UC", 
		"IN", "IN_TC", "IN_UC", "STRONG_GS", "STRONG_GS_TC", "STRONG_GS_UC", "FLC", 
		"FLC_TC", "FLC_UC", "BEGCON_TC", "BEGCON_UC", "MIDCON", "MIDCON_TC", "MIDCON_UC", 
		"MDASH", "NDASH", "ODQUO", "CDQUO", "OSQUO", "CSQUO", "ASPACE", "SPACE", 
		"WINNL", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", 
		null, null, null, "'.'", "';'", null, null, "'/'", "'`'", "'-'", "'_'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", 
		"'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", 
		"'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", null, "'Be'", 
		"'en'", "'En'", "'EN'", "'in'", "'In'", "'IN'", null, null, null, null, 
		null, null, null, null, null, null, null, "'\u2014'", "'\u2013'", "'\u201C'", 
		"'\u201D'", "'\u2018'", "'\u2019'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", 
		"NINE", "OFENCE", "CFENCE", "NEU", "PERIODorDEC", "SEMICOLON", "PUNC", 
		"SPEC", "FSLASH", "BACK_TICK", "HYP", "USCORE", "WEIRD", "WEIRD_TC", "WEIRD_UC", 
		"LARGE", "LARGE_TC", "LARGE_UC", "ILC45", "ILC45_TC", "ILC45_UC", "ILC456", 
		"ILC456_TC", "ILC456_UC", "ILC5", "ILC5_TC", "ILC5_UC", "LETTERA", "LETTERB", 
		"LETTERC", "LETTERD", "LETTERE", "LETTERF", "LETTERG", "LETTERH", "LETTERI", 
		"LETTERJ", "LETTERK", "LETTERL", "LETTERM", "LETTERN", "LETTERO", "LETTERP", 
		"LETTERQ", "LETTERR", "LETTERS", "LETTERT", "LETTERU", "LETTERV", "LETTERW", 
		"LETTERX", "LETTERY", "LETTERZ", "CAPS", "BE_TC", "EN", "EN_TC", "EN_UC", 
		"IN", "IN_TC", "IN_UC", "STRONG_GS", "STRONG_GS_TC", "STRONG_GS_UC", "FLC", 
		"FLC_TC", "FLC_UC", "BEGCON_TC", "BEGCON_UC", "MIDCON", "MIDCON_TC", "MIDCON_UC", 
		"MDASH", "NDASH", "ODQUO", "CDQUO", "OSQUO", "CSQUO", "SPACE", "NEWLINE"
	};
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

	 public static boolean lastSep = false;

	public aPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "aPlusLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10:
			OFENCE_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			HYP_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			USCORE_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			LARGE_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			LARGE_TC_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			LARGE_UC_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			ILC45_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			ILC45_TC_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			ILC45_UC_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			ILC456_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			ILC456_TC_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			ILC456_UC_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			ILC5_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			ILC5_TC_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			ILC5_UC_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			LETTERA_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			LETTERB_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			LETTERC_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			LETTERD_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			LETTERE_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			LETTERF_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			LETTERG_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			LETTERH_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			LETTERI_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			LETTERJ_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			LETTERK_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			LETTERL_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			LETTERM_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			LETTERN_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			LETTERO_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			LETTERP_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			LETTERQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			LETTERR_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			LETTERS_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			LETTERT_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			LETTERU_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			LETTERV_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			LETTERW_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			LETTERX_action((RuleContext)_localctx, actionIndex);
			break;
		case 60:
			LETTERY_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
			LETTERZ_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			CAPS_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
			STRONG_GS_action((RuleContext)_localctx, actionIndex);
			break;
		case 71:
			STRONG_GS_TC_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			STRONG_GS_UC_action((RuleContext)_localctx, actionIndex);
			break;
		case 81:
			MDASH_action((RuleContext)_localctx, actionIndex);
			break;
		case 82:
			NDASH_action((RuleContext)_localctx, actionIndex);
			break;
		case 88:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 90:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OFENCE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			lastSep = true;
			break;
		}
	}
	private void HYP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			lastSep = true;
			break;
		}
	}
	private void USCORE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			lastSep = true;
			break;
		}
	}
	private void LARGE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			lastSep = false;
			break;
		}
	}
	private void LARGE_TC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			lastSep = false;
			break;
		}
	}
	private void LARGE_UC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			lastSep = false;
			break;
		}
	}
	private void ILC45_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			lastSep = false;
			break;
		}
	}
	private void ILC45_TC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			lastSep = false;
			break;
		}
	}
	private void ILC45_UC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			lastSep = false;
			break;
		}
	}
	private void ILC456_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			lastSep = false;
			break;
		}
	}
	private void ILC456_TC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			lastSep = false;
			break;
		}
	}
	private void ILC456_UC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			lastSep = false;
			break;
		}
	}
	private void ILC5_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			lastSep = false;
			break;
		}
	}
	private void ILC5_TC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			lastSep = false;
			break;
		}
	}
	private void ILC5_UC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			lastSep = false;
			break;
		}
	}
	private void LETTERA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			lastSep = false;
			break;
		}
	}
	private void LETTERB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			lastSep = false;
			break;
		}
	}
	private void LETTERC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			lastSep = false;
			break;
		}
	}
	private void LETTERD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			lastSep = false;
			break;
		}
	}
	private void LETTERE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			lastSep = false;
			break;
		}
	}
	private void LETTERF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			lastSep = false;
			break;
		}
	}
	private void LETTERG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			lastSep = false;
			break;
		}
	}
	private void LETTERH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			lastSep = false;
			break;
		}
	}
	private void LETTERI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			lastSep = false;
			break;
		}
	}
	private void LETTERJ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			lastSep = false;
			break;
		}
	}
	private void LETTERK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			lastSep = false;
			break;
		}
	}
	private void LETTERL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			lastSep = false;
			break;
		}
	}
	private void LETTERM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			lastSep = false;
			break;
		}
	}
	private void LETTERN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:
			lastSep = false;
			break;
		}
	}
	private void LETTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:
			lastSep = false;
			break;
		}
	}
	private void LETTERP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:
			lastSep = false;
			break;
		}
	}
	private void LETTERQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:
			lastSep = false;
			break;
		}
	}
	private void LETTERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			lastSep = false;
			break;
		}
	}
	private void LETTERS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			lastSep = false;
			break;
		}
	}
	private void LETTERT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34:
			lastSep = false;
			break;
		}
	}
	private void LETTERU_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35:
			lastSep = false;
			break;
		}
	}
	private void LETTERV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36:
			lastSep = false;
			break;
		}
	}
	private void LETTERW_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37:
			lastSep = false;
			break;
		}
	}
	private void LETTERX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38:
			lastSep = false;
			break;
		}
	}
	private void LETTERY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39:
			lastSep = false;
			break;
		}
	}
	private void LETTERZ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40:
			lastSep = false;
			break;
		}
	}
	private void CAPS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41:
			lastSep = false;
			break;
		}
	}
	private void STRONG_GS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42:
			lastSep = false;
			break;
		}
	}
	private void STRONG_GS_TC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43:
			lastSep = false;
			break;
		}
	}
	private void STRONG_GS_UC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44:
			lastSep = false;
			break;
		}
	}
	private void MDASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45:
			lastSep = true;
			break;
		}
	}
	private void NDASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46:
			lastSep = true;
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47:
			lastSep = true;
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48:
			lastSep = true;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 73:
			return FLC_sempred((RuleContext)_localctx, predIndex);
		case 74:
			return FLC_TC_sempred((RuleContext)_localctx, predIndex);
		case 75:
			return FLC_UC_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean FLC_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !lastSep;
		}
		return true;
	}
	private boolean FLC_TC_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !lastSep;
		}
		return true;
	}
	private boolean FLC_UC_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !lastSep;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u04f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f7\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0109\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u011b\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012c\n\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u013f\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0152\n\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u016d\n\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0188\n\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01a3\n\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u01c4\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01e5\n!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0206\n\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0276\n#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u02e6\n$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0356\n%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3"+
		".\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3"+
		"@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3"+
		"G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\5H\u03d9\nH\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03f6\nI\3I\3I\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0413\nJ\3"+
		"J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\5K\u0444\nK\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\5L\u0475\nL\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u04a6\nM\3M\3M\3N\3N\3N\3N\3N\3N\5"+
		"N\u04b0\nN\3O\3O\3O\3O\3O\3O\5O\u04b8\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\5P\u04c4\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u04d0\nQ\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\5R\u04dc\nR\3S\3S\3S\3T\3T\3T\3U\3U\3V\3V\3W\3W\3X\3"+
		"X\3Y\3Y\3Z\3Z\3Z\3[\6[\u04f2\n[\r[\16[\u04f3\3\\\3\\\3\\\2\2]\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1\2\u00b3Z\u00b5\2\u00b7[\3\2"+
		"\t\6\2**>>]]}}\6\2++@@__\177\177\4\2$$))\6\2##..<<AA\n\2%(,-??BB^^``~"+
		"~\u0080\u0080\3\2C\\\4\2\f\f\17\17\2\u05b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b3\3\2\2\2\2\u00b7\3\2\2\2\3\u00b9"+
		"\3\2\2\2\5\u00bb\3\2\2\2\7\u00bd\3\2\2\2\t\u00bf\3\2\2\2\13\u00c1\3\2"+
		"\2\2\r\u00c3\3\2\2\2\17\u00c5\3\2\2\2\21\u00c7\3\2\2\2\23\u00c9\3\2\2"+
		"\2\25\u00cb\3\2\2\2\27\u00cd\3\2\2\2\31\u00d0\3\2\2\2\33\u00d2\3\2\2\2"+
		"\35\u00d4\3\2\2\2\37\u00d6\3\2\2\2!\u00d8\3\2\2\2#\u00da\3\2\2\2%\u00dc"+
		"\3\2\2\2\'\u00de\3\2\2\2)\u00e0\3\2\2\2+\u00e3\3\2\2\2-\u00f6\3\2\2\2"+
		"/\u0108\3\2\2\2\61\u011a\3\2\2\2\63\u012b\3\2\2\2\65\u013e\3\2\2\2\67"+
		"\u0151\3\2\2\29\u016c\3\2\2\2;\u0187\3\2\2\2=\u01a2\3\2\2\2?\u01c3\3\2"+
		"\2\2A\u01e4\3\2\2\2C\u0205\3\2\2\2E\u0275\3\2\2\2G\u02e5\3\2\2\2I\u0355"+
		"\3\2\2\2K\u0359\3\2\2\2M\u035c\3\2\2\2O\u035f\3\2\2\2Q\u0362\3\2\2\2S"+
		"\u0365\3\2\2\2U\u0368\3\2\2\2W\u036b\3\2\2\2Y\u036e\3\2\2\2[\u0371\3\2"+
		"\2\2]\u0374\3\2\2\2_\u0377\3\2\2\2a\u037a\3\2\2\2c\u037d\3\2\2\2e\u0380"+
		"\3\2\2\2g\u0383\3\2\2\2i\u0386\3\2\2\2k\u0389\3\2\2\2m\u038c\3\2\2\2o"+
		"\u038f\3\2\2\2q\u0392\3\2\2\2s\u0395\3\2\2\2u\u0398\3\2\2\2w\u039b\3\2"+
		"\2\2y\u039e\3\2\2\2{\u03a1\3\2\2\2}\u03a4\3\2\2\2\177\u03a7\3\2\2\2\u0081"+
		"\u03aa\3\2\2\2\u0083\u03ad\3\2\2\2\u0085\u03b0\3\2\2\2\u0087\u03b3\3\2"+
		"\2\2\u0089\u03b6\3\2\2\2\u008b\u03b9\3\2\2\2\u008d\u03bc\3\2\2\2\u008f"+
		"\u03d8\3\2\2\2\u0091\u03f5\3\2\2\2\u0093\u0412\3\2\2\2\u0095\u0443\3\2"+
		"\2\2\u0097\u0474\3\2\2\2\u0099\u04a5\3\2\2\2\u009b\u04af\3\2\2\2\u009d"+
		"\u04b7\3\2\2\2\u009f\u04c3\3\2\2\2\u00a1\u04cf\3\2\2\2\u00a3\u04db\3\2"+
		"\2\2\u00a5\u04dd\3\2\2\2\u00a7\u04e0\3\2\2\2\u00a9\u04e3\3\2\2\2\u00ab"+
		"\u04e5\3\2\2\2\u00ad\u04e7\3\2\2\2\u00af\u04e9\3\2\2\2\u00b1\u04eb\3\2"+
		"\2\2\u00b3\u04ed\3\2\2\2\u00b5\u04f1\3\2\2\2\u00b7\u04f5\3\2\2\2\u00b9"+
		"\u00ba\7\62\2\2\u00ba\4\3\2\2\2\u00bb\u00bc\7\63\2\2\u00bc\6\3\2\2\2\u00bd"+
		"\u00be\7\64\2\2\u00be\b\3\2\2\2\u00bf\u00c0\7\65\2\2\u00c0\n\3\2\2\2\u00c1"+
		"\u00c2\7\66\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7\67\2\2\u00c4\16\3\2\2\2"+
		"\u00c5\u00c6\78\2\2\u00c6\20\3\2\2\2\u00c7\u00c8\79\2\2\u00c8\22\3\2\2"+
		"\2\u00c9\u00ca\7:\2\2\u00ca\24\3\2\2\2\u00cb\u00cc\7;\2\2\u00cc\26\3\2"+
		"\2\2\u00cd\u00ce\t\2\2\2\u00ce\u00cf\b\f\2\2\u00cf\30\3\2\2\2\u00d0\u00d1"+
		"\t\3\2\2\u00d1\32\3\2\2\2\u00d2\u00d3\t\4\2\2\u00d3\34\3\2\2\2\u00d4\u00d5"+
		"\7\60\2\2\u00d5\36\3\2\2\2\u00d6\u00d7\7=\2\2\u00d7 \3\2\2\2\u00d8\u00d9"+
		"\t\5\2\2\u00d9\"\3\2\2\2\u00da\u00db\t\6\2\2\u00db$\3\2\2\2\u00dc\u00dd"+
		"\7\61\2\2\u00dd&\3\2\2\2\u00de\u00df\7b\2\2\u00df(\3\2\2\2\u00e0\u00e1"+
		"\7/\2\2\u00e1\u00e2\b\25\3\2\u00e2*\3\2\2\2\u00e3\u00e4\7a\2\2\u00e4\u00e5"+
		"\b\26\4\2\u00e5,\3\2\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7k\2\2\u00e8\u00f7"+
		"\7u\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb\7c\2\2\u00eb\u00f7\7u\2\2\u00ec"+
		"\u00ed\7y\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f7\7g\2\2"+
		"\u00f0\u00f1\7g\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4"+
		"\7w\2\2\u00f4\u00f5\7i\2\2\u00f5\u00f7\7j\2\2\u00f6\u00e6\3\2\2\2\u00f6"+
		"\u00e9\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f7.\3\2\2\2"+
		"\u00f8\u00f9\7J\2\2\u00f9\u00fa\7k\2\2\u00fa\u0109\7u\2\2\u00fb\u00fc"+
		"\7Y\2\2\u00fc\u00fd\7c\2\2\u00fd\u0109\7u\2\2\u00fe\u00ff\7Y\2\2\u00ff"+
		"\u0100\7g\2\2\u0100\u0101\7t\2\2\u0101\u0109\7g\2\2\u0102\u0103\7G\2\2"+
		"\u0103\u0104\7p\2\2\u0104\u0105\7q\2\2\u0105\u0106\7w\2\2\u0106\u0107"+
		"\7i\2\2\u0107\u0109\7j\2\2\u0108\u00f8\3\2\2\2\u0108\u00fb\3\2\2\2\u0108"+
		"\u00fe\3\2\2\2\u0108\u0102\3\2\2\2\u0109\60\3\2\2\2\u010a\u010b\7J\2\2"+
		"\u010b\u010c\7K\2\2\u010c\u011b\7U\2\2\u010d\u010e\7Y\2\2\u010e\u010f"+
		"\7C\2\2\u010f\u011b\7U\2\2\u0110\u0111\7Y\2\2\u0111\u0112\7G\2\2\u0112"+
		"\u0113\7T\2\2\u0113\u011b\7G\2\2\u0114\u0115\7G\2\2\u0115\u0116\7P\2\2"+
		"\u0116\u0117\7Q\2\2\u0117\u0118\7W\2\2\u0118\u0119\7I\2\2\u0119\u011b"+
		"\7J\2\2\u011a\u010a\3\2\2\2\u011a\u010d\3\2\2\2\u011a\u0110\3\2\2\2\u011a"+
		"\u0114\3\2\2\2\u011b\62\3\2\2\2\u011c\u011d\7c\2\2\u011d\u011e\7p\2\2"+
		"\u011e\u012c\7f\2\2\u011f\u0120\7h\2\2\u0120\u0121\7q\2\2\u0121\u012c"+
		"\7t\2\2\u0122\u0123\7q\2\2\u0123\u012c\7h\2\2\u0124\u0125\7v\2\2\u0125"+
		"\u0126\7j\2\2\u0126\u012c\7g\2\2\u0127\u0128\7y\2\2\u0128\u0129\7k\2\2"+
		"\u0129\u012a\7v\2\2\u012a\u012c\7j\2\2\u012b\u011c\3\2\2\2\u012b\u011f"+
		"\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0124\3\2\2\2\u012b\u0127\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\b\32\5\2\u012e\64\3\2\2\2\u012f\u0130\7C\2"+
		"\2\u0130\u0131\7p\2\2\u0131\u013f\7f\2\2\u0132\u0133\7H\2\2\u0133\u0134"+
		"\7q\2\2\u0134\u013f\7t\2\2\u0135\u0136\7Q\2\2\u0136\u013f\7h\2\2\u0137"+
		"\u0138\7V\2\2\u0138\u0139\7j\2\2\u0139\u013f\7g\2\2\u013a\u013b\7Y\2\2"+
		"\u013b\u013c\7k\2\2\u013c\u013d\7v\2\2\u013d\u013f\7j\2\2\u013e\u012f"+
		"\3\2\2\2\u013e\u0132\3\2\2\2\u013e\u0135\3\2\2\2\u013e\u0137\3\2\2\2\u013e"+
		"\u013a\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\33\6\2\u0141\66\3\2\2"+
		"\2\u0142\u0143\7C\2\2\u0143\u0144\7P\2\2\u0144\u0152\7F\2\2\u0145\u0146"+
		"\7H\2\2\u0146\u0147\7Q\2\2\u0147\u0152\7T\2\2\u0148\u0149\7Q\2\2\u0149"+
		"\u0152\7H\2\2\u014a\u014b\7V\2\2\u014b\u014c\7J\2\2\u014c\u0152\7G\2\2"+
		"\u014d\u014e\7Y\2\2\u014e\u014f\7K\2\2\u014f\u0150\7V\2\2\u0150\u0152"+
		"\7J\2\2\u0151\u0142\3\2\2\2\u0151\u0145\3\2\2\2\u0151\u0148\3\2\2\2\u0151"+
		"\u014a\3\2\2\2\u0151\u014d\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\34"+
		"\7\2\u01548\3\2\2\2\u0155\u0156\7w\2\2\u0156\u0157\7r\2\2\u0157\u0158"+
		"\7q\2\2\u0158\u016d\7p\2\2\u0159\u015a\7v\2\2\u015a\u015b\7j\2\2\u015b"+
		"\u015c\7g\2\2\u015c\u015d\7u\2\2\u015d\u016d\7g\2\2\u015e\u015f\7v\2\2"+
		"\u015f\u0160\7j\2\2\u0160\u0161\7q\2\2\u0161\u0162\7u\2\2\u0162\u016d"+
		"\7g\2\2\u0163\u0164\7y\2\2\u0164\u0165\7j\2\2\u0165\u0166\7q\2\2\u0166"+
		"\u0167\7u\2\2\u0167\u016d\7g\2\2\u0168\u0169\7y\2\2\u0169\u016a\7q\2\2"+
		"\u016a\u016b\7t\2\2\u016b\u016d\7f\2\2\u016c\u0155\3\2\2\2\u016c\u0159"+
		"\3\2\2\2\u016c\u015e\3\2\2\2\u016c\u0163\3\2\2\2\u016c\u0168\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\b\35\b\2\u016f:\3\2\2\2\u0170\u0171\7W\2\2"+
		"\u0171\u0172\7r\2\2\u0172\u0173\7q\2\2\u0173\u0188\7p\2\2\u0174\u0175"+
		"\7V\2\2\u0175\u0176\7j\2\2\u0176\u0177\7g\2\2\u0177\u0178\7u\2\2\u0178"+
		"\u0188\7g\2\2\u0179\u017a\7V\2\2\u017a\u017b\7j\2\2\u017b\u017c\7q\2\2"+
		"\u017c\u017d\7u\2\2\u017d\u0188\7g\2\2\u017e\u017f\7Y\2\2\u017f\u0180"+
		"\7j\2\2\u0180\u0181\7q\2\2\u0181\u0182\7u\2\2\u0182\u0188\7g\2\2\u0183"+
		"\u0184\7Y\2\2\u0184\u0185\7q\2\2\u0185\u0186\7t\2\2\u0186\u0188\7f\2\2"+
		"\u0187\u0170\3\2\2\2\u0187\u0174\3\2\2\2\u0187\u0179\3\2\2\2\u0187\u017e"+
		"\3\2\2\2\u0187\u0183\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b\36\t\2"+
		"\u018a<\3\2\2\2\u018b\u018c\7W\2\2\u018c\u018d\7R\2\2\u018d\u018e\7Q\2"+
		"\2\u018e\u01a3\7P\2\2\u018f\u0190\7V\2\2\u0190\u0191\7J\2\2\u0191\u0192"+
		"\7G\2\2\u0192\u0193\7U\2\2\u0193\u01a3\7G\2\2\u0194\u0195\7V\2\2\u0195"+
		"\u0196\7J\2\2\u0196\u0197\7Q\2\2\u0197\u0198\7U\2\2\u0198\u01a3\7G\2\2"+
		"\u0199\u019a\7Y\2\2\u019a\u019b\7J\2\2\u019b\u019c\7Q\2\2\u019c\u019d"+
		"\7U\2\2\u019d\u01a3\7G\2\2\u019e\u019f\7Y\2\2\u019f\u01a0\7Q\2\2\u01a0"+
		"\u01a1\7T\2\2\u01a1\u01a3\7F\2\2\u01a2\u018b\3\2\2\2\u01a2\u018f\3\2\2"+
		"\2\u01a2\u0194\3\2\2\2\u01a2\u0199\3\2\2\2\u01a2\u019e\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a5\b\37\n\2\u01a5>\3\2\2\2\u01a6\u01a7\7e\2\2\u01a7"+
		"\u01a8\7c\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7q\2\2"+
		"\u01ab\u01c4\7v\2\2\u01ac\u01ad\7j\2\2\u01ad\u01ae\7c\2\2\u01ae\u01c4"+
		"\7f\2\2\u01af\u01b0\7o\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7p\2\2\u01b2"+
		"\u01c4\7{\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7r\2\2\u01b5\u01b6\7k\2\2"+
		"\u01b6\u01b7\7t\2\2\u01b7\u01b8\7k\2\2\u01b8\u01c4\7v\2\2\u01b9\u01ba"+
		"\7v\2\2\u01ba\u01bb\7j\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7k\2\2\u01bd"+
		"\u01c4\7t\2\2\u01be\u01bf\7y\2\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7t\2\2"+
		"\u01c1\u01c2\7n\2\2\u01c2\u01c4\7f\2\2\u01c3\u01a6\3\2\2\2\u01c3\u01ac"+
		"\3\2\2\2\u01c3\u01af\3\2\2\2\u01c3\u01b3\3\2\2\2\u01c3\u01b9\3\2\2\2\u01c3"+
		"\u01be\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\b \13\2\u01c6@\3\2\2\2"+
		"\u01c7\u01c8\7E\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb"+
		"\7p\2\2\u01cb\u01cc\7q\2\2\u01cc\u01e5\7v\2\2\u01cd\u01ce\7J\2\2\u01ce"+
		"\u01cf\7c\2\2\u01cf\u01e5\7f\2\2\u01d0\u01d1\7O\2\2\u01d1\u01d2\7c\2\2"+
		"\u01d2\u01d3\7p\2\2\u01d3\u01e5\7{\2\2\u01d4\u01d5\7U\2\2\u01d5\u01d6"+
		"\7r\2\2\u01d6\u01d7\7k\2\2\u01d7\u01d8\7t\2\2\u01d8\u01d9\7k\2\2\u01d9"+
		"\u01e5\7v\2\2\u01da\u01db\7V\2\2\u01db\u01dc\7j\2\2\u01dc\u01dd\7g\2\2"+
		"\u01dd\u01de\7k\2\2\u01de\u01e5\7t\2\2\u01df\u01e0\7Y\2\2\u01e0\u01e1"+
		"\7q\2\2\u01e1\u01e2\7t\2\2\u01e2\u01e3\7n\2\2\u01e3\u01e5\7f\2\2\u01e4"+
		"\u01c7\3\2\2\2\u01e4\u01cd\3\2\2\2\u01e4\u01d0\3\2\2\2\u01e4\u01d4\3\2"+
		"\2\2\u01e4\u01da\3\2\2\2\u01e4\u01df\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e7\b!\f\2\u01e7B\3\2\2\2\u01e8\u01e9\7E\2\2\u01e9\u01ea\7C\2\2\u01ea"+
		"\u01eb\7P\2\2\u01eb\u01ec\7P\2\2\u01ec\u01ed\7Q\2\2\u01ed\u0206\7V\2\2"+
		"\u01ee\u01ef\7J\2\2\u01ef\u01f0\7C\2\2\u01f0\u0206\7F\2\2\u01f1\u01f2"+
		"\7O\2\2\u01f2\u01f3\7C\2\2\u01f3\u01f4\7P\2\2\u01f4\u0206\7[\2\2\u01f5"+
		"\u01f6\7U\2\2\u01f6\u01f7\7R\2\2\u01f7\u01f8\7K\2\2\u01f8\u01f9\7T\2\2"+
		"\u01f9\u01fa\7K\2\2\u01fa\u0206\7V\2\2\u01fb\u01fc\7V\2\2\u01fc\u01fd"+
		"\7J\2\2\u01fd\u01fe\7G\2\2\u01fe\u01ff\7K\2\2\u01ff\u0206\7T\2\2\u0200"+
		"\u0201\7Y\2\2\u0201\u0202\7Q\2\2\u0202\u0203\7T\2\2\u0203\u0204\7N\2\2"+
		"\u0204\u0206\7F\2\2\u0205\u01e8\3\2\2\2\u0205\u01ee\3\2\2\2\u0205\u01f1"+
		"\3\2\2\2\u0205\u01f5\3\2\2\2\u0205\u01fb\3\2\2\2\u0205\u0200\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\b\"\r\2\u0208D\3\2\2\2\u0209\u020a\7f\2\2\u020a"+
		"\u020b\7c\2\2\u020b\u0276\7{\2\2\u020c\u020d\7g\2\2\u020d\u020e\7x\2\2"+
		"\u020e\u020f\7g\2\2\u020f\u0276\7t\2\2\u0210\u0211\7h\2\2\u0211\u0212"+
		"\7c\2\2\u0212\u0213\7v\2\2\u0213\u0214\7j\2\2\u0214\u0215\7g\2\2\u0215"+
		"\u0276\7t\2\2\u0216\u0217\7j\2\2\u0217\u0218\7g\2\2\u0218\u0219\7t\2\2"+
		"\u0219\u0276\7g\2\2\u021a\u021b\7m\2\2\u021b\u021c\7p\2\2\u021c\u021d"+
		"\7q\2\2\u021d\u0276\7y\2\2\u021e\u021f\7n\2\2\u021f\u0220\7q\2\2\u0220"+
		"\u0221\7t\2\2\u0221\u0276\7f\2\2\u0222\u0223\7o\2\2\u0223\u0224\7q\2\2"+
		"\u0224\u0225\7v\2\2\u0225\u0226\7j\2\2\u0226\u0227\7g\2\2\u0227\u0276"+
		"\7t\2\2\u0228\u0229\7p\2\2\u0229\u022a\7c\2\2\u022a\u022b\7o\2\2\u022b"+
		"\u0276\7g\2\2\u022c\u022d\7q\2\2\u022d\u022e\7p\2\2\u022e\u0276\7g\2\2"+
		"\u022f\u0230\7r\2\2\u0230\u0231\7c\2\2\u0231\u0232\7t\2\2\u0232\u0276"+
		"\7v\2\2\u0233\u0234\7s\2\2\u0234\u0235\7w\2\2\u0235\u0236\7g\2\2\u0236"+
		"\u0237\7u\2\2\u0237\u0238\7v\2\2\u0238\u0239\7k\2\2\u0239\u023a\7q\2\2"+
		"\u023a\u0276\7p\2\2\u023b\u023c\7t\2\2\u023c\u023d\7k\2\2\u023d\u023e"+
		"\7i\2\2\u023e\u023f\7j\2\2\u023f\u0276\7v\2\2\u0240\u0241\7u\2\2\u0241"+
		"\u0242\7q\2\2\u0242\u0243\7o\2\2\u0243\u0276\7g\2\2\u0244\u0245\7v\2\2"+
		"\u0245\u0246\7k\2\2\u0246\u0247\7o\2\2\u0247\u0276\7g\2\2\u0248\u0249"+
		"\7w\2\2\u0249\u024a\7p\2\2\u024a\u024b\7f\2\2\u024b\u024c\7g\2\2\u024c"+
		"\u0276\7t\2\2\u024d\u024e\7{\2\2\u024e\u024f\7q\2\2\u024f\u0250\7w\2\2"+
		"\u0250\u0251\7p\2\2\u0251\u0276\7i\2\2\u0252\u0253\7v\2\2\u0253\u0254"+
		"\7j\2\2\u0254\u0255\7g\2\2\u0255\u0256\7t\2\2\u0256\u0276\7g\2\2\u0257"+
		"\u0258\7e\2\2\u0258\u0259\7j\2\2\u0259\u025a\7c\2\2\u025a\u025b\7t\2\2"+
		"\u025b\u025c\7c\2\2\u025c\u025d\7e\2\2\u025d\u025e\7v\2\2\u025e\u025f"+
		"\7g\2\2\u025f\u0276\7t\2\2\u0260\u0261\7v\2\2\u0261\u0262\7j\2\2\u0262"+
		"\u0263\7t\2\2\u0263\u0264\7q\2\2\u0264\u0265\7w\2\2\u0265\u0266\7i\2\2"+
		"\u0266\u0276\7j\2\2\u0267\u0268\7y\2\2\u0268\u0269\7j\2\2\u0269\u026a"+
		"\7g\2\2\u026a\u026b\7t\2\2\u026b\u0276\7g\2\2\u026c\u026d\7q\2\2\u026d"+
		"\u026e\7w\2\2\u026e\u026f\7i\2\2\u026f\u0270\7j\2\2\u0270\u0276\7v\2\2"+
		"\u0271\u0272\7y\2\2\u0272\u0273\7q\2\2\u0273\u0274\7t\2\2\u0274\u0276"+
		"\7m\2\2\u0275\u0209\3\2\2\2\u0275\u020c\3\2\2\2\u0275\u0210\3\2\2\2\u0275"+
		"\u0216\3\2\2\2\u0275\u021a\3\2\2\2\u0275\u021e\3\2\2\2\u0275\u0222\3\2"+
		"\2\2\u0275\u0228\3\2\2\2\u0275\u022c\3\2\2\2\u0275\u022f\3\2\2\2\u0275"+
		"\u0233\3\2\2\2\u0275\u023b\3\2\2\2\u0275\u0240\3\2\2\2\u0275\u0244\3\2"+
		"\2\2\u0275\u0248\3\2\2\2\u0275\u024d\3\2\2\2\u0275\u0252\3\2\2\2\u0275"+
		"\u0257\3\2\2\2\u0275\u0260\3\2\2\2\u0275\u0267\3\2\2\2\u0275\u026c\3\2"+
		"\2\2\u0275\u0271\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\b#\16\2\u0278"+
		"F\3\2\2\2\u0279\u027a\7F\2\2\u027a\u027b\7c\2\2\u027b\u02e6\7{\2\2\u027c"+
		"\u027d\7G\2\2\u027d\u027e\7x\2\2\u027e\u027f\7g\2\2\u027f\u02e6\7t\2\2"+
		"\u0280\u0281\7H\2\2\u0281\u0282\7c\2\2\u0282\u0283\7v\2\2\u0283\u0284"+
		"\7j\2\2\u0284\u0285\7g\2\2\u0285\u02e6\7t\2\2\u0286\u0287\7J\2\2\u0287"+
		"\u0288\7g\2\2\u0288\u0289\7t\2\2\u0289\u02e6\7g\2\2\u028a\u028b\7M\2\2"+
		"\u028b\u028c\7p\2\2\u028c\u028d\7q\2\2\u028d\u02e6\7y\2\2\u028e\u028f"+
		"\7N\2\2\u028f\u0290\7q\2\2\u0290\u0291\7t\2\2\u0291\u02e6\7f\2\2\u0292"+
		"\u0293\7O\2\2\u0293\u0294\7q\2\2\u0294\u0295\7v\2\2\u0295\u0296\7j\2\2"+
		"\u0296\u0297\7g\2\2\u0297\u02e6\7t\2\2\u0298\u0299\7P\2\2\u0299\u029a"+
		"\7c\2\2\u029a\u029b\7o\2\2\u029b\u02e6\7g\2\2\u029c\u029d\7Q\2\2\u029d"+
		"\u029e\7p\2\2\u029e\u02e6\7g\2\2\u029f\u02a0\7R\2\2\u02a0\u02a1\7c\2\2"+
		"\u02a1\u02a2\7t\2\2\u02a2\u02e6\7v\2\2\u02a3\u02a4\7S\2\2\u02a4\u02a5"+
		"\7w\2\2\u02a5\u02a6\7g\2\2\u02a6\u02a7\7u\2\2\u02a7\u02a8\7v\2\2\u02a8"+
		"\u02a9\7k\2\2\u02a9\u02aa\7q\2\2\u02aa\u02e6\7p\2\2\u02ab\u02ac\7T\2\2"+
		"\u02ac\u02ad\7k\2\2\u02ad\u02ae\7i\2\2\u02ae\u02af\7j\2\2\u02af\u02e6"+
		"\7v\2\2\u02b0\u02b1\7U\2\2\u02b1\u02b2\7q\2\2\u02b2\u02b3\7o\2\2\u02b3"+
		"\u02e6\7g\2\2\u02b4\u02b5\7V\2\2\u02b5\u02b6\7k\2\2\u02b6\u02b7\7o\2\2"+
		"\u02b7\u02e6\7g\2\2\u02b8\u02b9\7W\2\2\u02b9\u02ba\7p\2\2\u02ba\u02bb"+
		"\7f\2\2\u02bb\u02bc\7g\2\2\u02bc\u02e6\7t\2\2\u02bd\u02be\7[\2\2\u02be"+
		"\u02bf\7q\2\2\u02bf\u02c0\7w\2\2\u02c0\u02c1\7p\2\2\u02c1\u02e6\7i\2\2"+
		"\u02c2\u02c3\7V\2\2\u02c3\u02c4\7j\2\2\u02c4\u02c5\7g\2\2\u02c5\u02c6"+
		"\7t\2\2\u02c6\u02e6\7g\2\2\u02c7\u02c8\7E\2\2\u02c8\u02c9\7j\2\2\u02c9"+
		"\u02ca\7c\2\2\u02ca\u02cb\7t\2\2\u02cb\u02cc\7c\2\2\u02cc\u02cd\7e\2\2"+
		"\u02cd\u02ce\7v\2\2\u02ce\u02cf\7g\2\2\u02cf\u02e6\7t\2\2\u02d0\u02d1"+
		"\7V\2\2\u02d1\u02d2\7j\2\2\u02d2\u02d3\7t\2\2\u02d3\u02d4\7q\2\2\u02d4"+
		"\u02d5\7w\2\2\u02d5\u02d6\7i\2\2\u02d6\u02e6\7j\2\2\u02d7\u02d8\7Y\2\2"+
		"\u02d8\u02d9\7j\2\2\u02d9\u02da\7g\2\2\u02da\u02db\7t\2\2\u02db\u02e6"+
		"\7g\2\2\u02dc\u02dd\7Q\2\2\u02dd\u02de\7w\2\2\u02de\u02df\7i\2\2\u02df"+
		"\u02e0\7j\2\2\u02e0\u02e6\7v\2\2\u02e1\u02e2\7Y\2\2\u02e2\u02e3\7q\2\2"+
		"\u02e3\u02e4\7t\2\2\u02e4\u02e6\7m\2\2\u02e5\u0279\3\2\2\2\u02e5\u027c"+
		"\3\2\2\2\u02e5\u0280\3\2\2\2\u02e5\u0286\3\2\2\2\u02e5\u028a\3\2\2\2\u02e5"+
		"\u028e\3\2\2\2\u02e5\u0292\3\2\2\2\u02e5\u0298\3\2\2\2\u02e5\u029c\3\2"+
		"\2\2\u02e5\u029f\3\2\2\2\u02e5\u02a3\3\2\2\2\u02e5\u02ab\3\2\2\2\u02e5"+
		"\u02b0\3\2\2\2\u02e5\u02b4\3\2\2\2\u02e5\u02b8\3\2\2\2\u02e5\u02bd\3\2"+
		"\2\2\u02e5\u02c2\3\2\2\2\u02e5\u02c7\3\2\2\2\u02e5\u02d0\3\2\2\2\u02e5"+
		"\u02d7\3\2\2\2\u02e5\u02dc\3\2\2\2\u02e5\u02e1\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02e8\b$\17\2\u02e8H\3\2\2\2\u02e9\u02ea\7F\2\2\u02ea\u02eb"+
		"\7C\2\2\u02eb\u0356\7[\2\2\u02ec\u02ed\7G\2\2\u02ed\u02ee\7X\2\2\u02ee"+
		"\u02ef\7G\2\2\u02ef\u0356\7T\2\2\u02f0\u02f1\7H\2\2\u02f1\u02f2\7C\2\2"+
		"\u02f2\u02f3\7V\2\2\u02f3\u02f4\7J\2\2\u02f4\u02f5\7G\2\2\u02f5\u0356"+
		"\7T\2\2\u02f6\u02f7\7J\2\2\u02f7\u02f8\7G\2\2\u02f8\u02f9\7T\2\2\u02f9"+
		"\u0356\7G\2\2\u02fa\u02fb\7M\2\2\u02fb\u02fc\7P\2\2\u02fc\u02fd\7Q\2\2"+
		"\u02fd\u0356\7Y\2\2\u02fe\u02ff\7N\2\2\u02ff\u0300\7Q\2\2\u0300\u0301"+
		"\7T\2\2\u0301\u0356\7F\2\2\u0302\u0303\7O\2\2\u0303\u0304\7Q\2\2\u0304"+
		"\u0305\7V\2\2\u0305\u0306\7J\2\2\u0306\u0307\7G\2\2\u0307\u0356\7T\2\2"+
		"\u0308\u0309\7P\2\2\u0309\u030a\7C\2\2\u030a\u030b\7O\2\2\u030b\u0356"+
		"\7G\2\2\u030c\u030d\7Q\2\2\u030d\u030e\7P\2\2\u030e\u0356\7G\2\2\u030f"+
		"\u0310\7R\2\2\u0310\u0311\7C\2\2\u0311\u0312\7T\2\2\u0312\u0356\7V\2\2"+
		"\u0313\u0314\7S\2\2\u0314\u0315\7W\2\2\u0315\u0316\7G\2\2\u0316\u0317"+
		"\7U\2\2\u0317\u0318\7V\2\2\u0318\u0319\7K\2\2\u0319\u031a\7Q\2\2\u031a"+
		"\u0356\7P\2\2\u031b\u031c\7T\2\2\u031c\u031d\7K\2\2\u031d\u031e\7I\2\2"+
		"\u031e\u031f\7J\2\2\u031f\u0356\7V\2\2\u0320\u0321\7U\2\2\u0321\u0322"+
		"\7Q\2\2\u0322\u0323\7O\2\2\u0323\u0356\7G\2\2\u0324\u0325\7V\2\2\u0325"+
		"\u0326\7K\2\2\u0326\u0327\7O\2\2\u0327\u0356\7G\2\2\u0328\u0329\7W\2\2"+
		"\u0329\u032a\7P\2\2\u032a\u032b\7F\2\2\u032b\u032c\7G\2\2\u032c\u0356"+
		"\7T\2\2\u032d\u032e\7[\2\2\u032e\u032f\7Q\2\2\u032f\u0330\7W\2\2\u0330"+
		"\u0331\7P\2\2\u0331\u0356\7I\2\2\u0332\u0333\7V\2\2\u0333\u0334\7J\2\2"+
		"\u0334\u0335\7G\2\2\u0335\u0336\7T\2\2\u0336\u0356\7G\2\2\u0337\u0338"+
		"\7E\2\2\u0338\u0339\7J\2\2\u0339\u033a\7C\2\2\u033a\u033b\7T\2\2\u033b"+
		"\u033c\7C\2\2\u033c\u033d\7E\2\2\u033d\u033e\7V\2\2\u033e\u033f\7G\2\2"+
		"\u033f\u0356\7T\2\2\u0340\u0341\7V\2\2\u0341\u0342\7J\2\2\u0342\u0343"+
		"\7T\2\2\u0343\u0344\7Q\2\2\u0344\u0345\7W\2\2\u0345\u0346\7I\2\2\u0346"+
		"\u0356\7J\2\2\u0347\u0348\7Y\2\2\u0348\u0349\7J\2\2\u0349\u034a\7G\2\2"+
		"\u034a\u034b\7T\2\2\u034b\u0356\7G\2\2\u034c\u034d\7Q\2\2\u034d\u034e"+
		"\7W\2\2\u034e\u034f\7I\2\2\u034f\u0350\7J\2\2\u0350\u0356\7V\2\2\u0351"+
		"\u0352\7Y\2\2\u0352\u0353\7Q\2\2\u0353\u0354\7T\2\2\u0354\u0356\7M\2\2"+
		"\u0355\u02e9\3\2\2\2\u0355\u02ec\3\2\2\2\u0355\u02f0\3\2\2\2\u0355\u02f6"+
		"\3\2\2\2\u0355\u02fa\3\2\2\2\u0355\u02fe\3\2\2\2\u0355\u0302\3\2\2\2\u0355"+
		"\u0308\3\2\2\2\u0355\u030c\3\2\2\2\u0355\u030f\3\2\2\2\u0355\u0313\3\2"+
		"\2\2\u0355\u031b\3\2\2\2\u0355\u0320\3\2\2\2\u0355\u0324\3\2\2\2\u0355"+
		"\u0328\3\2\2\2\u0355\u032d\3\2\2\2\u0355\u0332\3\2\2\2\u0355\u0337\3\2"+
		"\2\2\u0355\u0340\3\2\2\2\u0355\u0347\3\2\2\2\u0355\u034c\3\2\2\2\u0355"+
		"\u0351\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\b%\20\2\u0358J\3\2\2\2"+
		"\u0359\u035a\7c\2\2\u035a\u035b\b&\21\2\u035bL\3\2\2\2\u035c\u035d\7d"+
		"\2\2\u035d\u035e\b\'\22\2\u035eN\3\2\2\2\u035f\u0360\7e\2\2\u0360\u0361"+
		"\b(\23\2\u0361P\3\2\2\2\u0362\u0363\7f\2\2\u0363\u0364\b)\24\2\u0364R"+
		"\3\2\2\2\u0365\u0366\7g\2\2\u0366\u0367\b*\25\2\u0367T\3\2\2\2\u0368\u0369"+
		"\7h\2\2\u0369\u036a\b+\26\2\u036aV\3\2\2\2\u036b\u036c\7i\2\2\u036c\u036d"+
		"\b,\27\2\u036dX\3\2\2\2\u036e\u036f\7j\2\2\u036f\u0370\b-\30\2\u0370Z"+
		"\3\2\2\2\u0371\u0372\7k\2\2\u0372\u0373\b.\31\2\u0373\\\3\2\2\2\u0374"+
		"\u0375\7l\2\2\u0375\u0376\b/\32\2\u0376^\3\2\2\2\u0377\u0378\7m\2\2\u0378"+
		"\u0379\b\60\33\2\u0379`\3\2\2\2\u037a\u037b\7n\2\2\u037b\u037c\b\61\34"+
		"\2\u037cb\3\2\2\2\u037d\u037e\7o\2\2\u037e\u037f\b\62\35\2\u037fd\3\2"+
		"\2\2\u0380\u0381\7p\2\2\u0381\u0382\b\63\36\2\u0382f\3\2\2\2\u0383\u0384"+
		"\7q\2\2\u0384\u0385\b\64\37\2\u0385h\3\2\2\2\u0386\u0387\7r\2\2\u0387"+
		"\u0388\b\65 \2\u0388j\3\2\2\2\u0389\u038a\7s\2\2\u038a\u038b\b\66!\2\u038b"+
		"l\3\2\2\2\u038c\u038d\7t\2\2\u038d\u038e\b\67\"\2\u038en\3\2\2\2\u038f"+
		"\u0390\7u\2\2\u0390\u0391\b8#\2\u0391p\3\2\2\2\u0392\u0393\7v\2\2\u0393"+
		"\u0394\b9$\2\u0394r\3\2\2\2\u0395\u0396\7w\2\2\u0396\u0397\b:%\2\u0397"+
		"t\3\2\2\2\u0398\u0399\7x\2\2\u0399\u039a\b;&\2\u039av\3\2\2\2\u039b\u039c"+
		"\7y\2\2\u039c\u039d\b<\'\2\u039dx\3\2\2\2\u039e\u039f\7z\2\2\u039f\u03a0"+
		"\b=(\2\u03a0z\3\2\2\2\u03a1\u03a2\7{\2\2\u03a2\u03a3\b>)\2\u03a3|\3\2"+
		"\2\2\u03a4\u03a5\7|\2\2\u03a5\u03a6\b?*\2\u03a6~\3\2\2\2\u03a7\u03a8\t"+
		"\7\2\2\u03a8\u03a9\b@+\2\u03a9\u0080\3\2\2\2\u03aa\u03ab\7D\2\2\u03ab"+
		"\u03ac\7g\2\2\u03ac\u0082\3\2\2\2\u03ad\u03ae\7g\2\2\u03ae\u03af\7p\2"+
		"\2\u03af\u0084\3\2\2\2\u03b0\u03b1\7G\2\2\u03b1\u03b2\7p\2\2\u03b2\u0086"+
		"\3\2\2\2\u03b3\u03b4\7G\2\2\u03b4\u03b5\7P\2\2\u03b5\u0088\3\2\2\2\u03b6"+
		"\u03b7\7k\2\2\u03b7\u03b8\7p\2\2\u03b8\u008a\3\2\2\2\u03b9\u03ba\7K\2"+
		"\2\u03ba\u03bb\7p\2\2\u03bb\u008c\3\2\2\2\u03bc\u03bd\7K\2\2\u03bd\u03be"+
		"\7P\2\2\u03be\u008e\3\2\2\2\u03bf\u03c0\7e\2\2\u03c0\u03d9\7j\2\2\u03c1"+
		"\u03c2\7y\2\2\u03c2\u03d9\7j\2\2\u03c3\u03c4\7u\2\2\u03c4\u03d9\7j\2\2"+
		"\u03c5\u03c6\7v\2\2\u03c6\u03d9\7j\2\2\u03c7\u03c8\7q\2\2\u03c8\u03d9"+
		"\7w\2\2\u03c9\u03ca\7u\2\2\u03ca\u03d9\7v\2\2\u03cb\u03cc\7i\2\2\u03cc"+
		"\u03d9\7j\2\2\u03cd\u03ce\7g\2\2\u03ce\u03d9\7f\2\2\u03cf\u03d0\7g\2\2"+
		"\u03d0\u03d9\7t\2\2\u03d1\u03d2\7q\2\2\u03d2\u03d9\7y\2\2\u03d3\u03d4"+
		"\7k\2\2\u03d4\u03d5\7p\2\2\u03d5\u03d9\7i\2\2\u03d6\u03d7\7c\2\2\u03d7"+
		"\u03d9\7t\2\2\u03d8\u03bf\3\2\2\2\u03d8\u03c1\3\2\2\2\u03d8\u03c3\3\2"+
		"\2\2\u03d8\u03c5\3\2\2\2\u03d8\u03c7\3\2\2\2\u03d8\u03c9\3\2\2\2\u03d8"+
		"\u03cb\3\2\2\2\u03d8\u03cd\3\2\2\2\u03d8\u03cf\3\2\2\2\u03d8\u03d1\3\2"+
		"\2\2\u03d8\u03d3\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u03db\bH,\2\u03db\u0090\3\2\2\2\u03dc\u03dd\7E\2\2\u03dd\u03f6\7j\2\2"+
		"\u03de\u03df\7Y\2\2\u03df\u03f6\7j\2\2\u03e0\u03e1\7U\2\2\u03e1\u03f6"+
		"\7j\2\2\u03e2\u03e3\7V\2\2\u03e3\u03f6\7j\2\2\u03e4\u03e5\7Q\2\2\u03e5"+
		"\u03f6\7w\2\2\u03e6\u03e7\7U\2\2\u03e7\u03f6\7v\2\2\u03e8\u03e9\7I\2\2"+
		"\u03e9\u03f6\7j\2\2\u03ea\u03eb\7G\2\2\u03eb\u03f6\7f\2\2\u03ec\u03ed"+
		"\7G\2\2\u03ed\u03f6\7t\2\2\u03ee\u03ef\7Q\2\2\u03ef\u03f6\7y\2\2\u03f0"+
		"\u03f1\7K\2\2\u03f1\u03f2\7p\2\2\u03f2\u03f6\7i\2\2\u03f3\u03f4\7C\2\2"+
		"\u03f4\u03f6\7t\2\2\u03f5\u03dc\3\2\2\2\u03f5\u03de\3\2\2\2\u03f5\u03e0"+
		"\3\2\2\2\u03f5\u03e2\3\2\2\2\u03f5\u03e4\3\2\2\2\u03f5\u03e6\3\2\2\2\u03f5"+
		"\u03e8\3\2\2\2\u03f5\u03ea\3\2\2\2\u03f5\u03ec\3\2\2\2\u03f5\u03ee\3\2"+
		"\2\2\u03f5\u03f0\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7"+
		"\u03f8\bI-\2\u03f8\u0092\3\2\2\2\u03f9\u03fa\7E\2\2\u03fa\u0413\7J\2\2"+
		"\u03fb\u03fc\7Y\2\2\u03fc\u0413\7J\2\2\u03fd\u03fe\7U\2\2\u03fe\u0413"+
		"\7J\2\2\u03ff\u0400\7V\2\2\u0400\u0413\7J\2\2\u0401\u0402\7Q\2\2\u0402"+
		"\u0413\7W\2\2\u0403\u0404\7U\2\2\u0404\u0413\7V\2\2\u0405\u0406\7I\2\2"+
		"\u0406\u0413\7J\2\2\u0407\u0408\7G\2\2\u0408\u0413\7F\2\2\u0409\u040a"+
		"\7G\2\2\u040a\u0413\7T\2\2\u040b\u040c\7Q\2\2\u040c\u0413\7Y\2\2\u040d"+
		"\u040e\7K\2\2\u040e\u040f\7P\2\2\u040f\u0413\7I\2\2\u0410\u0411\7C\2\2"+
		"\u0411\u0413\7T\2\2\u0412\u03f9\3\2\2\2\u0412\u03fb\3\2\2\2\u0412\u03fd"+
		"\3\2\2\2\u0412\u03ff\3\2\2\2\u0412\u0401\3\2\2\2\u0412\u0403\3\2\2\2\u0412"+
		"\u0405\3\2\2\2\u0412\u0407\3\2\2\2\u0412\u0409\3\2\2\2\u0412\u040b\3\2"+
		"\2\2\u0412\u040d\3\2\2\2\u0412\u0410\3\2\2\2\u0413\u0414\3\2\2\2\u0414"+
		"\u0415\bJ.\2\u0415\u0094\3\2\2\2\u0416\u0417\7o\2\2\u0417\u0418\7g\2\2"+
		"\u0418\u0419\7p\2\2\u0419\u0444\7v\2\2\u041a\u041b\7h\2\2\u041b\u041c"+
		"\7w\2\2\u041c\u0444\7n\2\2\u041d\u041e\7q\2\2\u041e\u041f\7p\2\2\u041f"+
		"\u0444\7i\2\2\u0420\u0421\7k\2\2\u0421\u0422\7v\2\2\u0422\u0444\7{\2\2"+
		"\u0423\u0424\7c\2\2\u0424\u0425\7p\2\2\u0425\u0426\7e\2\2\u0426\u0444"+
		"\7g\2\2\u0427\u0428\7g\2\2\u0428\u0429\7p\2\2\u0429\u042a\7e\2\2\u042a"+
		"\u0444\7g\2\2\u042b\u042c\7q\2\2\u042c\u042d\7w\2\2\u042d\u042e\7p\2\2"+
		"\u042e\u0444\7f\2\2\u042f\u0430\7q\2\2\u0430\u0431\7w\2\2\u0431\u0432"+
		"\7p\2\2\u0432\u0444\7v\2\2\u0433\u0434\7n\2\2\u0434\u0435\7g\2\2\u0435"+
		"\u0436\7u\2\2\u0436\u0444\7u\2\2\u0437\u0438\7p\2\2\u0438\u0439\7g\2\2"+
		"\u0439\u043a\7u\2\2\u043a\u0444\7u\2\2\u043b\u043c\7u\2\2\u043c\u043d"+
		"\7k\2\2\u043d\u043e\7q\2\2\u043e\u0444\7p\2\2\u043f\u0440\7v\2\2\u0440"+
		"\u0441\7k\2\2\u0441\u0442\7q\2\2\u0442\u0444\7p\2\2\u0443\u0416\3\2\2"+
		"\2\u0443\u041a\3\2\2\2\u0443\u041d\3\2\2\2\u0443\u0420\3\2\2\2\u0443\u0423"+
		"\3\2\2\2\u0443\u0427\3\2\2\2\u0443\u042b\3\2\2\2\u0443\u042f\3\2\2\2\u0443"+
		"\u0433\3\2\2\2\u0443\u0437\3\2\2\2\u0443\u043b\3\2\2\2\u0443\u043f\3\2"+
		"\2\2\u0444\u0445\3\2\2\2\u0445\u0446\6K\2\2\u0446\u0096\3\2\2\2\u0447"+
		"\u0448\7O\2\2\u0448\u0449\7g\2\2\u0449\u044a\7p\2\2\u044a\u0475\7v\2\2"+
		"\u044b\u044c\7H\2\2\u044c\u044d\7w\2\2\u044d\u0475\7n\2\2\u044e\u044f"+
		"\7Q\2\2\u044f\u0450\7p\2\2\u0450\u0475\7i\2\2\u0451\u0452\7K\2\2\u0452"+
		"\u0453\7v\2\2\u0453\u0475\7{\2\2\u0454\u0455\7C\2\2\u0455\u0456\7p\2\2"+
		"\u0456\u0457\7e\2\2\u0457\u0475\7g\2\2\u0458\u0459\7G\2\2\u0459\u045a"+
		"\7p\2\2\u045a\u045b\7e\2\2\u045b\u0475\7g\2\2\u045c\u045d\7Q\2\2\u045d"+
		"\u045e\7w\2\2\u045e\u045f\7p\2\2\u045f\u0475\7f\2\2\u0460\u0461\7Q\2\2"+
		"\u0461\u0462\7w\2\2\u0462\u0463\7p\2\2\u0463\u0475\7v\2\2\u0464\u0465"+
		"\7N\2\2\u0465\u0466\7g\2\2\u0466\u0467\7u\2\2\u0467\u0475\7u\2\2\u0468"+
		"\u0469\7P\2\2\u0469\u046a\7g\2\2\u046a\u046b\7u\2\2\u046b\u0475\7u\2\2"+
		"\u046c\u046d\7U\2\2\u046d\u046e\7k\2\2\u046e\u046f\7q\2\2\u046f\u0475"+
		"\7p\2\2\u0470\u0471\7V\2\2\u0471\u0472\7k\2\2\u0472\u0473\7q\2\2\u0473"+
		"\u0475\7p\2\2\u0474\u0447\3\2\2\2\u0474\u044b\3\2\2\2\u0474\u044e\3\2"+
		"\2\2\u0474\u0451\3\2\2\2\u0474\u0454\3\2\2\2\u0474\u0458\3\2\2\2\u0474"+
		"\u045c\3\2\2\2\u0474\u0460\3\2\2\2\u0474\u0464\3\2\2\2\u0474\u0468\3\2"+
		"\2\2\u0474\u046c\3\2\2\2\u0474\u0470\3\2\2\2\u0475\u0476\3\2\2\2\u0476"+
		"\u0477\6L\3\2\u0477\u0098\3\2\2\2\u0478\u0479\7O\2\2\u0479\u047a\7G\2"+
		"\2\u047a\u047b\7P\2\2\u047b\u04a6\7V\2\2\u047c\u047d\7H\2\2\u047d\u047e"+
		"\7W\2\2\u047e\u04a6\7N\2\2\u047f\u0480\7Q\2\2\u0480\u0481\7P\2\2\u0481"+
		"\u04a6\7I\2\2\u0482\u0483\7K\2\2\u0483\u0484\7V\2\2\u0484\u04a6\7[\2\2"+
		"\u0485\u0486\7C\2\2\u0486\u0487\7P\2\2\u0487\u0488\7E\2\2\u0488\u04a6"+
		"\7G\2\2\u0489\u048a\7G\2\2\u048a\u048b\7P\2\2\u048b\u048c\7E\2\2\u048c"+
		"\u04a6\7G\2\2\u048d\u048e\7Q\2\2\u048e\u048f\7W\2\2\u048f\u0490\7P\2\2"+
		"\u0490\u04a6\7F\2\2\u0491\u0492\7Q\2\2\u0492\u0493\7W\2\2\u0493\u0494"+
		"\7P\2\2\u0494\u04a6\7V\2\2\u0495\u0496\7N\2\2\u0496\u0497\7G\2\2\u0497"+
		"\u0498\7U\2\2\u0498\u04a6\7U\2\2\u0499\u049a\7P\2\2\u049a\u049b\7G\2\2"+
		"\u049b\u049c\7U\2\2\u049c\u04a6\7U\2\2\u049d\u049e\7U\2\2\u049e\u049f"+
		"\7K\2\2\u049f\u04a0\7Q\2\2\u04a0\u04a6\7P\2\2\u04a1\u04a2\7V\2\2\u04a2"+
		"\u04a3\7K\2\2\u04a3\u04a4\7Q\2\2\u04a4\u04a6\7P\2\2\u04a5\u0478\3\2\2"+
		"\2\u04a5\u047c\3\2\2\2\u04a5\u047f\3\2\2\2\u04a5\u0482\3\2\2\2\u04a5\u0485"+
		"\3\2\2\2\u04a5\u0489\3\2\2\2\u04a5\u048d\3\2\2\2\u04a5\u0491\3\2\2\2\u04a5"+
		"\u0495\3\2\2\2\u04a5\u0499\3\2\2\2\u04a5\u049d\3\2\2\2\u04a5\u04a1\3\2"+
		"\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\6M\4\2\u04a8\u009a\3\2\2\2\u04a9"+
		"\u04aa\7E\2\2\u04aa\u04ab\7q\2\2\u04ab\u04b0\7p\2\2\u04ac\u04ad\7F\2\2"+
		"\u04ad\u04ae\7k\2\2\u04ae\u04b0\7u\2\2\u04af\u04a9\3\2\2\2\u04af\u04ac"+
		"\3\2\2\2\u04b0\u009c\3\2\2\2\u04b1\u04b2\7E\2\2\u04b2\u04b3\7Q\2\2\u04b3"+
		"\u04b8\7P\2\2\u04b4\u04b5\7F\2\2\u04b5\u04b6\7K\2\2\u04b6\u04b8\7U\2\2"+
		"\u04b7\u04b1\3\2\2\2\u04b7\u04b4\3\2\2\2\u04b8\u009e\3\2\2\2\u04b9\u04ba"+
		"\7g\2\2\u04ba\u04c4\7c\2\2\u04bb\u04bc\7d\2\2\u04bc\u04c4\7d\2\2\u04bd"+
		"\u04be\7e\2\2\u04be\u04c4\7e\2\2\u04bf\u04c0\7h\2\2\u04c0\u04c4\7h\2\2"+
		"\u04c1\u04c2\7i\2\2\u04c2\u04c4\7i\2\2\u04c3\u04b9\3\2\2\2\u04c3\u04bb"+
		"\3\2\2\2\u04c3\u04bd\3\2\2\2\u04c3\u04bf\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4"+
		"\u00a0\3\2\2\2\u04c5\u04c6\7G\2\2\u04c6\u04d0\7c\2\2\u04c7\u04c8\7D\2"+
		"\2\u04c8\u04d0\7d\2\2\u04c9\u04ca\7E\2\2\u04ca\u04d0\7e\2\2\u04cb\u04cc"+
		"\7H\2\2\u04cc\u04d0\7h\2\2\u04cd\u04ce\7I\2\2\u04ce\u04d0\7i\2\2\u04cf"+
		"\u04c5\3\2\2\2\u04cf\u04c7\3\2\2\2\u04cf\u04c9\3\2\2\2\u04cf\u04cb\3\2"+
		"\2\2\u04cf\u04cd\3\2\2\2\u04d0\u00a2\3\2\2\2\u04d1\u04d2\7G\2\2\u04d2"+
		"\u04dc\7C\2\2\u04d3\u04d4\7D\2\2\u04d4\u04dc\7D\2\2\u04d5\u04d6\7E\2\2"+
		"\u04d6\u04dc\7E\2\2\u04d7\u04d8\7H\2\2\u04d8\u04dc\7H\2\2\u04d9\u04da"+
		"\7I\2\2\u04da\u04dc\7I\2\2\u04db\u04d1\3\2\2\2\u04db\u04d3\3\2\2\2\u04db"+
		"\u04d5\3\2\2\2\u04db\u04d7\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u00a4\3\2"+
		"\2\2\u04dd\u04de\7\u2016\2\2\u04de\u04df\bS/\2\u04df\u00a6\3\2\2\2\u04e0"+
		"\u04e1\7\u2015\2\2\u04e1\u04e2\bT\60\2\u04e2\u00a8\3\2\2\2\u04e3\u04e4"+
		"\7\u201e\2\2\u04e4\u00aa\3\2\2\2\u04e5\u04e6\7\u201f\2\2\u04e6\u00ac\3"+
		"\2\2\2\u04e7\u04e8\7\u201a\2\2\u04e8\u00ae\3\2\2\2\u04e9\u04ea\7\u201b"+
		"\2\2\u04ea\u00b0\3\2\2\2\u04eb\u04ec\7\"\2\2\u04ec\u00b2\3\2\2\2\u04ed"+
		"\u04ee\5\u00b1Y\2\u04ee\u04ef\bZ\61\2\u04ef\u00b4\3\2\2\2\u04f0\u04f2"+
		"\t\b\2\2\u04f1\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u00b6\3\2\2\2\u04f5\u04f6\5\u00b5[\2\u04f6\u04f7"+
		"\b\\\62\2\u04f7\u00b8\3\2\2\2\36\2\u00f6\u0108\u011a\u012b\u013e\u0151"+
		"\u016c\u0187\u01a2\u01c3\u01e4\u0205\u0275\u02e5\u0355\u03d8\u03f5\u0412"+
		"\u0443\u0474\u04a5\u04af\u04b7\u04c3\u04cf\u04db\u04f3\63\3\f\2\3\25\3"+
		"\3\26\4\3\32\5\3\33\6\3\34\7\3\35\b\3\36\t\3\37\n\3 \13\3!\f\3\"\r\3#"+
		"\16\3$\17\3%\20\3&\21\3\'\22\3(\23\3)\24\3*\25\3+\26\3,\27\3-\30\3.\31"+
		"\3/\32\3\60\33\3\61\34\3\62\35\3\63\36\3\64\37\3\65 \3\66!\3\67\"\38#"+
		"\39$\3:%\3;&\3<\'\3=(\3>)\3?*\3@+\3H,\3I-\3J.\3S/\3T\60\3Z\61\3\\\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}