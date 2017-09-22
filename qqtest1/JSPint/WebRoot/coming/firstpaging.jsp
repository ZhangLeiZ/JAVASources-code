<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html lang="zh">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>网络直播系统</title>

<!--可无视-->
<link rel="stylesheet" type="text/css" href="css/reset.css" />
<link rel="stylesheet" type="text/css" href="css/default.css">

<!--必要样式-->
<link rel='stylesheet' type="text/css" href='css/font-awesome.min.css'>
<link rel="stylesheet" type="text/css" href="css/styles.css">

</head>
<body>
<article class="container">

	<br><br><br>
	
	<ul class="metro">
		<li><i class="fa fa-gamepad"></i><a href="studentzhuce.jsp"><span>学生注册</span></a></li>
		<li><i class="fa fa-cogs"></i><a href="<%=basePath %>systemvo/studentlogin.jsp"><span>学生登录</span></a></li>
		<li><i class="fa fa-envelope-o"></i><a href="teacherzhuce.jsp"><span>教师注册</span></a></li>
		<li><i class="fa fa-comments-o"></i><a href="teacherlogin.jsp"><span>教师登录</span></a></li>
		<li><i class="fa fa-music"></i><a href="guanliyuan.jsp"><span>管理员服务窗口</span></a></li>
		<li><i class="fa fa-heart-o"></i><a href="jinli.jsp"><span>总经理入口</span></a></li>
		<li><i class="fa fa-picture-o"></i><span>页面的展示</span></li>
	</ul>

	<div class="box">
		<span class="close"></span>
		<p></p>
	</div>
	
</article>

<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function () {
	var $box = $('.box');
	$('.metro li').each(function () {
		var color = $(this).css('backgroundColor');
		var content = $(this).html();
		$(this).click(function () {
			$box.css('backgroundColor', color);
			$box.addClass('open');
			$box.find('p').html(content);
		});
		$('.close').click(function () {
			$box.removeClass('open');
			$box.css('backgroundColor', 'transparent');
		});
	});
});
</script>

</body>
</html>