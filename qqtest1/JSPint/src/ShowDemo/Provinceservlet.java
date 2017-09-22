package ShowDemo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Provinceservlet extends HttpServlet {

	CitySqlimp im = new CitySqlimp();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		if (request.getParameter("order") != null) {
			String order = request.getParameter("order");
			if (order.equals("list")) {
				list(request, response);
				request.getRequestDispatcher("Show/citylist.jsp").forward(
						request, response);

			}else if (order.equals("update")) {
				CityBean bean = im.citybean(request.getParameter("cityid"));
				request.setAttribute("bean", bean);
				List<Privacebean> list = im.privacelist();
				request.setAttribute("list", list);
				request.getRequestDispatcher("Show/cityupdate.jsp").forward(
						request, response);
			}else if (order.equals("updatesave")) {
				String cityid = request.getParameter("cityid");
				String cityname = request.getParameter("cityname");
				String privenceid = request.getParameter("privenceid");
				CityBean bean = new CityBean();
				bean.setCityid(Integer.parseInt(cityid));
				bean.setCityname(cityname);
				bean.setProvinceid(Integer.parseInt(privenceid));
				im.cityupdate(bean);
				list(request, response);
				request.getRequestDispatcher("Show/citylist.jsp").forward(
						request, response);
			}
		}
	}

	public void list(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<CityBean> citylist = im.list();
		request.setAttribute("citylist", citylist);
	}

}
