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
    
    public String getString()
    {
        return  new String("direction : " + direction +  "sourceIpAddress: " + sourceIpAddress.getString() + "sourceNetmask: " + sourceNetMask.getString()
			   + "destIpAddress : "+destIpAddress.getString()+"destNetMask:" + destNetMask.getString()+"soucePort:"+sourcePort+"destPort"+destPort);	
				
	
    }
    
}
