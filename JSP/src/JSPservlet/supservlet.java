package JSPservlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class supservlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public supservlet() {
		super();
	}

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>软件使用意见反馈</TITLE></HEAD>");
		out.println("  <BODY bgcolor='pink'>");
		out.print("<h1 align='center'>软件使用意见反馈</h1>");
		out.print("<form action='./supservlet.jsp' method='post'>" );
		out.print("<table width='30%' boder='0' cellspacing='1' cellpadding='1'>");
		out.print("<tr>");
		out.print("<td align='right'>姓名：</td>");
		out.print("<td ><input type='text' name='username' ></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td align='right'>E_mail:</td>");
		out.print("<td ><input type='text' name='E_mail' ></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td align='right'>电话：</td>");
		out.print("<td ><input type='text' name='phone' ></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td align='right'>软件：</td>");
		out.print("<td ><select name='soft' ><option value='QQ'>QQ</option><option value='微信'>微信</option></select></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td align='right'>操作系统：</td>");
		out.print("<td ><select name='os' ><option value='WIN7'>WIN7</option><option value='WIN8'>WIN8</option><option value='WIN10'>WIN10</option></select></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td align='center'>问题描述：</td>");
		out.print("<td><textarea name='reamk' width='600px' height='100px'></textarea></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<tr>");
        out.print("<td clospan='2' align='center'><input type='submit' value=' 确 定 '></td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("</form>");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
