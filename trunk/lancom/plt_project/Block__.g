lexer grammar Block;

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
PROG_BEGIN : 'prog_begin' ;
PROG_END : 'prog_end' ;
T30 : 'prog' ;
T31 : 'endprog' ;
T32 : 'if' ;
T33 : '(' ;
T34 : ')' ;
T35 : 'else' ;
T36 : 'endif' ;
T37 : 'while' ;
T38 : 'endwhile' ;
T39 : 'echo' ;
T40 : '?' ;
T41 : ':' ;
T42 : '||' ;
T43 : '&&' ;
T44 : '|' ;
T45 : '&' ;
T46 : '==' ;
T47 : '!=' ;
T48 : '<' ;
T49 : '>' ;
T50 : '<=' ;
T51 : '>=' ;
T52 : '~' ;
T53 : '*=' ;
T54 : '/=' ;
T55 : '+=' ;
T56 : '-=' ;
T57 : 'topology_type_t' ;
T58 : 'host_type_t' ;
T59 : 'host_group_type_t' ;
T60 : 'serv_group_type_t' ;
T61 : 'role_type_t' ;
T62 : 'policy_type_t' ;
T63 : 'ipaddr_t' ;
T64 : 'int_type_t' ;
T65 : 'char_type_t' ;
T66 : 'inbound' ;
T67 : 'outbound' ;
T68 : 'allow' ;
T69 : 'deny' ;
T70 : 'udp' ;
T71 : 'tcp' ;
T72 : 'ifname' ;
T73 : 'card_id' ;
T74 : 'netmask' ;
T75 : 'host_group' ;
T76 : '{' ;
T77 : '}' ;
T78 : 'DNS' ;
T79 : 'GATEWAY' ;
T80 : 'service_set' ;

// $ANTLR src "/home/sambuddho/plt_project/Block.g" 167
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;};
// $ANTLR src "/home/sambuddho/plt_project/Block.g" 169
EQUAL	:	'=';
// $ANTLR src "/home/sambuddho/plt_project/Block.g" 172
OBJECT_NAME:ID ;
	// $ANTLR src "/home/sambuddho/plt_project/Block.g" 173
ID	:	LETTER (LETTER|DIGIT)* ;
                           
 // $ANTLR src "/home/sambuddho/plt_project/Block.g" 175
fragment LETTER	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;





// $ANTLR src "/home/sambuddho/plt_project/Block.g" 207
DNS	:'dns';
// $ANTLR src "/home/sambuddho/plt_project/Block.g" 208
GATEWAY	:'gw';
//NM	:'netmask';
// $ANTLR src "/home/sambuddho/plt_project/Block.g" 210
DOT 	:	'.';
// $ANTLR src "/home/sambuddho/plt_project/Block.g" 211
CHARS	:	(('a'..'z')|('A'..'Z'));
	
// $ANTLR src "/home/sambuddho/plt_project/Block.g" 213
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|'REDIRECT MESSAGE'
	|'TIME EXCEEDED'
	|'ADDRESS MASK REQUEST'
	|'ADDRESS MASK REPLY';	
	// $ANTLR src "/home/sambuddho/plt_project/Block.g" 219
COMMA: ',';	
		
	// $ANTLR src "/home/sambuddho/plt_project/Block.g" 221
CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

 
 // $ANTLR src "/home/sambuddho/plt_project/Block.g" 224
STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';
// $ANTLR src "/home/sambuddho/plt_project/Block.g" 225
fragment
 EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

// $ANTLR src "/home/sambuddho/plt_project/Block.g" 230
NUMBER: (DIGIT)+ ;

 // $ANTLR src "/home/sambuddho/plt_project/Block.g" 232
fragment DIGIT: '0'..'9' ;	

// $ANTLR src "/home/sambuddho/plt_project/Block.g" 234
DELIMITER
	:	 ';';
	 // $ANTLR src "/home/sambuddho/plt_project/Block.g" 236
LINE_COMMENT :	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
	 // $ANTLR src "/home/sambuddho/plt_project/Block.g" 237
IPADDR_BYTE :  ('0'..'9')|(('0'..'9')('0'..'9'))|(('0'..'1')('0'..'9')('0'..'9'))|(('2') ('0'..'4')('0'..'9'))|(('2')('5')('0'..'5'));
