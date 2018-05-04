package aplus;
import java.util.HashMap;
import java.lang.Character;
import org.dotlessbraille.utilities.BrailleCell;
import org.dotlessbraille.transtables.App1Word;
import org.dotlessbraille.transtables.WordOrPartWord;

   /**  Simple tables for translating print to 
   contracted UEB literary braille.
   Use of these tables **requires**
   caller to select correct table/method
   based on external information such
   as the grammar information
   from a parser. 
        Braille in North American ASCII Braille
   transliteration using small letters.  Could
   filter using BrailleCell class for other
   output options.
   */  

class EasyTrans{

  static HashMap<String,String> ink2UEB =
     new HashMap<String,String>();

  static HashMap<String,String> ink2UEBalt =
    new HashMap<String,String>(); 

      //Typeform indicators
  static HashMap<String,String> xmlTag2UEBSymtf =
    new HashMap<String,String>(); 

  static HashMap<String,String> xmlTag2UEBWrdtf =
    new HashMap<String,String>(); 

  static HashMap<String,String> xmlTag2UEBWrdItf =
    new HashMap<String,String>(); 

  static HashMap<String,String> xmlTag2UEBPastf =
    new HashMap<String,String>(); 


EasyTrans(){}

  static String getSymTF( String ink ){
   boolean has = xmlTag2UEBSymtf.containsKey( ink );
   //System.out.println("   "+ink+" table key: "+has );
   if (has) return xmlTag2UEBSymtf.get( ink );
   return (String) null;
  }

  static String getExWrdTF( String ink ){
   boolean has = xmlTag2UEBWrdtf.containsKey( ink );
   //System.out.println("   "+ink+" table key: "+has );
   if (has) return xmlTag2UEBWrdtf.get( ink );
   return (String) null;
  }

  //Small letters, capital letters, "large" words
  //Upper numbers, initial letter contractions
  // Alphabetic words signs and strong word signs
  //only when used in **correct** context

  static String getBrl( String ink ){
   boolean has = ink2UEB.containsKey( ink );
   //System.out.println("   "+ink+" table key: "+has );
   if (has) return ink2UEB.get( ink );
   return (String) null;
  }
  
  //Upper number with a preceding "#", i.e. dots-3456
  //Print cap letter to ASCII Braille small letter
  static String getAltBrl( String ink ){
   boolean has = ink2UEBalt.containsKey( ink );
   System.out.println("   "+ink+" table key: "+has );
   if (has) return ink2UEBalt.get( ink );
   return (String) null;
  }

   //  Simple tables that require grammar information
   // from parser for correct use
   //  Print input recognizes all 94 ASCII characters
   // Braille output uses North Am. ASCII Braille 
   // translation only using ASCII small letters
   //  Other braille representations are available in
   // imported Java class BrailleCell 
static void makeTable(){

 //Symbol
xmlTag2UEBSymtf.put( "<i>", ".2");
xmlTag2UEBSymtf.put( "</i>", "");
xmlTag2UEBSymtf.put( "<b>", "^2");
xmlTag2UEBSymtf.put( "</b>", "");

 //Word with explicit term 
xmlTag2UEBWrdtf.put( "<i>", ".1");
xmlTag2UEBWrdtf.put( "</i>", ".'");
xmlTag2UEBWrdtf.put( "<b>", "^1");
xmlTag2UEBWrdtf.put( "</b>", ".'");

 //Word with implicit term
xmlTag2UEBWrdItf.put( "<i>", ".1");
xmlTag2UEBWrdItf.put( "</i>", "");
xmlTag2UEBWrdItf.put( "<b>", "^1");
xmlTag2UEBWrdItf.put( "</b>", "");

 //Passage

 //?  convert to LC ascii for
 // use with caps inds?
ink2UEBalt.put( "A", "a" );
ink2UEBalt.put( "B", "b" );
ink2UEBalt.put( "C", "c" );
ink2UEBalt.put( "D", "d" );
ink2UEBalt.put( "E", "e" );
ink2UEBalt.put( "F", "f" );
ink2UEBalt.put( "G", "g" );
ink2UEBalt.put( "H", "h" );
ink2UEBalt.put( "I", "i" );
ink2UEBalt.put( "J", "j" );
ink2UEBalt.put( "K", "k" );
ink2UEBalt.put( "L", "l" );
ink2UEBalt.put( "M", "m" );
ink2UEBalt.put( "N", "n" );
ink2UEBalt.put( "O", "o" );
ink2UEBalt.put( "P", "p" );
ink2UEBalt.put( "Q", "q" );
ink2UEBalt.put( "R", "r" );
ink2UEBalt.put( "S", "s" );
ink2UEBalt.put( "T", "t" );
ink2UEBalt.put( "U", "u" );
ink2UEBalt.put( "V", "v" );
ink2UEBalt.put( "W", "w" );
ink2UEBalt.put( "X", "x" );
ink2UEBalt.put( "Y", "y" );
ink2UEBalt.put( "Z", "z" );

 //Individual capital letters (complete)
ink2UEB.put( "A", ",a" );
ink2UEB.put( "B", ",b" );
ink2UEB.put( "C", ",c" );
ink2UEB.put( "D", ",d" );
ink2UEB.put( "E", ",e" );
ink2UEB.put( "F", ",f" );
ink2UEB.put( "G", ",g" );
ink2UEB.put( "H", ",h" );
ink2UEB.put( "I", ",i" );
ink2UEB.put( "J", ",j" );
ink2UEB.put( "K", ",k" );
ink2UEB.put( "L", ",l" );
ink2UEB.put( "M", ",m" );
ink2UEB.put( "N", ",n" );
ink2UEB.put( "O", ",o" );
ink2UEB.put( "P", ",p" );
ink2UEB.put( "Q", ",q" );
ink2UEB.put( "R", ",r" );
ink2UEB.put( "S", ",s" );
ink2UEB.put( "T", ",t" );
ink2UEB.put( "U", ",u" );
ink2UEB.put( "V", ",v" );
ink2UEB.put( "W", ",w" );
ink2UEB.put( "X", ",x" );
ink2UEB.put( "Y", ",y" );
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

 //Italicized or bolded individual symbol
ink2UEB.put( "<i>a</i>", ".2a" );
ink2UEB.put( "*a*", ".2a" );
ink2UEB.put( "<b>a</b>", "^2a" );
ink2UEB.put( "**a**", "^2a" );

 //Italicized  whole word with implicit end
ink2UEB.put( "<i>and</i>", ".1&" );
ink2UEB.put( "*and*", ".1&" );
 //Italicized whole word with explicit end
ink2UEB.put( "<i>and</i>", ".1&.'" );
ink2UEB.put( "*and*", ".1&.'" );

 //Bold whole word with implicit end
ink2UEB.put( "<b>and</b>", "^1&" );
ink2UEB.put( "**and**", "^1&" );
 //Bold whole word with explicit end
ink2UEB.put( "<b>and</b>", "^1&^'" );
ink2UEB.put( "**and**", "^1&^'" );


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

  //Alphabetic word signs (complete)
  //Can't be lexer tokens so translator
  //checks by context
ink2UEB.put( "but", "b" );
ink2UEB.put( "But", ",b" );
ink2UEB.put( "BUT", "b" );
ink2UEB.put( "can", "c" );
ink2UEB.put( "Can", ",c" );
ink2UEB.put( "CAN", "c" );
ink2UEB.put( "do",  "d" );
ink2UEB.put( "Do",  ",d" );
ink2UEB.put( "DO",  "d" );
ink2UEB.put( "every", "e" );
ink2UEB.put( "Every", ",e" );
ink2UEB.put( "EVERY", ",e" );
ink2UEB.put( "from", "f" );
ink2UEB.put( "From", ",f" );
ink2UEB.put( "FROM", ",f" );
ink2UEB.put( "go", "g" );
ink2UEB.put( "Go", ",g" );
ink2UEB.put( "GO", "g" );
ink2UEB.put( "have", "h" );
ink2UEB.put( "Have", ",h" );
ink2UEB.put( "HAVE", "h" );
ink2UEB.put( "just", "j" );
ink2UEB.put( "Just", ",j" );
ink2UEB.put( "JUST", "j" );
ink2UEB.put( "knowledge", "k" );
ink2UEB.put( "Knowledge", ",k" );
ink2UEB.put( "KNOWLEDGE", "k" );
ink2UEB.put( "like", "l" );
ink2UEB.put( "Like", ",l" );
ink2UEB.put( "LIKE", "l" );
ink2UEB.put( "more", "m" );
ink2UEB.put( "More", ",m" );
ink2UEB.put( "More", "m" );

ink2UEB.put( "not", "not" );
ink2UEB.put( "Not", ",not" );
ink2UEB.put( "people", "p" );
ink2UEB.put( "People", ",p" );
ink2UEB.put( "quite", "q" );
ink2UEB.put( "Quite", ",q" );
ink2UEB.put( "rather", "r");
ink2UEB.put( "Rather", ",r");
ink2UEB.put( "so", "s" );
ink2UEB.put( "So", ",s" );
ink2UEB.put( "that", "t" );
ink2UEB.put( "That", ",t" );
ink2UEB.put( "us", "u" );
ink2UEB.put( "Us", ",u" );
ink2UEB.put( "very", "v" );
ink2UEB.put( "Very", ",v" );

ink2UEB.put( "will", "w" );
ink2UEB.put( "Will", ",w" );
ink2UEB.put( "WILL", "w" );
ink2UEB.put( "it", "x" );
ink2UEB.put( "It", ",x" );
ink2UEB.put( "IT", "x" );
ink2UEB.put( "you", "y" );
ink2UEB.put( "You", ",y" );
ink2UEB.put( "YOU", "y" );
ink2UEB.put( "as", "z" );
ink2UEB.put( "As", ",z" );
ink2UEB.put( "AS", "z" );



  //Same sequences as alphabetic words but how they
  //represent themselves when used in longer words
  // Note alternate hash table would be required
  //because lexer/parser doesn't know context!
  //(Currently not needed since these aren't lexer tokens.)
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
ink2UEBalt.put( "you", "y\\" );
ink2UEBalt.put( "as", "as" );

 //Lower signs (complete)
ink2UEB.put( "ea", "1" );
ink2UEB.put( "be", "2" );
ink2UEB.put( "Be", ",2" );
ink2UEB.put( "bb", "2" );
ink2UEB.put( "con", "3" );
ink2UEB.put( "Con", ",3" );
ink2UEB.put( "cc", "3" );
ink2UEB.put( "dis", "4" );
ink2UEB.put( "Dis", ",4" );
ink2UEB.put( "en", "5" );
ink2UEB.put( "En", ",5" );
ink2UEB.put( "ff", "6" );
ink2UEB.put( "gg", "7" );
ink2UEB.put( "in", "9" );
ink2UEB.put( "In", ",9" );

   // Strong word signs (complete)
   // User determines when appropriate
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

   //Initial-letter contractions (complete)
ink2UEB.put( "upon", "^u");
ink2UEB.put( "Upon", ",^u" );
ink2UEB.put( "word", "^w");
ink2UEB.put( "Word", ",^w" );
ink2UEB.put( "those", "^?");
ink2UEB.put( "Those", ",^?" );
ink2UEB.put( "whose", "^>");
ink2UEB.put( "Whose", ",^>" );
ink2UEB.put( "these", "^!");
ink2UEB.put( "These", ",^!" );

ink2UEB.put( "cannot", "_c" );
ink2UEB.put( "Cannot", ",_c" );

ink2UEB.put( "day", "\"d" );
ink2UEB.put( "Day", ",\"d" );
ink2UEB.put( "ever", "\"e" );
ink2UEB.put( "Ever", ",\"e" );
ink2UEB.put( "father", "\"f" );
ink2UEB.put( "Father", ",\"f" );
ink2UEB.put( "here", "\"h" );
ink2UEB.put( "Here", ",\"h" );
ink2UEB.put( "know", "\"k" );
ink2UEB.put( "Know", ",\"k" );
ink2UEB.put( "lord", "\"l" );
ink2UEB.put( "Lord", ",\"l" );
ink2UEB.put( "mother", "\"m" );
ink2UEB.put( "Mother", ",\"m" );
ink2UEB.put( "name", "\"n" );
ink2UEB.put( "Name", ",\"n" );
ink2UEB.put( "one", "\"o" );
ink2UEB.put( "One", ",\"o" );
ink2UEB.put( "part", "\"p" );
ink2UEB.put( "Part", ",\"p" );
ink2UEB.put( "question", "\"q" );
ink2UEB.put( "Question", ",\"q" );
ink2UEB.put( "right", "\"r" );
ink2UEB.put( "Right", ",\"r" );
ink2UEB.put( "some", "\"s" );
ink2UEB.put( "Some", ",\"s" );
ink2UEB.put( "time", "\"t" );
ink2UEB.put( "Time", ",\"t" );
ink2UEB.put( "under", "\"u" );
ink2UEB.put( "Under", ",\"u" );
ink2UEB.put( "work", "\"w" );
ink2UEB.put( "Work", ",\"w" );
ink2UEB.put( "young", "\"y" );
ink2UEB.put( "Young", ",\"y" );

ink2UEB.put( "Character", ",\"*" );
ink2UEB.put( "Through",   ",\"?" );
ink2UEB.put( "Where",     ",\";" );
ink2UEB.put( "Ought",     ",\"\\");
ink2UEB.put( "There",     ",\"!" );
ink2UEB.put( "character", "\"*" );
ink2UEB.put( "through",   "\"?" );
ink2UEB.put( "where",     "\";" );
ink2UEB.put( "ought",     "\"\\");
ink2UEB.put( "there",     "\"!" );

  //String group signs (complete)s
ink2UEB.put( "ch", "*"  );
ink2UEB.put( "Ch", ",*" );
ink2UEB.put( "sh", "%"  );
ink2UEB.put( "Sh", ",%" );
ink2UEB.put( "st", "/"  );
ink2UEB.put( "St", ",/" );
ink2UEB.put( "wh", ":"  );
ink2UEB.put( "Wh", ",:" );
ink2UEB.put( "th", "?"  );
ink2UEB.put( "Th", ",?" );
ink2UEB.put( "ou", "\\" );
ink2UEB.put( "Ou", ",\\");
ink2UEB.put( "gh", "<"  );
ink2UEB.put( "Gh", ",<" );
ink2UEB.put( "ed", "$"  );
ink2UEB.put( "Ed", ",$" );
ink2UEB.put( "er", "]"  );
ink2UEB.put( "Er", ",]" );
ink2UEB.put( "ow", "["  );
ink2UEB.put( "Ow", ",[" );
ink2UEB.put( "ing", "+" );
ink2UEB.put( "Ing", ",+");
ink2UEB.put( "ar", ">"  );
ink2UEB.put( "Ar", ",>" );

  //Final-letter contractions
  // (complete)
ink2UEB.put( "ound", ".d");
ink2UEB.put( "ance", ".e");
ink2UEB.put( "sion", ".n");
ink2UEB.put( "less", ".s");
ink2UEB.put( "ount", ".t");
ink2UEB.put( "ence", ";e");
ink2UEB.put( "ong", ";g");
ink2UEB.put( "ful", ";l");
ink2UEB.put( "tion", ";n");
ink2UEB.put( "ness", ";s");
ink2UEB.put( "ment", ";t");
ink2UEB.put( "ity", ";y");

  //Punctuation
ink2UEB.put( ",", "1" );
ink2UEB.put( ";", "2" );
ink2UEB.put( ":", "3" );
ink2UEB.put( ".", "4" );
ink2UEB.put( "!", "6" );
ink2UEB.put( "?", "8" );
ink2UEB.put( "'", "'" );
ink2UEB.put( " ", " " );
ink2UEB.put( "\"", ",7" );
ink2UEB.put( "(", "\"<" );
ink2UEB.put( ")", "\">" );
ink2UEB.put( "[", ".<" );
ink2UEB.put( "]", ".>" );

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
ink2UEB.put( "6", "j" );
ink2UEBalt.put( "6", "#f" );
ink2UEB.put( "7", "a" );
ink2UEBalt.put( "7", "#g" );
ink2UEB.put( "8", "b" );
ink2UEBalt.put( ".", "#4" );

  //Letters which require a grade 1 indicator
  //when immediately following a number
  //fragment that sets numeric mode
  //(Also require in numeric passages.)
ink2UEBalt.put( "a", ";a" );
ink2UEBalt.put( "b", ";b" );
ink2UEBalt.put( "c", ";c" );
ink2UEBalt.put( "d", ";d" );
ink2UEBalt.put( "e", ";e" );
ink2UEBalt.put( "f", ";f" );
ink2UEBalt.put( "g", ";g" );
ink2UEBalt.put( "h", ";h" );
ink2UEBalt.put( "i", ";i" );
ink2UEBalt.put( "j", ";j" );

  //Special symbols
 ink2UEB.put( "$", "@s" );

 App1Word.makeApp1Table( true, true );
 WordOrPartWord.makePartWordTable( true, true );
 ProblemWord.makeProbWordTable( true, true );

 System.out.println( "Transtable size: "+ink2UEB.size() );
}
   
 //  Assumes caller knows that
 //input represents an entire word, not
 //part of a longer word. Also--where
 //required--that the word is "standing alone"
 //per UEB criteria.
static String getPreTrans( String ink ){

   //  Single letter whole word contractions
   // and strong wordsigns
 String brl = ink2UEB.get( ink );
 if (brl != null) return brl;

   //  Shortform whole words or ILC whole words
 brl = WordOrPartWord.toBrl( ink );
 if (brl != null) return brl;

   //  Words like "walkabout" where UEB Appendix 1
   // allows the use of shortforms as partwords
 brl = App1Word.getUEBapp1( ink );
 if (brl != null) return brl;
 
   //  Miscellaneous words that are exceptions to
   // default rules
 brl = ProblemWord.getProblemWord( ink );
 if (brl != null) return brl;
 return (String) null;
}
 //  Returns the titlecase braille translation of an
 // input alphabetic print word if it is titlecase AND 
 // the corresponding lowercase print word 
 // is pretranslated; otherwise returns
 // any available pretranslation. Input must be at
 // least two characters.
public static String getTcPreTrans( String word, 
                       String capLetInd ){

   if (word.length() < 2) return (String) null;
   boolean titleCase = false;
   String lcVersion;
   char beg  = word.charAt( 0 );
   boolean up = Character.isUpperCase( beg );
   if (up){
    String actualRest = word.substring(1);
    String ifLcRest = actualRest.toLowerCase();
    if (actualRest.equals( ifLcRest )){
      titleCase = true;
      lcVersion = word.toLowerCase();
      String preTrans = getPreTrans( lcVersion );
      if (preTrans == null) return preTrans;
      return capLetInd+preTrans; 
    }
  };
 return getPreTrans( word );
 }

 //Checks for alphabetic sequence
 //Tree walker knows this somehow also....
public static boolean alphabetic( String word ){
  for (int c = 0; c < word.length(); c++){
   boolean alpha = Character.isLetter( word.charAt( c ) );
   if (!alpha) return false;
  }
 return true;
}

 //Returns false if input contains a lowercase letter;
 // otherwise returns true. Cf. Rulebook Sec. 8.5.
public static boolean okInCapsPassage( String ink ){
 for (int i=0; i<ink.length(); i++){
  if ( Character.isLetter( ink.charAt( i ) ) ){
   if ( Character.isLowerCase( ink.charAt( i ) ) ){
     return false;
   }
  } // UpperCase letter allowed
 } //Non-alphabetic character allowed
  return true;
}
}//End Class EasyTrans.