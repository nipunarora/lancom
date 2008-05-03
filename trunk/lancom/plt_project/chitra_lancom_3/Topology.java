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
    
    Hostgroup hostGroup;
    Context context;
    Servicegroup serviceGroup;
    
    
    /** Creates a new instance of Topology */
    public Topology(Hostgroup hG, Context c) 
    {
        hostGroup.hostGroup = new Vector<Host>(hG.hostGroup);
        context = c;
    }
    
    public Topology(Servicegroup sG, Context c)
    {
        serviceGroup.serviceGroup = new Vector<Servicedescriptor>(sG.serviceGroup);
        context = c;
    }
    
    public String getString()
    {
        String temp = "context: " + context.getString();
        return new String(temp);
    }
    
}
