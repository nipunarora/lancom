lexer grammar Block;

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
T21 : 'prog' ;
T22 : 'endprog' ;
T23 : ';' ;
T24 : 'ifconfig' ;
T25 : 'undo' ;
T26 : 'topology' ;
T27 : 'context' ;
T28 : 'apply' ;
T29 : 'policy' ;
T30 : 'host_group' ;
T31 : 'route' ;
T32 : 'add' ;
T33 : 'delete' ;
T34 : 'to' ;
T35 : 'from' ;
T36 : 'show' ;
T37 : 'numeric' ;
T38 : 'fw' ;
T39 : 'if' ;
T40 : '(' ;
T41 : ')' ;
T42 : 'else' ;
T43 : 'endif' ;
T44 : 'while' ;
T45 : 'endwhile' ;
T46 : 'echo' ;
T47 : '?' ;
T48 : ':' ;
T49 : '||' ;
T50 : '&&' ;
T51 : '|' ;
T52 : '&' ;
T53 : '==' ;
T54 : '!=' ;
T55 : '<' ;
T56 : '>' ;
T57 : '<=' ;
T58 : '>=' ;
T59 : '~' ;
T60 : '*=' ;
T61 : '/=' ;
T62 : '+=' ;
T63 : '-=' ;
T64 : ',' ;
T65 : 'topology_type_t' ;
T66 : 'host_type_t' ;
T67 : 'host_group_type_t' ;
T68 : 'serv_group_type_t' ;
T69 : 'context_type_t' ;
T70 : 'policy_type_t' ;
T71 : 'route_type_t' ;
T72 : 'interface_type_t' ;
T73 : 'ipaddr_t' ;
T74 : 'int_type_t' ;
T75 : 'char_type_t' ;
T76 : '{' ;
T77 : '}' ;
T78 : 'dst' ;
T79 : 'netmask' ;
T80 : 'all' ;
T81 : 'src' ;
T82 : 'serv_group' ;
T83 : 'inbound' ;
T84 : 'outbound' ;
T85 : 'allow' ;
T86 : 'deny' ;
T87 : 'udp' ;
T88 : 'tcp' ;
T89 : 'ip_addr' ;
T90 : 'ifname' ;
T91 : 'dns' ;
T92 : 'defgw' ;
T93 : 'host' ;
T94 : 'gw' ;
T95 : 'net' ;
T96 : 'service_group' ;
T97 : ', ' ;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1855
ID	:	LETTER (LETTER|DIGIT|'/')* ;
                           
// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1857
fragment LETTER	
	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1863
DOT 	:	'.';
//CHARS	:	(('a'..'z')|('A'..'Z'));
	
// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1866
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|	'REDIRECT MESSAGE'
	|	'TIME EXCEEDED'
	|	'ADDRESS MASK REQUEST'
	|	'ADDRESS MASK REPLY'
	;	
	

		
// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1876
CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1878
STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1880
fragment EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1884
NUMBER	: (DIGIT)+ ;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1886
fragment DIGIT
	: '0'..'9' ;	

//DELIMITER
//	:	 ';';

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1892
LINE_COMMENT 
	:	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1896
EQUAL	:	'=';
	
// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 1898
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;}
	;


//IPADDR_BYTE 
//	:  ('0'..'9')|(('0'..'9')('0'..'9'))|(('0'..'1')('0'..'9')('0'..'9'))|(('2') ('0'..'4')('0'..'9'))|(('2')('5')('0'..'5'));
