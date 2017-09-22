<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Jquertdemo2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.1.js"></script>
  	<script type="text/javascript">
  		$(function(){
  			$("#btuss").bind("click",function(){
  				alert("sss");
  			});
  			$("#btuid").bind("mouseover",function(){
  				var s = $("#btuid").val();
  				$("#btuid").css("background","#ffff00");
  			});
  			$("#btuid").bind("mouseout",function(){
  				$("#btuid").css("background","#ffffff");
  			});
  			$("#select1").bind("click",function(){
  				$(".option1").each(function(i,v){
  					//alert($(v).val());
  					$(v).attr("selected",true);
  				});
  				alert($(".option1").val());
  			});
  			
  			$("#btuhidden").bind("click",function(){
  				$("input:visible").each(function(i,v){
  					alert($(v).val());
  				});
  			});
  			$("#p1").bind("click",function(){
  				alert($("#p1").addClass("selected").text());
  			});
  			
  			$("#btuhi").bind("click",function(){
  				alert($("input[type='checkbox']").parent().is("input"));
  			});
  			$("#btuhi").trigger("submit");
  		});
  		function ddd(){
  			alert("ssss");
  		};
  	</script>
  </head>
  
  <body>
  <p id="p1">sdfsdgfgs</p>
  <form action="" name="form1" id="form1">
    <input type="text" id="btuid" value="祝大家反馈"/><br/>
    <input type="text" id="btuidd" value="祝反馈"/><br/>
    <input type="button" id="btuss" value="测试">
    <input type="button" id="btuhidden" value="开始" >
    <input type="button" id="sss" value="开始" onclick="ddd();" >
    <input type="button" id="btuhi" value="执行" >
    <select id="select1">
    	<option class="option1" value="ss">ss</option>
    	<option id="option1" value="ww">ww</option>
    	<option id="option1" value="ff">ff</option>
    	<option id="option1" value="gg">gg</option>
    </select>
    </form>
  </body>
</html>
