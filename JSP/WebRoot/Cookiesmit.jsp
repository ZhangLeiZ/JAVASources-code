<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Cookiesmit.jsp' starting page</title>
    
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
   <%
   request.setCharacterEncoding("utf-8");
   out.print("名称"+request.getParameter("username")+"<br/>");
   out.print("密码"+request.getParameter("password")+"<br/>");
   out.print("记住密码"+request.getParameter("rember")+"<br/>");
   out.print("登入"+request.getParameter("Login")+"<br/>");
   out.print("取消"+request.getParameter("Reg")+"<br/>");
   
   String remak = request.getParameter("rember");
   if(remak!=null && remak.equals("1")){
      String user1 = request.getParameter("username");
      String pass1 = request.getParameter("password");
      Cookie cookie1 = new Cookie("username",URLEncoder.encode(user1));
      Cookie cookie2 =new Cookie("password",URLEncoder.encode(pass1));
      cookie1.setMaxAge(24*120);
      cookie2.setMaxAge(24*120);
      cookie1.setPath(request.getContextPath());
      cookie2.setPath(request.getContextPath());
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        
   }
    %>
  </body>
</html>
