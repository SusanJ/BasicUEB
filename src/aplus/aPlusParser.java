// Generated from aPlusParser.g4 by ANTLR 4.7.1
 package aplus; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		APLUSstag=1, NAME=2, END_APLUS=3, MY_OPEN=4, ZERO=5, ONE=6, TWO=7, THREE=8, 
		FOUR=9, FIVE=10, SIX=11, SEVEN=12, EIGHT=13, NINE=14, OFENCE=15, CFENCE=16, 
		NEU=17, PERIODorDEC=18, SEMICOLON=19, PUNC=20, SPEC=21, FSLASH=22, BACK_TICK=23, 
		HYP=24, USCORE=25, WEIRD=26, WEIRD_TC=27, WEIRD_UC=28, LARGE=29, LARGE_TC=30, 
		LARGE_UC=31, ILC45=32, ILC45_TC=33, ILC45_UC=34, ILC456=35, ILC456_TC=36, 
		ILC456_UC=37, ILC5=38, ILC5_TC=39, ILC5_UC=40, LETTERA=41, LETTERB=42, 
		LETTERC=43, LETTERD=44, LETTERE=45, LETTERF=46, LETTERG=47, LETTERH=48, 
		LETTERI=49, LETTERJ=50, LETTERK=51, LETTERL=52, LETTERM=53, LETTERN=54, 
		LETTERO=55, LETTERP=56, LETTERQ=57, LETTERR=58, LETTERS=59, LETTERT=60, 
		LETTERU=61, LETTERV=62, LETTERW=63, LETTERX=64, LETTERY=65, LETTERZ=66, 
		CAPS=67, BE_TC=68, EN=69, EN_TC=70, EN_UC=71, IN=72, IN_TC=73, IN_UC=74, 
		STRONG_GS=75, STRONG_GS_TC=76, STRONG_GS_UC=77, FLC=78, FLC_TC=79, FLC_UC=80, 
		BEGCON_TC=81, BEGCON_UC=82, MIDCON=83, MIDCON_TC=84, MIDCON_UC=85, MDASH=86, 
		NDASH=87, ODQUO=88, CDQUO=89, OSQUO=90, CSQUO=91, SPACE=92, NEWLINE=93, 
		LATIN_LETTER=94, FUN_NAME=95;
	public static final int
		RULE_text = 0, RULE_line = 1, RULE_aplus = 2, RULE_psymseq = 3, RULE_psymseq_uc = 4, 
		RULE_symseq = 5, RULE_symseq_uc = 6, RULE_alphaseq = 7, RULE_uc_seq = 8, 
		RULE_letterseq = 9, RULE_conword = 10, RULE_conwordUC = 11, RULE_space = 12, 
		RULE_separator = 13, RULE_freq_uc = 14, RULE_freqword = 15, RULE_small = 16, 
		RULE_g1Letter = 17, RULE_word = 18, RULE_tc_word = 19, RULE_uc_word = 20, 
		RULE_startconword = 21, RULE_startconWordUC = 22, RULE_midconword = 23, 
		RULE_midconworduc = 24, RULE_midendconword = 25, RULE_midendconworduc = 26, 
		RULE_period = 27, RULE_semicolon = 28, RULE_spunc = 29, RULE_epunc = 30, 
		RULE_not_lc = 31, RULE_uc_let = 32, RULE_begCon = 33, RULE_midCon = 34, 
		RULE_midConUC = 35, RULE_begConTC = 36, RULE_startConTC = 37, RULE_anywhereCon = 38, 
		RULE_anywhereConUC = 39, RULE_midEndCon = 40, RULE_midEndConUC = 41, RULE_startNum = 42, 
		RULE_startDec = 43, RULE_dig = 44, RULE_decpt = 45, RULE_integer = 46, 
		RULE_real = 47, RULE_number = 48, RULE_literal = 49;
	public static final String[] ruleNames = {
		"text", "line", "aplus", "psymseq", "psymseq_uc", "symseq", "symseq_uc", 
		"alphaseq", "uc_seq", "letterseq", "conword", "conwordUC", "space", "separator", 
		"freq_uc", "freqword", "small", "g1Letter", "word", "tc_word", "uc_word", 
		"startconword", "startconWordUC", "midconword", "midconworduc", "midendconword", 
		"midendconworduc", "period", "semicolon", "spunc", "epunc", "not_lc", 
		"uc_let", "begCon", "midCon", "midConUC", "begConTC", "startConTC", "anywhereCon", 
		"anywhereConUC", "midEndCon", "midEndConUC", "startNum", "startDec", "dig", 
		"decpt", "integer", "real", "number", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<aplus>'", "'Susan Jolly'", "'</aplus>'", "'<'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", null, null, null, 
		"'.'", "';'", null, null, "'/'", "'`'", "'-'", "'_'", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", 
		"'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", 
		"'u'", "'v'", "'w'", "'x'", "'y'", "'z'", null, "'Be'", "'en'", "'En'", 
		"'EN'", "'in'", "'In'", "'IN'", null, null, null, null, null, null, null, 
		null, null, null, null, "'\u2014'", "'\u2013'", "'\u201C'", "'\u201D'", 
		"'\u2018'", "'\u2019'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "APLUSstag", "NAME", "END_APLUS", "MY_OPEN", "ZERO", "ONE", "TWO", 
		"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "OFENCE", "CFENCE", 
		"NEU", "PERIODorDEC", "SEMICOLON", "PUNC", "SPEC", "FSLASH", "BACK_TICK", 
		"HYP", "USCORE", "WEIRD", "WEIRD_TC", "WEIRD_UC", "LARGE", "LARGE_TC", 
		"LARGE_UC", "ILC45", "ILC45_TC", "ILC45_UC", "ILC456", "ILC456_TC", "ILC456_UC", 
		"ILC5", "ILC5_TC", "ILC5_UC", "LETTERA", "LETTERB", "LETTERC", "LETTERD", 
		"LETTERE", "LETTERF", "LETTERG", "LETTERH", "LETTERI", "LETTERJ", "LETTERK", 
		"LETTERL", "LETTERM", "LETTERN", "LETTERO", "LETTERP", "LETTERQ", "LETTERR", 
		"LETTERS", "LETTERT", "LETTERU", "LETTERV", "LETTERW", "LETTERX", "LETTERY", 
		"LETTERZ", "CAPS", "BE_TC", "EN", "EN_TC", "EN_UC", "IN", "IN_TC", "IN_UC", 
		"STRONG_GS", "STRONG_GS_TC", "STRONG_GS_UC", "FLC", "FLC_TC", "FLC_UC", 
		"BEGCON_TC", "BEGCON_UC", "MIDCON", "MIDCON_TC", "MIDCON_UC", "MDASH", 
		"NDASH", "ODQUO", "CDQUO", "OSQUO", "CSQUO", "SPACE", "NEWLINE", "LATIN_LETTER", 
		"FUN_NAME"
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

	@Override
	public String getGrammarFileName() { return "aPlusParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 boolean line_cont = false; 
	public aPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TextContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				line();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APLUSstag) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << OFENCE) | (1L << CFENCE) | (1L << NEU) | (1L << PERIODorDEC) | (1L << SEMICOLON) | (1L << PUNC) | (1L << SPEC) | (1L << FSLASH) | (1L << WEIRD) | (1L << WEIRD_TC) | (1L << LARGE) | (1L << LARGE_TC) | (1L << LARGE_UC) | (1L << ILC45) | (1L << ILC45_TC) | (1L << ILC45_UC) | (1L << ILC456) | (1L << ILC456_TC) | (1L << ILC456_UC) | (1L << ILC5) | (1L << ILC5_TC) | (1L << ILC5_UC) | (1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LETTERX - 64)) | (1L << (LETTERY - 64)) | (1L << (LETTERZ - 64)) | (1L << (CAPS - 64)) | (1L << (BE_TC - 64)) | (1L << (EN - 64)) | (1L << (EN_TC - 64)) | (1L << (EN_UC - 64)) | (1L << (IN - 64)) | (1L << (IN_TC - 64)) | (1L << (IN_UC - 64)) | (1L << (STRONG_GS - 64)) | (1L << (STRONG_GS_TC - 64)) | (1L << (STRONG_GS_UC - 64)) | (1L << (BEGCON_TC - 64)) | (1L << (MDASH - 64)) | (1L << (NDASH - 64)) | (1L << (ODQUO - 64)) | (1L << (CDQUO - 64)) | (1L << (SPACE - 64)) | (1L << (NEWLINE - 64)))) != 0) );
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(aPlusParser.NEWLINE, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<PsymseqContext> psymseq() {
			return getRuleContexts(PsymseqContext.class);
		}
		public PsymseqContext psymseq(int i) {
			return getRuleContext(PsymseqContext.class,i);
		}
		public List<Psymseq_ucContext> psymseq_uc() {
			return getRuleContexts(Psymseq_ucContext.class);
		}
		public Psymseq_ucContext psymseq_uc(int i) {
			return getRuleContext(Psymseq_ucContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public AplusContext aplus() {
			return getRuleContext(AplusContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			int _alt;
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(105);
					space();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(111);
					psymseq();
					}
					break;
				case 2:
					{
					setState(112);
					psymseq_uc();
					}
					break;
				}
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(115);
								separator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(118); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(122);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(120);
							psymseq();
							}
							break;
						case 2:
							{
							setState(121);
							psymseq_uc();
							}
							break;
						}
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(129);
					space();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				aplus();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(138);
					space();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(144);
				match(NEWLINE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(146);
					space();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(NEWLINE);
				}
				break;
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

	public static class AplusContext extends ParserRuleContext {
		public TerminalNode APLUSstag() { return getToken(aPlusParser.APLUSstag, 0); }
		public AplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterAplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitAplus(this);
		}
	}

	public final AplusContext aplus() throws RecognitionException {
		AplusContext _localctx = new AplusContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aplus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(APLUSstag);
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

	public static class PsymseqContext extends ParserRuleContext {
		public SymseqContext symseq() {
			return getRuleContext(SymseqContext.class,0);
		}
		public List<SpuncContext> spunc() {
			return getRuleContexts(SpuncContext.class);
		}
		public SpuncContext spunc(int i) {
			return getRuleContext(SpuncContext.class,i);
		}
		public List<EpuncContext> epunc() {
			return getRuleContexts(EpuncContext.class);
		}
		public EpuncContext epunc(int i) {
			return getRuleContext(EpuncContext.class,i);
		}
		public PsymseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_psymseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterPsymseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitPsymseq(this);
		}
	}

	public final PsymseqContext psymseq() throws RecognitionException {
		PsymseqContext _localctx = new PsymseqContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_psymseq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OFENCE) | (1L << NEU) | (1L << PUNC))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MDASH - 86)) | (1L << (NDASH - 86)) | (1L << (ODQUO - 86)))) != 0)) {
				{
				{
				setState(157);
				spunc();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			symseq();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					epunc();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
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

	public static class Psymseq_ucContext extends ParserRuleContext {
		public Symseq_ucContext symseq_uc() {
			return getRuleContext(Symseq_ucContext.class,0);
		}
		public List<SpuncContext> spunc() {
			return getRuleContexts(SpuncContext.class);
		}
		public SpuncContext spunc(int i) {
			return getRuleContext(SpuncContext.class,i);
		}
		public List<EpuncContext> epunc() {
			return getRuleContexts(EpuncContext.class);
		}
		public EpuncContext epunc(int i) {
			return getRuleContext(EpuncContext.class,i);
		}
		public Psymseq_ucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_psymseq_uc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterPsymseq_uc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitPsymseq_uc(this);
		}
	}

	public final Psymseq_ucContext psymseq_uc() throws RecognitionException {
		Psymseq_ucContext _localctx = new Psymseq_ucContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_psymseq_uc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					spunc();
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(176);
			symseq_uc();
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					epunc();
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
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

	public static class SymseqContext extends ParserRuleContext {
		public FreqwordContext freqword() {
			return getRuleContext(FreqwordContext.class,0);
		}
		public AlphaseqContext alphaseq() {
			return getRuleContext(AlphaseqContext.class,0);
		}
		public ConwordContext conword() {
			return getRuleContext(ConwordContext.class,0);
		}
		public SmallContext small() {
			return getRuleContext(SmallContext.class,0);
		}
		public LetterseqContext letterseq() {
			return getRuleContext(LetterseqContext.class,0);
		}
		public SymseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterSymseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitSymseq(this);
		}
	}

	public final SymseqContext symseq() throws RecognitionException {
		SymseqContext _localctx = new SymseqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_symseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(183);
				freqword();
				}
				break;
			case 2:
				{
				setState(184);
				alphaseq();
				}
				break;
			case 3:
				{
				setState(185);
				conword();
				}
				break;
			case 4:
				{
				setState(186);
				small();
				}
				break;
			case 5:
				{
				setState(187);
				letterseq();
				}
				break;
			}
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

	public static class Symseq_ucContext extends ParserRuleContext {
		public Freq_ucContext freq_uc() {
			return getRuleContext(Freq_ucContext.class,0);
		}
		public ConwordUCContext conwordUC() {
			return getRuleContext(ConwordUCContext.class,0);
		}
		public Uc_letContext uc_let() {
			return getRuleContext(Uc_letContext.class,0);
		}
		public Not_lcContext not_lc() {
			return getRuleContext(Not_lcContext.class,0);
		}
		public List<Uc_seqContext> uc_seq() {
			return getRuleContexts(Uc_seqContext.class);
		}
		public Uc_seqContext uc_seq(int i) {
			return getRuleContext(Uc_seqContext.class,i);
		}
		public Symseq_ucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symseq_uc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterSymseq_uc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitSymseq_uc(this);
		}
	}

	public final Symseq_ucContext symseq_uc() throws RecognitionException {
		Symseq_ucContext _localctx = new Symseq_ucContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_symseq_uc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(190);
				freq_uc();
				}
				break;
			case 2:
				{
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(191);
					uc_seq();
					}
					}
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAPS );
				}
				break;
			case 3:
				{
				setState(196);
				conwordUC();
				}
				break;
			case 4:
				{
				setState(197);
				uc_let();
				}
				break;
			case 5:
				{
				setState(198);
				not_lc();
				}
				break;
			}
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

	public static class AlphaseqContext extends ParserRuleContext {
		public List<SmallContext> small() {
			return getRuleContexts(SmallContext.class);
		}
		public SmallContext small(int i) {
			return getRuleContext(SmallContext.class,i);
		}
		public List<TerminalNode> HYP() { return getTokens(aPlusParser.HYP); }
		public TerminalNode HYP(int i) {
			return getToken(aPlusParser.HYP, i);
		}
		public AlphaseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphaseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterAlphaseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitAlphaseq(this);
		}
	}

	public final AlphaseqContext alphaseq() throws RecognitionException {
		AlphaseqContext _localctx = new AlphaseqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alphaseq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(201);
					small();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYP) {
				{
				{
				setState(206);
				match(HYP);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(212);
					small();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Uc_seqContext extends ParserRuleContext {
		public List<Uc_letContext> uc_let() {
			return getRuleContexts(Uc_letContext.class);
		}
		public Uc_letContext uc_let(int i) {
			return getRuleContext(Uc_letContext.class,i);
		}
		public List<TerminalNode> HYP() { return getTokens(aPlusParser.HYP); }
		public TerminalNode HYP(int i) {
			return getToken(aPlusParser.HYP, i);
		}
		public Uc_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uc_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterUc_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitUc_seq(this);
		}
	}

	public final Uc_seqContext uc_seq() throws RecognitionException {
		Uc_seqContext _localctx = new Uc_seqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_uc_seq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(217);
					uc_let();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYP) {
				{
				{
				setState(222);
				match(HYP);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(228);
					uc_let();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class LetterseqContext extends ParserRuleContext {
		public List<SmallContext> small() {
			return getRuleContexts(SmallContext.class);
		}
		public SmallContext small(int i) {
			return getRuleContext(SmallContext.class,i);
		}
		public List<Uc_letContext> uc_let() {
			return getRuleContexts(Uc_letContext.class);
		}
		public Uc_letContext uc_let(int i) {
			return getRuleContext(Uc_letContext.class,i);
		}
		public LetterseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letterseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterLetterseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitLetterseq(this);
		}
	}

	public final LetterseqContext letterseq() throws RecognitionException {
		LetterseqContext _localctx = new LetterseqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_letterseq);
		int _la;
		try {
			int _alt;
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case LETTERC:
			case LETTERD:
			case LETTERE:
			case LETTERF:
			case LETTERG:
			case LETTERH:
			case LETTERI:
			case LETTERJ:
			case LETTERK:
			case LETTERL:
			case LETTERM:
			case LETTERN:
			case LETTERO:
			case LETTERP:
			case LETTERQ:
			case LETTERR:
			case LETTERS:
			case LETTERT:
			case LETTERU:
			case LETTERV:
			case LETTERW:
			case LETTERX:
			case LETTERY:
			case LETTERZ:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(233);
					small();
					}
					}
					setState(236); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LETTERA - 41)) | (1L << (LETTERB - 41)) | (1L << (LETTERC - 41)) | (1L << (LETTERD - 41)) | (1L << (LETTERE - 41)) | (1L << (LETTERF - 41)) | (1L << (LETTERG - 41)) | (1L << (LETTERH - 41)) | (1L << (LETTERI - 41)) | (1L << (LETTERJ - 41)) | (1L << (LETTERK - 41)) | (1L << (LETTERL - 41)) | (1L << (LETTERM - 41)) | (1L << (LETTERN - 41)) | (1L << (LETTERO - 41)) | (1L << (LETTERP - 41)) | (1L << (LETTERQ - 41)) | (1L << (LETTERR - 41)) | (1L << (LETTERS - 41)) | (1L << (LETTERT - 41)) | (1L << (LETTERU - 41)) | (1L << (LETTERV - 41)) | (1L << (LETTERW - 41)) | (1L << (LETTERX - 41)) | (1L << (LETTERY - 41)) | (1L << (LETTERZ - 41)))) != 0) );
				setState(239); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(238);
						uc_let();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(241); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LETTERA - 41)) | (1L << (LETTERB - 41)) | (1L << (LETTERC - 41)) | (1L << (LETTERD - 41)) | (1L << (LETTERE - 41)) | (1L << (LETTERF - 41)) | (1L << (LETTERG - 41)) | (1L << (LETTERH - 41)) | (1L << (LETTERI - 41)) | (1L << (LETTERJ - 41)) | (1L << (LETTERK - 41)) | (1L << (LETTERL - 41)) | (1L << (LETTERM - 41)) | (1L << (LETTERN - 41)) | (1L << (LETTERO - 41)) | (1L << (LETTERP - 41)) | (1L << (LETTERQ - 41)) | (1L << (LETTERR - 41)) | (1L << (LETTERS - 41)) | (1L << (LETTERT - 41)) | (1L << (LETTERU - 41)) | (1L << (LETTERV - 41)) | (1L << (LETTERW - 41)) | (1L << (LETTERX - 41)) | (1L << (LETTERY - 41)) | (1L << (LETTERZ - 41)) | (1L << (CAPS - 41)))) != 0)) {
					{
					setState(245);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTERA:
					case LETTERB:
					case LETTERC:
					case LETTERD:
					case LETTERE:
					case LETTERF:
					case LETTERG:
					case LETTERH:
					case LETTERI:
					case LETTERJ:
					case LETTERK:
					case LETTERL:
					case LETTERM:
					case LETTERN:
					case LETTERO:
					case LETTERP:
					case LETTERQ:
					case LETTERR:
					case LETTERS:
					case LETTERT:
					case LETTERU:
					case LETTERV:
					case LETTERW:
					case LETTERX:
					case LETTERY:
					case LETTERZ:
						{
						setState(243);
						small();
						}
						break;
					case CAPS:
						{
						setState(244);
						uc_let();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case CAPS:
				enterOuterAlt(_localctx, 2);
				{
				{
				{
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					uc_let();
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAPS );
				setState(256); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(255);
						small();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(258); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LETTERA - 41)) | (1L << (LETTERB - 41)) | (1L << (LETTERC - 41)) | (1L << (LETTERD - 41)) | (1L << (LETTERE - 41)) | (1L << (LETTERF - 41)) | (1L << (LETTERG - 41)) | (1L << (LETTERH - 41)) | (1L << (LETTERI - 41)) | (1L << (LETTERJ - 41)) | (1L << (LETTERK - 41)) | (1L << (LETTERL - 41)) | (1L << (LETTERM - 41)) | (1L << (LETTERN - 41)) | (1L << (LETTERO - 41)) | (1L << (LETTERP - 41)) | (1L << (LETTERQ - 41)) | (1L << (LETTERR - 41)) | (1L << (LETTERS - 41)) | (1L << (LETTERT - 41)) | (1L << (LETTERU - 41)) | (1L << (LETTERV - 41)) | (1L << (LETTERW - 41)) | (1L << (LETTERX - 41)) | (1L << (LETTERY - 41)) | (1L << (LETTERZ - 41)) | (1L << (CAPS - 41)))) != 0)) {
					{
					setState(262);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTERA:
					case LETTERB:
					case LETTERC:
					case LETTERD:
					case LETTERE:
					case LETTERF:
					case LETTERG:
					case LETTERH:
					case LETTERI:
					case LETTERJ:
					case LETTERK:
					case LETTERL:
					case LETTERM:
					case LETTERN:
					case LETTERO:
					case LETTERP:
					case LETTERQ:
					case LETTERR:
					case LETTERS:
					case LETTERT:
					case LETTERU:
					case LETTERV:
					case LETTERW:
					case LETTERX:
					case LETTERY:
					case LETTERZ:
						{
						setState(260);
						small();
						}
						break;
					case CAPS:
						{
						setState(261);
						uc_let();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ConwordContext extends ParserRuleContext {
		public StartconwordContext startconword() {
			return getRuleContext(StartconwordContext.class,0);
		}
		public List<MidConContext> midCon() {
			return getRuleContexts(MidConContext.class);
		}
		public MidConContext midCon(int i) {
			return getRuleContext(MidConContext.class,i);
		}
		public List<MidendconwordContext> midendconword() {
			return getRuleContexts(MidendconwordContext.class);
		}
		public MidendconwordContext midendconword(int i) {
			return getRuleContext(MidendconwordContext.class,i);
		}
		public ConwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterConword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitConword(this);
		}
	}

	public final ConwordContext conword() throws RecognitionException {
		ConwordContext _localctx = new ConwordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conword);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			startconword();
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(272);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MIDCON:
						{
						setState(270);
						midCon();
						}
						break;
					case LARGE:
					case ILC45:
					case ILC456:
					case ILC5:
					case LETTERA:
					case LETTERB:
					case LETTERC:
					case LETTERD:
					case LETTERE:
					case LETTERF:
					case LETTERG:
					case LETTERH:
					case LETTERI:
					case LETTERJ:
					case LETTERK:
					case LETTERL:
					case LETTERM:
					case LETTERN:
					case LETTERO:
					case LETTERP:
					case LETTERQ:
					case LETTERR:
					case LETTERS:
					case LETTERT:
					case LETTERU:
					case LETTERV:
					case LETTERW:
					case LETTERX:
					case LETTERY:
					case LETTERZ:
					case EN:
					case IN:
					case STRONG_GS:
					case FLC:
						{
						setState(271);
						midendconword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				midendconword();
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (LARGE - 29)) | (1L << (ILC45 - 29)) | (1L << (ILC456 - 29)) | (1L << (ILC5 - 29)) | (1L << (LETTERA - 29)) | (1L << (LETTERB - 29)) | (1L << (LETTERC - 29)) | (1L << (LETTERD - 29)) | (1L << (LETTERE - 29)) | (1L << (LETTERF - 29)) | (1L << (LETTERG - 29)) | (1L << (LETTERH - 29)) | (1L << (LETTERI - 29)) | (1L << (LETTERJ - 29)) | (1L << (LETTERK - 29)) | (1L << (LETTERL - 29)) | (1L << (LETTERM - 29)) | (1L << (LETTERN - 29)) | (1L << (LETTERO - 29)) | (1L << (LETTERP - 29)) | (1L << (LETTERQ - 29)) | (1L << (LETTERR - 29)) | (1L << (LETTERS - 29)) | (1L << (LETTERT - 29)) | (1L << (LETTERU - 29)) | (1L << (LETTERV - 29)) | (1L << (LETTERW - 29)) | (1L << (LETTERX - 29)) | (1L << (LETTERY - 29)) | (1L << (LETTERZ - 29)) | (1L << (EN - 29)) | (1L << (IN - 29)) | (1L << (STRONG_GS - 29)) | (1L << (FLC - 29)))) != 0) );
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

	public static class ConwordUCContext extends ParserRuleContext {
		public StartconWordUCContext startconWordUC() {
			return getRuleContext(StartconWordUCContext.class,0);
		}
		public List<MidConUCContext> midConUC() {
			return getRuleContexts(MidConUCContext.class);
		}
		public MidConUCContext midConUC(int i) {
			return getRuleContext(MidConUCContext.class,i);
		}
		public List<MidendconworducContext> midendconworduc() {
			return getRuleContexts(MidendconworducContext.class);
		}
		public MidendconworducContext midendconworduc(int i) {
			return getRuleContext(MidendconworducContext.class,i);
		}
		public ConwordUCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conwordUC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterConwordUC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitConwordUC(this);
		}
	}

	public final ConwordUCContext conwordUC() throws RecognitionException {
		ConwordUCContext _localctx = new ConwordUCContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conwordUC);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			startconWordUC();
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(285);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MIDCON_UC:
						{
						setState(283);
						midConUC();
						}
						break;
					case LARGE_UC:
					case ILC45_UC:
					case ILC456_UC:
					case ILC5_UC:
					case CAPS:
					case EN_UC:
					case IN_UC:
					case STRONG_GS_UC:
					case FLC_UC:
						{
						setState(284);
						midendconworduc();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				midendconworduc();
				}
				}
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (LARGE_UC - 31)) | (1L << (ILC45_UC - 31)) | (1L << (ILC456_UC - 31)) | (1L << (ILC5_UC - 31)) | (1L << (CAPS - 31)) | (1L << (EN_UC - 31)) | (1L << (IN_UC - 31)) | (1L << (STRONG_GS_UC - 31)) | (1L << (FLC_UC - 31)))) != 0) );
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

	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(aPlusParser.SPACE, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(SPACE);
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

	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(aPlusParser.SPACE, 0); }
		public TerminalNode HYP() { return getToken(aPlusParser.HYP, 0); }
		public TerminalNode MDASH() { return getToken(aPlusParser.MDASH, 0); }
		public TerminalNode NDASH() { return getToken(aPlusParser.NDASH, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==HYP || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MDASH - 86)) | (1L << (NDASH - 86)) | (1L << (SPACE - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Freq_ucContext extends ParserRuleContext {
		public TerminalNode LARGE_UC() { return getToken(aPlusParser.LARGE_UC, 0); }
		public TerminalNode ILC45_UC() { return getToken(aPlusParser.ILC45_UC, 0); }
		public TerminalNode ILC456_UC() { return getToken(aPlusParser.ILC456_UC, 0); }
		public TerminalNode ILC5_UC() { return getToken(aPlusParser.ILC5_UC, 0); }
		public TerminalNode IN_UC() { return getToken(aPlusParser.IN_UC, 0); }
		public Freq_ucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freq_uc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterFreq_uc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitFreq_uc(this);
		}
	}

	public final Freq_ucContext freq_uc() throws RecognitionException {
		Freq_ucContext _localctx = new Freq_ucContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_freq_uc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (LARGE_UC - 31)) | (1L << (ILC45_UC - 31)) | (1L << (ILC456_UC - 31)) | (1L << (ILC5_UC - 31)) | (1L << (IN_UC - 31)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class FreqwordContext extends ParserRuleContext {
		public TerminalNode LARGE() { return getToken(aPlusParser.LARGE, 0); }
		public TerminalNode LARGE_TC() { return getToken(aPlusParser.LARGE_TC, 0); }
		public TerminalNode ILC45() { return getToken(aPlusParser.ILC45, 0); }
		public TerminalNode ILC45_TC() { return getToken(aPlusParser.ILC45_TC, 0); }
		public TerminalNode ILC456() { return getToken(aPlusParser.ILC456, 0); }
		public TerminalNode ILC456_TC() { return getToken(aPlusParser.ILC456_TC, 0); }
		public TerminalNode ILC5() { return getToken(aPlusParser.ILC5, 0); }
		public TerminalNode ILC5_TC() { return getToken(aPlusParser.ILC5_TC, 0); }
		public TerminalNode WEIRD() { return getToken(aPlusParser.WEIRD, 0); }
		public TerminalNode WEIRD_TC() { return getToken(aPlusParser.WEIRD_TC, 0); }
		public TerminalNode LETTERB() { return getToken(aPlusParser.LETTERB, 0); }
		public TerminalNode LETTERE() { return getToken(aPlusParser.LETTERE, 0); }
		public TerminalNode BE_TC() { return getToken(aPlusParser.BE_TC, 0); }
		public TerminalNode IN() { return getToken(aPlusParser.IN, 0); }
		public TerminalNode IN_TC() { return getToken(aPlusParser.IN_TC, 0); }
		public FreqwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freqword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterFreqword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitFreqword(this);
		}
	}

	public final FreqwordContext freqword() throws RecognitionException {
		FreqwordContext _localctx = new FreqwordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_freqword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE:
				{
				setState(301);
				match(LARGE);
				}
				break;
			case LARGE_TC:
				{
				setState(302);
				match(LARGE_TC);
				}
				break;
			case ILC45:
				{
				setState(303);
				match(ILC45);
				}
				break;
			case ILC45_TC:
				{
				setState(304);
				match(ILC45_TC);
				}
				break;
			case ILC456:
				{
				setState(305);
				match(ILC456);
				}
				break;
			case ILC456_TC:
				{
				setState(306);
				match(ILC456_TC);
				}
				break;
			case ILC5:
				{
				setState(307);
				match(ILC5);
				}
				break;
			case ILC5_TC:
				{
				setState(308);
				match(ILC5_TC);
				}
				break;
			case WEIRD:
				{
				setState(309);
				match(WEIRD);
				}
				break;
			case WEIRD_TC:
				{
				setState(310);
				match(WEIRD_TC);
				}
				break;
			case LETTERB:
				{
				setState(311);
				match(LETTERB);
				setState(312);
				match(LETTERE);
				}
				break;
			case BE_TC:
				{
				setState(313);
				match(BE_TC);
				}
				break;
			case IN:
				{
				setState(314);
				match(IN);
				}
				break;
			case IN_TC:
				{
				setState(315);
				match(IN_TC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class SmallContext extends ParserRuleContext {
		public TerminalNode LETTERA() { return getToken(aPlusParser.LETTERA, 0); }
		public TerminalNode LETTERB() { return getToken(aPlusParser.LETTERB, 0); }
		public TerminalNode LETTERC() { return getToken(aPlusParser.LETTERC, 0); }
		public TerminalNode LETTERD() { return getToken(aPlusParser.LETTERD, 0); }
		public TerminalNode LETTERE() { return getToken(aPlusParser.LETTERE, 0); }
		public TerminalNode LETTERF() { return getToken(aPlusParser.LETTERF, 0); }
		public TerminalNode LETTERG() { return getToken(aPlusParser.LETTERG, 0); }
		public TerminalNode LETTERH() { return getToken(aPlusParser.LETTERH, 0); }
		public TerminalNode LETTERI() { return getToken(aPlusParser.LETTERI, 0); }
		public TerminalNode LETTERJ() { return getToken(aPlusParser.LETTERJ, 0); }
		public TerminalNode LETTERK() { return getToken(aPlusParser.LETTERK, 0); }
		public TerminalNode LETTERL() { return getToken(aPlusParser.LETTERL, 0); }
		public TerminalNode LETTERM() { return getToken(aPlusParser.LETTERM, 0); }
		public TerminalNode LETTERN() { return getToken(aPlusParser.LETTERN, 0); }
		public TerminalNode LETTERO() { return getToken(aPlusParser.LETTERO, 0); }
		public TerminalNode LETTERP() { return getToken(aPlusParser.LETTERP, 0); }
		public TerminalNode LETTERQ() { return getToken(aPlusParser.LETTERQ, 0); }
		public TerminalNode LETTERR() { return getToken(aPlusParser.LETTERR, 0); }
		public TerminalNode LETTERS() { return getToken(aPlusParser.LETTERS, 0); }
		public TerminalNode LETTERT() { return getToken(aPlusParser.LETTERT, 0); }
		public TerminalNode LETTERU() { return getToken(aPlusParser.LETTERU, 0); }
		public TerminalNode LETTERV() { return getToken(aPlusParser.LETTERV, 0); }
		public TerminalNode LETTERW() { return getToken(aPlusParser.LETTERW, 0); }
		public TerminalNode LETTERX() { return getToken(aPlusParser.LETTERX, 0); }
		public TerminalNode LETTERY() { return getToken(aPlusParser.LETTERY, 0); }
		public TerminalNode LETTERZ() { return getToken(aPlusParser.LETTERZ, 0); }
		public SmallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterSmall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitSmall(this);
		}
	}

	public final SmallContext small() throws RecognitionException {
		SmallContext _localctx = new SmallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_small);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LETTERA - 41)) | (1L << (LETTERB - 41)) | (1L << (LETTERC - 41)) | (1L << (LETTERD - 41)) | (1L << (LETTERE - 41)) | (1L << (LETTERF - 41)) | (1L << (LETTERG - 41)) | (1L << (LETTERH - 41)) | (1L << (LETTERI - 41)) | (1L << (LETTERJ - 41)) | (1L << (LETTERK - 41)) | (1L << (LETTERL - 41)) | (1L << (LETTERM - 41)) | (1L << (LETTERN - 41)) | (1L << (LETTERO - 41)) | (1L << (LETTERP - 41)) | (1L << (LETTERQ - 41)) | (1L << (LETTERR - 41)) | (1L << (LETTERS - 41)) | (1L << (LETTERT - 41)) | (1L << (LETTERU - 41)) | (1L << (LETTERV - 41)) | (1L << (LETTERW - 41)) | (1L << (LETTERX - 41)) | (1L << (LETTERY - 41)) | (1L << (LETTERZ - 41)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class G1LetterContext extends ParserRuleContext {
		public TerminalNode LETTERA() { return getToken(aPlusParser.LETTERA, 0); }
		public TerminalNode LETTERB() { return getToken(aPlusParser.LETTERB, 0); }
		public TerminalNode LETTERC() { return getToken(aPlusParser.LETTERC, 0); }
		public TerminalNode LETTERD() { return getToken(aPlusParser.LETTERD, 0); }
		public TerminalNode LETTERE() { return getToken(aPlusParser.LETTERE, 0); }
		public TerminalNode LETTERF() { return getToken(aPlusParser.LETTERF, 0); }
		public TerminalNode LETTERG() { return getToken(aPlusParser.LETTERG, 0); }
		public TerminalNode LETTERH() { return getToken(aPlusParser.LETTERH, 0); }
		public TerminalNode LETTERI() { return getToken(aPlusParser.LETTERI, 0); }
		public TerminalNode LETTERJ() { return getToken(aPlusParser.LETTERJ, 0); }
		public G1LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g1Letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterG1Letter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitG1Letter(this);
		}
	}

	public final G1LetterContext g1Letter() throws RecognitionException {
		G1LetterContext _localctx = new G1LetterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_g1Letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class WordContext extends ParserRuleContext {
		public List<SmallContext> small() {
			return getRuleContexts(SmallContext.class);
		}
		public SmallContext small(int i) {
			return getRuleContext(SmallContext.class,i);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			small();
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				small();
				}
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LETTERA - 41)) | (1L << (LETTERB - 41)) | (1L << (LETTERC - 41)) | (1L << (LETTERD - 41)) | (1L << (LETTERE - 41)) | (1L << (LETTERF - 41)) | (1L << (LETTERG - 41)) | (1L << (LETTERH - 41)) | (1L << (LETTERI - 41)) | (1L << (LETTERJ - 41)) | (1L << (LETTERK - 41)) | (1L << (LETTERL - 41)) | (1L << (LETTERM - 41)) | (1L << (LETTERN - 41)) | (1L << (LETTERO - 41)) | (1L << (LETTERP - 41)) | (1L << (LETTERQ - 41)) | (1L << (LETTERR - 41)) | (1L << (LETTERS - 41)) | (1L << (LETTERT - 41)) | (1L << (LETTERU - 41)) | (1L << (LETTERV - 41)) | (1L << (LETTERW - 41)) | (1L << (LETTERX - 41)) | (1L << (LETTERY - 41)) | (1L << (LETTERZ - 41)))) != 0) );
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

	public static class Tc_wordContext extends ParserRuleContext {
		public TerminalNode CAPS() { return getToken(aPlusParser.CAPS, 0); }
		public List<SmallContext> small() {
			return getRuleContexts(SmallContext.class);
		}
		public SmallContext small(int i) {
			return getRuleContext(SmallContext.class,i);
		}
		public Tc_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tc_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterTc_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitTc_word(this);
		}
	}

	public final Tc_wordContext tc_word() throws RecognitionException {
		Tc_wordContext _localctx = new Tc_wordContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tc_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(CAPS);
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				small();
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LETTERA - 41)) | (1L << (LETTERB - 41)) | (1L << (LETTERC - 41)) | (1L << (LETTERD - 41)) | (1L << (LETTERE - 41)) | (1L << (LETTERF - 41)) | (1L << (LETTERG - 41)) | (1L << (LETTERH - 41)) | (1L << (LETTERI - 41)) | (1L << (LETTERJ - 41)) | (1L << (LETTERK - 41)) | (1L << (LETTERL - 41)) | (1L << (LETTERM - 41)) | (1L << (LETTERN - 41)) | (1L << (LETTERO - 41)) | (1L << (LETTERP - 41)) | (1L << (LETTERQ - 41)) | (1L << (LETTERR - 41)) | (1L << (LETTERS - 41)) | (1L << (LETTERT - 41)) | (1L << (LETTERU - 41)) | (1L << (LETTERV - 41)) | (1L << (LETTERW - 41)) | (1L << (LETTERX - 41)) | (1L << (LETTERY - 41)) | (1L << (LETTERZ - 41)))) != 0) );
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

	public static class Uc_wordContext extends ParserRuleContext {
		public List<TerminalNode> CAPS() { return getTokens(aPlusParser.CAPS); }
		public TerminalNode CAPS(int i) {
			return getToken(aPlusParser.CAPS, i);
		}
		public Uc_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uc_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterUc_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitUc_word(this);
		}
	}

	public final Uc_wordContext uc_word() throws RecognitionException {
		Uc_wordContext _localctx = new Uc_wordContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_uc_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(CAPS);
			setState(336); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(335);
				match(CAPS);
				}
				}
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CAPS );
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

	public static class StartconwordContext extends ParserRuleContext {
		public AnywhereConContext anywhereCon() {
			return getRuleContext(AnywhereConContext.class,0);
		}
		public BegConContext begCon() {
			return getRuleContext(BegConContext.class,0);
		}
		public StartConTCContext startConTC() {
			return getRuleContext(StartConTCContext.class,0);
		}
		public SmallContext small() {
			return getRuleContext(SmallContext.class,0);
		}
		public TerminalNode CAPS() { return getToken(aPlusParser.CAPS, 0); }
		public StartconwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startconword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterStartconword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitStartconword(this);
		}
	}

	public final StartconwordContext startconword() throws RecognitionException {
		StartconwordContext _localctx = new StartconwordContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_startconword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(340);
				anywhereCon();
				}
				break;
			case 2:
				{
				setState(341);
				begCon();
				}
				break;
			case 3:
				{
				setState(342);
				startConTC();
				}
				break;
			case 4:
				{
				setState(343);
				small();
				}
				break;
			case 5:
				{
				setState(344);
				match(CAPS);
				}
				break;
			}
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

	public static class StartconWordUCContext extends ParserRuleContext {
		public AnywhereConUCContext anywhereConUC() {
			return getRuleContext(AnywhereConUCContext.class,0);
		}
		public TerminalNode CAPS() { return getToken(aPlusParser.CAPS, 0); }
		public StartconWordUCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startconWordUC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterStartconWordUC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitStartconWordUC(this);
		}
	}

	public final StartconWordUCContext startconWordUC() throws RecognitionException {
		StartconWordUCContext _localctx = new StartconWordUCContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_startconWordUC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE_UC:
			case ILC45_UC:
			case ILC456_UC:
			case ILC5_UC:
			case EN_UC:
			case IN_UC:
			case STRONG_GS_UC:
				{
				setState(347);
				anywhereConUC();
				}
				break;
			case CAPS:
				{
				setState(348);
				match(CAPS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class MidconwordContext extends ParserRuleContext {
		public AnywhereConContext anywhereCon() {
			return getRuleContext(AnywhereConContext.class,0);
		}
		public MidConContext midCon() {
			return getRuleContext(MidConContext.class,0);
		}
		public MidEndConContext midEndCon() {
			return getRuleContext(MidEndConContext.class,0);
		}
		public SmallContext small() {
			return getRuleContext(SmallContext.class,0);
		}
		public TerminalNode HYP() { return getToken(aPlusParser.HYP, 0); }
		public MidconwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midconword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMidconword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMidconword(this);
		}
	}

	public final MidconwordContext midconword() throws RecognitionException {
		MidconwordContext _localctx = new MidconwordContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_midconword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE:
			case ILC45:
			case ILC456:
			case ILC5:
			case EN:
			case IN:
			case STRONG_GS:
				{
				setState(351);
				anywhereCon();
				}
				break;
			case MIDCON:
				{
				setState(352);
				midCon();
				}
				break;
			case FLC:
				{
				setState(353);
				midEndCon();
				}
				break;
			case LETTERA:
			case LETTERB:
			case LETTERC:
			case LETTERD:
			case LETTERE:
			case LETTERF:
			case LETTERG:
			case LETTERH:
			case LETTERI:
			case LETTERJ:
			case LETTERK:
			case LETTERL:
			case LETTERM:
			case LETTERN:
			case LETTERO:
			case LETTERP:
			case LETTERQ:
			case LETTERR:
			case LETTERS:
			case LETTERT:
			case LETTERU:
			case LETTERV:
			case LETTERW:
			case LETTERX:
			case LETTERY:
			case LETTERZ:
				{
				setState(354);
				small();
				}
				break;
			case HYP:
				{
				setState(355);
				match(HYP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class MidconworducContext extends ParserRuleContext {
		public AnywhereConUCContext anywhereConUC() {
			return getRuleContext(AnywhereConUCContext.class,0);
		}
		public MidConUCContext midConUC() {
			return getRuleContext(MidConUCContext.class,0);
		}
		public MidEndConUCContext midEndConUC() {
			return getRuleContext(MidEndConUCContext.class,0);
		}
		public TerminalNode CAPS() { return getToken(aPlusParser.CAPS, 0); }
		public TerminalNode HYP() { return getToken(aPlusParser.HYP, 0); }
		public MidconworducContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midconworduc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMidconworduc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMidconworduc(this);
		}
	}

	public final MidconworducContext midconworduc() throws RecognitionException {
		MidconworducContext _localctx = new MidconworducContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_midconworduc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE_UC:
			case ILC45_UC:
			case ILC456_UC:
			case ILC5_UC:
			case EN_UC:
			case IN_UC:
			case STRONG_GS_UC:
				{
				setState(358);
				anywhereConUC();
				}
				break;
			case MIDCON_UC:
				{
				setState(359);
				midConUC();
				}
				break;
			case FLC_UC:
				{
				setState(360);
				midEndConUC();
				}
				break;
			case CAPS:
				{
				setState(361);
				match(CAPS);
				}
				break;
			case HYP:
				{
				setState(362);
				match(HYP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class MidendconwordContext extends ParserRuleContext {
		public List<AnywhereConContext> anywhereCon() {
			return getRuleContexts(AnywhereConContext.class);
		}
		public AnywhereConContext anywhereCon(int i) {
			return getRuleContext(AnywhereConContext.class,i);
		}
		public List<MidEndConContext> midEndCon() {
			return getRuleContexts(MidEndConContext.class);
		}
		public MidEndConContext midEndCon(int i) {
			return getRuleContext(MidEndConContext.class,i);
		}
		public List<SmallContext> small() {
			return getRuleContexts(SmallContext.class);
		}
		public SmallContext small(int i) {
			return getRuleContext(SmallContext.class,i);
		}
		public MidendconwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midendconword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMidendconword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMidendconword(this);
		}
	}

	public final MidendconwordContext midendconword() throws RecognitionException {
		MidendconwordContext _localctx = new MidendconwordContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_midendconword);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(368);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LARGE:
					case ILC45:
					case ILC456:
					case ILC5:
					case EN:
					case IN:
					case STRONG_GS:
						{
						setState(365);
						anywhereCon();
						}
						break;
					case FLC:
						{
						setState(366);
						midEndCon();
						}
						break;
					case LETTERA:
					case LETTERB:
					case LETTERC:
					case LETTERD:
					case LETTERE:
					case LETTERF:
					case LETTERG:
					case LETTERH:
					case LETTERI:
					case LETTERJ:
					case LETTERK:
					case LETTERL:
					case LETTERM:
					case LETTERN:
					case LETTERO:
					case LETTERP:
					case LETTERQ:
					case LETTERR:
					case LETTERS:
					case LETTERT:
					case LETTERU:
					case LETTERV:
					case LETTERW:
					case LETTERX:
					case LETTERY:
					case LETTERZ:
						{
						setState(367);
						small();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(370); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class MidendconworducContext extends ParserRuleContext {
		public List<AnywhereConUCContext> anywhereConUC() {
			return getRuleContexts(AnywhereConUCContext.class);
		}
		public AnywhereConUCContext anywhereConUC(int i) {
			return getRuleContext(AnywhereConUCContext.class,i);
		}
		public List<MidEndConUCContext> midEndConUC() {
			return getRuleContexts(MidEndConUCContext.class);
		}
		public MidEndConUCContext midEndConUC(int i) {
			return getRuleContext(MidEndConUCContext.class,i);
		}
		public List<TerminalNode> CAPS() { return getTokens(aPlusParser.CAPS); }
		public TerminalNode CAPS(int i) {
			return getToken(aPlusParser.CAPS, i);
		}
		public MidendconworducContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midendconworduc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMidendconworduc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMidendconworduc(this);
		}
	}

	public final MidendconworducContext midendconworduc() throws RecognitionException {
		MidendconworducContext _localctx = new MidendconworducContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_midendconworduc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(375);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LARGE_UC:
					case ILC45_UC:
					case ILC456_UC:
					case ILC5_UC:
					case EN_UC:
					case IN_UC:
					case STRONG_GS_UC:
						{
						setState(372);
						anywhereConUC();
						}
						break;
					case FLC_UC:
						{
						setState(373);
						midEndConUC();
						}
						break;
					case CAPS:
						{
						setState(374);
						match(CAPS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(377); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class PeriodContext extends ParserRuleContext {
		public TerminalNode PERIODorDEC() { return getToken(aPlusParser.PERIODorDEC, 0); }
		public PeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterPeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitPeriod(this);
		}
	}

	public final PeriodContext period() throws RecognitionException {
		PeriodContext _localctx = new PeriodContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_period);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(PERIODorDEC);
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

	public static class SemicolonContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(aPlusParser.SEMICOLON, 0); }
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitSemicolon(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(SEMICOLON);
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

	public static class SpuncContext extends ParserRuleContext {
		public TerminalNode ODQUO() { return getToken(aPlusParser.ODQUO, 0); }
		public TerminalNode OFENCE() { return getToken(aPlusParser.OFENCE, 0); }
		public TerminalNode NEU() { return getToken(aPlusParser.NEU, 0); }
		public TerminalNode PUNC() { return getToken(aPlusParser.PUNC, 0); }
		public TerminalNode MDASH() { return getToken(aPlusParser.MDASH, 0); }
		public TerminalNode NDASH() { return getToken(aPlusParser.NDASH, 0); }
		public SpuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterSpunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitSpunc(this);
		}
	}

	public final SpuncContext spunc() throws RecognitionException {
		SpuncContext _localctx = new SpuncContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_spunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OFENCE) | (1L << NEU) | (1L << PUNC))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MDASH - 86)) | (1L << (NDASH - 86)) | (1L << (ODQUO - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class EpuncContext extends ParserRuleContext {
		public TerminalNode CDQUO() { return getToken(aPlusParser.CDQUO, 0); }
		public TerminalNode CFENCE() { return getToken(aPlusParser.CFENCE, 0); }
		public TerminalNode NEU() { return getToken(aPlusParser.NEU, 0); }
		public PeriodContext period() {
			return getRuleContext(PeriodContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public TerminalNode PUNC() { return getToken(aPlusParser.PUNC, 0); }
		public TerminalNode MDASH() { return getToken(aPlusParser.MDASH, 0); }
		public TerminalNode NDASH() { return getToken(aPlusParser.NDASH, 0); }
		public EpuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterEpunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitEpunc(this);
		}
	}

	public final EpuncContext epunc() throws RecognitionException {
		EpuncContext _localctx = new EpuncContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_epunc);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CDQUO:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(CDQUO);
				}
				break;
			case CFENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(CFENCE);
				}
				break;
			case NEU:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				match(NEU);
				}
				break;
			case PERIODorDEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				period();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				semicolon();
				}
				break;
			case PUNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
				match(PUNC);
				}
				break;
			case MDASH:
				enterOuterAlt(_localctx, 7);
				{
				setState(391);
				match(MDASH);
				}
				break;
			case NDASH:
				enterOuterAlt(_localctx, 8);
				{
				setState(392);
				match(NDASH);
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

	public static class Not_lcContext extends ParserRuleContext {
		public List<TerminalNode> SPEC() { return getTokens(aPlusParser.SPEC); }
		public TerminalNode SPEC(int i) {
			return getToken(aPlusParser.SPEC, i);
		}
		public List<TerminalNode> FSLASH() { return getTokens(aPlusParser.FSLASH); }
		public TerminalNode FSLASH(int i) {
			return getToken(aPlusParser.FSLASH, i);
		}
		public List<Uc_seqContext> uc_seq() {
			return getRuleContexts(Uc_seqContext.class);
		}
		public Uc_seqContext uc_seq(int i) {
			return getRuleContext(Uc_seqContext.class,i);
		}
		public List<Uc_letContext> uc_let() {
			return getRuleContexts(Uc_letContext.class);
		}
		public Uc_letContext uc_let(int i) {
			return getRuleContext(Uc_letContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<SpuncContext> spunc() {
			return getRuleContexts(SpuncContext.class);
		}
		public SpuncContext spunc(int i) {
			return getRuleContext(SpuncContext.class,i);
		}
		public List<EpuncContext> epunc() {
			return getRuleContexts(EpuncContext.class);
		}
		public EpuncContext epunc(int i) {
			return getRuleContext(EpuncContext.class,i);
		}
		public Not_lcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_lc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterNot_lc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitNot_lc(this);
		}
	}

	public final Not_lcContext not_lc() throws RecognitionException {
		Not_lcContext _localctx = new Not_lcContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_not_lc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(395);
						match(SPEC);
						}
						break;
					case 2:
						{
						setState(396);
						match(FSLASH);
						}
						break;
					case 3:
						{
						setState(397);
						uc_seq();
						}
						break;
					case 4:
						{
						setState(398);
						uc_let();
						}
						break;
					case 5:
						{
						setState(399);
						number();
						}
						break;
					case 6:
						{
						setState(400);
						spunc();
						}
						break;
					case 7:
						{
						setState(401);
						epunc();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(404); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class Uc_letContext extends ParserRuleContext {
		public TerminalNode CAPS() { return getToken(aPlusParser.CAPS, 0); }
		public Uc_letContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uc_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterUc_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitUc_let(this);
		}
	}

	public final Uc_letContext uc_let() throws RecognitionException {
		Uc_letContext _localctx = new Uc_letContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_uc_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(CAPS);
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

	public static class BegConContext extends ParserRuleContext {
		public TerminalNode LETTERB() { return getToken(aPlusParser.LETTERB, 0); }
		public TerminalNode LETTERE() { return getToken(aPlusParser.LETTERE, 0); }
		public TerminalNode LETTERC() { return getToken(aPlusParser.LETTERC, 0); }
		public TerminalNode LETTERO() { return getToken(aPlusParser.LETTERO, 0); }
		public TerminalNode LETTERN() { return getToken(aPlusParser.LETTERN, 0); }
		public TerminalNode LETTERD() { return getToken(aPlusParser.LETTERD, 0); }
		public TerminalNode LETTERI() { return getToken(aPlusParser.LETTERI, 0); }
		public TerminalNode LETTERS() { return getToken(aPlusParser.LETTERS, 0); }
		public BegConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begCon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterBegCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitBegCon(this);
		}
	}

	public final BegConContext begCon() throws RecognitionException {
		BegConContext _localctx = new BegConContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_begCon);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERB:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(408);
				match(LETTERB);
				setState(409);
				match(LETTERE);
				}
				}
				break;
			case LETTERC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(410);
				match(LETTERC);
				setState(411);
				match(LETTERO);
				setState(412);
				match(LETTERN);
				}
				}
				break;
			case LETTERD:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(413);
				match(LETTERD);
				setState(414);
				match(LETTERI);
				setState(415);
				match(LETTERS);
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

	public static class MidConContext extends ParserRuleContext {
		public TerminalNode MIDCON() { return getToken(aPlusParser.MIDCON, 0); }
		public MidConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midCon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMidCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMidCon(this);
		}
	}

	public final MidConContext midCon() throws RecognitionException {
		MidConContext _localctx = new MidConContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_midCon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(MIDCON);
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

	public static class MidConUCContext extends ParserRuleContext {
		public TerminalNode MIDCON_UC() { return getToken(aPlusParser.MIDCON_UC, 0); }
		public MidConUCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midConUC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMidConUC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMidConUC(this);
		}
	}

	public final MidConUCContext midConUC() throws RecognitionException {
		MidConUCContext _localctx = new MidConUCContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_midConUC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(MIDCON_UC);
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

	public static class BegConTCContext extends ParserRuleContext {
		public TerminalNode BEGCON_TC() { return getToken(aPlusParser.BEGCON_TC, 0); }
		public TerminalNode BE_TC() { return getToken(aPlusParser.BE_TC, 0); }
		public BegConTCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begConTC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterBegConTC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitBegConTC(this);
		}
	}

	public final BegConTCContext begConTC() throws RecognitionException {
		BegConTCContext _localctx = new BegConTCContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_begConTC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !(_la==BE_TC || _la==BEGCON_TC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class StartConTCContext extends ParserRuleContext {
		public TerminalNode LARGE_TC() { return getToken(aPlusParser.LARGE_TC, 0); }
		public TerminalNode ILC45_TC() { return getToken(aPlusParser.ILC45_TC, 0); }
		public TerminalNode ILC456_TC() { return getToken(aPlusParser.ILC456_TC, 0); }
		public TerminalNode ILC5_TC() { return getToken(aPlusParser.ILC5_TC, 0); }
		public TerminalNode IN_TC() { return getToken(aPlusParser.IN_TC, 0); }
		public TerminalNode EN_TC() { return getToken(aPlusParser.EN_TC, 0); }
		public TerminalNode STRONG_GS_TC() { return getToken(aPlusParser.STRONG_GS_TC, 0); }
		public BegConTCContext begConTC() {
			return getRuleContext(BegConTCContext.class,0);
		}
		public StartConTCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startConTC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterStartConTC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitStartConTC(this);
		}
	}

	public final StartConTCContext startConTC() throws RecognitionException {
		StartConTCContext _localctx = new StartConTCContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_startConTC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE_TC:
				{
				setState(424);
				match(LARGE_TC);
				}
				break;
			case ILC45_TC:
				{
				setState(425);
				match(ILC45_TC);
				}
				break;
			case ILC456_TC:
				{
				setState(426);
				match(ILC456_TC);
				}
				break;
			case ILC5_TC:
				{
				setState(427);
				match(ILC5_TC);
				}
				break;
			case IN_TC:
				{
				setState(428);
				match(IN_TC);
				}
				break;
			case EN_TC:
				{
				setState(429);
				match(EN_TC);
				}
				break;
			case STRONG_GS_TC:
				{
				setState(430);
				match(STRONG_GS_TC);
				}
				break;
			case BE_TC:
			case BEGCON_TC:
				{
				setState(431);
				begConTC();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class AnywhereConContext extends ParserRuleContext {
		public TerminalNode LARGE() { return getToken(aPlusParser.LARGE, 0); }
		public TerminalNode ILC45() { return getToken(aPlusParser.ILC45, 0); }
		public TerminalNode ILC456() { return getToken(aPlusParser.ILC456, 0); }
		public TerminalNode ILC5() { return getToken(aPlusParser.ILC5, 0); }
		public TerminalNode STRONG_GS() { return getToken(aPlusParser.STRONG_GS, 0); }
		public TerminalNode IN() { return getToken(aPlusParser.IN, 0); }
		public TerminalNode EN() { return getToken(aPlusParser.EN, 0); }
		public AnywhereConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anywhereCon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterAnywhereCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitAnywhereCon(this);
		}
	}

	public final AnywhereConContext anywhereCon() throws RecognitionException {
		AnywhereConContext _localctx = new AnywhereConContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_anywhereCon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (LARGE - 29)) | (1L << (ILC45 - 29)) | (1L << (ILC456 - 29)) | (1L << (ILC5 - 29)) | (1L << (EN - 29)) | (1L << (IN - 29)) | (1L << (STRONG_GS - 29)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class AnywhereConUCContext extends ParserRuleContext {
		public TerminalNode LARGE_UC() { return getToken(aPlusParser.LARGE_UC, 0); }
		public TerminalNode ILC45_UC() { return getToken(aPlusParser.ILC45_UC, 0); }
		public TerminalNode ILC456_UC() { return getToken(aPlusParser.ILC456_UC, 0); }
		public TerminalNode ILC5_UC() { return getToken(aPlusParser.ILC5_UC, 0); }
		public TerminalNode STRONG_GS_UC() { return getToken(aPlusParser.STRONG_GS_UC, 0); }
		public TerminalNode IN_UC() { return getToken(aPlusParser.IN_UC, 0); }
		public TerminalNode EN_UC() { return getToken(aPlusParser.EN_UC, 0); }
		public AnywhereConUCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anywhereConUC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterAnywhereConUC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitAnywhereConUC(this);
		}
	}

	public final AnywhereConUCContext anywhereConUC() throws RecognitionException {
		AnywhereConUCContext _localctx = new AnywhereConUCContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_anywhereConUC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (LARGE_UC - 31)) | (1L << (ILC45_UC - 31)) | (1L << (ILC456_UC - 31)) | (1L << (ILC5_UC - 31)) | (1L << (EN_UC - 31)) | (1L << (IN_UC - 31)) | (1L << (STRONG_GS_UC - 31)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MidEndConContext extends ParserRuleContext {
		public TerminalNode FLC() { return getToken(aPlusParser.FLC, 0); }
		public MidEndConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midEndCon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMidEndCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMidEndCon(this);
		}
	}

	public final MidEndConContext midEndCon() throws RecognitionException {
		MidEndConContext _localctx = new MidEndConContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_midEndCon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			match(FLC);
			}
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

	public static class MidEndConUCContext extends ParserRuleContext {
		public TerminalNode FLC_UC() { return getToken(aPlusParser.FLC_UC, 0); }
		public MidEndConUCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midEndConUC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMidEndConUC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMidEndConUC(this);
		}
	}

	public final MidEndConUCContext midEndConUC() throws RecognitionException {
		MidEndConUCContext _localctx = new MidEndConUCContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_midEndConUC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(FLC_UC);
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

	public static class StartNumContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(aPlusParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(aPlusParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(aPlusParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(aPlusParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(aPlusParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(aPlusParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(aPlusParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(aPlusParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(aPlusParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(aPlusParser.NINE, 0); }
		public StartNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterStartNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitStartNum(this);
		}
	}

	public final StartNumContext startNum() throws RecognitionException {
		StartNumContext _localctx = new StartNumContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_startNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class StartDecContext extends ParserRuleContext {
		public TerminalNode PERIODorDEC() { return getToken(aPlusParser.PERIODorDEC, 0); }
		public StartDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterStartDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitStartDec(this);
		}
	}

	public final StartDecContext startDec() throws RecognitionException {
		StartDecContext _localctx = new StartDecContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_startDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(PERIODorDEC);
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

	public static class DigContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(aPlusParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(aPlusParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(aPlusParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(aPlusParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(aPlusParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(aPlusParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(aPlusParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(aPlusParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(aPlusParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(aPlusParser.NINE, 0); }
		public DigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterDig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitDig(this);
		}
	}

	public final DigContext dig() throws RecognitionException {
		DigContext _localctx = new DigContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class DecptContext extends ParserRuleContext {
		public TerminalNode PERIODorDEC() { return getToken(aPlusParser.PERIODorDEC, 0); }
		public DecptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterDecpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitDecpt(this);
		}
	}

	public final DecptContext decpt() throws RecognitionException {
		DecptContext _localctx = new DecptContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_decpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(PERIODorDEC);
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

	public static class IntegerContext extends ParserRuleContext {
		public StartNumContext startNum() {
			return getRuleContext(StartNumContext.class,0);
		}
		public List<DigContext> dig() {
			return getRuleContexts(DigContext.class);
		}
		public DigContext dig(int i) {
			return getRuleContext(DigContext.class,i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			startNum();
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					dig();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
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

	public static class RealContext extends ParserRuleContext {
		public StartNumContext startNum() {
			return getRuleContext(StartNumContext.class,0);
		}
		public DecptContext decpt() {
			return getRuleContext(DecptContext.class,0);
		}
		public List<DigContext> dig() {
			return getRuleContexts(DigContext.class);
		}
		public DigContext dig(int i) {
			return getRuleContext(DigContext.class,i);
		}
		public StartDecContext startDec() {
			return getRuleContext(StartDecContext.class,0);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_real);
		int _la;
		try {
			int _alt;
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				startNum();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					{
					setState(458);
					dig();
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(464);
				decpt();
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(465);
						dig();
						}
						} 
					}
					setState(470);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				break;
			case PERIODorDEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				startDec();
				setState(473); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(472);
						dig();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(475); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NumberContext extends ParserRuleContext {
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public G1LetterContext g1Letter() {
			return getRuleContext(G1LetterContext.class,0);
		}
		public List<AlphaseqContext> alphaseq() {
			return getRuleContexts(AlphaseqContext.class);
		}
		public AlphaseqContext alphaseq(int i) {
			return getRuleContext(AlphaseqContext.class,i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(479);
				real();
				}
				break;
			case 2:
				{
				setState(480);
				integer();
				}
				break;
			}
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(483);
				g1Letter();
				}
				break;
			}
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LETTERA - 41)) | (1L << (LETTERB - 41)) | (1L << (LETTERC - 41)) | (1L << (LETTERD - 41)) | (1L << (LETTERE - 41)) | (1L << (LETTERF - 41)) | (1L << (LETTERG - 41)) | (1L << (LETTERH - 41)) | (1L << (LETTERI - 41)) | (1L << (LETTERJ - 41)) | (1L << (LETTERK - 41)) | (1L << (LETTERL - 41)) | (1L << (LETTERM - 41)) | (1L << (LETTERN - 41)) | (1L << (LETTERO - 41)) | (1L << (LETTERP - 41)) | (1L << (LETTERQ - 41)) | (1L << (LETTERR - 41)) | (1L << (LETTERS - 41)) | (1L << (LETTERT - 41)) | (1L << (LETTERU - 41)) | (1L << (LETTERV - 41)) | (1L << (LETTERW - 41)) | (1L << (LETTERX - 41)) | (1L << (LETTERY - 41)) | (1L << (LETTERZ - 41)))) != 0)) {
				{
				{
				setState(486);
				alphaseq();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BACK_TICK() { return getToken(aPlusParser.BACK_TICK, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(BACK_TICK);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3a\u01f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\6\2"+
		"h\n\2\r\2\16\2i\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\5\3t\n\3\3\3\6\3w"+
		"\n\3\r\3\16\3x\3\3\3\3\5\3}\n\3\7\3\177\n\3\f\3\16\3\u0082\13\3\3\3\7"+
		"\3\u0085\n\3\f\3\16\3\u0088\13\3\3\3\3\3\3\3\3\3\7\3\u008e\n\3\f\3\16"+
		"\3\u0091\13\3\3\3\3\3\3\3\7\3\u0096\n\3\f\3\16\3\u0099\13\3\3\3\5\3\u009c"+
		"\n\3\3\4\3\4\3\5\7\5\u00a1\n\5\f\5\16\5\u00a4\13\5\3\5\3\5\7\5\u00a8\n"+
		"\5\f\5\16\5\u00ab\13\5\3\6\7\6\u00ae\n\6\f\6\16\6\u00b1\13\6\3\6\3\6\7"+
		"\6\u00b5\n\6\f\6\16\6\u00b8\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u00bf\n\7\3\b"+
		"\3\b\6\b\u00c3\n\b\r\b\16\b\u00c4\3\b\3\b\3\b\5\b\u00ca\n\b\3\t\6\t\u00cd"+
		"\n\t\r\t\16\t\u00ce\3\t\7\t\u00d2\n\t\f\t\16\t\u00d5\13\t\3\t\6\t\u00d8"+
		"\n\t\r\t\16\t\u00d9\3\n\6\n\u00dd\n\n\r\n\16\n\u00de\3\n\7\n\u00e2\n\n"+
		"\f\n\16\n\u00e5\13\n\3\n\6\n\u00e8\n\n\r\n\16\n\u00e9\3\13\6\13\u00ed"+
		"\n\13\r\13\16\13\u00ee\3\13\6\13\u00f2\n\13\r\13\16\13\u00f3\3\13\3\13"+
		"\7\13\u00f8\n\13\f\13\16\13\u00fb\13\13\3\13\6\13\u00fe\n\13\r\13\16\13"+
		"\u00ff\3\13\6\13\u0103\n\13\r\13\16\13\u0104\3\13\3\13\7\13\u0109\n\13"+
		"\f\13\16\13\u010c\13\13\5\13\u010e\n\13\3\f\3\f\3\f\7\f\u0113\n\f\f\f"+
		"\16\f\u0116\13\f\3\f\6\f\u0119\n\f\r\f\16\f\u011a\3\r\3\r\3\r\7\r\u0120"+
		"\n\r\f\r\16\r\u0123\13\r\3\r\6\r\u0126\n\r\r\r\16\r\u0127\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u013f\n\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\6\24\u0147\n\24\r\24\16\24\u0148\3\25\3\25\6\25\u014d\n\25\r\25\16\25"+
		"\u014e\3\26\3\26\6\26\u0153\n\26\r\26\16\26\u0154\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u015c\n\27\3\30\3\30\5\30\u0160\n\30\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u0167\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u016e\n\32\3\33\3\33"+
		"\3\33\6\33\u0173\n\33\r\33\16\33\u0174\3\34\3\34\3\34\6\34\u017a\n\34"+
		"\r\34\16\34\u017b\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u018c\n \3!\3!\3!\3!\3!\3!\3!\6!\u0195\n!\r!\16!\u0196\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u01a3\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u01b3\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\7\60\u01c7\n\60\f\60\16\60\u01ca\13\60\3\61\3\61\7\61"+
		"\u01ce\n\61\f\61\16\61\u01d1\13\61\3\61\3\61\7\61\u01d5\n\61\f\61\16\61"+
		"\u01d8\13\61\3\61\3\61\6\61\u01dc\n\61\r\61\16\61\u01dd\5\61\u01e0\n\61"+
		"\3\62\3\62\5\62\u01e4\n\62\3\62\5\62\u01e7\n\62\3\62\7\62\u01ea\n\62\f"+
		"\62\16\62\u01ed\13\62\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\13\5\2\32"+
		"\32XY^^\7\2!!$$\'\'**LL\3\2+D\3\2+\64\6\2\21\21\23\23\26\26XZ\4\2FFSS"+
		"\t\2\37\37\"\"%%((GGJJMM\t\2!!$$\'\'**IILLOO\3\2\7\20\2\u022d\2g\3\2\2"+
		"\2\4\u009b\3\2\2\2\6\u009d\3\2\2\2\b\u00a2\3\2\2\2\n\u00af\3\2\2\2\f\u00be"+
		"\3\2\2\2\16\u00c9\3\2\2\2\20\u00cc\3\2\2\2\22\u00dc\3\2\2\2\24\u010d\3"+
		"\2\2\2\26\u010f\3\2\2\2\30\u011c\3\2\2\2\32\u0129\3\2\2\2\34\u012b\3\2"+
		"\2\2\36\u012d\3\2\2\2 \u013e\3\2\2\2\"\u0140\3\2\2\2$\u0142\3\2\2\2&\u0144"+
		"\3\2\2\2(\u014a\3\2\2\2*\u0150\3\2\2\2,\u015b\3\2\2\2.\u015f\3\2\2\2\60"+
		"\u0166\3\2\2\2\62\u016d\3\2\2\2\64\u0172\3\2\2\2\66\u0179\3\2\2\28\u017d"+
		"\3\2\2\2:\u017f\3\2\2\2<\u0181\3\2\2\2>\u018b\3\2\2\2@\u0194\3\2\2\2B"+
		"\u0198\3\2\2\2D\u01a2\3\2\2\2F\u01a4\3\2\2\2H\u01a6\3\2\2\2J\u01a8\3\2"+
		"\2\2L\u01b2\3\2\2\2N\u01b4\3\2\2\2P\u01b6\3\2\2\2R\u01b8\3\2\2\2T\u01ba"+
		"\3\2\2\2V\u01bc\3\2\2\2X\u01be\3\2\2\2Z\u01c0\3\2\2\2\\\u01c2\3\2\2\2"+
		"^\u01c4\3\2\2\2`\u01df\3\2\2\2b\u01e3\3\2\2\2d\u01ee\3\2\2\2fh\5\4\3\2"+
		"gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\3\3\2\2\2km\5\32\16\2lk\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2os\3\2\2\2pn\3\2\2\2qt\5\b\5\2rt\5\n"+
		"\6\2sq\3\2\2\2sr\3\2\2\2t\u0080\3\2\2\2uw\5\34\17\2vu\3\2\2\2wx\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2z}\5\b\5\2{}\5\n\6\2|z\3\2\2\2|{\3\2\2"+
		"\2}\177\3\2\2\2~v\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0086\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5\32\16\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7_\2\2\u008a"+
		"\u009c\3\2\2\2\u008b\u008f\5\6\4\2\u008c\u008e\5\32\16\2\u008d\u008c\3"+
		"\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7_\2\2\u0093\u009c\3\2"+
		"\2\2\u0094\u0096\5\32\16\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009c\7_\2\2\u009bn\3\2\2\2\u009b\u008b\3\2\2\2\u009b\u0097"+
		"\3\2\2\2\u009c\5\3\2\2\2\u009d\u009e\7\3\2\2\u009e\7\3\2\2\2\u009f\u00a1"+
		"\5<\37\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a9\5\f"+
		"\7\2\u00a6\u00a8\5> \2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\t\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ae\5<\37\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b6\5\16\b\2\u00b3\u00b5\5> \2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\13\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00bf\5 \21\2\u00ba\u00bf\5\20\t\2\u00bb\u00bf\5\26\f\2"+
		"\u00bc\u00bf\5\"\22\2\u00bd\u00bf\5\24\13\2\u00be\u00b9\3\2\2\2\u00be"+
		"\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2"+
		"\2\2\u00bf\r\3\2\2\2\u00c0\u00ca\5\36\20\2\u00c1\u00c3\5\22\n\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00ca\5\30\r\2\u00c7\u00ca\5B\"\2\u00c8"+
		"\u00ca\5@!\2\u00c9\u00c0\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c6\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\17\3\2\2\2\u00cb\u00cd"+
		"\5\"\22\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d2\7\32\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5\"\22\2\u00d7\u00d6\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\21\3\2\2\2\u00db\u00dd\5B\"\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2"+
		"\7\32\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8"+
		"\5B\"\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\23\3\2\2\2\u00eb\u00ed\5\"\22\2\u00ec\u00eb\3\2\2"+
		"\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00f2\5B\"\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f9\3\2\2\2\u00f5\u00f8\5\""+
		"\22\2\u00f6\u00f8\5B\"\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u010e\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\5B\"\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u0103\5\"\22\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010a\3\2\2\2\u0106\u0109\5\""+
		"\22\2\u0107\u0109\5B\"\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u00ec\3\2\2\2\u010d\u00fd\3\2\2\2\u010e"+
		"\25\3\2\2\2\u010f\u0114\5,\27\2\u0110\u0113\5F$\2\u0111\u0113\5\64\33"+
		"\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0119\5\64\33\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\27\3\2\2\2\u011c\u0121\5.\30\2\u011d"+
		"\u0120\5H%\2\u011e\u0120\5\66\34\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2"+
		"\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\5\66\34\2\u0125\u0124\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\31\3\2\2\2\u0129\u012a\7^\2\2\u012a\33\3\2\2\2\u012b\u012c\t\2\2\2\u012c"+
		"\35\3\2\2\2\u012d\u012e\t\3\2\2\u012e\37\3\2\2\2\u012f\u013f\7\37\2\2"+
		"\u0130\u013f\7 \2\2\u0131\u013f\7\"\2\2\u0132\u013f\7#\2\2\u0133\u013f"+
		"\7%\2\2\u0134\u013f\7&\2\2\u0135\u013f\7(\2\2\u0136\u013f\7)\2\2\u0137"+
		"\u013f\7\34\2\2\u0138\u013f\7\35\2\2\u0139\u013a\7,\2\2\u013a\u013f\7"+
		"/\2\2\u013b\u013f\7F\2\2\u013c\u013f\7J\2\2\u013d\u013f\7K\2\2\u013e\u012f"+
		"\3\2\2\2\u013e\u0130\3\2\2\2\u013e\u0131\3\2\2\2\u013e\u0132\3\2\2\2\u013e"+
		"\u0133\3\2\2\2\u013e\u0134\3\2\2\2\u013e\u0135\3\2\2\2\u013e\u0136\3\2"+
		"\2\2\u013e\u0137\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u0139\3\2\2\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f!\3\2\2\2"+
		"\u0140\u0141\t\4\2\2\u0141#\3\2\2\2\u0142\u0143\t\5\2\2\u0143%\3\2\2\2"+
		"\u0144\u0146\5\"\22\2\u0145\u0147\5\"\22\2\u0146\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\'\3\2\2\2\u014a"+
		"\u014c\7E\2\2\u014b\u014d\5\"\22\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f)\3\2\2\2\u0150\u0152"+
		"\7E\2\2\u0151\u0153\7E\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155+\3\2\2\2\u0156\u015c\5N(\2\u0157"+
		"\u015c\5D#\2\u0158\u015c\5L\'\2\u0159\u015c\5\"\22\2\u015a\u015c\7E\2"+
		"\2\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015a\3\2\2\2\u015c-\3\2\2\2\u015d\u0160\5P)\2\u015e\u0160"+
		"\7E\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160/\3\2\2\2\u0161\u0167"+
		"\5N(\2\u0162\u0167\5F$\2\u0163\u0167\5R*\2\u0164\u0167\5\"\22\2\u0165"+
		"\u0167\7\32\2\2\u0166\u0161\3\2\2\2\u0166\u0162\3\2\2\2\u0166\u0163\3"+
		"\2\2\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\61\3\2\2\2\u0168"+
		"\u016e\5P)\2\u0169\u016e\5H%\2\u016a\u016e\5T+\2\u016b\u016e\7E\2\2\u016c"+
		"\u016e\7\32\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016a\3"+
		"\2\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\63\3\2\2\2\u016f"+
		"\u0173\5N(\2\u0170\u0173\5R*\2\u0171\u0173\5\"\22\2\u0172\u016f\3\2\2"+
		"\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\65\3\2\2\2\u0176\u017a\5P)\2\u0177"+
		"\u017a\5T+\2\u0178\u017a\7E\2\2\u0179\u0176\3\2\2\2\u0179\u0177\3\2\2"+
		"\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\67\3\2\2\2\u017d\u017e\7\24\2\2\u017e9\3\2\2\2\u017f\u0180"+
		"\7\25\2\2\u0180;\3\2\2\2\u0181\u0182\t\6\2\2\u0182=\3\2\2\2\u0183\u018c"+
		"\7[\2\2\u0184\u018c\7\22\2\2\u0185\u018c\7\23\2\2\u0186\u018c\58\35\2"+
		"\u0187\u018c\5:\36\2\u0188\u018c\7\26\2\2\u0189\u018c\7X\2\2\u018a\u018c"+
		"\7Y\2\2\u018b\u0183\3\2\2\2\u018b\u0184\3\2\2\2\u018b\u0185\3\2\2\2\u018b"+
		"\u0186\3\2\2\2\u018b\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018a\3\2\2\2\u018c?\3\2\2\2\u018d\u0195\7\27\2\2\u018e\u0195"+
		"\7\30\2\2\u018f\u0195\5\22\n\2\u0190\u0195\5B\"\2\u0191\u0195\5b\62\2"+
		"\u0192\u0195\5<\37\2\u0193\u0195\5> \2\u0194\u018d\3\2\2\2\u0194\u018e"+
		"\3\2\2\2\u0194\u018f\3\2\2\2\u0194\u0190\3\2\2\2\u0194\u0191\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197A\3\2\2\2\u0198\u0199\7E\2\2\u0199C\3\2"+
		"\2\2\u019a\u019b\7,\2\2\u019b\u01a3\7/\2\2\u019c\u019d\7-\2\2\u019d\u019e"+
		"\79\2\2\u019e\u01a3\78\2\2\u019f\u01a0\7.\2\2\u01a0\u01a1\7\63\2\2\u01a1"+
		"\u01a3\7=\2\2\u01a2\u019a\3\2\2\2\u01a2\u019c\3\2\2\2\u01a2\u019f\3\2"+
		"\2\2\u01a3E\3\2\2\2\u01a4\u01a5\7U\2\2\u01a5G\3\2\2\2\u01a6\u01a7\7W\2"+
		"\2\u01a7I\3\2\2\2\u01a8\u01a9\t\7\2\2\u01a9K\3\2\2\2\u01aa\u01b3\7 \2"+
		"\2\u01ab\u01b3\7#\2\2\u01ac\u01b3\7&\2\2\u01ad\u01b3\7)\2\2\u01ae\u01b3"+
		"\7K\2\2\u01af\u01b3\7H\2\2\u01b0\u01b3\7N\2\2\u01b1\u01b3\5J&\2\u01b2"+
		"\u01aa\3\2\2\2\u01b2\u01ab\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2\u01ad\3\2"+
		"\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3M\3\2\2\2\u01b4\u01b5\t\b\2\2\u01b5O\3\2\2\2\u01b6"+
		"\u01b7\t\t\2\2\u01b7Q\3\2\2\2\u01b8\u01b9\7P\2\2\u01b9S\3\2\2\2\u01ba"+
		"\u01bb\7R\2\2\u01bbU\3\2\2\2\u01bc\u01bd\t\n\2\2\u01bdW\3\2\2\2\u01be"+
		"\u01bf\7\24\2\2\u01bfY\3\2\2\2\u01c0\u01c1\t\n\2\2\u01c1[\3\2\2\2\u01c2"+
		"\u01c3\7\24\2\2\u01c3]\3\2\2\2\u01c4\u01c8\5V,\2\u01c5\u01c7\5Z.\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9_\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cf\5V,\2\u01cc\u01ce"+
		"\5Z.\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d6\5\\"+
		"/\2\u01d3\u01d5\5Z.\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01e0\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01db\5X-\2\u01da\u01dc\5Z.\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2"+
		"\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01cb"+
		"\3\2\2\2\u01df\u01d9\3\2\2\2\u01e0a\3\2\2\2\u01e1\u01e4\5`\61\2\u01e2"+
		"\u01e4\5^\60\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01e7\5$\23\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01eb\3\2\2\2\u01e8\u01ea\5\20\t\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3"+
		"\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ecc\3\2\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ee\u01ef\7\31\2\2\u01efe\3\2\2\2Ainsx|\u0080\u0086\u008f\u0097"+
		"\u009b\u00a2\u00a9\u00af\u00b6\u00be\u00c4\u00c9\u00ce\u00d3\u00d9\u00de"+
		"\u00e3\u00e9\u00ee\u00f3\u00f7\u00f9\u00ff\u0104\u0108\u010a\u010d\u0112"+
		"\u0114\u011a\u011f\u0121\u0127\u013e\u0148\u014e\u0154\u015b\u015f\u0166"+
		"\u016d\u0172\u0174\u0179\u017b\u018b\u0194\u0196\u01a2\u01b2\u01c8\u01cf"+
		"\u01d6\u01dd\u01df\u01e3\u01e6\u01eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}