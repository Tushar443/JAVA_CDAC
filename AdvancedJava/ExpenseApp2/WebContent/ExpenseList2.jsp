<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.mysql.cj.exceptions.ClosedOnExpiredPasswordException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><a href="Home.jsp">Back</a></h3>
<table>
<%
	int uid= (int)session.getAttribute("cur_user");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");
	
	PreparedStatement ps = con.prepareStatement("select * from expense where user_id = ?");
	
	ps.setInt(1, uid);
	
	ResultSet rs = ps.executeQuery();

	while(rs.next()){	
%>
<tr>
<td><%=rs.getString("item_name")%></td>
<td><%=rs.getFloat("price")%></td>
<td><%=rs.getString("pur_date") %></td>
<td><a href="Delete.jsp">Delete</a></td>
<td><a href="Update.jsp">Update</a></td>
</tr>		
<%
}
	con.close();
%>
</table>
</body>
</html>