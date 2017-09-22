<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'includedome.jsp' starting page</title>
    
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
    <table align="center" border="0" width="1000">
       <tr>
         <td>JSP</td>
         <td>JAVA</td>
         <td>javascript</td>
         <td>SQL</td>
         <td>c语言</td>
       </tr>
       <tr  align="center">
       <td colspan="5">
       账户名是：<%request.getParameter("user"); %>密码是：<%request.getParameter("passq"); %>
       </td>
       </tr>
    </table>
  </body>
</html>
