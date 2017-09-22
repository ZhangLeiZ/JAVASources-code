<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Flash.jsp' starting page</title>
    
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
     <!-- 一、简单插入flash图像-->
<embed src="你的flash地址.swf"
width="300" height="220"></embed>
<!--二、调整插入flash图像-->
<td width="63%" valign="middle" align="right"><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0" width="468" height="60">
<param name=movie value="你的flash地址" ref>
<param name=quality value=High>
<param name="_cx" value="12383">
<param name="_cy" value="1588">
<param name="FlashVars" value>
<param name="Src" ref value="你的flash地址">
<param name="WMode" value="Window">
<param name="Play" value="-1">
<param name="Loop" value="-1">
<param name="SAlign" value>
<param name="Menu" value="-1">
<param name="Base" value>
<param name="AllowScriptAccess" value="always">
<param name="Scale" value="ShowAll">
<param name="DeviceFont" value="0">
<param name="EmbedMovie" value="0">
<param name="BGColor" value>
<param name="SWRemote" value>
<param name="MovieData" value>
<embed src="你的flash地址" quality=high pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash" type="application/x-shockwave-flash" width="468" height="60">
</embed></object></td>
<!--三、调整插入flash图像-->
<table border="0" cellPadding="0" cellSpacing="0" width="100%">
<tr>
<td height="210" background="背景图片.jpg"><object classid=clsid:D27CDB6E-AE6D-11cf-96B8-444553540000 codebase=http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=4,0,2,0 height=210 width=750>
<param name="movie" value="路径/文件名称.swf">
<param name="quality" value="high">
<param name="wmode" value="transparent">
<embed src="路径/文件名称.swf" quality=high pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash" type="application/x-shockwave-flash" width="750" height="210" wmode="transparent">
</embed>
</object></td>
</tr></table>
<!--四、插入透明flash-->
<!--1、dreamweaver插入透明flash代码：-->
 <td width="375" height="88" rowspan="2" valign="bottom"
background="images/tu.jpg"><!--设置单元格背景为图片背景（当然要放一个好看的了） -->
<object classid="clsid27CDB6E-AE6D-11cf-96B8-444553540000"
codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0"
width="373" height="166" align="center">
<param name="movie" value="images/move.swf">
<param name="quality" value="high">
<param name="wmode" value="transparent"> <!--这里代码可使Flash背景透明 -->
<embed src="images/move.swf" width="373" height="166"
align="center" quality="high"
pluginspage="http://www.macromedia.com/go/getflashplayer";;;
type="application/x-shockwave-flash"></embed></object>
 </td>
<!--2、frontpage插入透明flash代码：-->
<embed src="fish1.swf" quality=high width=50 height=50
wmode=transparent type='application/x-shockwave-flash'></embed>
<!-- wmode=transparent这一段是设置背景透明-->

<!--3、插入透明FLASH：--><embed src="***/***.swf" quality=high width=100% height=100%      
              wmode=transparent type='application/x-shockwave-flash'>
<!--4、透明flash覆盖代码：-->
<EMBED style="LEFT: 0px; P
OSITION: absolute; TOP: 0px; absolute: " align=right src=http://ysxiong.anyp.cn/PageLayout/UserDataA/Data53/USID200403062012220031/Articles/Images/040917060055890.swf width=1000 height=606 type=application/x-shockwave-flash wmode="transparent" quality="high" ;;></EMBED>

  </body>
</html>
