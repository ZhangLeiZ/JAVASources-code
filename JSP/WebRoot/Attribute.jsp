<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>
    
    <title>My JSP 'Attribute.jsp' starting page</title>
   

  </head>
  
  <body>
    <%
    session.setAttribute("username",request.getParameter("username"));
        ArrayList list1 = new ArrayList();
        if(application.getAttribute("list1")==null){
            list1.add(request.getParameter("username"));
            application.setAttribute("list1",list1);
            response.sendRedirect("Showdome.jsp");
        }else{
           list1 = (ArrayList)application.getAttribute("list1");
           list1.add(request.getParameter("username"));
           application.setAttribute("list1",list1);
           response.sendRedirect("Showdome.jsp");
        }
     %>
  </body>
</html>
