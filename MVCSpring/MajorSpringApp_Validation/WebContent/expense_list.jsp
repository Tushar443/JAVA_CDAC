<%@page import="com.cdac.dto.Expense"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense list</title>
</head>
<body>
	<table align="center">
		<%
			List<Expense> elist = (List<Expense>)request.getAttribute("expList"); 
		for(Expense exp : elist){
		%>
		<tr>
			<td>
				<%= exp.getItemName() %>
			</td>
			<td>
				<%= exp.getPrice() %>
			</td>
			<td>
				<%= exp.getPurchaseDate() %>
			</td>
			<td>
				<a href="expense_delete.htm?expenseId=<%= exp.getExpenseId() %>">Delete</a>
			</td>
			<td>
				<a href="expense_update.htm?expenseId=<%= exp.getExpenseId() %>">Update</a>
			</td>
		<%
		}
		%>
		<br>
		<td>
			<a href="home.jsp">Back</a>
		</td>
	</table>
</body>
</html>