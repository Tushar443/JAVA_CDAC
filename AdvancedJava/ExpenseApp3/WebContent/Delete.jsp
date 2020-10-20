<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
	String id= request.getParameter("exp_id");

	int uid = Integer.parseInt(id);
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");
	
	PreparedStatement ps = con.prepareStatement(
			"delete from expense where expense_id=?");
	
	ps.setInt(1, uid);
	

	int i =ps.executeUpdate();
	con.close();
	response.sendRedirect("ExpenseList2.jsp");
%>