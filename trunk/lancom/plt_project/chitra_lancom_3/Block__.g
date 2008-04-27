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
T85 : 'ip_addr' ;
T86 : 'ifname' ;
T87 : 'dns' ;
T88 : 'gw' ;
T89 : 'host' ;
T90 : 'net' ;
T91 : 'service_set' ;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 825
ID	:	LETTER (LETTER|DIGIT)* ;
                           
// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 827
fragment LETTER	
	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 833
DOT 	:	'.';
//CHARS	:	(('a'..'z')|('A'..'Z'));
	
// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 836
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|	'REDIRECT MESSAGE'
	|	'TIME EXCEEDED'
	|	'ADDRESS MASK REQUEST'
	|	'ADDRESS MASK REPLY'
	;	
	
// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 844
COMMA	: ',';	
		
// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 846
CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 848
STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 850
fragment EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 854
NUMBER	: (DIGIT)+ ;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 856
fragment DIGIT
	: '0'..'9' ;	

//DELIMITER
//	:	 ';';

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 862
LINE_COMMENT 
	:	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 866
EQUAL	:	'=';
	
// $ANTLR src "D:\Users\arpi\Desktop\Assignments\LANCOM\plt_project\chitra_lancom_3\Block.g" 868
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;}
	;


//IPADDR_BYTE 
//	:  ('0'..'9')|(('0'..'9')('0'..'9'))|(('0'..'1')('0'..'9')('0'..'9'))|(('2') ('0'..'4')('0'..'9'))|(('2')('5')('0'..'5'));
