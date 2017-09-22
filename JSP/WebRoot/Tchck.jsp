<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Tchck.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h2>out对象</h2>
    <%
      int baffersize = out.getBufferSize();
      int remaining = out.getRemaining();
      int baffer = baffersize - remaining;
      out.print("缓存大小="+baffersize+"<br/>");
      out.print("还剩缓存大小="+remaining+"<br/>");
      out.print("使用大小="+baffer+"<br/>");
     %>
     <hr/>
    
     <form action="Tchck2.jsp" method="get" name=form1>
       <input type="radio" name="alon" value="1">使用request.sendredirter（）进行页面跳转<br/>
       <input type="radio" name="alon" value="2">使用jsp:forward跳转页面<br/>
       <input type="submit" name="login" value="提交">
     </form>
     <%
      String vare = request.getParameter("alon");
       if(vare!=null){
           request.setAttribute("n","20");
        if(vare.equals("1")){
          response.sendRedirect("Tchck2.jsp");
        }else if(vare.equals("2")){
          %>
          <jsp:forward page="Tchck2.jsp"/>
          <% 
        }
     }
      %>
  </body>
</html>
