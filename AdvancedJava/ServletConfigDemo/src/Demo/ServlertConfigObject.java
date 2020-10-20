package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = { "/ServlertConfigObject" }, 
		initParams = { 
				@WebInitParam(name = "name", value = "Thunder"), 
				@WebInitParam(name = "age", value = "24")
		})
public class ServlertConfigObject extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig sc = getServletConfig();
		response.setContentType("text/html");
		PrintWriter pc = response.getWriter();
		pc.print("<h1>Name : "+sc.getInitParameter("name")+"</h1>");
		pc.print("<h1>Name : "+sc.getInitParameter("age")+"</h1>");
		pc.flush();
		pc.close();
	}

}
