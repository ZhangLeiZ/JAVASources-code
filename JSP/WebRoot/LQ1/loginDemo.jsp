<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'loginDemo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <script type="text/javascript">
		function yanzheng(){
			var name=form1.username.value;
			var pwd=form1.pass.value;
			if(name==""){
				alert("昵称不能为空！");
				form1.username.focus();
				return;
			}
			if(pwd==""){
				alert("密码不能为空！");
				form1.pass.focus();
				return;
			}
		}
	</script>
  </head>
  
  <body>
    <h1 align="center">用户登录</h1>
    <form action="LQ1/loginDemo.jsp" name="form1" method="post">
	    <table width="240" height="100" align="center" border="0">
	    	<tr><td><font face="楷体" color="green">昵称：</font></td><td><input type="text" name="username" id="username" size="19"></td></tr>
	    	<tr><td><font face="楷体" color="green">密码：</font></td><td><input type="password" name="pass" id="pass" size="20"></td></tr>
	    	<tr><td colspan="2" align="center"><input type="submit" name="send" id="send" value=" 登 录 " onclick="yanzheng();">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="re1" id="re1" value="清空"></td></tr>
	    </table>
	</form>
	<%
	request.setCharacterEncoding("utf-8");
	if(request.getParameter("send")!=null){
	   application.setAttribute("name",request.getParameter("username"));
	   out.print(application.getAttribute("name"));
	   response.sendRedirect("main.jsp");
	}
	 %>
  </body>
</html>
