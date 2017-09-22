<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jquerydemo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.1.js"></script>
  </head>
  
  <body>
    <h1 align="center">jquery测试</h1>
    <ul>
    	<li id="li1">fsfgdsgd</li>
    	<li class="li2">eeeeeeee</li>
    	<li name="li3">rrrrrrrrr</li>
    	<li sss="li4">bbbbbbbbb</li>
    </ul>
    <input type="button" id="btuonn" value="测试">
    
    <form action="" name="form1" id="form1">
    		用户名：<input type="text" id="btutext" value="展示"><br/>
    		性别<input type="radio" name="sex" value="男">男</input>
    			<input type="radio" name="sex" value="女">女</input><br/>
    			<input type="button" id="btuvalue" value="取值" asc="sss"><br/>
    			<input type="button" id="hidden" value="隐藏"/>
    </form>
    <input type="button" id="noen" value="显示"/><br/>
    <input type="button" id="dtusex" value="更改单选框">
  </body>
  <script type="text/javascript">
  	$("#btuonn").click(
  		function(){
  		/*
  			$("ul li").each(
  				function(i,v){
  					alert(i+" "+$(v).text());
  			});
  			*/
  			alert($("ul li:first").text());
  			alert($("ul li:last").text());
  			
  			 $("ul li:even").each(
  				function(i,v){
  					alert(i+""+$(v).text($(v).text()+"33333"));
  					$(v).css("background","#ff00ff");
  				});
  			$("ul li:odd").each(
  				function(i,v){
  					$(v).css("background","#ffff22");
  				});
  		}
  	);
  	$("[sss=li4]").click(function(){
  		alert($("[sss=li4]").text());
  	});
  	
  	$("#btuvalue").click(
  		function(){
  			var ss = $("#btutext").val();
  			alert(ss);
  			
  			$("#btutext").val("张三");
  			
  			$("#btutext").data("asc","www");
  			
  			$("#btutext").css("cursor","pointer");
  			$("#btutext").css("background","#ff33ff");
  		}
  	);
  	
  	$("#hidden").click(
  		function(){
  			$("#form1").hide();
  		});
  		$("#noen").click(
	  		function(){
	  			$("#form1").show();
	  		});
	  		
	  $("#dtusex").click(
   			function(){
   				$("input[name=sex]").each(
   					function (i,obj){
   						alert($(obj).val());
   						//设置当前控件为选中状态
   						$(obj).attr("checked",true);	
   					}
   				);
   				//获取选中的值
   				alert($("input[name=sex]").val());
   			}
   		);
  	  </script>
</html>
