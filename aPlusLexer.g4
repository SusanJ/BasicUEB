lexer grammar aPlusLexer; 
@lexer::header{ package aplus; }
@lexer::members{ public static boolean lastSep = false;}



//Markdown support?
 //fragment ASTER: '*';
//ITAL: ASTER; //1
//BOLD: ASTER ASTER;
//fragment START_I: '<''i''>';
//fragment END_I:   '<''/''i''>';


ZERO:  '0';
ONE:   '1';
TWO:   '2';
THREE: '3';
FOUR:  '4';
FIVE:  '5';
SIX:   '6';
SEVEN: '7';
EIGHT: '8';
NINE:  '9';

OFENCE: '('|'['|'{'|'<'{lastSep = true;}; //3
CFENCE: ')'|']'|'}'|'>'; //3
NEU:  '\''|'"'; //2
PERIODorDEC:  '.'; //1
SEMICOLON: ';';
PUNC: ','|'?'|':'|'!'; //5
SPEC: '\\'|'|'|'+'|'='|'&'|'*'
      '^'|'%'|'$'|'#'|'@'|'~'; //12
FSLASH:'/';

BACK_TICK: '`'; //1
SEP: ('-'|'_') {lastSep = true;};  //2



//STRONG:    'child'|'which'|'shall'|'this'|'out'|'still';
//STRONG_TC: 'Child'|'Which'|'Shall'|'This'|'Out'|'Still';

WEIRD:    'his'|'was'|'were'|'enough';
WEIRD_TC: 'His'|'Was'|'Were'|'Enough';


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

ILC45:    ('upon'|'these'|'those'|'whose'|'word') {lastSep = false;};
ILC45_TC: ('Upon'|'These'|'Those'|'Whose'|'Word') {lastSep = false;};

ILC456: 'cannot'|'had'|'many'|'spirit'|'their'|'world';
ILC456_TC: 'Cannot'|'Had'|'Many'|'Spirit'|'Their'|'World';

ILC5:    ('day'|'ever'|'father'|'here'|'know'|'lord'|'mother'|
         'name'|'one'|'part'|'question'|'right'|'some'|
         'time'|'under'|'young'|'there'|
         'character'|'through'|'where'|'ought'|'work'){lastSep = false;};
ILC5_TC: ('Day'|'Ever'|'Father'|'Here'|'Know'|'Lord'|'Mother'|
      'Name'|'One'|'Part'|'Question'|'Right'|'Some'|
      'Time'|'Under'|'Young'|'There'|                          
      'Character'|'Through'|'Where'|'Ought'|'Work'){lastSep = false;};

  //  Need to have individual letters as lexer tokens since parser
  // has to use them to define position-dependent contractions
LETTERA: 'a'{lastSep = false;};
LETTERB: 'b'{lastSep = false;};
LETTERC: 'c'{lastSep = false;};
LETTERD: 'd'{lastSep = false;};
LETTERE: 'e'{lastSep = false;};
LETTERF: 'f'{lastSep = false;};
LETTERG: 'g'{lastSep = false;};
LETTERH: 'h'{lastSep = false;};
LETTERI: 'i'{lastSep = false;};
LETTERJ: 'j'{lastSep = false;};
LETTERK: 'k'{lastSep = false;};
LETTERL: 'l'{lastSep = false;};
LETTERM: 'm'{lastSep = false;};
LETTERN: 'n'{lastSep = false;};
LETTERO: 'o'{lastSep = false;};
LETTERP: 'p'{lastSep = false;};
LETTERQ: 'q'{lastSep = false;};
LETTERR: 'r'{lastSep = false;};
LETTERS: 's'{lastSep = false;};
LETTERT: 't'{lastSep = false;};
LETTERU: 'u'{lastSep = false;};
LETTERV: 'v'{lastSep = false;};
LETTERW: 'w'{lastSep = false;};
LETTERX: 'x'{lastSep = false;};
LETTERY: 'y'{lastSep = false;};
LETTERZ: 'z'{lastSep = false;};



//SMALL: [f-z]{lastSep = false;};
//IT_SMALL: START_I SMALL END_I;
CAPS: [A-Z]{lastSep = false;};
//START_IT: START_I;
//END_IT: START_I;

//LESS_THAN: '<'; //1
//GRTR_THAN: '>'; //1

//BE: 'be';
BE_TC: 'Be';
IN: 'in';
IN_TC: 'In';
EN: 'en';
EN_TC: 'En';

      //  Symbols supposedly used only as contractions but
      // anywhere in a word.  They can be a problem
      // when they can also represent words including
      // Ed, sh, er, ...
STRONG_GS:  ('ch'|'wh'|'sh'|'th'|'ou'|'st'|
            'gh'|'ed'|'er'|'ow'|'ing'|'ar'){lastSep = false;}; 
STRONG_GS_TC: ('Ch'|'Wh'|'Sh'|'Th'|'Ou'|'St'|
              'Gh'|'Ed'|'Er'|'Ow'|'Ing'|'Ar'){lastSep = false;}; 

   //  This rule only used when the last item was NOT a separator
   // or similar character than could signal the beginning of
   // an upcoming word.
FLC: 
     ('ment'|'ful'|'ong'|'ity'|'ance'|'ence'|
     'ound'|'ount'|'less'|'ness'|'sion'|'tion')
     {!lastSep}?
     ;

   //Lower groupsigns
//BEGCON: 'be'|'con'|'dis';
//BEGCON: 'con'|'dis';
BEGCON_TC: 'Con'|'Dis';
MIDCON: 'ea'|'bb'|'cc'|'ff'|'gg';


        //UEB Contracted Whole Words
//WW: 'but'|'can'|'do'|'every'|'from'|'go'|'have'|
    //'just'|'knowledge'|'like'|'more'|
    //'not'|'people'|'quite'|'rather'|'so'|'that'|
    //'us'|'very'|'will'|'it'|'you'|'as'
    //;
//WW_TC: 'But'|'Can'|'Do'|'Every'|'From'|'Go'|'Have';


MDASH: '—' {lastSep = true;};
NDASH: '–' {lastSep = true;};


  //smart odquo cdquo osquo cdquo
ODQUO: '“';
CDQUO: '”';

ITAL_STAG: '<i>';
//ITAL_STAG: '<''i''>';

ITAL_ETAG: '<''/''i''>';



 fragment ASPACE: ' ';     
  SPACE: ASPACE {lastSep = true;};
 fragment WINNL: [\r\n]+;
  NEWLINE: WINNL {lastSep = true;};

//START_DIS: USCORE PCENT ASPACE -> pushMode( NEMETH );

START_MML: '<math>' -> pushMode( MML );


START_NEM: '<Nem>' -> pushMode( NEMETH );

mode NEMETH;
  //END_DIS: USCORE COLON ASPACE -> popMode;
  END_NEM: '</Nem>' -> popMode;
  NEM_NI:    '#';
  NEM_ZERO:  '0';
  NEM_ONE:   '1';
  NEM_TWO:   '2';
  NEM_THREE: '3';
  NEM_FOUR:  '4';
  NEM_FIVE:  '5';
  NEM_SIX:   '6';
  NEM_SEVEN: '7';
  NEM_EIGHT: '8';
  NEM_NINE:  '9';
  
NEM_LCletter: '[a-z]'; 
NEM_UCletter: '[A-Z]';   

mode MML;
END_MML:   '</math>' -> popMode;
MML_NEWLINE: WINNL;
MML_SPACE: ASPACE;

fragment MN_STAG: '<mn>';
fragment MN_ETAG: '</mn>';
fragment MI_STAG: '<mi>';
fragment MI_ETAG: '</mi>';
fragment MO_STAG: '<mo>';
fragment MO_ETAG: '</mo>';

MML_SROW:  '<mrow>';
MML_EROW: '</mrow>';
MML_SFRAC:  '<mfrac>';
MML_EFRAC: '</mfrac>';
MML_SSUB:  '<msub>';
MML_ESUB: '</msub>';
MML_SSUP:  '<msup>';
MML_ESUP: '</msup>';
MML_SSUBSUP:  '<msubsup>';
MML_ESUBSUP: '</msubsup>';

MML_DEC_DIG: [0-9];
MML_LC_LET:  [a-z];

MML_INT:  MN_STAG MML_DEC_DIG+ MN_ETAG;
MML_VAR:  MI_STAG MML_LC_LET MI_ETAG;
MML_OP:   MO_STAG ('+'|'-') MO_ETAG;
MML_CMPR: MO_STAG ('='|'<'|'>') MO_ETAG;
MML_FUNS: MO_STAG ('sin'|'cos'|'amp'|'antilog'|'arc') MO_ETAG;



