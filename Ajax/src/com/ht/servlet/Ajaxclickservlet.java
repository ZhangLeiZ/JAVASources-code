package com.ht.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ajaxclickservlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");
		String action = tostr(request.getParameter("action"));
		PrintWriter out = response.getWriter();
		//response.setContentType("text/html;charset=utf-8");
		if(!action.equals("")||action!=null){
			
			if(action.equals("click")){
				String name = request.getParameter("name");
				String[] names={"asd","zxc","fgh","wer"};
				Arrays.sort(names);
				int str=Arrays.binarySearch(names, name);
				if(str>-1){
					out.print("fuil");
				}else{
					out.print("succ");
				}
			}else if(action.equals("register")){
				String id = request.getParameter("id");
				String name=tostr(request.getParameter("name"));
				String age = request.getParameter("age");
				String sex = tostr(request.getParameter("sex"));
				System.out.println(id+name+age+sex);
				out.print("ok");
			}
		}
		out.flush();
		out.close();
	}

	
	public String tostr(String str){
		try {
			str=new String (str.getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}
}
