<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Goshowping2.jsp' starting page</title>
    
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
    String shangyi1 = (String)application.getAttribute("ssy");
   %>
    <h1 align="center">个人购物车</h1>
    <table align="center" width="600" border="1">
          <tr>
            <td width="150" align="center">商品名称</td>
            <td width="150" align="center">购买数量(件)</td>
            <td width="150" align="center">商品价格(元)</td>
            <td width="150" align="center">单品总金额(元)</td>
          </tr>
          <tr>
            <td align="center"><%=shangyi1 %></td>
            <td align="center">200</td>
            <td align="center">89</td>
            <td align="center"><input type="text" name="shangyi" value=""></td>
          </tr>
          <tr>
            <td align="center">羽绒服</td>
            <td align="center">230</td>
            <td align="center">189</td>
            <td align="center"><input type="text" name="yurongfu" value=""></td>
          </tr>
          <tr>
            <td align="center">裤子</td>
            <td align="center">300</td>
            <td align="center">99</td>
            <td align="center"><input type="text" name="kuzi" value=""></td>
          </tr>
          <tr>
            <td align="center">针织衫</td>
            <td align="center">370</td>
            <td align="center">119</td>
            <td align="center"><input type="text" name="zzs" value=""></td>
          </tr>
          <tr>
            <td align="center" colspan="4">购买总金额：</td>
          </tr>
       </table>
  </body>
</html>
