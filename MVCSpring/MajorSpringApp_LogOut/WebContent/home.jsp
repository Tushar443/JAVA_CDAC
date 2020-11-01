<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h1>
Welcome To Home Page
</h1>
<h1><a href="">Add Expenses</a> </h1>
<h1><a href="">List Expenses</a> </h1>

</body>
</html>
<%
	}else
		response.sendRedirect("index.jsp");
%>