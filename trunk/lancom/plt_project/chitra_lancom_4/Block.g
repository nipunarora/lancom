grammar Block;

tokens {
 	PLUS 	= '+' ;
 	MINUS	= '-' ;
 	MULT	= '*' ;
 	DIV	= '/' ;
 	NUMBER ;
 	NM;
 	
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
	:	'prog' statement_list+ 'endprog'
 	;
 	
 statement_list
 	:	statement
 	| 	declr_stmt
 	;
 
 statement
 	:	condition_statement
 	|	iteration_statement
 	|	statement_expr
 	|	print_statement
 	;
 	
 statement_expr
 	:	';'
 	|	expression ';'
 	|                        config_statement ';'
 	;
 	
 config_statement 
 	: 
 	route_oper object_name
 	|route_oper route
 	|'ifconfig' object_name
 	|'ifconfig' interf
	|'apply' 'topology' object_name
 	| 'apply' 'topology' topology
 	| 'undo' 'topology' object_name 
 	| 'undo' 'topology' topology
 	|  set_oper 'role' (object_name|role) (object_name|policy)
 	|  'apply' 'role' object_name
 	|  'apply' 'role' role
 	| 'undo' 'role' object_name
 	| 'undo' 'role' role
 	| 'apply' 'policy' object_name
 	| 'apply' 'policy' policy
 	| 'undo' 'policy' object_name
 	| 'undo' 'policy' policy
 	| set_oper 'host_group' (object_name| host_group) (object_name|host) 
// 	| set_oper 'serv_group' (object_name|serv_group) serv_descr 
	|config_display 
 	;
 	
 route_oper
 	:	
	|'route' 'add'
 	|'route' 'delete'
 	;

set_oper 
	:	
	'add' 'to'
	| 'delete' 'from'
	;
 	
 config_display 
 	:
 	 'route' 'show' 'numeric'
 	|'route' 'show' 
	| 'fw' 'show' 'numeric'
	|'fw' 'show'
	;	
 	
 	
 	
 condition_statement
 	:	'if' '(' equality_expr ')' statement_list ('else' statement_list)? 'endif'
 	;
 	
 iteration_statement
 	:	'while' '(' equality_expr ')' statement_list 'endwhile'
 	;
 	
 print_statement
 	:	'echo' STRING  {System.out.println($STRING);}';'
 	;
 	
 expression
 	:	assignment_expr //(',' assignment_expr)*
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
 	( '?' expression ':' conditional_expr)?
 	;
 	
 logicalOR_expr returns [Symbol sym]
 	:	e=logicalAND_expr 	{ $sym = $e.sym;}
 	('||' logicalAND_expr)*
 	;
 
 logicalAND_expr returns [Symbol sym]
 	:	e=bitwiseOR_expr 	{ $sym = $e.sym;}
 	('&&' bitwiseOR_expr)*
 	;
 	
 bitwiseOR_expr returns [Symbol sym]
 	:	e=bitwiseAND_expr 	{ $sym = $e.sym;}
 	('|' bitwiseAND_expr)*
 	;
 
 bitwiseAND_expr returns [Symbol sym]
 	:	e=equality_expr 	{ $sym = $e.sym;}
 	('&' equality_expr)*	
 	;
 	
 equality_expr returns [Symbol sym]
 	:	e=relational_expr 	{ $sym = $e.sym;}
 	( ('==' | '!=') relational_expr)*
 	;
 	
 relational_expr returns [Symbol sym]
 	:	e=expr 			{ $sym = $e.sym;}
 	( ('<' | '>' | '<=' | '>=') expr)*
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
 	|	'~' unary_expr
 	//|	'-' unary_expr 
 	//|	'!' unary_expr
 	;
 
 postfix_expression returns [Symbol sym]
 	:	e=factor ('.'ID)*		{$sym = $e.sym;}
 	;
 
 assignment_operator
 	:	'='
 	|	'*='
 	|	'/='
 	|	'+='
 	|	'-='
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
//	type_name object_name ';' ;
	type_name var=object_name
	{
	System.out.println(" type : "+$type_name.text+"obj:"+$var.text);
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
		$sym = $int_value.sym;
	}
	| STRING
	| ip_addr
	| policy
	| host /* how do I return back host type */
	| role /* Similarly with other types */
	| host_group
	| topology
	| serv_group
	| interf
	| route
	//	| object_name
	;
//	object_values: object_name|serv_group|topology|host_group|role|host|policy|ip_addr|STRING|int_value|char_value;
type_name
	:	'topology_type_t'
	|	'host_type_t'
	|	'host_group_type_t'
	|	'serv_group_type_t'
	|	'role_type_t'
	|	'policy_type_t'
	|	'route_type_t'
	|	'interface_type_t'
	|	'ipaddr_t'
	|	'int_type_t'
	|	'char_type_t'
	;	

role  : 'role' '{' policy (COMMA policy)* '}'
	;

policy 	:	direction verdict proto ip_addr 'netmask' ip_addr  (port)?
	| 	direction verdict icmp_cntrl_message ip_addr 'netmask' ip_addr  (port)?
	;

topology:	(host_group)+ role
	|	(serv_group)+ role	
	;

/* adding integers and characters */
int_value returns [Symbol sym]
	:	e=NUMBER 
		{
			Integer v = Integer.parseInt($e.text);
			IntType temp = new IntType(v);
			Symbol s = new Symbol("literal", "int_type_t", temp);
			$sym = s;
			return $sym;
		}
//	|	object_name
	;

char_value  	:	CHAR
	 
	; //requires object name here as well  for something like : char x = y; 


direction 	
	:	'inbound' 
	| 	'outbound'
	;

verdict : 	'allow' 
	| 	'deny'
	;

proto   :  'udp'
	| 'tcp' ;

icmp_cntrl_message 	
	:	ICMP_MESSAGE_TYPE
	;

port	:	NUMBER;


object_name
	:	ID;

//OBJECT_NAME
//	:	ID 
//	;

//interface
//:   'ifname' (ID) 'card_id'  NUMBER ('/' NUMBER)?  ip_addr 'netmask' ip_addr;
// 	:   'ifname' (OBJECT_NAME) 'card_id'  NUMBER ('/' NUMBER)?
	
//ip_addr	: (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE); 

interface_name
:   'ifname' (ID) 'card_id'  NUMBER ('/' NUMBER)? ;



ip_addr   :  (NUMBER)DOT(NUMBER)DOT(NUMBER)DOT(NUMBER) ;

nmask	: 'netmask' ip_addr;//NM LETTER+;

host	: 'ip_addr' ip_addr 'netmask' ip_addr 

//	| object_name
	;

//host_set
//	:host (',' host)*
//	;

dns_set	: ip_addr (','  ip_addr)*;

gateway	: ip_addr (',' ip_addr)*;



host_group
	: 'host_group'  '{' host (',' host)* '}'         //   ( 'DNS'  '{' dns_set '}' )?  ( 'GATEWAY' '{' gateway '}')? 
	;

interf 
	:   interface_name ip_addr 'netmask' ip_addr ;//( 'dns'  '{' ip_addr (','  ip_addr)* '}' )?  ( 'gw' '{' ip_addr (','  ip_addr)* '}')?  ;

  
route : 'host' ip_addr 'gw' ip_addr
| 'net' ip_addr 'netmask' ip_addr 'gw' ip_addr
	
	;
//Sambuddho : This will be added later : May require a special type		  
//serv_descr 
//	: ip_addr (nmask)? serv_listen_port;

serv_group
	: 'service_set' '{' ip_addr ('netmask' ip_addr)? serv_listen_port  (',' ip_addr (nmask)? serv_listen_port)*  '}'  
//	{
	// Sambuddho : Not yet decided
//	}
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

EQUAL	:	'=';
	
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;}
	;


//IPADDR_BYTE 
//	:  ('0'..'9')|(('0'..'9')('0'..'9'))|(('0'..'1')('0'..'9')('0'..'9'))|(('2') ('0'..'4')('0'..'9'))|(('2')('5')('0'..'5'));
