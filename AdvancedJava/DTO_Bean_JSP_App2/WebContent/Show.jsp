<%@page import="DTO.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="s" class="DTO.Student" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show</title>
</head>
<body>



<jsp:getProperty name="s" property="rno" /><br>
<jsp:getProperty name="s" property="sname" /><br>
<jsp:getProperty name="s" property="fee" /><br>
<jsp:getProperty name="s" property="course" /><br>

</body>
</html>