<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>软件使用意见反馈</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1 align="center">软件使用意见反馈结果</h1>
   <% 
   request.setCharacterEncoding("GBK");
     out.print("姓名："+request.getParameter("username")+"<br/>");
     out.print("E_mail:"+request.getParameter("E_mail")+"<br/>");
      out.print("电话:"+request.getParameter("phone")+"<br/>");
       out.print("软件:"+request.getParameter("soft")+"<br/>");
        out.print("操作系统:"+request.getParameter("os")+"<br/>");
         out.print("问题描述:"+request.getParameter("reamk"));
   %>
  </body>
</html>
