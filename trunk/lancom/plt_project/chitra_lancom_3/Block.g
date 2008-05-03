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
	import java.util.zip.DataFormatException;

}

@members 
{      
	Scope globalScope = new Scope(null);
	Scope currentScope = globalScope;
	
	Map<String, Assignment> map = new HashMap<String, Assignment>(); 
	//OStype osType= new OStype("linux");
	
//	public static char OS ;
	
    	public static void main(String[] args) throws Exception 
    	{
    	OStype.i = 1;
    	System.out.println(" i:" + OStype.i);
        	BlockLexer lex = new BlockLexer(new ANTLRFileStream(args[0]));
	       	CommonTokenStream tokens = new CommonTokenStream(lex);

        	BlockParser parser = new BlockParser(tokens);

	        try 
	        {
	            parser.prog();
        	} 
        	catch (RecognitionException e)  
        	{
	            e.printStackTrace();
        	}
    	}
}
prog
	:	'prog' {OStype.i =1; } statement_list+ 'endprog'
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
 	  route_cmd=route_oper robj=object_name
 	  {
 	   Route route = (Route) currentScope.lookup($robj.text);
 	   if (route != null)
 	   {
 	     System.out.println(" route command :"+$route_cmd.text);
 	     System.out.println(" inputs :"+route.getString());
 	   }
 	  
 	  }
 	|route_cmd2=route_oper robj2=route
 	{
 	Route r=(Route)robj2.lookupValue();
 	if(r!=null)
 	{
 	System.out.println(" route command :"+$route_cmd2.text);
 	System.out.println(" inputs :"+r.getString());
 	}
 	}
 	|'ifconfig' object_name//interf_obj_name=object_name 
 /*	{
 	  Symbol s = (Symbol) currentScope.getSymbol($interf_obj_name.text);
 	  try{
 	 if (s.type.equals("interface_type_t")!=true)
 	 {
 	   throw (new DataFormatException(" ifconfig:interface object"));
 	 }
 	 }
 	 
 	 catch (DataFormatException dfe)
 	 {
 	    System.out.println(dfe);
 	  }
 	
 	  String filename = "interf_config";
 	  Interface interface = (Interface) currentScope.lookup($interf_obj_name.text);
 	  ConfigInterf cfginterf  = new ConfigInterf();
 	  
 	    if (cfginterf != null)
 	  {
 	    switch(OStype.i){
 	    case 1:
 	     cfginterf.configure(interface,OStype.i,filename+".os_"+1);
 	     break;
 	    case 2:
 	    cfginterf.configure(interface,OStype.i,filename+".os_"+2);
 	    break;
 	    }
 	  }
 	  else {
 	    System.out.println(" apply:context:obj not found");
 	    }

 	
 	
 	}*/
	|'ifconfig'  interf//interf_sym=interf
/*	{
	
 	  String filename = "interf_config";
 	  Interface interface = (Interface) interf_sym.lookupValue();
 	  ConfigInterf cfginterf  = new ConfigInterf();
 	  
 	    if (cfginterf != null)
 	  {
 	    switch(OStype.i){
 	    case 1:
 	     cfginterf.configure(interface,OStype.i,filename+".os_"+1);
 	     break;
 	    case 2:
 	    cfginterf.configure(interface,OStype.i,filename+".os_"+2);
 	    break;
 	    }
 	  }
 	  else {
 	    System.out.println(" apply:context:obj not found");
 	    }
	
	}*/
	|'apply' 'topology' topology_obj_name=object_name
	{
	
	Symbol s = (Symbol) currentScope.getSymbol($topology_obj_name.text);
 	  try{
 	 if (s.type.equals("topology_type_t")!=true)
 	 {
 	   throw (new DataFormatException(" apply : topology : object"));
 	 }
 	 }
 	 
 	 catch (DataFormatException dfe)
 	 {
 	    System.out.println(dfe);
 	  }
 	
 	  String filename = "topology_config";
 	  Topology tolpology = (Topology) currentScope.lookup($topology_obj_name.text);
 	  TopologyCbac tcbac  = new TopologyCbac();
 	  
 	    if (topology != null)
 	  {
 	    switch(OStype.i){
 	    case 1:
 	     cbac.configure(topology,OStype.i,filename+"iptables+1);
 	     break;
 	    case 2:
 	    cbac.configure(topology,OStype.i,filename+"ipfw"+2);
 	    break;
 	    }
 	  }
 	  else {
 	    System.out.println(" apply:topology:obj not found");
 	    }

	
	}
 	| 'apply' 'topology' topology_sym=topology
 	{
 	Topoloogy topology = (Topology)topology_sym.lookupValue();
 	
 	  String filename = "topology_config";
 	  Topology tolpology = (Topology) currentScope.lookup($topology_obj_name.text);
 	  TopologyCbac tcbac  = new TopologyCbac();
 	  
 	    if (topology != null)
 	  {
 	    switch(OStype.i){
 	    case 1:
 	     tcbac.configure(topology,OStype.i,filename+"iptables+1);
 	     break;
 	    case 2:
 	    tcbac.configure(topology,OStype.i,filename+"ipfw"+2);
 	    break;
 	    }
 	  }
 	  else {
 	    System.out.println(" apply:topology:obj not found");
 	    }
 	
 	
 	
 	}
 	| 'undo' 'topology' object_name 
 	| 'undo' 'topology' topology
 	|  set_oper 'context' (object_name|context) (object_name|policy)
 	
 	|  'apply' 'context' context_obj_name=object_name
 	{
 	  ContextBasedAccessControl cbac = new ContextBasedAccessControl(); 
 	  Symbol s = (Symbol) currentScope.getSymbol($var.text);
 	  try{
 	 if (s.type.equals("policy_type_t")!=true)
 	 {
 	   throw (new DataFormatException(" apply:policy:policy object"));
 	 }
 	 }
 	 catch (DataFormatException dfe)
 	 {
 	    System.out.println(dfe);
 	  }
 	
 	  String filename = "cbac";
 	  Context context = (Context) currentScope.lookup($context_obj_name.text);
 	    if (context != null)
 	  {
 	    switch(OStype.i){
 	    case 1:
 	     cbac.applyContext(context,OStype.i,filename+"iptables");
 	     break;
 	    case 2:
 	    cbac.applyContext(context,OStype.i,filename+"ipfw");
 	    break;
 	    }
 	  }
 	  else {
 	    System.out.println(" apply:context:obj not found");
 	    }
 	
 	}
 	
 	|  'apply' 'context' context_sym=context
 	
 	{
 	ContextBasedAccessControl cbac = new ContextBasedAccessControl(); 
 	String filename="cbac";
 	Context context = (Context)context_sym.lookupValue();
 	 if (context != null )
 	  {
 	    switch(OStype.i){
 	    case 1:
 	     cbac = new ContextBasedAccessControl ();
 	     String interpPath = "/bin/bash";
 	     String fwPath = "/sbin/iptables";
 	     cbac.applyContext(context,fwPath,interpPath,filename+"iptables");
 	     break;

 	    case 2:
 	     cbac = new ContextBasedAccessControl ();
 	     String interpPath = "/bin/bash";
 	     String fwPath = "/sbin/ipfw";
 	     cbac.applyContext(context,fwPath,interpPath,filename+"ipfw");
 	     break;
 	    
 	    }
 	  }
 	  else {
 	    System.out.println(" apply:context:obj not found");
 	    }
 	}
 	
 	| 'undo' 'context' object_name
 	| 'undo' 'context' context
 	| 'apply' 'policy' var=object_name
 	{
 	 Symbol s = (Symbol) currentScope.getSymbol($var.text);
 	  try{
 	 if (s.type.equals("policy_type_t")!=true)
 	 {
 	   throw (new DataFormatException(" apply:policy:policy object"));
 	 }
 	 }
 	 catch (DataFormatException dfe)
 	 {
 	    System.out.println(dfe);
 	  }
 	 
 	 Policy p = (Policy) currentScope.lookup($var.text);
 	 String output = null;  
 	 if(p!=null)
 	 {
                           
                             if(OStype.i == 1){
	   String command = "/sbin/iptables";
 	 String verd = null;
 	 if(p.verdict.equals("allow")==true)
 	  {
 	    verd = "ACCEPT";
 	    }
 	  if(p.verdict.equals("deny")==true)
 	  {
 	    verd = "DROP";
 	    }  
 	   if( verd == null)
 	      { 
 	      System.out.println("verdict is null");
 	      }
 	      
 	       
 	 String arg = " -I FORWARD -p "+p.protocol+" -d "+p.destIpAddress.getString()+"/"+p.destNetMask.getString()+
 	 " -s " + p.sourceIpAddress.getString()+"/"+p.sourceNetMask.getString() ;
 	 
 	 if(p.destPort != 0){
 	 arg = arg + " --destination-port "+p.destPort;
 	 }
 	 
 	 if(p.sourcePort != 0){
 	 arg = arg + " --source-port "+p.sourcePort;
 	 }
 	 arg = arg+" -j " +verd;
 	  System.out.println(command+arg);
 	  output = command+arg;
 	  }
 	
 	 else if (OStype.i == 2){
 	  String command = "/sbin/ipfw";
 	 String verd = null;
 	 
 	 if(p.verdict.equals("allow")==true)
 	  {
 	    verd = "allow";
 	    }
 	  if(p.verdict.equals("deny")==true)
 	  {
 	    verd = "deny";
 	    }  
 	   if( verd == null)
 	      { 
 	      System.out.println("verdict is null");
 	      }
 	      
 	       
 	 String arg = " add "+verd+" "+p.protocol+" from "+p.sourceIpAddress.getString()+":"+p.sourceNetMask.getString()+" ";
 	 
 	 if(p.sourcePort != 0){
 	 arg = arg+p.sourcePort;
 	  }
 	 arg = arg+  " to " + p.destIpAddress.getString()+":"+p.destNetMask.getString() +" ";
 	 
 	 if(p.destPort !=0){
 	 arg = arg+p.destPort;
 	 }
 	 System.out.println(command+arg);
 	  output = command+arg;
 	 }
 	 
 	 else  { System.out.println(" p is null");}
 	}
 	
 	if(output != null)
 	 {
 	  String filename = "default_policy";
 	   if(OStype.i == 1)
 	    { filename = "policyiptables";}
 	    else if(OStype.i == 2) { filename = "policyipfw";}
 	 try {
  	            FileWriter outFile = new FileWriter(filename);
  	            PrintWriter out = new PrintWriter(outFile);
 	            out.println("#/bin/bash");
 	            out.println(output);
  	            out.close();
	     } catch (IOException e){
  	         e.printStackTrace();
  	        }
 	 
 	 
 	 
 	 }
 	
 	
 	}
 	| 'apply' 'policy' p2=policy
	{

	Policy p=(Policy)p2.lookupValue();
/*	//System.out.println(p.verdict);
	 String command = "/sbin/iptables";
 	 String verd = null;
 	 if(p.verdict.equals("allow"))
 	  {
 	    verd = "ACCEPT";
 	    }
 	  if(p.verdict.equals("deny"))
 	  {
 	    verd = "DROP";
 	    }  
 	   if( verd == null)
 	      { 
 	      System.out.println("verdict is null");
 	      }
 	      
 	      String arg = "  -I FORWARD -p "+p.protocol+" -d "+p.destIpAddress.getString()+"/"+p.destNetMask.getString()+
 	 " -s " + p.sourceIpAddress.getString()+"/"+p.sourceNetMask.getString() ;
 	 
 	 if(p.destPort != 0){
 	 arg = arg + " --destination-port "+p.destPort;
 	 }
 	 
 	 if(p.sourcePort != 0){
 	 arg = arg + " --source-port "+p.sourcePort;
 	 }
 	 arg = arg+" -j " +verd;
 	 
 	  System.out.println(command+arg);
	    */
	    
	     String command = "/sbin/ipfw";
 	 String verd = null;
 	 
 	 if(p.verdict.equals("allow")==true)
 	  {
 	    verd = "allow";
 	    }
 	  if(p.verdict.equals("deny")==true)
 	  {
 	    verd = "deny";
 	    }  
 	   if( verd == null)
 	      { 
 	      System.out.println("verdict is null");
 	      }
 	      
 	       
 	 String arg = " add "+verd+" "+p.protocol+" from "+p.sourceIpAddress.getString()+":"+p.sourceNetMask.getString()+" " ;
 	 
 	 if(p.sourcePort != 0){
 	 arg = arg+p.sourcePort;
 	 
 	 }
 	 arg = arg+  " to " + p.destIpAddress.getString()+":"+p.destNetMask.getString() +" ";
 	 
 	 if(p.destPort !=0){
 	 arg = arg+p.destPort;
 	 }
 	  	  System.out.println(command+arg);
	    
	      
 	  	 
	}
 	| 'undo' 'policy' var=object_name
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
 	  if(p.verdict.equals("deny"))
 	  {
 	    verd = "DROP";
 	    }  
 	   if( verd == null)
 	      { 
 	      System.out.println("verdict is null");
 	      }


	String arg = "  -D FORWARD -p "+p.protocol+" -d "+p.destIpAddress.getString()+"/"+p.destNetMask.getString()+
 	 " -s " + p.sourceIpAddress.getString()+"/"+p.sourceNetMask.getString() ;
 	 
 	 if(p.destPort != 0){
 	 arg = arg + " --destination-port "+p.destPort;
 	 }
 	 
 	 if(p.sourcePort != 0){
 	 arg = arg + " --source-port "+p.sourcePort;
 	 }
 	 arg = arg+" -j " +verd;
 	 
	  System.out.println(command+arg);
  
	 }
 	 else  { System.out.println(" policy object is null");}
 	 
 	}
 	| 'undo' 'policy' p3=policy
 	{
 	
	Policy p=(Policy)p3.lookupValue();
	//System.out.println(p.verdict);
	 String command = "/sbin/iptables";
 	 String verd = null;
 	 if(p.verdict.equals("allow"))
 	  {
 	    verd = "ACCEPT";
 	    }
 	  if(p.verdict.equals("deny"))
 	  {
 	    verd = "DROP";
 	    }  
 	   if( verd == null)
 	      { 
 	      System.out.println("verdict is null");
 	      }
 	String arg = "  -D FORWARD -p "+p.protocol+" -d "+p.destIpAddress.getString()+"/"+p.destNetMask.getString()+
 	 " -s " + p.sourceIpAddress.getString()+"/"+p.sourceNetMask.getString() ;
 	 
 	 if(p.destPort != 0){
 	 arg = arg + " --destination-port "+p.destPort;
 	 }
 	 
 	 if(p.sourcePort != 0){
 	 arg = arg + " --source-port "+p.sourcePort;
 	 }
 	 arg = arg+" -j " +verd;
 	 
 	  System.out.println(command+arg);
 	  
 	}
 	| set_oper 'host_group' (object_name| host_group) (object_name|host) 
// 	| set_oper 'serv_group' (object_name|serv_group) serv_descr 
	|config_display 
 	;
 	
 route_oper returns [String route_cmd]
 	:	
	|cmd='route' sub_cmd='add' { $route_cmd = $cmd.text+$sub_cmd.text;}
 	|cmd='route' sub_cmd='delete' { $route_cmd = $cmd.text+$sub_cmd.text;}
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
			map.clear();
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
	(',' {count_com++;} next_var=object_name)* 
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
	|	'context_type_t'
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
	| context {$sym=$context.sym;}/* Similarly with other types */
	| host_group { $sym = $host_group.sym;} 
	| topology {$sym = $topology.sym;}
	| serv_group {$sym = $serv_group.sym;}
	| interf { $sym = $interf.sym;}
	| route {$sym = $route.sym;}
	//	| object_name
	;
//	object_values: object_name|serv_group|topology|host_group|role|host|policy|ip_addr|STRING|int_value|char_value;


context returns [Symbol sym]: 
	{ 
	      Vector <Policy> policies;
	      policies = new Vector <Policy>() ;	     
	 }
	'context' '{' ((p_i=policy {policies.add((Policy)p_i.lookupValue());})|(var=object_name{
		  Symbol s2 = currentScope.getSymbol($var.text);
		  String st=s2.getType();
		  try{
		  if((st.equals("policy_type_t")!=true)){
		  throw(new DataFormatException("rule:context"));
	//	  System.out.println("added"+p3.verdict);
		  }}catch(DataFormatException dfe)
		  {
		  System.out.println(dfe);
		  }
		  Policy p3=(Policy)s2.lookupValue();
		  policies.add(p3);
		  
		  }
		))
		 
		  (  ','  ((p_j=policy {policies.add((Policy)p_j.lookupValue());})|(var2=object_name
		   {
		   Symbol s3 = currentScope.getSymbol($var2.text);
		  String st=s3.getType();
		  try{
		  if((st.equals("policy_type_t")!=true)){
		  throw(new DataFormatException("rule:context"));
	//	  System.out.println("added"+p3.verdict);
		  }}catch(DataFormatException dfe)
		  {
		  System.out.println(dfe);
		  }
		  Policy p4=(Policy)s3.lookupValue();
		  policies.add(p4);
		  
		   
		   })) )* '}'
	{
	Context context = new Context (policies);
	Symbol s = new Symbol ("context_type_t","context_type_t",context);
	$sym = s;  		
	}
	
	;
//policy  :	direction verdict proto (port)?  ;//ip_addr 'netmask' src_netmask=ip_addr  sport=(port)?;
/* Policy which can be used for RBAC as well as traditional FIREWALL / PACKET FILTER policies */

policy returns [Symbol sym]	: 
  	{
  	 String sp;
  	 sp ="0";
  	 String dp;
  	 dp ="0";
  	 Ipaddress dip;
  	 dip  = new Ipaddress("0.0.0.0") ;
  	 Ipaddress dnetmask ;
  	 dnetmask = new Ipaddress("0.0.0.0");
  	 Ipaddress sip ;
  	 sip = new Ipaddress("0.0.0.0");
  	 Ipaddress snetmask;
  	 snetmask = new Ipaddress("0.0.0.0");
  	}
  	dir=direction verd=verdict protocol=proto 
  	('dst' 
  	  ((dst_ip = ip_addr { dip = new Ipaddress($dst_ip.text);})  	| 
  	  (dip_obj = object_name
  	   { Symbol s = currentScope.getSymbol($dip_obj.text);   
  	   
  	   if ( s == null)
  	   {
  	    System.out.println ("object : "+$dip_obj.text+"  not found");
  	    } 
  	    
  	   try{  /* Check fot type exceptions in ip_address */
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("policy : tcp/udp:destip"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
  	   	
  	   dip = (Ipaddress) s.lookupValue(); }))
	   
  	 'netmask' ((dnetmask_ip=ip_addr {dnetmask = new Ipaddress($dnetmask_ip.text);})|
  	  (dnetmask_ip_obj = object_name 
  	  {Symbol s = currentScope.getSymbol($dnetmask_ip_obj.text);  
  	  
  	  if ( s == null)
  	   {
  	    System.out.println ("object : "+ $dnetmask_ip_obj.text+"  not found");
  	    } 
  	    
  	   try{  /* Check fot type exceptions in ip_address */
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("policy : tcp/udp:dest_netmask"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
  	  
  	  
  	   dnetmask = (Ipaddress) s.lookupValue();
  	  
  	  
  	  }))
  	  
  	    ((dport=port {dp = new String($dport.text);} ) | ('all')) ) ?
  	  
  	  
  	('src'
  	((src_ip = ip_addr { sip = new Ipaddress($src_ip.text);})  	| 
  	  (sip_obj = object_name
  	   { Symbol s = currentScope.getSymbol($sip_obj.text);   
  	   
  	   if ( s == null)
  	   {
  	    System.out.println ("object : "+$sip_obj.text+"  not found");
  	    } 
  	    
  	   try{  /* Check fot type exceptions in ip_address */
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("policy : tcp/udp:srcip"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
  	   
  	   sip = (Ipaddress) s.lookupValue(); }))
	   
  	 'netmask' ((snetmask_ip=ip_addr {snetmask = new Ipaddress($snetmask_ip.text);})|
  	  (snetmask_ip_obj = object_name 
  	  {Symbol s = currentScope.getSymbol($snetmask_ip_obj.text);  
  	  
  	  if ( s == null)
  	   {
  	    System.out.println ("object : "+$snetmask_ip_obj.text+"  not found");
  	    } 
  	    
  	   try{  /* Check fot type exceptions in ip_address */
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("policy : tcp/udp:snetmask"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
  	  snetmask = (Ipaddress) s.lookupValue();}))
  	
  	  ((sport=port {sp = new String($sport.text);} ) | ('all')) ) ?
  	 	
  	 
{
	System.out.println ($dir.text+$verd.text+$protocol.text+sip.getString()+snetmask.getString()+
	                                      sp+dip.getString()+ dnetmask.getString()+dp);
	
	Policy pl = new Policy($dir.text,$verd.text, $protocol.text, sip.getString(),snetmask.getString(),
		              sp,dip.getString(),dnetmask.getString(),dp);		

	 Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
	$sym = s;

	
//	currentScope.printSymbols();
}
	| 
	
	{
	 String sp;
  	 sp ="0";
  	 String dp;
  	 dp ="0";
  	 Ipaddress dip;
  	 dip  = new Ipaddress("0.0.0.0");
  	 Ipaddress dnetmask ;
  	 dnetmask = new Ipaddress("0.0.0.0");
  	 Ipaddress sip ;
  	 sip = new Ipaddress("0.0.0.0" );
  	 Ipaddress snetmask;
  	 snetmask = new Ipaddress("0.0.0.0");
	}	
	
	dir=direction verd=verdict icmp_mesg=icmp_cntrl_message  
	('dst' 
  	  ((dst_ip = ip_addr { dip = new Ipaddress($dst_ip.text);})  	| 
  	  (dip_obj = object_name
  	   { Symbol s = currentScope.getSymbol($dip_obj.text); 
  	   
  	   if ( s == null)
  	   {
  	    System.out.println ("object : $dip_obj.text  not found");
  	    } 
  	    
  	   try{  /* Check fot type exceptions in ip_address */
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("policy : icmp:destip"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
  	   
  	   
  	     dip = (Ipaddress) s.lookupValue(); }))
	   
  	 'netmask' ((dnetmask_ip=ip_addr {dnetmask = new Ipaddress($dnetmask_ip.text);})|
  	  (dnetmask_ip_obj = object_name 
  	  {Symbol s = currentScope.getSymbol($dnetmask_ip_obj.text); 
  	  
  	  if ( s == null)
  	   {
  	    System.out.println ("object : $dnetmask_obj.text  not found");
  	    } 
  	    
  	   try{  /* Check fot type exceptions in ip_address */
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("policy : icmp:dnetmask"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
  	  
  	    dnetmask = (Ipaddress) s.lookupValue();})))?
  	  	  
  	  
  	('src'
  	((src_ip = ip_addr { sip = new Ipaddress($src_ip.text);})  	| 
  	  (sip_obj = object_name
  	   { Symbol s = currentScope.getSymbol($sip_obj.text);  
  	   
  	   if ( s == null)
  	   {
  	    System.out.println ("object : $src_obj.text  not found");
  	    } 
  	    
  	   try{  /* Check fot type exceptions in ip_address */
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("policy : icmp:srcip"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
  	   
  	   
  	    sip = (Ipaddress) s.lookupValue(); }))
	   
  	 'netmask' ((snetmask_ip=ip_addr {dnetmask = new Ipaddress($snetmask_ip.text);})|
  	  (snetmask_ip_obj = object_name 
  	  {Symbol s = currentScope.getSymbol($snetmask_ip_obj.text); 
  	  
  	  if ( s == null)
  	   {
  	    System.out.println ("object : "+ $snetmask_ip_obj.text+"  not found");
  	    } 
  	    
  	   try{  /* Check fot type exceptions in ip_address */
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("policy : icmp:snetmask"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
  	  
  	  
  	    snetmask = (Ipaddress) s.lookupValue();})))?
 	  
	
	
	{
	
	Policy pl = new Policy($dir.text,$verd.text, $icmp_mesg.text, dip.getString(),dnetmask.getString(),
		               sip.getString(),snetmask.getString());		

	 Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
	$sym = s;
	}	
	
//	Policy pl;

	;	
	

topology  returns [Symbol sym]:
	{
	Hostgroup hg;
	Servicegroup sg;
	Context cxt;
	}
		
	((host_group_sym=host_group {hg = (Hostgroup)host_group_sym.lookupValue();}) |( host_group_obj=object_name  
	{Symbol s  = currentScope.getSymbol ($host_group_obj.text); 
	
	try{
	  if(s.getType().equals ("host_group_type_t") != true) 
	  { throw (new DataFormatException("rule : host"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	    }
	    
	hg = (Hostgroup) s.lookupValue(); }))


		
	 ((cxt_sym=context {cxt = (Context) cxt_sym.lookupValue(); })| 
	 
	 ( cxt_obj = object_name {Symbol s = (Symbol)currentScope.getSymbol ($cxt_obj.text);
	 
	 try{
	  if(s.getType().equals ("context_type_t") != true) 
	  { throw (new DataFormatException("rule : topology: host:context"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	    }
	 
	 cxt = (Context) s.lookupValue(); } ))
	 
	 |	
	 
	 ((serv_group_sym=serv_group {sg = (Servicegroup)serv_group_sym.lookupValue();}) |( serv_group_obj=object_name  
	{Symbol s  = currentScope.getSymbol ($serv_group_obj.text); 
	
	try{
	  if(s.getType().equals ("serv_group_type_t") != true) 
	  { throw (new DataFormatException("rule : topology : servgroup:context"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	    }
	
	sg = (Servicegroup) s.lookupValue(); }))
		
	 ((cxt_sym=context {cxt = (Context) cxt_sym.lookupValue(); })| ( cxt_obj = object_name {Symbol s = (Symbol)currentScope.getSymbol ($cxt_obj.text);
	 
	 try{
	  if(s.getType().equals ("context_type_t") != true) 
	  { throw (new DataFormatException("rule : topology:servgroup:context"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	    }
	 
	 cxt = (Context) s.lookupValue(); } ))
	 
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

verdict returns [String verd] : 	'allow' { $verd = new String("allow"); }
	| 	'deny' {$verd = new String ("deny");}
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
	 'ip_addr' (ip_string=ip_addr|(ip_obj=object_name {ip_object_used=true; } )) 'netmask' (netmask_string=ip_addr | 
	                   (netmask_ip_obj = object_name {netmask_object_used = true;}))
{
	Host h;
	if(ip_object_used == true && netmask_object_used ==false)
	{
	  Symbol s = currentScope.getSymbol($ip_obj.text);
	 
	 /* Check for type error  in ipaddres*/
	 try{
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : host"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	    
	   }
	   
	  Ipaddress ip = (Ipaddress) s.lookupValue();
	  h = new Host	( ip.getString(),$netmask_string.text);
	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
	 $sym = s_ret;
	}
	else if (ip_object_used == false  && netmask_object_used ==true)
	{
      	  Symbol s = currentScope.getSymbol($netmask_ip_obj.text);
      	  
      	  /* Check for type error in netmask  */
      	   try{
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : host"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
      	  
	  Ipaddress ip = (Ipaddress) s.lookupValue();
	  h = new Host	( $ip_string.text,ip.getString());
	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
	  $sym = s_ret;
	}
	else if(ip_object_used ==true && netmask_object_used ==true)
	{
	
	  Symbol s_ip =  currentScope.getSymbol($ip_obj.text);
	
	 try{  /* Check fot type exceptions in ip_address */
	  if(s_ip.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : host"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	
	
	  Ipaddress ip = (Ipaddress) s_ip.lookupValue();
	 
  	  Symbol s_nmask = currentScope.getSymbol($netmask_ip_obj.text);
	
	 try{  /* Check for type exception in netmask  */
	  if(s_nmask.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : host"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	  
	  
	  Ipaddress nmask = (Ipaddress) s_nmask.lookupValue();
	  h = new Host	( ip.getString(),nmask.getString());
	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
	 $sym = s_ret;
	
	}
	else{
	h = new Host ($ip_string.text,$netmask_string.text); //usure about the text error
	Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
	
	/* Check for type exceptions */
	  
	$sym = s_ret;
	}
//	return $sym;

};


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
	'host_group'  '{'( i=host  {hosts.add((Host)i.lookupValue()); }| (host_obj_i=object_name {
	Symbol hostsym =  currentScope.getSymbol($host_obj_i.text);
	
	try{ 
	  if(hostsym.getType().equals ("host_type_t") != true) 
	  { throw (new DataFormatException("rule : host_group"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	
	Host host = (Host) hostsym.lookupValue();
	hosts.add(host);}
	))
	
	 (',' (j=host {hosts.add((Host)j.lookupValue());} | (host_obj_j = object_name{
	Symbol hostsym =  currentScope.getSymbol($host_obj_j.text);
	
	try{ 
	  if(hostsym.getType().equals ("host_type_t") != true) 
	  { throw (new DataFormatException("rule : host_group"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	
	Host host = (Host) hostsym.lookupValue();
	hosts.add(host); }
	  )))* '}'         //   ( 'DNS'  '{' dns_set '}' )?  ( 'GATEWAY' '{' gateway '}')? 
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
	  'defgw'  gw_ip=ip_addr   
	{
	Interface iface = new Interface ($interface_name.text,$interface_ip.text,$interface_netmask.text,$gw_ip.text, dns_ip);
	Symbol s = new Symbol("interface_descriptor", "interface_type_t", iface);
	$sym = s;  
	} ;
  
route returns [Symbol sym]	: 
{
   boolean ip_object_used , gw_object_used,nm_object_used ;
   ip_object_used = false;
   gw_object_used = false;
   nm_object_used=false;
}
'host' (dst=ip_addr|(ip_obj =object_name {ip_object_used=true;})) 'gw' (gw=ip_addr|(gw_ip_obj = object_name{gw_object_used=true;}))
{
		
	if(ip_object_used == true && gw_object_used ==false)
	{
	  Symbol s = currentScope.getSymbol($ip_obj.text);
	 
	 /* Check for type error  in ipaddres*/
	 try{
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:host"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	    }
	   
	  Ipaddress ip = (Ipaddress) s.lookupValue();
	  Route rh = new Route (ip.getString(),$gw.text);
	  Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
	 $sym = s_ret;
	
	}
	else if (ip_object_used == false  && gw_object_used ==true)
	{
      	  Symbol s = currentScope.getSymbol($gw_ip_obj.text);
      	  
      	  /* Check for type error in netmask  */
      	   try{
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:host"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
      	  
	  Ipaddress gwip = (Ipaddress) s.lookupValue();
	  Route rh = new Route ($ip_obj.text,gwip.getString());//it should be $dst.text instead of ip_obj
	  Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
	  $sym = s_ret;
	}
	else if(ip_object_used ==true && gw_object_used ==true)
	{
	
	  Symbol dst_ip =  currentScope.getSymbol($ip_obj.text);
	
	 try{  /* Check fot type exceptions in ip_address */
	  if(dst_ip.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:host"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	
	
	  Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
	 
  	  Symbol dst_gw = currentScope.getSymbol($gw_ip_obj.text);
	
	 try{  /* Check for type exception in netmask  */
	  if(dst_gw.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:host"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	  
	  
	  Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
	 
	 Route rh = new Route (ip.getString(),gwip.getString());
	  Symbol s_ret = new Symbol("route_host_string", "host_type_t", rh);
	 $sym = s_ret;
	
	}
	 else{
	  Route rh = new Route ($dst.text, $gw.text);
	  Symbol s_ret = new Symbol("host_route_string", "route_type_t", rh);
	  $sym = s_ret;
	  }
	}	
		
	|
	{
	 boolean  ip_object_used,nm_object_used , gw_object_used ;
	 ip_object_used = false;
	 nm_object_used = false;
	 gw_object_used = false;
	 } 
	
	 'net' (dst=ip_addr|(ip_obj=object_name{ip_object_used=true;})) 'netmask' (netmask_ip=ip_addr|(nm_ip_obj=object_name{nm_object_used=true;})) 
	 'gw' (gw= ip_addr|(gw_ip_obj=object_name{gw_object_used=true;}))
	{
	 if((ip_object_used ==true )&& (nm_object_used==false) && (gw_object_used==false))
	 {
	 Symbol s = currentScope.getSymbol($ip_obj.text);
	 
	 try{
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	    }
	   
	  Ipaddress ip = (Ipaddress) s.lookupValue();
	  Route rn = new Route (ip.getString(),$netmask_ip.text,$gw.text);
	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rn);
	 $sym = s_ret;
	 
	 }
	 else if(ip_object_used ==false && nm_object_used==true && gw_object_used==false)
	 {
	 Symbol s = currentScope.getSymbol($nm_ip_obj.text);
      	  
      	  /* Check for type error in netmask  */
      	   try{
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
      	  
	  Ipaddress nmip = (Ipaddress) s.lookupValue();
	  Route rn = new Route ($dst.text,nmip.getString(),$gw.text);
	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rn);
	  $sym = s_ret;
	 }
	 else if(ip_object_used ==false && nm_object_used==false && gw_object_used==true)
	 {
	 
	 Symbol s = currentScope.getSymbol($gw_ip_obj.text);
      	  
      	  /* Check for type error in netmask  */
      	   try{
	  if(s.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
      	  
	  Ipaddress gwip = (Ipaddress) s.lookupValue();
	  Route rh = new Route ($dst.text,$netmask_ip.text,gwip.getString());
	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
	  $sym = s_ret;
	 
	 }
	 
	 
	 else if(ip_object_used ==true && nm_object_used==true && gw_object_used==false)
	 {
	 	 	 	
	  Symbol dst_ip =  currentScope.getSymbol($ip_obj.text);
	
	 try{  /* Check fot type exceptions in ip_address */
	  if(dst_ip.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	
	  Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
	 
  	  Symbol dst_nm = currentScope.getSymbol($nm_ip_obj.text);
	
	 try{  /* Check for type exception in netmask  */
	  if(dst_nm.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	  
	  
	  Ipaddress nmip = (Ipaddress) dst_nm.lookupValue();
	 
	 Route rh = new Route (ip.getString(),nmip.getString(),$gw.text);
	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
	 $sym = s_ret;
	 
	 
	 }
	 else if(ip_object_used ==true && nm_object_used==false && gw_object_used==true)
	 {
	 
	   Symbol dst_ip =  currentScope.getSymbol($ip_obj.text);
	
	 try{  /* Check fot type exceptions in ip_address */
	  if(dst_ip.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	
	
	  Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
	 
  	  Symbol dst_gw = currentScope.getSymbol($gw_ip_obj.text);
	
	 try{  /* Check for type exception in netmask  */
	  if(dst_gw.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	  
	  
	  Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
	 
	 Route rh = new Route (ip.getString(),$netmask_ip.text,gwip.getString());
	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
	 $sym = s_ret;
	 }
	 else if(ip_object_used ==false && nm_object_used==true && gw_object_used==true)
	 {
	 
	   Symbol nm_ip =  currentScope.getSymbol($nm_ip_obj.text);
	
	 try{  /* Check fot type exceptions in ip_address */
	  if(nm_ip.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	
	
	  Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
	 
  	  Symbol dst_gw = currentScope.getSymbol($gw_ip_obj.text);
	
	 try{  /* Check for type exception in netmask  */
	  if(dst_gw.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	  
	  
	  Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
	 
	 Route rh = new Route ($dst.text,nmip.getString(),gwip.getString());
	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
	 $sym = s_ret;
	 }
	 else if(ip_object_used ==true && nm_object_used==true && gw_object_used==true)
	 {
	 	
	  Symbol dst_ip =  currentScope.getSymbol($ip_obj.text);
	
	 try{  /* Check fot type exceptions in ip_address */
	  if(dst_ip.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	
	
	  Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
	 	
	 	 	
	  Symbol nm_ip =  currentScope.getSymbol($nm_ip_obj.text);
	
	 try{  /* Check fot type exceptions in ip_address */
	  if(nm_ip.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	
	
	  Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
	 
  	  Symbol dst_gw = currentScope.getSymbol($gw_ip_obj.text);
	
	 try{  /* Check for type exception in netmask  */
	  if(dst_gw.getType().equals ("ipaddr_t") != true) 
	  { throw (new DataFormatException("rule : route:net"));}
	  }
	  catch (DataFormatException dfe)
	  {
	   System.out.println(dfe);
	   }
	  
	  
	  Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
	 
	 Route rh = new Route (ip.getString(),nmip.getString(),gwip.getString());
	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
	 $sym = s_ret;
	 }
	 else
	 {
	 Route rn = new Route ($dst.text,$netmask_ip.text,$gw.text);
   	  Symbol s = new Symbol("net_route_string", "route_type_t", rn);
	  $sym = s;
	  }
	  
}
;


//route : 'host' ip_addr 'gw' ip_addr
//| 'net' ip_addr 'netmask' ip_addr 'gw' ip_addr
//;




//Sambuddho : This will be added later : May require a special type		  
//serv_descr 
//	: ip_addr (nmask)? serv_listen_port;

serv_group returns [Symbol sym]
	: 
	{
	 Ipaddress serviceIp;
	 serviceIp = new Ipaddress ("0.0.0.0");
	 Ipaddress serviceNetmask;
	 serviceNetmask = new Ipaddress("0.0.0.0");
	 String servicePort;
	 servicePort = "0";
	Vector <Servicedescriptor> sDesc;
	sDesc = new Vector <Servicedescriptor> ();
	}

	'service_group' '{' ((serv_ip_str =  ip_addr { serviceIp = new Ipaddress($serv_ip_str.text);})
		| (serv_ip_obj = object_name { 
		 Symbol s = currentScope.getSymbol($serv_ip_obj.text);
	 
		 try{
		  if(s.getType().equals ("ipaddr_t") != true) 
		  { throw (new DataFormatException("rule : service_group:service ip"));}
		  }
		  catch (DataFormatException dfe)
		  {
		   System.out.println(dfe);
		    }
	   
		  serviceIp = (Ipaddress) s.lookupValue();
		  }))
		
		
		
		
		 ('netmask' ((serv_netmask_str=ip_addr{serviceNetmask = new Ipaddress($serv_netmask_str.text);})|
		                       (serv_netmask_obj = object_name{ 
		                       Symbol s = currentScope.getSymbol($serv_netmask_obj.text);
		                       
		 try{
		  if(s.getType().equals ("ipaddr_t") != true) 
		  { throw (new DataFormatException("rule : service_group: service_netmask"));}
		  }
		  catch (DataFormatException dfe)
		  {
		   System.out.println(dfe);
		    }
		    
		    serviceNetmask = (Ipaddress)s.lookupValue();
	                               })) )?  
		      serv_port_str=serv_listen_port  { sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
		      			         $serv_port_str.text)));}
		      
		      
	(', '  ((extra_ip_str =  ip_addr { serviceIp = new Ipaddress($extra_ip_str.text);})
		| (extra_ip_obj = object_name { 
		 Symbol s = currentScope.getSymbol($extra_ip_obj.text);
	 
		 try{
		  if(s.getType().equals ("ipaddr_t") != true) 
		  { throw (new DataFormatException("rule : service_group:service ip:second_comma_separated_values"));}
		  }
		  catch (DataFormatException dfe)
		  {
		   System.out.println(dfe);
		    }
	   
		  serviceIp = (Ipaddress) s.lookupValue();
		  }))
		
				
		 ('netmask' ((extra_serv_netmask_str=ip_addr{serviceNetmask = new Ipaddress($extra_serv_netmask_str.text);})|
		                       (extra_serv_netmask_obj = object_name{ 
		                       Symbol s = currentScope.getSymbol($extra_serv_netmask_obj.text);
		                       
		 try{
		  if(s.getType().equals ("ipaddr_t") != true) 
		  { throw (new DataFormatException("rule : service_group: service_netmask"));}
		  }
		  catch (DataFormatException dfe)
		  {
		   System.out.println(dfe);
		    }
		    
		    serviceNetmask = (Ipaddress)s.lookupValue();
	                               })) )?  
		      extra_serv_port_str=serv_listen_port  { sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
		      			         $extra_serv_port_str.text)));}
		      )*  '}'  
		      
		      {
		       Servicegroup sg = new Servicegroup(sDesc);
		       Symbol s = new Symbol ("serv_group_type_t","serv_group_type_t",sg);
		       $sym = s;		      
		     }
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
