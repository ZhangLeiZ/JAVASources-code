<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'right.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="refresh" conter="1;url=right.jsp" >
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body background="img/tu2.jpg">
  <h1 align="center"><font color="green">聊天成员</font></h1>
  <hr color="green" size="10px">
  		<br/>
   
     <%
     request.setCharacterEncoding("utf-8");
     HashSet list = (HashSet)application.getAttribute("list");
     if(list!=null){
     	Iterator<Integer> it = list.iterator();
	     while(it.hasNext()){
		      for(int i=list.size();i>0;i--){
		        out.print("<font color='red'>"+"ip:"+it.next()+"&nbsp;&nbsp;&nbsp;&nbsp;你是第"+i+"个用户</font>");
		      }
     	}
     }
     
     %>
</html>
