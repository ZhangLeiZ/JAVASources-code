<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adduser.jsp' starting page</title>
    
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
  <html:errors/>
  <html:messages id="error" message="true">
  	<bean:write name="error"/>
  </html:messages>
     <h1 align="center"><bean:message key="label.option"/></h1>
     <html:form action="useraction.do?action=add" method="post">
    <bean:message key="label.stuno"/><html:text name="userVoForm" property="stuno" style="height:40px" size="32"/>
  	<bean:message key="label.name"/><html:text name="userVoForm" property="name" style="height:40px" size="32"/>
  	<bean:message key="label.password"/><html:password name="userVoForm" property="password" style="height:40px" size="32"/>
    <bean:message key="label.age"/><html:text name="userVoForm" property="age" style="height:40px" size="32"/>
     <bean:message key="label.sex"/><html:radio name="userVoForm" property="sex" value="男"></html:radio>男
     <html:radio name="userVoForm" property="sex" value="女"></html:radio>女<br/><br/>
    <bean:message key="label.cadeid"/><html:text name="userVoForm" property="cadeid" style="height:40px" size="32"/>
     <bean:message key="label.classname"/><html:text name="userVoForm" property="classname" style="height:40px" size="32"/>
        <html:submit><bean:message key="label.button.value"/></html:submit>
     </html:form>
  </body>
</html:html>
