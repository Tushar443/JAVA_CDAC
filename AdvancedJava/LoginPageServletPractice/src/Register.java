

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/my_reg")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("uname");
		String pass =request.getParameter("upass");
		String gender = request.getParameter("gender");
		String lan[] =request.getParameterValues("language");
		String add =request.getParameter("add");
		String city = request.getParameter("city");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>name "+un+"</h1>");
		out.print("<h1>pass "+pass+"</h1>");
		out.print("<h1>gender "+gender+"</h1>");
		out.print("<h1>Address "+add+"</h1>");
		out.print("<h1>City "+city+"</h1>");
		for(String s : lan) {
			out.print("<h1>Language:  "+s+"</h1>");
		}
	}

}
