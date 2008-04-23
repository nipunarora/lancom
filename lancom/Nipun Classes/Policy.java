/*
 * Policy.java
 *
 * Created on April 23, 2008, 4:13 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Lancom;
import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author Nipun Arora
 */
public class Policy {
    
    String direction;
    String verdict;
    String protocol;
    String icmpMessage;
    Ipaddress ipAddress;
    Ipaddress netMask;
    int sourcePort;
    
    /** Creates a new instance of Policy */
    public Policy(String direction, String verdict, String protocol, String icmpMessage, Ipaddress ipAddress, Ipaddress netMask, int sourcePort) 
    {
        
        
    }
    
}
