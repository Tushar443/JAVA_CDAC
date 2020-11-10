
<%@page import="com.cdac.dto.Train"%>
<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
    <%@ include file="cache_control.jsp" %>
<%@ include file="header.jsp" %>
<% 
	User user1 =(User)session.getAttribute("user");
	//System.out.println(user1 +" line 11");
	if(user1 !=null  && user1.getUserId() > 0){
		Train tr = (Train)request.getAttribute("train");
		//System.out.println(tr +" line 14");
		if(tr!=null){
			//System.out.println(tr +" line 16");
		
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Train Form</title>
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
body{

background-image:#f0f0f5;
}

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
    <a class="active1" href="home.jsp">Back</a>
  </div>
</div>


<h1 style="text-align:center ;color:#3d3d5c;  margin-top:80px;margin-bottom: 30px">Confirm Train Details </h1>

<table align="center">
		<tr>
		<td>Train No</td>
		</tr>
		<tr>
		<td>
			<%= tr.getTrainNo() %>
		</td>
		</tr>
		<tr>
		<td>Train Name</td>
		</tr>
		<tr>
		<td>
			<%= tr.getTrainName() %>
		</td>
		</tr>
		
		<tr>
		<td>Source</td>
		</tr>
		<tr>
		<td>
			<%= tr.getDeparts() %>
		</td>
		</tr>
		
		<tr>
		<td>Destination</td>
		</tr>
		<tr>
		<td>
			<%= tr.getReach() %>
		</td>
		</tr>
		
		<tr>
		<td>Date Of Travel</td>
		</tr>
		<tr>
		<td>
			<%= tr.getDateOfTravel() %>
		</td>
		</tr>

		<tr>
		<td><a href="home.jsp">Back</a>
		<td>
		<a href="book_train_seat.htm">Next</a>
		</td>
		</tr>
	</table>
	<div class="footer">
  <p>© 2020, Railway Reservation</p>
</div>
	
	
	
</body>
</html>
<%	
	}
	}else
		response.sendRedirect("index.jsp");
%>