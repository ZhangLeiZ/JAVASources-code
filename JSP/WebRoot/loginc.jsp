<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'loginc.jsp' starting page</title>
    
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
   <h2 align="center">账户或者密码错误，请重新登入</h2>
   <h1 align="center">用户登入</h1>
  <hr>
  <form action="loginw.jsp" method="post" name="form1">
     <table align="center">
     <tr>
       <td> 
         账户登入：<input type="text" name="username" >
       </td>
     </tr>
     <tr>
       <td>
       账户密码：<input type="password" name="pass"><br/>
       </td>
       </tr>
     <tr>
       <td>
         &nbsp;&nbsp;&nbsp;<input type="submit" name="login" value=" 登 入 ">
         &nbsp;&nbsp;&nbsp;<input type="submit" name="close" value="取消">
         </td>
     </tr>
     </table>
   </form> 
  </body>
</html>
