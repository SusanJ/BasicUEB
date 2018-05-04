package aplus;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.Vocabulary;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.Character;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.Stack;

//import org.dotlessbraille.utilities.Tape5;

 public class BasicTranslator extends aPlusParserBaseListener{
 public static boolean printTree = true;
 public static Tape6 myOutput = new Tape6( "brlout.txt" );

   HashMap<String,String> ink2UEB =
  new HashMap<String,String>();
   HashMap<String,String> ink2UEBalt =
  new HashMap<String,String>();

/**   See ANTLR 4 v4 Ref. p. 123   ParserTreeProperty is an 
    ANTLR helper class that uses an IdentityHashMap 
    to store the annotation results for **specific** 
    nodes, i.e not just nodes with the same context. 
*/
   ParseTreeProperty<String> ueb =
  new ParseTreeProperty<String>();

  Vocabulary VOCABULARY;
  boolean skipLeafierNodes = false;
  boolean skipUcLet = false;
  boolean followLowerNodes = false;
  boolean debug = false;
  boolean testVOCAB = false;
  BufferedTokenStream allTokens;
  int currentLineNumber = 0;
  int lineCapsPassageStarts = 0;

  ParseTree  firstInPassage;  //Potential start of caps passage
  ParseTree pendingLastInPassage;
  Stack <ParseTree> capsPass = new Stack <ParseTree>();
  int capseqCnt = 0;

  BasicTranslator( BufferedTokenStream allTokens ){
   this.VOCABULARY= aPlusParser.VOCABULARY;
   this.allTokens = allTokens;
  // makeTable();
    //System.out.println( "ET object." );
   //EasyTrans et = new EasyTrans();
   //System.out.println( "ET table." );
   EasyTrans.makeTable();
  }

 //===================================================
   //Annotate a tree node with its translation
  void setUEB( ParseTree ctx, String s ){
   ueb.put( ctx, s );
  }
   //Get a previously-saved annotation for a tree node
  String getUEB( ParseTree ctx ) {
   return ueb.get( ctx );
  }
//====================================================
@Override 
 public void enterText(aPlusParser.TextContext ctx) { }
@Override
 public void exitText(aPlusParser.TextContext ctx) { }
@Override 
  public void enterLine( aPlusParser.LineContext ctx){
   currentLineNumber = currentLineNumber + 1;
} 
@Override 
  public void exitLine( aPlusParser.LineContext ctx){

    System.out.println( "\n Line input: " + ctx.getText());
    //System.out.println( ctx.getText() );
    int cnt = ctx.getChildCount();
    System.out.println( "Line "+currentLineNumber+
     " has: "+cnt+" child nodes." );
    String ink;
    String brl;
    StringBuilder buf = new StringBuilder();;

     //Gets UEB from lower nodes where available
    for (int i=0; i<cnt-1; i++){
     brl = getUEB( ctx.getChild(i) );
     ink = ctx.getChild(i).getText();
     if (brl == null){
      if (ink.equals( " ")){
        brl = ink;
      } else {
       System.out.println( "Did not yet get trans for: |"+ink+"|");
       brl = EasyTrans.getBrl( ink );
       System.out.println( "\n Input: "+ink+" UEB: |"+brl+"|" );
       }
     }
     buf.append( brl );
    }
      //NEWLINE??
    setUEB( ctx, buf.toString() );
    int inputLen = ctx.getText().length();
    System.out.println( "inputLen: "+inputLen );
    int last = inputLen-2;
    String noNL = ctx.getText().substring( 0, last ); 

    System.out.println( "Input: "+noNL
                       +" UEB: "+ buf.toString());
}

@Override 
public void enterPsymseq(aPlusParser.PsymseqContext ctx) {
 //Parent of symseq with optional pre/post punc
}
@Override 
 public void exitPsymseq(aPlusParser.PsymseqContext ctx) { 
    //Parent of symseq with optional pre/post punc
    //TO-DO  Check any pre/post punc for standing alone rule and
    // adjust symseq child result if necessary

 System.out.println( "exitPsymseq" );
 int cnt = ctx.getChildCount();
 StringBuilder buf = new StringBuilder();
 for (int i=0; i<cnt; i++ ){
  buf.append( getUEB( ctx.getChild( i ) ) );
 }
 setUEB( ctx, buf.toString() );
}

@Override
 public void enterPsymseq_uc(aPlusParser.Psymseq_ucContext ctx) {
   //Parent of symseq-uc with optional pre/post punc
 }
	
@Override
 public void exitPsymseq_uc(aPlusParser.Psymseq_ucContext ctx) { 
    //Parent of symseq_uc with optional pre/post punc
    //TO-DO  Check any pre/post punc for standing alone rule 
    // context and adjust symseq child result if necessary

 System.out.println( "exitPsymseq_uc" );
 int cnt = ctx.getChildCount();
 StringBuilder buf = new StringBuilder();
 for (int i=0; i<cnt; i++ ){
  buf.append( getUEB( ctx.getChild( i ) ) );
 }
 setUEB( ctx, buf.toString() );
}
	
@Override
 public void enterSymseq_uc(aPlusParser.Symseq_ucContext ctx) { 

  String ink = ctx.getText();
  if (debug){
   System.out.println( "\n   enterSymseq_uc--input: "+ink );
  }
  capseqCnt = capseqCnt + 1;
  if (capseqCnt == 1){
   firstInPassage = ctx; //Possible start of a caps passage
  }
  System.out.println( " enterSymseq_uc --Count caps pass ok : "
         + capseqCnt );
  String brl = EasyTrans.getPreTrans( ink );
  if (brl != null){
   skipLeafierNodes = true;
   setUEB( ctx, brl );
   System.out.println( "ess_uc brl "+brl );   
  }
  capsPass.push( ctx );
 }
	
@Override public void exitSymseq_uc(aPlusParser.Symseq_ucContext ctx) {
  boolean capsPassage = false;
  if (capseqCnt > 2) {
   capsPassage = true;
   pendingLastInPassage = ctx;
  }
  
  System.out.println( "exitSymseq_uc--CAPS PASSAGE: "+capsPassage ); 
  if (skipLeafierNodes){

     //First guy gets caps passage but doesn't know yet!!!!
     //Last guy get caps term
     //Prepend caps word or caps passage indicator
     //THIS IS TOO CUTE!
   StringBuilder buf;
   if (!capsPassage){
     buf = new StringBuilder( ",," ); //Explicit term?
     buf.append( getUEB( ctx ) );
     setUEB( ctx, buf.toString() );
   } else {
     buf = new StringBuilder( ",,,");
     buf.append( getUEB( firstInPassage ) );
     setUEB( firstInPassage, buf.toString() );
   }
   System.out.println( "\n   exitSymseq_uc--Input: "+ctx.getText()
              +" UEB: "+ getUEB( ctx ) );
   myOutput.println( "\n   exitSymseq_uc--Input: "+ctx.getText()
              +" UEB: "+ getUEB( ctx) );
   skipLeafierNodes = false;
   return;
  }
  
 }


 //Handles pretranslated lc and tc words
@Override
  public void enterSymseq(aPlusParser.SymseqContext ctx){
  skipLeafierNodes = false;
  String ink = ctx.getText();

  //if (debug){
   System.out.println( "\n   enterSymseq--input: "+ink );
  //}

  if (EasyTrans.okInCapsPassage( ink )){
   capseqCnt = capseqCnt + 1; 
   System.out.println( " enterSymseq--Count caps pass ok : "
                       + capseqCnt ); 
  } else {
   capseqCnt = 0;
   System.out.println( "capsSeqCnt: "+capseqCnt );
  }

  boolean titleCase = false;
  if (ink.length() < 2) return;

  if (!EasyTrans.alphabetic( ink )) return;

   //Second pass to find pre-translated words

  //if (ink.length() > 1){
/**
   char beg  = ink.charAt( 0 );
   boolean up = Character.isUpperCase( beg );
   if (up){
    String actualRest = ink.substring(1);
    String ifLcRest = actualRest.toLowerCase();
    if (actualRest.equals( ifLcRest )) titleCase = true;
   }
   if (debug){
    System.out.println( "Is input titlecase? "+titleCase );
   }
*/
  //};

boolean testVOCAB = false;
if (testVOCAB){
    Token myFirst = ctx.getStart();
    int tokenb = myFirst.getTokenIndex();
    Token myLast = ctx.getStop();
    int tokene = myLast.getTokenIndex();

    String mySymName = 
      VOCABULARY.getSymbolicName( myFirst.getType() );
    System.out.println( "SymbolicName: "+mySymName );
    String myLitName = 
     VOCABULARY.getLiteralName( myFirst.getType() );
    System.out.println( "LiteralName: "+myLitName );
    String myDisName = 
     VOCABULARY.getDisplayName( myFirst.getType() );
    System.out.println( "DisplayName: "+myDisName );

    System.out.println( "Symseq starting token type: "+
       myFirst.getType()+" index: "+tokenb);
    System.out.println( "Symseq ending token type: "+
       myLast.getType()+" index: "+tokene);
}
  
  String brl;
  //If input is title case check as lower case and if that
  //matches prepend dot6  ASSUMPTION 


  System.out.println( "Enter symSeq -- looking for Pretrans" );
  brl = EasyTrans.getTcPreTrans( ink, "," );
  if (brl != null){
    setUEB( ctx, brl ); 
    skipLeafierNodes = true;                    
  //if (titleCase){
    //brl = EasyTrans.getPreTrans( ink.toLowerCase() );
    //if (brl != null) {
    // brl = ","+brl;
        //if (debug){
         //System.out.println( "enterSymseq brl: "+brl );}
     //setUEB( ctx, brl );
     //skipLeafierNodes = true;
    //}
    System.out.println( "ess brl1 "+brl );
  } else {  //Not titleCase
    //This is NOT always appropriate, what if it is a number? 
    //Only if alphabetic!!!!  
    brl = EasyTrans.getPreTrans( ink );
    if (brl != null){
       //if (debug){
        System.out.println( "enterSymseq brl: "+brl );
       //}
     setUEB( ctx, brl );
     skipLeafierNodes = true; 
     System.out.println( "ess brl2 "+brl );   
    }
   }
 }//End enterSymseq().

@Override
  public void exitSymseq(aPlusParser.SymseqContext ctx){
/** symseq:  punc*
         (conword  //Word containing contractions
         |letter   //One small letter standing alone
         |word     //Alphabetic word
         |tc_word  //Titlecase alphabetic word
         |freqword //Frequently used word with a whole word con.
         |not_lc   //Symbol-sequence with no small letters
         |uc_seq   //Uppercase alphabetic word
         |uc_let
         ) punc*;
  alphabetic word: 
*/

 System.out.println( "exitSymSeq -- skipLowerNodes: "+
       skipLeafierNodes );
    //Cases where a whole-word pretranslation was available
  if (skipLeafierNodes){
   System.out.println( "\n   exitSymseq--Input: "+ctx.getText()
              +" UEB: "+ getUEB( ctx) );
   myOutput.println( "\n   exitSymseq--Input: "+ctx.getText()
              +" UEB: "+ getUEB( ctx) );
   skipLeafierNodes = false;
   return;
  }

  //if (debug)
  System.out.println( "exitSymSeqStarting to finish symbol seq input: "+
                       ctx.getText() );
    
    int cnt = ctx.getChildCount();
    String ink;
    String brl;
    StringBuilder buf = new StringBuilder();

   if (testVOCAB){
    Token myFirst = ctx.getStart();
    int tokenb = myFirst.getTokenIndex();
    Token myLast = ctx.getStop();
    int tokene = myLast.getTokenIndex();

    String mySymName = 
      VOCABULARY.getSymbolicName( myFirst.getType() );
    System.out.println( "SymbolicName: "+mySymName );
    String myLitName = 
     VOCABULARY.getLiteralName( myFirst.getType() );
    System.out.println( "LiteralName: "+myLitName );
    String myDisName = 
     VOCABULARY.getDisplayName( myFirst.getType() );
    System.out.println( "DisplayName: "+myDisName );

    System.out.println( "Symseq starting token type: "+
       myFirst.getType()+" index: "+tokenb);
    System.out.println( "Symseq ending token type: "+
       myLast.getType()+" index: "+tokene);
   }

    //for (int t = tokenb; t = tokene; t++){
    //};
    

      //In current grammar it USUALLY only has one child
    //if (debug)

    System.out.println( "ExitSymseq--Number of child nodes: "+cnt );
    for (int i=0; i<cnt; i++){
      brl = getUEB( ctx.getChild(i) );
      //Token child = ctx.getChild(i);
      //System.out.println( "Child token type: "+child.getType() );
      if (brl == null){
        ink = ctx.getChild(i).getText();
        //if (debug)
        System.out.println( "Missing brl for child: |"+ink+"|" );
        brl = EasyTrans.getBrl( ink );
        //if (debug)
        System.out.println( "\n      -->I got: "+ink+" UEB: "+brl );
        setUEB( ctx.getChild(i), brl ); //not nec. at this high level
      }
     buf.append( brl );
    }
     System.out.println( "Symseq--Input: "+ctx.getText()
              +" UEB: "+ buf.toString());
     myOutput.println( "Symseq--Input: "+ctx.getText()
              +" UEB: "+ buf.toString());
     setUEB( ctx, buf.toString() );
  }//End exitSymseq.

@Override 
public void exitG1Letter(aPlusParser.G1LetterContext ctx) {
 //Letters that require a leading grade 1 indicator. 
 String brl = EasyTrans.getAltBrl( ctx.getText());
 setUEB( ctx, brl );
}
@Override
 public void exitLetterseq(aPlusParser.LetterseqContext ctx) {
   System.out.println( "exitLetterSeq with "+ctx.getChildCount()+
     " child sequences." ); 

  boolean skipVocab = true;
   //There is enough info here to do the caps symbol and word inds and
   //any necessary term ind for a UC seq not at the end
if (skipVocab){
   Token myFirst = ctx.getStart();
    int tokenb = myFirst.getTokenIndex();
    Token myLast = ctx.getStop();
    int tokene = myLast.getTokenIndex();

    String mySymName = 
      VOCABULARY.getSymbolicName( myFirst.getType() );
    System.out.println( "1st token symbolicName: "+mySymName );
    String myDisName = 
     VOCABULARY.getDisplayName( myFirst.getType() );
    System.out.println( "1st token displayName: "+myDisName );

    System.out.println( "Symseq starting token type: "+
       myFirst.getType()+" index: "+tokenb);
    System.out.println( "Symseq ending token type: "+
       myLast.getType()+" index: "+tokene);
        //What if there is another channel?
        //Should at least be one more token
    int nextToken = tokene+1;
    System.out.println( "Symseq ending token type: "+
       myLast.getType()+" index: "+tokene);
     //Get token from token index???
    Token nextTok = allTokens.get( nextToken );
   System.out.println( "Symseq ending token type: "+
       nextTok.getType()+" indexOfNext: "+nextToken);
}

    int cnt = ctx.getChildCount();
    System.out.println( "  Letter sequence: "+cnt+" child nodes." );
    String ink;
    String brl;
    StringBuilder buf = new StringBuilder();;

     //Gets UEB from lower nodes where available
    for (int i=0; i<cnt-1; i++){
     brl = getUEB( ctx.getChild(i) );
     ink = ctx.getChild(i).getText();
     //if (brl == null){
      //System.out.println( "Did not yet get trans for: |"+ink+"|");
      //brl = EasyTrans.getBrl( ink );
      //System.out.println( "\n Input: "+ink+" UEB: |"+brl+"|" );
     //}
     buf.append( brl );
    }
      //NEWLINE??
    setUEB( ctx, buf.toString() );
}//End exitLetterseq.

@Override
  public void exitSpunc(aPlusParser.SpuncContext ctx) { 
  if (followLowerNodes){
    System.out.println( "  In exitSpunc" );
   }
   String ink = ctx.getText();
   String brl = EasyTrans.getBrl( ink );
   if (brl != null){
    setUEB( ctx, brl );
   }
  System.out.println( "Spunc--input: "+ink+" UEB: "+brl );
  }//End exitSpunc.
@Override
  public void exitEpunc(aPlusParser.EpuncContext ctx) { 
   if (followLowerNodes){
    System.out.println( "  In exitEpunc" );
   }
   String ink = ctx.getText();
   String brl = EasyTrans.getBrl( ink );
   if (brl != null){
    setUEB( ctx, brl );
   }
  System.out.println( "Epunc--input: "+ink+" UEB: "+brl );
  }//End exitEpunc.

@Override
  public void exitConword(aPlusParser.ConwordContext ctx) {
   if( skipLeafierNodes) return;
   String word = ctx.getText();
if (followLowerNodes)
   System.out.println( "  In exitConword--Word to be contracted: "+word );
    String ink;
    String brl;
    int cnt = ctx.getChildCount();
    StringBuilder buf = new StringBuilder();
    for (int i=0; i<cnt; i++){
     ink = ctx.getChild(i).getText();
     brl = getUEB( ctx.getChild(i) );
if (followLowerNodes)
     System.out.println( "\n      -->Input: "+ink+" UEB: |"+brl+"|" );
     //System.out.println( "\n      -->Input: "+ink );
     if (brl == null){
      System.out.println( "OOPS -- was counting on child nodes." );
     }
     buf.append( brl );
    }
if (followLowerNodes)
   System.out.println( "Conword -- UEB concat: "+buf.toString() );
   setUEB(ctx, buf.toString() );
 }
@Override 
public void exitStartconword(aPlusParser.StartconwordContext ctx) {
   if( skipLeafierNodes) return;
    if (followLowerNodes) System.out.println( "  In exitStartconword" );

   int cnt = ctx.getChildCount();
   if (cnt != 1){
     System.out.println( "Logic error in exitStartconword--cnt: "+cnt );
     System.exit( 1 );
   }

   String brl = getUEB( ctx.getChild( 0 ));
   if (brl != null){
     if (followLowerNodes) System.out.println( "Child trans to save: "+brl );
   } else {
     if (debug) System.out.println( "Expected child trans.");
     brl = EasyTrans.getBrl( ctx.getChild(0).getText() );
   }
   setUEB( ctx, brl );
 }
@Override 
public void exitStartConTC(aPlusParser.StartConTCContext ctx) {
   if( skipLeafierNodes) return;
   if (followLowerNodes) System.out.println( "  In exitStartConTC" );
   int cnt = ctx.getChildCount();
   if (cnt != 1){
     System.out.println( "Logic error in exitStartConTC--cnt: "+cnt );
     System.exit( 1 );
   }
   String brl = EasyTrans.getBrl( ctx.getText() );
   setUEB( ctx, brl );
}
@Override 
public void exitMidCon(aPlusParser.MidConContext ctx) {
   if( skipLeafierNodes) return;
   if (followLowerNodes){
    System.out.println( "  In exitMidCon" );
   }
   int cnt = ctx.getChildCount();
   if (cnt != 1){
     System.out.println( "Logic error in exitMidCon--cnt: "+cnt );
     System.exit( 1 );
   }
   String brl = EasyTrans.getBrl( ctx.getText() );
   setUEB( ctx, brl );
}
@Override
 public void exitMidendconword(aPlusParser.MidendconwordContext ctx) {
   if( skipLeafierNodes) return;
  if (followLowerNodes)  System.out.println( "  In exitMidendconWord" );
    //Can translate any remaining children
   int cnt = ctx.getChildCount();
   
   String brl;
   StringBuilder buf = new StringBuilder();
   for (int i=0; i<cnt; i++){
    brl = getUEB( ctx.getChild( i ));
    if (brl != null){
      if (followLowerNodes)
        System.out.println( "Child provided translation "+
        "to use here: "+brl );
      buf.append( brl );
    } else {
      brl = EasyTrans.getBrl( ctx.getText() );
      System.out.println( "Got translation: "+brl );
      buf.append( brl );
    }
   }
   setUEB( ctx, buf.toString() ) ;
}
@Override
 public void exitSmall(aPlusParser.SmallContext ctx) { 
   if (skipLeafierNodes) return;
   String ink = ctx.getText();
   String brl = EasyTrans.getBrl( ink );
   setUEB( ctx, brl );
 }
@Override
 public void exitUc_let(aPlusParser.Uc_letContext ctx) { 
  if( skipLeafierNodes) return;
  if (skipUcLet) return;
  String ink = ctx.getText();
  String brl = EasyTrans.getBrl( ink );
  setUEB( ctx, brl );
 }
@Override public void enterUc_seq(aPlusParser.Uc_seqContext ctx) {
  System.out.println( "  In enterUc_seq" );
  //Since this is sequence we don't want the individual uc
  //letters to each have a dot6!
  boolean skipUcLet = true;
 }
@Override public void exitUc_seq(aPlusParser.Uc_seqContext ctx) {
  System.out.println( "  In exitUc_seq" );
 

   String ink = ctx.getText();
   int cnt = ctx.getChildCount();
   System.out.println( "\n  exitUc_seq: "+ ink +
      " no. of child nodes: "+cnt );
   skipUcLet = false;
    //Translate letters
   StringBuilder buf = new StringBuilder(",,");
   String brl;
   for (int i=0; i<cnt; i++){
    brl = EasyTrans.getAltBrl( ctx.getChild(i).getText() );
    buf.append( brl );
   }
   System.out.println( "  UC sequence: "+buf.toString() );
   setUEB( ctx, buf.toString() );
 }
@Override
 public void exitAnywhereCon(aPlusParser.AnywhereConContext ctx) { 
    if( skipLeafierNodes) return;
  if (followLowerNodes) System.out.println( "  In AnywhereCon" );
  
   int cnt = ctx.getChildCount();
   if (cnt != 1){
     System.out.println( "Logic error in exitAnywhereCont--cnt: "+cnt );
     System.exit( 1);
   }
   String brl = getUEB( ctx.getChild( 0 ));
   if (brl != null){
      if (followLowerNodes) System.out.println( "Child trans to save: "+brl );
   } else {
     brl = EasyTrans.getBrl( ctx.getText() );
      if (followLowerNodes) System.out.println( "Got trans: "+brl );
   }
   setUEB( ctx, brl );
 }

   //'Garbage' is random sequences that were't otherwise recognized
//@Override
/**
 public void exitGarbage(aPlusParser.GarbageContext ctx) { 
   String brl;
   StringBuilder buf = new StringBuilder();
   for (int i=0; i<ctx.getChildCount(); i++){
    brl = getUEB( ctx.getChild( i ));
    buf.append( brl );
   }
   System.out.println( "   In exitGarbage--output "+ buf.toString() );
   setUEB( ctx, buf.toString() ) ;
}
*/
     //UEB Upper Numbers

  //Not lc handles all sequence w/o small letters but typically
  // numbers
@Override
  public void exitNot_lc(aPlusParser.Not_lcContext ctx) {
   String ink = ctx.getText();
   int cnt = ctx.getChildCount();
    if (followLowerNodes) System.out.println( "   In exitNot_lc--input "+ ink +
      " no. of child nodes: "+cnt );
 
   String brl;
   StringBuilder buf = new StringBuilder();
   for (int i=0; i<cnt; i++){
    brl = getUEB( ctx.getChild( i ));
    if (brl != null){
       if (followLowerNodes) System.out.println( "Child provided translation "+
        "to use here: "+brl );
      buf.append( brl );
    } else {
      brl = EasyTrans.getBrl( ctx.getText() );
       if (followLowerNodes) System.out.println( "Got translation: "+brl );
      buf.append( brl );
    }
   }
   System.out.println( "   In exitNot_lc--output "+ buf.toString() );
   setUEB( ctx, buf.toString() ) ;
  }
@Override
 public void exitNumber(aPlusParser.NumberContext ctx) {
   String ink = ctx.getText();
   int cnt = ctx.getChildCount();
   System.out.println( "\n  In exitNumber: "+ ink +
      " no. of child nodes: "+cnt );

    //Concatenate numeric ind. and any other digits
   StringBuilder buf = new StringBuilder();
   for (int i=0; i<cnt; i++){
    buf.append(getUEB( ctx.getChild( i )));
   }
   System.out.println( "  Number: "+buf.toString() );
   setUEB( ctx, buf.toString() );
 }
@Override
 public void exitInteger(aPlusParser.IntegerContext ctx) {
   String ink = ctx.getText();
   int cnt = ctx.getChildCount();
   System.out.println( "\n  In exitInteger: "+ ink +
      " no. of digits: "+cnt );

    //Concatenate numeric ind. and any other digits
   StringBuilder buf = new StringBuilder();
   for (int i=0; i<cnt; i++){
    buf.append(getUEB( ctx.getChild( i )));
   }
   System.out.println( "  Upper integer: "+buf.toString() );
   setUEB( ctx, buf.toString() );
 }
@Override
 public void exitDecpt(aPlusParser.DecptContext ctx) {
   String ink = ctx.getText();
   System.out.println( "In exitDecpt "+ ink );
   String brl = EasyTrans.getBrl( ink );
   System.out.println( "Decimal point: "+brl );
   setUEB( ctx, brl );
 }
@Override
 public void exitReal(aPlusParser.RealContext ctx) {
   String ink = ctx.getText();
   int cnt = ctx.getChildCount();
   System.out.println( "\n  In exitReal: "+ ink +
      " no. of digits: "+cnt );

    //Concatenate numeric ind. and any other digits
   StringBuilder buf = new StringBuilder();
   for (int i=0; i<cnt; i++){
    buf.append(getUEB( ctx.getChild( i )));
   }
   System.out.println( "  Upper real number: "+buf.toString() );
   setUEB( ctx, buf.toString() );
 }
@Override
 public void exitStartNum(aPlusParser.StartNumContext ctx) {
   String ink = ctx.getText();
   System.out.println( "In exitStartNum: "+ ink );
     //AltBrl prepends #
   String brl = EasyTrans.getAltBrl( ink );
   System.out.println( "Upper number: "+brl );
   setUEB( ctx, brl );
 }
@Override 
 public void exitStartDec(aPlusParser.StartDecContext ctx) {
  String ink = ctx.getText();
   System.out.println( "In exitStartDc: "+ ink );
     //AltBrl prepends #
   String brl = EasyTrans.getAltBrl( ink );
   System.out.println( "Upper number decimal point: "+brl );
   setUEB( ctx, brl );
 } 
@Override
 public void exitDig(aPlusParser.DigContext ctx) {
   String ink = ctx.getText();
   System.out.println( "In exitDig "+ ink );
   String brl = EasyTrans.getBrl( ink );
   System.out.println( "Upper number: "+brl );
   setUEB( ctx, brl );
 }
// public void enterAlphaseq(aPlusParser.AlphaseqContext ctx) {
 //@Override
 // public void exitSymseq(aPlusParser.SymseqContext ctx){


//===========================================================
  public static void main( String[] args ) throws Exception {
//===========================================================

 System.out.println( "\n    Welcome to Basic UEB Translator!" );
 System.out.println( "      Contracted braille w/o code switching options." );
 System.out.println( "      Uses ANTLR 4.7.1 for parsing." );

 String inputFile = null;
 CharStream input = null;
 if ( args.length > 0 ) inputFile = args[0];
 if (inputFile == null){
    System.out.println( "\n    -->Enter North Am. ASCII Braille; "+
                        "use small letters." );
    System.out.println( "    -->End input with CTRL-z "+
                      "as only symbol on last line.\n" );
    Reader myReader = new InputStreamReader( System.in, "UTF-8");
    CodePointCharStream cpcs = CharStreams.fromReader( myReader );
    input = cpcs;
 } else {
    File f = new File( inputFile );
    if (f.exists() && !f.isDirectory() )  {
       input = CharStreams.fromFileName( inputFile );
    } else {
       System.out.println( "\n OOPS! Cannot find input file: "
                           +inputFile );
       System.exit( 0 );
    }
  }

  //Tape6 myOutput = new Tape6( "uebout.txt" );

/**  I. Connect lexer and parser and instruct parser to
        build a parse tree.  
*/
        aPlusLexer lexer = new aPlusLexer( input );
        //  Supposedly allows parser to re-write its output
        //CommonTokenStream tokens = new TokenRewriteStream(lexer);
        CommonTokenStream tokens = new CommonTokenStream( lexer );
         //Lexer has created the Token Stream
        System.out.println( "The lexer has created the TokenStream." );
        myOutput.println( "The lexer has created the TokenStream." );
        aPlusParser parser = new aPlusParser( tokens ); 
        parser.setBuildParseTree( true );
		
/**  II. Start tree with the topmost rule in the Parser 
         grammar.  (Rule #0 if grammar starts with that one.)
*/
         ParseTree tree = parser.text();
         if (printTree){
           System.out.println( "     PARSE TREE: ");
           System.out.println( 
	                 tree.toStringTree( parser ));
           System.out.println();
           String x = tree.toStringTree( parser);
           //System.out.println( wrap( x, 40) );
           //System.out.println( wrap( tree.toStringTree( parser)), 40 );
         }
        myOutput.println( "     PARSE TREE: ");
        //myOutput.println( 
	                 //tree.toStringTree( parser ));
        myOutput.println( "  (repeated but wrapped) " );
        String tmpTree = tree.toStringTree( parser );
        //myOutput.printAsIs( wrap( tmpTree, 40 ), myOutput );
        wrap( tmpTree, 60, myOutput );


    //System.out.println( "(text\n "+" (line\n "+"  (item\n " );
    // Optionally print tree in text form
    //if (printTree) System.out.println( "      "+
	               //tree.toStringTree(parser).substring(17));
    //prettyPrint( tree.toStringTree( parser ));

/**  III. Insert logic to walk and annotate tree here....*/

          //PendingCapInds capInfo = new PendingCapInds();
         // boolean uncontracted = true;   //SHOULD BE AN OPTION SOON

       //Communication point for backtranslation
          //KeepTrack kt = new KeepTrack( capInfo, uncontracted, 0 );
          //kt.makeTables( false, false );
           //Back translator, i.e. annotator, must extend baseListener 
          BasicTranslator trans = new BasicTranslator( tokens );
          //trans.makeTable();
          //KeepTrack2 kt2 = new KeepTrack2( bt );
          //BackPR.setRuleNames();
     
     ParseTreeWalker walker = new ParseTreeWalker();
     walker.walk(trans , tree);

/**  IV. Display backtranslation  */

     System.out.println();
     System.out.println( "      ***Translation***" );
     //System.out.println(" Translated braille from annotated tree: ");
     //System.out.println( bt.getBrl( tree ) );

     myOutput.finish();

 }//End Main.
private static final String linebreak = "\n"; // or "\r\n";

  //Found on stack (lost link, thanks whoever!)
public static String wrap(String string, int lineLength, Tape6 myOutput) {
    StringBuilder b = new StringBuilder();
    for (String line : string.split(Pattern.quote(linebreak))) {
        b.append(wrapLine(line, lineLength, myOutput));
    }
    return b.toString();
}

private static String wrapLine(String line, int lineLength,
   Tape6 myOutput ) {
    if (line.length() == 0) return linebreak;
    if (line.length() <= lineLength) return line + linebreak;
    String[] words = line.split(" ");
    StringBuilder allLines = new StringBuilder();
    StringBuilder trimmedLine = new StringBuilder();
    for (String word : words) {
        if (trimmedLine.length() + 1 + word.length() <= lineLength) {
            trimmedLine.append(word).append(" ");
        } else {
            if (trimmedLine.toString().startsWith( "(item" )){
              trimmedLine = trimmedLine.insert( 0, " " );
            }
            myOutput.println( trimmedLine.toString() );
            allLines.append(trimmedLine).append(linebreak);
            trimmedLine = new StringBuilder();
            trimmedLine.append(word).append(" ");
        }
    }
    if (trimmedLine.length() > 0) {
        myOutput.println( trimmedLine.toString() );
        allLines.append(trimmedLine);
    }
    allLines.append(linebreak);
    return allLines.toString();
}
}//End Class BasicTranslator.