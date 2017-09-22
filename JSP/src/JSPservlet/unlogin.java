package JSPservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class unlogin extends HttpServlet{

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text.html;charset=GBK");
		req.setCharacterEncoding("GBK");
		PrintWriter out = resp.getWriter();
		String login = req.getParameter("login");
		String password = req.getParameter("pass");
		out.print("<html>");
		out.print("<title><head>登入界面</head></title>");
		out.print("<body>");
		out.print("登入账户："+login+"</br>");
		out.print("账户密码："+password+"</br>");
		out.print("/body");
		out.print("</html>");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
}
