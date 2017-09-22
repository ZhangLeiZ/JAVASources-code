package com.yourcompany.struts.action;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterEncoding implements Filter {

	String config=null;
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if(!config.equals("")){
			request.setCharacterEncoding("utf-8");
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		this.config = config.getInitParameter("config");
		
	}

}
