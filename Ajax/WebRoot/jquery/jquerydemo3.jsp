<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jquerydemo3.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.1.js"></script>
  	<script type="text/javascript">
  	$(function(){
  		$("#reg").bind("click",function(){
  			var id = $("#id").val();
  			if(id==""){
  				alert("请输入账号！");
  			}
  			var names = $("#names").val();
  			if(names==""){
  				alert("请输入用户名！");
  			}
  			var age = $("#age").val();
  			if(age==""){
  				alert("请输入年龄！");
  			}
  			
  			var url = "${pageContext.request.contextPath}/Jqueryservlet";
  			jQuery.post(url,
  			 {"id":"id",
  			 "names":"names",
  			 "age":"age"},
  			 function(data){
				$("#msg").text(data);
				}, 
  			 "text") 
  		});
  	});
  	</script>
  <body>
  <p id="msg"></p>
 	用户账号：<input type="text" id="id" style="height:40px" size="32"/><br/><br/>
  	用 户 名：<input type="text" id="names" style="height:40px" name="names" size="32"/><br/><br/>
     年    龄：<input type="text" id="age" style="height:40px" size="32"/><br/><br/>
     性  别：<input type="radio" name="sex"  value="男"/>男
        <input type="radio" name="sex" value="女"/>女<br/><br/>
        <input type="button" id="reg" value=" 注 册 "/>
  </body>
</html>
