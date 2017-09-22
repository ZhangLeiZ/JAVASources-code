<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>计算器</title>
   

	
  </head>
  
  <body>
  <h1>计算器<h1>
	  <form action="Showresult.jsp" name="form1" method="post">
	  <input type="text" name="jie1" id="ji1" >
		  <select name="jisuan">
		      <option value="1" selected>+</option>
		      <option value="2">-</option>
		      <option value="3">*</option>
		      <option value="4">/</option>
		  </select>
		<input type="text" name="jie2" id="ji2">
		<input type="submit" value="计算" >
	  </form>
  </body>
</html>
