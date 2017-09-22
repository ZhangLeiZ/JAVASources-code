<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>网上投票</title>
   <script type="text/javascript">
    function fuck(){
       var rs = document.getElementsByName("remak");
       for (var i = 0; i < rs.length; i++) {
       if (rs[i].checked==false) {
       
          alert("请选择！！！");
         
         }
       }
    }
   </script>
  </head>
  
  <body>
   <form action="Tickter.jsp" method="post">
     <input type="radio" name="remak" value="1" checked>1500以下<br/>
     <input type="radio" name="remak" value="2">1500-3000<br/>
     <input type="radio" name="remak" value="3">3000-5000<br/>
     <input type="radio" name="remak" value="4">5000以上<br/>
     <input type="submit" name="buttonck" value="提交">
   </form>
   <%
   float t1,t2,t3,t4,total=0;
 	t1=t2=t3=t4=0;
 	
 	
   Hashtable<String,Float> sht = new Hashtable<String,Float>();
   Hashtable<String,Float> liat = new Hashtable<String,Float>();
   if(liat!=null){
    liat.put("1",t1);
      liat.put("2",t2);
      liat.put("3",t3);
      liat.put("4",t4);
      application.setAttribute("yin",liat);
      total=t1+t2+t3+t4;
        t1=t1/total*200;
         t2=t2/total*200;
          t3=t3/total*200;
           t4=t4/total*200;
   }
   if(request.getParameter("buttonck")!=null){
      String vare = request.getParameter("remak");
      
      if(application.getAttribute("re")==null){
         sht.put("1",0f);
         sht.put("2",0f);
         sht.put("3",0f);
         sht.put("4",0f);
         sht.put(vare,1f);
         application.setAttribute("re",sht);
      }else{
       sht=(Hashtable)application.getAttribute("re");
       t1=sht.get("1");
       t2=sht.get("2");
       t3=sht.get("3");
       t4=sht.get("4");
       if(vare.equals("1")){
          t1++;
       }else if(vare.equals("2")){
          t2++;
       } else if(vare.equals("3")){
          t3++;
       } else if(vare.equals("4")){
          t4++;
       }
       sht.put("1",t1);
       sht.put("2",t2);
       sht.put("3",t3);
       sht.put("4",t4);
       application.setAttribute("re",sht);
       total = t1+t2+t3+t4;//总的票数
    			t1=t1/total*300; //计算出来的是div的宽度
    			t2=t2/total*300;
    			t3=t3/total*300;
    			t4=t4/total*300;
       
      }
      }
   
    %>
   <table border="1" width="500">
   <caption>投票总人数:<%=(int)total %>人</caption>
     <tr>
       <td width="120" align="right">1500以下</td>
       <td>1<div style="width:<%=t1 %>px;height:20px;background:#ff0000;text-align:center;"></div><%=(int)(t1/3)%>%</td>
     </tr>
     <tr>
       <td width="120" align="right">1500-3000</td>
       <td>2<div style="width:<%=t2 %>px;height:20px;background:#ff0000;text-align:center;"></div><%=(int)(t2/3)%>%</td>
     </tr>
     <tr>
       <td width="120" align="right">3000-5000</td>
       <td>3<div  style="width:<%=t3 %>;height:20px;background:#ff0000;text-align:center;"></div><%=(int)(t3/3)%>%</td>
     </tr>
     <tr>
       <td width="120" align="right">5000以上</td>
       <td>4<div style="width:<%=t4 %>px;height:20px;background:#ff0000;text-align:center;"></div><%=(int)(t4/3)%>%</td>
     </tr>
   </table>
   
  </body>
</html>
