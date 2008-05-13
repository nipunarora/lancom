/*
 * Interface.java
 *
 * Created on April 23, 2008, 4:34 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import java.io.*;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Nipun Arora
 */
public class Interface 
{
    
    String name;
    Ipaddress ipAddress;
    Ipaddress netMask;
    Ipaddress defaultGateway;
    Vector <Ipaddress> dns;
    boolean dns_used;
    boolean defgw_used;
    
    
    /** Creates a new instance of Interface */
    public Interface(String n, String ip, String net, String def, Vector ipaddr) 
    {
        name = new String(n);
        ipAddress = new Ipaddress(ip);
        netMask = new Ipaddress(net);
	if(def != null)
	    {
		defgw_used = true;	
		defaultGateway = new Ipaddress(def);
	    }
	else { defgw_used = false; }
	
        if(ipaddr != null)
	    {
		dns_used = true;
		dns = new Vector <Ipaddress> (ipaddr);
	    }
	else { dns_used = false; }

    }
    
    public void configure(String xmlfile,String xmlTag,String OutputFileName)
    {
	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	CmdArg cmdarg = new CmdArg();
 	cmdarg = xmlDoc.getCmdArg(xmlTag);
	boolean append = false;
	System.out.println("interpreter:"+cmdarg.interpreterPath);
        System.out.println("cmd:"+cmdarg.cmd);

	System.out.println(" ip : "+this.ipAddress.getString());
	System.out.println(" netmask : "+this.netMask.getString());

	cmdarg.arg = cmdarg.arg.replaceAll("\\$NETMASK",this.netMask.getString());
	cmdarg.arg = cmdarg.arg.replaceAll("\\$IPADDR",this.ipAddress.getString());
	cmdarg.arg = cmdarg.arg.replaceAll("\\$INTERFACE_NAME",name);
		
	
	try
	    {
		FileWriter outFile = null;
                PrintWriter out = null;
		if((new File(OutputFileName)).exists() == true)
		{
		outFile = new FileWriter(OutputFileName,true);
		out = new PrintWriter(outFile);
		append = true;
		}
		else{
		outFile = new FileWriter(OutputFileName);
		}
	    if((cmdarg.interpreterPath.equals("default") != true)&&(append== false))
		{
		    out.println("#!"+cmdarg.interpreterPath);
		    append = false;	
		}
	    
	      out.println(cmdarg.cmd+" "+cmdarg.arg);
	      out.close();
	    }
	catch(IOException ioe)
	    {
		ioe.printStackTrace();
	    }
		
	
      	CmdArg defgw = new CmdArg();
	
	if(defgw_used == true)
	{
	 Route route = new Route("0.0.0.0","0.0.0.0",
		                 this.defaultGateway.getString());
	 defgw = route.addRoute("route.xml","RouteAdd");
 	 System.out.println(" default gateway ");
	 System.out.println("cmd:"+defgw.cmd);
	 System.out.println("arg:"+defgw.arg);
	 
	 try{
	        FileWriter outFile = null;
 		PrintWriter out = null ; 
		if((new File(OutputFileName)).exists() == true){
		outFile = new FileWriter(OutputFileName,true);
		}
		else{
			outFile = new FileWriter(OutputFileName);
			
		}
		
		out = new PrintWriter(outFile);
		 out.println(cmdarg.cmd+" "+cmdarg.arg);
		 out.close();
	 }catch(IOException ioe)
	     {
		 ioe.printStackTrace();
		 
	     }

	}
	if(dns_used == true)
	{
 	    Iterator  <Ipaddress> iter = dns.iterator();
	    CmdArg dnsconf = new CmdArg();
 	    dnsconf = xmlDoc.getCmdArg("DnsConf");	   
	    while(iter.hasNext())
		{
		    String dnsip,output ;
		    dnsip=iter.next().getString();
		    output = new String(dnsconf.cmd+" "+dnsconf.arg);
		    output = output.replaceAll("\\$IPADDR",dnsip);
		    
		    System.out.println(output);
	 	
		    try{

			FileWriter outFile = null;
			PrintWriter out = null; 
			if((new File(OutputFileName)).exists() == true){
			outFile = new FileWriter(OutputFileName,true);
			}
			else{
			outFile = new FileWriter(OutputFileName);
			}		

			out = new PrintWriter(outFile);
			if(cmdarg.interpreterPath.equals("default") != true)
			    {
				out.println("echo\' "+output+" \' >> /etc/rc.resolv.conf");	  
				out.close();
			    }
			else{
			out.println(output);
			out.close();
			}
		    }catch(IOException ioe)
			{
			    ioe.printStackTrace();
			    
			}

    
		}
	    
	    
	}	
    }

  
    public void display(String xmlfile,String xmlTag,String OutputFileName)
    {
	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	CmdArg cmdarg = new CmdArg();
 	cmdarg = xmlDoc.getCmdArg(xmlTag);
	boolean append = false;	
	System.out.println("interpreter:"+cmdarg.interpreterPath);
        System.out.println("cmd:"+cmdarg.cmd);

	System.out.println(" ip : "+this.ipAddress.getString());
	System.out.println(" netmask : "+this.netMask.getString());
	System.out.println("arg:"+cmdarg.arg);

	
	try
	    {
		FileWriter outFile = null;
		PrintWriter out = null; 
		if((new File(OutputFileName)).exists() == true){
		outFile = new FileWriter(OutputFileName,true);
		append = true;
		}
		else{
			outFile = new FileWriter(OutputFileName);
		
		}

		out = new PrintWriter(outFile);
		if((cmdarg.interpreterPath.equals("default") != true) && (append == false)) 
		    {
			out.println("#!"+cmdarg.interpreterPath);
			append = false;
		    }
		out.println(cmdarg.cmd+" "+cmdarg.arg);
		out.close();
		append = false;
	    }
	catch(IOException ioe)
	    {
		ioe.printStackTrace();
	    }
	
    }

    public String dnsConf(String xmlfile,String xmlTag)
	{
	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	String nameServerConf;
 	nameServerConf = xmlDoc.getTagValue(xmlTag);
	System.out.println("nameServerConf:"+nameServerConf);
        return nameServerConf;


	}	


    public String getString()
    {
        String temp = "name : " + name + " Ipaddress" + ipAddress.getString() + "netMask :  " + netMask.getString() + "default : ";
	
	if(defgw_used == true){
	  temp = temp + defaultGateway.getString();
	}
	
	if(dns_used == true){
	    Iterator  <Ipaddress> iter = dns.iterator();
	    while (iter.hasNext())
		{
		    temp= temp + iter.next().getString();
		}
	}
	
//	System.out.println(temp);
	return (new String (temp));
    }
    
}
