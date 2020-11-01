<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%> 
<%@ include file="cache_control.jsp" %>
<%@ include file="header.jsp" %>
<% 
	User user =(User)session.getAttribute("user");
	if(user !=null  && user.getUserId() > 0){
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<spr:form action="expense_update_form.htm" method="post" commandName="expense">
	<table align="center">
		<tr>
			<td>Expense Id</td>
		</tr>
		<tr>
			<td>
				<spr:input path="expenseId"/>
			</td>
		</tr>
		<tr>
			<td>item name</td>
		</tr>
		<tr>
			<td>
				<spr:input path="itemName"/>
			</td>
		</tr>
		<tr>
			<td>Price</td>
		</tr>
		<tr>
			<td>
				<spr:input path="price"/>
			</td>
		</tr>
			<td>Purchase Date</td>
		<tr>
			<td>
				<spr:input path="purchaseDate"/>
			</td>
		</tr>
		<tr>
			<td><a href="expesne_list.htm">Back</a>
		<td>
			<input type="submit" value="Update">
		</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>
<%
	}else
		response.sendRedirect("index.jsp");
%>