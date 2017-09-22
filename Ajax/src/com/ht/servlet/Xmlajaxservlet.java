package com.ht.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom.Attribute;
import org.jdom.Element;

public class Xmlajaxservlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<?xml version='1.0' encoding='utf-8'?>");
		out.print("<studentList>");
		out.print("<student><studid>1001</studid><studname>张三</studname><age>20</age><sex>男</sex><classname>宏图201601班</classname></student>");
		out.print("<student><studid>1002</studid><studname>李四</studname><age>22</age><sex>男</sex><classname>宏图201602班</classname></student>");
		out.print("<student><studid>1003</studid><studname>王五</studname><age>21</age><sex>男</sex><classname>宏图201601班</classname></student>");
		out.print("<student><studid>1004</studid><studname>小丽</studname><age>16</age><sex>女</sex><classname>宏图201603班</classname></student>");
		out.print("<student><studid>1005</studid><studname>黄蓉</studname><age>18</age><sex>女</sex><classname>宏图201604班</classname></student>");
		out.print("</studentList>");
//		SAXBuilder sax = new SAXBuilder();
//		try {
//			Document doc = sax.build(new File("E:\\XML\\XML文档\\Untitledmm.xml"));
//			Element root = doc.detachRootElement();
//			System.out.println("根元素"+root);
//			display(root);
//		} catch (JDOMException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		out.flush();
		out.close();
	}

//	public void display(Element root){
//		List<Element> list = root.getChildren();
//		for(Iterator<Element> it = list.iterator();it.hasNext();){
//			Element e = it.next();
//			System.out.print("<"+e.getName());
//			List<Attribute> list1 = e.getAttributes();
//			if(list1!=null && list1.size()>0){
//			for(Iterator<Attribute> itr = list1.iterator();itr.hasNext();){
//				Attribute e1 = itr.next();
//				System.out.print(" "+e1.getName()+"="+e1.getValue());
//			   }
//			}
//			System.out.print(">");
//			if(e.getChildren().size()>0){
//				System.out.println("");
//				display(e);
//				System.out.println("</"+e.getName()+">\n");
//			}else{
//				System.out.println(e.getValue()+"</"+e.getName()+">");
//			}
//		}
//	}
}
