<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>51CTO学院_专业的IT技能学习平台|自学网络视频教程|IT在线培训课程|Python|大数据|Java|Linux运维|PHP|IT考证|产品经理|Office|IT在线教育</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/base.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/home.css?v=1.2.0">
</head>
<body>
<!-- logo search start -->
<div class="Page search_top" id="Nav01">
  <div class="fl Logo">
    <a href="" target="_blank" title="51CTO学院_中国最大的IT技能学习平台">
      <img class="fl" src="${pageContext.request.contextPath }/images/logo_01.png" >
    </a>
  </div>
  <div class="fr Search">
    <form class="form-search" id="Search" method="get" action="" target="_blank">
        <input name="do" type="hidden" value="search">
        <input name="m" type="hidden" value="course" id="searchM">
        <button type="submit" class="fr" onclick=""></button>
        <input type="text" class="fr" id="searchQ" name="q" placeholder="找课程、找讲师" >
    </form>
      <div class="fl Select" id="SearchSelect">
        <p>找课程</p>
        <ul>
          <li sear=1 >找课程</li>
          <li sear=2 >找讲师</li>
        </ul>
	      </div>
	       			 <div class="hotKey">
	              <a href="" target="_blank">spring</a>
	              <a href="" target="_blank">深度学习</a>
	              <a href="" target="_blank">Shell编程</a>
	                  </div>
  </div>
</div>
<!-- logo search end -->
</body>
</html>
