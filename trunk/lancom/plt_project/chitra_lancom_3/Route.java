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
    
    /* Print function for debugging */
    public String getString()
    {
        String temp = "ipAddress: " + ipAddress.getString()+ netMask.getString() + gateway.getString();
        return (new String (temp));
    }
}
