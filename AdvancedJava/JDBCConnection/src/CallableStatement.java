import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.*;

import com.mysql.cj.xdevapi.Statement;
public class CallableStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cdac20","root","@Tushar44");
			java.sql.CallableStatement c = con.prepareCall("{call my_proc(?) }");
			c.setInt(1, 2000);
			c.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
