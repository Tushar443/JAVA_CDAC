

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q23TextFeild")
public class Q23TextFeild extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Welcome "+name+"</h1>");
		out.flush();
		out.close();
	}

}
