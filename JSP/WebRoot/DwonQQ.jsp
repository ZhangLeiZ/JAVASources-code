<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'DwonQQ.jsp' starting page</title>
    
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
    if(request.getParameter("login")!=null){
    String username = request.getParameter("username");
    String face = request.getParameter("face");
    String fontsize = request.getParameter("fontsize");
    String color = request.getParameter("color");
    String who = request.getParameter("who");
    String chatall = request.getParameter("chatall");
     String mag = "<fontsize="+fontsize+"color="+color+">"; 
           mag += "【"+session.getAttribute("username")+"】"+"对";
       if(who.equals("all")){
       mag += "[<b>所有人</b>说：]"+chatall+"</font><br/>";
       mag +=new Date().toLocaleString();
       HashMap<String,String> htmp = (HashMap<String,String>)application.getAttribute("Auser");
       if(htmp!=null){
       Set set = htmp.keySet();
       Iterator<String> it = set.iterator();
        String key = null;
        while(it.hasNext()){
             key=it.next();
             String s=application.getAttribute(key).toString();
             s+=mag;
             application.setAttribute(key,s);
             
           }
         }
       }else{
         mag = "<b>["+who+"]</b>"+chatall+"</font><br/>";
         String s = application.getAttribute(who).toString();
         s+=mag;
         application.setAttribute(who,s);
       
       }
    }
     %>
     <form action="DwonQQ.jsp">
      <table align="center">
          <tr>
            <td>
              <select name="face" style="width:150px">
                 <option value="沮丧">沮丧</option>
                 <option value="开心">开心</option>
              </select>
              <select name="fontsize" style="width:150px">
                 <option value="1">1</option>
                 <option value="2">2</option>
                 <option value="3">3</option>
                 <option value="4">4</option>
                 <option value="5">5</option>
                 <option value="6">6</option>
                 <option value="7">7</option>
              </select>
               <select name="color" style="width:150px">
                 <option value="red">红色</option>
                 <option value="green">绿色</option>
                 <option value="blue">蓝色</option>
                 <option value="pink">粉色</option>
              </select>
              <select name="who" style="width:150px">
                 <option value="all">所有人</option>
                 <%
                 HashMap<String,String> htmp =(HashMap<String,String>)application.getAttribute("Auser");
                  if(htmp!=null){
                  Set set = htmp.keySet();
                  Iterator<String> it = set.iterator();
                  String key=null;
                  while(it.hasNext()){
                  key=it.next();
                     if(!key.equals(application.getAttribute("username"))){
                         %>
                         <option value="<%=key %>"><%=key %></option>
                         <% 
                     }
                  }
                  }
                  %>
              </select>
            </td>
          </tr>
          <tr>
            <td><textarea cols="100" rows="4" name="chatall"></textarea></td>
          </tr>
          <tr>
             <td align="right"><input type="submit" value=" 发 送 " name="send"/></td>
          </tr>
       </table>
     </form>
  </body>
</html>
