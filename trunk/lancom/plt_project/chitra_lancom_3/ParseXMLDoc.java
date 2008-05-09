import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;

import org.w3c.dom.*;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseXMLDoc {

	//No generics
    List interfConf;
    Document dom;
    
    String xmlfile;


    public ParseXMLDoc(String xmlfile)
    {
	this.xmlfile = new String(xmlfile);
	
    }


    public CmdArg getCmdArg(String tagName) {
	CmdArg cmdarg;
    	   
	parseXmlFile();
	
	//get each employee element and create a Employee object
	cmdarg=parseDocument(tagName);

	return cmdarg;
	//Iterate through the list and print the data
	//printData();
	
		
    }
	
	
	private void parseXmlFile(){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			
			//Using factory get an instance of document builder
		    DocumentBuilder db = dbf.newDocumentBuilder();
		    
		    //parse using builder to get DOM representation of the XML file
		    dom = db.parse(this.xmlfile);
		    
		    
		}catch(ParserConfigurationException pce) {
		    pce.printStackTrace();
		}catch(SAXException se) {
		    se.printStackTrace();
		}catch(IOException ioe) {
		    ioe.printStackTrace();
		}
	}
    
    	private CmdArg parseDocument(String tagName)
	{
	NodeList nl=null;
        CmdArg cmdarg;
        cmdarg = new CmdArg();
	 XPathFactory factory = XPathFactory.newInstance();
	 XPath xpath = factory.newXPath();
	
	try{
	XPathExpression exp = xpath.compile("//"+tagName+"/interpreter/text()");	
	 Object result = exp.evaluate(dom,XPathConstants.NODESET);
	 nl  = (NodeList)result;
   	 if(nl == null)
          {
            System.out.println("interpreter tag missing within tag :"+tagName+" of file:"+
				this.xmlfile);
	}
	
	}
	catch(XPathExpressionException xpee){
	xpee.printStackTrace();
	}	
	
        if(nl.item(0).getNodeValue() == null){ 
	cmdarg.interpreterPath = "";
	}
        else{
	cmdarg.interpreterPath = nl.item(0).getNodeValue(); 
	}	

	try{
	XPathExpression exp = xpath.compile("//"+tagName+"/cmd/text()");	
	 Object result = exp.evaluate(dom,XPathConstants.NODESET);
	 nl  = (NodeList)result;
   	 if(nl == null)
          {
	     System.out.println("cmd tag missing within tag :"+tagName+" of file:"+
				this.xmlfile);

	}
	
	}
	catch(XPathExpressionException xpee){
	xpee.printStackTrace();
	}	
	cmdarg.cmd=nl.item(0).getNodeValue();

	try{
	 XPathExpression exp = xpath.compile("//"+tagName+"/arg/text()");	
	 Object result = exp.evaluate(dom,XPathConstants.NODESET);
	 nl  = (NodeList)result;
   	 if(nl == null)
          {
	     System.out.println("arg tag missing within tag :"+tagName+" of file:"+
				this.xmlfile);
         }
	
	}
	catch(XPathExpressionException xpee){
	xpee.printStackTrace();
	}
	
	cmdarg.arg = nl.item(0).getNodeValue();
	return cmdarg;	

	}	
	

}
