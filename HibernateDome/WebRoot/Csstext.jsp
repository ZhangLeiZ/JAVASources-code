<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Csstext.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!--
  div{
  	border:15px solid transparent;
	width:250px;
	padding:20px 30px;
  }
  div{
  		border:1px solid black;
  		padding:35px;
  		background-image:url(images/an011.png);
  		background-reprat:no-repeat;
  		background-position:right;
  	}
  -->
  </head>
  <style type="text/css">
 
  	
  	#round{
  	-webkit-border-image:url(images/border.png)30 30 round;
  	border-image:url(images/border.png)30 30 round;
  	}
  	#ss{
  		-webkit-border-image:url(images/border.png)30 30 stretch;
  		border-image:url(images/border.png)30 30 stretch;
  		padding:30px 60px;
  	}
  	#but1{
  	    background: url(images/an043.png);
  		width:250px;
  		height:65px;
  		border-radius:25px;
  		background-position:right top;
  		background-repeat:repeat;
  		border:20px solid transparent;
  	}
  	#p1{
  		border-radius:25px;
  		width:250px;
  		height:150px;
  		background-color:#8Ac007;
  		padding:20px;
  	}
  	#p2{
  		border-radius:25px;
  		width:250px;
  		height:150px;
  		border:2px solid #8Ac007;
  		padding:20px;
  	}
  	#p3{
  		border:10px dotted red;
  		border-radius:25px 60px 25px 60px;
  		width:250px;
  		height:150px;
  		background:#8Ac007;
  		padding:20px;
  		background-clip:content-box;
  	}
  	#div1{
  		border:10px dotted blue;
  		width:400px;
  		background-image:url(images/q8.jpg),url(images/beijing.jpg);
  		background-posiation:right bottom left top; 
  		background-repeat:no-reprat,repeat;
  	}
  	#div2{
  		border:15px dotted green;
  		background:url(images/beijing.jpg);
  		background-origin:center-box;
  		background-position:right;
  		background-size:400px 500px;
  		background-repeat:no-repeat;
  		padding-top:50px;
  		background-clip:padding-box;
  	}
  	#grad1{
  		height:200px;
  		background: -webkit-linear-gradient(red, blue); 
  		background:linear-gradient(green,red,yellow,blue);
  	}
  	#grad2{
  		height:200px;
  		background:-webkit-linear-gradient(left,red,yellow,blue,black);
  		background:linear-gradient(to right,red,yellow,blue,black);
  	}
  	#grad3{
  		height:400px;
  		width:400px;
  		background:-webkit-linear-gradient(bottom left,red,blue);
  		background:-webkit-linear-gradient(bottom right,red,blue,green);
  		background:linear-gradient(to left top,blue,red);
  		background:linear-gradient(to right top,green,yellow);
  	}
  	#grad4{
  		color:white;
  		text-align:center;
  		font-size:20px;
  		height:200px;
  		background:-webkit-linear-gradient(red, orange, yellow, green, blue, indigo, violet);
  	}
  </style>
  <body>
  <div id="div1">
  <h1>的v你哦啊好女欧式</h1>
  <p>个人舍尔个人和恶GRE个人体热更是豪华版</p>
  <p>个人舍尔个人和恶GRE个人体热更是豪华版</p>
  </div>
   <div id="div2">
  <h1>的v你哦啊好女欧式</h1>
  <p>个人舍尔个人和恶GRE个人体热更是豪华版</p>
  <p>个人舍尔个人和恶GRE个人体热更是豪华版</p>
  </div>
  <div id="grad1"></div>
   <div id="grad2"></div>
    <div id="grad3"></div>
    <div id="grad4">被害人疼 个二哥担任过</div>
    <div id="round">本田十二楼弄个号若干女哦啊而韩国</div>
    <div id="ss">女的佛闹得更好二牛</div>
    <p id="p1">v奋斗背后如何</p>
     <p id="p2">v奋斗背后如何</p>
      <p id="p3">v奋斗背后如何</p>
    <button id="but1"></button>
  </body>
</html>
