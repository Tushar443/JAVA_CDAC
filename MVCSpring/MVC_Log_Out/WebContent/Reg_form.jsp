<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<form action="Reg.jsp" method="post">
	<table align="center">
		<thead>
			<tr>
				<th>Registerd Page</th>
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
				<td><a href="Login_form.jsp">Log In</a></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</tbody>
	</table>

</form>

</body>
</html>