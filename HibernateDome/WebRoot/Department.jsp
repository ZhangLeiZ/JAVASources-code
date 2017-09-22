<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  <h1 align="center">部门管理</h1>
  <hr color="green">
    <s:form action="DepartmentAction!add.action" name="form1">
    	<s:textfield name="depa.oid" label="部门编号"></s:textfield>
    	<s:textfield name="depa.parentid" label="上级部门OID"></s:textfield>
    	<s:textfield name="depa.deptName" label="部门名称"></s:textfield>
    	<s:textfield name="depa.phone" label="电话"></s:textfield>
    	<s:textfield name="depa.email" label="email"></s:textfield>
    	<s:textfield name="depa.fax" label="传真"></s:textfield>
    	<s:textfield name="depa.manager" label="负责人OID"></s:textfield>
    	<s:textfield name="depa.address" label="部门地址"></s:textfield>
    	<s:textfield name="depa.zipCode" label="邮编"></s:textfield>
    	<s:textarea name="depa.description" label="描述" rows="5" cols="50"></s:textarea>
    	<s:submit value="注册"></s:submit>
    </s:form>
    <a href="DepartmentAction!select.action">查询所有记录</a>
    <h1 align="center">部门一览表</h1>
    <table border="1" width="1300">
    	<tr>
	  <th>部门编号</th>     
	  <th>上级部门OID</th>  
	  <th>部门名称</th>     
	  <th>电话</th>
	  <th>email</th>     
	  <th>传真</th>  
	  <th>负责人OID</th>     
	  <th>部门地址</th>
	  <th>邮编</th>     
	  <th>描述</th>
	  <th>操作</th>
	</tr>
    	<c:forEach items="${pagelist}" var="y">
			<tr height='40' width="300">
				<td align='center'>${y.oid}</td>
				<td align='center'>${y.parentid}</td>
				<td align='center'>${y.deptName}</td>
				<td align='center'>${y.phone}</td>
				<td align='center'>${y.email}</td>
				<td align='center'>${y.fax}</td>
				<td align='center'>${y.manager}</td>
				<td align='center'>${y.address}</td>
				<td align='center'>${y.zipCode}</td>
				<td align='center'>${y.description}</td>
				<td align="center" width="80">
					<a href="DepartmentAction!update?bianhao=${y.oid}.action" >修改 </a>
					<a href="DepartmentAction!del?bianhao=${y.oid}.action"  onclick="javascript:if(confirm('删除确认')){return true;}else{return false;}"> 删除 </a>
				</td>
			</tr>
		</c:forEach>  
		<td colspan="8" align="center">
			<a href="">总记录数&nbsp;&nbsp;<s:property value="#request.nate.allRows"/></a>
			<a href="">页码&nbsp;&nbsp;<s:property value="#request.nate.totalPage"/>/<s:property value="#request.nate.currentPage"/>页</a>
			<a href="DepartmentAction!Pagelist.action?currenpage=1">首   页</a>
			<s:if test="#request.nate.currentPage<=1" >
				<a href="DepartmentAction!Pagelist.action?currenpage=1">上一页</a>
			</s:if>
			<s:else>
				<a href="DepartmentAction!Pagelist.action?currenpage=<s:property value="#request.nate.currentPage - 1"/>">上一页</a>
			</s:else>
			 <span class="current"><s:property value="#request.nate.currentPage"/></span>
			 <s:if test="#request.nate.currentPage>=#request.nate.totalPage">
			 <a href="DepartmentAction!Pagelist.action?currenpage=<s:property value="#request.nate.totalPage"/>">下一页</a>  
			 </s:if>
			 <s:else>
            <a href="DepartmentAction!Pagelist.action?currenpage=<s:property value="#request.nate.currentPage + 1"/>">下一页</a>  
           	</s:else>
            <a href="DepartmentAction!Pagelist.action?currenpage=<s:property value="#request.nate.totalPage"/>">尾页</a>  
		</td>
    </table>
 </body>
</html>
