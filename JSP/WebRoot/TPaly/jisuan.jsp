<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jisuan.jsp' starting page</title>
    
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
  <jsp:useBean id="su" class="JSPservlet.Jisunaqi" scope="application"></jsp:useBean>
  <jsp:setProperty name="su" property="*"/>
  <% 
    float num1 = su.getNum1();
    float num2 = su.getNum2();
    float sum = 0f;
    int s = su.getS();
    switch(s){
        case 1:
        out.print(sum=num1+num2);
        break;
        case 2:
        out.print(sum=num1-num2);
        break;
        case 3:
        
        
        out.print(sum=num1*num2);
        break;
        case 4:
        out.print(sum=num1*num2);
        break;
    }
    %>
    <h1 align="center">计算器</h1>
    <hr>
    <form action="TPaly/jisuan.jsp" name="form1" method="post" >
    <input type="text" name="num1">
	    <select name="s">
	      <option value="1">+</option>
	      <option value="2">-</option>
	      <option value="3">*</option>
	      <option value="4">/</option>
	    </select>
    <input type="text" name="num2">
    <input type="submit" value=" 确 定 ">
    </form>
  </body>
</html>
