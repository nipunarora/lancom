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
    Role role;
    Servicegroup serviceGroup;
    
    
    /** Creates a new instance of Topology */
    public Topology(Hostgroup hG, Role r) 
    {
        hostGroup.hostGroup = new Vector<Host>(hG.hostGroup);
        role = r;
    }
    
    public Topology(Servicegroup sG, Role r)
    {
        serviceGroup.serviceGroup = new Vector<Servicedescriptor>(sG.serviceGroup);
        role = r;
    }
    
    public String getString()
    {
        String temp = "role: " + role.getString();
        return new String(temp);
    }
    
}
