lexer grammar Block;

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
T92 : '(' ;
T93 : ')' ;
T94 : '{' ;
T95 : '}' ;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 517
ID	:	LETTER (LETTER|DIGIT)* ;
                           
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 519
fragment LETTER	
	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 525
DOT 	:	'.';
//CHARS	:	(('a'..'z')|('A'..'Z'));
	
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 528
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|	'REDIRECT MESSAGE'
	|	'TIME EXCEEDED'
	|	'ADDRESS MASK REQUEST'
	|	'ADDRESS MASK REPLY'
	;	
	
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 536
COMMA	: ',';	
		
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 538
CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 540
STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 542
fragment EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 546
NUMBER	: (DIGIT)+ ;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 548
fragment DIGIT
	: '0'..'9' ;	

//DELIMITER
//	:	 ';';

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 554
LINE_COMMENT 
	:	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 558
EQUAL	:	'=' ;
	
// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 560
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+  {$channel=HIDDEN;}
	;
	
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 564
PROG_BEGIN : 'prog';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 565
PROG_END : 'endprog';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 566
SEMICOLON : ';';
 	
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 568
IF : 'if';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 569
ELSE : 'else';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 570
ENDIF : 'endif';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 571
WHILE : 'while';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 572
ENDWHILE : 'endwhile';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 573
ECHO : 'echo';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 574
QUES : '?';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 575
COLON : ':';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 576
LOG_OR : '||';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 577
LOG_AND : '&&';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 578
BITWISE_AND : '&';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 579
BITWISE_OR :'|';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 580
EQUAL_TO : '==';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 581
NOT_EQUAL_TO : '!=';
 	
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 583
LT : '<';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 584
GT : '>';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 585
LE : '<=';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 586
GE : '>=';
 	
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 588
BITWISE_NEGATE : '~';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 589
ASSIGN : '=';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 590
ADD_ASSIGN : '+=';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 591
MINUS_ASSIGN : '-=';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 592
MULT_ASSIGN : '*=';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 593
DIV_ASSIGN : '/=';
 	
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 595
TOPOLOGY_TYPE_NAME : 'topology_type_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 596
HOST_TYPE_NAME  : 'host_type_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 597
HOST_GROUP_TYPE_NAME : 'host_group_type_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 598
SERVICE_GROUP_TYPE_NAME : 'serv_group_type_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 599
ROLE_GROUP_TYPE_NAME : 'role_group_type_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 600
POLICY_TYPE_NAME : 'policy_type_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 601
IP_ADDR_TYPE_NAME : 'ip_addr_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 602
INT_TYPE_NAME : 'int_type_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 603
INTERFACE_TYPE_NAME : 'interface_type_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 604
ROUTE_TYPE_NAME : 'route_type_t';
	
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 606
CHAR_TYPE_NAME : 'char_type_t';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 607
IPADDR : 'ipaddr';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 608
NETMASK : 'netmask';
  	
  	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 610
DIR_INBOUND : 'inbound';
  	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 611
DIR_OUTBOUND : 'outbound';

	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 613
VERD_ALLOW : 'allow';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 614
VERD_DENY : 'deny';
	
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 616
PROTO_UDP : 'udp';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 617
PROTO_TCP : 'tcp';

	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 619
IFNAME : 'ifname';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 620
CARD_ID : 'card_id';
	
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 622
HOST_GROUP : 'host_group';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 623
SERV_SET : 'serv_set';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 624
SERV_GROUP : 'serv_group';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 625
GATEWAY : 'gateway';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 626
DNS : 'dns';
 	
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 628
ROUTE : 'route';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 629
ADD :'add';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 630
HOST : 'host';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 631
GW : 'gw';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 632
NET : 'net';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 633
DELETE : 'delete';
 	
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 635
FW : 'fw';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 636
SHOW : 'show';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 637
ALL : 'all';
 	
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 639
NUMERIC : 'numeric';
 	
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 641
TO : 'to';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 642
FROM :'from';
 	
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 644
APPLY : 'apply';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 645
UNDO : 'undo';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 646
TOPOLOGY : 'topology';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 647
POLICY :'policy';
 	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 648
ROLE :'role';
	// $ANTLR src "/home/sambuddho/plt_project/chitra_lancom/Block.g" 649
IFCONFIG : 'ifconfig';
	
	
