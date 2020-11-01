<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
    User user = (User)session.getAttribute("user");
 	if(user!=null && user.getUserId()>0){
 		response.sendRedirect("home.jsp");
 	}else{
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Index Page</h1>
<h1><a href="prep_reg_form.htm">Register Here</a> </h1>
<h1><a href="prep_log_form.htm">Login</a> </h1>
</body>
</html>
<%
 	}
%>