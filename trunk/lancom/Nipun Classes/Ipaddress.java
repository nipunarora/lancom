/*
 * Ipaddress.java
 *
 * Created on April 10, 2008, 7:43 PM
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
            if(error == true)
            {
                throw new ExceedsLancomSizeException();
            }
            
            StringTokenizer st = new StringTokenizer(ip,".");
            p1 = Integer.parseInt(st.nextToken());
            p2 = Integer.parseInt(st.nextToken());
            p3 = Integer.parseInt(st.nextToken());
            p4 = Integer.parseInt(st.nextToken());
            if(p1>255||p2>255||p3>255||p4>255)
            {
                error = true;
            }
            if(error == true)
            {
                throw new ExceedsLancomSizeException();
            }
        }catch(Exception e)
        {
            /**Print out exception if its not a number or exceeds lancom size*/
            System.out.println("This is not a string/ or it exceeds Lancom specified size ");
            e.printStackTrace();
        }
       
    }
    
    public String getString()
    {
        String temp = String.valueOf(this.p1)+ "." + String.valueOf(this.p2)+ "." + String.valueOf(this.p3)+ "." + String.valueOf(this.p4);
        return temp;
    }
    
}