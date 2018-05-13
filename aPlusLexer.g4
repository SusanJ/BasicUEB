lexer grammar aPlusLexer; 
//@lexer::header{ package aplus; }
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
   braille translations replace the default ones.
   The correct translations are obtained from an explicit
   exceptions table which includes so-called 
   "problem words" and the 529 words specified
   by UEBC as those permitted to use shortforms as 
   part-word contractions. (Since the parser is
   unaware of shortforms, any words that could
   potentially use shortforms as part-word
   contractions but aren't among the 529
   have either been contracted appropriately
   by the parser or will be found in the
   list of problem words.)
*/

//APLUSstag: '<aplus>' -> pushMode( APLUS );
//mode INSIDE;
NAME: 'Susan Jolly';
//MY_START_TAG: '<aplus>' pushMode( APLUS );

mode APLUS;
END_APLUS      : '</aplus>'  {System.out.println( "END_APLUS" );} -> popMode;
MY_OPEN        : '<'  -> pushMode(INSIDE) ;
//MY_OPEN        : '<'  ;

   //White space
 fragment ASPACE: ' ';     
  SPACE: ASPACE {lastSep = true;};
 fragment WINNL: [\r\n]+;
  NEWLINE: WINNL {lastSep = true;};

//XSEA_WS: WHITE_SPACE;

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

  //Punctuation and other special characters
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


fragment STF: '<i>'  | '<b>' | '<u>'  | '<s>'  ;
fragment ETF: '</i>' | '</b>'| '</u>'  | '</s>'  ;

STAG: STF;
ETAG: ETF;


LARGE:    ('and' 
          |'for'
          |'of'
          |'the'
          |'with') {lastSep = false;};

LARGETF:  ( STF 'a' ETF 'nd'
          | STF 'f' ETF 'or'
          | STF 'o' ETF 'f'
          | STF 't' ETF 'he'
          | STF 'w' ETF 'ith') {lastSep = false;};

LARGE_TC:    ('And'|'For'|'Of'|'The'|'With') {lastSep = false;};

LARGE_TCTF:  ( STF 'A' ETF 'nd'
             | STF 'F' ETF 'or'
             | STF 'O' ETF 'f'
             | STF 'T' ETF 'he'
             | STF 'W' ETF 'ith') {lastSep = false;};

LARGE_UC: ('AND'|'FOR'|'OF'|'THE'|'WITH') {lastSep = false;};
LARGE_UCTF:  ( STF 'A' ETF 'ND'
             | STF 'F' ETF 'OR'
             | STF 'O' ETF 'F'
             | STF 'T' ETF 'HE'
             | STF 'W' ETF 'ITH') {lastSep = false;};



ILC45:     ('upon'  |STF'u'ETF 'pon'
           |'these' |STF't'ETF 'hese'
           |'those' |STF't'ETF 'hose'
           |'whose' |STF'w'ETF 'hose'
           |'word'  |STF'w'ETF 'ord')
           {lastSep = false;};
ILC45_TC:  ('Upon'  |STF'U'ETF 'pon'
           |'These' |STF'T'ETF 'hese'
           |'Those' |STF'T'ETF 'hose'
           |'Whose' |STF'W'ETF 'hose'
           |'Word'  |STF'W'ETF 'ord')
           {lastSep = false;};
ILC45_UC:  ('UPON'|'THESE'|'THOSE'|
            'WHOSE'|'WORD') 
           {lastSep = false;};

ILC456:    ('cannot'|'had'|'many'|'spirit'|'their'|'world') {lastSep = false;};
ILC456TF:  (STF'c'ETF'annot'|
            STF'h'ETF'ad'|
            STF'm'ETF'any'|
            STF's'ETF'pirit'|
            STF't'ETF'heir'|
            STF'w'ETF'orld') 
{lastSep = false;};

ILC456_TC: ('Cannot'|'Had'|'Many'|'Spirit'|'Their'|'World') {lastSep = false;};

ILC456_UC: ('CANNOT'|'HAD'|'MANY'|'SPIRIT'|'THEIR'|'WORLD') {lastSep = false;};

ILC5:      ('day'|'ever'|'father'|'here'|'know'|'lord'
           |'mother'|STF 'm' ETF 'other'|
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

UC_LETTERA   : 'A' {lastSep = false;};
UC_LETTERB   : 'B' {lastSep = false;};
UC_LETTERC   : 'C' {lastSep = false;};
UC_LETTERD   : 'D' {lastSep = false;};
UC_LETTERE   : 'E' {lastSep = false;};
UC_LETTERF   : 'F' {lastSep = false;};
UC_LETTERG   : 'G' {lastSep = false;};
UC_LETTERH   : 'H' {lastSep = false;};
UC_LETTERI   : 'I' {lastSep = false;};
UC_LETTERJ   : 'J' {lastSep = false;};
UC_LETTERK   : 'K' {lastSep = false;};
UC_LETTERL   : 'L' {lastSep = false;};
UC_LETTERM   : 'M' {lastSep = false;};
UC_LETTERN   : 'N' {lastSep = false;};
UC_LETTERO   : 'O' {lastSep = false;};
UC_LETTERP   : 'P' {lastSep = false;};
UC_LETTERQ   : 'Q' {lastSep = false;};
UC_LETTERR   : 'R' {lastSep = false;};
UC_LETTERS   : 'S' {lastSep = false;};
UC_LETTERT   : 'T' {lastSep = false;};
UC_LETTERU   : 'U' {lastSep = false;};
UC_LETTERV   : 'V' {lastSep = false;};
UC_LETTERW   : 'W' {lastSep = false;};
UC_LETTERX   : 'X' {lastSep = false;};
UC_LETTERY   : 'Y' {lastSep = false;};
UC_LETTERZ   : 'Z' {lastSep = false;};


EN       : 'en';
ENTF     : STAG 'e' ETAG 'n';
EN_TC    : 'En';
EN_TCTF  : STAG 'E' ETAG 'n';
EN_UC    : 'EN';
EN_UCTF  : STAG 'E' ETAG 'N';

IN       : 'in';
INTF     : STAG 'i' ETAG 'n';
IN_TC    : 'In';
IN_TCTF  : STAG 'I' ETAG 'n';
IN_UC    : 'IN';
IN_UCTF  : STAG 'I' ETAG 'N';


      //  Symbols supposedly used only as contractions but
      // anywhere in a word.  They MIGHT be a problem
      // when they can also represent words including
      // Ed, sh, er, ...
STRONG_GS     : ('ch'|'wh'|'sh'|'th'|'ou'|'st'|
                 'gh'|'ed'|'er'|'ow'|'ing'|'ar'){lastSep = false;}; 
STRONG_GSTF     : (STAG'c'ETAG'h'
                  |STAG'w'ETAG'h'
                  |STAG's'ETAG'h'
                  |STAG't'ETAG'h'
                  |STAG'o'ETAG'u'
                  |STAG's'ETAG't'
                  |STAG'g'ETAG'h'
                  |STAG'e'ETAG'd'
                  |STAG'e'ETAG'r'
                  |STAG'o'ETAG'w'
                  |STAG'i'ETAG'ng'
                  |STAG'a'ETAG'r'){lastSep = false;}; 

STRONG_GS_TC    : ('Ch'|'Wh'|'Sh'|'Th'|'Ou'|'St'|
                   'Gh'|'Ed'|'Er'|'Ow'|'Ing'|'Ar'){lastSep = false;}; 
STRONG_GS_TCTF  : (STAG'C'ETAG'h'
                  |STAG'W'ETAG'h'
                  |STAG'S'ETAG'h'
                  |STAG'T'ETAG'h'
                  |STAG'O'ETAG'u'
                  |STAG'S'ETAG't'
                  |STAG'G'ETAG'h'
                  |STAG'E'ETAG'd'
                  |STAG'E'ETAG'r'
                  |STAG'O'ETAG'w'
                  |STAG'I'ETAG'ng'
                  |STAG'A'ETAG'r'){lastSep = false;}; 

STRONG_GS_UC  : ('CH'|'WH'|'SH'|'TH'|'OU'|'ST'|
                 'GH'|'ED'|'ER'|'OW'|'ING'|'AR'){lastSep = false;};
STRONG_GS_uCTF  : (STAG'C'ETAG'H'
                  |STAG'W'ETAG'H'
                  |STAG'S'ETAG'H'
                  |STAG'T'ETAG'H'
                  |STAG'O'ETAG'U'
                  |STAG'S'ETAG'T'
                  |STAG'G'ETAG'H'
                  |STAG'E'ETAG'D'
                  |STAG'E'ETAG'R'
                  |STAG'O'ETAG'W'
                  |STAG'I'ETAG'NG'
                  |STAG'A'ETAG'R'){lastSep = false;}; 

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

 // These contractions can only be used in the interior
 //of a word but unlikely to be encountered as standalone
 //words in English text.
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


   // UEB switch to Nemeth indicator
//START_DIS: DOTS456 DOTS146 ' ' -> pushMode( NEMETH );




