

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("+/welcomeservlet")
public class MyLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig sc = getServletConfig();
		ServletConfig sc1 =new ServletConfig() {
			
			@Override
			public String getServletName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ServletContext getServletContext() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Enumeration<String> getInitParameterNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getInitParameter(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		ServletContext s3 = sc.getServletContext();
		String s2 =sc.getServletName();
		
		String s = request.getParameter("uname");
		Enumeration<String> s1 = request.getParameterNames();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Request Obj "+s+"</h1>");
		out.print("<h1>Servlet Config name "+s2+"</h1>");
		out.print("<h1>Servlet context "+s3+"</h1>");
//		out.print("<h1>Enum "+s1.nextElement()+"</h1>");
//		out.print("<h1>Enum "+s1.nextElement()+"</h1>");
		out.flush();
		out.close();
	}

}
