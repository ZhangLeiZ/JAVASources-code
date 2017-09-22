<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Muen.jsp' starting page</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ajax.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/prototype.js"></script>
    <script type="text/javascript">
    var eposx ;
	var eposy ;
    	function send(pid){
    		if(pid!=null){
    			var param = "pid="+pid;
    		    var url="${pageContext.request.contextPath}/Tipservlet";
    		    url =url+"?"+param;
    		   
    		    var ajax = new Ajax.Request(url,{
					method:'POST',
					parameters:param,
					onComplete:recedatas
		        });
    		}
    	}
		function recedatas(){
					var muenber =  xmlhttp.responseXML.getElementsByTagName("member");
					alert(muenber);
					var muenlist = $("detail");
					var li="<table>";
					for(var i=0;i<muenber.length;i++){
						var price = muenber[i].childNodes[0].firstChild.nodeValue;
						var num = muenber[i].childNodes[1].firstChild.nodeValue;
						var chanid = muenber[i].childNodes[2].firstChild.nodeValue;
						li += '<tr><td>价格:' + price + '</td></tr>';
						li += '<tr><td>数量:' + num + '</td></tr>';
						li += '<tr><td>产地:' + chanid + '</td></tr>';
					}
					li+= "</table>";
					muenlist.innerHTML=li;
					setDivPosition();
					muenlist.style.visibility="visible";
				
		}
		
		function hidendiv(){
			var munber = $("detail");
		    munber.innerHTML="";
		    munber.style.visibility="hidden";
		}
		
		function setDivPosition(){
		var goodslist = $('goodslist');
		//goodslist左上角的X坐标位置：goodslist.offsetLeft
		//goodslist的宽度：goodslist.offsetWidth
		eposx = goodslist.offsetLeft + goodslist.offsetWidth -2;
		//goodslist的左上角的Y坐标
		eposy += goodslist.offsetTop + 2;
		var listdiv = $('detail');
		listdiv.style.left=eposx+'px';
		//设置DIV的边框：蓝色的边框，边框线条的大小只有一个像素
		listdiv.style.border='blue 1px solid';
		listdiv.style.top=eposy + 'px';
		listdiv.style.width='100px';
		//置顶层
		listdiv.style.zIndex='999';
		
		}
	</script>
  </head>
  
  <body>
    <h1>数据提示</h1>
<hr />
商品列表:<br/>
<p id="goodslist" style="float:left;background:red" onmouseout="hidendiv();">
<a href="javascript:void(0);" onmouseover="send('p1');" >商品A</a><br/>
<a href="javascript:void(0);" onmouseover="send('p2');" >商品B</a><br/>
<a href="javascript:void(0);" onmouseover="send('p3');">商品C</a><br/>
</p>
<div id="detail" style="background-color:green;position:absolute;visibility:hidden">
</div>
  </body>
</html>
