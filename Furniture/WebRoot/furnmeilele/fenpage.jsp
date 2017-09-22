<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>网站信息</title>  
    <link rel="stylesheet" href="data/css/pintuer.css">
    <link rel="stylesheet" href="data/css/admin.css">
    <script src="data/js/jquery.js"></script>
    <script src="data/js/pintuer.js"></script>  
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong></div>
  <div class="padding border-bottom">  
  <a class="button border-yellow" href=""><span class="icon-plus-square-o"></span> 添加内容</a>
  </div> 
  <table class="table table-hover text-center">
	<tr>
	  <th width="20%" >城市编号</th>     
	  <th>省份名称</th>  
	  <th>城市名称</th>     
	  <th width="250">操作</th>
	</tr>
   <tr>
     <c:forEach items="${citylist}" var="y">
			<tr height='40' width="300">
				<td align='center'>${y.cityid}</td>
				<td align='center'>${y.cityname}</td>
				<td align='center'>${y.provinceid}</td>
				<td align="center" class="button-group">
					<a href="<%=basePath %>cityservlet?cityid=${y.cityid}&order=update" class="button border-main"><span class="icon-edit"></span>修改 </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="<%=basePath %>cityservlet?cityid=${y.cityid}&order=delete" class="button border-red"  onclick="javascript:if(confirm('删除确认')){return true;}else{return false;}"><span class="icon-trash-o"></span> 删除 </a>
				</td>
			</tr>
		</c:forEach>     
   </tr> 
    <tr width="100%">
        <td style="text-align:left; padding:19px 0;padding-left:20px;" colspan="4">
        <input type="checkbox" id="checkall"/>全选 
		</td>
		<td class="pagelist" colspan="8" align="center">
			<a href="">总记录数&nbsp;&nbsp;${pager.pagebarsum}</a>
			<a href="">页码&nbsp;&nbsp;${pager.sumpage }/${pager.currentpage-1 }页</a>
			<a href="<%=basePath %>UserBasicSearchServlet?order=list&currenpage=1&handle=firstpage">首   页</a>
			<a href="<%=basePath %>UserBasicSearchServlet?order=list&currenpage=${pager.currentpage }&handle=uppage">上一页</a> <span class="current">${pager.currentpage-1 }页</span>
			<a href="<%=basePath %>UserBasicSearchServlet?order=list&currenpage=${pager.currentpage }&handle=downpage" >下一页</a>
			<a href="<%=basePath %>UserBasicSearchServlet?order=list&currenpage=${pager.sumpage }&handle=lastpage">尾  页</a> 
		</td>
      </tr>
    
    
  </table>
</div>

</body></html>