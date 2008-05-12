lexer grammar Block;

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
ELSE : 'else' ;
ENDIF : 'endif' ;
OPAREN : '(' ;
CPAREN : ')' ;
ENDWHILE : 'endwhile' ;
T27 : 'prog' ;
T28 : 'endprog' ;
T29 : ';' ;
T30 : 'ifconfig' ;
T31 : 'apply' ;
T32 : 'undo' ;
T33 : 'topology' ;
T34 : 'context' ;
T35 : 'policy' ;
T36 : 'host_group' ;
T37 : 'add' ;
T38 : 'to' ;
T39 : 'delete' ;
T40 : 'from' ;
T41 : 'route' ;
T42 : 'show' ;
T43 : 'numeric' ;
T44 : 'fw' ;
T45 : 'if' ;
T46 : 'while' ;
T47 : 'echo' ;
T48 : '||' ;
T49 : '&&' ;
T50 : '|' ;
T51 : '&' ;
T52 : '==' ;
T53 : '!=' ;
T54 : '<' ;
T55 : '>' ;
T56 : '<=' ;
T57 : '>=' ;
T58 : '~' ;
T59 : '*=' ;
T60 : '/=' ;
T61 : '+=' ;
T62 : '-=' ;
T63 : ',' ;
T64 : 'topology_type_t' ;
T65 : 'host_type_t' ;
T66 : 'host_group_type_t' ;
T67 : 'serv_group_type_t' ;
T68 : 'context_type_t' ;
T69 : 'policy_type_t' ;
T70 : 'route_type_t' ;
T71 : 'interface_type_t' ;
T72 : 'ipaddr_t' ;
T73 : 'int_type_t' ;
T74 : 'char_type_t' ;
T75 : '{' ;
T76 : '}' ;
T77 : 'dst' ;
T78 : 'netmask' ;
T79 : 'all' ;
T80 : 'src' ;
T81 : 'serv_group' ;
T82 : 'inbound' ;
T83 : 'outbound' ;
T84 : 'allow' ;
T85 : 'deny' ;
T86 : 'udp' ;
T87 : 'tcp' ;
T88 : 'ip_addr' ;
T89 : 'ifname' ;
T90 : 'dns' ;
T91 : 'defgw' ;
T92 : 'host' ;
T93 : 'gw' ;
T94 : 'net' ;
T95 : 'service_group' ;
T96 : ', ' ;

// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 446
ROUTE_OPER returns [String rcmd]
 	:'route' 'add' 		{ $rcmd = new String("RouteAdd"); }
 	|'route' 'delete' 	{ $rcmd = new String("RouteDelete"); }
 	;	

// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2531
ID	:	LETTER (LETTER|DIGIT|'/')* ;
                           
// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2533
fragment LETTER	
	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;

// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2539
DOT 	:	'.';
	
// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2541
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|	'REDIRECT MESSAGE'
	|	'TIME EXCEEDED'
		|	'ADDRESS MASK REQUEST'
	|	'ADDRESS MASK REPLY'
	;	
	

		
// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2551
CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2553
STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';

// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2555
fragment EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2559
NUMBER	: (DIGIT)+ ;

// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2561
fragment DIGIT
	: '0'..'9' ;	


// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2565
LINE_COMMENT 
	:	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2569
EQUAL	:	'=';
	
// $ANTLR src "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g" 2571
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;}
	;
