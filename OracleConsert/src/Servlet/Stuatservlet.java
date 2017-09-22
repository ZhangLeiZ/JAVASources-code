package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javabean.studentbean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracleimplement.sudoraclestudent;

public class Stuatservlet extends HttpServlet {
	HashMap<String, String> map = new HashMap<String, String>();
	sudoraclestudent impl = new sudoraclestudent();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		if(action.equals("")||action!=null){
		List<studentbean> list = impl.selectstu();
		studentbean stu = null;
		for(int i=0;i<list.size();i++){
			String s="d"+i;
			stu=list.get(i);
			String sno = stu.getSno();
			String sname= stu.getSname();
			int sage = stu.getSage();
			String ssex = stu.getSsex();
			String smap=("<student>"+"<stuid>"+sno+"</stuid>"+"<sname>"+sname+"</sname>"+"<sage>"+sage+"</sage>"+"<ssex>"+ssex+"</ssex>"+"</student>");
			map.put(s,smap);
		}
		String dept = request.getParameter("action");
		StringBuffer sb = new StringBuffer();
		out.write("<?xml version='1.0' encoding='utf-8'?>");
		sb.append("<studentlist>");
		sb.append(map.get(dept).toString());
		sb.append("</studentlist>");
		out.write(sb.toString());
		out.flush();
		out.close();
		}
	}
}
