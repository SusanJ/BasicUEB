package aplus;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

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

  BasicTranslator(){;}

   //Annotate a tree node with its translation
  void setUEB( ParseTree ctx, String s ){
   ueb.put( ctx, s );
  }
   //Get a previously-saved annotation for a tree node
  String getUEB( ParseTree ctx ) {
   return ueb.get( ctx );
  }

  String getBrl( String ink ){
   boolean has = ink2UEB.containsKey( ink );
   System.out.println("   "+ink+" table key: "+has );
   return ink2UEB.get( ink );
  }

   //  Simple table requires grammar information from parser
   // Print input recognizes all 94 ASCII characters
   // Braille output uses North Am. ASCII Braille 
   // translation using ASCII small letters
  void makeTable(){

  //Cap letters
ink2UEB.put( "A", ",a" );
ink2UEB.put( "B", ",b" );
ink2UEB.put( "C", ",c" );

  //Small letters
ink2UEB.put( "a", "a" );
ink2UEB.put( "b", "b" );
ink2UEB.put( "c", "c" );

  //"Large" signs
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

ink2UEBalt.put( "but", "but" );
ink2UEBalt.put( "can", "can" );
ink2UEB.putalt( "do", "do" );
ink2UEBalt.put( "every", "ev]ry" );
ink2UEBalt.put( "from", "from" );
ink2UEBalt.put( "go", "go" );
ink2UEB.putalt( "have", "h" );
ink2UEBalt.put( "just", "ju/" );
ink2UEBalt.put( "knowledge", "\"kl$ge" );
ink2UEBalt.put( "like", "like" );
ink2UEBalt.put( "more", "more" );
ink2UEBalt.put( "rather", "ra?]");
ink2UEBalt.put( "that", "?at");
ink2UEBalt.put( "very", "v]y");
ink2UEBalt.put( "you",  "you");
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

  //Lower numbers
ink2UEB.put( "0", "j" );
ink2UEBalt.put( "0", "#j" );
ink2UEB.put( "1", "a" );
ink2UEBalt.put( "1", "#a" );

  //Special symbols
ink2UEB.put( "$", "@s" );

System.out.println( "Transtable size: "+ink2UEB.size() );

  }

@Override 
  public void exitLine( aPlusParser.LineContext ctx){
    System.out.println( "Line found!" );
    System.out.println( ctx.getText() );
    int cnt = ctx.getChildCount();
    String ink;
    String brl;
    StringBuilder buf;
     //Gets UEB from lower nodes where available
    for (int i=0; i<cnt; i++){
     brl = getUEB( ctx.getChild(i) );
     ink = ctx.getChild(i).getText();
     if (brl == null){
      System.out.println( "Did not yet get trans for: "+ink );
      brl = getBrl( ink );
      System.out.println( "\n Input: "+ink+" UEB: "+brl );
     }
    }
  }

@Override
  public void exitSymseq(aPlusParser.SymseqContext ctx){
  System.out.println( "Symbol sequence found!" );
    System.out.println( ctx.getText() );
    int cnt = ctx.getChildCount();
    String ink;
    String brl;
    for (int i=0; i<cnt; i++){
     ink = ctx.getChild(i).getText();
     brl = getBrl( ink );
     System.out.println( "\n Input: "+ink+" UEB: "+brl );
     setUEB( ctx.getChild(i), brl );
    }
 }

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
          BasicTranslator trans = new BasicTranslator( );
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