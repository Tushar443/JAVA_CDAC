<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="Log.jsp" method="post">
	<table align="center">
		<thead>
			<tr>
				<th>Login Page</th>
			</tr>
		</thead>
		
		<tbody>
			<tr>
				<td>Username</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="userPass"></td>
			</tr>
			<tr>
				<td><a href="Reg_form.jsp">Sign Up</a></td>
				<td><input type="submit" value="Log In"></td>
			</tr>
		</tbody>
	</table>

</form>
</body>
</html>