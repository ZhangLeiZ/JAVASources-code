<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
<title> 省市县三级联动 </title>	<meta http-equiv="pragma" content="no-cache">
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
	var arr = ["江西省",[
				"赣州市",["南康区","章贡区","赣县","石城县"],
				"南昌市",["东湖区","西湖区"]
				],
					"广东省",[
					"广州市",["天河区","荔湾区"],
					"东莞市",["厚街镇","大岭山镇"]
				],
					"湖南省",[
					"长沙市",["芙蓉区","天心区"],
					"常德市",["桃源县","安乡县"]
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
	//获取省
	function prov(){
		var province = document.getElementById("province");
		for(var i = 0;i<arr.length;i++){
			var arr1=arr[i];
			//判断元素是普通的值还是数组
			if(!(arr1 instanceof Array)){
				//不是数组的元素放在省的下拉框中
				province.options[province.options.length] = new Option(arr1,arr1);
			}
		}
		citydata();
	}
	//获取省对应的市
	function citydata(){
		//获取选中的省
		var provdata = document.getElementById("province").value;
		//获取显示市的下拉框
		var city = document.getElementById("city");
		for(var i = 0;i<arr.length;i++){
			var arr1=arr[i];
			//只处理一维数组中不是数组的元素
			if(!(arr1 instanceof Array)){
				if(arr1==provdata){
					//获取对应省份的二维数组（所有的市）
					var citydata = arr[i+1];
					//清空市下拉框中所有的选项
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
		//获取县的下拉框
		var county = document.getElementById("county");
		//获取选中的市
		var city = document.getElementById("city").value;
		county.options.length=0;
		for(var i = 0;i<arr.length;i++){
			var arr1=arr[i];
			//省对应的数组才处理（所有的市）
			if(arr1 instanceof Array){
				var citydata = arr[i];
				for(var j=0;j<citydata.length;j++){
					if(!(citydata[j] instanceof Array)){
						var countydata = citydata[j];
						if(countydata==city){
							//获取当前市对应的所有县区
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
  <h1>省市县三级联动</h1>
  <hr>
	<select name="province" id="province" onchange="citydata();"></select>
	<select name="city" id="city" onchange="countydata();"></select>
	<select name="county" id="county"></select>

 </body>
</html>
