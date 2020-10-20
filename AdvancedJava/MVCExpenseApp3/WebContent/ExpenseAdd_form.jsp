<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Expenses</title>
</head>
<body>
<form action="ExpenseAdd.jsp" method="post">
	<table align="center">
		<thead>
			<tr>
				<th>Add Expenses</th>
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
				<td><a href="Home.jsp">Log In</a></td>
				<td><input type="submit" value="Add Expense"></td>
			</tr>
		</tbody>
	</table>

</form>

</body>
</html>