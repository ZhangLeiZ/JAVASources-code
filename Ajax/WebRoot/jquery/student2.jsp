<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'student.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  	 <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.1.js"></script>
  	<script type="text/javascript">
  		$(function(){
  			$("#reg").bind("click",function(){
  			var stuno = $("#stuno").val();
  			if(stuno==""){
  				alert("请输入账号！");
  			}
  			var names = $("#names").val();
  			if(names==""){
  				alert("请输入用户名！");
  			}
  			var age = $("#age").val();
  			if(age==""){
  				alert("请输入年龄！");
  			}
  			var sex = $("input[name=sex]:checked").val();
  			var cadid = $("#cadid").val();
  			if(cadid==""){
  				alert("请输入身份证！");
  			}
  			var classname = $("#classname").val();
  			if(classname==""){
  				alert("请输入班级名称！");
  			}
  			var url = "${pageContext.request.contextPath}/JSNOstuservlet";
  			jQuery.post(url,
  				{"stuno":stuno,
  				 "names":names,
  				 "age":age,
  				 "sex":sex,
  				 "cadid":cadid,
  				 "classname":classname,
  				 "action":"add"
  				},
  				datastud
  				,
  				"json"
  				
  			);
  			});}
  		});
  		function selectstu(){
  			var url = "${pageContext.request.contextPath}/JSNOstuservlet";
  			jQuery.post(url,
  				{
  				 "action":"list"
  				},
  				datastud
  				,
  				"json"
  			);
  		}
  		function delstud(stuno){
  			if(!confirm("删除确认")){
  				return;
  			}
  			var url = "${pageContext.request.contextPath}/JSNOstuservlet";
  			jQuery.post(url,
  				{
  				 "stuno":stuno,
  				 "action":"del"
  				},
  				datastud
  				,
  				"json"
  			);
  		}
  		function updatestud(stuno){
  			$("#reg").hide();
  			$("#upreg").show();
  			$("#stuno").attr("readOnly",true);
  			var url = "${pageContext.request.contextPath}/JSNOstuservlet";
  			jQuery.post(url,
  				{
  				 "stuno":stuno,
  				 "action":"update"
  				},
  				function(data){
					$("#stuno").val(data.stuno);
					$("#names").val(data.name);
					$("#age").val(data.age);
					$("#cadid").val(data.cadeid);
					$("#classname").val(data.classname);
					var sex =data.sex;
					$("input[name=sex]").each(function(i,v){
						if($(v).val()==sex){
							$(v).attr("checked",true);
						}
					});
					
  				},
  				"json"
  			);
  		}
  		
  		
  		$(function(){
  			$("#upreg").bind("click",function(){
  				var url = "${pageContext.request.contextPath}/JSNOstuservlet";
			jQuery.post(url,
			{
					"stuno":$("#stuno").val(),
					"names":$("#names").val(),
					"age":$("#age").val(),
					"cadid":$("#cadid").val(),
					"classname":$("#classname").val(),
					"sex":$("input[name=sex]").val(),
					"action":"updateser"
			},
			datastud
  			,
			"json");  		
			$("#reg").show();
			$("#upreg").hide();
			$("#stuno").attr("readOnly",false);	
  			});
  		});
  		function sumpage(){
  			var url="${pageContext.request.contextPath}/JSNOstuservlet";
  			jQuery.post(url,
  				{
  				"currenpage":1,
  				"handle":"firstpage",
  				"action":"lists"
  				},
  				datastud
  				,
  				"json"
  			);
  		}
  		function datastud(data){
  			var tag = "";
			for(var i=0;i<data.length;i++){
				if(i<data.length-1){
					tag+="<tr>";
					tag+="<td>"+data[i].stuno+"</td>";
					tag+="<td>"+data[i].name+"</td>";
					tag+="<td>"+data[i].age+"</td>";
					tag+="<td>"+data[i].sex+"</td>";
					tag+="<td>"+data[i].cadeid+"</td>";
					tag+="<td>"+data[i].classname+"</td>";
					tag+="<td><a href='javascript:void(0);' onclick=\"delstud("+data[i].stuno+");\">删除</a></td>";
					tag+="<td><a href='javascript:void(0);' onclick='updatestud("+data[i].stuno+");'>修改</a></td>";  
					tag+="</tr>";
				}else{
					tag+="</tr><td colspan='8'>";
					tag+="<span>总记录数："+data[i].pagebarsum+"</span>";
			     	tag+="<span>页码:"+data[i].sumpage+"/"+data[i].currentpage+"</span>";
				    tag+="<a href='javascript:void(0);' onclick=\"first(1);\">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;";
			     	tag+="<a href='javascript:void(0);' onclick=\"up("+data[i].currentpage+");\">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;";
			     	tag+="<a href='javascript:void(0);' onclick=\"down("+data[i].currentpage+");\">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;";
			     	tag+="<a href='javascript:void(0);' onclick=\"last("+data[i].currentpage+");\">尾页</a>";
					tag+="</td></tr>";
				}
			}
			$("#msg").html(tag);	
  		}
  		function first(data){
  			var url="${pageContext.request.contextPath}/JSNOstuservlet";
  			alert(data);
  			jQuery.post(url,
  				{
  				"currenpage":data,
  				"handle":"firstpage",
  				"action":"lists"
  				},
  				datastud
  				,
  				"json"
  			);
  		}
  		function up(data){
  			var url="${pageContext.request.contextPath}/JSNOstuservlet";
  			alert(data);
  			jQuery.post(url,
  				{
  				"currenpage":data,
  				"handle":"uppage",
  				"action":"lists"
  				},
  				datastud
  				,
  				"json"
  			);
  		}
  		function down(data){
  			var url="${pageContext.request.contextPath}/JSNOstuservlet";
  			jQuery.post(url,
  				{
  				"currenpage":data,
  				"handle":"downpage",
  				"action":"lists"
  				},
  				datastud
  				,
  				"json"
  			);
  		}
  		function last(data){
  			var url="${pageContext.request.contextPath}/JSNOstuservlet";
  			jQuery.post(url,
  				{
  				"currenpage":data,
  				"handle":"lastpage",
  				"action":"lists"
  				},
  				datastud
  				,
  				"json"
  			);
  		}
  	</script>
  <body>
    <h1 align="center">学生资料管理</h1>
   <div id="menu">   
        <div class="has_children"> 
     用户编号：<input type="text" id="stuno" style="height:40px" size="32"/>
  	用 户 名：<input type="text" id="names" style="height:40px" name="names" size="32"/>
    年    龄：<input type="text" id="age" style="height:40px" size="32"/><br/><br/>
     性  别：	<input type="radio" name="sex"  value="男"/>男
        	<input type="radio" name="sex" value="女"/>女<br/><br/>
    身份证：<input type="text" id="cadid" value="" style="height:40px" size="32"/>
     班级名称：<input type="text" id="classname" value="" style="height:40px" size="32"><br/><br/>
        <input type="button"  id="reg" value=" 注 册 "/>
         <input type="button"  id="upreg" value=" 修 改 " style="display:none"/>
       </div>  
        </div>
     <table align="center" width="700" cellpadding="2" cellspacing="1" border="1">
     <tr><td colspan="8"><a href="javascript:void(0)" onclick="selectstu();">查看学生资料</a></td></tr>
     	<thead>
     		<td align="center">编号</td>
     		<td align="center">用户名</td>
     		<td align="center">年龄</td>
     		<td align="center">性别</td>
     		<td align="center">身份证</td>
     		<td align="center">班级名称</td>
     		<td align="center" colspan="3">操作</td>
     	</thead>
     	<tbody id="msg">
     	</tbody>
     </table>
  </body>
</html>
