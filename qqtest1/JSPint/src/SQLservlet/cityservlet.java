package SQLservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SQLBase.Citysqlsentenceimp;
import SQLBean.Citybean;
import SQLBean.PagingBean;
import SQLBean.Privacebean;

@SuppressWarnings("serial")
public class cityservlet extends HttpServlet {
	Citysqlsentenceimp sql = new Citysqlsentenceimp();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		if(request.getParameter("order")!=null){
			String order = request.getParameter("order");
			if(order.equals("delete")){
			   	sql.citydel(Integer.parseInt(request.getParameter("cityid")));
			   	paginglist(request, response);
				request.getRequestDispatcher("T7doc/cityselect.jsp").forward(request, response);
			}else if(order.equals("add")){
				List<Privacebean> privacelist = sql.privacelist();  
				request.setAttribute("privacelist", privacelist);
				request.getRequestDispatcher("T7doc/cityadd.jsp").forward(request, response);
			}else if(order.equals("privaceadd")){
				Citybean citybean = new Citybean();
				citybean.setCityname(request.getParameter("cityname"));
				citybean.setPrivaceid(Integer.parseInt(request.getParameter("privaceid")));
				sql.cityadd(citybean);
				paginglist(request, response);
				request.getRequestDispatcher("T7doc/cityselect.jsp").forward(request, response);
			}else if(order.equals("list")){
				paginglist(request, response);
				request.getRequestDispatcher("T7doc/cityselect.jsp").forward(request, response);
				
			}else if (order.equals("update")) {
				List<Privacebean> privacelist = sql.privacelist();  
				request.setAttribute("privacelist", privacelist);
				String cityid = request.getParameter("cityid");
				Citybean citybean = sql.findcity(cityid);
				request.setAttribute("citybean", citybean);
				request.getRequestDispatcher("T7doc/cityalter.jsp").forward(request, response);
			}else if (order.equals("privaceupdate")) {
				String cityid = request.getParameter("cityid");
				String cityname = request.getParameter("cityname");
				String privaceid = request.getParameter("privaceid");
				Citybean city = new Citybean();
				city.setCityid(Integer.parseInt(cityid));
				city.setCityname(cityname);
				city.setPrivaceid(Integer.parseInt(privaceid));
				sql.cityupdate(city);
				paginglist(request, response);
				request.getRequestDispatcher("T7doc/cityselect.jsp").forward(request, response);
			}
		}
	}
	public void paginglist(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		/*
		 *	1.设置总页数
		 *	2.设置当前页
		 *	3.设置操作
		 **/
		//实例化javabean，取参数
		PagingBean page = new PagingBean();
		//总记录条数，计算总页数
		page.setPagebarsum(sql.pagebarsum());
		//当前页
		String currenpage = request.getParameter("currenpage");
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
		List<Citybean> citylist = sql.citylist(page.getPagebarsize(), page.getStarlocal());
		request.setAttribute("citylist", citylist);
		request.setAttribute("page", page);
	}

}
