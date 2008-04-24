/*
 * Interface.java
 *
 * Created on April 23, 2008, 4:34 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Lancom;
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
    
    
    /** Creates a new instance of Interface */
    public Interface(String n, String ip, String net, String def, Vector ipaddr) 
    {
        name = new String(n);
        ipAddress = new Ipaddress(ip);
        netMask = new Ipaddress(net);
        defaultGateway = new Ipaddress(def);
        dns = new Vector(ipaddr);
    }
    
    public String getString()
    {
        String temp = "name : " + name + " Ipaddress" + ipAddress.getString() + "netMask :  " + netMask.getString() + "default : " + defaultGateway.getString();
        
    }
    
}