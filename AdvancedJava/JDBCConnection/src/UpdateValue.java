import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValue {
	public static void main(String[] args) throws SQLException {
		int uno =105;
		String name ="Rahul";
		float fee = 345.56f;
		String course = "Pune";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Cdac20","root","@Tushar44");
			
			Statement s = con.createStatement();
			String query ="Update student set rno = "+uno+",name='"+name+"',fee ="+fee+",course='"+course+"' where rno =102;";
			boolean i =s.execute(query);
			if(i) {
				System.out.println("Updated");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
