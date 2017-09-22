<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Addemp.jsp' starting page</title>
    
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
  <h1 align="center">Struts2验证机制</h1>
  <hr color="green">
    <s:form action="VilidataLogin!add.action" name="form1">
    	<s:textfield name="emp.Empid" label="员工编号"></s:textfield>
    	<s:textfield name="emp.Empname" label="员工姓名"></s:textfield>
    	<s:textfield name="emp.Empage" label="员工年龄"></s:textfield>
    	<s:textfield name="" label="员工性别"></s:textfield>
    	<s:textfield name="emp.Empcardno" label="身份证号"></s:textfield>
    	<s:textfield name="emp.Empdate" label="入职时间"></s:textfield>
    	<s:textfield name="emp.Empemile" label="员工邮箱"></s:textfield>
    	<s:textarea name="emp.Empthoer" label="说明" rows="5" cols="50"></s:textarea>
    	<s:submit value="注册"></s:submit>
    </s:form>
 </body>
</html>
