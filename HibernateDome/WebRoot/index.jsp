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
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <h1 align="center">修改员工资料</h1>
   	<s:form action="accountaction!add.action?" method="post">
   		<s:textfield name="employee.oid" label="员工编号"></s:textfield>
   		<s:hidden name="account.oid"/>
   		<s:textfield name="employee.employeeName" label="员工姓名"/>
   		<s:radio name="employee.sex" list="#{'男':'男','女':'女'}" listKey="key" listValue="value" label="性别" value="'男'"/>
   		<s:textfield name="dep.oid" label="所属部门"/>
   		<s:textfield name="employee.jobid" label="职务"/>
   		<s:textfield name="employee.birthday"  label="出生日期"/>
   		<s:textfield name="employee.school" label="毕业院校"/>
   		<s:textfield name="employee.phone" label="联系电话"/>
   		<s:textfield name="employee.email" label="邮箱"/>
   		<s:textfield name="account.username" label="账户号码"/>
   		<s:password name="account.password" label="登入密码"/>
   		<s:password name="pass1" label="确认密码"/>
   		<s:submit value=" 修 改 "/>    
   	</s:form>
  </body>
</html>
