import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertPreparedStatement {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the data");
		int uno =sc.nextInt();
		String name = sc.next();
		float fee = sc.nextFloat();
		String course = sc.next();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cdac20","root","@Tushar44");
			String query ="insert into student values(?,?,?,?);";
			PreparedStatement s =con.prepareStatement(query);
			s.setInt(1, uno);
			s.setString(2, name);
			s.setFloat(3, fee);
			s.setString(4, course);	
			int i = s.executeUpdate();
			con.close();
			System.out.println("Record Added");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
