<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
</head>
<script src="${pageContext.request.contextPath }/js/jquery-1.3.2.min-vsdoc.js"></script>
<!--必须加载jQuery文件，网上有下载-->
<script type="text/javascript">
$(function(){  
    // 点击按钮，DIV弹出，点击body任意地方隐藏div
    $('#btn2').click(function(){
        if ( event && event.stopPropagation ) { 
            // this code is for Mozilla and Opera 
        event.stopPropagation(); 
    } 
    else if (window.event) { 
            // this code is for IE 
        window.event.cancelBubble = true; 
    }
        $('#xiugai').show();
    });
    $('#bnt').click(function(){
var name = $('#xg_name').val();
var age = $('#xg_age').val();
$('#name').html(name);
$('#age').html(age);
        $('#xiugai').hide();
    });
});
</script>
<style type="text/css">
#xiugai{
position: fixed;
top: 50%;
left: 50%;
width: 240px;
height: 150px;
margin: -50px 0 0 -50px;
display: none;
border: 1px solid #666;
}
</style>
<body>
姓名：<span id="name">张三</span>
年龄：<span id="age">18</span>
<input id="btn2" type="button" value="修改" />
<div id="xiugai">
姓名：<input id="xg_name" type="text"/>
年龄:<input id="xg_age" type="text"/>
<input id="bnt" type="button" value="修改" />
</div> 
</body>
</html>