<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>
<body>
<spr:form action="reg.htm" method="post" commandName="user">
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
		<td>Age</td>
		</tr>
		<tr>
		<td>
			<spr:input path="age"/>
		</td>
		</tr>
		
		<tr>
		<td>Gender</td>
		</tr>
		<tr>
		<td>
			<spr:radiobutton path="gender" value="male"/>Male
			<spr:radiobutton path="gender" value="female"/>Female
		</td>
		</tr>	
		
		<tr>
		<td><a href="index.jsp"></a>
		<td>
		<input type="submit" value="Register">
		</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>