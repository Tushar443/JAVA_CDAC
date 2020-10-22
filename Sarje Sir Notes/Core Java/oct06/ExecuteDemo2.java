package oct06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteDemo2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // for mysql 8
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","root");
			Statement s = con.createStatement();
			boolean b = s.execute("select * from student");
			if(b) {
				ResultSet rs = s.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
			}
			con.close();
			System.out.println(b);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
