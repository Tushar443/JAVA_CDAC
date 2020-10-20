

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Electronic")
public class Electronic extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pc = request.getParameter("pc");
		HttpSession ss = request.getSession(true);
		if(pc!=null) {
			ss.setAttribute("Mypc", pc);
		}
		
		String tv = request.getParameter("tv");
		
		if(tv!=null) {
			ss.setAttribute("Mytv", tv);
		}
		response.sendRedirect("Electric.html");
	}

}
