<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	刷新页面：<meta http-equiv="Refresh" content="3;url=left.jsp">
	
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body onload="scroll(0,999999)">
    <%
    request.setCharacterEncoding("utf-8");
    String num1 = request.getParameter("num1");
    String yanse = request.getParameter("yanse");
     String daxiao = request.getParameter("daxiao");
     String ip = request.getRemoteAddr();
     String s =(String)application.getAttribute("num1");
     
     if(num1!=""){
       num1=num1.replaceAll("<","&lt;").replaceAll(">","&gt;");
     
      num1 = ip+"说：<font size='"+daxiao+"' color='"+yanse+"'>"+num1+"</font>";
     if(s==""){
       application.setAttribute("num1",s);
     }else{
       s=s+"<br>"+num1;
       application.setAttribute("num1",s);
     }
   }
   out.print(s);
     %>
     
  </body>
</html>g
