/*
 * Route.java
 *
 * Created on April 24, 2008, 1:45 AM
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
public class Route {
    
    Ipaddress ipAddress ;
    Ipaddress netMask ;
    Ipaddress gateway;
    
    
    /** Creates a new instance of Route */
    public Route(String ip, String gw) 
    {
        ipAddress = new Ipaddress(ip);
        netMask= new Ipaddress("255.255.255.255");
        gateway = new Ipaddress(gw);
    }
    /** Constructor 2 */
    public Route(String ip, String nm, String gw)
    {
        ipAddress = new Ipaddress(ip);
        netMask = new Ipaddress(nm);
        gateway = new Ipaddress(gw);
    }
   
    public void configure(String xmlfile,String xmlTag,String OutputFileName)
   {
   	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	CmdArg cmdarg = new CmdArg();
 	cmdarg = xmlDoc.getCmdArg(xmlTag);
	cmdarg.arg = cmdarg.arg.replaceAll("\\$NETMASK",this.netMask.getString());
	cmdarg.arg = cmdarg.arg.replaceAll("\\$IPADDR",this.ipAddress.getString());
	cmdarg.arg = cmdarg.arg.replaceAll("\\$GATEWAY",gateway.getString());
		
	System.out.println("arg:"+cmdarg.arg);
	
	try
	    {
		FileWriter outFile = new FileWriter(OutputFileName);
		PrintWriter out = new PrintWriter(outFile);
		if(cmdarg.interpreterPath.equals("default") != true)
		    {
			out.println("#!"+cmdarg.interpreterPath);
		    }
		out.println(cmdarg.cmd+" "+cmdarg.arg);
		out.close();
	    }
	catch(IOException ioe)
	    {
		ioe.printStackTrace();
	    }


   }
    public static void display(String xmlfile,String xmlTag,String OutputFileName)
    {
	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	CmdArg cmdarg = new CmdArg();
 	cmdarg = xmlDoc.getCmdArg(xmlTag);
	System.out.println("interpreter:"+cmdarg.interpreterPath);
        System.out.println("cmd:"+cmdarg.cmd);
	System.out.println("arg:"+cmdarg.arg);

	try
	    {
		FileWriter outFile = new FileWriter(OutputFileName);
		PrintWriter out = new PrintWriter(outFile);
		if(cmdarg.interpreterPath.equals("default") != true)
		    {
			out.println("#!"+cmdarg.interpreterPath);
		    }
		out.println(cmdarg.cmd+" "+cmdarg.arg);
		out.close();
	    }
	catch(IOException ioe)
	    {
		ioe.printStackTrace();
	    }
    }

   public CmdArg addRoute(String xmlfile,String xmlTag)
	{
	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	CmdArg cmdarg = new CmdArg();
 	cmdarg = xmlDoc.getCmdArg(xmlTag);
       
	cmdarg.arg = cmdarg.arg.replaceAll("\\$NETMASK",this.netMask.getString());
	cmdarg.arg = cmdarg.arg.replaceAll("\\$IPADDR",this.ipAddress.getString());
	cmdarg.arg = cmdarg.arg.replaceAll("\\$GATEWAY",gateway.getString());
	
	 return cmdarg;
	}

   
    /* Print function for debugging */
    public String getString()
    {
        String temp = "ipAddress: " + ipAddress.getString()+ netMask.getString() + gateway.getString();
        return (new String (temp));
    }
}
