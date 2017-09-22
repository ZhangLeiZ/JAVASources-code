<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'maindome.jsp' starting page</title>
    
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
    <table align="center" width="100%" height="100%" border="1">
	      <tr height="25%">
	         <td colspan="2" align="center">
	           <jsp:include page="top.jsp"/>
	         </td>
	      </tr>
	      <tr height="70%">
		      <td width="20%" align="center">
		        <jsp:include page="elment.jsp"/>
		      </td>
		      <td width="70%" align="center">
		        <jsp:include page="register.jsp"/>
		      </td>
	      </tr>
    </table>
  </body>
</html>
