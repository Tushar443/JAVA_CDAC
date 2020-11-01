<%@page import="com.service.ServiceImple"%>
<%@page import="com.service.IService"%>
<%@page import="com.dao.IUserDao"%>
<jsp:useBean id="user" class="com.dto.User" scope="session" ></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
	IService userService = new ServiceImple();
	userService.registerUser(user);
	response.sendRedirect("Login_form.jsp");
%>