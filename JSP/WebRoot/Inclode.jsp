<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType("text/html;charset=GB2312") %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Inclode.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="pink">
   
   <h1 align="center"><font color="red">软件使用意见反馈</font></h1>
   <table width="30%" align="center" border="0" cellspacing="1" cellpadding="1">
     <tr align="center" bgcolor="blue">
       <td><div>姓名：</div></td>
       <td><input type="text" name="username" size="20"></td>
     </tr>
   </table>
  </body>
</html>
