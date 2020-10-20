

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
import javax.servlet.http.HttpSession;
@WebServlet("/HomeApp")
public class HomeApp extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ArrayList<String> col = new ArrayList<String>();
		PrintWriter out = response.getWriter();
		HttpSession ss = request.getSession(false);
		
		String p = (String) ss.getAttribute("Mypc");
		if(p!=null) {
			col.add(p);
		}
		
		String q = (String) ss.getAttribute("Mytv");
		if(p!=null) {
			col.add(q);
		}
		
		String r = (String) ss.getAttribute("MyOven");
		if(p!=null) {
			col.add(r);
		}
		
		String s = (String) ss.getAttribute("MyCharger");
		if(p!=null) {
			col.add(s);
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
