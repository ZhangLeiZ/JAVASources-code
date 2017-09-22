package com.aop;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogInterceptorAdivce implements MethodInterceptor {

	Logger logger = Logger.getLogger(this.getClass().getName());
	public Object invoke(MethodInvocation Invocation) throws Throwable {
		Object result=null;
		Date date= new Date();
		logger.log(Level.INFO, "执行前查询学生资料..........."+date.toLocaleString());
		result = Invocation.proceed();
		
		logger.log(Level.INFO, "执行后查询学生资料..........."+date.toLocaleString());
		return result;
	}
}
