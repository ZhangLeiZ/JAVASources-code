<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'comquester.jsp' starting page</title>
    
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
  <jsp:useBean id="ji" class="JSPservlet.Comquestbean" scope="session"/>
    <jsp:setProperty name="ji" property="*"/>
    <h1 align="center">计算器</h1>
    <form method="post" action="T6/comquester.jsp">
     <input type="text" name="num1">
     <select name="hold">
       <option value="1">+</option>
       <option value="2">-</option>
       <option value="3">*</option>
       <option value="4">/</option>
     </select>
    <input type="text" name="num2">
    <input type="submit" value=" = ">
    <input type="text" name="sum" value="<%=ji.getSum() %>">
    </form>
  </body>
</html>
