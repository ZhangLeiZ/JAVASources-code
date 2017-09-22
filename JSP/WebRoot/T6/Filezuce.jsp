<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Filezuce.jsp' starting page</title>
    
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
    姓名：<input type=text" name="username"><br/>
    性别：<input type=text" name="username"><br/>
    年龄：<input type=text" name="username"><br/>
    受教育程度：<select name="wen">
                <option value="1">小学</option>
                <option value="2">初中</option>
                <option value="3">高中</option>
                <option value="4">大学</option>
                <option value="5">研究生</option>
             </select><br/>
    如何知道我们学校：<textarea /><br/>
    兴趣：<select name=hobit>
           <option value="1">玩游戏</option>
           <option value="2">篮球</option>
           <option value="3">旅游</option>
           <option value="4">羽毛球</option>
           <option value="5">唱歌</option>
        </select> <br/>
  </body>
</html>
