<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'json2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript" src="${pageContext.request.contextPath  }/js/json.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.1.js"></script>
  <script type="text/javascript" >
  		//淡入
  				$(function(){
	  				$("#ids").click(function(){
	  					$("#div1").fadeIn();
	  					$("#div2").fadeIn(4000);
	  					$("#div3").fadeIn(4000);
	  				});
  				});
  				//淡出
  				$(function(){
  					$("button").click(function(){
	  					$("#div1").fadeOut();
	  					$("#div2").fadeOut(4000);
	  					$("#div3").fadeOut(4000);
	  				});
  				});
  				/*
  				$(document).ready(function(){
				    $("button").click(function(){
				    $("#div1").fadeToggle();
				    $("#div2").fadeToggle("slow");
				    $("#div3").fadeToggle(3000);
  					});
				});
jQuery fadeToggle() 方法可以在 fadeIn() 与 fadeOut() 方法之间进行切换。
如果元素已淡出，则 fadeToggle() 会向元素添加淡入效果。
如果元素已淡入，则 fadeToggle() 会向元素添加淡出效果。
				$(document).ready(function(){
					  $("button").click(function(){
					    $("#div1").fadeTo("slow",0.15);
					    $("#div2").fadeTo("slow",0.4);
					    $("#div3").fadeTo("slow",0.7);
  					});
				});
				
jQuery fadeTo() 方法允许渐变为给定的不透明度（值介于 0 与 1 之间）。
语法:
$(selector).fadeTo(speed,opacity,callback);
必需的 speed 参数规定效果的时长。它可以取以下值："slow"、"fast" 或毫秒。
fadeTo() 方法中必需的 opacity 参数将淡入淡出效果设置为给定的不透明度（值介于 0 与 1 之间）。
可选的 callback 参数是该函数完成后所执行的函数名称。
  				*/
  				

  </script>
  <body>
   <input type="button" id="ids" value="测试"/>
   <p1>淡入淡出</p>
   <button>开始测试</button>
   <div id="div1" style="width:100px;height:100px;display:none;background:red"></div>
   <div id="div2" style="width:100px;height:100px;display:none;background:blue"></div>
   <div id="div3" style="width:100px;height:100px;display:none;background:green"></div>
  </body>
</html>
