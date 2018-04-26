
parser grammar aPlusParser;
options { tokenVocab = aPlusLexer; }
tokens {LATIN_LETTER, FUN_NAME}
@parser::header{ package aplus; }
@parser::members{ boolean line_cont = false; }


text:   (line)+;
line:   (space* (symseq)) 
        (separator+ (symseq))* space* NEWLINE
        |space* NEWLINE
        ;
symseq:  punc*
         (conword
         |letter
         |word
         |tc_word
         |freqword
         |not_lc
         |uc_seq
         |uc_let
         ) punc*;


conword: startconword
         (midCon|midendconword)*
          midendconword+;
         //(anywhereCon|midEndCon|letter)+;
space: SPACE;
separator: SPACE|SEP|MDASH|NDASH;
freqword: (LARGE|LARGE_TC|WW|WW_TC|STRONG|STRONG_TC
          |ILC45|ILC45_TC|ILC456|ILC456_TC
          |ILC5|ILC5_TC|WEIRD|WEIRD_TC
          |BE|BE_TC|IN|IN_TC|EN_TC
          );

letter:  SMALL;
word:    letter(letter)+;
tc_word: CAPS(letter)+;
         //Optional TC



startconword: ( anywhereCon|begCon|startConTC|letter|CAPS);
midconword:    (anywhereCon|midCon|midEndCon|letter);
midendconword: (anywhereCon|midEndCon|letter)+;


punc:    OFENCE|CFENCE|NEU|DEC|PUNC|MDASH|NDASH;

         //Characters O.K. in a caps passage
//not_lc:  (uc_seq|uc_let|number|punc|SPEC);

 not_lc:   (SPEC|FSLASH|LESS_THAN|GRTR_THAN|uc_seq|uc_let|number|punc)+;
 
uc_let:  CAPS;   //Needs dot-6
uc_seq:  CAPS CAPS CAPS*; //Needs caps word



  //Not handling embedded caps for now :)
begCon: BEGCON|BE;
midCon: MIDCON;
begConTC: BEGCON_TC|BE_TC;
startConTC:(LARGE_TC|
            ILC45_TC|ILC456_TC|ILC5_TC|IN_TC|EN_TC
            STRONG_GS_TC|begConTC);
freaky: WW;
anywhereCon:(LARGE|ILC45|ILC456|ILC5|STRONG_GS|IN|EN|freaky);
midEndCon: (FLC);

 //Special names for start of number
 //helpful for translating to upper numbers
startNum:  ZERO|ONE|TWO|THREE|FOUR
          |FIVE|SIX|SEVEN|EIGHT|NINE;
startDec: DEC;
dig:   startNum;
decpt: startDec;        
integer:   startNum dig*;
real:  integer decpt (dig)* | startDec dig+;
number: integer|real;

literal: BACK_TICK;
italics: ITAL;
bold: BOLD;
start_tag: LESS_THAN letter+ GRTR_THAN;
end_tag: LESS_THAN FSLASH letter+ GRTR_THAN;