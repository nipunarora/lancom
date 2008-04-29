/*
 * Servicedescriptor.java
 *
 * Created on April 24, 2008, 2:03 AM
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
public class Servicedescriptor {
    
    /** Primitives */
    Ipaddress ipAddress;
    Ipaddress netMask;
    int port;
    /** Creates a new instance of Servicedescriptor */
    public Servicedescriptor(String ip, String nm, String p) 
    {
        try
        {
            ipAddress = new Ipaddress(ip);
            netMask = new Ipaddress(nm);
            port = Integer.parseInt(p);
            if(port >65535)
                throw new ExceedsLancomSizeException("Servicedescriptor:Port number > 65535");
            
        }catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        
    }
    
    public String getString()
    {
        String temp = ipAddress.getString()+ netMask.getString() + String.valueOf(port);
        return (new String(temp));
    }
    
}
