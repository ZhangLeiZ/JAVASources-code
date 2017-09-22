package Dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Dom1 {

	public static void main(String[] args) {
		File file = new File("E:\\XML\\XML文档\\Untitled1.xml");
		//得到工厂DocumentBuilderFactory
		DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
		try {
			//得到DocumentBuilder
			DocumentBuilder dB = df.newDocumentBuilder();
			//得到Document对象
			Document doc = dB.parse(file);
			Element ele = doc.getDocumentElement();//获取根节点
			System.out.println("根节点"+ele.getNodeName());
			NodeList chaLis = ele.getChildNodes();
			for(int i=0;i<chaLis.getLength();i++){
				Node node = chaLis.item(i);//获取单个子元素
				if(node.getNodeType()!=Node.TEXT_NODE){//过滤空文本节点
					Node id = node.getAttributes().item(0);//获取元素的属性
					System.out.println("子元素"+node.getNodeName()+"属性"+id.getNodeName()+"="+id.getNodeValue());
					
					NodeList nodes = node.getChildNodes();
					for(int j=0;j<nodes.getLength();j++){
						Node n = nodes.item(j);
						if(n.getNodeType()!=Node.TEXT_NODE){
							//getTextContent获取标签之间的内容
							System.out.println(" "+n.getNodeName()+" "+n.getTextContent());
						}
					}
				}
				
			}
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
	
}
