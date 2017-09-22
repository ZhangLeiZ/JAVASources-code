package JSPservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

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
		
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text.html;charset=GBK");
		req.setCharacterEncoding("GBK");
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String age = req.getParameter("age");
		String sex = req.getParameter("sex");
		String love[]=req.getParameterValues("love");
		String address=req.getParameter("address");
		String address2 = req.getParameter("address2");
	    String address3 = req.getParameter("address3");
		
		out.print("<html>");
		out.print("<title><head>用户注册</head></title>");
		out.print("<body>");
		out.print("<table>");
		out.print("用户名称:"+username+"</br>");
		out.print("密码:"+password+"</br>");
		out.print("年龄:"+age+"</br>");
		out.print("性别:"+sex+"</br>");
		out.print("地址:"+address+address2+address3+"</br>");
		StringBuffer str = new StringBuffer("爱好:");
		   for(int i=0;i<love.length;i++){
			   out.print(love[i]+".");
		   }
		out.print(str.toString()+"</br>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
}
