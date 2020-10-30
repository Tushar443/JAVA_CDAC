<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<spr:form action="reg.htm" method="post" commandName="user"><br>
		UserID :<spr:input path="userId" /><br>
		Name : <spr:input path="userName" /><br>
		Password : <spr:password path="userPass" /><br>
		Gender : <spr:radiobutton path="gender" value="male" />Male
				<spr:radiobutton path="gender" value="female" />Female<br>
		Salary : <spr:input path="salary"/><br>
		city <spr:select path="city">
			<spr:option value="mumbai" >Mumbai</spr:option>
			<spr:option value="pune" >Pune</spr:option>
			<spr:option value="nagpur" >Nagpur</spr:option>
			<spr:option value="Satara" >Satara</spr:option>
		</spr:select></br>
		
		<input type="submit" value ="Register" >
	</spr:form>

</body>
</html>