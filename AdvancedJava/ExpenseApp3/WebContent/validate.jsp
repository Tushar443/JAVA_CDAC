<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
	String uname = request.getParameter("username");
	String upass = request.getParameter("password");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");
	
	PreparedStatement pr = con.prepareStatement("select * from Loginuser where user_name =? and user_pass=?");
	
	pr.setString(1, uname);
	pr.setString(2, upass);
	ResultSet rs = pr.executeQuery();
	
	if(rs.next()){
		int uid=rs.getInt("user_id");
		session.setAttribute("cur_user", uid);
		response.sendRedirect("Home.jsp");
	}else{
		response.sendRedirect("Reg_form.jsp");
	}
	
	con.close();

%>