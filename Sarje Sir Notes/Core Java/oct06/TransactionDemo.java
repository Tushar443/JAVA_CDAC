package oct06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionDemo {

public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","root");
			
			con.setAutoCommit(false);
			
			Statement s = con.createStatement();
			int i = s.executeUpdate(
			"insert into student values(106,'ram','dac',9999.50)");
			con.commit();
			con.close();
			System.out.println(i+" record added");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
