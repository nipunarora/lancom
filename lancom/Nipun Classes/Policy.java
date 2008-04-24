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
    
    String direction;
    String verdict;
    String protocol;
    String icmpMessage;
    Ipaddress ipAddress;
    Ipaddress netMask;
    int sourcePort;
    
    
    /** Creates a new instance of Policy */
    public Policy(String dir, String verd, String proto, String ip, String net, String source) 
    {
        try
        {
                    direction = new String (dir);
                    verdict = new String(verd);
                    protocol= new String (proto);
                    ipAddress = new Ipaddress(ip);
                    netMask = new Ipaddress(net);
                    sourcePort = Integer.parseInt(source);
                    if(sourcePort> 65536)
                    {
                        throw new ExceedsLancomSizeException();
                    }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured in class policy");
            e.printStackTrace();
        }

    }
    
    public Policy(String dir, String verd, String icmp, String ip, String net)
    {
                    direction = new String (dir);
                    verdict = new String(verd);
                    icmpMessage = new String(icmp);
                    ipAddress = new Ipaddress(ip);
                    netMask = new Ipaddress(net);
                    
    }
    
    public String getString()
    {
        String temp = "direction : " + direction +  "ipAddress: " + ipAddress.getString() + "netmask: " + netMask.getString();
        return temp;
    }
    
}