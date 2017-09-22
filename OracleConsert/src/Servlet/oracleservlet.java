package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javabean.studentbean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracleimplement.sudoraclestudent;

public class oracleservlet extends HttpServlet {

	sudoraclestudent impl = new sudoraclestudent();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/xml;charset=utf-8");
		String action = request.getParameter("action");
		PrintWriter out = response.getWriter();
		if(action.equals("")||action!=null){
			if(action.equals("click")){
				List<studentbean> list=impl.selectstu();
				studentbean stu=null;
				out.print("<?xml version='1.0' encoding='utf-8'?>");
				out.print("<studentlist>");
				for(int i=0;i<list.size();i++){
					stu = new studentbean();
					stu=list.get(i);
					String sno = stu.getSno();
					String sname= stu.getSname();
					int sage = stu.getSage();
					String ssex = stu.getSsex();
					out.println("<student>"+"<stuid>"+sno+"</stuid>"+"<sname>"+sname+"</sname>"+"<sage>"+sage+"</sage>"+"<ssex>"+ssex+"</ssex>"+"</student>");
				}
				out.print("</studentlist>");
			}
			out.flush();
			out.close();
		}
		
	}

}
