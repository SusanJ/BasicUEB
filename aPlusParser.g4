
parser grammar aPlusParser;
options { tokenVocab = aPlusLexer; }
tokens {LATIN_LETTER, FUN_NAME}
@parser::header{ package aplus; }
@parser::members{ boolean line_cont = false; }


             //brailleAware: 
text:   (line)+;
line:   //(space* (spunc* (symseq|symseq_uc) epunc*)) 
         (space*     ( psymseq | psymseq_uc ) )
         (separator+ ( psymseq | psymseq_uc ) )* space* NEWLINE
        //|startMML space* (NEWLINE|MML_NEWLINE)
        //|mmlExpr  space* (NEWLINE|MML_NEWLINE)
        //|endMML   space* (NEWLINE|MML_NEWLINE)
        |space* NEWLINE
        ;

psymseq    :   spunc* symseq    epunc*;
psymseq_uc :   spunc* symseq_uc epunc*;

symseq:  (freqword   //frequent words with "anywhere" contrctions, e.g. 'the'
         |alphaseq   //lc letter sequencd with optional embedded hyphen(s)
         |conword    //contracted lc or tc word
         |small      //single lc letter
         //|tc_word    //tc alphabetic word
         |letterseq  //mixed sequence of lc and uc letters
         
         //|garbage
         );

   //Supposed to be all the symbols sequences which don't have
   //any small letters
symseq_uc:   (freq_uc   //capitalized frequent words
             |uc_seq+   //uc letter sequence with optional embedded hyphen(s)
             |conwordUC //contracted UC word
             |uc_let    //single lc letter
             |not_lc    //any other sequence with no lc letters 
             )
             ;


/**
startMML: START_MML;
endMML:   END_MML;
mmlInt: MML_INT;
mmlOp:  MML_OP;
mmlId:  MML_VAR;
mmlExpr: (mmlInt|mmlOp| mmlId)+;
mmlRow:  (MML_SROW mmlExpr MML_EROW); 
*/

alphaseq :  small+  HYP* small+;
uc_seq   :  uc_let+ HYP* uc_let+; //Needs caps word


//letterseq: (word|small|uc_seq|uc_let)+;

//Mixed small and capital letters
  letterseq  : ((small+ uc_let+)(small|uc_let)*)
             | ((uc_let+ small+)(small|uc_let)*)
             ;


conword   :   startconword
              (midCon | midendconword)*
              midendconword+;

conwordUC   :  startconWordUC
               (midConUC | midendconworduc)*
               midendconworduc+;

space: SPACE;
separator: SPACE|HYP|MDASH|NDASH;   //What about underscore???

//ww: 'but'|'can'|'do'|'every'|'from'|'go'|'have'|
    //'just'|'knowledge'|'like'|'more'|
    //'not'|'people'|'quite'|'rather'|'so'|'that'|
    //'us'|'very'|'will'|'it'|'you'|'as'
    //;

freq_uc:  LARGE_UC
          |ILC45_UC
          |ILC456_UC 
          |ILC5_UC
          |IN_UC;

freqword: (LARGE|LARGE_TC      //|STRONG|STRONG_TC
          |ILC45|ILC45_TC
          |ILC456|ILC456_TC
          |ILC5|ILC5_TC
          |WEIRD|WEIRD_TC
          |LETTERB LETTERE|BE_TC|IN|IN_TC
          );

//itsStart: ITAL_STAG;
//itsEnd:   ITAL_ETAG;

 //  Individual letters needed since inconvenient or difficult
 // to use context-dependent contractions as lexer tokens
 // Also may need them for Nemeth math mode.
  
small:  (LETTERA|LETTERB|LETTERC|LETTERD|LETTERE|LETTERF|LETTERG
        |LETTERH|LETTERI|LETTERJ|LETTERK|LETTERL|LETTERM
        |LETTERN|LETTERO|LETTERP|LETTERQ|LETTERR|LETTERS|LETTERT
        |LETTERU|LETTERV|LETTERW|LETTERX|LETTERY|LETTERZ)
        ;
g1Letter: (LETTERA|LETTERB|LETTERC|LETTERD|LETTERE|
           LETTERF|LETTERG|LETTERH|LETTERI|LETTERJ);

//letter:  (small|(itsStart SMALL itsEnd);
word:    small(small)+;
tc_word: CAPS(small)+;
uc_word: CAPS(CAPS)+;

         //Optional TC
//itStart: LESS_THAN 'i' GREATEr_THAN;


startconword   : (anywhereCon|begCon|startConTC|small|CAPS);
startconWordUC : (anywhereConUC|CAPS);   //needs begConTC

midconword    : (anywhereCon  |midCon  |midEndCon  |small | HYP );
midconworduc  : (anywhereConUC|midConUC|midEndConUC|CAPS  | HYP );

midendconword   : (anywhereCon  |midEndCon |small)+;
midendconworduc : (anywhereConUC|midEndConUC|CAPS)+;


period        : PERIODorDEC;
semicolon     : SEMICOLON;

spunc:    ODQUO|OFENCE|NEU|PUNC|MDASH|NDASH;
epunc:    CDQUO|CFENCE|NEU|period|semicolon|PUNC|MDASH|NDASH;


         //Characters O.K. in a caps passage
//not_lc:  (uc_seq|uc_let|number|punc|SPEC);

  //Sequence allowed in a UEB capitals passage
 not_lc:   (SPEC|FSLASH|uc_seq|uc_let|number|spunc|epunc)+;
 //garbage: (not_lc|small|word)+;
 
uc_let:  CAPS;   //Needs dot-6



  //Not handling embedded caps for now :)
begCon   : (LETTERB LETTERE)            //be
         | (LETTERC LETTERO LETTERN)    //con
         | (LETTERD LETTERI LETTERS);   //dis

midCon   :    MIDCON;
midConUC :    MIDCON_UC;
begConTC :    BEGCON_TC|BE_TC;
startConTC:  (LARGE_TC|
              ILC45_TC|ILC456_TC|ILC5_TC|IN_TC|EN_TC|
              STRONG_GS_TC|begConTC);

//freaky: WW;

anywhereCon   :(LARGE   |ILC45   |ILC456   |ILC5   |STRONG_GS   |IN   |EN);
anywhereConUC :(LARGE_UC|ILC45_UC|ILC456_UC|ILC5_UC|STRONG_GS_UC|IN_UC|EN_UC);

//anywhereCon:(LARGE|ILC45|ILC456|ILC5|STRONG_GS|IN|EN|freaky);

midEndCon: (FLC);
midEndConUC: FLC_UC;

 //Special names for start of number
 //helpful for translating to upper numbers
startNum:  ZERO|ONE|TWO|THREE|FOUR
          |FIVE|SIX|SEVEN|EIGHT|NINE;
startDec: PERIODorDEC;

dig  :   ZERO|ONE|TWO|THREE|FOUR
        |FIVE|SIX|SEVEN|EIGHT|NINE;

decpt     :   PERIODorDEC;        
integer   :   startNum dig*;
real      :   startNum dig* decpt (dig)* 
          |   startDec dig+
          ;

number    :   (real|integer)(g1Letter)?; 

  //Markdown option?
literal: BACK_TICK;
//italics: ITAL;
//bold: BOLD;
//start_tag: LESS_THAN letter+ GRTR_THAN;
//end_tag: LESS_THAN FSLASH letter+ GRTR_THAN;