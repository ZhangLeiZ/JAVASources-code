package com.impl.shi;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class WebApplicationContextUilt {

	public static Object CreateService(HttpServletRequest request,String beanid){
		WebApplicationContext web = null;
		if(web == null){
			web = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getSession().getServletContext());
		}
		return web.getBean(beanid);
	}
	public static Object CreateService(String beanid){
		WebApplicationContext web = null;
		if(web == null){
			web = WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getRequest().getSession().getServletContext());
		}
		return web.getBean(beanid);
	}
	public static Object XmlCreateService(String beanid){
		ApplicationContext web = null;
		if(web == null){
			web = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
		return web.getBean(beanid);
	}
}
