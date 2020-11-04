<%@page import="java.util.List"%>
<%@page import="com.cdac.dto.Train"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
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
<%
			List<Train> tlist = (List<Train>)request.getAttribute("train"); 
		for(Train tr : tlist){
%>
	<table align="center">
		
		<tr>
			<td>
				<%=tr.getTrainNo()%>
			</td>
			<td>
				<%= tr.getTrainName() %>
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
			<td>
				
			</td>
			<td>
			<a href="book_train_form.htm?trainId=<%= tr.getTrainId()%>">Book</a>
		</td>
		</tr>
<%
	}
%>
	
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