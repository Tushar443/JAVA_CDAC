<%@page import="com.cdac.dto.Train"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
    <%@ include file="cache_control.jsp" %>
<%@ include file="header.jsp" %>
<% 
	User user1 =(User)session.getAttribute("user");
	if(user1 !=null  && user1.getUserId() > 0){
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Train Form</title>
</head>
<body>
<%
	Train tr = (Train)session.getAttribute("train");
	if(tr!=null){
%>
	<table align="center">
		
		<tr>
		<td><h3> Confirm Train Details</h3></td>
		</tr>
		<tr>
		<td>Train No</td>
		</tr>
		<tr>
		<td>
			<%= tr.getTrainNo() %>
		</td>
		</tr>
		<tr>
		<td>Train Name</td>
		</tr>
		<tr>
		<td>
			<%= tr.getTrainName() %>
		</td>
		</tr>
		
		<tr>
		<td>Source</td>
		</tr>
		<tr>
		<td>
			<%= tr.getDeparts() %>
		</td>
		</tr>
		
		<tr>
		<td>Destination</td>
		</tr>
		<tr>
		<td>
			<%= tr.getReach() %>
		</td>
		</tr>
		
		<tr>
		<td>Date Of Travel</td>
		</tr>
		<tr>
		<td>
			<%= tr.getDateOfTravel() %>
		</td>
		</tr>

		<tr>
		<td><a href="home.jsp">Back</a>
		<td>
		<a href="book_train_seat.htm">Next</a>
		</td>
		</tr>
	</table>
	
</body>
</html>
<%	
	}
	}else
		response.sendRedirect("index.jsp");
%>