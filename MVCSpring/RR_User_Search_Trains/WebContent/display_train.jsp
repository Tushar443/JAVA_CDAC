<%@page import="java.util.List"%>
<%@page import="com.cdac.dto.Train"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ include file="cache_control.jsp" %>
<%@ include file="header.jsp" %>
<% 
	User user2 =(User)session.getAttribute("user");
	if(user2 !=null  && user2.getUserId() > 0){
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Trains</title>
</head>
<body>
<table align="center">
		<%
			List<Train> tlist = (List<Train>)request.getAttribute("train"); 
		for(Train tr : tlist){
		%>
		<tr>
			<td>
				<%=  tr.getTrainId()%>
			</td>
			<td>
				<%= tr.getTrainName() %>
			</td>
			<td>
				<%=tr.getTrainNo()%>
			</td>
			
			<td>
				<a href="train_delete.htm?trainId=<%= tr.getTrainId() %>">Delete</a>
			</td>
			<td>
				<a href="update_train_form.htm?trainId=<%= tr.getTrainId()%>">Update</a>
			</td>
		<%
		}
		%>
		<br>
		<td>
			<a href="home.jsp">Back</a>
		</td>
	</table>
</body>
</html>
<%
	}else
		response.sendRedirect("index.jsp");
%>