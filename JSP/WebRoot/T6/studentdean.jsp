<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>�û�ע��</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body onload="prov();">
  
   <script type="text/javascript">
	var arr = ["����ʡ",[
				"������",["�Ͽ���","�¹���","����","ʯ����"],
				"�ϲ���",["������","������"]
				],
					"�㶫ʡ",[
					"������",["�����","������"],
					"��ݸ��",["�����","����ɽ��"]
				],
					"����ʡ",[
					"��ɳ��",["ܽ����","������"],
					"������",["��Դ��","������"]
				]
	];
	/*
	  for(var i=0;i <arr.length;i++) 
	  {
		 var arr1 = arr[i];
		 if(arr1 instanceof Array){
			for(var j=0;j <arr1.length;j++) 
			{  
				var arr2=arr1[j];
				if(arr2 instanceof Array){
					for(var k=0;k<arr2.length;k++){
						alert(arr2[k]);
					}
				}else{
					alert(arr1[j]);
				}
			} 
		 }else{
			alert(arr[i]);
		 }
	  } 
	*/	
	//��ȡʡ
	function prov(){
		var province = document.getElementById("province");
		for(var i = 0;i<arr.length;i++){
			var arr1=arr[i];
			//�ж�Ԫ������ͨ��ֵ��������
			if(!(arr1 instanceof Array)){
				//���������Ԫ�ط���ʡ����������
				province.options[province.options.length] = new Option(arr1,arr1);
			}
		}
		citydata();
	}
	//��ȡʡ��Ӧ����
	function citydata(){
		//��ȡѡ�е�ʡ
		var provdata = document.getElementById("province").value;
		//��ȡ��ʾ�е�������
		var city = document.getElementById("city");
		for(var i = 0;i<arr.length;i++){
			var arr1=arr[i];
			//ֻ����һά�����в��������Ԫ��
			if(!(arr1 instanceof Array)){
				if(arr1==provdata){
					//��ȡ��Ӧʡ�ݵĶ�ά���飨���е��У�
					var citydata = arr[i+1];
					//����������������е�ѡ��
					city.options.length=0;
					for(var j=0;j<citydata.length;j++){
						if(!(citydata[j] instanceof Array)){
							city.options[city.options.length] = new Option(citydata[j],citydata[j]);
						}
					}
				}	
			}
		}
		countydata();
	}
	function countydata(){
		//��ȡ�ص�������
		var county = document.getElementById("county");
		//��ȡѡ�е���
		var city = document.getElementById("city").value;
		county.options.length=0;
		for(var i = 0;i<arr.length;i++){
			var arr1=arr[i];
			//ʡ��Ӧ������Ŵ������е��У�
			if(arr1 instanceof Array){
				var citydata = arr[i];
				for(var j=0;j<citydata.length;j++){
					if(!(citydata[j] instanceof Array)){
						var countydata = citydata[j];
						if(countydata==city){
							//��ȡ��ǰ�ж�Ӧ����������
							var items = citydata[j+1];
							for(var k=0;k<items.length;k++){
								county.options[county.options.length] = new Option(items[k],items[k]);
							}
						
						}


						
					}
				}
			}
		}
	
	}
  </script>
    <form action="T6/student.jsp" method="post">
	   <table width="30%" border="0" cellpadding="3" cellspacing="2" bgcolor="#CHDDCC" align="center">
	     <tr bgcolor="#FFFFFF">
	       <td width="52" colspan="2" valign="middle">
	         <div align="center" class="style1">
	            ѧ��ע����Ϣ
	         </div>
	       </td>
	     </tr></br>
	    <tr valign="buttom" bgcolor="#FFFFFF">
	       <td width="40%" height="30%">
	         <div align="right">
	           ѧ�ţ�
	         </div>
	       </td>
	        <td height="30%">
	          <div align="left">
	             <input name="id" type="text" id="id">
	          </div>
	       </td>
	     </tr>
	     <tr valign="buttom" bgcolor="#FFFFFF">
	       <td width="40%" height="30%">
	         <div align="right">
	           ������
	         </div>
	       </td>
	        <td height="30%">
	          <div align="left">
	             <input name="namew" type="text" id="name">
	          </div>
	       </td>
	     </tr>
	     <tr valign="buttom" bgcolor="#FFFFFF">
	       <td height="30%">
	           <div align="right">
	             ���룺
	           </div>
	       </td>
	       <td height="30%">
	          <div align="left">
	             <input name="password" type="password" id="password">
	          </div>
	       </td>
	     </tr>
	     
	     <tr valign="buttom" bgcolor="#FFFFFF">
	       <td height="30%">
	           <div align="right">
	             �Ա�
	           </div>
	       </td>
	       <td height="30%">
	          <div align="left">
	             <input name="sex" type="radio" id="sex" value="��" checked>��<input name="sex2" id="sex2" type="radio" value="Ů">Ů
	          </div>
	       </td>
	     </tr>
	     <tr valign="buttom" bgcolor="#FFFFFF">
	       <td height="30%">
	           <div align="right">
	             ���䣺
	           </div>
	       </td>
	       <td height="30%">
	          <div align="left">
	             <input name="age" type="text" id="age">
	          </div>
	       </td>
	     </tr>
	     <tr valign="buttom" bgcolor="#FFFFFF">
	       <td height="30%">
	           <div align="right">
	             ����״����
	           </div>
	       </td>
	       <td height="30%">
	          <div align="left">
	             <input name="marry" type="radio" id="marry" value="true" checked>�ѻ�
	             <input name="marry" type="radio" id="marry" value="false">δ��
	          </div>
	       </td>
	     </tr>
	     <tr valign="buttom" bgcolor="#FFFFFF">
	       <td height="30%">
	           <div align="right">
	             ���ã�
	           </div>
	       </td>
	       <td height="50%">
	          <div align="left">
	             <input name="love" type="checkbox" id="love" value="����">����
	             <input name="love" type="checkbox" id="love" value="����">����
	             <input type="checkbox" name="hobit" id="love" value="����">����
				 <input type="checkbox" name="hobit" id="love" value="˯��">˯��</br>
				 <input type="checkbox" name="hobit" id="love" value="��ë��">��ë��
				 <input type="checkbox" name="hobit" id="love" value="�ܲ�">�ܲ�
				 <input type="checkbox" name="hobit" id="love" value="����">����
	          </div>
	       </td>
	     </tr>
	      <tr valign="buttom" bgcolor="#FFFFFF">
	       <td height="30%">
	           <div align="right">
	             ��ַ��
	           </div>
	       </td>
	       <td height="30%">
	          <div align="left">
	            <select name="address" id="province" onchange="citydata();"></select>
	            <select name="address2" id="city" onchange="countydata();"></select>
	            <select name="address3" id="county"></select>
	          </div>
	       </td>
	     </tr>
	     <tr valign="buttom" bgcolor="#FFFFFF">
	       <td width="30%" colspan="2">
	         <div align="center">
	           <input type="submit" name="submit" value="ע��">
	           <input type="submit" name="submit2" value="ȡ��">
	         </div>
	       </td>
	     </tr>
	   </table>
    </form>
  </body>
</html>
