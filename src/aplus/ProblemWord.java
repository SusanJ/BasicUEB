package aplus;
import java.util.HashMap;

 /**  Words that are exceptions to the default
   use of certain contractions
 */
public class ProblemWord{

 public static ProblemWord[] problemWords = {
   new ProblemWord( "afford", "af=d" ),
   new ProblemWord( "biofeedback", "biofe$back" ),
   new ProblemWord( "chifforobe", "*i6orobe" ),
   new ProblemWord( "dumbbell", "dumbbell" ),
   new ProblemWord( "northeast", "nor?1/" ),
   new ProblemWord( "whereever", ">]\"e" ),
   new ProblemWord( "thence", "?5ce" )
   };
 static HashMap<String,ProblemWord> prob2UEB =
    new HashMap<String,ProblemWord>();

 String ink;
 String brl;

 ProblemWord( String ink, String brl){
  this.ink = ink;
  this.brl = brl;
 }
 String getInk(){
  return ink;
 }
 String getBrl(){
  return brl;
 }
public static void makeProbWordTable( boolean report,
                 boolean display ){

  for (int pw = 0; pw<problemWords.length; pw++){
   ProblemWord probWord = problemWords[pw];
   prob2UEB.put( probWord.getInk(), probWord );
  }
 if (report){
  int cnt = prob2UEB.size();
  System.out.println( "Made problem word table. ("+cnt+")" );
 }
}
public static String getProblemWord( String ink ){
 ProblemWord pw = prob2UEB.get( ink );
 if (pw != null) return pw.getBrl();
 return (String) null;
}  
}//End Class ProblemWord.