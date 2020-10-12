import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			//loading jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cdac20","root","@Tushar44");
			
			Statement s =con.createStatement();
			s.execute("create table student(rno int primary key,name varchar(30),fee float ,course varchar(30));");
			con.close();
			System.out.println("Table Created");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
