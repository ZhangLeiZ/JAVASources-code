package Dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class Dom2 {
	Element root=null;
	public Dom2() {
	 File file = new File("E:\\xml\\xml2017\\notebook.xml");	
	 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	 try {
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(file);
	    root = document.getDocumentElement();
	    dispaly(root);
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SAXException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void dispaly(Node root){
		System.out.println("根节点"+root);
		NodeList list = root.getChildNodes();
		for(int i=0;i<list.getLength();i++){
			Node node = list.item(i);
			String val = node.getTextContent().trim();
			if(node.getNodeType()!=Node.TEXT_NODE){
				if(node.getChildNodes().getLength()>1){
					dispaly(node);
				}else{
					System.out.println(node.getNodeName()+"="+node.getTextContent());
				}
				NamedNodeMap aMap = node.getAttributes();
				if(aMap==null||aMap.equals("")){
					continue;
				}
				System.out.print(node.getNodeName()+"的属性");
				for(int j=0;j<aMap.getLength();j++){
					Node aNode = aMap.item(j);
					System.out.println(aNode.getNodeName()+"="+aNode.getTextContent());
				}
				System.out.println("");
			}else if(!val.equals("")){
				System.out.println("文档文本"+val);
			}
		}
	}
	public static void main(String[] args) {
		new Dom2();
	}
}
