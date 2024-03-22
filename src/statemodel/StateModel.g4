grammar StateModel;

model: functionDefinition* statement*  functionDefinition*;


IF: 'if';
ELSE: 'else';

LPAREN: '(';
RPAREN: ')';
LCURLY: '{';
RCURLY: '}';

PLUS: '+';
MINUS: '-';
MUL: '*';

EOS: ';';

COLOR: '#' [0-9a-fA-F]+;

NUMBER: [0-9]+;

BOOL: 'true' | 'false';

arithmeticExpression: term ((PLUS | MINUS) term)*;
term: NUMBER ((MUL) NUMBER)*;

ID: [a-zA-Z][a-zA-Z0-9_]*;
WS: [ \t\r\n] -> skip;

COMMENT: '/*' .*? '*/' -> skip;
Line_COMMENT: '//' ~[\r\n]* -> skip;

frontIsClear: 'front_is_clear()';
leftIsClear: 'left_is_clear()';
rightIsClear: 'right_is_clear()';
facingNorth: 'facing_north()';
facingSouth: 'facing_south()';
facingEast: 'facing_east()';
facingWest: 'facing_west()';
beeperPresent: 'beeper_present()';
noBeepersPresent: 'no_beepers_present()';



statement: move
         | turnLeft
         | turnRight
         | pickBeeper
         | putBeeper
         | paint
         | functionCall
         | ifStatement
         ;


functionDefinition:
    name LPAREN RPAREN
    LCURLY statement* RCURLY
    ;

name:ID;


move: 'move' LPAREN (NUMBER | arithmeticExpression)? RPAREN EOS;
turnLeft: 'turn_left()' EOS;
turnRight: 'turn_right()' EOS;
pickBeeper: 'pick_beeper()' EOS;
putBeeper: 'put_beeper()' EOS;
paint: 'paint_corner' LPAREN COLOR RPAREN EOS;

ifStatement : IF LPAREN condition RPAREN LCURLY statement* RCURLY elseStatement?;

elseStatement : ELSE (ifStatement | LCURLY statement* RCURLY);

functionCall: functionTarget LPAREN RPAREN EOS;
functionTarget: ID;

condition: frontIsClear
         | leftIsClear
         | rightIsClear
         | facingNorth
         | facingSouth
         | facingEast
         | facingWest
         | beeperPresent
         | noBeepersPresent
         | BOOL
         ;


