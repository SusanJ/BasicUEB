// Generated from aPlusParser.g4 by ANTLR 4.7.1
 package aplus; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link aPlusParser}.
 */
public interface aPlusParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link aPlusParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(aPlusParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(aPlusParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(aPlusParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(aPlusParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#aplus}.
	 * @param ctx the parse tree
	 */
	void enterAplus(aPlusParser.AplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#aplus}.
	 * @param ctx the parse tree
	 */
	void exitAplus(aPlusParser.AplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#psymseq}.
	 * @param ctx the parse tree
	 */
	void enterPsymseq(aPlusParser.PsymseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#psymseq}.
	 * @param ctx the parse tree
	 */
	void exitPsymseq(aPlusParser.PsymseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#psymseq_uc}.
	 * @param ctx the parse tree
	 */
	void enterPsymseq_uc(aPlusParser.Psymseq_ucContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#psymseq_uc}.
	 * @param ctx the parse tree
	 */
	void exitPsymseq_uc(aPlusParser.Psymseq_ucContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#symseq}.
	 * @param ctx the parse tree
	 */
	void enterSymseq(aPlusParser.SymseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#symseq}.
	 * @param ctx the parse tree
	 */
	void exitSymseq(aPlusParser.SymseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#symseq_uc}.
	 * @param ctx the parse tree
	 */
	void enterSymseq_uc(aPlusParser.Symseq_ucContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#symseq_uc}.
	 * @param ctx the parse tree
	 */
	void exitSymseq_uc(aPlusParser.Symseq_ucContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#alphaseq}.
	 * @param ctx the parse tree
	 */
	void enterAlphaseq(aPlusParser.AlphaseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#alphaseq}.
	 * @param ctx the parse tree
	 */
	void exitAlphaseq(aPlusParser.AlphaseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#uc_seq}.
	 * @param ctx the parse tree
	 */
	void enterUc_seq(aPlusParser.Uc_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#uc_seq}.
	 * @param ctx the parse tree
	 */
	void exitUc_seq(aPlusParser.Uc_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#letterseq}.
	 * @param ctx the parse tree
	 */
	void enterLetterseq(aPlusParser.LetterseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#letterseq}.
	 * @param ctx the parse tree
	 */
	void exitLetterseq(aPlusParser.LetterseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#conword}.
	 * @param ctx the parse tree
	 */
	void enterConword(aPlusParser.ConwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#conword}.
	 * @param ctx the parse tree
	 */
	void exitConword(aPlusParser.ConwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#conwordUC}.
	 * @param ctx the parse tree
	 */
	void enterConwordUC(aPlusParser.ConwordUCContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#conwordUC}.
	 * @param ctx the parse tree
	 */
	void exitConwordUC(aPlusParser.ConwordUCContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(aPlusParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(aPlusParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(aPlusParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(aPlusParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#freq_uc}.
	 * @param ctx the parse tree
	 */
	void enterFreq_uc(aPlusParser.Freq_ucContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#freq_uc}.
	 * @param ctx the parse tree
	 */
	void exitFreq_uc(aPlusParser.Freq_ucContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#freqword}.
	 * @param ctx the parse tree
	 */
	void enterFreqword(aPlusParser.FreqwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#freqword}.
	 * @param ctx the parse tree
	 */
	void exitFreqword(aPlusParser.FreqwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#small}.
	 * @param ctx the parse tree
	 */
	void enterSmall(aPlusParser.SmallContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#small}.
	 * @param ctx the parse tree
	 */
	void exitSmall(aPlusParser.SmallContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#g1Letter}.
	 * @param ctx the parse tree
	 */
	void enterG1Letter(aPlusParser.G1LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#g1Letter}.
	 * @param ctx the parse tree
	 */
	void exitG1Letter(aPlusParser.G1LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(aPlusParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(aPlusParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#tc_word}.
	 * @param ctx the parse tree
	 */
	void enterTc_word(aPlusParser.Tc_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#tc_word}.
	 * @param ctx the parse tree
	 */
	void exitTc_word(aPlusParser.Tc_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#uc_word}.
	 * @param ctx the parse tree
	 */
	void enterUc_word(aPlusParser.Uc_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#uc_word}.
	 * @param ctx the parse tree
	 */
	void exitUc_word(aPlusParser.Uc_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#startconword}.
	 * @param ctx the parse tree
	 */
	void enterStartconword(aPlusParser.StartconwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#startconword}.
	 * @param ctx the parse tree
	 */
	void exitStartconword(aPlusParser.StartconwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#startconWordUC}.
	 * @param ctx the parse tree
	 */
	void enterStartconWordUC(aPlusParser.StartconWordUCContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#startconWordUC}.
	 * @param ctx the parse tree
	 */
	void exitStartconWordUC(aPlusParser.StartconWordUCContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#midconword}.
	 * @param ctx the parse tree
	 */
	void enterMidconword(aPlusParser.MidconwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#midconword}.
	 * @param ctx the parse tree
	 */
	void exitMidconword(aPlusParser.MidconwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#midconworduc}.
	 * @param ctx the parse tree
	 */
	void enterMidconworduc(aPlusParser.MidconworducContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#midconworduc}.
	 * @param ctx the parse tree
	 */
	void exitMidconworduc(aPlusParser.MidconworducContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#midendconword}.
	 * @param ctx the parse tree
	 */
	void enterMidendconword(aPlusParser.MidendconwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#midendconword}.
	 * @param ctx the parse tree
	 */
	void exitMidendconword(aPlusParser.MidendconwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#midendconworduc}.
	 * @param ctx the parse tree
	 */
	void enterMidendconworduc(aPlusParser.MidendconworducContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#midendconworduc}.
	 * @param ctx the parse tree
	 */
	void exitMidendconworduc(aPlusParser.MidendconworducContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#period}.
	 * @param ctx the parse tree
	 */
	void enterPeriod(aPlusParser.PeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#period}.
	 * @param ctx the parse tree
	 */
	void exitPeriod(aPlusParser.PeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(aPlusParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(aPlusParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#spunc}.
	 * @param ctx the parse tree
	 */
	void enterSpunc(aPlusParser.SpuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#spunc}.
	 * @param ctx the parse tree
	 */
	void exitSpunc(aPlusParser.SpuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#epunc}.
	 * @param ctx the parse tree
	 */
	void enterEpunc(aPlusParser.EpuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#epunc}.
	 * @param ctx the parse tree
	 */
	void exitEpunc(aPlusParser.EpuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#not_lc}.
	 * @param ctx the parse tree
	 */
	void enterNot_lc(aPlusParser.Not_lcContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#not_lc}.
	 * @param ctx the parse tree
	 */
	void exitNot_lc(aPlusParser.Not_lcContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#uc_let}.
	 * @param ctx the parse tree
	 */
	void enterUc_let(aPlusParser.Uc_letContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#uc_let}.
	 * @param ctx the parse tree
	 */
	void exitUc_let(aPlusParser.Uc_letContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#begCon}.
	 * @param ctx the parse tree
	 */
	void enterBegCon(aPlusParser.BegConContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#begCon}.
	 * @param ctx the parse tree
	 */
	void exitBegCon(aPlusParser.BegConContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#midCon}.
	 * @param ctx the parse tree
	 */
	void enterMidCon(aPlusParser.MidConContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#midCon}.
	 * @param ctx the parse tree
	 */
	void exitMidCon(aPlusParser.MidConContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#midConUC}.
	 * @param ctx the parse tree
	 */
	void enterMidConUC(aPlusParser.MidConUCContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#midConUC}.
	 * @param ctx the parse tree
	 */
	void exitMidConUC(aPlusParser.MidConUCContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#begConTC}.
	 * @param ctx the parse tree
	 */
	void enterBegConTC(aPlusParser.BegConTCContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#begConTC}.
	 * @param ctx the parse tree
	 */
	void exitBegConTC(aPlusParser.BegConTCContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#startConTC}.
	 * @param ctx the parse tree
	 */
	void enterStartConTC(aPlusParser.StartConTCContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#startConTC}.
	 * @param ctx the parse tree
	 */
	void exitStartConTC(aPlusParser.StartConTCContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#anywhereCon}.
	 * @param ctx the parse tree
	 */
	void enterAnywhereCon(aPlusParser.AnywhereConContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#anywhereCon}.
	 * @param ctx the parse tree
	 */
	void exitAnywhereCon(aPlusParser.AnywhereConContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#anywhereConUC}.
	 * @param ctx the parse tree
	 */
	void enterAnywhereConUC(aPlusParser.AnywhereConUCContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#anywhereConUC}.
	 * @param ctx the parse tree
	 */
	void exitAnywhereConUC(aPlusParser.AnywhereConUCContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#midEndCon}.
	 * @param ctx the parse tree
	 */
	void enterMidEndCon(aPlusParser.MidEndConContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#midEndCon}.
	 * @param ctx the parse tree
	 */
	void exitMidEndCon(aPlusParser.MidEndConContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#midEndConUC}.
	 * @param ctx the parse tree
	 */
	void enterMidEndConUC(aPlusParser.MidEndConUCContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#midEndConUC}.
	 * @param ctx the parse tree
	 */
	void exitMidEndConUC(aPlusParser.MidEndConUCContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#startNum}.
	 * @param ctx the parse tree
	 */
	void enterStartNum(aPlusParser.StartNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#startNum}.
	 * @param ctx the parse tree
	 */
	void exitStartNum(aPlusParser.StartNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#startDec}.
	 * @param ctx the parse tree
	 */
	void enterStartDec(aPlusParser.StartDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#startDec}.
	 * @param ctx the parse tree
	 */
	void exitStartDec(aPlusParser.StartDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#dig}.
	 * @param ctx the parse tree
	 */
	void enterDig(aPlusParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#dig}.
	 * @param ctx the parse tree
	 */
	void exitDig(aPlusParser.DigContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#decpt}.
	 * @param ctx the parse tree
	 */
	void enterDecpt(aPlusParser.DecptContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#decpt}.
	 * @param ctx the parse tree
	 */
	void exitDecpt(aPlusParser.DecptContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(aPlusParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(aPlusParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(aPlusParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(aPlusParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(aPlusParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(aPlusParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link aPlusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(aPlusParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link aPlusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(aPlusParser.LiteralContext ctx);
}