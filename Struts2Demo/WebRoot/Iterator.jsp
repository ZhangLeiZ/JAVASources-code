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
    
    <title>My JSP 'Iterator.jsp' starting page</title>
    
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
   <h1 align="center">iterator标签的使用</h1>
  <table>
   <s:iterator begin="1" end="9" var="d" status="st">
   <s:if test="#st.odd">
   		<tr bgcolor="red">
   </s:if>
   <s:else> <tr bgcolor="green"></s:else>
   		<s:iterator begin="1" end="#d" var="dd">
   			<td width="400">${d}*${dd }=${d*dd}</td>
   		</s:iterator>
   		</tr>
   </s:iterator>
   <hr color="blue">
   <s:form action="Ognlaction!selects.action" method="post" theme="simple">
   <s:token></s:token>
    	用户编号：<s:textfield name="stud.stuid"/><br/><br/>
    	用户名称：<s:textfield name="stud.name"/><br/><br/>
    	用户密码：<s:password name="stud.password"/><br/><br/>
    	用户年龄：<s:textfield name="stud.age"/><br/><br/>
    	用户性别：<s:radio list="#request.sexid"  name="sexid" key="value" value="value"></s:radio><br/><br/>
    	用户身份证：<s:textfield name="stud.cardno"/><br/><br/>
    	民&nbsp;族:<s:select name="stud.nationid" list="#request.listnation" listKey="nationid" listValue="nation" style="width:155px"/><br/><br/>
    	班&nbsp;级:<s:select name="stud.classid" list="#request.listclass" listKey="classid" listValue="classname" style="width:155px"/><br/>
    	<s:checkboxlist list="#request.classmap" name="classnames" key="key" value="value"></s:checkboxlist>
    	<s:submit value="注册" id="sub"></s:submit>
  </s:form>
   </table>
  </body>
</html>
