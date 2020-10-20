

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/first")
public class first extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("req", "From request Object");
		
		HttpSession s = request.getSession();
		s.setAttribute("session", "From session Object");
		
		ServletContext cntx = request.getServletContext();
		cntx.setAttribute("con", "From Context Scope");
		
//		RequestDispatcher rd = request.getRequestDispatcher("second");
//		rd.forward(request, response);
		
		response.sendRedirect("second");
	}
	

}
