<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'oneajax.jsp' starting page</title>
    
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
  		var xmlhttp=null;
  		function createXmlHttpRequest(){
  			try{
  				return new ActiveXObject("Msxml2.XMLHTTP");
  			}catch(e){
  				try{
  				return new ActiveXObject("Microsoft.XMLHTTP");
  				}catch(e){
  					try{
  						return new XMLHttpRequest();
  					}catch(e){
  						alert("创建失败！");
  					}
  				}
  			}
  		}
  		function sendrequest(method,url,param,async){
  			xmlhttp = createXmlHttpRequest();
  			xmlhttp.onreadystatechange=getResult;
  			xmlhttp.open(method,url,async);
  			if(method=="get" || method=="GET"){
  				xmlhppt.send(null);
  			}else{
  				xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
  				xmlhttp.send(param);
  			}
  			
  		}
  		
  		function getResult(){
  			if(xmlhttp.readystate==4 && xmlhttp.status==200){
  				alert(xmlhttp.responseText+"操作完成");
  			}else if(xmlhttp.status=="404"){
  					alert("文件找不到！");
  			}
  		}
  		
  		function Text(){
  			var param="你好";
  			var url ="${pageContext.request.contextPath}/AJax/Jtext.jsp";
  			var method="post";
  			var async=false;
  			sendrequest(method,url,param,async);
  		}
  </script>
  <body>
    This is my JSP page. <br>
    <input type="button" value="开始" onclick="Text()">
  </body>
</html>
