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
T56 : 'route_type_t' ;
T57 : 'interface_type_t' ;
T58 : 'ipaddr_t' ;
T59 : 'int_type_t' ;
T60 : 'char_type_t' ;
T61 : 'inbound' ;
T62 : 'outbound' ;
T63 : 'allow' ;
T64 : 'deny' ;
T65 : 'udp' ;
T66 : 'tcp' ;
T67 : 'ifname' ;
T68 : 'card_id' ;
T69 : 'netmask' ;
T70 : 'host_group' ;
T71 : '{' ;
T72 : '}' ;
T73 : 'DNS' ;
T74 : 'GATEWAY' ;
T75 : 'dns' ;
T76 : 'gateway' ;
T77 : 'host' ;
T78 : 'gw' ;
T79 : 'net' ;
T80 : 'service_set' ;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 353
ID	:	LETTER (LETTER|DIGIT)* ;
                           
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 355
fragment LETTER	
	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 361
DOT 	:	'.';
//CHARS	:	(('a'..'z')|('A'..'Z'));
	
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 364
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|	'REDIRECT MESSAGE'
	|	'TIME EXCEEDED'
	|	'ADDRESS MASK REQUEST'
	|	'ADDRESS MASK REPLY'
	;	
	
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 372
COMMA	: ',';	
		
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 374
CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 376
STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 378
fragment EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 382
NUMBER	: (DIGIT)+ ;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 384
fragment DIGIT
	: '0'..'9' ;	

//DELIMITER
//	:	 ';';

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 390
LINE_COMMENT 
	:	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 394
EQUAL	:	'=';
	
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom_2/Block.g" 396
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;}
	;



 	
/*IF : 'if';
ELSE : 'else';
ENDIF : 'endif';
WHILE : 'while';
ENDWHILE : 'endwhile';
ECHO : 'echo';
QUES : '?';
COLON : ':';
LOG_OR : '||';
LOG_AND : '&&';
BITWISE_AND : '&';
BITWISE_OR :'|';
EQUAL_TO : '==';
NOT_EQUAL_TO : '!=';

LT : '<';
GT : '>';
LE : '<=';
GE : '>=';
	
BITWISE_NEGATE : '~';
ASSIGN : '=';
ADD_ASSIGN : '+=';
MINUS_ASSIGN : '-=';
MULT_ASSIGN : '*=';
DIV_ASSIGN : '/=';
 	
TOPOLOGY_TYPE_NAME : 'topology_type_t';
HOST_TYPE_NAME  : 'host_type_t';
HOST_GROUP_TYPE_NAME : 'host_group_type_t';
SERVICE_GROUP_TYPE_NAME : 'serv_group_type_t';
ROLE_GROUP_TYPE_NAME : 'role_group_type_t';
POLICY_TYPE_NAME : 'policy_type_t';
IP_ADDR_TYPE_NAME : 'ip_addr_t';
INT_TYPE_NAME : 'int_type_t';
INTERFACE_TYPE_NAME : 'interface_type_t';
ROUTE_TYPE_NAME : 'route_type_t';
	
CHAR_TYPE_NAME : 'char_type_t';
IPADDR : 'ipaddr';
NETMASK : 'netmask';
  	
DIR_INBOUND : 'inbound';
DIR_OUTBOUND : 'outbound';

VERD_ALLOW : 'allow';
VERD_DENY : 'deny';
	
PROTO_UDP : 'udp';
PROTO_TCP : 'tcp';

IFNAME : 'ifname';
CARD_ID : 'card_id';
	
HOST_GROUP : 'host_group';
SERV_SET : 'serv_set';
SERV_GROUP : 'serv_group';
GATEWAY : 'gateway';
DNS : 'dns';
 	
ROUTE : 'route';
ADD :'add';
 HOST : 'host';
 GW : 'gw';
 NET : 'net';
 DELETE : 'delete';
 	
 FW : 'fw';
 SHOW : 'show';
 ALL : 'all';
 	
 NUMERIC : 'numeric';
 	
 TO : 'to';
 FROM :'from';
 	
 APPLY : 'apply';
 'undo' : ''undo'';
 TOPOLOGY : 'topology';
 POLICY :'policy';
 ROLE :'role';
IFCONFIG : 'ifconfig';*/
	

//IPADDR_BYTE 
//	:  ('0'..'9')|(('0'..'9')('0'..'9'))|(('0'..'1')('0'..'9')('0'..'9'))|(('2') ('0'..'4')('0'..'9'))|(('2')('5')('0'..'5'));
