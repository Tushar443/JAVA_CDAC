<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<spr:form action="login.htm" method="post" commandName="user">
	<table align="center">
		<tr>
		<td>User Name</td>
		</tr>
		<tr>
		<td>
			<spr:input path="userName"/>
			<!--  	<spr:errors path="userName"></spr:errors>-->
		</td>
		</tr>
		<tr>
		<td>Password</td>
		</tr>
		<tr>
		<td>
			<spr:password path="userPass"/>
			<!--  	<spr:errors path="userName"></spr:errors>-->
		</td>
		</tr>
		<tr>
		<td><a href="index.jsp"></a>
		<td>
		<input type="submit" value="LogIn">
		</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>