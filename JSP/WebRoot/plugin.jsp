<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'plugin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="white">
<h3> 当前时间是 : </h3>
<jsp:plugin type="applet" code="Clock.class" codebase="applet" jreversion="1.4" width="160" height="150" >
    <jsp:fallback>
       当前浏览器不支持plugin的 object 或 applet标签
    </jsp:fallback>
</jsp:plugin>
<p>
<h4>
<font color=red> 
上面的applet是通过JSP的plugin标签加载的
</font>
</h4>
</body>
</html>
