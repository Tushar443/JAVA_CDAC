<%@page import="DTO.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
	Student s = (Student) session.getAttribute("Student");
%>
	<%= s.getRno()%>
	<%= s.getSname() %>
	<%= s.getFee()%>
	<%= s.getCourse()%>
</body>
</html>