<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Method.jsp' starting page</title>
    
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
    <a href="${pageContext.request.contextPath }/MethodAction!del.action">执行del方法</a><br/>
    <a href="${pageContext.request.contextPath }/MethodAction!update.action">执行update方法</a><br/>
    <a href="${pageContext.request.contextPath }/MethodAction!select.action">执行select方法</a><br/>
    <a href="${pageContext.request.contextPath }/MethodAction!add.action">执行add方法</a>
  </body>
</html>
