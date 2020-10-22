

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Q4")
public class Q4 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");
			String s ="select * from studentassnt;";
			
			Statement stat = con.createStatement();
			ResultSet rs =stat.executeQuery(s);
			ArrayList<ResultSet> arr = new ArrayList<>();
			while(rs.next()) {
				arr.add(rs);
			}
			out.print("<h1>Hello34</h1>");
			for(int i =0;i<arr.size();i++) {
				for(int j =0 ;j<arr.size();j++) {
					if(arr.get(i).getInt(3) > arr.get(j).getInt(3)) {
						ResultSet temp = arr.get(i);
						arr.set(i, arr.get(j));
						arr.set(j, temp);
					}
				}
			}
			out.print("<h1>Hello44</h1>");
			
			Iterator<ResultSet> it = arr.iterator();
			
			while(it.hasNext()) {
			ResultSet demo =it.next();
				out.print("<h3>"+demo.getInt(1)+"</h3>");
				out.print("<h3>"+demo.getString(2)+"</h3>");
				out.print("<h3>"+demo.getInt(3)+"</h3>");
				out.print("<h3>"+demo.getString(4)+"</h3>");
			}
			
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.print("<h1>Hello65</h1>");
		out.flush();
		out.close();

	}

}
