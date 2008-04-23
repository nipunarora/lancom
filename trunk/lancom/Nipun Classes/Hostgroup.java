/*
 * Hostgroup.java
 *
 * Created on April 10, 2008, 7:33 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Lancom;
import java.util.*;
import java.lang.*;
import java.util.*;

/**
 *
 * @author Nipun Arora
 */
public class Hostgroup {
    
    String ethName;
    Ipaddress ip1;
    Ipaddress nm1;
    
    /** Creates a new instance of Hostgroup */
    public Hostgroup(String ethName, String Ipaddress, String netMask) {
        ethName = new String(ethName);
        ip1 = new Ipaddress(Ipaddress);
        nm1 = new Ipaddress(netMask);
    }
        
    public String toString()
    {
        
    }
}
