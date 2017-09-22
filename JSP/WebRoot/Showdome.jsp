<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Showdome.jsp' starting page</title>
    
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
     request.setCharacterEncoding("utf-8");
   %>
    恭喜你登入成功<br/>
    <%=session.getAttribute("username")%><br/>
    <%
     ArrayList list1 = (ArrayList)application.getAttribute("list1");
     for(int i=0;i<list1.size();i++){
        out.print(list1.get(i)+"你是第"+(i+1)+"个用户");
        out.print("<br/>");
     }
     %>
  </body>
</html>
