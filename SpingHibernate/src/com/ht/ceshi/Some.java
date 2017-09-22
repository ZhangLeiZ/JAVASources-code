package com.ht.ceshi;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.impl.shi.IHello;

public class Some implements ApplicationContextAware{

	private IHello ihello;
	
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		ihello = (IHello)context.getBean("ihello");
	}

	 public void helloEverybody() {
		 ihello.HellogetNewbie("Justin");
		 ihello.HellosetMaster("caterpillar");
	    }
	   
	    public void hello() {
	        System.out.println("Hello!");
	    }
}
