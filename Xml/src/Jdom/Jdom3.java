package Jdom;

import java.io.File;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class Jdom3 {

	public Jdom3() {
		SAXBuilder sax = new SAXBuilder();
		try {
			Document doc = sax.build(new File("E:\\xml\\xml2017\\book.xml"));
			Element root = doc.detachRootElement();
			String str1 = root.getAttributeValue("bute");
			String str2 = root.getChildText("name");
			String str3 = root.getChild("age").getAttributeValue("ages");
			System.out.println(str1+"--"+str2+"--"+str3);
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		new Jdom3();
	}
}
