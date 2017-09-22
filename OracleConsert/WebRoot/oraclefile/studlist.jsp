
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'studlist.jsp' starting page</title>
    
	 <script type="text/javascript" src="${pageContext.request.contextPath}/js/ajax.js"></script>
	<script type="text/javascript">
	var dep="";
		function recedata(){
			if(xmlhttp.readyState==4){
				if(xmlhttp.status==200){
					var datelist = xmlhttp.responseXML.getElementsByTagName("student");
					var row = "";
					alert(datelist.length);
					for(var i=0;i<datelist.length;i++){
						row+="&nbsp;&nbsp;&nbsp;";
						row+=datelist[i].childNodes[0].firstChild.nodeValue;
						row+=datelist[i].childNodes[1].firstChild.nodeValue;
						row+=datelist[i].childNodes[2].firstChild.nodeValue;
						row+=datelist[i].childNodes[3].firstChild.nodeValue;
						row+="<br/>";
					}
					document.getElementById(dep).innerHTML=row;
					document.getElementById(dep).parentNode.style.display='block';
				}else { //页面不正常 
					alert("您请求的页面有异常"); 
				}
			}
		}
		
		
		function statusvisibility(dept){
			dep=dept;
			var param="action="+dep;
			var url="${pageContext.request.contextPath}/Stuatservlet";
			send("post",url,param,true);
		}
	</script>
  </head> 
  <body>
    <table width="500" cellpadding="0" cellspacing="0">
    	<tr height="20"><td><a href="javascript:void(0)" onclick="statusvisibility('d1');">开发部</a></td></tr>
    	<tr style="display:none"><td id="d1" height="20">&nbsp;</td></tr>
    	<tr height="20"><td><a href="javascript:void(0)" onclick="statusvisibility('d2');">测试部</td></tr>
    	<tr style="display:none"><td id="d2" height="20">&nbsp;</td></tr>
    	<tr height="20"><td><a href="javascript:void(0)" onclick="statusvisibility('d3');">人事部</td></tr>
    	<tr style="display:none"><td id="d3" height="20">&nbsp;</td></tr>
    	<tr height="20"><td><a href="javascript:void(0)" onclick="statusvisibility('d4');">财务部</td></tr>
    	<tr style="display:none"><td id="d4" height="20">&nbsp;</td></tr>
    </table>
  </body>
</html>