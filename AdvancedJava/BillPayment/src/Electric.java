

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Electric")
public class Electric extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pc = request.getParameter("Oven");
		
		if(pc!=null) {
			Cookie cooki = new Cookie("item3", pc);
			response.addCookie(cooki);
		}
		
		String tv = request.getParameter("Charger");
		
		if(tv!=null) {
			Cookie cooki = new Cookie("item4", tv);
			response.addCookie(cooki);
		}
		response.sendRedirect("HomeApp.html");
	}

}
