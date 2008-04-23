lexer grammar Block;

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
T22 : 'prog' ;
T23 : 'endprog' ;
T24 : ';' ;
T25 : 'if' ;
T26 : '(' ;
T27 : ')' ;
T28 : 'else' ;
T29 : 'endif' ;
T30 : 'while' ;
T31 : 'endwhile' ;
T32 : 'echo' ;
T33 : '?' ;
T34 : ':' ;
T35 : '||' ;
T36 : '&&' ;
T37 : '|' ;
T38 : '&' ;
T39 : '==' ;
T40 : '!=' ;
T41 : '<' ;
T42 : '>' ;
T43 : '<=' ;
T44 : '>=' ;
T45 : '~' ;
T46 : '*=' ;
T47 : '/=' ;
T48 : '+=' ;
T49 : '-=' ;
T50 : 'topology_type_t' ;
T51 : 'host_type_t' ;
T52 : 'host_group_type_t' ;
T53 : 'serv_group_type_t' ;
T54 : 'role_type_t' ;
T55 : 'policy_type_t' ;
T56 : 'ipaddr_t' ;
T57 : 'int_type_t' ;
T58 : 'char_type_t' ;
T59 : 'inbound' ;
T60 : 'outbound' ;
T61 : 'allow' ;
T62 : 'deny' ;
T63 : 'udp' ;
T64 : 'tcp' ;
T65 : 'ifname' ;
T66 : 'card_id' ;
T67 : 'netmask' ;
T68 : 'host_group' ;
T69 : '{' ;
T70 : '}' ;
T71 : 'DNS' ;
T72 : 'GATEWAY' ;
T73 : 'service_set' ;

// $ANTLR src "C:\Antlr\LANCOM\Block.g" 357
ID	:	LETTER (LETTER|DIGIT)* ;
                           
// $ANTLR src "C:\Antlr\LANCOM\Block.g" 359
fragment LETTER	
	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;

// $ANTLR src "C:\Antlr\LANCOM\Block.g" 365
DOT 	:	'.';
//CHARS	:	(('a'..'z')|('A'..'Z'));
	
// $ANTLR src "C:\Antlr\LANCOM\Block.g" 368
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|	'REDIRECT MESSAGE'
	|	'TIME EXCEEDED'
	|	'ADDRESS MASK REQUEST'
	|	'ADDRESS MASK REPLY'
	;	
	
// $ANTLR src "C:\Antlr\LANCOM\Block.g" 376
COMMA	: ',';	
		
// $ANTLR src "C:\Antlr\LANCOM\Block.g" 378
CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

// $ANTLR src "C:\Antlr\LANCOM\Block.g" 380
STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';

// $ANTLR src "C:\Antlr\LANCOM\Block.g" 382
fragment EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

// $ANTLR src "C:\Antlr\LANCOM\Block.g" 386
NUMBER	: (DIGIT)+ ;

// $ANTLR src "C:\Antlr\LANCOM\Block.g" 388
fragment DIGIT
	: '0'..'9' ;	

//DELIMITER
//	:	 ';';

// $ANTLR src "C:\Antlr\LANCOM\Block.g" 394
LINE_COMMENT 
	:	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

// $ANTLR src "C:\Antlr\LANCOM\Block.g" 398
EQUAL	:	'=';
	
// $ANTLR src "C:\Antlr\LANCOM\Block.g" 400
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;}
	;


//IPADDR_BYTE 
//	:  ('0'..'9')|(('0'..'9')('0'..'9'))|(('0'..'1')('0'..'9')('0'..'9'))|(('2') ('0'..'4')('0'..'9'))|(('2')('5')('0'..'5'));
