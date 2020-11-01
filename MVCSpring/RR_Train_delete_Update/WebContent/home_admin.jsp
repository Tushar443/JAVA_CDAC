<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="cache_control.jsp" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Home  <%= (session.getAttribute("user") !=null)?((User)session.getAttribute("user")).getUserName(): "!!!!!!!!!"%></h1>
<h3>
<a href="add_train.htm">Add Trains</a>
</h3>

<h3>
<a href="searchByAdmin.htm">All Trains</a>
</h3>

<h3>
<a href="Train_status.htm">Train Status</a>
</h3>

</body>
</html>