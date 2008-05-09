/*
 * Policy.java
 *
 * Created on April 23, 2008, 4:13 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author Nipun Arora
 */
public class Policy 
{
    
    public String direction;
    public String verdict;
    public String protocol;
    public String icmpMessage;
    public Ipaddress sourceIpAddress = new Ipaddress("0.0.0.0");
    public Ipaddress sourceNetMask = new Ipaddress("0.0.0.0");
    public int sourcePort = 0;
    public Ipaddress destIpAddress = new Ipaddress("0.0.0.0");
    public Ipaddress destNetMask = new Ipaddress("0.0.0.0");
    public int destPort = 0;
     
    
    /** Creates a new instance of Policy */
    public Policy(String dir, String verd, String proto, String sip, String snet, String source,
		  String dip, String dnet, String dest) 
    {
        try
        {
                    direction = new String (dir);
                    verdict = new String(verd);
                    protocol= new String (proto);
                
		    sourceIpAddress = new Ipaddress(sip);
                    sourceNetMask = new Ipaddress(snet);
                    sourcePort = Integer.parseInt(source);
		    
		    if(sourcePort> 65535)
                    {
                        throw new ExceedsLancomSizeException("Source port > 65535");
                    }	   

		    destIpAddress = new Ipaddress(dip);
                    destNetMask = new Ipaddress(dnet);
                    destPort = Integer.parseInt(dest);
		 
                    if(destPort> 65536)
                    {
                        throw new ExceedsLancomSizeException("Destination port > 65535");
                    }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured in class policy "+ e);
            e.printStackTrace();
        }

    }
    
    public Policy(String dir, String verd, String icmp, String sip, String snet,
		  String dip, String dnet)
    {

		    direction = new String (dir);
                    verdict = new String(verd);

                    sourceIpAddress = new Ipaddress(sip);
                    sourceNetMask = new Ipaddress(snet);
		    

		    destIpAddress = new Ipaddress(dip);
                    destNetMask = new Ipaddress(dnet);
		      
		    icmpMessage = new String(icmp);	
		   	
    }









 public void configure(String xmlfile,String xmlTag)
    {
	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	CmdArg cmdarg = new CmdArg();
 	cmdarg = xmlDoc.getCmdArg(xmlTag);
	//System.out.println("interpreter:"+cmdarg.interpreterPath);
//System.out.println("cmd:"+cmdarg.cmd);

	//System.out.println(" ip : "+this.ipAddress.getString());
	//System.out.println(" netmask : "+this.netMask.getString());
//	cmdarg.arg = cmdarg.arg.replaceAll("\\$INTERFACE_NAME",this.name);
//	cmdarg.arg = cmdarg.arg.replaceAll("\\$IPADDRESS",
//				this.ipAddress.getString());	
	cmdarg.arg = cmdarg.arg.replaceAll("\\$DNETMASK",this.destNetMask.getString());
	cmdarg.arg = cmdarg.arg.replaceAll("\\$SNETMASK",this.sourceNetMask.getString());


	cmdarg.arg = cmdarg.arg.replaceAll("\\$DST_IPADDR",this.destIpAddress.getString());
	
	cmdarg.arg = cmdarg.arg.replaceAll("\\$SRC_IPADDR",this.sourceIpAddress.getString());

	//cmdarg.arg = cmdarg.arg.replaceAll("\\$INTERFACE_NAME",name);
		

cmdarg.arg = cmdarg.arg.replaceAll("\\$PROTO",protocol);
		
	




	if(destPort==0)
		{
			cmdarg.arg = cmdarg.arg.replaceAll("\\DPORTH","65535");
			
cmdarg.arg = cmdarg.arg.replaceAll("\\DPORTL","0");
	
		}
		else{
			String d=Integer.toString(destPort);
//String s=Integer.toString(sourcePort);

cmdarg.arg = cmdarg.arg.replaceAll("\\DPORTH",d);
			
cmdarg.arg = cmdarg.arg.replaceAll("\\DPORTL",d);
		}
	//System.out.println("arg:"+cmdarg.arg);
	
    
	//}


if(sourcePort==0)
		{
			cmdarg.arg = cmdarg.arg.replaceAll("\\SPORTH","65535");
			
cmdarg.arg = cmdarg.arg.replaceAll("\\SPORTL","0");
	
		}
		else{
			//String d=Integer.toString(destPort);
String s=Integer.toString(sourcePort);

cmdarg.arg = cmdarg.arg.replaceAll("\\SPORTH",s);
			
cmdarg.arg = cmdarg.arg.replaceAll("\\SPORTL",s);
		}
	System.out.println("arg:"+cmdarg.arg);
	
    }


  
     public void display(String xmlfile,String xmlTag)
    {
	ParseXMLDoc xmlDoc = new ParseXMLDoc(xmlfile);
	CmdArg cmdarg = new CmdArg();
 	cmdarg = xmlDoc.getCmdArg(xmlTag);
	//System.out.println("interpreter:"+cmdarg.interpreterPath);
//System.out.println("cmd:"+cmdarg.cmd);

	//System.out.println(" ip : "+this.ipAddress.getString());
	//System.out.println(" netmask : "+this.netMask.getString());
	//System.out.println("arg:"+cmdarg.arg);
	


    }








    
    public String getString()
    {
        return  new String("direction : " + direction +  "sourceIpAddress: " + sourceIpAddress.getString() + "sourceNetmask: " + sourceNetMask.getString()
			   + "destIpAddress : "+destIpAddress.getString()+"destNetMask:" + destNetMask.getString()+"soucePort:"+sourcePort+"destPort"+destPort);	
				
	
    }
    
}
