<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Showresult.jsp' starting page</title>
    
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
      int num1=Integer.parseInt(request.getParameter("jie1"));
      int num2=Integer.parseInt(request.getParameter("jie2"));
      int opr=Integer.parseInt(request.getParameter("jisuan"));
      int toger=0;
      switch(opr){
        case 1:
	        toger=num1+num2;
	        break;
        case 2:
            toger=num1-num2;
            break;
        case 3:
            toger=num1*num2;
            break;
        case 4:
            toger=num1/num2;
            break;
         
      }
      out.print("结果:" + toger);
     %>
  </body>
</html>
