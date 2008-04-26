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
	import java.io.*;
	import java.util.Vector;
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
 	| 'apply' 'policy' var=object_name
 	{
 	  Policy p = (Policy) currentScope.lookup($var.text);
 	 if(p!=null)
 	 {
 	  String command = "/sbin/iptables";
 	 String verd = null;
 	 if(p.verdict.equals("allow"))
 	  {
 	    verd = "ACCEPT";
 	    }
 	  if(p.verdict.equals(" deny "))
 	  {
 	    verd = "DROP";
 	    }  
 	   if( verd == null)
 	      { 
 	      System.out.println("verdict is null");
 	      }
 	 String arg = "  -I INPUT -p "+p.protocol+" -s " + p.ipAddress.getString() +"  --source-port " +p.sourcePort+" -j " +verd;
 	  System.out.println(command+arg);
 	  
 	 }
 	 else  { System.out.println(" p is null");}
 	}
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
		//	currentScope.printSymbols();
	 	}
 		assignment_expr //(',' assignment_expr)*
 	
 	| 	e=conditional_expr
 		{
 			//Put these values in assignment map
 			//System.out.println("Cond expr: " + $e.sym);
 			//Policy p;
 			Set entries = map.entrySet();
			Iterator iter = entries.iterator();
			//p = (Policy)( $e.sym );
			//System.out.println($e.sym.getString());
			//System.out.println("Symbol Val: " + $e.sym.pol[0]);
			while(iter.hasNext() && $e.sym != null)
			{
				Map.Entry entry = (Map.Entry)iter.next();
				String key = (String)entry.getKey();
				System.out.println(" going to search for symbol with name : "+key);
				Symbol s = new Symbol(key, $e.sym.getType(), $e.sym.lookupValue());
				//System.out.println(s.getString());
				//-- COMMENT: Somehow this statement is not reflecting a change in the symbol value
				if (currentScope.setSymbolValue(key, s) == -1)	
				    {
				     System.out.println(" problem setting symbol : ");
				    }
				
				System.out.println("Symbol table:  " + s.getName()+" "+ s.getType() + " " + s.getString());
				
				
				//Interface t = (Interface)currentScope.lookup("i");
			// 	Interface u = (Interface)currentScope.lookup("j");
			 	//Interface v = (Interface)currentScope.lookup("k");
			 	
			 	//if( t == null){
				// System.out.println("NULL");}
				 
			//	 if( u == null){
			//	 System.out.println("NULL");}
				 
				// if( v == null){
				// System.out.println("NULL");}
				
				//if(t != null){ 
			//	System.out.println(" "+t.getString());
			//	}
			//	if(u != null){ 
			//	System.out.println(" "+u.getString());
			//	}
			//	if(v != null){ 
			//	System.out.println(" "+v.getString());
			//	}
				//System.out.println(" current symbol table");				
			//	currentScope.printSymbols();
			}
		//	currentScope.printSymbols();
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
 	( ('<'|'>'|'<='|'>=') expr)*
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
	{int count_com = 0;}
	type_name var_name=object_name
	{
		System.out.println(" type : " + $type_name.text +" var : "+ $var_name.text);
		currentScope.defineSymbol($var_name.text, $type_name.text);
	}
	(COMMA {count_com++;} next_var=object_name)* 
	{
	//	System.out.println(" commas : "+ count_com);
		
		if(count_com > 0)			
              		 currentScope.defineSymbol($next_var.text, $type_name.text);
	} 
	';' 
		;

     //                     object_values
        //      	:	//object_name|serv_group | topology | host_group | role | host | policy | ip_addr | int_value | char_value ;

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
	
object_values returns [Symbol sym]
	: char_value
	| int_value	
	{ 
		$sym = $int_value.sym;
	}
	| STRING
	| ip_addr
	{
	  $sym = $ip_addr.sym;
}
	| policy   { $sym = $policy.sym;}
	| host   {
	$sym = $host.sym ; 
	}
	| role /* Similarly with other types */
	| host_group { $sym = $host_group.sym;} 
	| topology
	| serv_group
	| interf { $sym = $interf.sym;}
	| route {$sym = $route.sym;}
	//	| object_name
	;
//	object_values: object_name|serv_group|topology|host_group|role|host|policy|ip_addr|STRING|int_value|char_value;


role  returns [Symbol sym]: 
	{ 
	      Vector <Policy> policies;
	      policies = new Vector <Policy>() ;	     
	 }
	'role' '{' p_i=policy {policies.add((Policy)p_i.lookupValue());} (COMMA p_j=policy {policies.add((Policy)p_j.lookupValue());} )* '}'
	{
	Role role = new Role (policies);
	Symbol s = new Symbol ("role_group_type_t","role_group_type_t",role);
	$sym = s;  		
	}
	
	;
//policy  :	direction verdict proto (port)?  ;//ip_addr 'netmask' src_netmask=ip_addr  sport=(port)?;

policy returns [Symbol sym]	: 
  	{int src_port = 0;
  	 boolean ip_object_used , netmask_object_used ;
  	 ip_object_used = false;
  	 netmask_object_used = false;
  	}
  	dir=direction verd=verdict protocol=proto (src_ip=ip_addr|(ip_obj=object_name {ip_object_used = true;}))
  	 'netmask' (netmask_ip=ip_addr|(netmask_ip_obj = object_name {netmask_object_used = true;})) (sport=port  {src_port++;} )?  //ip_addr 'netmask' src_netmask=ip_addr  sport=(port)?
{
	Ipaddress sip =null, snetmask=null;
	if(ip_object_used == true && netmask_object_used ==false)
	{
	  Symbol s = currentScope.getSymbol($ip_obj.text);
	   sip = (Ipaddress) s.lookupValue();
	  }
	else if (ip_object_used == false  && netmask_object_used ==true)
	{
      	  Symbol s = currentScope.getSymbol($netmask_ip_obj.text);
	   snetmask = (Ipaddress) s.lookupValue();
	}
	else if(ip_object_used ==true && netmask_object_used ==true)
	{
	  Symbol s_ip =  currentScope.getSymbol($ip_obj.text);
	   sip = (Ipaddress) s_ip.lookupValue();
  	  Symbol s_nmask = currentScope.getSymbol($netmask_ip_obj.text);
	   snetmask = (Ipaddress) s_nmask.lookupValue();
	}
	else{
	sip = new Ipaddress($src_ip.text);
	snetmask = new Ipaddress($netmask_ip.text);
	}


	if(sip != null)
	 {
	   System.out.println( " source ip for policy :  "+ sip.getString());
	   }
	 if(snetmask != null)
	 {
	  System.out.println(" source netmask for policy :"+snetmask.getString());
	 }  


	Policy pl;
                          if(src_port>0){
	 pl = new Policy($dir.text,$verd.text, $protocol.text, sip.getString(),snetmask.getString(),$sport.text);
	}
	 else{
 	  pl = new Policy($dir.text,$verd.text, $protocol.text, sip.getString(),snetmask.getString(),"0");		
 	  }
 	  
 	   	  
                          Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
	$sym = s;
//	currentScope.printSymbols();
}
	| 
	
	{int src_port = 0;
  	 boolean ip_object_used , netmask_object_used ;
  	 ip_object_used = false;
  	 netmask_object_used = false;
  	}
		
	dir=direction verd=verdict icmp_mesg=icmp_cntrl_message  (src_ip=ip_addr | (ip_obj=object_name {ip_object_used = true;})) 
	    'netmask' (src_netmask=ip_addr | (netmask_ip_obj  = object_name {netmask_object_used = true;}))
	{
	
//	Policy pl;

	Ipaddress sip =null , snetmask=null;
	if(ip_object_used == true && netmask_object_used ==false)
	{
	  Symbol s = currentScope.getSymbol($ip_obj.text);
	   sip = (Ipaddress) s.lookupValue();
	  }
	else if (ip_object_used == false  && netmask_object_used ==true)
	{
      	  Symbol s = currentScope.getSymbol($netmask_ip_obj.text);
	   snetmask = (Ipaddress) s.lookupValue();
	}
	else if(ip_object_used ==true && netmask_object_used ==true)
	{
	  Symbol s_ip =  currentScope.getSymbol($ip_obj.text);
	   sip = (Ipaddress) s_ip.lookupValue();
  	  Symbol s_nmask = currentScope.getSymbol($netmask_ip_obj.text);
	   snetmask = (Ipaddress) s_nmask.lookupValue();
	}
	else{
	sip = new Ipaddress($src_ip.text);
	snetmask = new Ipaddress($netmask_ip.text);
	}

	if(sip != null)
	 {
	   System.out.println( " source ip for policy :  "+ sip.getString());
	   }
	 if(snetmask != null)
	 {
	  System.out.println(" source netmask for policy :"+snetmask.getString());
	 }  
	   
	Policy p2 = new Policy($dir.text,$verd.text, $icmp_mesg.text, sip.getString(),snetmask.getString());
	
                          Symbol s = new Symbol("policy_icmp","policy_type_t",p2);
	$sym = s;
//	currentScope.printSymbols();
	}
/*	|
	policy_obj_name=object_name
	{
	 Policy p3;
	 Symbol s = currentScope.getSymbol($policy_obj_name.text);
                            if (s == null)
                             {
                               System.out.println (" policy: symbol not found ");
                              }
                             else
                             {
                                p3 = (Policy)(s.lookupValue()).clone();
                                Symbol s = new Symbol(s.getName(),s.getType(),p3);
                                } 
	  $sym = s;
	} */
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
		//	return $sym;
		}
/*	|int_obj_name=object_name
	{
	IntType i;
	 Symbol s = currentScope.getSymbol($int_obj_name.text);
                            if (s == null)
                             {
                               System.out.println (" int_value : symbol not found ");
                              }
                             else
                             {
                                i = (IntType)(s.lookupValue()).clone();
                                Symbol s = new Symbol(s.getName(),s.getType(),i);
                                } 
	  $sym = s;
	
	}*/
	
	;

char_value  /*returns [Symbol sym]*/
	:	/*e=*/ CHAR
//	{
		// Nipun : required class
//		CharType c = new CharType ($e.text);
//		Symbol s = new Symbol("character", "char_type_t", c);
//		$sym = s;
//		return $sym;
	
//	} 
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


object_name returns [String obj_name]
	:  ID	
	{ $obj_name = new String ($ID.text);
	   
	}
	;

//OBJECT_NAME
//	:	ID 
//	;

//interface_name
//:   'ifname' (ID) 'card_id'  NUMBER ('/' NUMBER)?  ;
// 	:   'ifname' (OBJECT_NAME) 'card_id'  NUMBER ('/' NUMBER)?
	
//ip_addr	: (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE) '.' (IPADDR_BYTE); 
/*ip_addr   returns [Symbol sym] :  ip_string=((NUMBER)DOT(NUMBER)DOT(NUMBER)DOT(NUMBER) )
{
			// Nipun : required class
		IpAddr ip = new IpAddr ($ip_string.text); //usure about the text error
		Symbol s = new Symbol("ip_addr_string", "ip_addr_t", ip);
		$sym = s;
		return $sym;
	
	}
	
	;
*/

ip_addr    returns [Symbol sym]:  (a=NUMBER)DOT(b=NUMBER)DOT(c=NUMBER)DOT(d=NUMBER) 
	{
			
		Ipaddress ip = new Ipaddress($a.text+"."+$b.text+"."+$c.text+"."+$d.text);
	//	System.out.println (" ip address being sent : "+ip.getString());
		Symbol s = new Symbol("ip_addr_string", "ipaddr_t", ip);
		$sym = s;
//		return $sym;
	
	}
	
	;




nmask	: 'netmask' ip_addr;//NM LETTER+;

/*host	returns [Symbol sym]: 'ip_addr' ip_string=ip_addr 'netmask' netmask_string=ip_addr 
{

	Host h = new Host ($ip_string.text,$netmask_string.text); //usure about the text error
	Symbol s = new Symbol("host_descr_string", "host_type_t", h);
	$sym = s;
	return $sym;

}*/


host	returns [Symbol sym]:
	{boolean ip_object_used =false, netmask_object_used = false;}	
	 'ip_addr' (ip_string=ip_addr|(ip_obj=object_name {ip_object_used=true; System.out.println (" found object name :"+$ip_obj.text);} )) 'netmask' (netmask_string=ip_addr | 
	                   (netmask_ip_obj = object_name {netmask_object_used = true;}))
{
	Host h;
	if(ip_object_used == true && netmask_object_used ==false)
	{
	  Symbol s = currentScope.getSymbol($ip_obj.text);
	  Ipaddress ip = (Ipaddress) s.lookupValue();
	  System.out.println(" >> "+ip.getString());
	  h = new Host	( ip.getString(),$netmask_string.text);
	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
	 $sym = s_ret;
	}
	else if (ip_object_used == false  && netmask_object_used ==true)
	{
      	  Symbol s = currentScope.getSymbol($netmask_ip_obj.text);
	  Ipaddress ip = (Ipaddress) s.lookupValue();
	  h = new Host	( $ip_string.text,ip.getString());
	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
	  $sym = s_ret;
	}
	else if(ip_object_used ==true && netmask_object_used ==true)
	{
	  Symbol s_ip =  currentScope.getSymbol($ip_obj.text);
	  Ipaddress ip = (Ipaddress) s_ip.lookupValue();
	 
  	  Symbol s_nmask = currentScope.getSymbol($netmask_ip_obj.text);
	  Ipaddress nmask = (Ipaddress) s_nmask.lookupValue();
	 
	  h = new Host	( ip.getString(),nmask.getString());
	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
	 $sym = s_ret;
	
	}
	else{
	h = new Host ($ip_string.text,$netmask_string.text); //usure about the text error
	Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
	$sym = s_ret;
	}
//	return $sym;

}


//	| object_name
	;

//host_set
//	:host (',' host)*
//	;

dns_set	: ip_addr (','  ip_addr)*;

gateway	: ip_addr (',' ip_addr)*;



host_group returns [Symbol sym]
	: 
	{
	Vector <Host> hosts;
	hosts = new Vector <Host> ();
	}
	'host_group'  '{' i=host  {hosts.add((Host)i.lookupValue()); }  (',' j=host {hosts.add((Host)j.lookupValue());} )* '}'         //   ( 'DNS'  '{' dns_set '}' )?  ( 'GATEWAY' '{' gateway '}')? 
	{
	Hostgroup hgroup = new Hostgroup (hosts);
	Symbol s = new Symbol ("host_group_type_t","host_group_type_t",hgroup);
	$sym = s;  		
	}
	;

interf returns [Symbol sym]
	: { 
	     Vector <Ipaddress> dns_ip;
	       dns_ip = new Vector <Ipaddress>() ;	     
	         }
	 'ifname' (interface_name=ID) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr 
	 'dns'  '{' i=ip_addr {dns_ip.add(new Ipaddress($i.text));}  ( ','  j=ip_addr{dns_ip.add(new Ipaddress($j.text));} )* '}'   
	  'gw'  gw_ip=ip_addr   
	{
	Interface iface = new Interface ($interface_name.text,$interface_ip.text,$interface_netmask.text,$gw_ip.text, dns_ip);
	Symbol s = new Symbol("interface_descriptor", "interface_type_t", iface);
	$sym = s;  
	} ;
  
route returns [Symbol sym]	: 'host' dst=ip_addr 'gw' gw=ip_addr
	{
	  Route rh = new Route ($dst.text, $gw.text);
	  Symbol s = new Symbol("host_route_string", "route_type_t", rh);
	  $sym = s;
	  
	}	
		
	| 'net' dst=ip_addr 'netmask' netmask_ip=ip_addr 'gw' gw= ip_addr
	{
	 Route rn = new Route ($dst.text,$netmask_ip.text,$gw.text);
   	  Symbol s = new Symbol("net_route_string", "route_type_t", rn);
	  $sym = s;
	  
	}
	;


//route : 'host' ip_addr 'gw' ip_addr
//| 'net' ip_addr 'netmask' ip_addr 'gw' ip_addr
//;




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
