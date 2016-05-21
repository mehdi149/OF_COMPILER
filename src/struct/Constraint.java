package struct;

import java.util.HashMap;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Constraint {
	
	public String ConstraintXML;
	public HashMap<ConstraintType,HashMap<Constraints,Object>> MapConstraint;
	public Constraint(String ConstraintXML){
		 this.ConstraintXML=ConstraintXML;
		
	}
	public void parse_ConstraintXML() throws ParserConfigurationException, SAXException, IOException{
	      File inputFile = new File("input/constraint.xml");
	      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	      Document doc = dBuilder.parse(inputFile);
	      doc.getDocumentElement().normalize();
	      
	      
	      
		
		
	}
	public void get_spec_from_profile(){
		
	}
	

}
