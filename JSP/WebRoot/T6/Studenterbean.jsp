<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="JSPservlet.beanstudent"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Studenterbean.jsp' starting page</title>
    
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
  <h1 align="center">javabean</h1>
  <%
     beanstudent  beans = new beanstudent();
     beans.setId(1001);
     beans.setNamew("小三");
     beans.setSex("男");
     beans.setAge(23);
     String ho[]={"篮球","旅游","羽毛球"};
     beans.setHobit(ho);
     beans.setMarry(false);
     %>
     学号：<%=beans.getId() %>
     姓名：<%=beans.getNamew() %>
     性别：<%=beans.getSex() %>
     年龄：<%=beans.getAge() %>
     <%
     String s =null;
     for(int i=0;i<beans.getHobit().length;i++){
     }
      %>
      爱好：<%=s %>
      婚姻状况：<%=beans.isMarry() %>
      <hr/ size=10px>
      <jsp:useBean id="bean1" class="JSPservlet.beanstudent" scope="alication">
      <jsp:setProperty name="bean1" property="*"/>
      </jsp:useBean>
      学号：<jsp:getproperty name="bean1" property="id"/><br/>
      姓名：<jsp:getproperty name="bean1" property="name"/><br/>
      密码：<jsp:getproperty name="bean1" property="password"/><br/>
      性别：<jsp:getproperty name="bean1" property="sex"/><br/>
      年龄：<jsp:getproperty name="bean1" property="age"/><br/>
      婚姻状况：<jsp:getproperty name="bean1" property="marry"/><br/>
      爱好：<jsp:getproperty name="bean1" property="hobit"/><br/>
      地址：<jsp:getproperty name="bean1" property="address"/><br/>
  </body>
</html>
