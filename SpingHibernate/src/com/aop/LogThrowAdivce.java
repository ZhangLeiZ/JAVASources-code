package com.aop;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.ThrowsAdvice;

public class LogThrowAdivce implements ThrowsAdvice{

	Logger logger = Logger.getLogger(this.getClass().getName());
	public void afterThrowing(Method method, Object[]agrs,Object tagget,Exception exception)throws Throwable{
		logger.log(Level.INFO, "Loging that a "+exception.getMessage()+"Exception was Thrown in"+method);
	}
}
