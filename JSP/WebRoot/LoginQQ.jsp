<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'LoginQQ.jsp' starting page</title>
    
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
  <%
    request.setCharacterEncoding("utf-8");
    if(request.getParameter("login")!=null){
        String username = request.getParameter("username");
        if(application.getAttribute("Auser")==null){
         session.setAttribute("user",username);
         HashMap<String,String> htmp=new HashMap<String,String>();
         htmp.put(username,username);
         application.setAttribute("Auser",htmp);
         String str = "欢迎进入聊天室，"+username+"正在聊天！";
         application.setAttribute(username,str);
          response.sendRedirect("Main.jsp");
        }else{
         HashMap<String,String> htmp = (HashMap<String,String>)application.getAttribute("Auser");
         if(htmp.size()>50){
           %>
           <script type="text/javascript">
           alert("人太多了");
           </script>
           <%
         }else{
          String myname=htmp.get(username);
          if(myname==null){
            session.setAttribute("username",username);
            htmp.put(username,username);
            application.setAttribute("Auser",htmp);
            String str = "欢迎进入聊天室，"+username+"正在聊天！";
            application.setAttribute(username,str);
            response.sendRedirect("Main.jsp");
            }else{
            %>
            <script type="text/javascript">
            alert("该昵称已存在，请输入其他昵称！");
            </script>
            <%
            }
          }
        }
    }
   %>
     <h1 align="center">用户登入</h1>
  <hr>
  <form action="LoginQQ.jsp" method="post" name="form1">
     <table align="center">
     <tr>
       <td> 
         账户登入：<input type="text" name="
" >
       </td>
     </tr>
     <tr>
       <td>
       账户密码：<input type="password" name="pass"><br/>
       </td>
       </tr>
     <tr>
       <td>
         &nbsp;&nbsp;&nbsp;<input type="submit" name="login" value=" 登 入 ">
         &nbsp;&nbsp;&nbsp;<input type="submit" name="close" value="取消">
         </td>
     </tr>
     </table>
   </form> 
  </body>
</html>
