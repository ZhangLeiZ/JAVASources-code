<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'student.jsp' starting page</title>
    
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
  <h1 align="center">javabean</h1>
  <%
  response.setCharacterEncoding("utf-8");
   %>
  
      <hr size=10px> 
      <jsp:useBean id="tyyw" class="JSPservlet.beanstudent" scope="application"></jsp:useBean>
      <jsp:setProperty name="tyyw" property="*"/>
     
       学号：<jsp:getProperty property="id" name="tyyw"/><br/>
       姓名：<jsp:getProperty property="namew" name="tyyw"/><br/>
  </body>
</html>
