<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Dome2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <style>
  	.img{
  			--bg:url("images/img1.jpg");
  			background-image: var(--bg);
  		}
  	.img .bulbox{
  			color:#3e405e;
  			width:100%;
  			height:100%;
  			max-height:300px;
  			overflow:hidden;
  		}
  		
		.img .bulbox::before{
			z-index:10;
			opacity:0.5;
			background:#fff;
		}
		.img .bulbox h2 {
 			font-size: 18px;
		}
		.img .bulbox::after{
			 background-size: cover;
			 background-position: center;
			 background-attachment: fixed;
			 -webkit-filter: blur(15px) brightness(110%);
			 filter: blur(15px) brightness(110%);
			 background-image: var(--bg);
		} 
  </style>
  <body>
   <div class="img">
	<div class="bulbox">  
		<h2>图片使用高斯模糊效果</h2>
	</div>  
	</div>
  </body>
</html>
