

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q25part2")
public class Q25part2 extends HttpServlet {
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nm = req.getParameter("uname");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>From 2nd Servlet</h1>");
		out.print("<h1>Name : "+nm+"</h1>");
		out.flush();
		out.close();
	}
}
