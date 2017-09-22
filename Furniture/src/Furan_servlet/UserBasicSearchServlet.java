package Furan_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javaclass.Pageing;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Furn_Bean.CityBean;
import Furn_Bean.PageModel;
import Furn_oracleimlp.Furnitureimpl;
 
public class UserBasicSearchServlet extends HttpServlet {
 Furnitureimpl sql = new Furnitureimpl();
 
	 
	 @Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	 throws ServletException, IOException {
		 doPost(req, resp);
	 }
	 
	 @Override
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	 throws ServletException, IOException {
		 String order = req.getParameter("order");
		 if(order.equals("list")){
			 paginglist(req, resp);
			 req.getRequestDispatcher("/furnmeilele/fenpage.jsp").forward(req, resp);
		 }
	 }
	 
	
	 public void paginglist(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			//实例化javabean，取参数
		 Pageing page = new Pageing();
			//总记录条数，计算总页数
			page.setPagebarsum(sql.pagebarsum("city"));
			//当前页
			String currenpage = request.getParameter("currenpage");
			System.out.println(Integer.parseInt(currenpage));
			//操作
			String handle = request.getParameter("handle");
			if(currenpage==null || currenpage.equals("")){
				//当前页为第一页
				page.setCurrentpage(1);
			}else {
				page.setCurrentpage(Integer.parseInt(currenpage));
			}
			if(handle==null || handle.equals("")){
				//当前页的操作
				page.setHandle("firstpage");
			}else {
				page.setHandle(handle);
			}
			List<CityBean> citylist = sql.citylist(page.getLastpage(), page.getStarlocal());
			request.setAttribute("citylist", citylist);
			request.setAttribute("pager", page);
		}
	 
	 
}