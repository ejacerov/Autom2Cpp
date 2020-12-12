grammar Autom2c;
//Main rulemain: automata*;
//Automata Structure


automata : (autonm '{' state_set+ event_set+ transitions+ '}' )+ actions;// state_set   (selfloop| transition)+'}';
state_set:  (state)+; // (',' ID )* ';')+ ;
event_set:  (event)+; //)(',' ID )* ';')+ ;
event: EVENT ID ';';
state: STATE ID ';';
autonm: TAG ATSGN ID;
selfloop: 'loop' ID '(' ID ')' ';';
transition: ('from' ID '(' ID ')' 'to' ID';')| ('loop' ID '(' ID ')' ';');
transitions:transition+;
actions:action+;
action:prints | tests ; //| test ;
prints:print+;
print:'print' '(' ID ')' ';';
tests:test+;
test: testnm '('ID(','ID)*')' ';';
testnm: '@' ID ;
//TESTNM:'@' ID ;
TAG:'Automata';
ATSGN : '@';
STATE:'estado';
EVENT:'evento';
ID 		: [a-zA-Z][a-zA-Z0-9_]* ;
END:'end' ';';
COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '#' ~[\r\n]* -> skip ;
WS		: [ \t\r\n]+ -> skip ;