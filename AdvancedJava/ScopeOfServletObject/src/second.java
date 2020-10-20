

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/second")
public class second extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s = (String) request.getAttribute("req");
		
		HttpSession ss = request.getSession();
		String t = (String) ss.getAttribute("session");
		
		ServletContext con = request.getServletContext();
		String constring = (String) con.getAttribute("con");
		
		
		PrintWriter pr = response.getWriter();
		pr.print("<h1>Req  = "+s+"</h1>");
		pr.print("<h1>Req Session = "+t+"</h1>");
		pr.print("<h1>Req Context = "+constring+"</h1>");
	}

}
