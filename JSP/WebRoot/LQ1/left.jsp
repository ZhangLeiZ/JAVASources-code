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
		<meta http-equiv="refresh" conter="1;url=left.jsp" >
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body background="img/tu2.jpg">
      <h1 align="center"><font color="green" >小型聊天室</font></h1>
  
    <%
      request.setCharacterEncoding("utf-8");
      String tupian = request.getParameter("tupian");
      String yanse = request.getParameter("yanse");
      String fontsize = request.getParameter("daxiao");
      String messag = request.getParameter("mess");
      String ip = request.getRemoteAddr();
      String name2 = application.getAttribute("name").toString();
      String mag = (String)application.getAttribute("mag");
      if(messag!=null){
        messag = messag.replaceAll("<","&lt").replaceAll(">","&gt");
        if(tupian!=null){
          messag = ip+"<font color="+yanse+"size="+fontsize+">"+messag+"</font><img src='"+tupian+"'><br/>"+new Date().toLocaleString()+"<br/>";
        }else{
          messag = ip+"<font color="+yanse+"size="+fontsize+">"+messag+"</font><br/>"+new Date().toLocaleString();
        }
        if(mag==null){
          application.setAttribute("mag",messag);
        }else{
          mag = mag+"<br/>"+messag;
          application.setAttribute("mag",mag);
        }
        out.print(mag);
        HashSet list = new HashSet();
        if(application.getAttribute("list")==null){
         list.add(ip+"&nbsp;&nbsp;&nbsp;&nbsp;昵称："+name2);
         application.setAttribute("list",list);
        }else{ 
         list=(HashSet)application.getAttribute("list");
         list.add(ip+"&nbsp;&nbsp;&nbsp;&nbsp;昵称："+name2);
         application.setAttribute("list",list);
        }
      }
     %>
  </body>
</html>
