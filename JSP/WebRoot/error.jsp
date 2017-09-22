<%@ page contentType="text/html;charset=GB2312" isErrorPage="true" %>
<%@page import="java.io.PrintWriter"%>

<html>
  <head>
    
    
    <title>My JSP 'error.jsp' starting page</title>
    
	

  </head>
  
  <body>
   <h1>errorPage 的范例程序</h1>

<p>ErrorPage.jsp 错误产生：<I><%= exception %></I></p><br>
<pre>
问题如下：<% exception.printStackTrace(new PrintWriter(out)); %>
</pre>
  </body>
</html>
