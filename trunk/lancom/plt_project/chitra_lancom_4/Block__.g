lexer grammar Block;

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
T22 : 'prog' ;
T23 : 'endprog' ;
T24 : ';' ;
T25 : 'ifconfig' ;
T26 : 'apply' ;
T27 : 'topology' ;
T28 : 'undo' ;
T29 : 'role' ;
T30 : 'policy' ;
T31 : 'host_group' ;
T32 : 'route' ;
T33 : 'add' ;
T34 : 'delete' ;
T35 : 'to' ;
T36 : 'from' ;
T37 : 'show' ;
T38 : 'numeric' ;
T39 : 'fw' ;
T40 : 'if' ;
T41 : '(' ;
T42 : ')' ;
T43 : 'else' ;
T44 : 'endif' ;
T45 : 'while' ;
T46 : 'endwhile' ;
T47 : 'echo' ;
T48 : '?' ;
T49 : ':' ;
T50 : '||' ;
T51 : '&&' ;
T52 : '|' ;
T53 : '&' ;
T54 : '==' ;
T55 : '!=' ;
T56 : '<' ;
T57 : '>' ;
T58 : '<=' ;
T59 : '>=' ;
T60 : '~' ;
T61 : '*=' ;
T62 : '/=' ;
T63 : '+=' ;
T64 : '-=' ;
T65 : 'topology_type_t' ;
T66 : 'host_type_t' ;
T67 : 'host_group_type_t' ;
T68 : 'serv_group_type_t' ;
T69 : 'role_type_t' ;
T70 : 'policy_type_t' ;
T71 : 'route_type_t' ;
T72 : 'interface_type_t' ;
T73 : 'ipaddr_t' ;
T74 : 'int_type_t' ;
T75 : 'char_type_t' ;
T76 : '{' ;
T77 : '}' ;
T78 : 'netmask' ;
T79 : 'inbound' ;
T80 : 'outbound' ;
T81 : 'allow' ;
T82 : 'deny' ;
T83 : 'udp' ;
T84 : 'tcp' ;
T85 : 'ifname' ;
T86 : 'card_id' ;
T87 : 'ip_addr' ;
T88 : 'host' ;
T89 : 'gw' ;
T90 : 'net' ;
T91 : 'service_set' ;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 414
ID	:	LETTER (LETTER|DIGIT)* ;
                           
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 416
fragment LETTER	
	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 422
DOT 	:	'.';
//CHARS	:	(('a'..'z')|('A'..'Z'));
	
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 425
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|	'REDIRECT MESSAGE'
	|	'TIME EXCEEDED'
	|	'ADDRESS MASK REQUEST'
	|	'ADDRESS MASK REPLY'
	;	
	
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 433
COMMA	: ',';	
		
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 435
CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 437
STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 439
fragment EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 443
NUMBER	: (DIGIT)+ ;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 445
fragment DIGIT
	: '0'..'9' ;	

//DELIMITER
//	:	 ';';

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 451
LINE_COMMENT 
	:	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 455
EQUAL	:	'=';
	
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_4/Block.g" 457
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;}
	;


//IPADDR_BYTE 
//	:  ('0'..'9')|(('0'..'9')('0'..'9'))|(('0'..'1')('0'..'9')('0'..'9'))|(('2') ('0'..'4')('0'..'9'))|(('2')('5')('0'..'5'));
