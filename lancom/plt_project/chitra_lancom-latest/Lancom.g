grammar Lancom;

tokens {
 	PLUS 	= '+' ;
 	MINUS	= '-' ;
 	MULT	= '*' ;
 	DIV	= '/' ;
 	ELSE 	= 'else';   
 	ENDIF	= 'endif';
 	OPAREN	= '(';
 	CPAREN	= ')';
 	ENDWHILE = 'endwhile'; 	
 	NUMBER ;
 	NM;
 	
}

@header
{
	import java.util.HashMap;
	import java.io.*;
	import java.util.Vector;
	import java.util.Set;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.zip.DataFormatException;
	import java.util.Scanner;

}

@members 
{      
	Scope globalScope = new Scope(null);
	Scope currentScope = globalScope;
	String g_action = "";
	boolean g_ignore_stmt = false;
	Stack g_ifStack = new Stack();	
	Map<String, Assignment> map = new HashMap<String, Assignment>(); 
	static String inputFile, XMLFile, outputFile;
	
    	public static void main(String[] args) throws Exception 
    	{
    	if(args.length<3)
    	{
    	System.out.println("USAGE: java LancomParser SourceInputFile XMLSchema OutputFile");
    	} 
    	
    	else{
    	if(args[0].endsWith(".lan")==true)
    	{
    	
    	File infile=new File(args[0]);
    	if(!infile.exists()) 
    	{
    	System.out.println("File opening error"+args[0]);
    	} 
    	File infile2=new File(args[1]);
    	if(!infile2.exists()) 
    	{
    	System.out.println("File opening error"+args[1]);
    	}
	inputFile=args[0];
	outputFile=args[2];
	XMLFile=args[1];
    	
    	   	
    	
    	
	}
	else
	{
		System.out.println("Source Code is not a LANCOM  file");
	}
    	}
    	
        	LancomLexer lex = new LancomLexer(new ANTLRFileStream(args[0]));
	       	CommonTokenStream tokens = new CommonTokenStream(lex);

        	LancomParser parser = new LancomParser(tokens);

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
	:	'prog' statement_list+ 'endprog'
 	;

if_statement_list
 	:	statement_list+
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
 	|       config_statement ';'
 	;

/*
** Sambuddho
*/ 	
 config_statement 
 	: route_cmd=ROUTE_OPER robj=object_name
	{
		Symbol s = currentScope.getSymbol($robj.text);
		if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$robj.text+"  not found");
				System.out.println (" object : "+$robj.text+"  not found");
				System.exit(1);
			} 
		try
		{
			if (s.type.equals("route_type_t")!=true)
 	 		{
 	   			throw (new DataFormatException(" route:route object"));
 	 		}
 	 	}
 	 	catch (DataFormatException dfe)
		{
	 		System.out.println(dfe);
	 		dfe.printStackTrace();
	 		System.exit(1);
		} 
 	  
		Route route = (Route) currentScope.lookup($robj.text);
		if (route != null)
		{
			route.configure(XMLFile,$route_cmd.text,outputFile+".route");
		} 
	}
	|route_cmd2=ROUTE_OPER robj2=route
  	{
		Route r=(Route)robj2.lookupValue();
		if(r!=null)
		{
			r.configure(XMLFile,$route_cmd2.text,outputFile+".route");
		}
 	}
 	|
 	{Interface ifc=null;}
 	'ifconfig'  ((interf_object_name=object_name) 
 	{
 		//interf_obj_name=object_name 
		Symbol s = (Symbol) currentScope.getSymbol($interf_object_name.text);
		if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$interf_object_name.text+"  not found");
			System.out.println (" object : "+$interf_object_name.text+"  not found");
				System.exit(1);
			} 
		try
		{
			if (s.type.equals("interface_type_t")!=true)
 	 		{
				throw (new DataFormatException(" ifconfig:inteface:interface object"));
 	 		}
 	 	}
 	 	catch (DataFormatException dfe)
 	 	{
 	    		System.out.println(dfe);
 	    		dfe.printStackTrace();
 	    		System.exit(1);
 	  	}
 	  	ifc = (Interface) s.lookupValue();
	}
	|(interf_sym = interf)
	{
		ifc = (Interface)interf_sym.lookupValue();
	})
	{	  
		ifc.configure(XMLFile,"InterfConfig",outputFile+".ifconf");	
	}
	
	|
	{
		Topology topology = null;
		boolean applyActions = false;
		boolean undoActions = false;
	}
	(('apply'){applyActions = true;}|('undo'){undoActions = true;}) 'topology' ((topology_obj_name=object_name)
	{
		Symbol s = (Symbol) currentScope.getSymbol($topology_obj_name.text);
		if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$topology_obj_name.text+"  not found");
				System.out.println (" object : "+$topology_obj_name.text+"  not found");
				System.exit(1);
			} 
 		try
 		{
			if (s.type.equals("topology_type_t")!=true)
 	 		{
				throw (new DataFormatException(" apply : topology : object"));
 			}
 	 	}
 	 	catch (DataFormatException dfe)
 	 	{
 	    		System.out.println(dfe);
 	    		dfe.printStackTrace();
 	    		System.exit(1);
 	  	}           	
 	  	topology = (Topology) currentScope.lookup($topology_obj_name.text);
 	}
 	| (topology_sym = topology)
 	{
		topology = (Topology) topology_sym.lookupValue();
 	}
	) 
	{
		if (topology.hostGroup != null) 
 	     	{ 
			Hostgroup hg;
	 	     	hg = topology.hostGroup;
	 	    	Context cxt;
	 	     	cxt = topology.context;
	 	     	Iterator <Host> hostiter= hg.hostGroup.iterator();
	 	    	Iterator <Policy> policyiter= cxt.context.iterator();
	       
       	 		while(hostiter.hasNext())
        		{
        	   		Host h = hostiter.next();
	       	
	    			while(policyiter.hasNext())
	    			{
	     				Policy pol = policyiter.next();
	       				Policy p = new Policy (pol.direction,pol.verdict,pol.protocol,
	       					                pol.sourceIpAddress.getString(),pol.sourceNetMask.getString()
	       					                ,String.valueOf(pol.sourcePort),
	       					                pol.destIpAddress.getString(),pol.destNetMask.getString()
	       					                ,String.valueOf(pol.destPort));
	       
	       				if(p.direction.equals("inbound")==true)
	       				{
	         				if(p.destIpAddress.getString().equals("0.0.0.0") == true)
	         				{
	           					p.destIpAddress = new Ipaddress(h.ipAddress.getString());
	           					p.destNetMask = new Ipaddress(h.netMask.getString());
	           				}
	           				else 
	           				{ 
	           					System.out.println(" dest IP address alredy present in policy : "+p.getString());
	           	   				System.exit(0);
	           	   			}	
	       				}
	       				else
	       				{
	       
	       					if(p.sourceIpAddress.getString().equals("0.0.0.0") == true)
	         				{
					        	p.sourceIpAddress = new Ipaddress(h.ipAddress.getString());
					           	p.sourceNetMask = new Ipaddress(h.netMask.getString());
	           				}
	           				else 
	           				{ 
	           					System.out.println(" Source IP address alredy present in policy : "+p.getString());
	           	   				System.exit(0);
	           	   			}	 
	       				}
	      				if((applyActions == true) && (undoActions ==false))
	      				{
	       					p.configure(XMLFile,"PolicyAdd",outputFile+".cbac");  
	       				}
	       				else if((applyActions == false) && (undoActions ==true))
	       				{
	       					p.configure(XMLFile,"PolicyDelete",outputFile+".cbac");  
	       				}
	       
	       			}//while2
	       			policyiter= cxt.context.iterator();
			}//while1
		}
           	else  if (topology.serviceGroup != null) 
 	     	{
 	     		Servicegroup sg;
 	     		sg = topology.serviceGroup;
 	     		Context cxt;
 	     		cxt = topology.context;
 	     		Iterator <Servicedescriptor> serviter= sg.serviceGroup.iterator();
 	     		Iterator <Policy> policyiter= cxt.context.iterator();
	       
	
       	 		while(serviter.hasNext())
        		{
        	    		Servicedescriptor s = serviter.next();
	    			while(policyiter.hasNext())
	    			{
	       				Policy pol = policyiter.next();
	       				Policy p = new Policy (pol.direction,pol.verdict,pol.protocol,
	       					                pol.sourceIpAddress.getString(),pol.sourceNetMask.getString()
	       					                ,String.valueOf(pol.sourcePort),
	       					                pol.destIpAddress.getString(),pol.destNetMask.getString()
	       					                ,String.valueOf(pol.destPort));
	       					                
	       				if(p.direction.equals("inbound")==true)
	       				{
	         				if(p.destIpAddress.getString().equals("0.0.0.0") == true)
	         				{
	           					p.destIpAddress = new Ipaddress(s.ipAddress.getString());
	           					p.destNetMask = new Ipaddress(s.netMask.getString());
	            					if(p.destPort != s.port )
	           					{
		   				System.out.println(" Destination port present in policy : "+
	                              			                 		p.getString()+ "  different from the one specified in service descriptor");
	             						System.exit(0);
	           					}
	           					p.destPort=s.port;
	           				}
		           			else 
		           			{ 
		           				System.out.println(" dest IP address alredy present in policy : "+p.getString());
		           	   			System.exit(0);
		           	   		}	
	       				}
		       			else
		       			{
		       				if(p.sourceIpAddress.getString().equals("0.0.0.0") == true)
		         			{
		           				p.sourceIpAddress = new Ipaddress(s.ipAddress.getString());
		           				p.sourceNetMask = new Ipaddress(s.netMask.getString());
		           				if(p.sourcePort != s.port )
		           				{
		           					System.out.println(" Source port present in policy : "+p.getString()+ "  different from the one specified in service descriptor");
		             					System.exit(0);
		           				}
		           				p.sourcePort=s.port;
		           			}
		           			else 
		           			{ 
		           				System.out.println(" Source IP address alredy present in policy : "+p.getString());
		           	   			System.exit(0);
		           	   		}	
		       			}
		       			if((applyActions == true) && (undoActions ==false))
		       			{
		       				p.configure(XMLFile,"PolicyAdd",outputFile+".cbac");  
		       			}
					else if((applyActions == false) && (undoActions ==true))
					{
		       				p.configure(XMLFile,"PolicyDelete",outputFile+".cbac");  
		       			}
	       			}//while2
	       			 policyiter= cxt.context.iterator();
			}//while1
		}
	   }
// 	| 'undo' 'topology' object_name 
 //	| 'undo' 'topology' topology
 	| set_oper 'context' (object_name|context) (object_name|policy)
	|	// Check with Sambuddho  ---- Chitra
	{	
		Context cxt = null; 
	}
	'apply' 'context' ((context_obj_name=object_name)
	{
		Symbol s = (Symbol) currentScope.getSymbol($context_obj_name.text);
		if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$context_obj_name.text+"  not found");
				System.out.println (" object : "+$context_obj_name.text+"  not found");
				System.exit(1);
			} 
		try
		{
			System.out.println(s.type);
 	 		if (s.type.equals("context_type_t")!=true)
 	 		{
 	   			throw (new DataFormatException(" apply:context:policy object"));
 	 		}
 	 	}
 	 	catch (DataFormatException dfe)
 	 	{
 	    		System.out.println(dfe);
 	    		dfe.printStackTrace();
 	    		System.exit(1);
 	  	}
 		cxt = (Context)s.lookupValue();
 	}
 	| (context_sym = context)
 	{
 		cxt = (Context)context_sym.lookupValue();
 	})
 	{
		Iterator <Policy> iter =cxt.context.iterator();
 	 	while(iter.hasNext())
 	 	{ 
			iter.next().configure(XMLFile,"PolicyAdd",outputFile+".cxt");	
 	 	} 
 	}
 	| 
 	{
 		Context cxt = null;
 	}
 	'undo' 'context' ((var=object_name)
 	{
		Symbol s = (Symbol) currentScope.getSymbol($var.text);	
		if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$var.text+"  not found");
				System.out.println (" object : "+$var.text+"  not found");
				System.exit(1);
			} 
 	
 	  	try
 	  	{
 	        	if (s.type.equals("context_type_t")!=true)
 	         	{
 	           		throw (new DataFormatException(" undo:policy:policy object"));
 	           	}
 	     	}
 	  	catch (DataFormatException dfe)
 	 	{
 	    		System.out.println(dfe);
		 	dfe.printStackTrace();
		 	System.exit(1);
 	  	}	
 		cxt = (Context)s.lookupValue();
 	}|
 	(context_sym = context)
 	{
 	 	cxt = (Context)context_sym.lookupValue();
	}
 	)
 	{
 	 
 	 	Iterator <Policy> iter =cxt.context.iterator();
		while(iter.hasNext())
 	 	{ 
 	   		iter.next().configure(XMLFile,"PolicyDelete",outputFile+".cxt");	
 	 	}
	}
	| 
	{ 
		Policy p=null;
	}  
	'apply' 'policy' ((var=object_name)
	{
		Symbol s = (Symbol) currentScope.getSymbol($var.text);
		if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$var.text+"  not found");
				System.out.println (" object : "+$var.text+"  not found");
				System.exit(1);
			} 
 	  	try
 	  	{
 			if (s.type.equals("policy_type_t")!=true)
 		      	{
 	 	       		throw (new DataFormatException(" apply:policy:policy object"));
 		      	}
 	 	}
 		catch (DataFormatException dfe)
 	 	{
 	    		System.out.println(dfe);
 	    	  	dfe.printStackTrace();
	 	  	System.exit(1);
		}	
		p = (Policy) currentScope.lookup($var.text);		
	} 
	| 
	(policy_sym = policy)
	{
		p = (Policy)policy_sym.lookupValue();	
	})
	{
		p.configure(XMLFile,"PolicyAdd",outputFile+".policy");
 	}
 	|
 	{ 
 		Policy p = null;
 	} 
 	'undo' 'policy'((var=object_name)
	{
		Symbol s = (Symbol) currentScope.getSymbol($var.text);
		if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$var.text+"  not found");
				System.out.println (" object : "+$var.text+"  not found");
				System.exit(1);
			} 
 	  	try
 	  	{
 			if (s.type.equals("policy_type_t")!=true)
 		      	{
 	 	       		throw (new DataFormatException(" apply:policy:policy object"));
 		      	}
 	 	}
 		catch (DataFormatException dfe)
 	 	{
 	    		System.out.println(dfe);
 	    	  	dfe.printStackTrace();
	 	  	System.exit(1);
 	  	}	
		p = (Policy) currentScope.lookup($var.text);		
	} 
	| 
	(policy_sym = policy)
	{
		p = (Policy)policy_sym.lookupValue();
		
	})	
 	{
 		p.configure(XMLFile,"PolicyDelete",outputFile+".policy");
 	}
 	| set_oper 'host_group' (object_name| host_group) (object_name|host) 
// 	| set_oper 'serv_group' (object_name|serv_group) serv_descr 
	|config_display 
 	;
/*
ROUTE_OPER returns [String rcmd]
 	:cmd='route' sub_cmd='add' 	{ $rcmd = new String("RouteAdd"); }
 	|cmd='route' sub_cmd='delete' 	{ $rcmd = new String("RouteDelete"); }
 	;
 	*/	

ROUTE_OPER returns [String rcmd]
 	:'route' 'add' 		{ $rcmd = new String("RouteAdd"); }
 	|'route' 'delete' 	{ $rcmd = new String("RouteDelete"); }
 	;	

set_oper 
	:'add' 'to'
	| 'delete' 'from'
	;
 	
 config_display 
 	:'route' 'show' 'numeric'  {Route.display(XMLFile,"DisplayRouteNumeric",outputFile+".disp");}
 	|'route' 'show'  {Route.display(XMLFile,"DisplayRoute",outputFile+".disp");}
	| 'fw' 'show' 'numeric' {Policy.display(XMLFile,"DisplayRulesNumeric",outputFile+".disp");}
	|'fw' 'show' {Policy.display(XMLFile,"DisplayRules",outputFile+".disp");}
	;	
 	
 	
 /*
 ** Code for If-Else Conditional Expression
 ** Author: Chitra Agastya
 **
 */
 condition_statement
 @init
 {
 	IfElse parent, condition;
 	if(g_ifStack.empty())
		parent = null;
	else
 		parent = (IfElse) g_ifStack.peek();
 }
 @final
 {
 	g_action = "";
 	g_ignore_stmt = false;
 }
 	: 'if' '(' val=logicalOR_expr 
    	{
   		condition = new IfElse(parent);
 		if(parent != null)
 			condition.setIgnore(parent.getIgnore());
 		g_ifStack.push(condition);
 		if(!condition.getIgnore())
 		{
 			
	   		if (((IntType)$val.sym.lookupValue()).getValue() == 0)
	   		{
	   			System.out.println("Equality Expr: false"); 
	   			((IfElse)g_ifStack.peek()).setIgnore(true);
	   			g_ignore_stmt = true;
	   			g_action = "else";
	   		}
	   		else
	   		{
	   			System.out.println("Equality Expr: true");
	   			g_ignore_stmt = false;
	   			g_action = "if";
	   		}
	   	}
   	} ')'	
 	if_statement_list ('else' 
 	{
 		//Pop the previous if
 		g_ifStack.pop();
 		condition = new IfElse(parent);
	 	if(parent != null)
 			condition.setIgnore(parent.getIgnore());
 		g_ifStack.push(condition);
 		if((!condition.getIgnore()) && g_action.equals("else"))
 		{
 			g_ignore_stmt = false;
 		}
 		else
 		{
 			g_ignore_stmt = true;
 		}
 	} 
 	if_statement_list)? 'endif'
 	{
 		if(!g_ifStack.empty())
			g_ifStack.pop();
		//No dangling else
 		if(g_ifStack.empty())
 		{
			g_ignore_stmt = false;
		}
		//There is a dangling else. So parse it
		else
		{
			if(((IfElse)g_ifStack.peek()).getIgnore())
				g_ignore_stmt = true;
			else
				g_ignore_stmt = false;
		}
		if(input.LA(1) == ELSE)
		{
			match(input,ELSE,FOLLOW_ELSE_in_condition_statement791);  
			//Check the value of TOS to see if expression was true
			boolean ignoreFlag = ((IfElse)g_ifStack.peek()).getIgnore();
			g_ifStack.pop();
			//Do what you do for else
			if(g_ifStack.empty())
				parent = null;
			else
 				parent = (IfElse) g_ifStack.peek();
	 		condition = new IfElse(parent);
			if(parent != null)
	 			condition.setIgnore(parent.getIgnore());
	 		if(!ignoreFlag)
	 			condition.setIgnore(true);
	 		g_ifStack.push(condition);
	 		if((!condition.getIgnore()) && g_action.equals("else"))
	 		{
	 			g_ignore_stmt = false;
	 		}
	 		else
	 		{
	 			g_ignore_stmt = true;
	 		}
	 		if_statement_list();
	 		g_ifStack.pop();
	 	}			
	}		
 	;
 	
 iteration_statement
 @init
 {
 	int condMet;
 	int start_index;
 	int stmt_index;
 	int end_index;
 	IfElse parent, condition;
 	if(g_ifStack.empty())
		parent = null;
	else
 		parent = (IfElse) g_ifStack.peek();
 }
 @final
 {
 	g_action = "";
 	g_ignore_stmt = false;
 	System.out.println("Setting ignore to false");
 }
 	:'while' 
	{
 		start_index = input.index();
 	}
  	
 	'(' val=equality_expr 
	{
 		stmt_index = input.index();
 	} 	
 	')' 
	{
 		condition = new IfElse(parent);
 		if(parent != null)
 		condition.setIgnore(parent.getIgnore());
 		g_ifStack.push(condition);
 		g_ignore_stmt = condition.getIgnore();
 		if(!g_ignore_stmt)
 		{	
   			if (((IntType)$val.sym.lookupValue()).getValue() == 0)
   			{
   				((IfElse)g_ifStack.peek()).setIgnore(true);
   				g_ignore_stmt = true;
   				g_action = "else";
   			}
   			else
   			{
   				g_ignore_stmt = false;
   				g_action = "if";
   			}
   		}
 	} 	
 	if_statement_list 
	{
 		end_index = input.index();
 	}
 
 	'endwhile'
 	{
 		if(!g_ignore_stmt)
 		{
 			while(((IntType)val.sym.lookupValue()).getValue() == 1)
 			{
 			input.rewind(start_index);
 			match(input,OPAREN,FOLLOW_OPAREN_in_iteration_statement852);  
 			val = equality_expr();
 			if (((IntType)val.sym.lookupValue()).getValue() == 1)
   			{
   				input.rewind(stmt_index);
   				if(input.LA(1) == CPAREN)
   				{
   					match(input,CPAREN,FOLLOW_CPAREN_in_iteration_statement866);  
   					if_statement_list();
   				}
   			}
   			else
   			{
   				input.rewind(stmt_index);
   				if(input.LA(1) == CPAREN)
   				{
   					match(input,CPAREN,FOLLOW_CPAREN_in_iteration_statement866);  
   				}
   				break;
   			}
   			}
   			input.rewind(end_index);
   			if(input.LA(1) == ENDWHILE)
   			{
   				match(input,ENDWHILE,FOLLOW_ENDWHILE_in_iteration_statement886);  
   			}
 		}
  		g_ifStack.pop();
  		g_ignore_stmt = false;
 	}	
 	;
 	
 print_statement
 	:	'echo' STRING  
	{
 		if(!g_ignore_stmt)
 			System.out.println($STRING.text);
 	}';'
 	;
 	
 expression
 	:	assignment_expr
 	;
 	
 assignment_expr
  	: var=object_name op=assignment_operator 
	 {
	 	if(!g_ignore_stmt)
	 	{	 	
	 		Symbol s = currentScope.getSymbol($var.text);
	 		if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$var.text+"  not found");
				System.out.println (" object : "+$var.text+"  not found");
				System.exit(1);
			} 
			Assignment asn = new Assignment(s, $op.text);
			map.put($var.text, asn);
			System.out.println("here");
		//	currentScope.printSymbols();
		}
	}
 	assignment_expr
 	
 	| e=conditional_expr
 	{
 		try
 		{
 			if(!g_ignore_stmt)
 			{
 				System.out.println("Cond expr: " + $e.sym);
	 			Set entries = map.entrySet();
				Iterator iter = entries.iterator();
				while(iter.hasNext() && $e.sym != null)
				{
					Map.Entry entry = (Map.Entry)iter.next();
					String key = (String)entry.getKey();
					//System.out.println(" going to search for symbol with name : "+key);
					//This portion added by Chitra
					if($e.sym.getType().equals("int_type_t") || $e.sym.getType().equals("char_type_t"))
					{
						Assignment asn = (Assignment)entry.getValue();
						asn.assignValue($e.sym);
					}
					else
					{
						Symbol s = new Symbol(key, $e.sym.getType(), $e.sym.lookupValue());
						//-- COMMENT: Somehow this statement is not reflecting a change in the symbol value
						if (currentScope.setSymbolValue(key, s) == -1)	
						{
						     System.out.println(" problem setting symbol : ");
						}
						//System.out.println("Symbol table:  " + s.getName()+" "+ s.getType() + " " + s.getString());
					}
				} //End of While
				map.clear();
			} //End of If
 		}
 		catch(Exception eee)
		{
			eee.printStackTrace();
			System.exit(1);
		}
 	} 	
 	;
 
 
 		
 conditional_expr returns [Symbol sym]
 	:	val1=logicalOR_expr
	{ 
 		if(!g_ignore_stmt)
 			$sym = $val1.sym;
 	} 
 	// Not keeping this construct. We really don't need this	
 	//( '?' expression ':' conditional_expr)?
 	;
 	
 logicalOR_expr returns [Symbol sym]
 	:	val1=logicalAND_expr 	
 	{ 
 		if(!g_ignore_stmt)
 			$sym = $val1.sym;
 	}
 	(op='||' val2=logicalAND_expr
	{
		try
		{
			if(!g_ignore_stmt)
			{
				//System.out.println($val1.text + " " + $val2.text);
				Symbol s = new Symbol("literal", $sym.getType()); 
				Expression expr = new Expression(s, $op.text);
				expr.assignValue($sym, $val2.sym);
				$sym = expr.getSymbol();
			}
		}
		catch(Exception eee)
		{
			 eee.printStackTrace();
			 System.exit(1);
		}
	}  		
 	)*
 	;
 
 logicalAND_expr returns [Symbol sym]
 	:	val1=bitwiseOR_expr 
 	{ 
 		if(!g_ignore_stmt) 
 			$sym = $val1.sym;
 	}
 	(op='&&' val2=bitwiseOR_expr
	{
		try
		{
			if(!g_ignore_stmt)
			{
				//System.out.println($val1.text + " " + $val2.text);
				Symbol s = new Symbol("literal", $sym.getType()); 
				Expression expr = new Expression(s, $op.text);
				expr.assignValue($sym, $val2.sym);
				$sym = expr.getSymbol();
			}
		}
		catch(Exception eee)
		{
			eee.printStackTrace();
			System.exit(1);
		}
	}
	)*  		
 	;
 	
 bitwiseOR_expr returns [Symbol sym]
 	:	val1=bitwiseAND_expr 
 	{ 
 		if(!g_ignore_stmt) 
 			$sym = $val1.sym;
 	}
 	(op='|' val2=bitwiseAND_expr
 	{
 		try
 		{
	 		if(!g_ignore_stmt)
	 		{
				//System.out.println($val1.text + " " + $val2.text);
				Symbol s = new Symbol("literal", $sym.getType()); 
				Expression expr = new Expression(s, $op.text);
				expr.assignValue($sym, $val2.sym);
				$sym = expr.getSymbol();
			}
		}
		catch(Exception eee)
		{
			 eee.printStackTrace();
			 System.exit(1);
			 		}
	}  	
 	)*
 	;
 
 bitwiseAND_expr returns [Symbol sym]
 	:	val1=equality_expr 
 	{ 
 		if(!g_ignore_stmt) 
 			$sym = $val1.sym;
 	}
 	(op='&' val2=equality_expr
	{
 		try
 		{
	 		if(!g_ignore_stmt)
	 		{
				//System.out.println($val1.text + " " + $val2.text);
				Symbol s = new Symbol("literal", $sym.getType()); 
				Expression expr = new Expression(s, $op.text);
				expr.assignValue($sym, $val2.sym);
				$sym = expr.getSymbol();
			}
		}
		catch(Exception eee)
		{
			eee.printStackTrace();
			System.exit(1);
		}		
	}  	
 	)*	
 	;
 	
 equality_expr returns [Symbol sym]
 	:	val1=relational_expr
 	{ 
 		if(!g_ignore_stmt) 
 			$sym = $val1.sym;
 	}
 	( op=('==' | '!=') val2=relational_expr
	{
 		try
 		{
	 		if(!g_ignore_stmt)
	 		{
				//System.out.println($val1.text + " " + $val2.text);
				Symbol s = new Symbol("literal", $sym.getType()); 
				Expression expr = new Expression(s, $op.text);
				expr.assignValue($sym, $val2.sym);
				$sym = expr.getSymbol();
			}
		}
		catch(Exception eee)
		{
			eee.printStackTrace();
			System.exit(1);
		}		
	}  	
 	)*
 	;
 	
 relational_expr returns [Symbol sym]
 	:	val1=expr
 	{ 
 		if(!g_ignore_stmt) 
 			$sym = $val1.sym;
 	}
 	( op=('<'|'>'|'<='|'>=') val2=expr
	{
 		try
 		{
	 		if(!g_ignore_stmt)
	 		{
				//System.out.println($val1.text + " " + $val2.text);
				Symbol s = new Symbol("literal", $sym.getType()); 
				Expression expr = new Expression(s, $op.text);
				expr.assignValue($sym, $val2.sym);
				$sym = expr.getSymbol();
			}
		}
		catch(Exception eee)
		{
			eee.printStackTrace();
			System.exit(1);
		}		
	} 	
 	)*
 	;
 	
 
 expr	returns [Symbol sym]
 	: val1=term 
	{ 
		if(!g_ignore_stmt) 
			$sym = $val1.sym;
	}	 	
 	( op=( PLUS | MINUS )  val2=term 
	{
		try
		{
			if(!g_ignore_stmt)
			{
				//System.out.println($val1.text + " " + $val2.text);
				Symbol s = new Symbol("literal", $sym.getType()); 
				Expression expr = new Expression(s, $op.text);
				expr.assignValue($sym, $val2.sym);
				$sym = expr.getSymbol();
			}
		}
		catch(Exception eee)
		{
			eee.printStackTrace();
			System.exit(1);
		}	
	} 	 	
 	)* 	
 	;
 
 term	returns [Symbol sym]
 	: val1=unary_expr 
 	{ 
 		if(!g_ignore_stmt) 
 			$sym = $val1.sym;
 	}	
 	( op=( MULT | DIV ) val2=unary_expr 
	{
		try
		{
			if(!g_ignore_stmt)
			{
				Symbol s = new Symbol("literal", $sym.getType()); 
				Expression expr = new Expression(s, $op.text);
				expr.assignValue($sym, $val2.sym);
				$sym = expr.getSymbol();
			}
		}
		catch(Exception eee)
		{
			eee.printStackTrace();
			System.exit(1);
		}		
	} 	
 	)* 	
 	;
 
 unary_expr returns [Symbol sym]
 	:val1=postfix_expression
 	{ 
 		if(!g_ignore_stmt) 
 			$sym = $val1.sym;
 	}
 	|	'~' unary_expr
 	//|	'-' unary_expr 
 	//|	'!' unary_expr
 	;
 
 postfix_expression returns [Symbol sym]
 	:	e=factor ('.'ID)*		
 	{ 
 		if(!g_ignore_stmt) 
 			$sym = $e.sym;
 	}
 	;
 
 assignment_operator
 	:	'='
 	|	'*='
 	|	'/='
 	|	'+='
 	|	'-='
 	;
 
 factor	returns [Symbol sym]
	: ID
	{
		if(!g_ignore_stmt)
		{
			Symbol s = currentScope.getSymbol($ID.text);
			if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$ID.text+"  not found");
				System.out.println (" object : "+$ID.text+"  not found");
				System.exit(1);
			} 
			$sym = s;
		}
	}
 	| e=literal		{ if(!g_ignore_stmt) $sym = $e.sym;}
 	//| '('e=expression ')'	//{ if(!g_ignore_stmt) $sym = $e.sym;}
 	;
 
 literal returns [Symbol sym]
 	:	e=object_values	{ if(!g_ignore_stmt) $sym = $e.sym;}
 	;

declr_stmt
	:
	{int count_com = 0;}
	type_name var_name=object_name
	{
		//System.out.println(" type : " + $type_name.text +" var : "+ $var_name.text);
		if(!g_ignore_stmt)
		{
			currentScope.defineSymbol($var_name.text, $type_name.text);
		}
	}
	(',' {count_com++;} next_var=object_name
	{
		if(!g_ignore_stmt)
		{
			if((count_com > 0) && (next_var != null))			
              			currentScope.defineSymbol($next_var.text, $type_name.text);
              	}
	} 
	)* 
	';' 
	;

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
	{ if(!g_ignore_stmt) $sym = $char_value.sym; }
	| int_value	
	{ if(!g_ignore_stmt) $sym = $int_value.sym; }
	| STRING
	| ip_addr
	{ if(!g_ignore_stmt) $sym = $ip_addr.sym; }
	| policy   
	{ if(!g_ignore_stmt) $sym = $policy.sym;}
	| host   
	{ if(!g_ignore_stmt) $sym = $host.sym ; }
	| context 
	{ if(!g_ignore_stmt) $sym=$context.sym;}/* Similarly with other types */
	| host_group 
	{ if(!g_ignore_stmt) $sym = $host_group.sym;} 
	| topology 
	{if(!g_ignore_stmt) $sym = $topology.sym;}
	| serv_group 
	{ if(!g_ignore_stmt) $sym = $serv_group.sym;}
	| interf 
	{ if(!g_ignore_stmt) $sym = $interf.sym;}
	| route 
	{ if(!g_ignore_stmt) $sym = $route.sym;}
	;


context returns [Symbol sym] 
@init
{ 
	Vector <Policy> policies;
	policies = new Vector <Policy>() ;	     
 }
	 :
	'context' '{' ((p_i=policy 
	{ 
		if(!g_ignore_stmt)
		{
			policies.add((Policy)p_i.lookupValue());
		}
	}
	)|(var=object_name
	{
		if(!g_ignore_stmt)
		{
			Symbol s2 = currentScope.getSymbol($var.text);
			if ( s2 == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$var.text+"  not found");
				System.out.println (" object : "+$var.text+"  not found");
				System.exit(1);
			} 
			String st=s2.getType();
			try
			{
				if((st.equals("policy_type_t")!=true))
				{
					throw(new DataFormatException("rule:context"));
				}
			}
			catch(DataFormatException dfe)
			{
				System.out.println(dfe);
				dfe.printStackTrace();
		 		System.exit(1);
			}
			Policy p3=(Policy)s2.lookupValue();
			policies.add(p3);
		}
	}
	)) 
	(  ','  ((p_j=policy 
	{
		if(!g_ignore_stmt)
		{
			policies.add((Policy)p_j.lookupValue());
		}
	}
	)|(var2=object_name
	{
		if(!g_ignore_stmt)
		{
			Symbol s3 = currentScope.getSymbol($var2.text);
			if ( s3 == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$var2.text+"  not found");
				System.out.println (" object : "+$var2.text+"  not found");
				System.exit(1);
			} 
			String st=s3.getType();
			try
			{
				if((st.equals("policy_type_t")!=true))
				{
					throw(new DataFormatException("rule:context"));
		//	  System.out.println("added"+p3.verdict);
				}
			}
			catch(DataFormatException dfe)
			{
				System.out.println(dfe);
				dfe.printStackTrace();
				System.exit(1);
			}
			Policy p4=(Policy)s3.lookupValue();
			policies.add(p4);
		}
	}
	)) )* '}'
	{
		if(!g_ignore_stmt)
		{
			Context context = new Context (policies);
			Symbol s = new Symbol ("context_type_t","context_type_t",context);
			$sym = s;  		
		}
	}
	
	;
//policy  :	direction verdict proto (port)?  ;//ip_addr 'netmask' src_netmask=ip_addr  sport=(port)?;
/* Policy which can be used for RBAC as well as traditional FIREWALL / PACKET FILTER policies */

policy returns [Symbol sym]	
@init
{
  	String sp = "0";
  	String dp = "0";
  	Ipaddress dip;
  	dip  = new Ipaddress("0.0.0.0") ;
  	Ipaddress dnetmask ;
  	dnetmask = new Ipaddress("0.0.0.0");
  	Ipaddress sip ;
  	sip = new Ipaddress("0.0.0.0");
  	Ipaddress snetmask;
  	snetmask = new Ipaddress("0.0.0.0");
 }
	: 
  	dir=direction verd=verdict protocol=proto 
  	('dst' 
  	  ((dst_ip = ip_addr 
  	  { 
  	  	if(!g_ignore_stmt)
  	  	{
  	  		dip = new Ipaddress($dst_ip.text);
  	  	}
  	  })  	| 
  	  (dip_obj = object_name
  	  { 
  	  	if(!g_ignore_stmt)
  	  	{
	  	  	Symbol s = currentScope.getSymbol($dip_obj.text);   
	  	  	
	  	   
	  	  	if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$dip_obj.text+"  not found");
				System.out.println (" object : "+$dip_obj.text+"  not found");
				System.exit(1);
			} 
	  	    
			try
			{  /* Check fot type exceptions in ip_address */
				if(s.getType().equals ("ipaddr_t") != true) 
				{ 
					throw (new DataFormatException("policy : tcp/udp:destip"));
				}
		 	}
			catch (DataFormatException dfe)
		  	{
		 		System.out.println(dfe);
		   	}
	  	   	
	  	   	dip = (Ipaddress) s.lookupValue(); 
		}
	}))
  	'netmask' ((dnetmask_ip=ip_addr 
  	{
  		if(!g_ignore_stmt)
  		{
  			dnetmask = new Ipaddress($dnetmask_ip.text);
  		}
  	})|
  	(dnetmask_ip_obj = object_name 
  	{
  		if(!g_ignore_stmt)
  		{
  			Symbol s = currentScope.getSymbol($dnetmask_ip_obj.text);  
	  	  	if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$dnetmask_ip_obj.text+"  not found");
			System.out.println (" object : "+$dnetmask_ip_obj.text+"  not found");
				System.exit(1);
			} 
	  	    
	  	   	try
	  	   	{  /* Check fot type exceptions in ip_address */
		  		if(s.getType().equals ("ipaddr_t") != true) 
		  		{ 
		  			throw (new DataFormatException("policy : tcp/udp:dest_netmask"));
		  		}
		  	}
		  	catch (DataFormatException dfe)
		  	{
		  		System.out.println(dfe);
		   	}
			dnetmask = (Ipaddress) s.lookupValue();
		}
  	}))
	((dport=port 
	{
		if(!g_ignore_stmt)
		{
			dp = new String($dport.text);
		}
	} ) | ('all')) ) ?
  	('src'
  	((src_ip = ip_addr 
  	{
  		if(!g_ignore_stmt)
  		{
  			sip = new Ipaddress($src_ip.text);
  		}
  	})  	| 
  	(sip_obj = object_name
  	{ 
  		if(!g_ignore_stmt)
  		{
		  	Symbol s = currentScope.getSymbol($sip_obj.text);     
		  	if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$sip_obj.text+"  not found");
				System.out.println (" object : "+$sip_obj.text+"  not found");
				System.exit(1);
			} 
		  	    
		  	try
		  	{  /* Check fot type exceptions in ip_address */
				if(s.getType().equals ("ipaddr_t") != true) 
			  	{ 
			  		throw (new DataFormatException("policy : tcp/udp:srcip"));
			  	}
			}
			catch (DataFormatException dfe)
			{
				System.out.println(dfe);
			} 	   
		  	sip = (Ipaddress) s.lookupValue(); 
		  }
	}))   
  	 'netmask' ((snetmask_ip=ip_addr 
  	 {
  	 	if(!g_ignore_stmt)
  	 	{
  	 		snetmask = new Ipaddress($snetmask_ip.text);
  	 	}
  	 })|
  	  (snetmask_ip_obj = object_name 
  	  {
  	  	if(!g_ignore_stmt)
  	  	{
	  		Symbol s = currentScope.getSymbol($snetmask_ip_obj.text);  
	  	 	if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$snetmask_ip_obj.text+"  not found");
				System.out.println (" object : "+$snetmask_ip_obj.text+"  not found");
				System.exit(1);
			} 
	  	    
			try
			{  /* Check fot type exceptions in ip_address */
				if(s.getType().equals ("ipaddr_t") != true) 
				{ 
					throw (new DataFormatException("policy : tcp/udp:snetmask"));
				}
		  	}
		 	catch (DataFormatException dfe)
		 	{
		   		System.out.println(dfe);
		   	}
	  	  	snetmask = (Ipaddress) s.lookupValue();
	  	  }
	})) 	
  	  ((sport=port 
  	  {
  	  	if(!g_ignore_stmt)
  	  	{
  	  		sp = new String($sport.text);
  	  	}
  	  } ) | ('all')) ) ?
	{
		if(!g_ignore_stmt)
		{
			System.out.println ($dir.text+$verd.text+$protocol.text+sip.getString()+snetmask.getString()+
	                                      sp+dip.getString()+ dnetmask.getString()+dp);
			Policy pl = new Policy($dir.text,$verd.text, $protocol.text, sip.getString(),snetmask.getString(),
				              sp,dip.getString(),dnetmask.getString(),dp);		
		
		 	Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
			$sym = s;
		}
	}
	| 
	/*{
		if(!g_ignore_stmt)
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
	}*/	
	dir=direction verd=verdict icmp_mesg=icmp_cntrl_message  
	('dst' 
  	  ((dst_ip = ip_addr 
  	  { 
  	  	if(!g_ignore_stmt)
  	  	{
  	  		dip = new Ipaddress($dst_ip.text);
  	  	}
  	  })  	| 
  	  (dip_obj = object_name
  	  { 
  	  	if(!g_ignore_stmt)
  	  	{
  	  		Symbol s = currentScope.getSymbol($dip_obj.text); 
		  	if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$dip_obj.text+"  not found");
			System.out.println (" object : "+$dip_obj.text+"  not found");
				System.exit(1);
			} 
		  	    
		  	try
		  	{  /* Check fot type exceptions in ip_address */
				if(s.getType().equals ("ipaddr_t") != true) 
			  	{ 
			  		throw (new DataFormatException("policy : icmp:destip"));
			  	}
			}
			catch (DataFormatException dfe)
			{
				System.out.println(dfe);
			}   
			dip = (Ipaddress) s.lookupValue(); 
		}
	}))		   
  	 'netmask' ((dnetmask_ip=ip_addr 
  	 {
  	 	if(!g_ignore_stmt)
  	 	{
			dnetmask = new Ipaddress($dnetmask_ip.text);
		}
	})|
  	(dnetmask_ip_obj = object_name 
	{
		if(!g_ignore_stmt)
		{
			Symbol s = currentScope.getSymbol($dnetmask_ip_obj.text); 
		  	if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$dnetmask_ip_obj.text+"  not found");
				System.out.println (" object : "+$dnetmask_ip_obj.text+"  not found");
				System.exit(1);
			} 
		  	    
		  	try
		  	{  /* Check fot type exceptions in ip_address */
				if(s.getType().equals ("ipaddr_t") != true) 
			  	{ 
			  		throw (new DataFormatException("policy : icmp:dnetmask"));
			  	}
			}
			catch (DataFormatException dfe)
			{
				System.out.println(dfe);
			}  
		  	dnetmask = (Ipaddress) s.lookupValue();
		}
	})))?
  	('src'
  	((src_ip = ip_addr 
  	{ 
  		if(!g_ignore_stmt)
  		{
  			sip = new Ipaddress($src_ip.text);
  		}
  	})  | 
  	(sip_obj = object_name
  	{ 
  		if(!g_ignore_stmt)
  		{
  			Symbol s = currentScope.getSymbol($sip_obj.text);  
	  	  	if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$sip_obj.text+"  not found");
				System.out.println (" object : "+$sip_obj.text+"  not found");
				System.exit(1);
			} 
	  	    
	  	   	try
	  	   	{  /* Check fot type exceptions in ip_address */
		  		if(s.getType().equals ("ipaddr_t") != true) 
		  		{ 
		  			throw (new DataFormatException("policy : icmp:srcip"));
		  		}
		  	}
		  	catch (DataFormatException dfe)
		  	{
		  		System.out.println(dfe);
		   	}
			sip = (Ipaddress) s.lookupValue(); 
		}
	}))
	'netmask' ((snetmask_ip=ip_addr 
	{
		if(!g_ignore_stmt)
		{
			dnetmask = new Ipaddress($snetmask_ip.text);
		}
	})|
	(snetmask_ip_obj = object_name 
  	{
  		if(!g_ignore_stmt)
  		{
	  		Symbol s = currentScope.getSymbol($snetmask_ip_obj.text);  
	  	  	if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$snetmask_ip_obj.text+"  not found");
				System.out.println (" object : "+$snetmask_ip_obj.text+"  not found");
				System.exit(1);
			} 
	  	    
	  	   	try
	  	   	{  /* Check fot type exceptions in ip_address */
		  		if(s.getType().equals ("ipaddr_t") != true) 
		  		{ 
		  			throw (new DataFormatException("policy : icmp:snetmask"));
		  		}
		  	}
		  	catch (DataFormatException dfe)
		  	{
		   		System.out.println(dfe);
		    	    	dfe.printStackTrace();
		 	    	System.exit(1);
		   	}
			snetmask = (Ipaddress) s.lookupValue();
		}
	})))?
	{
		if(!g_ignore_stmt)
		{
			Policy pl = new Policy($dir.text,$verd.text, $icmp_mesg.text, dip.getString(),dnetmask.getString(),
			               sip.getString(),snetmask.getString());		
	
			Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
			$sym = s;
		}
	}	
	;	
	
topology  returns [Symbol sym]
@init
{
	Hostgroup hg;
	Servicegroup sg;
	Context cxt;
	hg = null;
	sg = null;
	cxt =null;
}
	:	
	(
	('host_group' ((host_group_sym=host_group 
	{
		if(!g_ignore_stmt)
		{
			hg = (Hostgroup)host_group_sym.lookupValue();
		}	
	}) 
	|( host_group_obj=object_name  
	{
		if(!g_ignore_stmt)
		{
			Symbol s  = currentScope.getSymbol ($host_group_obj.text); 
			if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$host_group_obj.text+"  not found");
				System.out.println (" object : "+$host_group_obj.text+"  not found");
				System.exit(1);
			} 
		
			try
			{
		  		if(s.getType().equals ("host_group_type_t") != true) 
		  		{ 
		  			throw (new DataFormatException("rule : host"));
		  		}
		  	}
		  	catch (DataFormatException dfe)
		  	{
		   		System.out.println(dfe);
		    		dfe.printStackTrace();
	 	   		System.exit(1);
		    	}
			hg = (Hostgroup) s.lookupValue(); 
		}
	})))
	('context' ((cxt_sym=context 
	{
		if(!g_ignore_stmt)
		{
			cxt = (Context) cxt_sym.lookupValue(); 
		}	
	})| 
	 ( cxt_obj = object_name 
	 {
	 	if(!g_ignore_stmt)
	 	{
			Symbol s = (Symbol)currentScope.getSymbol ($cxt_obj.text);
			if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$cxt_obj.text+"  not found");
				System.out.println (" object : "+$cxt_obj.text+"  not found");
				System.exit(1);
			} 
			try
			{
				if(s.getType().equals ("context_type_t") != true) 
				{ 
					throw (new DataFormatException("rule : topology: host:context"));
				}
		  	}
		  	catch (DataFormatException dfe)
		  	{
		   		System.out.println(dfe);
		    		dfe.printStackTrace();
	 	    		System.exit(1);
	    		} 
			cxt = (Context) s.lookupValue(); 
		}
	} )))
	{
		if(!g_ignore_stmt)
		{
			 if(hg == null)
			 {
			 	System.out.println("hg is null");	
			 }
			 if(cxt == null)
			 {
			 	System.out.println("cxt  is null");	
			 }
			 Topology topology = new Topology(hg,cxt);
			 Symbol s = new Symbol("topology_host_group_context","topology_type_t",topology);
			 $sym = s;	
		}
	})
	| 
	/*{
		if(!g_ignore_stmt)
		{
			Hostgroup hg;
			Servicegroup sg;
			Context cxt;
			hg = null;
			sg = null;
			cxt = null;
		}
	}*/
	(('serv_group' ((serv_group_sym=serv_group 
	{
		if(!g_ignore_stmt)
		{
			sg = (Servicegroup)serv_group_sym.lookupValue();
		}
	}) 
	|( serv_group_obj=object_name  
	{
		if(!g_ignore_stmt)
		{
			Symbol s  = currentScope.getSymbol ($serv_group_obj.text); 
			if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$serv_group_obj.text+"  not found");
				System.out.println (" object : "+$serv_group_obj.text+"  not found");
				System.exit(1);
			} 
			try
			{
				if(s.getType().equals ("serv_group_type_t") != true) 
			  	{ 
			  		throw (new DataFormatException("rule : topology : servgroup:context"));
			  	}
			}
			catch (DataFormatException dfe)
			{
				System.out.println(dfe);
			     	dfe.printStackTrace();
		 	    	System.exit(1); 
			}
			sg = (Servicegroup) s.lookupValue(); 
		}
	})))
	('context' ((cxt_sym=context 
	{
		if(!g_ignore_stmt)
		{
			cxt = (Context) cxt_sym.lookupValue(); 
		}
	})| 
	 ( cxt_obj = object_name 
	 {
	 	if(!g_ignore_stmt)
	 	{
			 Symbol s = (Symbol)currentScope.getSymbol ($cxt_obj.text);
			 if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$cxt_obj.text+"  not found");
				System.out.println (" object : "+$cxt_obj.text+"  not found");
				System.exit(1);
			} 
			 
			 try
			 {
			 	if(s.getType().equals ("context_type_t") != true) 
			  	{ 
			  		throw (new DataFormatException("rule : topology:servgroup:context"));
			  	}
			 }
			 catch (DataFormatException dfe)
			 {
			 	System.out.println(dfe);
			   	dfe.printStackTrace();
		 	    	System.exit(1);
			 }
		 	cxt = (Context) s.lookupValue(); 
		 }
	}) ))
	 )
	 {
	 	if(!g_ignore_stmt)
	 	{
		 	Topology topology = new Topology(sg,cxt);
			 Symbol s = new Symbol("topology_serv_group_context","topology_type_t",topology);
			 $sym = s;
		}
	 }
	;

/* adding integers and characters */
int_value returns [Symbol sym]
	:	e=NUMBER 
		{
			if(!g_ignore_stmt)
			{
				Integer v = Integer.parseInt($e.text);
				IntType temp = new IntType(v);
				Symbol s = new Symbol("literal", "int_type_t", temp);
				$sym = s;
				return $sym;
			}
		}
	;

char_value  returns [Symbol sym]
	:	e=CHAR
		{
			if(!g_ignore_stmt)
			{
				String str = $e.text;
				if(str.length() != 3)
					System.out.println("Error in character input");
				else 
				{
					CharType temp = new CharType(str.charAt(1));
					Symbol s = new Symbol("literal", "char_type_t", temp);
					$sym = s;
					System.out.println(s);
					return $sym;
				}	
			}
		}
	; //requires object name here as well  for something like : char x = y; 


direction
	:	'inbound' 
	| 	'outbound'
	;

verdict returns [String verd] 
	: 	'allow' 	{ if(!g_ignore_stmt) $verd = new String("allow"); }
	| 	'deny' 		{ if(!g_ignore_stmt) $verd = new String ("deny"); }
	;

proto   :  'udp'
	| 'tcp' ;

icmp_cntrl_message 	
	:	ICMP_MESSAGE_TYPE
	;

port	:	NUMBER;


object_name returns [String obj_name]
	:  ID	
	{ 
		if(!g_ignore_stmt)
		{
			$obj_name = new String ($ID.text);
		}
	}
	;


ip_addr    returns [Symbol sym]:  (a=NUMBER)DOT(b=NUMBER)DOT(c=NUMBER)DOT(d=NUMBER) 
	{
		if(!g_ignore_stmt)
		{	
			Ipaddress ip = new Ipaddress($a.text+"."+$b.text+"."+$c.text+"."+$d.text);
		//	System.out.println (" ip address being sent : "+ip.getString());
			Symbol s = new Symbol("ip_addr_string", "ipaddr_t", ip);
			$sym = s;
	//		return $sym;
		}
	}
	
	;

nmask	: 'netmask' ip_addr;//NM LETTER+;

host	returns [Symbol sym]:
	{
		boolean ip_object_used =false, netmask_object_used = false;
	}	
	'ip_addr' (ip_string=ip_addr|(ip_obj=object_name 
	{
		ip_object_used=true; 
	} 
	)) 'netmask' (netmask_string=ip_addr | 
	 (netmask_ip_obj = object_name {netmask_object_used = true;}))
	{
		if(!g_ignore_stmt)
		{
			Host h;
			if(ip_object_used == true && netmask_object_used ==false)
			{
				Symbol s = currentScope.getSymbol($ip_obj.text);
				if ( s == null)
	  	   	{
				//System.out.println ("Line :"+RecognitionException.input+": object : "+$ip_obj.text+"  not found");
				System.out.println (" object : "+$ip_obj.text+"  not found");
				System.exit(1);
			} 
		 
				/* Check for type error  in ipaddres*/
		 		try
		 		{
		  			if(s.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : host"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
		    			dfe.printStackTrace();
	 	    			System.exit(1);
		   		}
		   
				Ipaddress ip = (Ipaddress) s.lookupValue();
				h = new Host	( ip.getString(),$netmask_string.text);
				Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
				$sym = s_ret;
			}
			else if (ip_object_used == false  && netmask_object_used ==true)
			{
		      		Symbol s = currentScope.getSymbol($netmask_ip_obj.text);
		      		if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$netmask_ip_obj.text+"  not found");
				System.out.println (" object : "+$netmask_ip_obj.text+"  not found");
				System.exit(1);
			} 
		      	  
	      	 		/* Check for type error in netmask  */
	      	   		try
	      	   		{
		  			if(s.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : host"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		 		{
		   			System.out.println(dfe);
		   			dfe.printStackTrace();
	 	    			System.exit(1);
		   		}
	      	  
		  		Ipaddress ip = (Ipaddress) s.lookupValue();
		  		h = new Host	( $ip_string.text,ip.getString());
		  		Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
		  		$sym = s_ret;
			}
			else if(ip_object_used ==true && netmask_object_used ==true)
			{
		
		  		Symbol s_ip =  currentScope.getSymbol($ip_obj.text);
		  		if ( s_ip == null)
	  	   	{
	  	   	System.out.println (" object : "+$ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$ip_obj.text+"  not found");
				System.exit(1);
			} 
		
		 		try
		 		{  
		 			/* Check fot type exceptions in ip_address */
		  			if(s_ip.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : host"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
		    			dfe.printStackTrace();
	 	    			System.exit(1);
		   		}
		  		Ipaddress ip = (Ipaddress) s_ip.lookupValue();
		 
	  	  		Symbol s_nmask = currentScope.getSymbol($netmask_ip_obj.text);
	  	  		if ( s_nmask == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$netmask_ip_obj.text+"  not found");
				System.out.println (" object : "+$netmask_ip_obj.text+"  not found");
				System.exit(1);
			} 
		
		 		try
		 		{  	/* Check for type exception in netmask  */
		  			if(s_nmask.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : host"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
		   			dfe.printStackTrace();
	 	    			System.exit(1); 
		   		}
			  	Ipaddress nmask = (Ipaddress) s_nmask.lookupValue();
			 	h = new Host	( ip.getString(),nmask.getString());
			 	Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
			 	$sym = s_ret;
			}
			else
			{
				h = new Host ($ip_string.text,$netmask_string.text); //usure about the text error
				Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
				
				/* Check for type exceptions */
				  
				$sym = s_ret;
			}
		}
	}
	;

dns_set	: ip_addr (','  ip_addr)*;

gateway	: ip_addr (',' ip_addr)*;


host_group returns [Symbol sym]
@init
{
	Vector <Host> hosts;
	hosts = new Vector <Host> ();
}
	: 
	'host_group'  '{'( i=host  
	{
		if(!g_ignore_stmt)
		{
			hosts.add((Host)i.lookupValue()); 
		}
	}| (host_obj_i=object_name 
	{
		if(!g_ignore_stmt)
		{
			Symbol hostsym =  currentScope.getSymbol($host_obj_i.text);
			if ( hostsym == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$host_obj_i.text+"  not found");
				System.out.println (" object : "+$host_obj_i.text+"  not found");
				System.exit(1);
			} 
			
			try
			{ 
				if(hostsym.getType().equals ("host_type_t") != true) 
			  	{ 
			  		throw (new DataFormatException("rule : host_group"));
			  	}
		  	}
		  	catch (DataFormatException dfe)
		  	{
		   		System.out.println(dfe);
		    		dfe.printStackTrace();
	 	    		System.exit(1); 
		   	}
			Host host = (Host) hostsym.lookupValue();
			hosts.add(host);
		}
	}
	))
	 (',' (j=host 
	 {
	 	if(!g_ignore_stmt)
	 	{
	 		hosts.add((Host)j.lookupValue());
	 	}
	 } 
	 | (host_obj_j = object_name
	 {
	
		if(!g_ignore_stmt)
		{
			Symbol hostsym =  currentScope.getSymbol($host_obj_j.text);
			if ( hostsym == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$host_obj_j.text+"  not found");
				System.out.println (" object : "+$host_obj_j.text+"  not found");
				System.exit(1);
			} 
			
			try
			{ 
				if(hostsym.getType().equals ("host_type_t") != true) 
			  	{ 
			  		throw (new DataFormatException("rule : host_group"));
			  	}
			}
			catch (DataFormatException dfe)
			{
				System.out.println(dfe);
				dfe.printStackTrace();
			 	System.exit(1);
			}
			Host host = (Host) hostsym.lookupValue();
			hosts.add(host); 
		}
	}
	)))* '}'         //   ( 'DNS'  '{' dns_set '}' )?  ( 'GATEWAY' '{' gateway '}')? 
	{
		if(!g_ignore_stmt)
		{
			Hostgroup hgroup = new Hostgroup (hosts);
			Symbol s = new Symbol ("host_group_type_t","host_group_type_t",hgroup);
			$sym = s;  		
		}
	}
	;

interf returns [Symbol sym]
@init
{ 
	Vector <Ipaddress> dns_ip;
     	dns_ip = new Vector <Ipaddress>() ;	     
     	boolean dns_used = false;
     	boolean defgw_used = false;
     	Interface iface;
}
	: 
	 'ifname' (interface_name=ID) 
	 {
	 	if(!g_ignore_stmt)
	 	{
	 		System.out.println($interface_name.text);
	 	}
	 } interface_ip= ip_addr 'netmask' interface_netmask= ip_addr 
	( 'dns'  '{' i=ip_addr 
	{
		if(!g_ignore_stmt)
		{
		dns_ip.add(new Ipaddress($i.text));
		}
	}  
	( ','  j=ip_addr
	{
		if(!g_ignore_stmt)
		{
			dns_ip.add(new Ipaddress($j.text));
		}
	} )* '}' 
	{dns_used = true;}  )* 
	( 'defgw'  gw_ip=ip_addr {defgw_used = true;})*
	{
		if(!g_ignore_stmt)
		{
			String interf_name = $interface_name.text;
			String interf_ip = $interface_ip.text;
			String interf_netmask = $interface_netmask.text;
			String interf_gw = null;
			if(defgw_used == true)
			{
				interf_gw = $gw_ip.text;
			}
			if(dns_used == true)
			{
				iface = new Interface (interf_name,interf_ip,interf_netmask,interf_gw, dns_ip);
			}
			else
			{
				iface = new Interface (interf_name,interf_ip,interf_netmask,interf_gw, null);
			}
			
			Symbol s = new Symbol("interface_descriptor", "interface_type_t", iface);
			$sym = s;  
		}
	} ;
  
route returns [Symbol sym]	
@init
{

	boolean ip_object_used , gw_object_used,nm_object_used ;
	ip_object_used = false;
	gw_object_used = false;
	nm_object_used=false;
}
	: 
	'host' (dst=ip_addr|(ip_obj =object_name 
	{ip_object_used=true;})) 'gw' (gw=ip_addr|(gw_ip_obj = object_name{gw_object_used=true;}))
	{
		if(!g_ignore_stmt)
		{	
			if(ip_object_used == true && gw_object_used ==false)
			{
			  	Symbol s = currentScope.getSymbol($ip_obj.text);
			  	if ( s == null)
	  	   	{
				//System.out.println ("Line :"+input.line+": object : "+$ip_obj.text+"  not found");
				System.out.println (" object : "+$ip_obj.text+"  not found");
				System.exit(1);
			} 
			 
			 	/* Check for type error  in ipaddres*/
				try
				{
			  		if(s.getType().equals ("ipaddr_t") != true) 
			  		{ 
			  			throw (new DataFormatException("rule : route:host"));
			  		}
			  	}
			  	catch (DataFormatException dfe)
			  	{
			   		System.out.println(dfe);
			   		dfe.printStackTrace();
		 	    		System.exit(1); 
			    	}
			   
			  	Ipaddress ip = (Ipaddress) s.lookupValue();
			  	Route rh = new Route (ip.getString(),$gw.text);
			  	Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
			 	$sym = s_ret;
			
			}
			else if (ip_object_used == false  && gw_object_used ==true)
			{
	      	  		Symbol s = currentScope.getSymbol($gw_ip_obj.text);
	      	  		if ( s == null)
	  	   	{
	  	   	System.out.println (" object : "+$gw_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$gw_ip_obj.text+"  not found");
				System.exit(1);
			} 
	      	  
				/* Check for type error in netmask  */
			      	try
			      	{
					if(s.getType().equals ("ipaddr_t") != true) 
				  	{ 
				  		throw (new DataFormatException("rule : route:host"));
				  	}
				}
				catch (DataFormatException dfe)
				{
					System.out.println(dfe);
				   	dfe.printStackTrace();
			 	   	System.exit(1);  
				}
	      	  
				Ipaddress gwip = (Ipaddress) s.lookupValue();
				Route rh = new Route ($ip_obj.text,gwip.getString());//it should be $dst.text instead of ip_obj
				Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
				$sym = s_ret;
			}
			else if(ip_object_used ==true && gw_object_used ==true)
			{
		
		  		Symbol dst_ip =  currentScope.getSymbol($ip_obj.text);
		  		if ( dst_ip == null)
	  	   	{
	  	   	System.out.println (" object : "+$ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$ip_obj.text+"  not found");
				System.exit(1);
			} 
		
		 		try
		 		{
		 			/* Check fot type exceptions in ip_address */
		  			if(dst_ip.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:host"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
				{
					System.out.println(dfe);
					dfe.printStackTrace();
			 	   	System.exit(1);
				}
				Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
			  	Symbol dst_gw = currentScope.getSymbol($gw_ip_obj.text);
			  	if ( dst_gw == null)
	  	   	{
	  	   	System.out.println (" object : "+$gw_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$gw_ip_obj.text+"  not found");
				System.exit(1);
			} 
				
		 		try
		 		{  /* Check for type exception in netmask  */
		  			if(dst_gw.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:host"));
		  			}
		  		}
		 		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
					dfe.printStackTrace();
				 	System.exit(1);
		   		}	  
				Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();	 
		 		Route rh = new Route (ip.getString(),gwip.getString());
		 		Symbol s_ret = new Symbol("route_host_string", "host_type_t", rh);
		 		$sym = s_ret;
		
			}
		 	else
		 	{
			 	Route rh = new Route ($dst.text, $gw.text);
			  	Symbol s_ret = new Symbol("host_route_string", "route_type_t", rh);
			  	$sym = s_ret;
		  	}
		}
	}		
	|
	/*{
		 boolean  ip_object_used,nm_object_used , gw_object_used ;
		 ip_object_used = false;
		 nm_object_used = false;
		 gw_object_used = false;
	}*/ 
	
	 'net' (dst=ip_addr|(ip_obj=object_name{ip_object_used=true;})) 'netmask' (netmask_ip=ip_addr|(nm_ip_obj=object_name{nm_object_used=true;})) 
	 'gw' (gw= ip_addr|(gw_ip_obj=object_name{gw_object_used=true;}))
	{
	 	if(!g_ignore_stmt)
	 	{
		 	if((ip_object_used ==true )&& (nm_object_used==false) && (gw_object_used==false))
		 	{
		 		Symbol s = currentScope.getSymbol($ip_obj.text);
		 		if ( s == null)
	  	   	{
	  	   	System.out.println (" object : "+$ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$ip_obj.text+"  not found");
				System.exit(1);
			} 
		 
		 		try
		 		{
		  			if(s.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:net"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
				    	dfe.printStackTrace();
				    	System.exit(1);
		    		}
				Ipaddress ip = (Ipaddress) s.lookupValue();
				Route rn = new Route (ip.getString(),$netmask_ip.text,$gw.text);
				Symbol s_ret = new Symbol("route_net_string", "route_type_t", rn);
		 		$sym = s_ret;
			}
			else if(ip_object_used ==false && nm_object_used==true && gw_object_used==false)
			{
				Symbol s = currentScope.getSymbol($nm_ip_obj.text);
				if ( s == null)
	  	   	{
	  	   	System.out.println (" object : "+$nm_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$nm_ip_obj.text+"  not found");
				System.exit(1);
			} 
		      	  
		      	 	/* Check for type error in netmask  */
		      	   	try
		      	   	{
			  		if(s.getType().equals ("ipaddr_t") != true) 
			  		{ 
			  			throw (new DataFormatException("rule : route:net"));
			  		}
			  	}
			  	catch (DataFormatException dfe)
			  	{
			   		System.out.println(dfe);
		    	    		dfe.printStackTrace();
		 	    		System.exit(1);
			   	}
		      	  	Ipaddress nmip = (Ipaddress) s.lookupValue();
				Route rn = new Route ($dst.text,nmip.getString(),$gw.text);
				Symbol s_ret = new Symbol("route_net_string", "route_type_t", rn);
				$sym = s_ret;
			}
		 	else if(ip_object_used ==false && nm_object_used==false && gw_object_used==true)
		 	{
				Symbol s = currentScope.getSymbol($gw_ip_obj.text);
				if ( s == null)
	  	   	{
	  	   	System.out.println (" object : "+$gw_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$gw_ip_obj.text+"  not found");
				System.exit(1);
			} 
	      	  
	      	  		/* Check for type error in netmask  */
				try
				{
		  			if(s.getType().equals ("ipaddr_t") != true) 
					{ 
						throw (new DataFormatException("rule : route:net"));
					}
				}
				catch (DataFormatException dfe)
				{
					System.out.println(dfe);
				    	dfe.printStackTrace();
				 	System.exit(1);
				}
				Ipaddress gwip = (Ipaddress) s.lookupValue();
				Route rh = new Route ($dst.text,$netmask_ip.text,gwip.getString());
				Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
				$sym = s_ret;			 
		 	}
		 	else if(ip_object_used ==true && nm_object_used==true && gw_object_used==false)
		 	{ 	 	
		 		Symbol dst_ip =  currentScope.getSymbol($ip_obj.text);
		 		if ( dst_ip == null)
	  	   	{
	  	   	System.out.println (" object : "+$ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$ip_obj.text+"  not found");
				System.exit(1);
			} 
				try
				{  /* Check fot type exceptions in ip_address */
					if(dst_ip.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:net"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
					dfe.printStackTrace();
				 	System.exit(1);
		   		}
		  		Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
	  	  		Symbol dst_nm = currentScope.getSymbol($nm_ip_obj.text);
	  	  		if ( dst_nm == null)
	  	   	{
	  	   	System.out.println (" object : "+$nm_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$nm_ip_obj.text+"  not found");
				System.exit(1);
			} 
		
		 		try
		 		{  /* Check for type exception in netmask  */
					if(dst_nm.getType().equals ("ipaddr_t") != true) 
				  	{ 
				  		throw (new DataFormatException("rule : route:net"));
				  	}
				}
				catch (DataFormatException dfe)
				{
					System.out.println(dfe);
				    	dfe.printStackTrace();
			 	    	System.exit(1);
				}
				  
				Ipaddress nmip = (Ipaddress) dst_nm.lookupValue();
				Route rh = new Route (ip.getString(),nmip.getString(),$gw.text);
				Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
				$sym = s_ret;
				
		 	}
		 	else if(ip_object_used ==true && nm_object_used==false && gw_object_used==true)
		 	{
		 
		   		Symbol dst_ip =  currentScope.getSymbol($ip_obj.text);
		   		if ( dst_ip == null)
	  	   	{
	  	   	System.out.println (" object : "+$ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$ip_obj.text+"  not found");
				System.exit(1);
			} 
		 		try
		 		{  /* Check fot type exceptions in ip_address */
					if(dst_ip.getType().equals ("ipaddr_t") != true) 
				  	{ 
				  		throw (new DataFormatException("rule : route:net"));
				  	}
				}
				catch (DataFormatException dfe)
		  		{
		 			System.out.println(dfe);
		    			dfe.printStackTrace();
	 	    			System.exit(1);
		   		}
				Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
			  	Symbol dst_gw = currentScope.getSymbol($gw_ip_obj.text);
			  	if ( dst_gw == null)
	  	   	{
	  	   	System.out.println (" object : "+$gw_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$gw_ip_obj.text+"  not found");
				System.exit(1);
			} 
				
		 		try
		 		{  /* Check for type exception in netmask  */
		  			if(dst_gw.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:net"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		  			System.out.println(dfe);
		   			dfe.printStackTrace();
	 	   			System.exit(1);
		   		}
		  		Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
			 	Route rh = new Route (ip.getString(),$netmask_ip.text,gwip.getString());
		  		Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
		 		$sym = s_ret;
		 	}
		 	else if(ip_object_used ==false && nm_object_used==true && gw_object_used==true)
		 	{
		 
		   		Symbol nm_ip =  currentScope.getSymbol($nm_ip_obj.text);
		   		if ( nm_ip == null)
	  	   	{
	  	   	System.out.println (" object : "+$nm_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$nm_ip_obj.text+"  not found");
				System.exit(1);
			} 
		
		 		try
		 		{  /* Check fot type exceptions in ip_address */
		  			if(nm_ip.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:net"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
		   			dfe.printStackTrace();
	 	  		 	System.exit(1);	   
	 	   		}
		  		Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
		  		Symbol dst_gw = currentScope.getSymbol($gw_ip_obj.text);
		  		if ( dst_gw == null)
	  	   	{
	  	   	System.out.println (" object : "+$gw_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$gw_ip_obj.text+"  not found");
				System.exit(1);
			} 
		
		 		try
		 		{  /* Check for type exception in netmask  */
		  			if(dst_gw.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:net"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
	    	    			dfe.printStackTrace();
	 	    			System.exit(1);
		   		}
		  
		  		Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
		 		Route rh = new Route ($dst.text,nmip.getString(),gwip.getString());
		  		Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
		 		$sym = s_ret;
		 	}
		 	else if(ip_object_used ==true && nm_object_used==true && gw_object_used==true)
		 	{
		  		Symbol dst_ip =  currentScope.getSymbol($ip_obj.text);
		  		if ( dst_ip == null)
	  	   	{
	  	   	System.out.println (" object : "+$ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$ip_obj.text+"  not found");
				System.exit(1);
			} 
		 		try
		 		{  /* Check fot type exceptions in ip_address */
		  	  		if(dst_ip.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:net"));
		  			}
	  			}
	  			catch (DataFormatException dfe)
	  			{
	   				System.out.println(dfe);
				    	dfe.printStackTrace();
			 	    	System.exit(1);
	   			}
				Ipaddress ip = (Ipaddress) dst_ip.lookupValue(); 	
		  		Symbol nm_ip =  currentScope.getSymbol($nm_ip_obj.text);
		  		if ( nm_ip == null)
	  	   	{
	  	   	System.out.println (" object : "+$nm_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$nm_ip_obj.text+"  not found");
				System.exit(1);
			} 
		
		 		try
		 		{  /* Check fot type exceptions in ip_address */
		  			if(nm_ip.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:net"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
	   	    			dfe.printStackTrace();
	 	    			System.exit(1); 
		   		}
				Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
				Symbol dst_gw = currentScope.getSymbol($gw_ip_obj.text);
				if ( dst_gw == null)
	  	   	{
	  	   	System.out.println (" object : "+$gw_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$gw_ip_obj.text+"  not found");
				System.exit(1);
			} 
		
		 		try
		 		{  /* Check for type exception in netmask  */
		  			if(dst_gw.getType().equals ("ipaddr_t") != true) 
		  			{ 
		  				throw (new DataFormatException("rule : route:net"));
		  			}
		  		}
		  		catch (DataFormatException dfe)
		  		{
		   			System.out.println(dfe);
	  	    			dfe.printStackTrace();
	 	    			System.exit(1);  
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
	  
	}
	;

serv_group returns [Symbol sym]
@init
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
	: 
	'service_group' '{' ((serv_ip_str =  ip_addr 
	{ 
		if(!g_ignore_stmt)
			serviceIp = new Ipaddress($serv_ip_str.text);
	})
	| (serv_ip_obj = object_name 
	{ 
		if(!g_ignore_stmt)
		{
			Symbol s = currentScope.getSymbol($serv_ip_obj.text);
			if ( s == null)
	  	   	{
				System.out.println (" object : "+$serv_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$serv_ip_obj.text+"  not found");
				System.exit(1);
			} 
		 
			 try
			 {
			 	if(s.getType().equals ("ipaddr_t") != true) 
			  	{ 
			  		throw (new DataFormatException("rule : service_group:service ip"));
			  	}
			 }
			 catch (DataFormatException dfe)
			 {
			   	System.out.println(dfe);
		 	    	dfe.printStackTrace();
		 	    	System.exit(1);	   
			 }
		   
			 serviceIp = (Ipaddress) s.lookupValue();
		}
	}))
	('netmask' ((serv_netmask_str=ip_addr
	{
		if(!g_ignore_stmt)
		{
			serviceNetmask = new Ipaddress($serv_netmask_str.text);
		}
	})|
	(serv_netmask_obj = object_name
	{
		if(!g_ignore_stmt)
		{ 
			Symbol s = currentScope.getSymbol($serv_netmask_obj.text);
			if ( s == null)
	  	   	{
	  	   	System.out.println (" object : "+$serv_netmask_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$serv_netmask_obj.text+"  not found");
				System.exit(1);
			} 
		                       
			try
			{
				if(s.getType().equals ("ipaddr_t") != true) 
			  	{ 
			  		throw (new DataFormatException("rule : service_group: service_netmask"));
			  	}
			}
			catch (DataFormatException dfe)
			{
				System.out.println(dfe);
		 	    	dfe.printStackTrace();
	 		    	System.exit(1);		   
			} 
			serviceNetmask = (Ipaddress)s.lookupValue();
		}
	})) )?  
	serv_port_str=serv_listen_port  
	{
		if(!g_ignore_stmt)
		{ 
			if(serviceIp.getString().equals("0.0.0.0")!=true)
		     	{
				serviceNetmask=new Ipaddress("255.255.255.255");
		     	}
		      
		      	sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
		      			         $serv_port_str.text)));
		}
	}
	(', '  ((extra_ip_str =  ip_addr 
	{ 
		if(!g_ignore_stmt)
			serviceIp = new Ipaddress($extra_ip_str.text);
	})
		| (extra_ip_obj = object_name 
	{
		if(!g_ignore_stmt)
		{ 
			Symbol s = currentScope.getSymbol($extra_ip_obj.text);
			if ( s == null)
	  	   	{
	  	   	System.out.println (" object : "+$extra_ip_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$extra_ip_obj.text+"  not found");
				System.exit(1);
			} 
		 
			 try
			 {
			 	if(s.getType().equals ("ipaddr_t") != true) 
			 				  	{ 
			  		throw (new DataFormatException("rule : service_group:service ip:second_comma_separated_values"));
			  	}
			}
			catch (DataFormatException dfe)
			{
				System.out.println(dfe);
			    	dfe.printStackTrace();
		 	    	System.exit(1);   
		 	    				}
			serviceIp = (Ipaddress) s.lookupValue();
		}
	}))
	('netmask' ((extra_serv_netmask_str=ip_addr
	{
		if(!g_ignore_stmt)
		{
			serviceNetmask = new Ipaddress($extra_serv_netmask_str.text);
		}
	})|
	(extra_serv_netmask_obj = object_name
	{ 
		if(!g_ignore_stmt)
		{
			Symbol s = currentScope.getSymbol($extra_serv_netmask_obj.text);
			if ( s == null)
	  	   	{
	  	   	System.out.println (" object : "+$extra_serv_netmask_obj.text+"  not found");
				//System.out.println ("Line :"+input.line+": object : "+$extra_serv_netmask_obj.text+"  not found");
				System.exit(1);
			} 
		                      
			try{
		  		if(s.getType().equals ("ipaddr_t") != true) 
		  		{ 
		  			throw (new DataFormatException("rule : service_group: service_netmask"));
		  		}
		  	}
		  	catch (DataFormatException dfe)
		  	{
		   		System.out.println(dfe);
		    		dfe.printStackTrace();
	 	    		System.exit(1);   
		    	}
		    	serviceNetmask = (Ipaddress)s.lookupValue();
		}
	})) )?  
	extra_serv_port_str=serv_listen_port  
	{
		if(!g_ignore_stmt)
		{ 
			if(serviceIp.getString().equals("0.0.0.0")!=true)
		     	{
		     		serviceNetmask=new Ipaddress("255.255.255.255");
		     	}
		     	sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
		      			         $extra_serv_port_str.text)));
		}	      			         
	}
	)*  '}'  
		      
      	{
       		if(!g_ignore_stmt)
       		{
       			Servicegroup sg = new Servicegroup(sDesc);
       			Symbol s = new Symbol ("serv_group_type_t","serv_group_type_t",sg);
       			$sym = s;		      
     		}
     	}	
	;

serv_listen_port 
	:	(NUMBER);

host_name
	: ID;	

ID	:	LETTER (LETTER|DIGIT|'/')* ;
                           
fragment LETTER	
	:	'A'..'Z'
 	|	'a'..'z'
 	|	'_'
 	;

DOT 	:	'.';
	
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


LINE_COMMENT 
	:	'#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

EQUAL	:	'=';
	
WHITESPACE 
	:	('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel=HIDDEN;}
	;
