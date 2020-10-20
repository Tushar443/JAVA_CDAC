<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>
 <%@ include file="header.jsp" %> 
<h1>404 Not Found</h1>
<h2><%=
	exception.getMessage()
%></h2>
</body>
</html>