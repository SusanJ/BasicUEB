
parser grammar aPlusParser;
//options { tokenVocab = aPlusLexer; }
tokens {LATIN_LETTER, FUN_NAME}
//@parser::header{ package aplus; }
@parser::members{ boolean line_cont = false; }


             //brailleAware: 

text:   (line)+;
line:   //(space* (spunc* (symseq|symseq_uc) epunc*)) 
         (space*     ( psymseq | psymseq_uc ) )
         (separator+ ( psymseq | psymseq_uc ) )* space* NEWLINE
        //|startMML space* (NEWLINE)
        //|mmlExpr  space* (NEWLINE|MML_NEWLINE)
        //|endMML   space* (NEWLINE|MML_NEWLINE)
         //|aplus  space* (NEWLINE)
         |space* NEWLINE
         |space* tfiment space* NEWLINE
        ;

//aplus: APLUSstag;
psymseq    :   spunc* symseq    epunc*;
psymseq_uc :   spunc* symseq_uc epunc*;

symseq:  (freqword|freq_tc   //frequent words with "anywhere" contrctions, e.g. 'the'
         |alphaseq   //lc letter sequencd with optional embedded hyphen(s)
         |conword |conwordTC   //contracted lc or tc word
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
             |uc_let    //single uc letter
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

 //  Contracted words using default rules
 // Will be corrected as necessary later
conword     :   startconword
                (midCon | midendconword)*
                midendconword+;

conwordTC   :   startconWordTC
                (midCon | midendconword)*
                midendconword+;

conwordUC   :   startconWordUC
                (midConUC | midendconworduc)*
                midendconworduc+;

//TO_DO  Make this fully general

conwordMIX  : (startconword | startconwordTC| startconword UC)
              (midConUC | 
               midendconworduc)*
              (midendconword|midendconworduc) +;

space     : SPACE;
separator : SPACE|HYP|MDASH|NDASH;   //What about underscore???

//ww: 'but'|'can'|'do'|'every'|'from'|'go'|'have'|
    //'just'|'knowledge'|'like'|'more'|
    //'not'|'people'|'quite'|'rather'|'so'|'that'|
    //'us'|'very'|'will'|'it'|'you'|'as'
    //;

freq_uc:  LARGE_UC
          |ILC45_UC
          |ILC456_UC 
          |ILC5_UC
          |UC_LETTERB UC_LETTERE
          |IN_UC;

freqword: (LARGE | LARGETF | STAG LARGE ETAG           
          |ILC45 | STAG ILC45 ETAG            
          |ILC456 | STAG ILC456 ETAG           
          |ILC5 | STAG ILC5 ETAG                       
          |WEIRD  
          |LETTERB LETTERE 
          |IN     
          );

freq_tc:  (LARGE_TC      //|STRONG|STRONG_TC
          |ILC45_TC
          |ILC456_TC
          |ILC5_TC
          |WEIRD_TC
          |UC_LETTERB LETTERE
          |IN_TC
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
uc_let: (UC_LETTERA|UC_LETTERB|UC_LETTERC|UC_LETTERD|UC_LETTERE|UC_LETTERF|UC_LETTERG
        |UC_LETTERH|UC_LETTERI|UC_LETTERJ|UC_LETTERK|UC_LETTERL|UC_LETTERM
        |UC_LETTERN|UC_LETTERO|UC_LETTERP|UC_LETTERQ|UC_LETTERR|UC_LETTERS|UC_LETTERT
        |UC_LETTERU|UC_LETTERV|UC_LETTERW|UC_LETTERX|UC_LETTERY|UC_LETTERZ)
        ;

 //Characters used as letters and digits
g1Letter: (LETTERA|LETTERB|LETTERC|LETTERD|LETTERE|
           LETTERF|LETTERG|LETTERH|LETTERI|LETTERJ);

  //Alphabetic sequences
word:    small(small)+;
tc_word: uc_let(small)+;
uc_word: uc_let(uc_let)+;

         //Optional TC
//itStart: LESS_THAN 'i' GREATEr_THAN;

tfsmall: STAG small ETAG;

startconword   : (anywhereCon  |begCon  |small| tfsmall);
startconWordTC : (anywhereConTC|begConTC|uc_let);   
startconWordUC : (anywhereConUC|begConUC|uc_let);  

midconword    : (anywhereCon  |midCon  |midEndCon  |small |tfsmall| HYP );
midconworduc  : (anywhereConUC|midConUC|midEndConUC|uc_let | HYP );

midendconword   : (anywhereCon  |midEndCon  |small|tfsmall)+;
midendconworduc : (anywhereConUC|midEndConUC|uc_let )+;

period        : PERIODorDEC;
semicolon     : SEMICOLON;

spunc:    ODQUO|OFENCE|NEU|PUNC|MDASH|NDASH;
epunc:    CDQUO|CFENCE|NEU|period|semicolon|PUNC|MDASH|NDASH;


         //Characters O.K. in a caps passage
//not_lc:  (uc_seq|uc_let|number|punc|SPEC);

  //Sequence allowed in a UEB capitals passage
 not_lc:   (SPEC|FSLASH|uc_seq|uc_let|number|spunc|epunc)+;
 garbage: (not_lc|small|word)+;
 
//uc_let:  CAPS;   //Needs dot-6



  //Contractions allowed only at the start of a word
be : (LETTERB LETTERE);            //be
beTC: (UC_LETTERB LETTERE);        //Be
begCon   : be
         | (LETTERC LETTERO LETTERN)    //con
         | (LETTERD LETTERI LETTERS);   //dis

begConTC : beTC            
         | (UC_LETTERC LETTERO LETTERN)    //Con
         | (UC_LETTERD LETTERI LETTERS);   //Dis

begConUC : (UC_LETTERB UC_LETTERE)               //BE
         | (UC_LETTERC UC_LETTERO UC_LETTERN)    //CON
         | (UC_LETTERD UC_LETTERI UC_LETTERS);   //DIS

 //Contractions only allowed in the interior of a word
midCon   :    MIDCON | STAG MIDCON ETAG;
midConUC :    MIDCON_UC;

 //Contractions alloned in the interior or at the end of a owrd
midEndCon: (FLC);
midEndConUC: FLC_UC;


//begConTC :    BEGCON_TC|BE_TC;

 //All contractions that can start a title case word
//startConTC:  (LARGE_TC|
             // ILC45_TC|ILC456_TC|ILC5_TC|IN_TC|EN_TC|
              //STRONG_GS_TC|begConTC);
 
   //Contractions that can be used as part words in any position
tfcon: LARGETF;
anywhereCon   :(LARGE   |ILC45   |ILC456   |ILC5   |STRONG_GS   |IN   |EN) 
              |tfcon 
              |STAG(LARGE|ILC45|ILC456|ILC5|STRONG_GS|IN|EN)ETAG
              ;
tfconTC: LARGE_TCTF;
anywhereConTC :(LARGE_TC|ILC45_TC|ILC456_TC|ILC5_TC|STRONG_GS_TC|IN_TC|EN_TC
              |tfconTC);

tfconUC: LARGE_UCTF;
anywhereConUC :(LARGE_UC|ILC45_UC|ILC456_UC|ILC5_UC|STRONG_GS_UC|IN_UC|EN_UC
              |tfconUC
              );

//anywhereCon:(LARGE|ILC45|ILC456|ILC5|STRONG_GS|IN|EN|freaky);


 //Special names for start of number
 //helpful for translating to upper numbers
startNum:  ZERO|ONE|TWO|THREE|FOUR
          |FIVE|SIX|SEVEN|EIGHT|NINE;
startDec: PERIODorDEC;

dig  :  space?(ZERO|ONE|TWO|THREE|FOUR
        |FIVE|SIX|SEVEN|EIGHT|NINE);

//I forgot about , and / space digits
decpt     :   PERIODorDEC;        
integer   :   startNum dig*;
real      :   startNum dig* decpt (dig)* 
          |   startDec dig+
          ;
//ALPHANUMERICS NEEDED
//AND NUMMODE any mix with a leading startnum
number    :   (real|integer)(g1Letter)? (alphaseq)*; 

  //Markdown option?
literal: BACK_TICK;
//italics: ITAL;
//bold: BOLD;
//start_tag: LESS_THAN letter+ GRTR_THAN;
//end_tag: LESS_THAN FSLASH letter+ GRTR_THAN;