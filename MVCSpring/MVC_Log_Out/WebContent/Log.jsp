<jsp:useBean id="user" class="com.dto.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<%@page import="com.service.ServiceImple"%>
<%@page import="com.service.IService"%>
<%
IService userService = new ServiceImple();
boolean res = userService.login(user);
if(res){
	response.sendRedirect("Home.jsp");	
}else{
	response.sendRedirect("Login_form.jsp?error_msg=wrong username and password");
}


%>
