package example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.jdom2.Attribute;
import org.jdom2.CDATA;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

class XmlHandler {
   
    public void readXml(String fileName) {
        SAXBuilder saxBuilder = new SAXBuilder();
        File file = new File(fileName);
        try{ Document document = saxBuilder.build(file);
            Element classes = document.getRootElement();
            List<Element> students = classes.getChildren();
            //List<Element> grandchild = ((Element) childNode).getChildren();
   
            List<Element> elements = null;
            
            for(Element student : students){

            	students = student.getChildren();
            	
            	if (! students.isEmpty()) {
            		System.out.println(student.getName());
            		elements = student.getChildren();
            		
            		
            		for(Element ele : elements) {
            			System.out.println(ele.getName() + ": " + ele.getText());
            	
            		}//*/
            		
            	}
            	else {
            		System.out.println(student.getName() + " : " + student.getText());
            	}
            }
                
			
        }catch (JDOMException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
				 


