<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'qqtitledome.jsp' starting page</title>
    
	<script type="text/javascript">
	   function fs(){
	      if(form1.num2.value==""){
	         alert("请输入要发送的消息！");
	         return false;
	      }
	      form1.num1.value=form1.num2.value;
	      form1.num2.value="";
	   }
    </script>
  </head>
  <body>
  <h1 align="center">聊天页面</h1>
  
     <%
    request.setCharacterEncoding("utf-8");
    String num1 = request.getParameter("num1");
    String yanse = request.getParameter("yanse");
     String daxiao = request.getParameter("daxiao");
     String ip = request.getRemoteAddr();
     String s =(String)application.getAttribute("num1");
     
     if(num1!=""){
      num1 = ip+"说：<font size='"+daxiao+"' color='"+yanse+"'>"+num1+"</font>";
     if(s==""){
       application.setAttribute("num1",s);
     }else{
       s=s+"<br>"+num1;
       application.setAttribute("num1",s);
     }
   }
   %>
   <form name=form1 method="post">
    <h2>聊天界面</h2>
      <input type="text" name="num1"/><%=s %><br/>
      <input type="text" name="num2" style="width:500px;height:50px;"/><br/>
      <input type="submit" name="send" value=" 发 送 " onclick="fs();">
           字体颜色:<select name="yanse">
                 <option value="black">黑色</option>
                 <option value="red" >红色</option>
                 <option value="green" >绿色</option>
                 <option value="green" >蓝色</option>
                        </select>
          字体大小：<select name="daxiao">
                 <option value="1">1</option>
                 <option value="5" >5</option>
                 <option value="8" >8</option>
                 <option value="8" >4</option>
                         </select>
      </form>
    </body>
</html>
