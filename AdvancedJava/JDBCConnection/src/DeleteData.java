import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");
			
			Statement s =con.createStatement();
			String query ="delete from student where rno=103;";
			boolean i =s.execute(query);
			System.out.println("Deleted Sucessfully");
			con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
