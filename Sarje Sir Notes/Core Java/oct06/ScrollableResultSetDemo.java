package oct06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSetDemo {
	private static ResultSet rs;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","root");
			PreparedStatement s = con.prepareStatement(
					"select * from student",
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = s.executeQuery();
			
//			showForward();
//			showBackword();
//			showFirst();
//			showLast();
			
//			addRecord();
//			updateRecord(105, "five", "FV", 7777.50f);
			
			deleteRecord(105);
			
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
	
	private static void showForward()throws SQLException {
		rs.beforeFirst();
		while(rs.next()) {
			System.out.println(rs.getInt("rno")+" "
					+rs.getString("name")+" "
					+rs.getString("course")+" "
					+rs.getFloat("fee"));
			
		}
		System.out.println("===================");
	}
	
	private static void showBackword()throws SQLException {
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getInt("rno")+" "
					+rs.getString("name")+" "
					+rs.getString("course")+" "
					+rs.getFloat("fee"));
			
		}
		System.out.println("===================");
	}
	
	private static void showFirst()throws SQLException {
		
		if(rs.first()) {
			System.out.println(rs.getInt("rno")+" "
					+rs.getString("name")+" "
					+rs.getString("course")+" "
					+rs.getFloat("fee"));
			
		}
		System.out.println("===================");
	}
	
	private static void showLast()throws SQLException {
		
		if(rs.last()) {
			System.out.println(rs.getInt("rno")+" "
					+rs.getString("name")+" "
					+rs.getString("course")+" "
					+rs.getFloat("fee"));
			
		}
		System.out.println("===================");
	}
	
	private static void addRecord()throws SQLException {
		
		rs.moveToInsertRow();
		rs.updateInt("rno", 107);
		rs.updateString("name", "shiva");
		rs.updateString("course", "CS");
		rs.updateFloat("fee", 999.99F);
		rs.insertRow();
		rs.moveToCurrentRow();
		System.out.println("===================");
	}
	
	private static void updateRecord(
			int rno,String name,String course,float fee)throws SQLException {
		
		rs.beforeFirst();
		while(rs.next()) {
			int rn = rs.getInt("rno");
			if(rn == rno) {
				rs.updateInt("rno", rno);
				rs.updateString("name", name);
				rs.updateString("course", course);
				rs.updateFloat("fee", fee);
				rs.updateRow();
				rs.moveToCurrentRow();
				break;
			}
		}
		System.out.println("===================");
	}

	private static void deleteRecord(
			int rno)throws SQLException {
		
		rs.beforeFirst();
		while(rs.next()) {
			int rn = rs.getInt("rno");
			if(rn == rno) {
				rs.deleteRow();
				rs.moveToCurrentRow();
				break;
			}
		}
		System.out.println("===================");
	}
}
