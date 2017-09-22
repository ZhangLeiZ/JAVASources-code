<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dwrdemo.jsp' starting page</title>
    
	<script type="text/javascript" src="dwr/engine.js"></script>
	<script type="text/javascript" src="dwr/util.js"></script>
	<script type="text/javascript" src="dwr/interface/Helloservice.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/prototype.js"></script>
	<script type="text/javascript">
		function adds(){
			var name = document.getElementById("names").value;
			var age = document.getElementById("ages").value;
			var sex = document.getElementById("sexs").value;
			var id = document.getElementById("id").value;
			var stu ={"name":name,"age":age,"sex":sex}
			Helloservice.serviceh(stu,id,scress);
		}
		function scress(data){
			document.getElementById("msg").innerText=data;
		}
	</script>
  </head>
  
  <body>
    <h1 align="center">dwr测试</h1>
    <div id="msg"></div>
    <table border="0" width="200" height="200" align="center">
    	<tr><td>编号：<input type="text"  id="id" value="1001"></td></tr>
    	<tr><td>姓名：<input type="text"  id="names" value="张丽"></td></tr>
    	<tr><td>年龄：<input type="text" id="ages" value="19"></td></tr>
    	<tr><td>性别：<input type="text" id="sexs" value="女"></td></tr>
    	<tr><td><input type="button"  value="提交" onclick="adds();"></td></tr>
    </table>
  </body>
</html>
