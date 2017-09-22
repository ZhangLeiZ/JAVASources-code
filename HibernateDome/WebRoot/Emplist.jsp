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
    
    <title>My JSP 'Emplist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/base.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/home.css?v=1.2.0">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.3.0/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.3.0/themes/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.3.0/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.3.0/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.3.0/locale/easyui-lang-zh_CN.js"></script>
 	<script type="text/javascript">
  		$(function(){
  		var d = new Date();
  		var year = d.getFullYear();
  		var month = d.getMonth()+1;
  		var date = d.getDate();
  		year = year+"-"+month;
  		$("#sdate1").datebox("setValue",year+"-"+date);
  		$("#edate1").datebox("setValue",year+"-30");
  		})
  		function intext(){
  			var da = $("#sdate1").datebox("getValue")+" 00:00:00";
  			var ea = $("#edate1").datebox("getValue")+" 59:59:59";
  			$("#sdate").val(da);
  			$("#edate").val(ea);
  			return true;
  		}
  	</script>
  </head>
  
  <body>
  <h1 align="center">员工资料列表</h1>
    <hr/>
 
<table align="center" border="0" cellpadding="0" cellspacing="0" width="1100" >
	    <s:form  theme="simple" name="form1" action="accountaction!list.action" method="post" onsubmit="return intext();">
		<tr>
		<s:hidden name="sdate" id="sdate"/>
		<s:hidden name="edate" id="edate"/>
			<td align="center">姓名：<s:textfield name="employee.employeeName"  theme="simple"/></td>
			<td>账户:<s:textfield name="account.username"/></td>
     		<td>生日:<s:textfield name="sdate1" id="sdate1" cssClass="easyui-datebox"/>到<s:textfield name="edate1" id="edate1" cssClass="easyui-datebox"/></td>
     		<td><s:submit value="查询" cssStyle="width:120px"></s:submit></td>
     	</tr>
    	</s:form>
     </table>
      <a href="accountaction!Pagelist.action">查询所有记录</a>||
      <a href="Account.jsp">新增</a>
      <hr color="green" width="150">
  <table width="100%" border="1" align="center" cellpadding="1" cellspacing="1">
  	  	<thead>
	  	<tr>
	  		<th>员工编号</th>
	  		<th>员工姓名</th>
			<th>性别</th>
			<th>所属部门OID</th>
			<th>职务</th>
			<th>出生日期</th>
			<th>毕业学校</th>
			<th>联系电话</th>
			<th>邮箱</th>
			<th>用户账号</th>
			<th>密码</th>
			<th>操作</th>
	  	</tr>
  	</thead>
  		<s:iterator value="#request.pagelist" var="y" status="st">
  			<s:if test="%{#st.odd}">
  				<tr bgcolor="green">
  			</s:if>
  			<s:else>
  				<tr bgcolor="red">
  			</s:else>
  			<td align='center'>${y.oid}</td>
				<td align='center'>${y.employeeName}</td>
				<td align='center'>${y.sex}</td>
				<td align='center'><s:select theme="simple" name="dep.oid" list="#request.deplist" listKey="oid" listValue="deptName"/></td>
				<td align='center'>${y.jobid}</td>
				<td align='center'>${y.birthday}</td>
				<td align='center'>${y.school}</td>
				<td align='center'>${y.phone}</td>
				<td align='center'>${y.email }</td>
				<td align='center'>${y.account.username }
				<td align='center'>${y.account.password }
				<td align="center" width="80">
					<a href="accountaction!update.action?employee.oid=${y.oid }" >修改 </a>
					<a href="accountaction!del.action?employee.oid=${y.oid }"  onclick="javascript:if(confirm('删除确认')){return true;}else{return false;}"> 删除 </a>
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
