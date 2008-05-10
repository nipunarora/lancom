/*
 * Context.java
 *
 * Created on April 24, 2008, 2:37 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import java.util.*;
import java.io.*;

/**
 *
 * @author Nipun Arora
 */
public class Context {
    
   public Vector <Policy> context;
    /** Creates a new instance of Context */
    public Context(Vector <Policy> temp) 
    {
        context= new Vector<Policy>(temp);
    }
   public Context(){} 
    public String getString()
    {
        String temp= new String(" ");
        Iterator <Policy> iter= context.iterator();
        while(iter.hasNext())
        {
          temp= temp + iter.next().getString();  
        }
        return (new String(temp));
    }
}
