

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HomeApp")
public class HomeApp extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ArrayList<String> col = new ArrayList<String>();
		PrintWriter out = response.getWriter();
		Cookie arr[] = request.getCookies();
		if(arr!=null) {
			for(Cookie c : arr) {
				col.add(c.getValue());
			}
		}
		String pc = request.getParameter("Fan");
		
		if(pc!=null) {
			col.add(pc);
		}
		
		String tv = request.getParameter("Cooler");
		
		if(tv!=null) {
			col.add(tv);
		}
//		RequestDispatcher rd = request.getRequestDispatcher("Bill");
//		rd.forward(request, response);
		out.print("<h1>Items : </h1>");
		for(String str : col) {
			out.print("<h3>"+str+"</h3>");
		}
		
		out.flush();
		out.close();
	}

}
