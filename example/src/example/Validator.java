package example;

import java.io.IOException;
import java.net.URL;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.sax.XMLReaderJDOMFactory;
import org.jdom2.input.sax.XMLReaderXSDFactory;
import org.xml.sax.ErrorHandler;
public class Validator {

	public static void main(String  args[]) throws JDOMException, IOException {

        URL xml = Validator.class.getResource("/student.xml");
        URL xsd = Validator.class.getResource("/student.xsd");

        XMLReaderJDOMFactory factory = new XMLReaderXSDFactory(xsd);
        SAXBuilder builder = new SAXBuilder(factory);
        Document document = builder.build(xml);
        System.out.println("root: " + document.getRootElement().getName());
    }

}
