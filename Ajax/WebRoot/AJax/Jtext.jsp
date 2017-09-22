<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% 
	String prarem = request.getParameter("param");
	if(prarem.equals("")||prarem!=null){
		out.println(prarem);
	}else{
		out.println("未找到参数");
	}

%>