import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePreparedStatement {
	public static void main(String[] args) throws SQLException {
		int uno =2000;
		String name ="Thunder";
		float fee = 3453.34f;
		String course = "Alibag";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Cdac20","root","@Tushar44");
			String query="update student set rno =?,name=?,fee=?,course=? where rno=200";

			PreparedStatement s =con.prepareStatement(query);
			s.setInt(1, uno);
			s.setString(2, name);
			s.setFloat(3, fee);
			s.setString(4, course);
			
			int i = s.executeUpdate();
			System.out.println("Update");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
