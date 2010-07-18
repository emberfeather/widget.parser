grammar widget;

options {
	output=AST;
}

@header {
	package org.emberfeather.widget;
}

@lexer::header {
	package org.emberfeather.widget;
}

document:
	anything widget anything (widget anything)*
	;

widget:
	'[' ID ':' ID WS? (arguments WS?)? '/]'
	'[' ID ':' ID WS? (arguments WS?)? ']' content '[/]'
	;

arguments:
	'{' WS ( ', '? arg )* WS '}'
	| '{}'
	;

arg:
	ID ':' WS value
	;

value:
	STRING
	| INT
	| FLOAT
	| ('true' | 'false')
	;

content:
	.+
	;

anything:	
	( options {greedy=false;} : . )*
	;

/** Match various string types.  Note that greedy=false implies '
 *  should make us exit loop not continue.
 */
STRING:
	'\'' (options {greedy=false;}:.)* '\''
	| '"' (options {greedy=false;}:.)* '"'
	;

ID:
	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

WS:
	( ' '
		| '\t'
		| '\r'
		| '\n'
	) {$channel=HIDDEN;}
	;

INT:
	'0'..'9'+
	;

FLOAT:
	('0'..'9')+ '.' ('0'..'9')*
	| '.' ('0'..'9')+
	| ('0'..'9')+
	;
