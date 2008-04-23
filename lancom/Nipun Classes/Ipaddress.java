/*
 * Ipaddress.java
 *
 * Created on April 10, 2008, 7:43 PM
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
public class Ipaddress 
{
       
    /** dot sperated numerical values in an ip address */
    int p1;
    int p2;
    int p3;
    int p4;
    
    /** Creates a new instance of Ipaddress */
    public Ipaddress(String ip) 
    {
       String ipAddress = new String(ip);
       checkError(ip);
    }
    
    /** Use setValue function to assign values */
    public void setValue(String ip)
    {
        String ipAddress = new String(ip);
        checkError(ip);
    }
    
    /** Checks for errors in the ipaddress text being passed */
    public void checkError(String ip)
    {
        /**Boolean Flag to tell if the ip address is wrong */
        Boolean error= false;
        
        /**Check if the length of the ipaddress string is more than the appropriate */
        if(ip.length()>15)
        {
            error = true;
        }
        
        try
        {
            p1 = Integer.parseInt(ip.substring(0,2));
            p2 = Integer.parseInt(ip.substring(4,6));
            p3 = Integer.parseInt(ip.substring(8,10));
            p4 = Integer.parseInt(ip.substring(12,14));
            if(p1>255||p2>255||p3>255||p4>255)
            {
                error = true;
            }
        }catch(NumberFormatException e)
        {
          /**Print out exception if its not a number*/
            System.out.println("This is not a string ");
            e.printStackTrace();
        }
       
    }
    
}
