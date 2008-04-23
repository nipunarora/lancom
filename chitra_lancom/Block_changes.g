grammar Block_changes;

optiona{
output=AST;
ASTLabelType=CommonTree;
}

tokens {
 	PLUS 	= '+' ;
 	MINUS	= '-' ;
 	MULT	= '*' ;
 	DIV	= '/' ;
 	NUMBER ;
 	COMMA;
 	NMASK;
 	IFNAME;
 	NEWLINE;
 	CARRIAGE_RETURN;
 	WHILE;
 	IF;
 	ELSE;
 	ENDIF;
 	ENDWHILE;
 	ECHO;
 	LEFT_PAREN;
 	RIGHT_PAREN;
 	EQUAL;
 	STAR_EQUAL;
 	DIV_EQUAL;
 	PLUS_EQUAL;
 	MINUS_EQUAL;
 	DELIM;
 	PROG_BEGIN_MARKER;
 	PROG_END_MARKER;
 	QUES_MARK;
 	COLON;
 	LOG_AND;
 	LOG_OR;
 	BITWISE_AND;
 	BITWISE_OR;
 	EQUAL_TO;
 	NOT_EQUAL_TO;
 	LT;
 	GT;
 	LE;
 	GE;
 	BITWISE_INVERT;
 	TOPOLOGY_TYPE;
 	HOST_TYPE;
	HOST_GROUP_TYPE;
	SERV_GROUP_TYPE;
	ROLE_TYPE;
	POLICY_TYPE;
	IPADDR_TYPE;
	INT_TYPE_T;
	CHAR_TYPE_T;
	DIR_IN;
	DIR_OUT;
	VERD_ALLOW;
	VERD_DENY;
	PROTO_TCP;
	PROTO_UDP;
	IFNAME;
	CARD_ID;
	FWD_SLASH;
	DOT;
	LEFT_BRACE;
	RIGHT_BRACE;
	HGROUP;
	DNS;
	GW;
	SERV_SET;
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
        	BlockLexer lex = new Block_changesLexer(new ANTLRFileStream(args[0]));
	       	CommonTokenStream tokens = new CommonTokenStream(lex);

        	Block_chagesParser parser = new Block_changesParser(tokens);

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
	:	PROG_BEGIN_MARKER statement_list+ PROG_END_MARKER
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
 	:	DELIM
 	|	expression DELIM
 	;
 	
 condition_statement
 	:	IF LEFT_PAREN equality_expr RIGHT_PAREN statement_list (ELSE statement_list)? ENDIF
 	;
 	
 iteration_statement
 	:	WHILE LEFT_PAREN equality_expr RIGHT_PAREN statement_list ENDWHILE
 	;
 	
 print_statement
 	:	ECHO STRING  {System.out.println($STRING);} DELIM
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
 	( QUES_MARK expression COLON conditional_expr)?
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
 	|	BITWISE_INVERT unary_expr
 	//|	'-' unary_expr 
 	//|	'!' unary_expr
 	;
 
 postfix_expression returns [Symbol sym]
 	:	e=factor ('.'ID)*		{$sym = $e.sym;}
 	;
 
 assignment_operator
 	:	EQUAL
 	|	STAR_EQUAL
 	|	DIV_EQUAL
 	|	PLUS_EQUAL
 	|	MINUS_EQUAL
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
		$sym = $int_value.sym;
	}
	| STRING
	| ip_addr
//	| policy
	| host
	| role
	| host_group
	| topology
	| serv_group
//	| object_name
	;
//	object_values: object_name|serv_group|topology|host_group|role|host|policy|ip_addr|STRING|int_value|char_value;
type_name
	:	TOPOLOGY_TYPE
	|	HOST_TYPE
	|	HOST_GROUP_TYPE
	|	SERV_GROUP_TYPE
	|	ROLE_TYPE
	|	POLICY_TYPE
	|	IPADDR_TYPE
	|	INT_TYPE_T
	|	CHAR_TYPE_T
	;	

role 	:	policy (COMMA policy)*
	;

policy 	:	direction verdict proto port port 
	| 	direction verdict proto icmp_cntrl_message
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

char_value
	:	CHAR 
	; //requires object name here as well  for something like : char x = y; 


direction 	
	:	DIR_IN
	| 	DIR_OUT
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
:   IFNAME (ID) CARD_ID  NUMBER (FWD_SLASH NUMBER)?
// 	:   'ifname' (OBJECT_NAME) 'card_id'  NUMBER ('/' NUMBER)?
	;
//ip_addr	: (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE); 
ip_addr	:(NUMBER)DOT(NUMBER)DOT(NUMBER)DOT(NUMBER) 
	;

nmask	: NMASK ip_addr;//NM LETTER+;

host	: interface_name ip_addr NMASK ip_addr 
//	| object_name
	;

host_set
	:host (COMMA host)*
	;

dns_set	: ip_addr (COMMA  ip_addr)*;

gateway	: ip_addr (COMMA ip_addr)*;

host_group
	: HGROUP  LEFT_BRACE host_set RIGHT_BRACE  ( DNS  LEFT dns_set RIGHT_BRACE )?  ( GW '{' gateway '}')? 
 	;
 	  
serv_descr 
	: ip_addr (nmask)? serv_listen_port;

serv_group
	: SERV_SET LEFT_BRACE serv_descr (COMMA serv_descr)* RIGHT_BRACE  
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
