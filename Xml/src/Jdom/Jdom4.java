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

public class Jdom4 {

	public Jdom4() {
		SAXBuilder sax = new SAXBuilder();
		try {
			Document doc = sax.build(new File("E:\\XML\\XML文档\\Untitledmm.xml"));
			Element root = doc.detachRootElement();
			System.out.println("根元素"+root);
			dispaly(root);
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dispaly(Element root){
		List<Element> list = root.getChildren();
		for(Iterator<Element> it = list.iterator();it.hasNext();){
			Element e = it.next();
			System.out.print("<"+e.getName());
			List<Attribute> list1 = e.getAttributes();
			if(list1!=null && list1.size()>0){
			for(Iterator<Attribute> itr = list1.iterator();itr.hasNext();){
				Attribute e1 = itr.next();
				System.out.print(" "+e1.getName()+"="+e1.getValue());
			   }
			}
			System.out.print(">");
			if(e.getChildren().size()>0){
				System.out.println("");
				dispaly(e);
				System.out.println("</"+e.getName()+">\n");
			}else{
				System.out.println(e.getValue()+"</"+e.getName()+">");
			}
		}
	}
	public static void main(String[] args) {
		new Jdom4();
	}
}
