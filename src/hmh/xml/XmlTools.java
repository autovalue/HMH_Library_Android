/**
 * 
 */
package hmh.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class XmlTools {

    private static Document document;
    private static DocumentBuilder documentBuilder;
    private static DocumentBuilderFactory documentBuilderFactory;

    public static NodeList getNodeList(File file) throws SAXException,
	    IOException, ParserConfigurationException {
	setUp();

	NodeList nodeList = null;

	documentBuilderFactory = DocumentBuilderFactory.newInstance();
	documentBuilder = documentBuilderFactory.newDocumentBuilder();
	document = documentBuilder.parse(file);
	nodeList = document.getElementsByTagName("*");

	return nodeList;
    }

    public static NodeList getNodeList(InputStream file)
	    throws ParserConfigurationException, SAXException, IOException {
	setUp();
	NodeList nodeList = null;

	documentBuilderFactory = DocumentBuilderFactory.newInstance();
	documentBuilder = documentBuilderFactory.newDocumentBuilder();
	document = documentBuilder.parse(file);
	nodeList = document.getElementsByTagName("*");

	return nodeList;
    }

    public static NodeList getChildNodes(Node node) {
	return node.getChildNodes();
    }

    public static NodeList getChildNodes(Element element) {
	return element.getChildNodes();

    }

    public static String getTagValue(Element element, String tag,
	    String attribute) {
	if (element.getTagName().startsWith(tag)) {
	    return element.getAttribute(attribute);

	}

	return element.getNodeValue();
    }

    private static void setUp() throws ParserConfigurationException {
	documentBuilderFactory = DocumentBuilderFactory.newInstance();
	documentBuilder = documentBuilderFactory.newDocumentBuilder();
    }
}
