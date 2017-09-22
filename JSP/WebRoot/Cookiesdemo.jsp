<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Cookiesdemo.jsp' starting page</title>
    
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
    Cookie cookies[]=request.getCookies();
    String user="";
    String pass="";
    if(cookies!=null){
      for(int i=0;i<cookies.length;i++){
            Cookie c =cookies[i];
            out.print(c.getName()+"="+c.getValue());
            if(c.getName().equals("username")){
              user=URLDecoder.decode(c.getValue());
            }else if(c.getName().equals("password")){
              pass=URLDecoder.decode(c.getValue());
            }
        }
    }
   %>
      <h1 align="center">系统登录</h1>
    <hr/>
    <form action="<%=basePath%>/Cookiesmit.jsp" name="form1" method="post">
    	<table align="center" width="500">
    		<tr>
    			<td align="right">用户名称：</td>
    			<td><input type="text" name="username" value="<%=user %>"/></td>
    		</tr>
    		<tr>
    			<td align="right">登录密码：</td>
    			<td><input type="password" name="password" value="<%=pass %>"/></td>
    		</tr>
    		<tr>
    			<td align="center" colspan="2">
    			<input type="checkbox" name="rember" value="1"/>记住密码
    			</td>
    		</tr>
    		<tr>
    			<td  colspan="2" align="center">
    			<input type="submit" name="Login" value="  登 录  "/>
    			<input type="button" name="Reg" value="注册">
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
