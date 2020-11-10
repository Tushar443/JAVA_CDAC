
<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%> 

<%  
	User user = (User)session.getAttribute("user");
	
	if(user !=null  && user.getUserId() > 0){
		response.sendRedirect("home.jsp");
	}else{
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
 <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    />
    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
      crossorigin="anonymous"
    />
   

<style>
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color:black;
   color: white;
   text-align: center;
}

.header {
  overflow: hidden;
  background-color: black;
  padding: 20px 10px;
  
}
.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px;
  line-height: 25px;
  border-radius: 4px;
}

/* Style the logo link (notice that we set the same value of line-height and font-size to prevent the header to increase when the font gets bigger */
.header a.logo {
  font-size: 35px;
  font-weight: bold;
}


.header a {
  font-size:20px;
  color: white;
}

.header a.active {
  background-color: #7575a3;
  color: white;
  margin-left:1px;
  margin-right:1px;
}
.header a.active1 {
  background-color: #7575a3;
  color: white;
  margin-left:1px;
  margin-right:1px;
}
.header a.active2 {
  background-color: #7575a3;
  color: white;
  margin-left:1px;
  margin-right:1px;
}
.header a.active3 {
  background-color: #7575a3;
  color: white;
  margin-left:1px;
  margin-right:1px;
}


.header-right {
  float: right;
}

media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  .header-right {
    float: none;
  }
}
</style>



</head>
<body>
<div class="header">
  <a href="#default" class="logo"> Railway Reservation</a>
  <div class="header-right">
    <a class="active" href="prep_Log_form.htm">Sign In</a>
  </div>
</div>


<h1 style="text-align:center ;color:#3d3d5c;  margin-top:80px;margin-bottom: 30px">Registration Form </h1>

	<spr:form action="login.htm" method="post" commandName="user" >
	<table align="center" height="200" width="300">
		<tr>
			<td>
				User Name:
			</td>
			<td>
				<spr:input path="userName"/>
			</td>
		</tr>
		<br>
		<tr>
			<td>
				User Pass:
			</td>
			<td>
				<spr:password path="userPass"/>
			</td>
		</tr>
		<tr>
			<td>
				Age:
			</td>
			<td>
				<spr:password path="age"/>
			</td>
		</tr>
		<tr>
			<td>
				Gender:
			</td>
			<td>
				<spr:radiobutton path="gender" value="male"/>Male
				<spr:radiobutton path="gender" value="female"/>Female
			</td>
		</tr>
		<tr align="center">
			<td>
				<a href="index.jsp" >Back</a>
			</td>
		
			<td>
				<input type="submit" style="color:white; background-color: #7575a3;margin-top:5px;" value="Register" >
			</td>
		</tr>
	</table>
	
	
	</spr:form>
	<div class="footer">
  <p>©Copyright 2020, Railway Reservation</p>
</div>
	
	
	
</body>
</html>

<% 
	}

%>