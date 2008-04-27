/*
 * Hostgroup.java
 *
 * Created on April 10, 2008, 7:33 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.util.*;
import java.lang.*;
import java.util.*;

/**
 *
 * @author Nipun Arora
 */
public class Hostgroup {
    
    Vector <Host> hostGroup;
    
    /** Creates a new instance of Hostgroup */
    public Hostgroup(Vector <Host>h) {
        hostGroup= new Vector<Host>(h);
    }
        
    public String getString()
    {
        String temp= new String(" ");
        Iterator <Host> hostiter= hostGroup.iterator();
        while(hostiter.hasNext())
        {
            temp= temp.concat(hostiter.next().getString());
        }
       return temp; 
    }
   
}
