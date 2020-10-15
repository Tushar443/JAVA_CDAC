

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q24Cal")
public class Q24Cal extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fnum = request.getParameter("fnum");
		String snum =request.getParameter("snum");
		String cal = request.getParameter("cal");
		
		int fnumcal = Integer.parseInt(fnum);
		int snumcal = Integer.parseInt(snum);
		int calculate = Integer.parseInt(cal);
		
		double result =0.0;
		switch(calculate) {
			
		case 1 : result =fnumcal + snumcal;
				break;
		case 2 : result =fnumcal - snumcal;
				break;
		case 3 : result =fnumcal * snumcal;
				break;
		case 4 : result =fnumcal / snumcal;
				break;
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Result is : "+result+"</h1>");
		out.flush();
		out.close();
	}

}
