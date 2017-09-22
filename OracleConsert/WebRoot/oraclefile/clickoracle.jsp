<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'clickoracle.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/ajax.js"></script>
	<script type="text/javascript">
		function recedata(){
			if(xmlhttp.status==200){
			var listdate = xmlhttp.responseXML.getElementsByTagName("student");
  			alert(listdate.length);
				var row="";
  			for(var i=0;i<listdate.length;i++){
  				row+="<tr>";
				//取第一个字段的值
				var studid = listdate[i].childNodes[0].firstChild.nodeValue;
				row+="<td>"+studid+"</td>";
				
				var sname = listdate[i].childNodes[1].firstChild.nodeValue;
				row+="<td>"+sname+"</td>";
				
				var sage = listdate[i].childNodes[2].firstChild.nodeValue;
				row+="<td>"+sage+"</td>";
				
				var ssex = listdate[i].childNodes[3].firstChild.nodeValue;
				row+="<td>"+ssex+"</td>";
				
				row+="</tr>";
  		   }
  		   document.getElementById("msg").innerHTML=row;
			}
		}
		function sendvisibility(){
			var param="action=click";
			var url="${pageContext.request.contextPath}/oracleservlet"
			send("post",url,param,true);
		}
	</script>
  </head>
  
  <body>
    <h1 align="center">获取学生资料</h1>
    <hr>
    <input type="button" value="查询" id="click" align="center" onclick="sendvisibility();"/>
    <table border="1" align="center" width="600">
    	<thead>
    		<td>编号</td>
    		<td>姓名</td>
    		<td>年龄</td>
    		<td>性别</td>
    	</thead>
    	<tbody id="msg">
    	
    	</tbody>
    </table>
  </body>
</html>
