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

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

 public class BasicTranslator extends aPlusParserBaseListener{
 public static boolean printTree = true;

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
  boolean testVOCAB = false;
  BufferedTokenStream allTokens;

  BasicTranslator( BufferedTokenStream allTokens ){
   this.VOCABULARY= aPlusParser.VOCABULARY;
   this.allTokens = allTokens;
   makeTable();
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

  String xgetBrl( String ink ){
   boolean has = ink2UEB.containsKey( ink );
   //System.out.println("   "+ink+" table key: "+has );
   return ink2UEB.get( ink );
  }
  String xgetAltBrl( String ink ){
   boolean has = ink2UEBalt.containsKey( ink );
   //System.out.println("   "+ink+" table key: "+has );
   return ink2UEBalt.get( ink );
  }

   //  Simple tables that require grammar information
   // from parser for correct use
   //  Print input recognizes all 94 ASCII characters
   // Braille output uses North Am. ASCII Braille 
   // translation only using ASCII small letters
   //  Other braille representations are available in
   // Java class BrailleCell in another packate
  void makeTable(){

  //Individual capital letters
ink2UEB.put( "A", ",a" );
ink2UEB.put( "B", ",b" );
ink2UEB.put( "C", ",c" );
ink2UEB.put( "D", ",d" );
ink2UEB.put( "E", ",e" );
ink2UEB.put( "F", ",f" );
ink2UEB.put( "G", ",g" );
ink2UEB.put( "H", ",h" );
ink2UEB.put( "I", ",i" );

ink2UEB.put( "T", ",t" );
ink2UEB.put( "Z", ",z" );

  //Small letters (complete)
ink2UEB.put( "a", "a" );
ink2UEB.put( "b", "b" );
ink2UEB.put( "c", "c" );
ink2UEB.put( "d", "d" );
ink2UEB.put( "e", "e" );
ink2UEB.put( "f", "f" );
ink2UEB.put( "g", "g" );
ink2UEB.put( "h", "h" );
ink2UEB.put( "i", "i" );
ink2UEB.put( "j", "j" );
ink2UEB.put( "k", "k" );
ink2UEB.put( "l", "l" );
ink2UEB.put( "m", "m" );
ink2UEB.put( "n", "n" );
ink2UEB.put( "o", "o" );
ink2UEB.put( "p", "p" );
ink2UEB.put( "q", "q" );
ink2UEB.put( "r", "r" );
ink2UEB.put( "s", "s" );
ink2UEB.put( "t", "t" );
ink2UEB.put( "u", "u" );
ink2UEB.put( "v", "v" );
ink2UEB.put( "w", "w" );
ink2UEB.put( "x", "x" );
ink2UEB.put( "y", "y" );
ink2UEB.put( "z", "z" );

  //"Large" signs (complete)
ink2UEB.put( "and", "&" );
ink2UEB.put( "for", "=" );
ink2UEB.put( "of", "(" );
ink2UEB.put( "the", "!" );
ink2UEB.put( "with", ")" );
ink2UEB.put( "And", ",&" );
ink2UEB.put( "For", ",=" );
ink2UEB.put( "Of", ",(" );
ink2UEB.put( "The", ",!" );
ink2UEB.put( "With", ",)" );

  //Alphabetic word signs
  //The lexer gets these no matter the context ???
ink2UEB.put( "but", "b" );
ink2UEB.put( "But", ",b" );
ink2UEB.put( "can", "c" );
ink2UEB.put( "Can", ",c" );
ink2UEB.put( "do", "d" );
ink2UEB.put( "Do", ",d" );
ink2UEB.put( "every", "e" );
ink2UEB.put( "Every", ",e" );
ink2UEB.put( "from", "f" );
ink2UEB.put( "From", ",f" );
ink2UEB.put( "go", "g" );
ink2UEB.put( "Go", ",g" );
ink2UEB.put( "have", "h" );
ink2UEB.put( "Have", ",h" );

ink2UEB.put( "like", "l" );
ink2UEB.put( "Like", ",l" );
ink2UEB.put( "more", "m" );
ink2UEB.put( "More", ",m" );
ink2UEB.put( "not", "not" );
ink2UEB.put( "Not", ",not" );
ink2UEB.put( "people", "p" );
ink2UEB.put( "People", ",p" );
ink2UEB.put( "quite", "q" );
ink2UEB.put( "Quite", ",q" );
ink2UEB.put( "rather", "r");
ink2UEB.put( "Rather", ",r");

  //Same sequences as alphabetic words but
  //represent themselves when used in longer words
  //Note alternate hash table is required
  //because lexer doesn't know context!
ink2UEBalt.put( "but", "but" );
ink2UEBalt.put( "can", "can" );
ink2UEBalt.put( "do", "do" );
ink2UEBalt.put( "every", "ev]ry" );
ink2UEBalt.put( "from", "from" );
ink2UEBalt.put( "go", "go" );
ink2UEBalt.put( "have", "have" );
ink2UEBalt.put( "just", "ju/" );
ink2UEBalt.put( "knowledge", "\"kl$ge" );
ink2UEBalt.put( "like", "like" );
ink2UEBalt.put( "more", "more" );
ink2UEBalt.put( "not", "not" );
ink2UEBalt.put( "people", "people" );
ink2UEBalt.put( "quite", "quite" );
ink2UEBalt.put( "rather", "ra?]");
ink2UEBalt.put( "so", "so" );
ink2UEBalt.put( "that", "?at" );
ink2UEBalt.put( "us", "us" );
ink2UEBalt.put( "very", "v]y" );
ink2UEBalt.put( "will", "will" );
ink2UEBalt.put( "it", "it" );
ink2UEBalt.put( "you", "you" );
ink2UEBalt.put( "as", "as" );
ink2UEBalt.put( "it", "it" );



  
ink2UEB.put( "en", "5" );
ink2UEB.put( "En", ",5" );
ink2UEB.put( "in", "9" );
ink2UEB.put( "In", ",9" );

   //Strong word signs
ink2UEB.put( "child", "*"  );
ink2UEB.put( "Child", ",*" );
ink2UEB.put( "shall", "%"  );
ink2UEB.put( "Shall", ",%" );
ink2UEB.put( "still", "/"  );
ink2UEB.put( "Still", ",/" );
ink2UEB.put( "which", ":"  );
ink2UEB.put( "Which", ",:" );
ink2UEB.put( "this",  "?"  );
ink2UEB.put( "This",  ",?" );
ink2UEB.put( "out",  "\\"  );
ink2UEB.put( "Out",  ",\\" );

   //Initial-letter contractions
ink2UEB.put( "upon", "^u");
ink2UEB.put( "Upon", ",^u" );
ink2UEB.put( "cannot", "_c" );
ink2UEB.put( "Cannot", ",_c" );
ink2UEB.put( "day", "\"d" );
ink2UEB.put( "Day", ",\"d" );

  //String group signs
ink2UEB.put( "ch", "*"  );
ink2UEB.put( "Ch", ",*" );
ink2UEB.put( "sh", "%"  );
ink2UEB.put( "Sh", ",%" );
ink2UEB.put( "st", "/"  );
ink2UEB.put( "St", ",/" );
ink2UEB.put( "wh", ":"  );
ink2UEB.put( "Wh", ",:" );
ink2UEB.put( "th",  "?" );
ink2UEB.put( "Th",  ",?" );
ink2UEB.put( "ou",  "\\"  );
ink2UEB.put( "Ou",  ",\\" );

ink2UEB.put( "er", "]"  );
ink2UEB.put( "Er", ",]" );

  //Final-letter contractions
ink2UEB.put( "ment", ";t");

  //Punctuation
ink2UEB.put( ",", "1");
ink2UEB.put( ";", "2");
ink2UEB.put( ":", "3");
ink2UEB.put( ".", "4");
ink2UEB.put( "!", "6");
ink2UEB.put( "?", "8");
ink2UEB.put( "'", "'");
ink2UEB.put( " ", " ");
ink2UEB.put( "\"", ",7" );

  //Lower numbers
  // Parser indicates leading digit
  //which requires #
ink2UEB.put( "0", "j" );
ink2UEBalt.put( "0", "#j" );
ink2UEB.put( "1", "a" );
ink2UEBalt.put( "1", "#a" );
ink2UEB.put( "2", "b" );
ink2UEBalt.put( "2", "#b" );
ink2UEB.put( "3", "c" );
ink2UEBalt.put( "3", "#c" );
ink2UEB.put( "4", "d" );
ink2UEBalt.put( "4", "#d" );
ink2UEB.put( "5", "e" );
ink2UEBalt.put( "5", "#e" );

  //Special symbols
ink2UEB.put( "$", "@s" );

System.out.println( "Transtable size: "+ink2UEB.size() );

  }

@Override 
  public void exitLine( aPlusParser.LineContext ctx){

    System.out.println( "\n Line input: " + ctx.getText());
    //System.out.println( ctx.getText() );
    int cnt = ctx.getChildCount();
    System.out.println( "Line has: "+cnt+" child nodes." );
    String ink;
    String brl;
    StringBuilder buf = new StringBuilder();;

     //Gets UEB from lower nodes where available
    for (int i=0; i<cnt-1; i++){
     brl = getUEB( ctx.getChild(i) );
     ink = ctx.getChild(i).getText();
     if (brl == null){
      System.out.println( "Did not yet get trans for: |"+ink+"|");
      brl = EasyTrans.getBrl( ink );
      System.out.println( "\n Input: "+ink+" UEB: |"+brl+"|" );
     }
     buf.append( ink );
    }
    System.out.println( "Line--Input: "+ctx.getText()
              +" UEB: "+ buf.toString());
  }
@Override
  public void enterSymseq(aPlusParser.SymseqContext ctx){
  skipLeafierNodes = false;
  String ink = ctx.getText();
  System.out.println( "\n   enterSymseq input: "+ink );
       
  String brl = EasyTrans.getPreTrans( ink );
  if (brl != null){
   System.out.println( "enterSymseq brl: "+brl );
   setUEB( ctx, brl );
   skipLeafierNodes = true;
  }
 }
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

  if (skipLeafierNodes){
   System.out.println( "\n   exitSymseq--Input: "+ctx.getText()
              +" UEB: "+ getUEB( ctx) );
   skipLeafierNodes = false;
   return;
  }
   
  System.out.println( "Starting to finish symbol seq input: "+
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
    

      //In current grammar it only has one child
    System.out.println( "Number of child nodes: "+cnt );
    for (int i=0; i<cnt; i++){
     brl = getUEB( ctx.getChild(i) );
     //Token child = ctx.getChild(i);
     //System.out.println( "Child token type: "+child.getType() );
     if (brl == null){
      ink = ctx.getChild(i).getText();
      System.out.println( "Missing brl for child: |"+ink+"|" );
      brl = EasyTrans.getBrl( ink );
      System.out.println( "\n      -->I got: "+ink+" UEB: "+brl );
      setUEB( ctx.getChild(i), brl );
     }
     buf.append( brl );
    }
    System.out.println( "Symseq--Input: "+ctx.getText()
              +" UEB: "+ buf.toString());
    setUEB( ctx, buf.toString() );
  }//End exitSymseq.

@Override
  public void exitPunc(aPlusParser.PuncContext ctx) { 
   String ink = ctx.getText();
   String brl = EasyTrans.getBrl( ink );
   if (ink != null){
    setUEB( ctx, brl );
   }
  }//End exitPunc.
@Override
  public void exitConword(aPlusParser.ConwordContext ctx) {
   if( skipLeafierNodes) return;
   String word = ctx.getText();
   System.out.println( "  In exitConword--Word to be contracted: "+word );
    String ink;
    String brl;
    int cnt = ctx.getChildCount();
    StringBuilder buf = new StringBuilder();
    for (int i=0; i<cnt; i++){
     ink = ctx.getChild(i).getText();
     brl = getUEB( ctx.getChild(i) );
     System.out.println( "\n      -->Input: "+ink+" UEB: |"+brl+"|" );
     //System.out.println( "\n      -->Input: "+ink );
     if (brl == null){
      System.out.println( "OOPS -- was counting on child nodes." );
     }
     buf.append( brl );
    }
   System.out.println( "Conword -- UEB concat: "+buf.toString() );
   setUEB(ctx, buf.toString() );
 }
@Override public void exitStartconword(aPlusParser.StartconwordContext ctx) {
   if( skipLeafierNodes) return;
    System.out.println( "  In exitStartconword" );
  int cnt = ctx.getChildCount();
   if (cnt != 1){
     System.out.println( "Logic error in exitStartconwor--cnt: "+cnt );
     System.exit( 1 );
   }
   String brl = getUEB( ctx.getChild( 0 ));
   if (brl != null){
     System.out.println( "Child trans to save: "+brl );
   } else {
     System.out.println( "Expected child trans.");
   }
   setUEB( ctx, brl );
 }
@Override
 public void exitMidendconword(aPlusParser.MidendconwordContext ctx) {
   if( skipLeafierNodes) return;
   System.out.println( "  In exitMidendconWord" );
    //Can translate any remaining children
   int cnt = ctx.getChildCount();
   
   String brl;
   StringBuilder buf = new StringBuilder();
   for (int i=0; i<cnt; i++){
    brl = getUEB( ctx.getChild( i ));
    if (brl != null){
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
 public void exitLetter(aPlusParser.LetterContext ctx) {
   if( skipLeafierNodes) return;
   String ink = ctx.getText();
  String brl = EasyTrans.getBrl( ink );
  setUEB( ctx, brl );
 }
@Override
 public void exitAnywhereCon(aPlusParser.AnywhereConContext ctx) { 
    if( skipLeafierNodes) return;
   System.out.println( "  In AnywhereCon" );
  
   int cnt = ctx.getChildCount();
   if (cnt != 1){
     System.out.println( "Logic error in exitAnywhereCont--cnt: "+cnt );
     System.exit( 1);
   }
   String brl = getUEB( ctx.getChild( 0 ));
   if (brl != null){
     System.out.println( "Child trans to save: "+brl );
   } else {
     brl = EasyTrans.getBrl( ctx.getText() );
     System.out.println( "Got trans: "+brl );
   }
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

/**  I. Connect lexer and parser and instruct parser to
        build a parse tree.  
*/
        aPlusLexer lexer = new aPlusLexer( input );
        //  Supposedly allows parser to re-write its output
        //CommonTokenStream tokens = new TokenRewriteStream(lexer);
        CommonTokenStream tokens = new CommonTokenStream( lexer );
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
          trans.makeTable();
          //KeepTrack2 kt2 = new KeepTrack2( bt );
          //BackPR.setRuleNames();
     
     ParseTreeWalker walker = new ParseTreeWalker();
     walker.walk(trans , tree);

/**  IV. Display backtranslation  */

     System.out.println();
     System.out.println( "      ***Translation***" );
     //System.out.println(" Translated braille from annotated tree: ");
     //System.out.println( bt.getBrl( tree ) );

 }//End Main.
}//End Class BasicTranslator.