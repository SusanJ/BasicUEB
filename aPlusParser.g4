
parser grammar aPlusParser;
options { tokenVocab = aPlusLexer; }
tokens {LATIN_LETTER, FUN_NAME}
@parser::header{ package aplus; }
@parser::members{ boolean line_cont = false; }


text:   (line)+;
line:   (space* (spunc* symseq epunc*)) 
        (separator+ (spunc* symseq epunc*))* space* NEWLINE
        |startMML space* (NEWLINE|MML_NEWLINE)
        |mmlExpr  space* (NEWLINE|MML_NEWLINE)
        |endMML   space* (NEWLINE|MML_NEWLINE)
        |space* NEWLINE
        ;
symseq:  (conword
         |alphaseq
         //|tc_word
         //|uc_seq
         |small
         |uc_let
        // |conword
         |freqword
         |letterseq
         |not_lc
         |garbage
         );
startMML: START_MML;
endMML:   END_MML;
mmlInt: MML_INT;
mmlOp:  MML_OP;
mmlId:  MML_VAR;

mmlExpr: (mmlInt|mmlOp| mmlId)+;
mmlRow:  (MML_SROW mmlExpr MML_EROW); 

alphaseq: (word|tc_word|uc_seq); 
letterseq: (word|small|uc_seq|uc_let)+;

conword: startconword
         (midCon|midendconword)*
          midendconword+;
         //(anywhereCon|midEndCon|letter)+;

space: SPACE;
separator: SPACE|SEP|MDASH|NDASH;
//ww: 'but'|'can'|'do'|'every'|'from'|'go'|'have'|
    //'just'|'knowledge'|'like'|'more'|
    //'not'|'people'|'quite'|'rather'|'so'|'that'|
    //'us'|'very'|'will'|'it'|'you'|'as'
    //;

freqword: (LARGE|LARGE_TC       //|STRONG|STRONG_TC
          |ILC45|ILC45_TC|ILC456|ILC456_TC
          |ILC5|ILC5_TC
          |WEIRD|WEIRD_TC
          |LETTERB LETTERE|BE_TC|IN|IN_TC
          );

itsStart: ITAL_STAG;
itsEnd:   ITAL_ETAG;

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
         //Optional TC
//itStart: LESS_THAN 'i' GREATEr_THAN;




startconword: ( anywhereCon|begCon|startConTC|small|CAPS);
midconword:    (anywhereCon|midCon|midEndCon|small);
midendconword: (anywhereCon|midEndCon|small)+;

period: PERIODorDEC;
semicolon: SEMICOLON;

spunc:    ODQUO|OFENCE|NEU|PUNC|MDASH|NDASH|ITAL_STAG;
epunc:    CDQUO|CFENCE|NEU|period|semicolon|PUNC|MDASH|NDASH;


         //Characters O.K. in a caps passage
//not_lc:  (uc_seq|uc_let|number|punc|SPEC);

  //Sequence allowed in a UEB capitals passage
 not_lc:   (SPEC|FSLASH|uc_seq|uc_let|number|spunc|epunc)+;
 garbage: (not_lc|small|word)+;
 
uc_let:  CAPS;   //Needs dot-6
uc_seq:  uc_let uc_let uc_let*; //Needs caps word



  //Not handling embedded caps for now :)
begCon: (LETTERB LETTERE)|    //be
        (LETTERC LETTERO LETTERN)| //con
        (LETTERD LETTERI LETTERS); //dis
midCon: MIDCON;
begConTC: BEGCON_TC|BE_TC;
startConTC:(LARGE_TC|
            ILC45_TC|ILC456_TC|ILC5_TC|IN_TC|EN_TC|
            STRONG_GS_TC|begConTC);

//freaky: WW;
anywhereCon:(LARGE|ILC45|ILC456|ILC5|STRONG_GS|IN|EN);
//anywhereCon:(LARGE|ILC45|ILC456|ILC5|STRONG_GS|IN|EN|freaky);

midEndCon: (FLC);




 //Special names for start of number
 //helpful for translating to upper numbers
startNum:  ZERO|ONE|TWO|THREE|FOUR
          |FIVE|SIX|SEVEN|EIGHT|NINE;
startDec: PERIODorDEC;

dig: ZERO|ONE|TWO|THREE|FOUR
    |FIVE|SIX|SEVEN|EIGHT|NINE;

decpt: PERIODorDEC;        
integer:   startNum dig*;
real:  startNum dig* decpt (dig)* | startDec dig+;
number: (real|integer)(g1Letter)?; 

  //Markdown option?
literal: BACK_TICK;
//italics: ITAL;
//bold: BOLD;
//start_tag: LESS_THAN letter+ GRTR_THAN;
//end_tag: LESS_THAN FSLASH letter+ GRTR_THAN;