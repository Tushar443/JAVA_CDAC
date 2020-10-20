

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
	String uname = request.getParameter("username");
	String upass = request.getParameter("password");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");
	
	PreparedStatement ps = con.prepareStatement("insert into Loginuser(user_name,user_pass)values (?,?)");
	ps.setString(1, uname);
	ps.setString(2, upass);
	
	int i = ps.executeUpdate();
	con.close();
	response.sendRedirect("Login.jsp");
%>