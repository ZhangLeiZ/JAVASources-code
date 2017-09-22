<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<meta charset="utf-8"/>
<title>HTML5文字弹幕效果代码</title>
<style type="text/css">
*{
	margin:0;
	padding:0;
	list-style: none;
	border:0;
}
body{
	background: #bcbcbc;
}
.main{
	width: 1000px;
	height: 600px;
	margin:0 auto;
	position: relative;
}
.main img{
	position: absolute;
	right: 0;
	bottom:0;
	width: 100px;
	height: 100px;
}
#canvas{
	display: block;
	background: #000;
}
</style>
</head>
<body>

<div class="main">
	<canvas id="canvas">欢迎来到我的网络直播间</canvas>
	<img src="picwx.jpg">
</div>

<script type="text/javascript">
	var canvas=document.getElementById('canvas');
	var ctx=canvas.getContext("2d");
	var width=1000;
	var height=600;
	var colorArr=["yellow","pink","orange","red","green"];
	var textArr=[
		"在本网站！希望大家好好学习！",
		"在任何时候都应该学的快乐？",
		"玩得开心",
		"期待为你提供最好得到服务",
		"总经理：17607975702",
		"如果有任何疑问可以扫码联系我哦！"
	]
	canvas.width=width;
	canvas.height=height;
	var image=new Image();

	ctx.font = "20px Courier New";
	var numArrL=[80,100,5,300,500,430];//初始的X
	var numArrT=[80,100,20,300,380,210];//初始的Y
	setInterval(function(){
	ctx.clearRect(0,0,canvas.width,canvas.height);
	ctx.save();
	for(var j=0;j<textArr.length;j++){
		numArrL[j]-=(j+1)*0.6;
		ctx.fillStyle = colorArr[j]
		ctx.fillText(textArr[j],numArrL[j],numArrT[j]);
	}
	for(var i=0;i<textArr.length;i++){
		if(numArrL[i]<=-500){
			numArrL[i]=canvas.width;
		}
	}
	ctx.restore();
	},30)

</script>
<div style="text-align:center;">
</div>
</body>
</html>