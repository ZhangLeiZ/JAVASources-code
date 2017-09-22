<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Dome.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <!-- -->
  <style>
  		.img{
  			--bg:url("images/img1.jpg");
  			background-image: var(--bg);
  			width:450px;
  			height:350px;
  		}
  		.img .content h2 {
 			font-size: 18px;
 			color:#333333;
		}
		.img .content{  
		    position:absolute;  
		    padding:40px 30px;
		    margin:40px 95px;
		    top:60px;
		    background-color:#ddd;  
		    opacity:0.7;  
		    text-align:center;  
			border-radius:8px;
		}  
		#d1{
			--gs:url("images/img2.jpg");
  			background-image: var(--gs);
  			width:350px;
  			height:200px;
  			position:relative;
			animation:myfrist 5s linear 2s infinite alternate;
		}
		#d1 #box p{
			color:white;
			font-size:20px;
		}
		#d1 #box{
			position:absolute;
			padding:20px 70px;
			margin:40px 80px;
			background-color:#cc9933;
			opacity:0.7;
			text-align:center;
			border-radius:8px;
		}
		@keyframes myfrist{
			0%   {left:0px; top:0px;}
			25%  {left:200px; top:0px;}
			50%  {left:200px; top:200px;}
			75%  {left:0px; top:200px;}
			100% {left:0px; top:0px;}
		}
  </style>
  <body>
   <div class="img">
	<div class="content">  
		<h2>&nbsp;图片使用高斯模糊效果</h2>
	</div>  
	</div>
	<div id="d1">
		<div id="box">
			<p>LIVE</p>
		</div>
	</div>
  </body>
</html>
