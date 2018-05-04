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
		SPACE=88, NEWLINE=89, LATIN_LETTER=90, FUN_NAME=91;
	public static final int
		RULE_text = 0, RULE_line = 1, RULE_psymseq = 2, RULE_psymseq_uc = 3, RULE_symseq = 4, 
		RULE_symseq_uc = 5, RULE_alphaseq = 6, RULE_uc_seq = 7, RULE_letterseq = 8, 
		RULE_conword = 9, RULE_conwordUC = 10, RULE_space = 11, RULE_separator = 12, 
		RULE_freq_uc = 13, RULE_freqword = 14, RULE_small = 15, RULE_g1Letter = 16, 
		RULE_word = 17, RULE_tc_word = 18, RULE_uc_word = 19, RULE_startconword = 20, 
		RULE_startconWordUC = 21, RULE_midconword = 22, RULE_midconworduc = 23, 
		RULE_midendconword = 24, RULE_midendconworduc = 25, RULE_period = 26, 
		RULE_semicolon = 27, RULE_spunc = 28, RULE_epunc = 29, RULE_not_lc = 30, 
		RULE_uc_let = 31, RULE_begCon = 32, RULE_midCon = 33, RULE_midConUC = 34, 
		RULE_begConTC = 35, RULE_startConTC = 36, RULE_anywhereCon = 37, RULE_anywhereConUC = 38, 
		RULE_midEndCon = 39, RULE_midEndConUC = 40, RULE_startNum = 41, RULE_startDec = 42, 
		RULE_dig = 43, RULE_decpt = 44, RULE_integer = 45, RULE_real = 46, RULE_number = 47, 
		RULE_literal = 48;
	public static final String[] ruleNames = {
		"text", "line", "psymseq", "psymseq_uc", "symseq", "symseq_uc", "alphaseq", 
		"uc_seq", "letterseq", "conword", "conwordUC", "space", "separator", "freq_uc", 
		"freqword", "small", "g1Letter", "word", "tc_word", "uc_word", "startconword", 
		"startconWordUC", "midconword", "midconworduc", "midendconword", "midendconworduc", 
		"period", "semicolon", "spunc", "epunc", "not_lc", "uc_let", "begCon", 
		"midCon", "midConUC", "begConTC", "startConTC", "anywhereCon", "anywhereConUC", 
		"midEndCon", "midEndConUC", "startNum", "startDec", "dig", "decpt", "integer", 
		"real", "number", "literal"
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
		"MDASH", "NDASH", "ODQUO", "CDQUO", "OSQUO", "CSQUO", "SPACE", "NEWLINE", 
		"LATIN_LETTER", "FUN_NAME"
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
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				line();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << OFENCE) | (1L << CFENCE) | (1L << NEU) | (1L << PERIODorDEC) | (1L << SEMICOLON) | (1L << PUNC) | (1L << SPEC) | (1L << FSLASH) | (1L << WEIRD) | (1L << WEIRD_TC) | (1L << LARGE) | (1L << LARGE_TC) | (1L << LARGE_UC) | (1L << ILC45) | (1L << ILC45_TC) | (1L << ILC45_UC) | (1L << ILC456) | (1L << ILC456_TC) | (1L << ILC456_UC) | (1L << ILC5) | (1L << ILC5_TC) | (1L << ILC5_UC) | (1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ) | (1L << CAPS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BE_TC - 64)) | (1L << (EN - 64)) | (1L << (EN_TC - 64)) | (1L << (EN_UC - 64)) | (1L << (IN - 64)) | (1L << (IN_TC - 64)) | (1L << (IN_UC - 64)) | (1L << (STRONG_GS - 64)) | (1L << (STRONG_GS_TC - 64)) | (1L << (STRONG_GS_UC - 64)) | (1L << (BEGCON_TC - 64)) | (1L << (MDASH - 64)) | (1L << (NDASH - 64)) | (1L << (ODQUO - 64)) | (1L << (CDQUO - 64)) | (1L << (SPACE - 64)) | (1L << (NEWLINE - 64)))) != 0) );
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(103);
					space();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(109);
					psymseq();
					}
					break;
				case 2:
					{
					setState(110);
					psymseq_uc();
					}
					break;
				}
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(113);
								separator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(116); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(120);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(118);
							psymseq();
							}
							break;
						case 2:
							{
							setState(119);
							psymseq_uc();
							}
							break;
						}
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(127);
					space();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(135);
					space();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
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
		enterRule(_localctx, 4, RULE_psymseq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OFENCE) | (1L << NEU) | (1L << PUNC))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (MDASH - 82)) | (1L << (NDASH - 82)) | (1L << (ODQUO - 82)))) != 0)) {
				{
				{
				setState(144);
				spunc();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			symseq();
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					epunc();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 6, RULE_psymseq_uc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					spunc();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(163);
			symseq_uc();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 8, RULE_symseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(170);
				freqword();
				}
				break;
			case 2:
				{
				setState(171);
				alphaseq();
				}
				break;
			case 3:
				{
				setState(172);
				conword();
				}
				break;
			case 4:
				{
				setState(173);
				small();
				}
				break;
			case 5:
				{
				setState(174);
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
		enterRule(_localctx, 10, RULE_symseq_uc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(177);
				freq_uc();
				}
				break;
			case 2:
				{
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					uc_seq();
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAPS );
				}
				break;
			case 3:
				{
				setState(183);
				conwordUC();
				}
				break;
			case 4:
				{
				setState(184);
				uc_let();
				}
				break;
			case 5:
				{
				setState(185);
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
		enterRule(_localctx, 12, RULE_alphaseq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					small();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYP) {
				{
				{
				setState(193);
				match(HYP);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				small();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ))) != 0) );
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
		enterRule(_localctx, 14, RULE_uc_seq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(204);
					uc_let();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(207); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYP) {
				{
				{
				setState(209);
				match(HYP);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(215);
					uc_let();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(218); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 16, RULE_letterseq);
		int _la;
		try {
			int _alt;
			setState(254);
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
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					small();
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ))) != 0) );
				setState(226); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(225);
						uc_let();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(228); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ) | (1L << CAPS))) != 0)) {
					{
					setState(232);
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
						setState(230);
						small();
						}
						break;
					case CAPS:
						{
						setState(231);
						uc_let();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(236);
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
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(237);
					uc_let();
					}
					}
					setState(240); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAPS );
				setState(243); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(242);
						small();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(245); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ) | (1L << CAPS))) != 0)) {
					{
					setState(249);
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
						setState(247);
						small();
						}
						break;
					case CAPS:
						{
						setState(248);
						uc_let();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(253);
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
		enterRule(_localctx, 18, RULE_conword);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			startconword();
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(259);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MIDCON:
						{
						setState(257);
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
						setState(258);
						midendconword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(264);
				midendconword();
				}
				}
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (LARGE - 25)) | (1L << (ILC45 - 25)) | (1L << (ILC456 - 25)) | (1L << (ILC5 - 25)) | (1L << (LETTERA - 25)) | (1L << (LETTERB - 25)) | (1L << (LETTERC - 25)) | (1L << (LETTERD - 25)) | (1L << (LETTERE - 25)) | (1L << (LETTERF - 25)) | (1L << (LETTERG - 25)) | (1L << (LETTERH - 25)) | (1L << (LETTERI - 25)) | (1L << (LETTERJ - 25)) | (1L << (LETTERK - 25)) | (1L << (LETTERL - 25)) | (1L << (LETTERM - 25)) | (1L << (LETTERN - 25)) | (1L << (LETTERO - 25)) | (1L << (LETTERP - 25)) | (1L << (LETTERQ - 25)) | (1L << (LETTERR - 25)) | (1L << (LETTERS - 25)) | (1L << (LETTERT - 25)) | (1L << (LETTERU - 25)) | (1L << (LETTERV - 25)) | (1L << (LETTERW - 25)) | (1L << (LETTERX - 25)) | (1L << (LETTERY - 25)) | (1L << (LETTERZ - 25)) | (1L << (EN - 25)) | (1L << (IN - 25)) | (1L << (STRONG_GS - 25)) | (1L << (FLC - 25)))) != 0) );
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
		enterRule(_localctx, 20, RULE_conwordUC);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			startconWordUC();
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(272);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MIDCON_UC:
						{
						setState(270);
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
						setState(271);
						midendconworduc();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				midendconworduc();
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (LARGE_UC - 27)) | (1L << (ILC45_UC - 27)) | (1L << (ILC456_UC - 27)) | (1L << (ILC5_UC - 27)) | (1L << (CAPS - 27)) | (1L << (EN_UC - 27)) | (1L << (IN_UC - 27)) | (1L << (STRONG_GS_UC - 27)) | (1L << (FLC_UC - 27)))) != 0) );
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
		enterRule(_localctx, 22, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 24, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==HYP || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (MDASH - 82)) | (1L << (NDASH - 82)) | (1L << (SPACE - 82)))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_freq_uc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (LARGE_UC - 27)) | (1L << (ILC45_UC - 27)) | (1L << (ILC456_UC - 27)) | (1L << (ILC5_UC - 27)) | (1L << (IN_UC - 27)))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_freqword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE:
				{
				setState(288);
				match(LARGE);
				}
				break;
			case LARGE_TC:
				{
				setState(289);
				match(LARGE_TC);
				}
				break;
			case ILC45:
				{
				setState(290);
				match(ILC45);
				}
				break;
			case ILC45_TC:
				{
				setState(291);
				match(ILC45_TC);
				}
				break;
			case ILC456:
				{
				setState(292);
				match(ILC456);
				}
				break;
			case ILC456_TC:
				{
				setState(293);
				match(ILC456_TC);
				}
				break;
			case ILC5:
				{
				setState(294);
				match(ILC5);
				}
				break;
			case ILC5_TC:
				{
				setState(295);
				match(ILC5_TC);
				}
				break;
			case WEIRD:
				{
				setState(296);
				match(WEIRD);
				}
				break;
			case WEIRD_TC:
				{
				setState(297);
				match(WEIRD_TC);
				}
				break;
			case LETTERB:
				{
				setState(298);
				match(LETTERB);
				setState(299);
				match(LETTERE);
				}
				break;
			case BE_TC:
				{
				setState(300);
				match(BE_TC);
				}
				break;
			case IN:
				{
				setState(301);
				match(IN);
				}
				break;
			case IN_TC:
				{
				setState(302);
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
		enterRule(_localctx, 30, RULE_small);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_g1Letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
		enterRule(_localctx, 34, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			small();
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				small();
				}
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ))) != 0) );
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
		enterRule(_localctx, 36, RULE_tc_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(CAPS);
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				small();
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ))) != 0) );
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
		enterRule(_localctx, 38, RULE_uc_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(CAPS);
			setState(323); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				match(CAPS);
				}
				}
				setState(325); 
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
		enterRule(_localctx, 40, RULE_startconword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(327);
				anywhereCon();
				}
				break;
			case 2:
				{
				setState(328);
				begCon();
				}
				break;
			case 3:
				{
				setState(329);
				startConTC();
				}
				break;
			case 4:
				{
				setState(330);
				small();
				}
				break;
			case 5:
				{
				setState(331);
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
		enterRule(_localctx, 42, RULE_startconWordUC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
				setState(334);
				anywhereConUC();
				}
				break;
			case CAPS:
				{
				setState(335);
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
		enterRule(_localctx, 44, RULE_midconword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
				setState(338);
				anywhereCon();
				}
				break;
			case MIDCON:
				{
				setState(339);
				midCon();
				}
				break;
			case FLC:
				{
				setState(340);
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
				setState(341);
				small();
				}
				break;
			case HYP:
				{
				setState(342);
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
		enterRule(_localctx, 46, RULE_midconworduc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
				setState(345);
				anywhereConUC();
				}
				break;
			case MIDCON_UC:
				{
				setState(346);
				midConUC();
				}
				break;
			case FLC_UC:
				{
				setState(347);
				midEndConUC();
				}
				break;
			case CAPS:
				{
				setState(348);
				match(CAPS);
				}
				break;
			case HYP:
				{
				setState(349);
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
		enterRule(_localctx, 48, RULE_midendconword);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(355);
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
						setState(352);
						anywhereCon();
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
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(357); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 50, RULE_midendconworduc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(362);
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
						setState(359);
						anywhereConUC();
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
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(364); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 52, RULE_period);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		enterRule(_localctx, 54, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		enterRule(_localctx, 56, RULE_spunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OFENCE) | (1L << NEU) | (1L << PUNC))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (MDASH - 82)) | (1L << (NDASH - 82)) | (1L << (ODQUO - 82)))) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_epunc);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CDQUO:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(CDQUO);
				}
				break;
			case CFENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(CFENCE);
				}
				break;
			case NEU:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(NEU);
				}
				break;
			case PERIODorDEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				period();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				semicolon();
				}
				break;
			case PUNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
				match(PUNC);
				}
				break;
			case MDASH:
				enterOuterAlt(_localctx, 7);
				{
				setState(378);
				match(MDASH);
				}
				break;
			case NDASH:
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
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
		enterRule(_localctx, 60, RULE_not_lc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(389);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(382);
						match(SPEC);
						}
						break;
					case 2:
						{
						setState(383);
						match(FSLASH);
						}
						break;
					case 3:
						{
						setState(384);
						uc_seq();
						}
						break;
					case 4:
						{
						setState(385);
						uc_let();
						}
						break;
					case 5:
						{
						setState(386);
						number();
						}
						break;
					case 6:
						{
						setState(387);
						spunc();
						}
						break;
					case 7:
						{
						setState(388);
						epunc();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(391); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 62, RULE_uc_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		enterRule(_localctx, 64, RULE_begCon);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERB:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(395);
				match(LETTERB);
				setState(396);
				match(LETTERE);
				}
				}
				break;
			case LETTERC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(397);
				match(LETTERC);
				setState(398);
				match(LETTERO);
				setState(399);
				match(LETTERN);
				}
				}
				break;
			case LETTERD:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(400);
				match(LETTERD);
				setState(401);
				match(LETTERI);
				setState(402);
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
		enterRule(_localctx, 66, RULE_midCon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		enterRule(_localctx, 68, RULE_midConUC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 70, RULE_begConTC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		enterRule(_localctx, 72, RULE_startConTC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE_TC:
				{
				setState(411);
				match(LARGE_TC);
				}
				break;
			case ILC45_TC:
				{
				setState(412);
				match(ILC45_TC);
				}
				break;
			case ILC456_TC:
				{
				setState(413);
				match(ILC456_TC);
				}
				break;
			case ILC5_TC:
				{
				setState(414);
				match(ILC5_TC);
				}
				break;
			case IN_TC:
				{
				setState(415);
				match(IN_TC);
				}
				break;
			case EN_TC:
				{
				setState(416);
				match(EN_TC);
				}
				break;
			case STRONG_GS_TC:
				{
				setState(417);
				match(STRONG_GS_TC);
				}
				break;
			case BE_TC:
			case BEGCON_TC:
				{
				setState(418);
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
		enterRule(_localctx, 74, RULE_anywhereCon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (LARGE - 25)) | (1L << (ILC45 - 25)) | (1L << (ILC456 - 25)) | (1L << (ILC5 - 25)) | (1L << (EN - 25)) | (1L << (IN - 25)) | (1L << (STRONG_GS - 25)))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_anywhereConUC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (LARGE_UC - 27)) | (1L << (ILC45_UC - 27)) | (1L << (ILC456_UC - 27)) | (1L << (ILC5_UC - 27)) | (1L << (EN_UC - 27)) | (1L << (IN_UC - 27)) | (1L << (STRONG_GS_UC - 27)))) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_midEndCon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(425);
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
		enterRule(_localctx, 80, RULE_midEndConUC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		enterRule(_localctx, 82, RULE_startNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		enterRule(_localctx, 84, RULE_startDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		enterRule(_localctx, 86, RULE_dig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 88, RULE_decpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 90, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			startNum();
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(438);
					dig();
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 92, RULE_real);
		int _la;
		try {
			int _alt;
			setState(464);
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
				setState(444);
				startNum();
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					{
					setState(445);
					dig();
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(451);
				decpt();
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(452);
						dig();
						}
						} 
					}
					setState(457);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			case PERIODorDEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				startDec();
				setState(460); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(459);
						dig();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(462); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
		enterRule(_localctx, 94, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(466);
				real();
				}
				break;
			case 2:
				{
				setState(467);
				integer();
				}
				break;
			}
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ))) != 0)) {
				{
				setState(470);
				g1Letter();
				}
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
		enterRule(_localctx, 96, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u01de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6\2f\n\2\r\2"+
		"\16\2g\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\3\3\5\3r\n\3\3\3\6\3u\n\3\r\3\16"+
		"\3v\3\3\3\3\5\3{\n\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\7\3\u0083\n\3\f"+
		"\3\16\3\u0086\13\3\3\3\3\3\3\3\7\3\u008b\n\3\f\3\16\3\u008e\13\3\3\3\5"+
		"\3\u0091\n\3\3\4\7\4\u0094\n\4\f\4\16\4\u0097\13\4\3\4\3\4\7\4\u009b\n"+
		"\4\f\4\16\4\u009e\13\4\3\5\7\5\u00a1\n\5\f\5\16\5\u00a4\13\5\3\5\3\5\7"+
		"\5\u00a8\n\5\f\5\16\5\u00ab\13\5\3\6\3\6\3\6\3\6\3\6\5\6\u00b2\n\6\3\7"+
		"\3\7\6\7\u00b6\n\7\r\7\16\7\u00b7\3\7\3\7\3\7\5\7\u00bd\n\7\3\b\6\b\u00c0"+
		"\n\b\r\b\16\b\u00c1\3\b\7\b\u00c5\n\b\f\b\16\b\u00c8\13\b\3\b\6\b\u00cb"+
		"\n\b\r\b\16\b\u00cc\3\t\6\t\u00d0\n\t\r\t\16\t\u00d1\3\t\7\t\u00d5\n\t"+
		"\f\t\16\t\u00d8\13\t\3\t\6\t\u00db\n\t\r\t\16\t\u00dc\3\n\6\n\u00e0\n"+
		"\n\r\n\16\n\u00e1\3\n\6\n\u00e5\n\n\r\n\16\n\u00e6\3\n\3\n\7\n\u00eb\n"+
		"\n\f\n\16\n\u00ee\13\n\3\n\6\n\u00f1\n\n\r\n\16\n\u00f2\3\n\6\n\u00f6"+
		"\n\n\r\n\16\n\u00f7\3\n\3\n\7\n\u00fc\n\n\f\n\16\n\u00ff\13\n\5\n\u0101"+
		"\n\n\3\13\3\13\3\13\7\13\u0106\n\13\f\13\16\13\u0109\13\13\3\13\6\13\u010c"+
		"\n\13\r\13\16\13\u010d\3\f\3\f\3\f\7\f\u0113\n\f\f\f\16\f\u0116\13\f\3"+
		"\f\6\f\u0119\n\f\r\f\16\f\u011a\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0132\n\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u013a\n\23\r\23\16\23\u013b"+
		"\3\24\3\24\6\24\u0140\n\24\r\24\16\24\u0141\3\25\3\25\6\25\u0146\n\25"+
		"\r\25\16\25\u0147\3\26\3\26\3\26\3\26\3\26\5\26\u014f\n\26\3\27\3\27\5"+
		"\27\u0153\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u015a\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0161\n\31\3\32\3\32\3\32\6\32\u0166\n\32\r\32\16\32\u0167"+
		"\3\33\3\33\3\33\6\33\u016d\n\33\r\33\16\33\u016e\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u017f\n\37\3 \3"+
		" \3 \3 \3 \3 \3 \6 \u0188\n \r \16 \u0189\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u0196\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&"+
		"\u01a6\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\7/\u01ba"+
		"\n/\f/\16/\u01bd\13/\3\60\3\60\7\60\u01c1\n\60\f\60\16\60\u01c4\13\60"+
		"\3\60\3\60\7\60\u01c8\n\60\f\60\16\60\u01cb\13\60\3\60\3\60\6\60\u01cf"+
		"\n\60\r\60\16\60\u01d0\5\60\u01d3\n\60\3\61\3\61\5\61\u01d7\n\61\3\61"+
		"\5\61\u01da\n\61\3\62\3\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\13\5\2\26\26TUZZ"+
		"\7\2\35\35  ##&&HH\3\2\'@\3\2\'\60\6\2\r\r\17\17\22\22TV\4\2BBOO\t\2\33"+
		"\33\36\36!!$$CCFFII\t\2\35\35  ##&&EEHHKK\3\2\3\f\2\u0218\2e\3\2\2\2\4"+
		"\u0090\3\2\2\2\6\u0095\3\2\2\2\b\u00a2\3\2\2\2\n\u00b1\3\2\2\2\f\u00bc"+
		"\3\2\2\2\16\u00bf\3\2\2\2\20\u00cf\3\2\2\2\22\u0100\3\2\2\2\24\u0102\3"+
		"\2\2\2\26\u010f\3\2\2\2\30\u011c\3\2\2\2\32\u011e\3\2\2\2\34\u0120\3\2"+
		"\2\2\36\u0131\3\2\2\2 \u0133\3\2\2\2\"\u0135\3\2\2\2$\u0137\3\2\2\2&\u013d"+
		"\3\2\2\2(\u0143\3\2\2\2*\u014e\3\2\2\2,\u0152\3\2\2\2.\u0159\3\2\2\2\60"+
		"\u0160\3\2\2\2\62\u0165\3\2\2\2\64\u016c\3\2\2\2\66\u0170\3\2\2\28\u0172"+
		"\3\2\2\2:\u0174\3\2\2\2<\u017e\3\2\2\2>\u0187\3\2\2\2@\u018b\3\2\2\2B"+
		"\u0195\3\2\2\2D\u0197\3\2\2\2F\u0199\3\2\2\2H\u019b\3\2\2\2J\u01a5\3\2"+
		"\2\2L\u01a7\3\2\2\2N\u01a9\3\2\2\2P\u01ab\3\2\2\2R\u01ad\3\2\2\2T\u01af"+
		"\3\2\2\2V\u01b1\3\2\2\2X\u01b3\3\2\2\2Z\u01b5\3\2\2\2\\\u01b7\3\2\2\2"+
		"^\u01d2\3\2\2\2`\u01d6\3\2\2\2b\u01db\3\2\2\2df\5\4\3\2ed\3\2\2\2fg\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2h\3\3\2\2\2ik\5\30\r\2ji\3\2\2\2kn\3\2\2\2l"+
		"j\3\2\2\2lm\3\2\2\2mq\3\2\2\2nl\3\2\2\2or\5\6\4\2pr\5\b\5\2qo\3\2\2\2"+
		"qp\3\2\2\2r~\3\2\2\2su\5\32\16\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wz\3\2\2\2x{\5\6\4\2y{\5\b\5\2zx\3\2\2\2zy\3\2\2\2{}\3\2\2\2|t\3\2\2"+
		"\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0084\3\2\2\2\u0080~\3\2"+
		"\2\2\u0081\u0083\5\30\r\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7[\2\2\u0088\u0091\3\2\2\2\u0089\u008b\5\30\r\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\7[\2\2\u0090"+
		"l\3\2\2\2\u0090\u008c\3\2\2\2\u0091\5\3\2\2\2\u0092\u0094\5:\36\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009c\5\n\6\2\u0099"+
		"\u009b\5<\37\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\7\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1"+
		"\5:\36\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a9\5\f"+
		"\7\2\u00a6\u00a8\5<\37\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\t\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00b2\5\36\20\2\u00ad\u00b2\5\16\b\2\u00ae\u00b2\5\24\13\2\u00af"+
		"\u00b2\5 \21\2\u00b0\u00b2\5\22\n\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3"+
		"\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\13\3\2\2\2\u00b3\u00bd\5\34\17\2\u00b4\u00b6\5\20\t\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00bd\3\2\2\2\u00b9\u00bd\5\26\f\2\u00ba\u00bd\5@!\2\u00bb\u00bd\5> "+
		"\2\u00bc\u00b3\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00c0\5 \21\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c5\7\26\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\5 \21\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\17\3\2\2"+
		"\2\u00ce\u00d0\5@!\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\7\26\2\2"+
		"\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\5@!\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\21\3\2\2\2\u00de\u00e0\5 \21\2\u00df\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e5\5@!\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2"+
		"\2\u00e6\u00e7\3\2\2\2\u00e7\u00ec\3\2\2\2\u00e8\u00eb\5 \21\2\u00e9\u00eb"+
		"\5@!\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u0101\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f1\5@!\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\5 \21\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00fc\5 \21\2\u00fa\u00fc\5@!\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00df\3\2"+
		"\2\2\u0100\u00f0\3\2\2\2\u0101\23\3\2\2\2\u0102\u0107\5*\26\2\u0103\u0106"+
		"\5D#\2\u0104\u0106\5\62\32\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010c\5\62\32\2\u010b\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\25\3\2\2"+
		"\2\u010f\u0114\5,\27\2\u0110\u0113\5F$\2\u0111\u0113\5\64\33\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\5\64"+
		"\33\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\27\3\2\2\2\u011c\u011d\7Z\2\2\u011d\31\3\2\2\2\u011e"+
		"\u011f\t\2\2\2\u011f\33\3\2\2\2\u0120\u0121\t\3\2\2\u0121\35\3\2\2\2\u0122"+
		"\u0132\7\33\2\2\u0123\u0132\7\34\2\2\u0124\u0132\7\36\2\2\u0125\u0132"+
		"\7\37\2\2\u0126\u0132\7!\2\2\u0127\u0132\7\"\2\2\u0128\u0132\7$\2\2\u0129"+
		"\u0132\7%\2\2\u012a\u0132\7\30\2\2\u012b\u0132\7\31\2\2\u012c\u012d\7"+
		"(\2\2\u012d\u0132\7+\2\2\u012e\u0132\7B\2\2\u012f\u0132\7F\2\2\u0130\u0132"+
		"\7G\2\2\u0131\u0122\3\2\2\2\u0131\u0123\3\2\2\2\u0131\u0124\3\2\2\2\u0131"+
		"\u0125\3\2\2\2\u0131\u0126\3\2\2\2\u0131\u0127\3\2\2\2\u0131\u0128\3\2"+
		"\2\2\u0131\u0129\3\2\2\2\u0131\u012a\3\2\2\2\u0131\u012b\3\2\2\2\u0131"+
		"\u012c\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2"+
		"\2\2\u0132\37\3\2\2\2\u0133\u0134\t\4\2\2\u0134!\3\2\2\2\u0135\u0136\t"+
		"\5\2\2\u0136#\3\2\2\2\u0137\u0139\5 \21\2\u0138\u013a\5 \21\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"%\3\2\2\2\u013d\u013f\7A\2\2\u013e\u0140\5 \21\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\'\3\2\2\2"+
		"\u0143\u0145\7A\2\2\u0144\u0146\7A\2\2\u0145\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148)\3\2\2\2\u0149"+
		"\u014f\5L\'\2\u014a\u014f\5B\"\2\u014b\u014f\5J&\2\u014c\u014f\5 \21\2"+
		"\u014d\u014f\7A\2\2\u014e\u0149\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014b"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f+\3\2\2\2\u0150"+
		"\u0153\5N(\2\u0151\u0153\7A\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2"+
		"\2\u0153-\3\2\2\2\u0154\u015a\5L\'\2\u0155\u015a\5D#\2\u0156\u015a\5P"+
		")\2\u0157\u015a\5 \21\2\u0158\u015a\7\26\2\2\u0159\u0154\3\2\2\2\u0159"+
		"\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2"+
		"\2\2\u015a/\3\2\2\2\u015b\u0161\5N(\2\u015c\u0161\5F$\2\u015d\u0161\5"+
		"R*\2\u015e\u0161\7A\2\2\u015f\u0161\7\26\2\2\u0160\u015b\3\2\2\2\u0160"+
		"\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2"+
		"\2\2\u0161\61\3\2\2\2\u0162\u0166\5L\'\2\u0163\u0166\5P)\2\u0164\u0166"+
		"\5 \21\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\63\3\2\2"+
		"\2\u0169\u016d\5N(\2\u016a\u016d\5R*\2\u016b\u016d\7A\2\2\u016c\u0169"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\65\3\2\2\2\u0170\u0171\7\20\2"+
		"\2\u0171\67\3\2\2\2\u0172\u0173\7\21\2\2\u01739\3\2\2\2\u0174\u0175\t"+
		"\6\2\2\u0175;\3\2\2\2\u0176\u017f\7W\2\2\u0177\u017f\7\16\2\2\u0178\u017f"+
		"\7\17\2\2\u0179\u017f\5\66\34\2\u017a\u017f\58\35\2\u017b\u017f\7\22\2"+
		"\2\u017c\u017f\7T\2\2\u017d\u017f\7U\2\2\u017e\u0176\3\2\2\2\u017e\u0177"+
		"\3\2\2\2\u017e\u0178\3\2\2\2\u017e\u0179\3\2\2\2\u017e\u017a\3\2\2\2\u017e"+
		"\u017b\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f=\3\2\2\2"+
		"\u0180\u0188\7\23\2\2\u0181\u0188\7\24\2\2\u0182\u0188\5\20\t\2\u0183"+
		"\u0188\5@!\2\u0184\u0188\5`\61\2\u0185\u0188\5:\36\2\u0186\u0188\5<\37"+
		"\2\u0187\u0180\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0183"+
		"\3\2\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a?\3\2\2\2"+
		"\u018b\u018c\7A\2\2\u018cA\3\2\2\2\u018d\u018e\7(\2\2\u018e\u0196\7+\2"+
		"\2\u018f\u0190\7)\2\2\u0190\u0191\7\65\2\2\u0191\u0196\7\64\2\2\u0192"+
		"\u0193\7*\2\2\u0193\u0194\7/\2\2\u0194\u0196\79\2\2\u0195\u018d\3\2\2"+
		"\2\u0195\u018f\3\2\2\2\u0195\u0192\3\2\2\2\u0196C\3\2\2\2\u0197\u0198"+
		"\7Q\2\2\u0198E\3\2\2\2\u0199\u019a\7S\2\2\u019aG\3\2\2\2\u019b\u019c\t"+
		"\7\2\2\u019cI\3\2\2\2\u019d\u01a6\7\34\2\2\u019e\u01a6\7\37\2\2\u019f"+
		"\u01a6\7\"\2\2\u01a0\u01a6\7%\2\2\u01a1\u01a6\7G\2\2\u01a2\u01a6\7D\2"+
		"\2\u01a3\u01a6\7J\2\2\u01a4\u01a6\5H%\2\u01a5\u019d\3\2\2\2\u01a5\u019e"+
		"\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5"+
		"\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6K\3\2\2\2"+
		"\u01a7\u01a8\t\b\2\2\u01a8M\3\2\2\2\u01a9\u01aa\t\t\2\2\u01aaO\3\2\2\2"+
		"\u01ab\u01ac\7L\2\2\u01acQ\3\2\2\2\u01ad\u01ae\7N\2\2\u01aeS\3\2\2\2\u01af"+
		"\u01b0\t\n\2\2\u01b0U\3\2\2\2\u01b1\u01b2\7\20\2\2\u01b2W\3\2\2\2\u01b3"+
		"\u01b4\t\n\2\2\u01b4Y\3\2\2\2\u01b5\u01b6\7\20\2\2\u01b6[\3\2\2\2\u01b7"+
		"\u01bb\5T+\2\u01b8\u01ba\5X-\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2"+
		"\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc]\3\2\2\2\u01bd\u01bb\3"+
		"\2\2\2\u01be\u01c2\5T+\2\u01bf\u01c1\5X-\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c5\u01c9\5Z.\2\u01c6\u01c8\5X-\2\u01c7\u01c6\3\2\2\2"+
		"\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01d3"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01ce\5V,\2\u01cd\u01cf\5X-\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01be\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d3"+
		"_\3\2\2\2\u01d4\u01d7\5^\60\2\u01d5\u01d7\5\\/\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\5\"\22\2\u01d9\u01d8\3"+
		"\2\2\2\u01d9\u01da\3\2\2\2\u01daa\3\2\2\2\u01db\u01dc\7\25\2\2\u01dcc"+
		"\3\2\2\2?glqvz~\u0084\u008c\u0090\u0095\u009c\u00a2\u00a9\u00b1\u00b7"+
		"\u00bc\u00c1\u00c6\u00cc\u00d1\u00d6\u00dc\u00e1\u00e6\u00ea\u00ec\u00f2"+
		"\u00f7\u00fb\u00fd\u0100\u0105\u0107\u010d\u0112\u0114\u011a\u0131\u013b"+
		"\u0141\u0147\u014e\u0152\u0159\u0160\u0165\u0167\u016c\u016e\u017e\u0187"+
		"\u0189\u0195\u01a5\u01bb\u01c2\u01c9\u01d0\u01d2\u01d6\u01d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}