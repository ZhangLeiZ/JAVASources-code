<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'elment.jsp' starting page</title>
    
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
    <%!int i=0; 
      int num1=23,num2=33;
    %>
    <% 
     Date date = new Date();
     String str= date.toLocaleString();
     
     int []a={23,4,65,6,3,2};
     int sum=0;
     for(int i=0;i<a.length;i++){
       sum+=i;
       out.print(sum+"&nbsp;&nbsp;&nbsp");
     }
     out.print(sum);
     
    %><hr/>
    <% int count=0;%>
    <% count++;
     out.print("次数"+count);
     %><hr/>
     <%=++count %><hr/>
    时间：<%=str %><hr/>
    <%=num1%>+<%=num2%>=<%=num1+num2 %><br/>
   <%=i++%> <hr/>
   <%
     int i,j,k;
     for(i=0;i<5;i++){
       for(j=0;j<5-i;j++)
                out.print("&nbsp;");
         for(k=0;k<2*i-1;k++)
           out.print("*");
           out.print("<br/>");
      
     }
     for(i=3;i>0;i--){
       for(j=0;j<5-i;j++)
         out.print("&nbsp;");
          for(k=0;k<2*i-1;k++)
          out.print("*");
          out.print("<br/>");
     }
    %>
</body>
</html>
