<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登入界面</title>
    
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
  
    <h1 align="center">系统登录</h1>
    <hr/>
    <form action="<%=basePath%>/T5/checkLogin.jsp" name="form1" onsubmit="return check();" method="post">
    	<table align="center" border="1" width="500">
    		<tr>
    			<td align="right">用户名称：</td>
    			<td><input type="text" name="username" value=""/></td>
    		</tr>
    		<tr>
    			<td align="right">登录密码：</td>
    			<td><input type="password" name="password" value=""/></td>
    		</tr>
    		<tr>
    			<td align="center" colspan="2">
    			<input type="checkbox" name="remember" value="1"/>记住密码
    			</td>
    		</tr>
    		<tr>
    			<td  colspan="2" align="center">
    			<input type="submit" name="btnLogin" value="  登 录  "/>
    			<input type="button" name="btnReg" value="注册">
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
