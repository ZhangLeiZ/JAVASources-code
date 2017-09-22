<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登入</title>
    
       <script type="text/javascript">
    	function check(){
    		if(form1.username.value==""){
    			alert("请输入用户名称");
    			form1.username.focus();
    			return false;
    		}
    		if(form1.pass.value==""){
    			alert("请输入登录密码");
    			form1.pass.focus();
    			return false;
    		}
    		return true;
    	}
    
    </script>
  </head>
  
  <body>
  
  <h1 align="center">用户登入</h1>
  <hr>
  <form action="loginw.jsp" method="post" name="form1">
     <table align="center">
     <tr>
       <td> 
         账户登入：<input type="text" name="username" >
       </td>
     </tr>
     <tr>
       <td>
       账户密码：<input type="password" name="pass"><br/>
       </td>
       </tr>
     <tr>
       <td>
         &nbsp;&nbsp;&nbsp;<input type="submit" name="login" value=" 登 入 " onclick="check();">
         &nbsp;&nbsp;&nbsp;<input type="button" name="close" value=" 取 消 " onclick="java:window.close()">
         </td>
     </tr>
     </table>
   </form> 
  </body>
</html>
