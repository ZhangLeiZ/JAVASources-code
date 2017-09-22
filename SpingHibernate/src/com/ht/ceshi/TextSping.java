package com.ht.ceshi;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vo.textSping;

public class TextSping {

	public void text1(){
		Resource resource = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory xmlbean = new XmlBeanFactory(resource);
		textSping text = (textSping)xmlbean.getBean("textbean");
		System.out.println("姓名："+text.getHlloe()+"时间："+text.getDate().toLocaleString());
		for (String str : text.getNation()) {
			System.out.println("民族："+str);
		}
		for (Object obj : text.getList()) {
			System.out.println("list集合"+obj);
		}
		Set set = text.getMap().keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			String key = it.next().toString();
			System.out.println("key:"+text.getMap().get(key));
		}
		
	}
	public static void main(String[] args) {
		TextSping tet = new TextSping();
		tet.text1();
	}
}
