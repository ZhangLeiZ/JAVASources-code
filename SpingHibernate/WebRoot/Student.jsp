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
    
    <title>My JSP 'Student.jsp' starting page</title>
    
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
  <h1>学生资料</h1>
  <hr>
 <table width="100%" border="1" align="center" cellpadding="1" cellspacing="1">
  	  	<thead>
	  	<tr>
	  		<th>员工编号</th>
	  		<th>员工姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>操作</th>
	  	</tr>
  	</thead>
  		<s:iterator value="#request.list" var="y" status="st">
  			<s:if test="%{#st.odd}">
  				<tr bgcolor="green">
  			</s:if>
  			<s:else>
  				<tr bgcolor="red">
  			</s:else>
				<td align='center'>${y.sno}</td>
				<td align='center'>${y.sname}</td>
				<td align='center'>${y.ssex}</td>
				<td align="center" width="80">
					<a href="accountaction!update.action?employee.oid=" >修改 </a>
					<a href="accountaction!del.action?employee.oid="  onclick="javascript:if(confirm('删除确认')){return true;}else{return false;}"> 删除 </a>
				</td>
			</tr>
		</s:iterator>  
		<tr>
  	<td colspan="12" align="center">
			<a href="javascript.void(0)">总记录数&nbsp;&nbsp;<s:property value="#request.nate.allRows"/></a>
			<a href="">页码&nbsp;&nbsp;<s:property value="#request.nate.totalPage"/>/<s:property value="#request.nate.currentPage"/>页</a>
			<a href="accountaction!Pagelist.action?currenpage=1">首   页</a>
			<s:if test="#request.nate.currentPage<=1" >
				<a href="accountaction!Pagelist.action?currenpage=1">上一页</a>
			</s:if>
			<s:else>
				<a href="accountaction!Pagelist.action?currenpage=<s:property value="#request.nate.currentPage - 1"/>">上一页</a>
			</s:else>
			 <span class="current"><s:property value="#request.nate.currentPage"/></span>
			 <s:if test="#request.nate.currentPage>=#request.nate.totalPage">
			 <a href="accountaction!Pagelist.action?currenpage=<s:property value="#request.nate.totalPage"/>">下一页</a>  
			 </s:if>
			 <s:else>
            <a href="accountaction!Pagelist.action?currenpage=<s:property value="#request.nate.currentPage + 1"/>">下一页</a>  
           	</s:else>
            <a href="accountaction!Pagelist.action?currenpage=<s:property value="#request.nate.totalPage"/>">尾页</a>  
		</td>
		</tr>
    </table>
  </body>
</html>
