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
		SPEC=17, FSLASH=18, BACK_TICK=19, SEP=20, WEIRD=21, WEIRD_TC=22, LARGE=23, 
		LARGE_TC=24, ILC45=25, ILC45_TC=26, ILC456=27, ILC456_TC=28, ILC5=29, 
		ILC5_TC=30, LETTERA=31, LETTERB=32, LETTERC=33, LETTERD=34, LETTERE=35, 
		LETTERF=36, LETTERG=37, LETTERH=38, LETTERI=39, LETTERJ=40, LETTERK=41, 
		LETTERL=42, LETTERM=43, LETTERN=44, LETTERO=45, LETTERP=46, LETTERQ=47, 
		LETTERR=48, LETTERS=49, LETTERT=50, LETTERU=51, LETTERV=52, LETTERW=53, 
		LETTERX=54, LETTERY=55, LETTERZ=56, CAPS=57, BE_TC=58, IN=59, IN_TC=60, 
		EN=61, EN_TC=62, STRONG_GS=63, STRONG_GS_TC=64, FLC=65, BEGCON_TC=66, 
		MIDCON=67, MDASH=68, NDASH=69, ODQUO=70, CDQUO=71, ITAL_STAG=72, ITAL_ETAG=73, 
		SPACE=74, NEWLINE=75, START_MML=76, START_NEM=77, END_NEM=78, NEM_NI=79, 
		NEM_ZERO=80, NEM_ONE=81, NEM_TWO=82, NEM_THREE=83, NEM_FOUR=84, NEM_FIVE=85, 
		NEM_SIX=86, NEM_SEVEN=87, NEM_EIGHT=88, NEM_NINE=89, NEM_LCletter=90, 
		NEM_UCletter=91, END_MML=92, MML_NEWLINE=93, MML_SPACE=94, MML_SROW=95, 
		MML_EROW=96, MML_SFRAC=97, MML_EFRAC=98, MML_SSUB=99, MML_ESUB=100, MML_SSUP=101, 
		MML_ESUP=102, MML_SSUBSUP=103, MML_ESUBSUP=104, MML_DEC_DIG=105, MML_LC_LET=106, 
		MML_INT=107, MML_VAR=108, MML_OP=109, MML_CMPR=110, MML_FUNS=111, LATIN_LETTER=112, 
		FUN_NAME=113;
	public static final int
		RULE_text = 0, RULE_line = 1, RULE_symseq = 2, RULE_startMML = 3, RULE_endMML = 4, 
		RULE_mmlInt = 5, RULE_mmlOp = 6, RULE_mmlId = 7, RULE_mmlExpr = 8, RULE_mmlRow = 9, 
		RULE_alphaseq = 10, RULE_letterseq = 11, RULE_conword = 12, RULE_space = 13, 
		RULE_separator = 14, RULE_freqword = 15, RULE_itsStart = 16, RULE_itsEnd = 17, 
		RULE_small = 18, RULE_g1Letter = 19, RULE_word = 20, RULE_tc_word = 21, 
		RULE_startconword = 22, RULE_midconword = 23, RULE_midendconword = 24, 
		RULE_period = 25, RULE_semicolon = 26, RULE_spunc = 27, RULE_epunc = 28, 
		RULE_not_lc = 29, RULE_garbage = 30, RULE_uc_let = 31, RULE_uc_seq = 32, 
		RULE_begCon = 33, RULE_midCon = 34, RULE_begConTC = 35, RULE_startConTC = 36, 
		RULE_anywhereCon = 37, RULE_midEndCon = 38, RULE_startNum = 39, RULE_startDec = 40, 
		RULE_dig = 41, RULE_decpt = 42, RULE_integer = 43, RULE_real = 44, RULE_number = 45, 
		RULE_literal = 46;
	public static final String[] ruleNames = {
		"text", "line", "symseq", "startMML", "endMML", "mmlInt", "mmlOp", "mmlId", 
		"mmlExpr", "mmlRow", "alphaseq", "letterseq", "conword", "space", "separator", 
		"freqword", "itsStart", "itsEnd", "small", "g1Letter", "word", "tc_word", 
		"startconword", "midconword", "midendconword", "period", "semicolon", 
		"spunc", "epunc", "not_lc", "garbage", "uc_let", "uc_seq", "begCon", "midCon", 
		"begConTC", "startConTC", "anywhereCon", "midEndCon", "startNum", "startDec", 
		"dig", "decpt", "integer", "real", "number", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'.'", "';'", null, null, "'/'", "'`'", null, null, null, 
		null, null, null, null, null, null, null, null, "'a'", "'b'", "'c'", "'d'", 
		"'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", 
		"'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", 
		"'y'", "'z'", null, "'Be'", "'in'", "'In'", "'en'", "'En'", null, null, 
		null, null, null, "'\u2014'", "'\u2013'", "'\u201C'", "'\u201D'", "'<i>'", 
		null, null, null, "'<math>'", "'<Nem>'", "'</Nem>'", "'#'", null, null, 
		null, null, null, null, null, null, null, null, "'[a-z]'", "'[A-Z]'", 
		"'</math>'", null, null, "'<mrow>'", "'</mrow>'", "'<mfrac>'", "'</mfrac>'", 
		"'<msub>'", "'</msub>'", "'<msup>'", "'</msup>'", "'<msubsup>'", "'</msubsup>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", 
		"NINE", "OFENCE", "CFENCE", "NEU", "PERIODorDEC", "SEMICOLON", "PUNC", 
		"SPEC", "FSLASH", "BACK_TICK", "SEP", "WEIRD", "WEIRD_TC", "LARGE", "LARGE_TC", 
		"ILC45", "ILC45_TC", "ILC456", "ILC456_TC", "ILC5", "ILC5_TC", "LETTERA", 
		"LETTERB", "LETTERC", "LETTERD", "LETTERE", "LETTERF", "LETTERG", "LETTERH", 
		"LETTERI", "LETTERJ", "LETTERK", "LETTERL", "LETTERM", "LETTERN", "LETTERO", 
		"LETTERP", "LETTERQ", "LETTERR", "LETTERS", "LETTERT", "LETTERU", "LETTERV", 
		"LETTERW", "LETTERX", "LETTERY", "LETTERZ", "CAPS", "BE_TC", "IN", "IN_TC", 
		"EN", "EN_TC", "STRONG_GS", "STRONG_GS_TC", "FLC", "BEGCON_TC", "MIDCON", 
		"MDASH", "NDASH", "ODQUO", "CDQUO", "ITAL_STAG", "ITAL_ETAG", "SPACE", 
		"NEWLINE", "START_MML", "START_NEM", "END_NEM", "NEM_NI", "NEM_ZERO", 
		"NEM_ONE", "NEM_TWO", "NEM_THREE", "NEM_FOUR", "NEM_FIVE", "NEM_SIX", 
		"NEM_SEVEN", "NEM_EIGHT", "NEM_NINE", "NEM_LCletter", "NEM_UCletter", 
		"END_MML", "MML_NEWLINE", "MML_SPACE", "MML_SROW", "MML_EROW", "MML_SFRAC", 
		"MML_EFRAC", "MML_SSUB", "MML_ESUB", "MML_SSUP", "MML_ESUP", "MML_SSUBSUP", 
		"MML_ESUBSUP", "MML_DEC_DIG", "MML_LC_LET", "MML_INT", "MML_VAR", "MML_OP", 
		"MML_CMPR", "MML_FUNS", "LATIN_LETTER", "FUN_NAME"
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
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				line();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << OFENCE) | (1L << CFENCE) | (1L << NEU) | (1L << PERIODorDEC) | (1L << SEMICOLON) | (1L << PUNC) | (1L << SPEC) | (1L << FSLASH) | (1L << WEIRD) | (1L << WEIRD_TC) | (1L << LARGE) | (1L << LARGE_TC) | (1L << ILC45) | (1L << ILC45_TC) | (1L << ILC456) | (1L << ILC456_TC) | (1L << ILC5) | (1L << ILC5_TC) | (1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ) | (1L << CAPS) | (1L << BE_TC) | (1L << IN) | (1L << IN_TC) | (1L << EN) | (1L << EN_TC) | (1L << STRONG_GS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRONG_GS_TC - 64)) | (1L << (BEGCON_TC - 64)) | (1L << (MDASH - 64)) | (1L << (NDASH - 64)) | (1L << (ODQUO - 64)) | (1L << (CDQUO - 64)) | (1L << (ITAL_STAG - 64)) | (1L << (SPACE - 64)) | (1L << (NEWLINE - 64)) | (1L << (START_MML - 64)) | (1L << (END_MML - 64)) | (1L << (MML_INT - 64)) | (1L << (MML_VAR - 64)) | (1L << (MML_OP - 64)))) != 0) );
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
		public List<SymseqContext> symseq() {
			return getRuleContexts(SymseqContext.class);
		}
		public SymseqContext symseq(int i) {
			return getRuleContext(SymseqContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		public StartMMLContext startMML() {
			return getRuleContext(StartMMLContext.class,0);
		}
		public TerminalNode MML_NEWLINE() { return getToken(aPlusParser.MML_NEWLINE, 0); }
		public MmlExprContext mmlExpr() {
			return getRuleContext(MmlExprContext.class,0);
		}
		public EndMMLContext endMML() {
			return getRuleContext(EndMMLContext.class,0);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(99);
					space();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(105);
						spunc();
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(111);
				symseq();
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(112);
						epunc();
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(119); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(118);
								separator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(121); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						{
						setState(126);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(123);
								spunc();
								}
								} 
							}
							setState(128);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						}
						setState(129);
						symseq();
						setState(133);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(130);
								epunc();
								}
								} 
							}
							setState(135);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						}
						}
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(141);
					space();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				startMML();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(150);
					space();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==MML_NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				mmlExpr();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(159);
					space();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==MML_NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				endMML();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(168);
					space();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==MML_NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(176);
					space();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
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

	public static class SymseqContext extends ParserRuleContext {
		public ConwordContext conword() {
			return getRuleContext(ConwordContext.class,0);
		}
		public AlphaseqContext alphaseq() {
			return getRuleContext(AlphaseqContext.class,0);
		}
		public SmallContext small() {
			return getRuleContext(SmallContext.class,0);
		}
		public Uc_letContext uc_let() {
			return getRuleContext(Uc_letContext.class,0);
		}
		public FreqwordContext freqword() {
			return getRuleContext(FreqwordContext.class,0);
		}
		public LetterseqContext letterseq() {
			return getRuleContext(LetterseqContext.class,0);
		}
		public Not_lcContext not_lc() {
			return getRuleContext(Not_lcContext.class,0);
		}
		public GarbageContext garbage() {
			return getRuleContext(GarbageContext.class,0);
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
		enterRule(_localctx, 4, RULE_symseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(185);
				conword();
				}
				break;
			case 2:
				{
				setState(186);
				alphaseq();
				}
				break;
			case 3:
				{
				setState(187);
				small();
				}
				break;
			case 4:
				{
				setState(188);
				uc_let();
				}
				break;
			case 5:
				{
				setState(189);
				freqword();
				}
				break;
			case 6:
				{
				setState(190);
				letterseq();
				}
				break;
			case 7:
				{
				setState(191);
				not_lc();
				}
				break;
			case 8:
				{
				setState(192);
				garbage();
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

	public static class StartMMLContext extends ParserRuleContext {
		public TerminalNode START_MML() { return getToken(aPlusParser.START_MML, 0); }
		public StartMMLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startMML; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterStartMML(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitStartMML(this);
		}
	}

	public final StartMMLContext startMML() throws RecognitionException {
		StartMMLContext _localctx = new StartMMLContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_startMML);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(START_MML);
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

	public static class EndMMLContext extends ParserRuleContext {
		public TerminalNode END_MML() { return getToken(aPlusParser.END_MML, 0); }
		public EndMMLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endMML; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterEndMML(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitEndMML(this);
		}
	}

	public final EndMMLContext endMML() throws RecognitionException {
		EndMMLContext _localctx = new EndMMLContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_endMML);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(END_MML);
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

	public static class MmlIntContext extends ParserRuleContext {
		public TerminalNode MML_INT() { return getToken(aPlusParser.MML_INT, 0); }
		public MmlIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmlInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMmlInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMmlInt(this);
		}
	}

	public final MmlIntContext mmlInt() throws RecognitionException {
		MmlIntContext _localctx = new MmlIntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mmlInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(MML_INT);
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

	public static class MmlOpContext extends ParserRuleContext {
		public TerminalNode MML_OP() { return getToken(aPlusParser.MML_OP, 0); }
		public MmlOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmlOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMmlOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMmlOp(this);
		}
	}

	public final MmlOpContext mmlOp() throws RecognitionException {
		MmlOpContext _localctx = new MmlOpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mmlOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(MML_OP);
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

	public static class MmlIdContext extends ParserRuleContext {
		public TerminalNode MML_VAR() { return getToken(aPlusParser.MML_VAR, 0); }
		public MmlIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmlId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMmlId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMmlId(this);
		}
	}

	public final MmlIdContext mmlId() throws RecognitionException {
		MmlIdContext _localctx = new MmlIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mmlId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(MML_VAR);
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

	public static class MmlExprContext extends ParserRuleContext {
		public List<MmlIntContext> mmlInt() {
			return getRuleContexts(MmlIntContext.class);
		}
		public MmlIntContext mmlInt(int i) {
			return getRuleContext(MmlIntContext.class,i);
		}
		public List<MmlOpContext> mmlOp() {
			return getRuleContexts(MmlOpContext.class);
		}
		public MmlOpContext mmlOp(int i) {
			return getRuleContext(MmlOpContext.class,i);
		}
		public List<MmlIdContext> mmlId() {
			return getRuleContexts(MmlIdContext.class);
		}
		public MmlIdContext mmlId(int i) {
			return getRuleContext(MmlIdContext.class,i);
		}
		public MmlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMmlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMmlExpr(this);
		}
	}

	public final MmlExprContext mmlExpr() throws RecognitionException {
		MmlExprContext _localctx = new MmlExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mmlExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(208);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MML_INT:
					{
					setState(205);
					mmlInt();
					}
					break;
				case MML_OP:
					{
					setState(206);
					mmlOp();
					}
					break;
				case MML_VAR:
					{
					setState(207);
					mmlId();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (MML_INT - 107)) | (1L << (MML_VAR - 107)) | (1L << (MML_OP - 107)))) != 0) );
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

	public static class MmlRowContext extends ParserRuleContext {
		public TerminalNode MML_SROW() { return getToken(aPlusParser.MML_SROW, 0); }
		public MmlExprContext mmlExpr() {
			return getRuleContext(MmlExprContext.class,0);
		}
		public TerminalNode MML_EROW() { return getToken(aPlusParser.MML_EROW, 0); }
		public MmlRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmlRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterMmlRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitMmlRow(this);
		}
	}

	public final MmlRowContext mmlRow() throws RecognitionException {
		MmlRowContext _localctx = new MmlRowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mmlRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(212);
			match(MML_SROW);
			setState(213);
			mmlExpr();
			setState(214);
			match(MML_EROW);
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
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Tc_wordContext tc_word() {
			return getRuleContext(Tc_wordContext.class,0);
		}
		public Uc_seqContext uc_seq() {
			return getRuleContext(Uc_seqContext.class,0);
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
		enterRule(_localctx, 20, RULE_alphaseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(216);
				word();
				}
				break;
			case 2:
				{
				setState(217);
				tc_word();
				}
				break;
			case 3:
				{
				setState(218);
				uc_seq();
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

	public static class LetterseqContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<SmallContext> small() {
			return getRuleContexts(SmallContext.class);
		}
		public SmallContext small(int i) {
			return getRuleContext(SmallContext.class,i);
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
		enterRule(_localctx, 22, RULE_letterseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(221);
					word();
					}
					break;
				case 2:
					{
					setState(222);
					small();
					}
					break;
				case 3:
					{
					setState(223);
					uc_seq();
					}
					break;
				case 4:
					{
					setState(224);
					uc_let();
					}
					break;
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << LETTERC) | (1L << LETTERD) | (1L << LETTERE) | (1L << LETTERF) | (1L << LETTERG) | (1L << LETTERH) | (1L << LETTERI) | (1L << LETTERJ) | (1L << LETTERK) | (1L << LETTERL) | (1L << LETTERM) | (1L << LETTERN) | (1L << LETTERO) | (1L << LETTERP) | (1L << LETTERQ) | (1L << LETTERR) | (1L << LETTERS) | (1L << LETTERT) | (1L << LETTERU) | (1L << LETTERV) | (1L << LETTERW) | (1L << LETTERX) | (1L << LETTERY) | (1L << LETTERZ) | (1L << CAPS))) != 0) );
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
		enterRule(_localctx, 24, RULE_conword);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			startconword();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(232);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MIDCON:
						{
						setState(230);
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
					case IN:
					case EN:
					case STRONG_GS:
					case FLC:
						{
						setState(231);
						midendconword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(237);
				midendconword();
				}
				}
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (LARGE - 23)) | (1L << (ILC45 - 23)) | (1L << (ILC456 - 23)) | (1L << (ILC5 - 23)) | (1L << (LETTERA - 23)) | (1L << (LETTERB - 23)) | (1L << (LETTERC - 23)) | (1L << (LETTERD - 23)) | (1L << (LETTERE - 23)) | (1L << (LETTERF - 23)) | (1L << (LETTERG - 23)) | (1L << (LETTERH - 23)) | (1L << (LETTERI - 23)) | (1L << (LETTERJ - 23)) | (1L << (LETTERK - 23)) | (1L << (LETTERL - 23)) | (1L << (LETTERM - 23)) | (1L << (LETTERN - 23)) | (1L << (LETTERO - 23)) | (1L << (LETTERP - 23)) | (1L << (LETTERQ - 23)) | (1L << (LETTERR - 23)) | (1L << (LETTERS - 23)) | (1L << (LETTERT - 23)) | (1L << (LETTERU - 23)) | (1L << (LETTERV - 23)) | (1L << (LETTERW - 23)) | (1L << (LETTERX - 23)) | (1L << (LETTERY - 23)) | (1L << (LETTERZ - 23)) | (1L << (IN - 23)) | (1L << (EN - 23)) | (1L << (STRONG_GS - 23)) | (1L << (FLC - 23)))) != 0) );
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
		enterRule(_localctx, 26, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		public TerminalNode SEP() { return getToken(aPlusParser.SEP, 0); }
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
		enterRule(_localctx, 28, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (SEP - 20)) | (1L << (MDASH - 20)) | (1L << (NDASH - 20)) | (1L << (SPACE - 20)))) != 0)) ) {
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
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE:
				{
				setState(246);
				match(LARGE);
				}
				break;
			case LARGE_TC:
				{
				setState(247);
				match(LARGE_TC);
				}
				break;
			case ILC45:
				{
				setState(248);
				match(ILC45);
				}
				break;
			case ILC45_TC:
				{
				setState(249);
				match(ILC45_TC);
				}
				break;
			case ILC456:
				{
				setState(250);
				match(ILC456);
				}
				break;
			case ILC456_TC:
				{
				setState(251);
				match(ILC456_TC);
				}
				break;
			case ILC5:
				{
				setState(252);
				match(ILC5);
				}
				break;
			case ILC5_TC:
				{
				setState(253);
				match(ILC5_TC);
				}
				break;
			case WEIRD:
				{
				setState(254);
				match(WEIRD);
				}
				break;
			case WEIRD_TC:
				{
				setState(255);
				match(WEIRD_TC);
				}
				break;
			case LETTERB:
				{
				setState(256);
				match(LETTERB);
				setState(257);
				match(LETTERE);
				}
				break;
			case BE_TC:
				{
				setState(258);
				match(BE_TC);
				}
				break;
			case IN:
				{
				setState(259);
				match(IN);
				}
				break;
			case IN_TC:
				{
				setState(260);
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

	public static class ItsStartContext extends ParserRuleContext {
		public TerminalNode ITAL_STAG() { return getToken(aPlusParser.ITAL_STAG, 0); }
		public ItsStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itsStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterItsStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitItsStart(this);
		}
	}

	public final ItsStartContext itsStart() throws RecognitionException {
		ItsStartContext _localctx = new ItsStartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_itsStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ITAL_STAG);
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

	public static class ItsEndContext extends ParserRuleContext {
		public TerminalNode ITAL_ETAG() { return getToken(aPlusParser.ITAL_ETAG, 0); }
		public ItsEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itsEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterItsEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitItsEnd(this);
		}
	}

	public final ItsEndContext itsEnd() throws RecognitionException {
		ItsEndContext _localctx = new ItsEndContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_itsEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(ITAL_ETAG);
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
		enterRule(_localctx, 36, RULE_small);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		enterRule(_localctx, 38, RULE_g1Letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 40, RULE_word);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			small();
			setState(273); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(272);
					small();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(275); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 42, RULE_tc_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(CAPS);
			setState(279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278);
				small();
				}
				}
				setState(281); 
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
		enterRule(_localctx, 44, RULE_startconword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(283);
				anywhereCon();
				}
				break;
			case 2:
				{
				setState(284);
				begCon();
				}
				break;
			case 3:
				{
				setState(285);
				startConTC();
				}
				break;
			case 4:
				{
				setState(286);
				small();
				}
				break;
			case 5:
				{
				setState(287);
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
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE:
			case ILC45:
			case ILC456:
			case ILC5:
			case IN:
			case EN:
			case STRONG_GS:
				{
				setState(290);
				anywhereCon();
				}
				break;
			case MIDCON:
				{
				setState(291);
				midCon();
				}
				break;
			case FLC:
				{
				setState(292);
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
				setState(293);
				small();
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
			setState(299); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(299);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LARGE:
					case ILC45:
					case ILC456:
					case ILC5:
					case IN:
					case EN:
					case STRONG_GS:
						{
						setState(296);
						anywhereCon();
						}
						break;
					case FLC:
						{
						setState(297);
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
						setState(298);
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
				setState(301); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 50, RULE_period);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		enterRule(_localctx, 52, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
		public TerminalNode ITAL_STAG() { return getToken(aPlusParser.ITAL_STAG, 0); }
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
		enterRule(_localctx, 54, RULE_spunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OFENCE - 11)) | (1L << (NEU - 11)) | (1L << (PUNC - 11)) | (1L << (MDASH - 11)) | (1L << (NDASH - 11)) | (1L << (ODQUO - 11)) | (1L << (ITAL_STAG - 11)))) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_epunc);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CDQUO:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(CDQUO);
				}
				break;
			case CFENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(CFENCE);
				}
				break;
			case NEU:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(NEU);
				}
				break;
			case PERIODorDEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				period();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				semicolon();
				}
				break;
			case PUNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				match(PUNC);
				}
				break;
			case MDASH:
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				match(MDASH);
				}
				break;
			case NDASH:
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
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
		enterRule(_localctx, 58, RULE_not_lc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(319);
						match(SPEC);
						}
						break;
					case 2:
						{
						setState(320);
						match(FSLASH);
						}
						break;
					case 3:
						{
						setState(321);
						uc_seq();
						}
						break;
					case 4:
						{
						setState(322);
						uc_let();
						}
						break;
					case 5:
						{
						setState(323);
						number();
						}
						break;
					case 6:
						{
						setState(324);
						spunc();
						}
						break;
					case 7:
						{
						setState(325);
						epunc();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class GarbageContext extends ParserRuleContext {
		public List<Not_lcContext> not_lc() {
			return getRuleContexts(Not_lcContext.class);
		}
		public Not_lcContext not_lc(int i) {
			return getRuleContext(Not_lcContext.class,i);
		}
		public List<SmallContext> small() {
			return getRuleContexts(SmallContext.class);
		}
		public SmallContext small(int i) {
			return getRuleContext(SmallContext.class,i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public GarbageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_garbage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterGarbage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitGarbage(this);
		}
	}

	public final GarbageContext garbage() throws RecognitionException {
		GarbageContext _localctx = new GarbageContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_garbage);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(330);
						not_lc();
						}
						break;
					case 2:
						{
						setState(331);
						small();
						}
						break;
					case 3:
						{
						setState(332);
						word();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(335); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
			setState(337);
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

	public static class Uc_seqContext extends ParserRuleContext {
		public List<Uc_letContext> uc_let() {
			return getRuleContexts(Uc_letContext.class);
		}
		public Uc_letContext uc_let(int i) {
			return getRuleContext(Uc_letContext.class,i);
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
		enterRule(_localctx, 64, RULE_uc_seq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			uc_let();
			setState(340);
			uc_let();
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					uc_let();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERB:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(347);
				match(LETTERB);
				setState(348);
				match(LETTERE);
				}
				}
				break;
			case LETTERC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(349);
				match(LETTERC);
				setState(350);
				match(LETTERO);
				setState(351);
				match(LETTERN);
				}
				}
				break;
			case LETTERD:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(352);
				match(LETTERD);
				setState(353);
				match(LETTERI);
				setState(354);
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
			setState(357);
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
			setState(359);
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
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE_TC:
				{
				setState(361);
				match(LARGE_TC);
				}
				break;
			case ILC45_TC:
				{
				setState(362);
				match(ILC45_TC);
				}
				break;
			case ILC456_TC:
				{
				setState(363);
				match(ILC456_TC);
				}
				break;
			case ILC5_TC:
				{
				setState(364);
				match(ILC5_TC);
				}
				break;
			case IN_TC:
				{
				setState(365);
				match(IN_TC);
				}
				break;
			case EN_TC:
				{
				setState(366);
				match(EN_TC);
				}
				break;
			case STRONG_GS_TC:
				{
				setState(367);
				match(STRONG_GS_TC);
				}
				break;
			case BE_TC:
			case BEGCON_TC:
				{
				setState(368);
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
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LARGE) | (1L << ILC45) | (1L << ILC456) | (1L << ILC5) | (1L << IN) | (1L << EN) | (1L << STRONG_GS))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_midEndCon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(373);
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
		enterRule(_localctx, 78, RULE_startNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		enterRule(_localctx, 80, RULE_startDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		enterRule(_localctx, 82, RULE_dig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		enterRule(_localctx, 84, RULE_decpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		enterRule(_localctx, 86, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			startNum();
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					dig();
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 88, RULE_real);
		int _la;
		try {
			int _alt;
			setState(410);
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
				setState(390);
				startNum();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					{
					setState(391);
					dig();
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				decpt();
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						dig();
						}
						} 
					}
					setState(403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				break;
			case PERIODorDEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				startDec();
				setState(406); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(405);
						dig();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(408); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 90, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(412);
				real();
				}
				break;
			case 2:
				{
				setState(413);
				integer();
				}
				break;
			}
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(416);
				g1Letter();
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
		enterRule(_localctx, 92, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u01a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2b\n\2\r\2\16\2c\3\3\7\3g\n\3\f"+
		"\3\16\3j\13\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13"+
		"\3\3\3\6\3z\n\3\r\3\16\3{\3\3\7\3\177\n\3\f\3\16\3\u0082\13\3\3\3\3\3"+
		"\7\3\u0086\n\3\f\3\16\3\u0089\13\3\7\3\u008b\n\3\f\3\16\3\u008e\13\3\3"+
		"\3\7\3\u0091\n\3\f\3\16\3\u0094\13\3\3\3\3\3\3\3\3\3\7\3\u009a\n\3\f\3"+
		"\16\3\u009d\13\3\3\3\3\3\3\3\3\3\7\3\u00a3\n\3\f\3\16\3\u00a6\13\3\3\3"+
		"\3\3\3\3\3\3\7\3\u00ac\n\3\f\3\16\3\u00af\13\3\3\3\3\3\3\3\7\3\u00b4\n"+
		"\3\f\3\16\3\u00b7\13\3\3\3\5\3\u00ba\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u00c4\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\6"+
		"\n\u00d3\n\n\r\n\16\n\u00d4\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00de"+
		"\n\f\3\r\3\r\3\r\3\r\6\r\u00e4\n\r\r\r\16\r\u00e5\3\16\3\16\3\16\7\16"+
		"\u00eb\n\16\f\16\16\16\u00ee\13\16\3\16\6\16\u00f1\n\16\r\16\16\16\u00f2"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0108\n\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\6\26\u0114\n\26\r\26\16\26\u0115\3\27\3\27\6\27\u011a"+
		"\n\27\r\27\16\27\u011b\3\30\3\30\3\30\3\30\3\30\5\30\u0123\n\30\3\31\3"+
		"\31\3\31\3\31\5\31\u0129\n\31\3\32\3\32\3\32\6\32\u012e\n\32\r\32\16\32"+
		"\u012f\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0140\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u0149\n"+
		"\37\r\37\16\37\u014a\3 \3 \3 \6 \u0150\n \r \16 \u0151\3!\3!\3\"\3\"\3"+
		"\"\7\"\u0159\n\"\f\"\16\"\u015c\13\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0166"+
		"\n#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0174\n&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\7-\u0184\n-\f-\16-\u0187\13-\3.\3.\7.\u018b"+
		"\n.\f.\16.\u018e\13.\3.\3.\7.\u0192\n.\f.\16.\u0195\13.\3.\3.\6.\u0199"+
		"\n.\r.\16.\u019a\5.\u019d\n.\3/\3/\5/\u01a1\n/\3/\5/\u01a4\n/\3\60\3\60"+
		"\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^\2\n\4\2MM__\5\2\26\26FGLL\3\2!:\3\2!*\7\2\r\r"+
		"\17\17\22\22FHJJ\4\2<<DD\t\2\31\31\33\33\35\35\37\37==??AA\3\2\3\f\2\u01d7"+
		"\2a\3\2\2\2\4\u00b9\3\2\2\2\6\u00c3\3\2\2\2\b\u00c5\3\2\2\2\n\u00c7\3"+
		"\2\2\2\f\u00c9\3\2\2\2\16\u00cb\3\2\2\2\20\u00cd\3\2\2\2\22\u00d2\3\2"+
		"\2\2\24\u00d6\3\2\2\2\26\u00dd\3\2\2\2\30\u00e3\3\2\2\2\32\u00e7\3\2\2"+
		"\2\34\u00f4\3\2\2\2\36\u00f6\3\2\2\2 \u0107\3\2\2\2\"\u0109\3\2\2\2$\u010b"+
		"\3\2\2\2&\u010d\3\2\2\2(\u010f\3\2\2\2*\u0111\3\2\2\2,\u0117\3\2\2\2."+
		"\u0122\3\2\2\2\60\u0128\3\2\2\2\62\u012d\3\2\2\2\64\u0131\3\2\2\2\66\u0133"+
		"\3\2\2\28\u0135\3\2\2\2:\u013f\3\2\2\2<\u0148\3\2\2\2>\u014f\3\2\2\2@"+
		"\u0153\3\2\2\2B\u0155\3\2\2\2D\u0165\3\2\2\2F\u0167\3\2\2\2H\u0169\3\2"+
		"\2\2J\u0173\3\2\2\2L\u0175\3\2\2\2N\u0177\3\2\2\2P\u0179\3\2\2\2R\u017b"+
		"\3\2\2\2T\u017d\3\2\2\2V\u017f\3\2\2\2X\u0181\3\2\2\2Z\u019c\3\2\2\2\\"+
		"\u01a0\3\2\2\2^\u01a5\3\2\2\2`b\5\4\3\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2d\3\3\2\2\2eg\5\34\17\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2in\3\2\2\2jh\3\2\2\2km\58\35\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2oq\3\2\2\2pn\3\2\2\2qu\5\6\4\2rt\5:\36\2sr\3\2\2\2tw\3\2\2\2us\3\2"+
		"\2\2uv\3\2\2\2v\u008c\3\2\2\2wu\3\2\2\2xz\5\36\20\2yx\3\2\2\2z{\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|\u0080\3\2\2\2}\177\58\35\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0087\5\6\4\2\u0084\u0086\5:\36\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u008ay\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0092\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0091\5\34\17\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0096\7M\2\2\u0096\u00ba\3\2\2\2\u0097\u009b\5\b\5\2\u0098"+
		"\u009a\5\34\17\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\t\2\2\2\u009f\u00ba\3\2\2\2\u00a0\u00a4\5\22\n\2\u00a1\u00a3\5"+
		"\34\17\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\t\2"+
		"\2\2\u00a8\u00ba\3\2\2\2\u00a9\u00ad\5\n\6\2\u00aa\u00ac\5\34\17\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1"+
		"\u00ba\3\2\2\2\u00b2\u00b4\5\34\17\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00ba\7M\2\2\u00b9h\3\2\2\2\u00b9\u0097\3\2\2\2\u00b9"+
		"\u00a0\3\2\2\2\u00b9\u00a9\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\5\3\2\2\2"+
		"\u00bb\u00c4\5\32\16\2\u00bc\u00c4\5\26\f\2\u00bd\u00c4\5&\24\2\u00be"+
		"\u00c4\5@!\2\u00bf\u00c4\5 \21\2\u00c0\u00c4\5\30\r\2\u00c1\u00c4\5<\37"+
		"\2\u00c2\u00c4\5> \2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00bd"+
		"\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\7\3\2\2\2\u00c5\u00c6\7N\2\2"+
		"\u00c6\t\3\2\2\2\u00c7\u00c8\7^\2\2\u00c8\13\3\2\2\2\u00c9\u00ca\7m\2"+
		"\2\u00ca\r\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc\17\3\2\2\2\u00cd\u00ce\7n"+
		"\2\2\u00ce\21\3\2\2\2\u00cf\u00d3\5\f\7\2\u00d0\u00d3\5\16\b\2\u00d1\u00d3"+
		"\5\20\t\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\23"+
		"\3\2\2\2\u00d6\u00d7\7a\2\2\u00d7\u00d8\5\22\n\2\u00d8\u00d9\7b\2\2\u00d9"+
		"\25\3\2\2\2\u00da\u00de\5*\26\2\u00db\u00de\5,\27\2\u00dc\u00de\5B\"\2"+
		"\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\27"+
		"\3\2\2\2\u00df\u00e4\5*\26\2\u00e0\u00e4\5&\24\2\u00e1\u00e4\5B\"\2\u00e2"+
		"\u00e4\5@!\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2"+
		"\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\31\3\2\2\2\u00e7\u00ec\5.\30\2\u00e8\u00eb\5F$\2\u00e9"+
		"\u00eb\5\62\32\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f1\5\62\32\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\33\3\2\2\2\u00f4"+
		"\u00f5\7L\2\2\u00f5\35\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7\37\3\2\2\2\u00f8"+
		"\u0108\7\31\2\2\u00f9\u0108\7\32\2\2\u00fa\u0108\7\33\2\2\u00fb\u0108"+
		"\7\34\2\2\u00fc\u0108\7\35\2\2\u00fd\u0108\7\36\2\2\u00fe\u0108\7\37\2"+
		"\2\u00ff\u0108\7 \2\2\u0100\u0108\7\27\2\2\u0101\u0108\7\30\2\2\u0102"+
		"\u0103\7\"\2\2\u0103\u0108\7%\2\2\u0104\u0108\7<\2\2\u0105\u0108\7=\2"+
		"\2\u0106\u0108\7>\2\2\u0107\u00f8\3\2\2\2\u0107\u00f9\3\2\2\2\u0107\u00fa"+
		"\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u00fc\3\2\2\2\u0107\u00fd\3\2\2\2\u0107"+
		"\u00fe\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0101\3\2"+
		"\2\2\u0107\u0102\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108!\3\2\2\2\u0109\u010a\7J\2\2\u010a#\3\2\2\2\u010b"+
		"\u010c\7K\2\2\u010c%\3\2\2\2\u010d\u010e\t\4\2\2\u010e\'\3\2\2\2\u010f"+
		"\u0110\t\5\2\2\u0110)\3\2\2\2\u0111\u0113\5&\24\2\u0112\u0114\5&\24\2"+
		"\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116+\3\2\2\2\u0117\u0119\7;\2\2\u0118\u011a\5&\24\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"-\3\2\2\2\u011d\u0123\5L\'\2\u011e\u0123\5D#\2\u011f\u0123\5J&\2\u0120"+
		"\u0123\5&\24\2\u0121\u0123\7;\2\2\u0122\u011d\3\2\2\2\u0122\u011e\3\2"+
		"\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"/\3\2\2\2\u0124\u0129\5L\'\2\u0125\u0129\5F$\2\u0126\u0129\5N(\2\u0127"+
		"\u0129\5&\24\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0127\3\2\2\2\u0129\61\3\2\2\2\u012a\u012e\5L\'\2\u012b\u012e"+
		"\5N(\2\u012c\u012e\5&\24\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\63\3\2\2\2\u0131\u0132\7\20\2\2\u0132\65\3\2\2\2\u0133\u0134"+
		"\7\21\2\2\u0134\67\3\2\2\2\u0135\u0136\t\6\2\2\u01369\3\2\2\2\u0137\u0140"+
		"\7I\2\2\u0138\u0140\7\16\2\2\u0139\u0140\7\17\2\2\u013a\u0140\5\64\33"+
		"\2\u013b\u0140\5\66\34\2\u013c\u0140\7\22\2\2\u013d\u0140\7F\2\2\u013e"+
		"\u0140\7G\2\2\u013f\u0137\3\2\2\2\u013f\u0138\3\2\2\2\u013f\u0139\3\2"+
		"\2\2\u013f\u013a\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140;\3\2\2\2\u0141\u0149\7\23\2\2"+
		"\u0142\u0149\7\24\2\2\u0143\u0149\5B\"\2\u0144\u0149\5@!\2\u0145\u0149"+
		"\5\\/\2\u0146\u0149\58\35\2\u0147\u0149\5:\36\2\u0148\u0141\3\2\2\2\u0148"+
		"\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b=\3\2\2\2\u014c\u0150\5<\37\2"+
		"\u014d\u0150\5&\24\2\u014e\u0150\5*\26\2\u014f\u014c\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152?\3\2\2\2\u0153\u0154\7;\2\2\u0154A\3\2\2\2\u0155"+
		"\u0156\5@!\2\u0156\u015a\5@!\2\u0157\u0159\5@!\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015bC\3\2\2\2"+
		"\u015c\u015a\3\2\2\2\u015d\u015e\7\"\2\2\u015e\u0166\7%\2\2\u015f\u0160"+
		"\7#\2\2\u0160\u0161\7/\2\2\u0161\u0166\7.\2\2\u0162\u0163\7$\2\2\u0163"+
		"\u0164\7)\2\2\u0164\u0166\7\63\2\2\u0165\u015d\3\2\2\2\u0165\u015f\3\2"+
		"\2\2\u0165\u0162\3\2\2\2\u0166E\3\2\2\2\u0167\u0168\7E\2\2\u0168G\3\2"+
		"\2\2\u0169\u016a\t\7\2\2\u016aI\3\2\2\2\u016b\u0174\7\32\2\2\u016c\u0174"+
		"\7\34\2\2\u016d\u0174\7\36\2\2\u016e\u0174\7 \2\2\u016f\u0174\7>\2\2\u0170"+
		"\u0174\7@\2\2\u0171\u0174\7B\2\2\u0172\u0174\5H%\2\u0173\u016b\3\2\2\2"+
		"\u0173\u016c\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u016e\3\2\2\2\u0173\u016f"+
		"\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174"+
		"K\3\2\2\2\u0175\u0176\t\b\2\2\u0176M\3\2\2\2\u0177\u0178\7C\2\2\u0178"+
		"O\3\2\2\2\u0179\u017a\t\t\2\2\u017aQ\3\2\2\2\u017b\u017c\7\20\2\2\u017c"+
		"S\3\2\2\2\u017d\u017e\t\t\2\2\u017eU\3\2\2\2\u017f\u0180\7\20\2\2\u0180"+
		"W\3\2\2\2\u0181\u0185\5P)\2\u0182\u0184\5T+\2\u0183\u0182\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186Y\3\2\2\2"+
		"\u0187\u0185\3\2\2\2\u0188\u018c\5P)\2\u0189\u018b\5T+\2\u018a\u0189\3"+
		"\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0193\5V,\2\u0190\u0192\5T+\2"+
		"\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u019d\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\5R*\2\u0197"+
		"\u0199\5T+\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2"+
		"\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u0188\3\2\2\2\u019c\u0196"+
		"\3\2\2\2\u019d[\3\2\2\2\u019e\u01a1\5Z.\2\u019f\u01a1\5X-\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a4\5(\25\2\u01a3"+
		"\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4]\3\2\2\2\u01a5\u01a6\7\25\2\2"+
		"\u01a6_\3\2\2\2/chnu{\u0080\u0087\u008c\u0092\u009b\u00a4\u00ad\u00b5"+
		"\u00b9\u00c3\u00d2\u00d4\u00dd\u00e3\u00e5\u00ea\u00ec\u00f2\u0107\u0115"+
		"\u011b\u0122\u0128\u012d\u012f\u013f\u0148\u014a\u014f\u0151\u015a\u0165"+
		"\u0173\u0185\u018c\u0193\u019a\u019c\u01a0\u01a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}