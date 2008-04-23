grammar Block;
options{
output=AST;
}

tokens {
 	PLUS 	= '+' ;
 	MINUS	= '-' ;
 	MULT	= '*' ;
 	DIV	= '/' ;
 	NUMBER ;
 	NM;
 	PROG_BEGIN = 'prog_begin';
 	PROG_END = 'prog_end';
  }

@members {
    public static void main(String[] args) throws Exception {
        BlockLexer lex = new BlockLexer(new ANTLRFileStream(args[0]));
       	CommonTokenStream tokens = new CommonTokenStream(lex);

        BlockParser parser = new BlockParser(tokens);

        try {
            parser.prog();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}
prog	
	:	'prog' statement_list+ 'endprog' -> ^('prog_begin' statement_list+ 'prog_end') ;
 	
 statement_list
 	:	statement
 	| declr_stmt
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
 	;
 	
 condition_statement
 	:	'if' '(' equality_expr ')' statement_list ('else' statement_list)? 'endif'
 	;
 	
 iteration_statement
 	:	'while' '(' equality_expr ')' statement_list 'endwhile'
 	;
 	
 print_statement
 	:	'echo' STRING ';'
 	;
 	
 expression
 	:	assignment_expr (',' assignment_expr)*
 	;
 	
 assignment_expr
 	: 
 //	  object_name assignment_operator conditional_expr ( ',' conditional_expr)*
 //	 |object_name assignment_operator object_values ( ',' object_values)*
	 |object_name assignment_operator assignment_expr (',' assignment_expr)*
//	 |object_name assignment_operator object_name (',' object_name)*
 	| 	conditional_expr
 	;
 
 
 		
 conditional_expr
 	:	logicalOR_expr( '?' expression ':' conditional_expr)?
 	;
 	
 logicalOR_expr
 	:	logicalAND_expr ('||' logicalAND_expr)*
 	;
 
 logicalAND_expr
 	:	bitwiseOR_expr ('&&' bitwiseOR_expr)*
 	;
 	
 bitwiseOR_expr
 	:	bitwiseAND_expr ('|' bitwiseAND_expr)*
 	;
 
 bitwiseAND_expr
 	:	equality_expr ('&' equality_expr)*
 	;
 	
 equality_expr
 	:	relational_expr ( ('==' | '!=') relational_expr)*
 	;
 	
 relational_expr 
 	:	expr ( ('<'|'>'|'<='|'>=') expr)*
 	;
 	
 
 expr	: term ( ( PLUS | MINUS )  term )* ;
 
 term	: unary_expr ( ( MULT | DIV ) unary_expr )* ;
 
 unary_expr
 	:	postfix_expression
 	|	'~' unary_expr
 	//|	'-' unary_expr 
 	//|	'!' unary_expr
 	;
 
 postfix_expression
 	:	factor ('.'ID)*
 	;
 
 assignment_operator
 	:	'='
 	|	'*='
 	|	'/='
 	|	'+='
 	|	'-='
 	;
 
 factor	: object_name
 	| literal	
 	//| '(' expression ')' 
 	;
 
 literal:	object_values
 	;

declr_stmt
	://	type_name object_name(COMMA object_name)* DELIMITER|object_name EQUAL object_values (COMMA object_values)* DELIMITER;
type_name object_name(COMMA object_name)* ';';

     //                     object_values
        //      	:	//object_name|serv_group | topology | host_group | role | host | policy | ip_addr | int_value | char_value ;
	object_values: char_value|int_value|STRING|ip_addr|policy|host|role|host_group|topology|serv_group|object_name;
//	object_values: object_name|serv_group|topology|host_group|role|host|policy|ip_addr|STRING|int_value|char_value;
type_name
	:	'topology_type_t'|'host_type_t'|'host_group_type_t'|'serv_group_type_t'|'role_type_t'|'policy_type_t'|'ipaddr_t'|'int_type_t'|'char_type_t';	
role 	:	policy (COMMA policy)*;
policy 	:	direction verdict proto port port
| direction verdict proto icmp_cntrl_message;
topology:	(host_group)+ role
	|(serv_group)+ role	
	;

/* adding integers and characters */
int_value 
	:	NUMBER | object_name;
char_value
	:	CHAR ; //requires object name here as well  for something like : char x = y; 


direction 	:	'inbound' | 'outbound';
verdict : 'allow' | 'deny';
proto   :  'udp'| 'tcp';
icmp_cntrl_message 	:	ICMP_MESSAGE_TYPE;
port	:	NUMBER;
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;};
EQUAL	:	'=';
object_name
	:	OBJECT_NAME;
	OBJECT_NAME:ID ;
	ID	:	LETTER (LETTER|DIGIT)* ;
                           
 fragment LETTER	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;





interface_name :   'ifname' (OBJECT_NAME) 'card_id'  NUMBER ('/' NUMBER)?;
//ip_addr	: (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE); 
ip_addr	:(NUMBER)DOT(NUMBER)DOT(NUMBER)DOT(NUMBER) ;

nmask	: 'netmask' ip_addr;//NM LETTER+;
host	: interface_name ip_addr 'netmask' ip_addr | object_name;
host_set	:host (',' host)*
	;

dns_set	: ip_addr (','  ip_addr)*;
gateway	: ip_addr (',' ip_addr)*;
host_group	: 'host_group'  '{' host_set '}'  ( 'DNS'  '{' dns_set '}' )?  ( 'GATEWAY' '{' gateway '}')? 
    	 ;
 	  
serv_descr : ip_addr (nmask)? serv_listen_port;
serv_group
	: 'service_set' '{' serv_descr (',' serv_descr)* '}'  | object_name	
	;
serv_listen_port 
	:	(NUMBER);

host_name
	: ID;	
DNS	:'dns';
GATEWAY	:'gw';
//NM	:'netmask';
DOT 	:	'.';
CHARS	:	(('a'..'z')|('A'..'Z'));
	
ICMP_MESSAGE_TYPE
	:	'ECHO REPLY'
	|'REDIRECT MESSAGE'
	|'TIME EXCEEDED'
	|'ADDRESS MASK REQUEST'
	|'ADDRESS MASK REPLY';	
	COMMA: ',';	
		
	CHAR	:	'\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

 
 STRING	:	'"' ( EscapeSequence | ~('\\'|'"') )* '"';
fragment
 EscapeSequence
 	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
 	;

NUMBER: (DIGIT)+ ;

 fragment DIGIT: '0'..'9' ;	

DELIMITER
	:	 ';';
	 LINE_COMMENT :	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
	 IPADDR_BYTE :  ('0'..'9')|(('0'..'9')('0'..'9'))|(('0'..'1')('0'..'9')('0'..'9'))|(('2') ('0'..'4')('0'..'9'))|(('2')('5')('0'..'5'));
