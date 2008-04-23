grammar Block;

tokens {
 	PLUS 	= '+' ;
 	MINUS	= '-' ;
 	MULT	= '*' ;
 	DIV	= '/' ;
/* 	NUMBER ;
 	
 	
 	PROG_BEGIN ;
 	PROG_END ;
 	SEMICOLON ;
 	
 	IF ;
 	ELSE ;
 	ENDIF ;
 	WHILE ;
 	ENDWHILE ;
 	ECHO ;
 	QUES ;
 	COLON ;
 	LOG_OR ;
 	LOG_AND ;
 	BITWISE_AND ;
 	BITWISE_OR ;
 	EQUAL_TO ;
 	NOT_EQUAL_TO ;
 	
 	LT ;
 	GT;
 	LE ;
 	GE ;
 	
 	BITWISE_NEGATE ;
 	ASSIGN ;
 	ADD_ASSIGN ;
 	MINUS_ASSIGN ;
 	MULT_ASSIGN ;
 	DIV_ASSIGN ;
 	
 	TOPOLOGY_TYPE_NAME ;
	HOST_TYPE_NAME  ;
	HOST_GROUP_TYPE_NAME ;
	SERVICE_GROUP_TYPE_NAME ;
	ROLE_GROUP_TYPE_NAME ;
	POLICY_TYPE_NAME ;
	IP_ADDR_TYPE_NAME ;
	INT_TYPE_NAME ;
	INTERFACE_TYPE_NAME ;
	ROUTE_TYPE_NAME ;
	
	CHAR_TYPE_NAME ;
	IPADDR ;
	NETMASK ;
  	
  	DIR_INBOUND ;
  	DIR_OUTBOUND ;

	VERD_ALLOW ;
	VERD_DENY ;
	
	PROTO_UDP ;
	PROTO_TCP ;

	IFNAME ;
	CARD_ID ;
	
	HOST_GROUP ;
	SERV_SET ;
	SERV_GROUP ;
	GATEWAY ;
	DNS ;
 	
 	ROUTE ;
 	ADD ;
 	HOST ;
 	GW ;
 	NET ;
 	DELETE ;
 	
 	FW ;
 	SHOW ;
 	ALL ;
 	
 	NUMERIC ;
 	
 	TO ;
 	FROM ;
 	
 	APPLY ;
 	UNDO ;
 	TOPOLOGY ;
 	POLICY ;
 	ROLE ;
	IFCONFIG ;*/
}

@header
{
	//import javalancom.Scope;
	//import javalancom.Symbol;
	import java.util.HashMap;
	import java.util.Set;
	import java.util.Iterator;
	import java.util.Map;
}


@members 
{
	Scope globalScope = new Scope(null);
	Scope currentScope = globalScope;
	Map<String, Assignment> map = new HashMap<String, Assignment>(); 

    	public static void main(String[] args) throws Exception 
    	{
        	BlockLexer lex = new BlockLexer(new ANTLRFileStream(args[0]));
	       	CommonTokenStream tokens = new CommonTokenStream(lex);

        	BlockParser parser = new BlockParser(tokens);

	        try 
	        {
	            parser.role();
        	} 
        	catch (RecognitionException e)  
        	{
	            e.printStackTrace();
        	}
    	}
} 
prog
	:	PROG_BEGIN statement_list+ PROG_END;	
 
 statement_list  :	statement
 	| 	declr_stmt
 	;
 
 statement
 	:	condition_statement
 	|	iteration_statement
 	|	statement_expr
 	|	print_statement
 	;
 	
 statement_expr
 	:	SEMICOLON 
 	|	expression SEMICOLON
 	;
 	
 condition_statement
 	:	IF '(' equality_expr ')' statement_list (ELSE statement_list)? ENDIF
 	;
 	
 iteration_statement
 	:	WHILE '(' equality_expr ')' statement_list ENDWHILE
 	;
 	
 print_statement
 	:	ECHO STRING  {System.out.println($STRING);}';'
 	;
 	
 expression
 	:	assignment_expr //(',' assignment_expr)*
 	|	config_statement
 	;
 
 config_statement
 	:	route_oper object_name
 	|	route_oper route	
 	|	IFCONFIG object_name
 	|	IFCONFIG interface
 	|	APPLY TOPOLOGY object_name
 	|	APPLY TOPOLOGY topology
 	|	UNDO TOPOLOGY object_name 
 	|	UNDO TOPOLOGY topology
 	|	set_oper ROLE object_name                        
 	|	set_oper ROLE role
 	|	APPLY ROLE object_name
 	|	APPLY ROLE role
 	|	UNDO ROLE object_name
 	|	UNDO ROLE role
 	|	APPLY POLICY object_name
 	|	APPLY ROLE policy
 	|	UNDO ROLE object_name
 	|	UNDO ROLE policy
 	|	set_oper HOST_GROUP host_group host
 	|	set_oper SERV_GROUP serv_group serv_descr 
 	|	config_display
 	;
 
 route_oper 
 	:	ROUTE ADD
 	|	ROUTE DELETE
 	;
 	
set_oper 
 	:	ADD TO
 	|	DELETE FROM
 	;	
 
 config_display 
 	:
 	 ROUTE SHOW NUMERIC
	|ROUTE SHOW 
	| FW SHOW NUMERIC
	|FW SHOW  
	;
 
 assignment_expr
  	: 	var=object_name op=assignment_operator 
	 	{
	 		Symbol s = currentScope.getSymbol($var.text);
			Assignment ans = new Assignment(s, $op.text);
			map.put($var.text, ans);
			System.out.println("here");
	 	}
 		assignment_expr //(',' assignment_expr)*
 	
 	| 	e=conditional_expr
 		{
 			//Put these values in assignment map
 			System.out.println("Cond expr: " + $e.sym);
 			
 			Set entries = map.entrySet();
			Iterator iter = entries.iterator();
			System.out.println("Symbol Val: " + $e.sym.getValue());
			while(iter.hasNext() && $e.sym != null)
			{
				Map.Entry entry = (Map.Entry)iter.next();
				String key = (String)entry.getKey();
				Symbol s = new Symbol(key, $e.sym.getType(), $e.sym.lookupValue());
				System.out.println(s.getValue());
				//-- COMMENT: Somehow this statement is not reflecting a change in the symbol value
				currentScope.setSymbolValue(key, s);
				System.out.println("Symbol table: " + s.getType() + " " + s.getValue());
			}
			currentScope.printSymbols();
 		}
 
 	;
 
 
 		
 conditional_expr returns [Symbol sym]
 	:	e=logicalOR_expr	{ $sym = $e.sym;}
 	( QUES expression COLON conditional_expr)?
 	;
 	
 logicalOR_expr returns [Symbol sym]
 	:	e=logicalAND_expr 	{ $sym = $e.sym;}
 	(LOG_OR logicalAND_expr)*
 	;
 
 logicalAND_expr returns [Symbol sym]
 	:	e=bitwiseOR_expr 	{ $sym = $e.sym;}
 	(LOG_AND bitwiseOR_expr)*
 	;
 	
 bitwiseOR_expr returns [Symbol sym]
 	:	e=bitwiseAND_expr 	{ $sym = $e.sym;}
 	(BITWISE_OR bitwiseAND_expr)*
 	;
 
 bitwiseAND_expr returns [Symbol sym]
 	:	e=equality_expr 	{ $sym = $e.sym;}
 	(BITWISE_AND equality_expr)*	
 	;
 	
 equality_expr returns [Symbol sym]
 	:	e=relational_expr 	{ $sym = $e.sym;}
 	( (EQUAL_TO | NOT_EQUAL_TO) relational_expr)*
 	;
 	
 relational_expr returns [Symbol sym]
 	:	e=expr 			{ $sym = $e.sym;}
 	( (LT|GT|LE|GE) expr)*
 	;
 	
 
 expr	returns [Symbol sym]
 	: e=term 			{$sym = $e.sym;}
 	( ( PLUS | MINUS )  term )* 	
 	;
 
 term	returns [Symbol sym]
 	: e=unary_expr 			{$sym = $e.sym;}
 	( ( MULT | DIV ) unary_expr )* 	
 	;
 
 unary_expr returns [Symbol sym]
 	:	e=postfix_expression	{$sym = $e.sym;}
 	|	BITWISE_NEGATE unary_expr
 	//	'-' unary_expr 
 	//	'!' unary_expr
 	;
 
 postfix_expression returns [Symbol sym]
 	:	e=factor ('.'ID)*		{$sym = $e.sym;}
 	;
 
 assignment_operator
 	:	ASSIGN
 	|	MULT_ASSIGN
 	|	DIV_ASSIGN
 	|	ADD_ASSIGN
 	|	MINUS_ASSIGN
 	;
 
 factor	returns [Symbol sym]
// 	: object_name
	: ID
 	| e=literal		{$sym = $e.sym;}
 	| '(' expression ')' 
 	;
 
 literal returns [Symbol sym]
 	:	e=object_values	{$sym = $e.sym;}
 	;

declr_stmt
	://	type_name object_name(COMMA object_name)* DELIMITER|object_name EQUAL object_values (COMMA object_values)* DELIMITER;
	type_name var=object_name
	{
		currentScope.defineSymbol($var.text, $type_name.text);
	}
	(COMMA next_var=object_name)* 
	{
		currentScope.defineSymbol($next_var.text, $type_name.text);
	}
	';'
	{
		currentScope.printSymbols();
	}
	;

     //                     object_values
        //      	:	//object_name|serv_group | topology | host_group | role | host | policy | ip_addr | int_value | char_value ;
object_values returns [Symbol sym]
	: char_value 
	| int_value	
	{
	/* Sambuddho :  This thing will be repeated for all types.
	   The types are not there so I am waiting for them to ready
	*/
		$sym = $int_value.sym;
	}
	| STRING
	| ip_addr
	| policy
	| host
	| role
	| host_group
	| topology
	| serv_group
	| route
	| interface
//	| object_name
	;
//	object_values: object_name|serv_group|topology|host_group|role|host|policy|ip_addr|STRING|int_value|char_value;
type_name
	:	TOPOLOGY_TYPE_NAME
	|	HOST_TYPE_NAME
	|                       	HOST_GROUP_TYPE_NAME
	|	SERVICE_GROUP_TYPE_NAME
	|	ROLE_GROUP_TYPE_NAME
	|	POLICY_TYPE_NAME
	|	ROUTE_TYPE_NAME
	|	INTERFACE_TYPE_NAME
	|	IP_ADDR_TYPE_NAME
	|	INT_TYPE_NAME
	|	CHAR_TYPE_NAME
	;	

role 	:	policy (COMMA policy)*
	;

policy /*returns [Symbol sym]*/ :	direction verdict proto ip_addr NETMASK ip_addr  (port)?
//	{
//	Policy pl ;
        /* Sambuddho : expecting an object of type
           policy here. The source port may be Null         */ 
                         
//	   pl = new Policy($dir.text,$verd.text, $protocol.text, $sport.text(),$src_ip.getText(),$src_netmask.getText(),$src_port);
	
	

   //      Symbol s = new Symbol("policy","policy_type_t",pl);
//	$sym = s;
	
//	}         
	| 	direction verdict  ip_addr NETMASK ip_addr icmp_cntrl_message
	;
  
topology:	(host_group) role
	|	(serv_group) role	
	;

/* adding integers and characters */
int_value returns [Symbol sym]
	:	e=NUMBER 
		{
			Integer v = Integer.parseInt($e.text);
			IntType temp = new IntType(v);
			Symbol s = new Symbol("literal", "int_type_t", temp);
			$sym = s;
		/* Sambuddho : Might not need this
	          already there in the generated code */
		// return $sym;
		}
//	|	object_name
	;

char_value /*returns [Symbol sym]*/
	:	CHAR 
//	{
	/* Sambuddho : Expecting a char type class here */
//	  CharType c = new CharType(e);
 //         Symbol s = new Symbol("literal",
//	             "char_type_t",c);
//	  $sym = s;
//	}
	; //requires object name here as well  for something like : char x = y; 


direction 	
	:	DIR_INBOUND
	| 	DIR_OUTBOUND
	;

verdict : 	VERD_ALLOW
	| 	VERD_DENY
	;

proto   :  PROTO_UDP
	| PROTO_TCP;

icmp_cntrl_message 	
	:	ICMP_MESSAGE_TYPE
	;

port	:	NUMBER;


object_name
	:	ID;

//OBJECT_NAME
//	:	ID 
//	;

interface_name 
:   IFNAME (ID) CARD_ID  NUMBER ('/' NUMBER)?
// 	:   'ifname' (OBJECT_NAME) 'card_id'  NUMBER ('/' NUMBER)?
	;
//ip_addr	: (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE); 
ip_addr/*	returns [Symbol sym]*/
:(NUMBER)DOT(NUMBER)DOT(NUMBER)DOT(NUMBER) 
     //	{
	/* Assuming there is a class 
           called IpAddrType with a constructor
	   accepting strings */
	   
  //       IpAddrType ip = new IpAddrType($s);
   //      Symbol s = new Symbol("String","ip_addr_t",ip);   
//	 $sym = s;
//	 }
	|object_name /* Sambuddho : We might need this . To consult with Chitra */
	;


//	| object_name
host /*returns [Symbol sym]*/ : IPADDR ip_addr NETMASK ip_addr // Added by Sambuddho : April 16
//	{
	/* Sambuddho : Expecting a host_type_t here*/

//	HostType ht = new HostType($ip.text(),$netmask.text());
//	Symbols s = new Symbol ("host_type","host_type_t",ht); // Sambuddho : Check the type 
//
//	$sym = s;
//	}
	|object_name /* Sambuddho : To talk with Chitra about this . We might need this*/
	;

/*host_set
	:host (',' host)*
	;*/

interface : interface_name ip_addr NETMASK ip_addr ( DNS  '{' ip_addr (','  ip_addr)* '}' )?  ( GATEWAY '{' ip_addr (','  ip_addr)* '}')?  ;
route	: HOST ip_addr GW ip_addr
	| NET ip_addr NETMASK ip_addr GW  ip_addr
	;


host_group
	: HOST_GROUP '{' host (',' host)* '}'  
 	;
 	  
serv_descr 
	: ip_addr (NETMASK ip_addr)? serv_listen_port;

serv_group
	: SERV_SET '{' serv_descr (',' serv_descr)* '}'  
//	| object_name	
	;

serv_listen_port 
	:	(NUMBER);
host_name
	: ID;	

//DNS	:'dns';

//GATEWAY	:'gw';
//NM	:'netmask';
ID	:	LETTER (LETTER|DIGIT)* ;
                           
fragment LETTER	
	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;

DOT 	:	'.';
//CHARS	:	(('a'..'z')|('A'..'Z'));
	
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|	'REDIRECT MESSAGE'
	|	'TIME EXCEEDED'
	|	'ADDRESS MASK REQUEST'
	|	'ADDRESS MASK REPLY'
	;	
	
COMMA	: ',';	
		
CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';

fragment EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

NUMBER	: (DIGIT)+ ;

fragment DIGIT
	: '0'..'9' ;	

//DELIMITER
//	:	 ';';

LINE_COMMENT 
	:	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

EQUAL	:	'=' ;
	
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+  {$channel=HIDDEN;}
	;
	
	PROG_BEGIN : 'prog';
 	PROG_END : 'endprog';
 	SEMICOLON : ';';
 	
 	IF : 'if';
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
 	UNDO : 'undo';
 	TOPOLOGY : 'topology';
 	POLICY :'policy';
 	ROLE :'role';
	IFCONFIG : 'ifconfig';
	
	
