import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");
			
			//Statement s =con.createStatement();
			String query ="select * from student;";
			PreparedStatement p =con.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+
//									rs.getString(2)+" "+
//									rs.getFloat(3)+" "+
//									rs.getString(4));
				System.out.println(rs.getInt("rno")+" "+
						rs.getString("name")+" "+
						rs.getFloat("fee")+" "+
						rs.getString("course"));
					
			}
			System.out.println("@@@@@@@@@@@@@@@@@");
//			rs = p.executeQuery();
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+
									rs.getString(2)+" "+
									rs.getFloat(3)+" "+
									rs.getString(4));
					
			}
			con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
