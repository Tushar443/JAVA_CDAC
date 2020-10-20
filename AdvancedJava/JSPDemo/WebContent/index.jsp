<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<%=new Date() %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
<form action="divide.jsp">
Num 1 : <input type="text" name="num1" ><br>
Num 2 : <input type="text" name="num2" ><br>
<input type="submit" value="Submit" ><br>
</form>
</body>
</html>