package com.ht.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Tipservlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/xml;charset=utf-8");
		Map map = new HashMap();
		String p1 = "<member><price>10.5</price><num>50</num><chandi>北京</chandi></member>";
		String p2 = "<member><price>30</price><num>20</num><chandi>上海</chandi></member>";
		String p3 = "<member><price>50</price><num>10</num><chandi>武汉</chandi></member>";
		map.put("p1",p1);
		map.put("p2",p2);
		map.put("p3",p3);
		

		String pid= request.getParameter("pid");
		System.out.println(pid);
		StringBuffer sb = new StringBuffer();
		sb.append("<members>");	
		sb.append(map.get(pid).toString());
		sb.append("</members>");
		out.write("<?xml version='1.0' encoding='gb2312' ?>");
		out.write(sb.toString());
		
	}
	
}
