<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
	String item= request.getParameter("item");
	String price = request.getParameter("price");
	String pdate = request.getParameter("pdate");
	int pid = (int)session.getAttribute("cur_user");
	float Price = Float.parseFloat(price); 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");
	
	PreparedStatement ps = con.prepareStatement(
			"insert into expense (item_name,price,pur_date,user_id) values (?,?,?,?)");
	
	ps.setString(1, item);
	ps.setFloat(2,Price);
	ps.setString(3, pdate);
	ps.setInt(4,pid);

	int i =ps.executeUpdate();
	response.sendRedirect("Home.jsp");
	
	con.close();
	
	
%>