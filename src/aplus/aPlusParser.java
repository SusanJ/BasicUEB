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
		ITAL=1, BOLD=2, ZERO=3, ONE=4, TWO=5, THREE=6, FOUR=7, FIVE=8, SIX=9, 
		SEVEN=10, EIGHT=11, NINE=12, LESS_THAN=13, GRTR_THAN=14, OFENCE=15, CFENCE=16, 
		NEU=17, DEC=18, PUNC=19, SPEC=20, FSLASH=21, BACK_TICK=22, SEP=23, BE=24, 
		BE_TC=25, IN=26, IN_TC=27, EN=28, EN_TC=29, STRONG=30, STRONG_TC=31, WEIRD=32, 
		WEIRD_TC=33, LARGE=34, LARGE_TC=35, ILC45=36, ILC45_TC=37, ILC456=38, 
		ILC456_TC=39, ILC5=40, ILC5_TC=41, SMALL=42, CAPS=43, STRONG_GS=44, STRONG_GS_TC=45, 
		FLC=46, BEGCON=47, BEGCON_TC=48, MIDCON=49, WW=50, WW_TC=51, MDASH=52, 
		NDASH=53, ODQUO=54, CDQUO=55, SPACE=56, NEWLINE=57, LATIN_LETTER=58, FUN_NAME=59;
	public static final int
		RULE_text = 0, RULE_line = 1, RULE_symseq = 2, RULE_conword = 3, RULE_space = 4, 
		RULE_separator = 5, RULE_freqword = 6, RULE_letter = 7, RULE_word = 8, 
		RULE_tc_word = 9, RULE_startconword = 10, RULE_midconword = 11, RULE_midendconword = 12, 
		RULE_punc = 13, RULE_not_lc = 14, RULE_uc_let = 15, RULE_uc_seq = 16, 
		RULE_begCon = 17, RULE_midCon = 18, RULE_begConTC = 19, RULE_startConTC = 20, 
		RULE_freaky = 21, RULE_anywhereCon = 22, RULE_midEndCon = 23, RULE_startNum = 24, 
		RULE_startDec = 25, RULE_dig = 26, RULE_decpt = 27, RULE_integer = 28, 
		RULE_real = 29, RULE_number = 30, RULE_literal = 31, RULE_italics = 32, 
		RULE_bold = 33, RULE_start_tag = 34, RULE_end_tag = 35;
	public static final String[] ruleNames = {
		"text", "line", "symseq", "conword", "space", "separator", "freqword", 
		"letter", "word", "tc_word", "startconword", "midconword", "midendconword", 
		"punc", "not_lc", "uc_let", "uc_seq", "begCon", "midCon", "begConTC", 
		"startConTC", "freaky", "anywhereCon", "midEndCon", "startNum", "startDec", 
		"dig", "decpt", "integer", "real", "number", "literal", "italics", "bold", 
		"start_tag", "end_tag"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", 
		"'8'", "'9'", "'<'", "'>'", null, null, null, "'.'", null, null, "'/'", 
		"'`'", null, "'be'", "'Be'", "'in'", "'In'", "'en'", "'En'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'\u2014'", "'\u2013'", 
		"'\u201C'", "'\u201D'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ITAL", "BOLD", "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", 
		"SEVEN", "EIGHT", "NINE", "LESS_THAN", "GRTR_THAN", "OFENCE", "CFENCE", 
		"NEU", "DEC", "PUNC", "SPEC", "FSLASH", "BACK_TICK", "SEP", "BE", "BE_TC", 
		"IN", "IN_TC", "EN", "EN_TC", "STRONG", "STRONG_TC", "WEIRD", "WEIRD_TC", 
		"LARGE", "LARGE_TC", "ILC45", "ILC45_TC", "ILC456", "ILC456_TC", "ILC5", 
		"ILC5_TC", "SMALL", "CAPS", "STRONG_GS", "STRONG_GS_TC", "FLC", "BEGCON", 
		"BEGCON_TC", "MIDCON", "WW", "WW_TC", "MDASH", "NDASH", "ODQUO", "CDQUO", 
		"SPACE", "NEWLINE", "LATIN_LETTER", "FUN_NAME"
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
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				line();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << LESS_THAN) | (1L << GRTR_THAN) | (1L << OFENCE) | (1L << CFENCE) | (1L << NEU) | (1L << DEC) | (1L << PUNC) | (1L << SPEC) | (1L << FSLASH) | (1L << BE) | (1L << BE_TC) | (1L << IN) | (1L << IN_TC) | (1L << EN) | (1L << EN_TC) | (1L << STRONG) | (1L << STRONG_TC) | (1L << WEIRD) | (1L << WEIRD_TC) | (1L << LARGE) | (1L << LARGE_TC) | (1L << ILC45) | (1L << ILC45_TC) | (1L << ILC456) | (1L << ILC456_TC) | (1L << ILC5) | (1L << ILC5_TC) | (1L << SMALL) | (1L << CAPS) | (1L << STRONG_GS) | (1L << BEGCON) | (1L << BEGCON_TC) | (1L << WW) | (1L << WW_TC) | (1L << MDASH) | (1L << NDASH) | (1L << SPACE) | (1L << NEWLINE))) != 0) );
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(77);
					space();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(83);
				symseq();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(86); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(85);
								separator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(88); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						{
						setState(90);
						symseq();
						}
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(97);
					space();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				setState(111);
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
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Tc_wordContext tc_word() {
			return getRuleContext(Tc_wordContext.class,0);
		}
		public FreqwordContext freqword() {
			return getRuleContext(FreqwordContext.class,0);
		}
		public Not_lcContext not_lc() {
			return getRuleContext(Not_lcContext.class,0);
		}
		public Uc_seqContext uc_seq() {
			return getRuleContext(Uc_seqContext.class,0);
		}
		public Uc_letContext uc_let() {
			return getRuleContext(Uc_letContext.class,0);
		}
		public List<PuncContext> punc() {
			return getRuleContexts(PuncContext.class);
		}
		public PuncContext punc(int i) {
			return getRuleContext(PuncContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					punc();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(120);
				conword();
				}
				break;
			case 2:
				{
				setState(121);
				letter();
				}
				break;
			case 3:
				{
				setState(122);
				word();
				}
				break;
			case 4:
				{
				setState(123);
				tc_word();
				}
				break;
			case 5:
				{
				setState(124);
				freqword();
				}
				break;
			case 6:
				{
				setState(125);
				not_lc();
				}
				break;
			case 7:
				{
				setState(126);
				uc_seq();
				}
				break;
			case 8:
				{
				setState(127);
				uc_let();
				}
				break;
			}
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					punc();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 6, RULE_conword);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			startconword();
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(139);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MIDCON:
						{
						setState(137);
						midCon();
						}
						break;
					case IN:
					case EN:
					case LARGE:
					case ILC45:
					case ILC456:
					case ILC5:
					case SMALL:
					case STRONG_GS:
					case FLC:
					case WW:
						{
						setState(138);
						midendconword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				midendconword();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EN) | (1L << LARGE) | (1L << ILC45) | (1L << ILC456) | (1L << ILC5) | (1L << SMALL) | (1L << STRONG_GS) | (1L << FLC) | (1L << WW))) != 0) );
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
		enterRule(_localctx, 8, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		enterRule(_localctx, 10, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEP) | (1L << MDASH) | (1L << NDASH) | (1L << SPACE))) != 0)) ) {
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
		public TerminalNode WW() { return getToken(aPlusParser.WW, 0); }
		public TerminalNode WW_TC() { return getToken(aPlusParser.WW_TC, 0); }
		public TerminalNode STRONG() { return getToken(aPlusParser.STRONG, 0); }
		public TerminalNode STRONG_TC() { return getToken(aPlusParser.STRONG_TC, 0); }
		public TerminalNode ILC45() { return getToken(aPlusParser.ILC45, 0); }
		public TerminalNode ILC45_TC() { return getToken(aPlusParser.ILC45_TC, 0); }
		public TerminalNode ILC456() { return getToken(aPlusParser.ILC456, 0); }
		public TerminalNode ILC456_TC() { return getToken(aPlusParser.ILC456_TC, 0); }
		public TerminalNode ILC5() { return getToken(aPlusParser.ILC5, 0); }
		public TerminalNode ILC5_TC() { return getToken(aPlusParser.ILC5_TC, 0); }
		public TerminalNode WEIRD() { return getToken(aPlusParser.WEIRD, 0); }
		public TerminalNode WEIRD_TC() { return getToken(aPlusParser.WEIRD_TC, 0); }
		public TerminalNode BE() { return getToken(aPlusParser.BE, 0); }
		public TerminalNode BE_TC() { return getToken(aPlusParser.BE_TC, 0); }
		public TerminalNode IN() { return getToken(aPlusParser.IN, 0); }
		public TerminalNode IN_TC() { return getToken(aPlusParser.IN_TC, 0); }
		public TerminalNode EN_TC() { return getToken(aPlusParser.EN_TC, 0); }
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
		enterRule(_localctx, 12, RULE_freqword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BE) | (1L << BE_TC) | (1L << IN) | (1L << IN_TC) | (1L << EN_TC) | (1L << STRONG) | (1L << STRONG_TC) | (1L << WEIRD) | (1L << WEIRD_TC) | (1L << LARGE) | (1L << LARGE_TC) | (1L << ILC45) | (1L << ILC45_TC) | (1L << ILC456) | (1L << ILC456_TC) | (1L << ILC5) | (1L << ILC5_TC) | (1L << WW) | (1L << WW_TC))) != 0)) ) {
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

	public static class LetterContext extends ParserRuleContext {
		public TerminalNode SMALL() { return getToken(aPlusParser.SMALL, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitLetter(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_letter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SMALL);
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
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
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
		enterRule(_localctx, 16, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			letter();
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				letter();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SMALL );
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
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
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
		enterRule(_localctx, 18, RULE_tc_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CAPS);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				letter();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SMALL );
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
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
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
		enterRule(_localctx, 20, RULE_startconword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
			case EN:
			case LARGE:
			case ILC45:
			case ILC456:
			case ILC5:
			case STRONG_GS:
			case WW:
				{
				setState(169);
				anywhereCon();
				}
				break;
			case BE:
			case BEGCON:
				{
				setState(170);
				begCon();
				}
				break;
			case BE_TC:
			case IN_TC:
			case EN_TC:
			case LARGE_TC:
			case ILC45_TC:
			case ILC456_TC:
			case ILC5_TC:
			case BEGCON_TC:
				{
				setState(171);
				startConTC();
				}
				break;
			case SMALL:
				{
				setState(172);
				letter();
				}
				break;
			case CAPS:
				{
				setState(173);
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
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
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
		enterRule(_localctx, 22, RULE_midconword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
			case EN:
			case LARGE:
			case ILC45:
			case ILC456:
			case ILC5:
			case STRONG_GS:
			case WW:
				{
				setState(176);
				anywhereCon();
				}
				break;
			case MIDCON:
				{
				setState(177);
				midCon();
				}
				break;
			case FLC:
				{
				setState(178);
				midEndCon();
				}
				break;
			case SMALL:
				{
				setState(179);
				letter();
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
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
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
		enterRule(_localctx, 24, RULE_midendconword);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(185);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IN:
					case EN:
					case LARGE:
					case ILC45:
					case ILC456:
					case ILC5:
					case STRONG_GS:
					case WW:
						{
						setState(182);
						anywhereCon();
						}
						break;
					case FLC:
						{
						setState(183);
						midEndCon();
						}
						break;
					case SMALL:
						{
						setState(184);
						letter();
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
				setState(187); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class PuncContext extends ParserRuleContext {
		public TerminalNode OFENCE() { return getToken(aPlusParser.OFENCE, 0); }
		public TerminalNode CFENCE() { return getToken(aPlusParser.CFENCE, 0); }
		public TerminalNode NEU() { return getToken(aPlusParser.NEU, 0); }
		public TerminalNode DEC() { return getToken(aPlusParser.DEC, 0); }
		public TerminalNode PUNC() { return getToken(aPlusParser.PUNC, 0); }
		public TerminalNode MDASH() { return getToken(aPlusParser.MDASH, 0); }
		public TerminalNode NDASH() { return getToken(aPlusParser.NDASH, 0); }
		public PuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterPunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitPunc(this);
		}
	}

	public final PuncContext punc() throws RecognitionException {
		PuncContext _localctx = new PuncContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_punc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OFENCE) | (1L << CFENCE) | (1L << NEU) | (1L << DEC) | (1L << PUNC) | (1L << MDASH) | (1L << NDASH))) != 0)) ) {
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

	public static class Not_lcContext extends ParserRuleContext {
		public List<TerminalNode> SPEC() { return getTokens(aPlusParser.SPEC); }
		public TerminalNode SPEC(int i) {
			return getToken(aPlusParser.SPEC, i);
		}
		public List<TerminalNode> FSLASH() { return getTokens(aPlusParser.FSLASH); }
		public TerminalNode FSLASH(int i) {
			return getToken(aPlusParser.FSLASH, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(aPlusParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(aPlusParser.LESS_THAN, i);
		}
		public List<TerminalNode> GRTR_THAN() { return getTokens(aPlusParser.GRTR_THAN); }
		public TerminalNode GRTR_THAN(int i) {
			return getToken(aPlusParser.GRTR_THAN, i);
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
		public List<PuncContext> punc() {
			return getRuleContexts(PuncContext.class);
		}
		public PuncContext punc(int i) {
			return getRuleContext(PuncContext.class,i);
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
		enterRule(_localctx, 28, RULE_not_lc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(191);
						match(SPEC);
						}
						break;
					case 2:
						{
						setState(192);
						match(FSLASH);
						}
						break;
					case 3:
						{
						setState(193);
						match(LESS_THAN);
						}
						break;
					case 4:
						{
						setState(194);
						match(GRTR_THAN);
						}
						break;
					case 5:
						{
						setState(195);
						uc_seq();
						}
						break;
					case 6:
						{
						setState(196);
						uc_let();
						}
						break;
					case 7:
						{
						setState(197);
						number();
						}
						break;
					case 8:
						{
						setState(198);
						punc();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(201); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 30, RULE_uc_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		public List<TerminalNode> CAPS() { return getTokens(aPlusParser.CAPS); }
		public TerminalNode CAPS(int i) {
			return getToken(aPlusParser.CAPS, i);
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
		enterRule(_localctx, 32, RULE_uc_seq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CAPS);
			setState(206);
			match(CAPS);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					match(CAPS);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public TerminalNode BEGCON() { return getToken(aPlusParser.BEGCON, 0); }
		public TerminalNode BE() { return getToken(aPlusParser.BE, 0); }
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
		enterRule(_localctx, 34, RULE_begCon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==BE || _la==BEGCON) ) {
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
		enterRule(_localctx, 36, RULE_midCon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 38, RULE_begConTC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		enterRule(_localctx, 40, RULE_startConTC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE_TC:
				{
				setState(219);
				match(LARGE_TC);
				}
				break;
			case ILC45_TC:
				{
				setState(220);
				match(ILC45_TC);
				}
				break;
			case ILC456_TC:
				{
				setState(221);
				match(ILC456_TC);
				}
				break;
			case ILC5_TC:
				{
				setState(222);
				match(ILC5_TC);
				}
				break;
			case IN_TC:
				{
				setState(223);
				match(IN_TC);
				}
				break;
			case EN_TC:
				{
				setState(224);
				match(EN_TC);
				setState(225);
				match(STRONG_GS_TC);
				}
				break;
			case BE_TC:
			case BEGCON_TC:
				{
				setState(226);
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

	public static class FreakyContext extends ParserRuleContext {
		public TerminalNode WW() { return getToken(aPlusParser.WW, 0); }
		public FreakyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freaky; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterFreaky(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitFreaky(this);
		}
	}

	public final FreakyContext freaky() throws RecognitionException {
		FreakyContext _localctx = new FreakyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_freaky);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(WW);
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
		public FreakyContext freaky() {
			return getRuleContext(FreakyContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_anywhereCon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARGE:
				{
				setState(231);
				match(LARGE);
				}
				break;
			case ILC45:
				{
				setState(232);
				match(ILC45);
				}
				break;
			case ILC456:
				{
				setState(233);
				match(ILC456);
				}
				break;
			case ILC5:
				{
				setState(234);
				match(ILC5);
				}
				break;
			case STRONG_GS:
				{
				setState(235);
				match(STRONG_GS);
				}
				break;
			case IN:
				{
				setState(236);
				match(IN);
				}
				break;
			case EN:
				{
				setState(237);
				match(EN);
				}
				break;
			case WW:
				{
				setState(238);
				freaky();
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
		enterRule(_localctx, 46, RULE_midEndCon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(241);
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
		enterRule(_localctx, 48, RULE_startNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		public TerminalNode DEC() { return getToken(aPlusParser.DEC, 0); }
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
		enterRule(_localctx, 50, RULE_startDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(DEC);
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
		public StartNumContext startNum() {
			return getRuleContext(StartNumContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			startNum();
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
		public StartDecContext startDec() {
			return getRuleContext(StartDecContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_decpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			startDec();
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
		enterRule(_localctx, 56, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			startNum();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					dig();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
		enterRule(_localctx, 58, RULE_real);
		try {
			int _alt;
			setState(272);
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
				setState(258);
				integer();
				setState(259);
				decpt();
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						dig();
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				startDec();
				setState(268); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(267);
						dig();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(270); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
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
		enterRule(_localctx, 60, RULE_number);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				real();
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
		enterRule(_localctx, 62, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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

	public static class ItalicsContext extends ParserRuleContext {
		public TerminalNode ITAL() { return getToken(aPlusParser.ITAL, 0); }
		public ItalicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterItalics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitItalics(this);
		}
	}

	public final ItalicsContext italics() throws RecognitionException {
		ItalicsContext _localctx = new ItalicsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_italics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ITAL);
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

	public static class BoldContext extends ParserRuleContext {
		public TerminalNode BOLD() { return getToken(aPlusParser.BOLD, 0); }
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitBold(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(BOLD);
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

	public static class Start_tagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(aPlusParser.LESS_THAN, 0); }
		public TerminalNode GRTR_THAN() { return getToken(aPlusParser.GRTR_THAN, 0); }
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
		}
		public Start_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterStart_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitStart_tag(this);
		}
	}

	public final Start_tagContext start_tag() throws RecognitionException {
		Start_tagContext _localctx = new Start_tagContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_start_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LESS_THAN);
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285);
				letter();
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SMALL );
			setState(290);
			match(GRTR_THAN);
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

	public static class End_tagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(aPlusParser.LESS_THAN, 0); }
		public TerminalNode FSLASH() { return getToken(aPlusParser.FSLASH, 0); }
		public TerminalNode GRTR_THAN() { return getToken(aPlusParser.GRTR_THAN, 0); }
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
		}
		public End_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).enterEnd_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aPlusParserListener ) ((aPlusParserListener)listener).exitEnd_tag(this);
		}
	}

	public final End_tagContext end_tag() throws RecognitionException {
		End_tagContext _localctx = new End_tagContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_end_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LESS_THAN);
			setState(293);
			match(FSLASH);
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				letter();
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SMALL );
			setState(299);
			match(GRTR_THAN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2L\n\2\r\2\16\2M\3\3\7\3Q\n\3\f\3"+
		"\16\3T\13\3\3\3\3\3\3\3\6\3Y\n\3\r\3\16\3Z\3\3\3\3\7\3_\n\3\f\3\16\3b"+
		"\13\3\3\3\7\3e\n\3\f\3\16\3h\13\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3"+
		"\3\3\5\3s\n\3\3\4\7\4v\n\4\f\4\16\4y\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u0083\n\4\3\4\7\4\u0086\n\4\f\4\16\4\u0089\13\4\3\5\3\5\3\5\7"+
		"\5\u008e\n\5\f\5\16\5\u0091\13\5\3\5\6\5\u0094\n\5\r\5\16\5\u0095\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\6\n\u00a2\n\n\r\n\16\n\u00a3\3\13"+
		"\3\13\6\13\u00a8\n\13\r\13\16\13\u00a9\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n"+
		"\f\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\16\3\16\3\16\6\16\u00bc\n\16\r\16\16"+
		"\16\u00bd\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00ca"+
		"\n\20\r\20\16\20\u00cb\3\21\3\21\3\22\3\22\3\22\7\22\u00d3\n\22\f\22\16"+
		"\22\u00d6\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00e6\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00f2\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\7\36\u0100\n\36\f\36\16\36\u0103\13\36\3\37\3\37\3\37"+
		"\7\37\u0108\n\37\f\37\16\37\u010b\13\37\3\37\3\37\6\37\u010f\n\37\r\37"+
		"\16\37\u0110\5\37\u0113\n\37\3 \3 \5 \u0117\n \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\6$\u0121\n$\r$\16$\u0122\3$\3$\3%\3%\3%\6%\u012a\n%\r%\16%\u012b\3"+
		"%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFH\2\b\5\2\31\31\66\67::\5\2\32\35\37+\64\65\4\2\21\25\66\67"+
		"\4\2\32\32\61\61\4\2\33\33\62\62\3\2\5\16\2\u0147\2K\3\2\2\2\4r\3\2\2"+
		"\2\6w\3\2\2\2\b\u008a\3\2\2\2\n\u0097\3\2\2\2\f\u0099\3\2\2\2\16\u009b"+
		"\3\2\2\2\20\u009d\3\2\2\2\22\u009f\3\2\2\2\24\u00a5\3\2\2\2\26\u00b0\3"+
		"\2\2\2\30\u00b6\3\2\2\2\32\u00bb\3\2\2\2\34\u00bf\3\2\2\2\36\u00c9\3\2"+
		"\2\2 \u00cd\3\2\2\2\"\u00cf\3\2\2\2$\u00d7\3\2\2\2&\u00d9\3\2\2\2(\u00db"+
		"\3\2\2\2*\u00e5\3\2\2\2,\u00e7\3\2\2\2.\u00f1\3\2\2\2\60\u00f3\3\2\2\2"+
		"\62\u00f5\3\2\2\2\64\u00f7\3\2\2\2\66\u00f9\3\2\2\28\u00fb\3\2\2\2:\u00fd"+
		"\3\2\2\2<\u0112\3\2\2\2>\u0116\3\2\2\2@\u0118\3\2\2\2B\u011a\3\2\2\2D"+
		"\u011c\3\2\2\2F\u011e\3\2\2\2H\u0126\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LM\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OQ\5\n\6\2PO\3\2\2\2QT\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\5\6\4\2V`\3\2\2\2WY\5\f\7\2XW\3"+
		"\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\5\6\4\2]_\3\2\2\2^"+
		"X\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2af\3\2\2\2b`\3\2\2\2ce\5\n\6\2"+
		"dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7;\2\2"+
		"js\3\2\2\2km\5\n\6\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2"+
		"pn\3\2\2\2qs\7;\2\2rR\3\2\2\2rn\3\2\2\2s\5\3\2\2\2tv\5\34\17\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0082\3\2\2\2yw\3\2\2\2z\u0083\5\b\5"+
		"\2{\u0083\5\20\t\2|\u0083\5\22\n\2}\u0083\5\24\13\2~\u0083\5\16\b\2\177"+
		"\u0083\5\36\20\2\u0080\u0083\5\"\22\2\u0081\u0083\5 \21\2\u0082z\3\2\2"+
		"\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082\177"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0087\3\2\2\2\u0084"+
		"\u0086\5\34\17\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\7\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008f"+
		"\5\26\f\2\u008b\u008e\5&\24\2\u008c\u008e\5\32\16\2\u008d\u008b\3\2\2"+
		"\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\5\32\16\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\t\3\2\2\2\u0097\u0098\7:\2\2\u0098\13\3\2\2\2\u0099\u009a"+
		"\t\2\2\2\u009a\r\3\2\2\2\u009b\u009c\t\3\2\2\u009c\17\3\2\2\2\u009d\u009e"+
		"\7,\2\2\u009e\21\3\2\2\2\u009f\u00a1\5\20\t\2\u00a0\u00a2\5\20\t\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\23\3\2\2\2\u00a5\u00a7\7-\2\2\u00a6\u00a8\5\20\t\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\25\3\2\2\2\u00ab\u00b1\5.\30\2\u00ac\u00b1\5$\23\2\u00ad\u00b1\5*\26"+
		"\2\u00ae\u00b1\5\20\t\2\u00af\u00b1\7-\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac"+
		"\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\27\3\2\2\2\u00b2\u00b7\5.\30\2\u00b3\u00b7\5&\24\2\u00b4\u00b7\5\60\31"+
		"\2\u00b5\u00b7\5\20\t\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00bc\5.\30"+
		"\2\u00b9\u00bc\5\60\31\2\u00ba\u00bc\5\20\t\2\u00bb\u00b8\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\33\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0\35"+
		"\3\2\2\2\u00c1\u00ca\7\26\2\2\u00c2\u00ca\7\27\2\2\u00c3\u00ca\7\17\2"+
		"\2\u00c4\u00ca\7\20\2\2\u00c5\u00ca\5\"\22\2\u00c6\u00ca\5 \21\2\u00c7"+
		"\u00ca\5> \2\u00c8\u00ca\5\34\17\2\u00c9\u00c1\3\2\2\2\u00c9\u00c2\3\2"+
		"\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9"+
		"\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\37\3\2\2\2\u00cd\u00ce"+
		"\7-\2\2\u00ce!\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0\u00d4\7-\2\2\u00d1\u00d3"+
		"\7-\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5#\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\t\5\2\2"+
		"\u00d8%\3\2\2\2\u00d9\u00da\7\63\2\2\u00da\'\3\2\2\2\u00db\u00dc\t\6\2"+
		"\2\u00dc)\3\2\2\2\u00dd\u00e6\7%\2\2\u00de\u00e6\7\'\2\2\u00df\u00e6\7"+
		")\2\2\u00e0\u00e6\7+\2\2\u00e1\u00e6\7\35\2\2\u00e2\u00e3\7\37\2\2\u00e3"+
		"\u00e6\7/\2\2\u00e4\u00e6\5(\25\2\u00e5\u00dd\3\2\2\2\u00e5\u00de\3\2"+
		"\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5"+
		"\u00e2\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6+\3\2\2\2\u00e7\u00e8\7\64\2\2"+
		"\u00e8-\3\2\2\2\u00e9\u00f2\7$\2\2\u00ea\u00f2\7&\2\2\u00eb\u00f2\7(\2"+
		"\2\u00ec\u00f2\7*\2\2\u00ed\u00f2\7.\2\2\u00ee\u00f2\7\34\2\2\u00ef\u00f2"+
		"\7\36\2\2\u00f0\u00f2\5,\27\2\u00f1\u00e9\3\2\2\2\u00f1\u00ea\3\2\2\2"+
		"\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2/\3\2\2\2\u00f3"+
		"\u00f4\7\60\2\2\u00f4\61\3\2\2\2\u00f5\u00f6\t\7\2\2\u00f6\63\3\2\2\2"+
		"\u00f7\u00f8\7\24\2\2\u00f8\65\3\2\2\2\u00f9\u00fa\5\62\32\2\u00fa\67"+
		"\3\2\2\2\u00fb\u00fc\5\64\33\2\u00fc9\3\2\2\2\u00fd\u0101\5\62\32\2\u00fe"+
		"\u0100\5\66\34\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0102;\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105"+
		"\5:\36\2\u0105\u0109\58\35\2\u0106\u0108\5\66\34\2\u0107\u0106\3\2\2\2"+
		"\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0113"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\5\64\33\2\u010d\u010f\5\66\34"+
		"\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0104\3\2\2\2\u0112\u010c\3\2\2\2\u0113"+
		"=\3\2\2\2\u0114\u0117\5:\36\2\u0115\u0117\5<\37\2\u0116\u0114\3\2\2\2"+
		"\u0116\u0115\3\2\2\2\u0117?\3\2\2\2\u0118\u0119\7\30\2\2\u0119A\3\2\2"+
		"\2\u011a\u011b\7\3\2\2\u011bC\3\2\2\2\u011c\u011d\7\4\2\2\u011dE\3\2\2"+
		"\2\u011e\u0120\7\17\2\2\u011f\u0121\5\20\t\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\7\20\2\2\u0125G\3\2\2\2\u0126\u0127\7\17\2\2\u0127\u0129"+
		"\7\27\2\2\u0128\u012a\5\20\t\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2"+
		"\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\7\20\2\2\u012eI\3\2\2\2!MRZ`fnrw\u0082\u0087\u008d\u008f\u0095\u00a3"+
		"\u00a9\u00b0\u00b6\u00bb\u00bd\u00c9\u00cb\u00d4\u00e5\u00f1\u0101\u0109"+
		"\u0110\u0112\u0116\u0122\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}