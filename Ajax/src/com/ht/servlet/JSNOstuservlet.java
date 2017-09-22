package com.ht.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajaxdemo.PagejQuery;
import com.ajaxdemo.UserVo;
import com.ajaxdemo.studentimpl;
import com.alibaba.fastjson.JSON;

public class JSNOstuservlet extends HttpServlet {
	studentimpl impl = new studentimpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html,charset=utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
			String action = request.getParameter("action");
			if(!action.equals("")&&action!=null){
				if(action.equals("add")){
					String stuno = request.getParameter("stuno");
					String names = request.getParameter("names");
					String age = request.getParameter("age");
					String sex = request.getParameter("sex");
					String cadeid = request.getParameter("cadid");
					String classname = request.getParameter("classname");
					UserVo uservo = new UserVo();
					uservo.setStuno(Integer.parseInt(stuno));
					uservo.setName(names);
					uservo.setAge(Integer.parseInt(age));
					uservo.setSex(sex);
					uservo.setCadeid(cadeid);
					uservo.setClassname(classname);
				    impl.addstudent(uservo);
				    Selected(request, response);
				}else if(action.equals("list")){
					//Selected(request, response);
					Pagelist(request, response);
				}else if(action.equals("del")){
					int stuno = Integer.parseInt(request.getParameter("stuno"));
					impl.deletestud(stuno);
					Selected(request, response);
				}else if(action.equals("update")){
					int stuno = Integer.parseInt(request.getParameter("stuno"));
					upSelected(request, response, stuno);
				}else if(action.equals("updateser")){
					String stuno = request.getParameter("stuno");
					String names = request.getParameter("names");
					String age = request.getParameter("age");
					String sex = request.getParameter("sex");
					String cadeid = request.getParameter("cadid");
					String classname = request.getParameter("classname");
					UserVo uservo = new UserVo();
					uservo.setStuno(Integer.parseInt(stuno));
					uservo.setName(names);
					uservo.setAge(Integer.parseInt(age));
					uservo.setSex(sex);
					uservo.setCadeid(cadeid);
					uservo.setClassname(classname);
					impl.updatestud(uservo);
					Selected(request, response);
				}else if(action.equals("lists")){
					Pagelist(request, response);
				}
			}
	}
	public void Selected(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		List<UserVo> list = impl.selectstudent();
	    String data = JSON.toJSONString(list);
	    System.out.println(data);
	    out.println(data);
	    out.flush();
		out.close();
	}
	
	public void upSelected(HttpServletRequest request, HttpServletResponse response,int stuno)
	throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		UserVo uservo = impl.upselectstud(stuno);
		String data = JSON.toJSONString(uservo);
	    out.println(data);
	    out.flush();
		out.close();
	    }
	public void Pagelist(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		PagejQuery page = new PagejQuery();
		page.setPagebarsum(impl.sumpagestud("stud"));
		String currenpage = request.getParameter("currenpage");
		String handle = request.getParameter("handle");
		if(currenpage==null || currenpage.equals("")){
			page.setCurrentpage(1);
		}else{
			page.setCurrentpage(Integer.parseInt(currenpage));
		}
		if(handle==null || handle.equals("")){
			page.setHandle("firstpage");
		}else{
			page.setHandle(handle);
		}
		List pagelist = impl.Pagestudent(page.getPagebarsize(), page.getStarlocal());
		pagelist.add(page);
		String data = JSON.toJSONString(pagelist);
		System.out.println("ssss"+data);
		out.println(data);
		out.flush();
		out.close();
	}
}
