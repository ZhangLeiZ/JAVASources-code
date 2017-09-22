<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'button.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript">
    function kongzhi(){
      if(forms.messag.value==""){
         alert("请输入发送消息！！");
         return false;
      }
      forms.mess.value=forms.messag.value;
      forms.messag.value="";
    }
  
  </script>
  
  <body background="img/tu2.jpg">
       <form action="LQ1/left.jsp" method="post" target="left" name="forms"> 
             字体颜色:<select name="yanse">
                 <option value="black">黑色</option>
                 <option value="red" >红色</option>
                 <option value="green" >绿色</option>
                 <option value="blue" >蓝色</option>
                  <option value="pink" >粉色</option>
             </select>
           字体大小：<select name="daxiao">
                 <option value="4" >4</option>
                 <option value="1" >1</option>
                 <option value="2" >2</option>
                 <option value="3" >3</option>
                 <option value="5" >5</option>
                 <option value="6" >6</option>
                 <option value="7" >7</option>
             </select>
     <hr>
     <input type="text" name="messag" style="width:200px,height:80px">
     <input type="submit" name="sends" value="发送" style="width:80px,height:80px" onclick="kongzhi();">
     <input type="hidden" name="mess">
     <input type="radio" name="tupian" value="img/0.gif" checked><img src="img/0.gif">
     <%
     response.setCharacterEncoding("utf-8");
     String str = null;
     for(int i=0;i<=95;i++){
       str = "img/"+i+".gif";
       %>
       <input type="radio" name="tupian" value="<%=str %>"><img src="<%=str %>">
       <%
     }
      %>
  </body>
</html>
