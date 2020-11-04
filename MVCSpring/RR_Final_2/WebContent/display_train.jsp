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
				<%= tr.getTrainName() %>
			</td>
			<td>
				<%=tr.getTrainNo()%>
			</td>
			<td>
				<%=  tr.getDateOfTravel()%>
			</td>
			<td>
				<%= tr.getDeparts() %>
			</td>
			<td>
				<%=tr.getReach()%>
			</td>
			
			<td>
				<%=  tr.getGen()%>
			</td>
			<td>
				<%= tr.getFc() %>
			</td>
			<td>
				<%=tr.getSlp()%>
			</td>
			
			<td>
				<%=  tr.getAc1()%>
			</td>
			<td>
				<%= tr.getAc2() %>
			</td>
		
	
		<%
		}
		%>
		<br>
		<td>
			<a href="search_train_form.jsp">Back</a>
		</td>
	</table>
</body>
</html>
<%
	}else
		response.sendRedirect("index.jsp");
%>