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
    
    public void configure(String xmlfile,String xmlTag)
    {
	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	CmdArg cmdarg = new CmdArg();
 	cmdarg = xmlDoc.getCmdArg(xmlTag);
	System.out.println("interpreter:"+cmdarg.interpreterPath);
        System.out.println("cmd:"+cmdarg.cmd);

	System.out.println(" ip : "+this.ipAddress.getString());
	System.out.println(" netmask : "+this.netMask.getString());
//	cmdarg.arg = cmdarg.arg.replaceAll("\\$INTERFACE_NAME",this.name);
//	cmdarg.arg = cmdarg.arg.replaceAll("\\$IPADDRESS",
//				this.ipAddress.getString());	
	cmdarg.arg = cmdarg.arg.replaceAll("\\$NETMASK",this.netMask.getString());
	cmdarg.arg = cmdarg.arg.replaceAll("\\$IPADDR",this.ipAddress.getString());
	cmdarg.arg = cmdarg.arg.replaceAll("\\$INTERFACE_NAME",name);
		
	System.out.println("arg:"+cmdarg.arg);
	
    }

  
     public void display(String xmlfile,String xmlTag)
    {
	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	CmdArg cmdarg = new CmdArg();
 	cmdarg = xmlDoc.getCmdArg(xmlTag);
	System.out.println("interpreter:"+cmdarg.interpreterPath);
        System.out.println("cmd:"+cmdarg.cmd);

	System.out.println(" ip : "+this.ipAddress.getString());
	System.out.println(" netmask : "+this.netMask.getString());
	System.out.println("arg:"+cmdarg.arg);
	
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
