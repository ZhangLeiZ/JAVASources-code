package Jdom;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class Jdom1 {

	public static void main(String[] args) {
		Element root  = new Element("Myinfo");//设置根节点
		Document doc = new Document(root);//通过根节点创建文档对象
		Attribute bute = new Attribute("bute","else,myinfor");
		root.setAttribute(bute);
		Element name = new Element("name");
		name.setText("张三");
		Element age = new Element("age");
		age.setText("21");
		Attribute ages = new Attribute("ages","周岁");
		age.setAttribute(ages);
		Element action = new Element("action");
		action.setText("汉族");
		root.addContent(name);
		root.addContent(age);
		root.addContent(action);

		XMLOutputter xml = new XMLOutputter(Format.getPrettyFormat().setEncoding("gbk"));
		try {
			xml.output(doc, System.out);
			FileWriter writer = new FileWriter(new File("E:\\xml\\xml2017\\book.xml"));
			xml.output(doc, writer);
			xml.output(root.getChild("name"),System.out);
			String xmlstring = xml.outputString(doc);
			System.out.println("完成"+xmlstring);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
