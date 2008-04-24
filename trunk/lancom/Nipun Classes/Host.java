/*
 * Host.java
 *
 * Created on April 17, 2008, 8:12 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Lancom;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Nipun Arora
 */
public class Host {
    
    
    
    public Ipaddress ipAddress;
    public Ipaddress netMask;
    
    /** Creates a new instance of Host */
    public Host(String ip, String nm) 
    {
        ipAddress = new Ipaddress(ip);
        netMask = new Ipaddress(nm);
    }
    /** prints out the value in this data structure can be used for debugging */
    public String getString()
    {
        String temp = "ipAddress: " + ipAddress.getString() + "netMask : "  + netMask.getString();
        return temp;
    }
    
}