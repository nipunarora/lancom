/*
 * Topology.java
 *
 * Created on April 24, 2008, 2:44 AM
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
public class Topology {
    
    Hostgroup hostGroup = null;
    Context context = null;
    Servicegroup serviceGroup = null;
    
    
    /** Creates a new instance of Topology */
    public Topology(Hostgroup hG, Context c) 
    {
      hostGroup = new Hostgroup(hG.hostGroup);
      context = new Context(c.context);	
  	
    }
    
    public Topology(Servicegroup sG, Context c)
    {  
	serviceGroup = new Servicegroup(sG.serviceGroup);
        context = new Context(c.context) ;
    }
    
    public String getString()
    {
        String temp = "context: " + context.getString();
	if(hostGroup != null)
	 {
  	  temp = temp + "hostgroup:"+hostGroup.getString();
	}
	else if(serviceGroup != null)
	 {
  	  temp = temp + "servicegroup:"+serviceGroup.getString();
	 }
        return new String(temp);
    }
    
}
