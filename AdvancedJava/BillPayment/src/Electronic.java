

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Electronic")
public class Electronic extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rq = request.getRequestDispatcher("header");
		rq.include(request, response);
		
		String pc = request.getParameter("pc");
		
		if(pc!=null) {
			Cookie cooki = new Cookie("item1", pc);
			response.addCookie(cooki);
		}
		
		String tv = request.getParameter("tv");
		
		if(tv!=null) {
			Cookie cooki = new Cookie("item2", tv);
			response.addCookie(cooki);
		}
		response.sendRedirect("Electric.html");
	}

}
