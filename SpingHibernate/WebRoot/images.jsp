<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'images.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!--更为复杂的animation属性
			 animation-name:myfrist;
			animation-duration:5s;
			animation-timing-function:linear;
			animation-delay:2s;
			animation-iteration-count:infinite;
			animation-direction:alternate;
			animation-play-state:running; -->
  </head>
  <style type="text/css">
  		#aoutwthid{
  			 position: relative;
			-moz-box-shadow: 1px 2px 4px rgba(0, 0, 0,0.5);
			-webkit-box-shadow: 1px 2px 4px rgba(0, 0, 0, .5);
			box-shadow: 1px 2px 4px rgba(0, 0, 0, .5);
			padding: 10px;
			background: white;
  			
  		}
  		#aoutwthid img {
  			  width: 100%;
			    border: 1px solid #8a4419;
			    border-style: inset;
  			
  		}
  		
  		#s1{
  			width:200px;
  			height:200px;
  			position:relative;
  			background:pink;
  			box-shadow:5px 5px 5px rgba(0,0,0,.5);
  			animation:myfrist 5s linear 5s infinite alternate;
  		}
  		
  		@keyframes myfrist{
  			10%{background:blue;left:0px;top:0px}
  			40%{background:red;left:200px;top:0px}
  			60%{background:green;left:0px;top:200px}
  			80%{background:orange;left:200px;top:200px}
  			100%{background:yellow;left:0px;top:0px}
  		}
  		p{
  			font-size:50px;
  			color:white;
  			padding:60px;
  			text-align:center;
  		}
  </style>
  <body>
   <!-- <div id="s2">
		<img src="images/meishu.jpg" alt=""/>   
   </div>  -->
   <div id="s1">
   	<p>1</p>
   </div>
    <div id="s2"></div>
     <div id="s3"></div>
      <div id="s4"></div>
      
  </body>
</html>
