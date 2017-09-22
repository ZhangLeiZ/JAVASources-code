<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/ajax.js"></script>
    <script type="text/javascript">
  	function recedata(){
  		if(xmlhttp.status==200){
  		var stu = xmlhttp.responseText;
  			if(stu=="succ"){
	  			document.getElementById("ims").src="images/tiku_icon_right.png";
	  			document.getElementById("ims").style.visibility="visible";
  			}else if(stu=="fuil"){
	  			document.getElementById("ims").src="images/tiku_icon_wrong.png";
	  			document.getElementById("ims").style.visibility="visible";
  			}else if(stu=="ok"){
  				alert("恭喜你注册成功");
  			}
  		}
  	}
  	function validateUser(){
  		var name = document.getElementById("names").value;
  		if(name==""){
  			alert("请输入姓名！");
  			return;
  		}
  		var param="action=click&name="+name;
  		var url="${pageContext.request.contextPath}/Ajaxclickservlet"
  		send("post",url,param,true);
  	}
  	
  	function validateusers(){
  
  		var id = document.getElementById("id").value;
  		var name = document.getElementById("names").value;
  		var age = document.getElementById("age").value;
  		var sex = document.getElementById("sex").value;
  		
  		if(id==""){
  			alert("请输入账号");
  			document.getElementById("id").focus();
  			return;
  		}
  		if(name==""){
  			alert("请输入姓名");
  			document.getElementById("name").focus();
  			return;
  		}
  		if(age==""){
  			alert("请输入年龄");
  			document.getElementById("age").focus();
  			return;
  		}
  		if(sex==""){
  			alert("请输入性别");
  			document.getElementById("sex").focus();
  			if(!document.getElementById("sex").checked){
  				sex="女";
  			}
  			return;
  		}
  		var param="action=register&id="+id+"&name="+name+"&age="+age+"&sex="+sex;
  		var url="${pageContext.request.contextPath}/Ajaxclickservlet"
  		send("post",url,param,true);
  	}
  </script>
  </head>
  
  <body>
     用户账号：<input type="text" id="id" style="height:40px" size="32"/><br/><br/>
  	用户名：<input type="text" id="names" style="height:40px" name="names" size="32"/>
  		   <img src="images/tiku_icon_right.png" id="ims" height="20" style="visibility:hidden">
    	  <input type="button" style="height:40px" value="检查" onclick="validateUser();"/><br/><br/>
    年龄：<input type="text" id="age" style="height:40px" size="32"/><br/><br/>
    性别：<input type="radio" id="sex"  value="男" checked/>男
        <input type="radio" id="sex" value="女"/>女<br/><br/>
        <input type="button" id="reg" value=" 注 册 " onclick="validateusers();"/>
  </body>
</html>
  		
