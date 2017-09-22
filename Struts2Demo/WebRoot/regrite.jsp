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
    
    <title>My JSP 'regrite.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  	 <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.1.js"></script>
  	 <script type="text/javascript">
  	/* $(function(){
  	 	$("#sub").bind("click",function(){
  	 		var url ="${pageContext.request.contextPath}/RgriteDome.action";
	  	 	jQuery.post(url,
	  	 	{"actions":"reg"},
	  	 	function(data){
	  	 	alert(data);
	  	 	},
	  	 	"json"
	  	 	);
  	 	});
  	 });*/
  	 </script>
  </head>
  
  <body>
  <s:form action="RgriteDome!add.action" method="post" theme="simple">
    	用户编号：<s:textfield name="stud.stuid"/><br/><br/>
    	用户名称：<s:textfield name="stud.name"/><br/><br/>
    	用户密码：<s:password name="stud.password"/><br/><br/>
    	用户年龄：<s:textfield name="stud.age"/><br/><br/>
    	用户性别：<s:radio name="stud.sex" list="#{'男':'男','女':'女'}" listKey="key" listValue="value"/><br/><br/>
    	用户身份证：<s:textfield name="stud.cardno"/><br/><br/>
    	民&nbsp;族:<s:select name="stud.nationid" list="#request.listnation" listKey="nationid" listValue="nation" style="width:155px"/><br/>
    	班&nbsp;级:<s:select name="stud.classid" list="#request.listclass" listKey="classid" listValue="classname" style="width:155px"/><br/>
    	<s:submit value="注册" id="sub"></s:submit>
  </s:form>
  </body>
</html>
