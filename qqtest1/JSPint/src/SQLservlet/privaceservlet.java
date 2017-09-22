package SQLservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SQLBase.Privacesqlsentenceimp;
import SQLBean.Privacebean;
import SQLCon.PageingBean;

@SuppressWarnings("serial")
public class privaceservlet extends HttpServlet {

	Privacesqlsentenceimp im = new Privacesqlsentenceimp();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		if (request.getParameter("order") != null) {
			String order = request.getParameter("order");
			if (order.equals("del")) {
				im.privacedel(Integer.parseInt(request.getParameter("id")));
				list(request, response);
				request.getRequestDispatcher("T7doc/privaceselect.jsp")
						.forward(request, response);
			} else if (order.equals("add")) {
				Privacebean privacebean = new Privacebean();
				privacebean.setPrivaceName(new String(request.getParameter(
						"privaceName").getBytes("iso-8859-1"), "utf-8"));
				im.privaceadd(privacebean);
				list(request, response);
				request.getRequestDispatcher("T7doc/privaceselect.jsp")
						.forward(request, response);
			} else if (order.equals("update")) {
				Privacebean privacebean = new Privacebean();
				privacebean.setPrivaceid(Integer.parseInt(request
						.getParameter("saveid")));
				privacebean.setPrivaceName(request.getParameter("privacename"));
				im.privaceupdate(privacebean);
				list(request, response);
				request.getRequestDispatcher("T7doc/privaceselect.jsp")
						.forward(request, response);
			} else if (order.equals("list")) {
				list(request, response);
				request.getRequestDispatcher("T7doc/privaceselect.jsp")
						.forward(request, response);
			} else if (order.equals("selectallcity")) {
				list(request, response);
				request.getRequestDispatcher("T7doc/privaceselect.jsp")
						.forward(request, response);
			}
		}
	}

	public void list(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String handle = request.getParameter("handle");
		String currentpage = request.getParameter("currentpage");
		PageingBean pagebe = new PageingBean();
		pagebe.setPagesize(10);
		pagebe.setSumbar(im.sumbar());
		if (currentpage == null || currentpage.equals("")) {
			pagebe.setCurrentpage(1);
		} else {
			pagebe.setCurrentpage(Integer.parseInt(currentpage));
		}
		if (handle == null || handle.equals("")) {
			pagebe.setHandle("first");
		} else {
			pagebe.setHandle(handle);
		}
		String privacename = request.getParameter("privacename");
		List<Privacebean> cityalllist = im.cityalllist(privacename);
		request.setAttribute("cityalllist", cityalllist);
		request.setAttribute("privacename", privacename);
		List<Privacebean> privacelist = im.privacelist(pagebe.getPagesize(),
				pagebe.getStartpage());
		request.setAttribute("privacelist", privacelist);
		request.setAttribute("pagebe", pagebe);
	}
}
