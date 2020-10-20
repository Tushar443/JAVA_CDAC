

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Electric")
public class Electric extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pc = request.getParameter("Oven");
		HttpSession ss = request.getSession(false);
		if(pc!=null) {
			ss.setAttribute("MyOven", pc);
		}
		String tv = request.getParameter("Charger");
		
		if(tv!=null) {
			ss.setAttribute("MyCharger", tv);
		}
		response.sendRedirect("HomeApp.html");
	}

}
