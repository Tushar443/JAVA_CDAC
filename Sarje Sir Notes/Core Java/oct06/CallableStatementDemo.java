package oct06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CallableStatementDemo {

	public static void main(String[] args) {
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","root");
			CallableStatement s = 
					con.prepareCall("{ call my_proc(?) }");
			s.setInt(1, 103);
			s.execute();		
			con.close();
			System.out.println(" record deleted ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
