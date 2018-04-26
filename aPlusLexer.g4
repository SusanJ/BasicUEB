lexer grammar aPlusLexer; 
@lexer::header{ package aplus; }

 fragment ASTER: '*';
ITAL: ASTER; //1
BOLD: ASTER ASTER;


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

LESS_THAN: '<'; //1
GRTR_THAN: '>'; //1
OFENCE: '('|'['|'{'; //3
CFENCE: ')'|']'|'}'; //3
NEU:  '\''|'"'; //2
DEC:  '.'; //1
PUNC: ','|'?'|';'|':'|'!'; //5
SPEC: '\\'|'|'|'+'|'='|'&'|
      '^'|'%'|'$'|'#'|'@'|'~'; //12
FSLASH:'/';

BACK_TICK: '`'; //1
SEP: '-'|'_'; //2

BE: 'be';
BE_TC: 'Be';
IN: 'in';
IN_TC: 'In';
EN: 'en';
EN_TC: 'En';


STRONG:    'child'|'which'|'shall'|'this'|'out'|'still';
STRONG_TC: 'Child'|'Which'|'Shall'|'This'|'Out'|'Still';

WEIRD:    'his'|'was'|'were'|'enough';
WEIRD_TC: 'His'|'Was'|'Were'|'Enough';


        //Symbols used as either words or contractions
LARGE:    'and'|'for'|'of'|'the'|'with';
LARGE_TC: 'And'|'For'|'Of'|'The'|'With';

ILC45: 'upon'|'these'|'those'|'whose'|'word';
ILC45_TC: 'Upon'|'These'|'Those'|'Whose'|'Word';

ILC456: 'cannot'|'had'|'many'|'spirit'|'their'|'world';
ILC456_TC: 'Cannot'|'Had'|'Many'|'Spirit'|'Their'|'World';

ILC5:    'day'|'ever'|'father'|'here'|'know'|'lord'|'mother'|
         'name'|'one'|'part'|'question'|'right'|'some'|
         'time'|'under'|'young'|'there'|                             'character'|'through'|'where'|'ought'|'work';
ILC5_TC: 'Day'|'Ever'|'Father'|'Here'|'Know'|'Lord'|'Mother'|
      'Name'|'One'|'Part'|'Question'|'Right'|'Some'|
      'Time'|'Under'|'Young'|'There'|                          
      'Character'|'Through'|'Where'|'Ought'|'Work';

SMALL: [a-z];
CAPS: [A-Z];


      //Symbols used only as contractions
STRONG_GS:  'ch'|'wh'|'sh'|'th'|'ou'|'st'|
            'gh'|'ed'|'er'|'ow'|'ing'|'ar' ;
STRONG_GS_TC: 'Ch'|'Wh'|'Sh'|'Th'|'Ou'|'St'|
              'Gh'|'Ed'|'Er'|'Ow'|'Ing'|'Ar' ;
FLC: 'ment'|'ful'|'ong'|'ity'|'ance'|'ence'|
     'ound'|'ount'|'less'|'ness'|'sion'|'tion';

   //Lower groupsigns
BEGCON: 'con'|'dis';
BEGCON_TC: 'Con'|'Dis';
MIDCON: 'ea'|'bb'|'cc'|'ff'|'gg';


        //UEB Contracted Whole Words
WW: 'but'|'can'|'do'|'every'|'from'|'go'|'have'|
    'just'|'knowledge'|'like'|'more'|
    'not'|'people'|'quite'|'rather'|'so'|'that'|
    'us'|'very'|'will'|'it'|'you'|'as'
    ;
WW_TC: 'But'|'Can'|'Do'|'Every'|'From'|'Go'|'Have';


MDASH: '—';
NDASH: '–';

  //smart odquo cdquo osquo cdquo
ODQUO: '“';
CDQUO: '”';

 fragment ASPACE: ' ';     
  SPACE: ASPACE;
 fragment WINNL: [\r\n]+;
  NEWLINE: WINNL;
