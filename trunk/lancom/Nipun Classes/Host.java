/*
 * Host.java
 *
 * Created on April 17, 2008, 8:12 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


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
    
}