<%@page import="com.cdac.dto.Train"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Other Details</title>
</head>
<body>
	<form id="form" action="book_train.htm" method="post">
		<table id="table-1"  align="center">
			<tbody>
				<tr>
					<td>
						<input type="radio" name="seatType" value="gen">General
						<input type="radio" name="seatType" value="ac1">AC1
						<input type="radio" name="seatType" value="ac2">AC2
						<input type="radio" name="seatType" value="fc">First Class
						<input type="radio" name="seatType" value="slp">Sleeper
					</td>
					
				</tr>
				
				<tr> 
					<td>
						<input type="radio" name="noPassenger" value="1">1
						<input type="radio" name="noPassenger" value="2">2
						<input type="radio" name="noPassenger" value="3">3
						<input type="radio" name="noPassenger" value="4">4
						<input type="radio" name="noPassenger" value="5">5
					</td>
				</tr>
				<tr> 
					<td>
						<input type="submit" value="Payment">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
<%
	}else
		response.sendRedirect("index.jsp");
%>