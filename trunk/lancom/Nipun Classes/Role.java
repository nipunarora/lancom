/*
 * Role.java
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
public class Role {
    
    Vector <Policy> role;
    /** Creates a new instance of Role */
    public Role(Vector <Policy> temp) 
    {
        role= new Vector<Policy>(temp);
    }
    
    public String getString()
    {
        String temp= new String(" ");
        Iterator <Policy> iter= role.iterator();
        while(iter.hasNext())
        {
          temp= temp + iter.next().getString();  
        }
        return temp;
    }
}
