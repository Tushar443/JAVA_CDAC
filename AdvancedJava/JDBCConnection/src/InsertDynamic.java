import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDynamic {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int uno =sc.nextInt();
		String name = sc.next();
		float fee = sc.nextFloat();
		String course = sc.next();
		try {
			//loading jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cdac20","root","@Tushar44");
			
			Statement s =con.createStatement();
//			String query = "Insert into student values(?,?,?,?);";
			String query ="Insert into student values ("+uno+",'"+name+"',"+fee+",'"+course+"');";
			System.out.println(query);
			
//			int i = s.executeUpdate("Insert into student values(101,'Tushar',9999,'dac');");
			int i =s.executeUpdate(query);
			con.close();
			System.out.println(i+" Record Added");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
