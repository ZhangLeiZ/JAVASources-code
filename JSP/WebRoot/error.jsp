<%@ page contentType="text/html;charset=GB2312" isErrorPage="true" %>
<%@page import="java.io.PrintWriter"%>

<html>
  <head>
    
    
    <title>My JSP 'error.jsp' starting page</title>
    
	

  </head>
  
  <body>
   <h1>errorPage �ķ�������</h1>

<p>ErrorPage.jsp ���������<I><%= exception %></I></p><br>
<pre>
�������£�<% exception.printStackTrace(new PrintWriter(out)); %>
</pre>
  </body>
</html>
