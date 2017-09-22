package JSPservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Firstservlet extends HttpServlet{
	String username,age,sex;

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
		resp.setContentType("text.html;charset=GBK");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>女哦啊女阿女女安</title></head>");
		out.print("<body>");
		out.print("<h1>能动手就不要逼逼<h1><hr>");
		out.print("<input type='text' name='num1'>&nbsp;");
		out.print("<select border='1'>");
		out.print("<option value='+'>+</option>");
		out.print("<option value='-'>-</option>");
		out.print("<option value='*'>*</option>");
		out.print("<option value='/'>/</option>");
		out.print("</select>&nbsp;");
		out.print("<input type='text' name='num2'>&nbsp;");
		out.print("<input type='button' name='opr' value='计算'>");
		
		out.print("</body>");
		out.print("</html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
	@Override
	public void destroy() {
		
	}
}
