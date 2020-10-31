<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<a href="search.htm">Search Trains</a>
</h3>

<h3>
<a href="cancel.htm">Cancel Ticket</a>
</h3>


<h3>
<a href="logout.htm">Logout</a>
</h3>

<h3>
<a href="booking_status.htm">Booking Status</a>
</h3>

</body>
</html>