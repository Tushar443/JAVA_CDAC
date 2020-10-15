

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Q3")
public class Q3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");
			String s ="select * from studentassnt;";
			
			Statement stat = con.createStatement();
			ResultSet rs =stat.executeQuery(s);
			
			while(rs.next()) {
				out.print("SRNO : "+rs.getInt(1)+" ");
				out.print("Name : "+rs.getString(2)+" ");
				out.print("Marks : "+rs.getInt(3)+" ");
				out.print("Date of Birth  : "+rs.getDate(4)+" ");
	
			}
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.print("<h1>Hello</h1>");
		out.flush();
		out.close();
		
	}

}
