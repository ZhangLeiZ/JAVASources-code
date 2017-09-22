package com.vo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class SpingTextcese {

	public static void main(String[] args) {
		 Resource resource = new ClassPathResource("applicationContext.xml");
		 XmlBeanFactory smlBean = new XmlBeanFactory(resource);
		 Textsping text = (Textsping)smlBean.getBean("test");
		 System.out.println(text.getHolle());
	}
}
