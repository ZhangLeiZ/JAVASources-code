<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'loginw.jsp' starting page</title>
    
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
     String username = request.getParameter("username");
     String pass = request.getParameter("pass");
     
     if(username.equals("admin") && pass.equals("12345")){
     %>
       <jsp:forward page="maindome.jsp"/>
     <% 
     }else{
     %>
     <%
    try {
			Thread.sleep(10000);
			%>
			<jsp:forward page="loginc.jsp"/>
			<% 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      %>
       
     <% 
     }
     %>
  </body>
</html>
