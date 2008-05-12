/*
 * Servicegroup.java
 *
 * Created on April 24, 2008, 2:26 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import java.io.*;
import java.util.*;


/**
 *
 * @author Nipun Arora
 */
public class Servicegroup {

    Vector <Servicedescriptor> serviceGroup;
    /** Creates a new instance of Servicegroup */
    public Servicegroup(Vector <Servicedescriptor> sg) 
    {
        serviceGroup = new Vector <Servicedescriptor> (sg);
    }
	
   public Servicegroup()
   {
   }
    
    public String getString()
    {
        String temp= new String(" ");
        Iterator <Servicedescriptor> sd = serviceGroup.iterator();
        while(sd.hasNext())
        {
            temp = temp + (sd.next()).getString();
        }
        System.out.println(temp); 
        return (new String(temp));
    }
    
}
