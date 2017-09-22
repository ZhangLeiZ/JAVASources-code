<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'chlick.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript">
  	var xmlhttp;
  	function createXMLHttpRequest(url){
  			try{
  				xmlhttp=new ActiveXObjext("Msxml2.XMLHTTP");
  			}catch(e){
  				try{
  				xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  				}catch(e){
  					try{
  					xmlhttp=new XMLHttpRequest();
  					}catch(e){
  					alert("创建失败");
  					}
  				}
  			}
  			xmlhttp.onreadystatechange=getResult;
  			xmlhttp.open('get',url,true);
  			xmlhttp.send(null);
  	}
  	function getResult(){
  		if(xmlhttp.readyState==4){
  			if(xmlhttp.status==200){
  			alert(xmlhttp.responseText);
  			document.getElementById("msg").innerHTML=xmlhttp.responseText;
  			}else{
  				alert("你请求的页面有错误！");
  			}
  		}
  	}
  	function checkuser(userName){
  		if(userName.value==""){
  			alert("请输入用户名");
  			userName.focus();
  			return;
  		}else{
  			createXMLHttpRequest("AJax/checkuser.jsp?user="+userName.value);
  		}
  	}
  </script>
  
  <body>
    <form method="get" action="" name="from1" >
    	用户名：<input name="username" type="text" id="username" size="32"/>
    	<input type="button" value="检查名称" onclick="checkuser(from1.username);"/>
    </form>
    信息：<div id="msg"></div>
  </body>
</html>
