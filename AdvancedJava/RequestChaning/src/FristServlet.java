

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FristServlet")
public class FristServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rq = request.getRequestDispatcher("SecondServlet");
		RequestDispatcher rt = request.getRequestDispatcher("ThirdServlet");
//		rq.forward(request, response);
		rq.include(request, response);
		out.print("<h1>After 1st Include Before Forward</h1>");
		rq.forward(request, response);
		out.print("<h1>After 2nd Include </h1>");
//		out.flush();
//		out.close();
	}

}
