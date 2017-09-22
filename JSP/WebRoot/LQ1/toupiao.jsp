<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'toupiao.jsp' starting page</title>
    
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
  <h1 align="center"><font color="green">好声音投票</font></h1>
   <form action="LQ1/toupiao.jsp" method="post" >
     <input type="radio" name="remak" value="1" checked>蒋敦豪<br/>
     <input type="radio" name="remak" value="2">白静晨<br/>
     <input type="radio" name="remak" value="3">宋冬野<br/>
     <input type="radio" name="remak" value="4">黄子豪<br/>
     <input type="submit" name="buttonck" value="提交">
   </form>
 
   <%
      response.setCharacterEncoding("utf-8");
   
   float t1,t2,t3,t4,touter=0;
   t1=t2=t3=t4=0;
   Hashtable<String,Float> list = new Hashtable<String,Float>();
   
   if(request.getParameter("buttonck")!=null){
      String vare=request.getParameter("remak");
      if(application.getAttribute("yin")==null){
      list.put("1",0f);
      list.put("2",0f);
      list.put("3",0f);
      list.put("4",0f);
      list.put(vare,1f);
      application.setAttribute("yin",list);
      }else{
      list=(Hashtable)application.getAttribute("yin");
      t1=list.get("1");
      t2=list.get("2");
      t3=list.get("3");
      t4=list.get("4");
      if(vare.equals("1")){
        t1++;
        }else if(vare.equals("2")){
        t2++;
        }else if(vare.equals("3")){
        t3++;
        }else if(vare.equals("4")){
        t4++;
        }
      list.put("1",t1);
      list.put("2",t2);
      list.put("3",t3);
      list.put("4",t4);
      application.setAttribute("yin",list);
      touter=t1+t2+t3+t4;
        t1=t1/touter*300;
         t2=t2/touter*300;
          t3=t3/touter*300;
           t4=t4/touter*300;
      }
   }
   
    %>
    <table align="center">
    <caption>投票总人数:<%=(int)touter %>人</caption>
      <tr>
        <td align="right">蒋敦豪</td>
        <td><div style="width:<%=t1 %>px;height:20px;background:#ff0000;text-align:center;"></div><%=(int)(t1/3)%>%</td>
      </tr>
      <tr>
        <td align="right">白静晨</td>
        <td><div style="width:<%=t2 %>px;height:20px;background:#ff0000;text-align:center;"></div><%=(int)(t2/3)%>%</td>
      </tr>
      <tr>
        <td align="right">宋冬野</td>
        <td><div style="width:<%=t3 %>px;height:20px;background:#ff0000;text-align:center;"></div><%=(int)(t3/3) %>%</td>
      </tr>
      <tr>
        <td align="right">黄子豪</td>
        <td><div style="width:<%=t4 %>px;height:20px;background:#ff0000;text-align:center;"></div><%=(int)(t4/3) %>%</td>
      </tr>
    </table>
   </body>
</html>
