package Jdom;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class Jdom2 {
public Jdom2() {
		SAXBuilder builder = new SAXBuilder();
		try {
			Document doc = builder.build(new File("E:\\xml\\xml2017\\notebook.xml"));
			Element root = doc.getRootElement();
			System.out.println("根元素"+root);
			display(root);
//			List list = root.getChildren();
//			for(Iterator it=list.iterator();it.hasNext();){
//				Element e = (Element)it.next();
//				System.out.println(e.getName()+":"+e.getAttributeValue("MoneyKind"));
//				List list2 = e.getChildren();
//				for(Iterator itr=list2.iterator();itr.hasNext();){
//					Element e1 = (Element)itr.next();
//					System.out.println(e1.getName()+"="+e1.getValue());
//				}
//			}
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
public void display(Element root){
	//读取根节点的子节点
	List<Element> children= root.getChildren();
	for (Iterator it=children.iterator();it.hasNext();) {
		//获取节点的属性
		Element child = (Element)it.next();
		List<Attribute> attrs=child.getAttributes();
		System.out.print("<"+child.getName() +" ");
		if(attrs!=null && attrs.size()>0){
			for (Attribute att : attrs) {
				System.out.print(att.getName() +"="+att.getValue() +" ");
			}
		}
		System.out.print(">");
		//获取节点的值
		if(child.getChildren().size()>0){
			System.out.println("");
			display(child);
			System.out.println("</"+child.getName()+">");
		}else{
			System.out.println(child.getValue() +"</"+child.getName()+">");
		}
	}
}
	public static void main(String[] args) {
		new Jdom2();
	}
}
