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
<h1>
Welcome To Home Page
<%=(session.getAttribute("user")!=null) ? ((User)session.getAttribute("user")).getUserName() : "!!!!!!"%>
</h1>
<h1><a href="prep_expense_form.htm">Add Expenses</a> </h1>
<h1><a href="expense_list.htm">List Expenses</a> </h1>
<h1><a href="index.htm">Log Out</a> </h1>
</body>
</html>