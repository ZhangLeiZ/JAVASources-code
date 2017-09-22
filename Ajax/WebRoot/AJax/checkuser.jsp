<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="org.w3c.dom.Document"%>
<%
	String[] userlist = {"qwe","zxc","asd","cvb","dfg"};
	String user = new String(request.getParameter("user").getBytes("ISO-8859-1"),"UTF-8");
	Arrays.sort(userlist);
	int result = Arrays.binarySearch(userlist,user);
	if(result>-1){
		out.println("很抱歉，该用户已注册");
	}else{
		out.println("恭喜你，该名称未被注册");
	}
	 %>