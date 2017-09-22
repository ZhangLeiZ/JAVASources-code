<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Goshowping.jsp' starting page</title>
    
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
  <h1 align="center">商品购物平台</h1>
  <%
  	int t1=300,t2=390,t3=340,t4=400;
  	int s1=132,s2=244,s3=223,s4=135;
  	String m1="上衣",m2="羽绒服",m3="裤子",m4="针织衫";
  	//商品名称
  	application.setAttribute("ssy",m1);
  	application.setAttribute("syrf",m2);
  	application.setAttribute("skz",m3);
  	application.setAttribute("szzs",m4);
  	//商品价格
  	application.setAttribute("gsy",s1);
  	application.setAttribute("gyrf",s2);
  	application.setAttribute("gkz",s3);
  	application.setAttribute("gzzs",s4);
  	//商品数量
  	application.setAttribute("lsy",t1);
  	application.setAttribute("lyrf",t2);
  	application.setAttribute("lkz",t3);
  	application.setAttribute("lzzs",t4);
  	
   %>
    <form action="Goshowping2.jsp" method="post" name="form1">
       <table align="center" width="600" border="1">
          <tr>
            <td width="150" align="center">商品名称</td>
            <td width="150" align="center">商品数量(件)</td>
            <td width="150" align="center">商品价格(元)</td>
            <td width="150" align="center">购买数量(件)</td>
          </tr>
          <tr>
            <td align="center"><%=m1 %></td>
            <td align="center"><%=t1 %></td>
            <td align="center"><%=s1 %></td>
            <td align="center"><input type="text" name="shangyi" value=""></td>
          </tr>
          <tr>
            <td align="center"><%=m2 %></td>
            <td align="center"><%=t2 %></td>
            <td align="center"><%=s2 %></td>
            <td align="center"><input type="text" name="yurongfu" value=""></td>
          </tr>
          <tr>
            <td align="center"><%=m3 %></td>
            <td align="center"><%=t3 %></td>
            <td align="center"><%=s3 %></td>
            <td align="center"><input type="text" name="kuzi" value=""></td>
          </tr>
          <tr>
            <td align="center"><%=m4 %></td>
            <td align="center"><%=t4 %></td>
            <td align="center"><%=s4 %></td>
            <td align="center"><input type="text" name="zzs" value=""></td>
          </tr>
           <tr>
            <td align="center" colspan="4"><input type="submit" value=" 确 定 " name="send"></td>
          </tr>
       </table>
    </form>
    
  </body>
</html>
