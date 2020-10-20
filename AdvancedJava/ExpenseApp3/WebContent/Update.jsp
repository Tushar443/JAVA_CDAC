<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
String item= request.getParameter("item");
String price = request.getParameter("price");
String pdate = request.getParameter("pdate");
String id= request.getParameter("exp_id");
int uid = Integer.parseInt(id);
float Price = Float.parseFloat(price);

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac20","root","@Tushar44");

PreparedStatement ps = con.prepareStatement(
		"update expense set item_name=?,price=?,pur_date=? where expense_id=?");

ps.setString(1, item);
ps.setFloat(2,Price);
ps.setString(3, pdate);
ps.setInt(4,uid);

int i =ps.executeUpdate();
con.close();
response.sendRedirect("ExpenseList2.jsp");
%>