<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'selecdstudy.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.1.js">
	/*<script type="text/javascript">
			function selectstu(){
				var url="${pageContext.request.contextPath}/RgriteDome!select.action";
				$.post(url,
				{"actions":"select"},
				function(data){alert(data);},
				"text"
				);
			}*/
	</script>
  </head>
  <body>
  <h1 align="center">学生资料一览表</h1> 
  <hr>
   <table align="center" width="800" cellpadding="2" cellspacing="1" border="1">
     <tr><td colspan="9">
	     <a href="${pageContext.request.contextPath}/RgriteDome!select.action">查看学生资料</a>
	     <a href="${pageContext.request.contextPath}/RgriteDome.action">增加</a>
     </td></tr>
     	<thead>
     		<td align="center">编号</td>
     		<td align="center">用户名</td>
     		<td align="center">密码</td>
     		<td align="center">年龄</td>
     		<td align="center">性别</td>
     		<td align="center">身份证</td>
     		<td align="center">民族</td>
     		<td align="center">班级名称</td>
     		<td align="center" colspan="3">操作</td>
     	</thead>
     	<tbody>
     	<c:forEach items="${studylist}" var="y">
     		<tr>
     			<td align='center'>${y.stuid}</td>
				<td align='center'>${y.name}</td>
				<td align='center'>${y.password}</td>
				<td align='center'>${y.age}</td>
				<td align='center'>${y.sex}</td>
				<td align='center'>${y.cardno}</td>
				<td align='center'>${y.nationid}</td>
				<td align='center'>${y.classid}</td>
				<td>
				<a href="${pageContext.request.contextPath}/RgriteDome!del.action?actions=${y.stuid}">删除</a>
				<a href="${pageContext.request.contextPath}/RgriteDome!update.action?actions=${y.stuid}">修改</a>
     			</td>
     		</tr>
     	</c:forEach>
     	</tbody>
     </table>
  </body>
</html>
