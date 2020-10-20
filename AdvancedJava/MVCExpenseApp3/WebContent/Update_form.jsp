<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Expenses</title>
</head>
<body>
<%
	String id = request.getParameter("exp_id");
	int exp_id=Integer.parseInt(id);
	
%>
<h1><%=exp_id %></h1>
<h3><a href="ExpenseList2.jsp">Back</a></h3>
<form action="Update.jsp?exp_id=<%=exp_id  %>" method="post">
	<table align="center">
		<thead>
			<tr>
				<th>Update Expenses</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Item Name</td>
				<td><input type="text" name="itemName"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>Purches Date</td>
				<td><input type="text" name="purchaseDate"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>
		</tbody>
	</table>

</form>

</body>
</html>