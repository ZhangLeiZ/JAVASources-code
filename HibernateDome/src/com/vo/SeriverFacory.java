package com.vo;


import java.util.HashMap;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
public class SeriverFacory {

	public static HashMap serviceClassName = new HashMap();
	public static HashMap serviceInstances = new HashMap();
	static{
		SAXBuilder sax = new SAXBuilder();
		try{
			Document document = sax.build(SeriverFacory.class.getResourceAsStream("servicese-config.xml"));
			Element root = document.getRootElement();
			List<Element> list = root.getChildren();
			for (Element child : list) {
				String Class = child.getAttributeValue("class");
				String name = child.getAttributeValue("name");
				System.out.println(name+":"+Class);
				serviceClassName.put(name, Class);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Object createservice(String ServiceName){
		//读取对应服务的实例
		Object instances = serviceInstances.get(ServiceName);
		if(instances!=null){
			String className = serviceClassName.get(ServiceName).toString();
			//利用反射机制实例化对象
			try {
				instances = Class.forName(className).newInstance();
				serviceInstances.put(ServiceName, instances);
				return instances;
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println("begin......");
	}
}
