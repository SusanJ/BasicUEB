lexer grammar aPlusLexer; 
@lexer::header{ package aplus; }
@lexer::members{ public static boolean lastSep = false;}

/*  Parsing as the first step in converting print to
   literary braille. All 94 ASCII characters plus
   a few non-ASCII characters are identifed as tokens by
   the lexer. Additional
   tokens are letter sequences that correspond 
   to many of those braille contractions 
   that can represent entire
   words as well as parts of words. 

    The parser has no knowledge of the special whole
   word contractions, i.e. single-letter whole
   word contractions and shortforms, that apply only
   to whole words and only then in certain 
   contexts.  Words that should use these contractions
   are identified during the annotating process
   and their correct braille translations are
   supplied.

    The parser grammar uses the tokens corresponding
   to braille contractions to contract words
   according to the default UEB rules; it has no knowledge
   of exceptions.  Exceptions are identified 
   during the annotating process and their correct
   braille translations are supplied from an explicit
   exceptions table which includes so-called 
   "problem words" and the 529 words specified
   by UEBC as those permitted to use shortforms as 
   part-word contractions. (Since the parser is
   unaware of shortforms, any words that could
   potentially use shortforms as part-word
   contractions but aren't among the 529
   will have been contracted appropriately
   by the parser.)
*/

APLUSstag: '<aplus>' -> pushMode( APLUS );
mode INSIDE;
NAME: 'Susan Jolly';

mode APLUS;
END_APLUS      : '</aplus>' -> popMode;
MY_OPEN        : '<'  -> pushMode(INSIDE) ;



 //  Individual digits simplifies dealing with
 //  numeric indicators that are also symbols (10)

ZERO        :   '0';
ONE         :   '1';
TWO         :   '2';
THREE       :   '3';
FOUR        :   '4';
FIVE        :   '5';
SIX         :   '6';
SEVEN       :   '7';
EIGHT       :   '8';
NINE        :   '9';

OFENCE      : ( '('
            |   '['
            |   '{'
            //|   '<'
               )   {lastSep = true;}; // (4)
    
CFENCE      :   ')'
            |   ']'
            |   '}'
            |   '>'
            ;        // (4)

NEU         :   '\''
            |   '"'
            ;         // (2)
PERIODorDEC :   '.';  // (1)
SEMICOLON   :   ';';  // (1)
PUNC        :   ','
            |   '?'
            |   ':'
            |   '!'
            ;        // (4)

SPEC        :   '\\'
            |   '|'
            |   '+'
            |   '='
            |   '&'
            |   '*'
            |   '^'
            |   '%'
            |   '$'
            |   '#'
            |   '@'
            |   '~'
            ;      // (12)

FSLASH      :   '/';      // (1)
BACK_TICK   :   '`';      // (1)
HYP         :   '-' {lastSep = true;}; // (1)
USCORE      :   '_' {lastSep = true;}; // (1)


WEIRD:    'his'|'was'|'were'|'enough';
WEIRD_TC: 'His'|'Was'|'Were'|'Enough';
WEIRD_UC: 'HIS'|'WAS'|'WERE'|'ENOUGH';


   //  Symbols used as either words or contractions
   //  Since they can be used anywhere they don't
   // cause grammar issues for the parser
   //  Lexer chooses first one that is applicable,
   // not necesarily the longest one which is
   // the contracted braille default although not
   // correct for "problem words."  This translator
   // uses a sort of "pass 2" logic where the
   // problem word list is checked *after* the
   // parse tree is built

LARGE:    ('and'|'for'|'of'|'the'|'with') {lastSep = false;};
LARGE_TC: ('And'|'For'|'Of'|'The'|'With') {lastSep = false;};
LARGE_UC: ('AND'|'FOR'|'OF'|'THE'|'WITH') {lastSep = false;};

ILC45:     ('upon'|'these'|'those'|
            'whose'|'word')
           {lastSep = false;};
ILC45_TC:  ('Upon'|'These'|'Those'|
            'Whose'|'Word') 
           {lastSep = false;};
ILC45_UC:  ('UPON'|'THESE'|'THOSE'|
            'WHOSE'|'WORD') 
           {lastSep = false;};

ILC456:    ('cannot'|'had'|'many'|'spirit'|'their'|'world') {lastSep = false;};
ILC456_TC: ('Cannot'|'Had'|'Many'|'Spirit'|'Their'|'World') {lastSep = false;};
ILC456_UC: ('CANNOT'|'HAD'|'MANY'|'SPIRIT'|'THEIR'|'WORLD') {lastSep = false;};

ILC5:      ('day'|'ever'|'father'|'here'|'know'|'lord'|'mother'|
            'name'|'one'|'part'|'question'|'right'|'some'|
            'time'|'under'|'young'|'there'|
            'character'|'through'|'where'|'ought'|'work'
           ){lastSep = false;};
ILC5_TC:   ('Day'|'Ever'|'Father'|'Here'|'Know'|'Lord'|'Mother'|
            'Name'|'One'|'Part'|'Question'|'Right'|'Some'|
            'Time'|'Under'|'Young'|'There'|                          
            'Character'|'Through'|'Where'|'Ought'|'Work'
           ){lastSep = false;};
ILC5_UC:   ('DAY'|'EVER'|'FATHER'|'HERE'|'KNOW'|'LORD'|'MOTHER'|
            'NAME'|'ONE'|'PART'|'QUESTION'|'RIGHT'|'SOME'|
            'TIME'|'UNDER'|'YOUNG'|'THERE'|                          
            'CHARACTER'|'THROUGH'|'WHERE'|'OUGHT'|'WORK'
           ){lastSep = false;};

/*     Need to use individual letters as named
      lexer tokens since the parser needs
      them to define position-dependent braille
      contractions that can't be used as
      lexer tokens
*/
LETTERA   : 'a' {lastSep = false;};
LETTERB   : 'b' {lastSep = false;};
LETTERC   : 'c' {lastSep = false;};
LETTERD   : 'd' {lastSep = false;};
LETTERE   : 'e' {lastSep = false;};
LETTERF   : 'f' {lastSep = false;};
LETTERG   : 'g' {lastSep = false;};
LETTERH   : 'h' {lastSep = false;};
LETTERI   : 'i' {lastSep = false;};
LETTERJ   : 'j' {lastSep = false;};
LETTERK   : 'k' {lastSep = false;};
LETTERL   : 'l' {lastSep = false;};
LETTERM   : 'm' {lastSep = false;};
LETTERN   : 'n' {lastSep = false;};
LETTERO   : 'o' {lastSep = false;};
LETTERP   : 'p' {lastSep = false;};
LETTERQ   : 'q' {lastSep = false;};
LETTERR   : 'r' {lastSep = false;};
LETTERS   : 's' {lastSep = false;};
LETTERT   : 't' {lastSep = false;};
LETTERU   : 'u' {lastSep = false;};
LETTERV   : 'v' {lastSep = false;};
LETTERW   : 'w' {lastSep = false;};
LETTERX   : 'x' {lastSep = false;};
LETTERY   : 'y' {lastSep = false;};
LETTERZ   : 'z' {lastSep = false;};

CAPS      :  [A-Z] {lastSep = false;};

BE_TC: 'Be';

EN      : 'en';
EN_TC   : 'En';
EN_UC   : 'EN';
IN      : 'in';
IN_TC   : 'In';
IN_UC   : 'IN';


      //  Symbols supposedly used only as contractions but
      // anywhere in a word.  They MIGHT be a problem
      // when they can also represent words including
      // Ed, sh, er, ...
STRONG_GS     : ('ch'|'wh'|'sh'|'th'|'ou'|'st'|
                 'gh'|'ed'|'er'|'ow'|'ing'|'ar'){lastSep = false;}; 
STRONG_GS_TC  : ('Ch'|'Wh'|'Sh'|'Th'|'Ou'|'St'|
                 'Gh'|'Ed'|'Er'|'Ow'|'Ing'|'Ar'){lastSep = false;}; 
STRONG_GS_UC  : ('CH'|'WH'|'SH'|'TH'|'OU'|'ST'|
                 'GH'|'ED'|'ER'|'OW'|'ING'|'AR'){lastSep = false;}; 

   //  This rule only used when the last item was NOT a separator
   // or similar character than could signal the beginning of
   // an upcoming word.
FLC    :   ('ment'|'ful'|'ong'|'ity'|'ance'|'ence'|
            'ound'|'ount'|'less'|'ness'|'sion'|'tion'
           ){!lastSep}? ;
FLC_TC :   ('Ment'|'Ful'|'Ong'|'Ity'|'Ance'|'Ence'|
            'Ound'|'Ount'|'Less'|'Ness'|'Sion'|'Tion'
           ){!lastSep}? ;
FLC_UC :   ('MENT'|'FUL'|'ONG'|'ITY'|'ANCE'|'ENCE'|
            'OUND'|'OUNT'|'LESS'|'NESS'|'SION'|'TION'
           ){!lastSep}? ;


 //Move to parser?
BEGCON_TC: 'Con'|'Dis';
BEGCON_UC: 'CON'|'DIS';


MIDCON:    'ea'|'bb'|'cc'|'ff'|'gg';
MIDCON_TC: 'Ea'|'Bb'|'Cc'|'Ff'|'Gg';
MIDCON_UC: 'EA'|'BB'|'CC'|'FF'|'GG';


    //  **Non-ASCII characters**

MDASH: '—' {lastSep = true;};
NDASH: '–' {lastSep = true;};

    // Smart double and single quotes
ODQUO: '“';
CDQUO: '”';
OSQUO: '‘';
CSQUO: '’';

//Markdown support?
//ITAL: ASTER; //1
//BOLD: ASTER ASTER;

   //White space
 fragment ASPACE: ' ';     
  SPACE: ASPACE {lastSep = true;};
 fragment WINNL: [\r\n]+;
  NEWLINE: WINNL {lastSep = true;};

   // UEB switch to Nemeth indicator
//START_DIS: DOTS456 DOTS146 ' ' -> pushMode( NEMETH );




