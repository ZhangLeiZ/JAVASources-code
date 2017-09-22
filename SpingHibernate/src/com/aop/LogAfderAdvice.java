package com.aop;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfderAdvice implements AfterReturningAdvice{

	private Logger logger = Logger.getLogger(this.getClass().getName());

	public void afterReturning(Object obj,Method method,Object[]args,Object tagget)throws Throwable{
		logger.log(Level.INFO, "old method end......."+method);
		
		System.out.println("method end.......");
	}
}

