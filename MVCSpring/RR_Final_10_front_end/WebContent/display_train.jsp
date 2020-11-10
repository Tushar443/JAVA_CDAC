<%@page import="java.util.List"%>
<%@page import="com.cdac.dto.Train"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
   <%@ include file="cache_control.jsp" %>
<%@ include file="header.jsp" %>
<% 
	User user2 = (User)session.getAttribute("user");
	if(user2 !=null  && user2.getUserId() > 0){
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Trains</title>
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
    <a class="active" href="search.htm">Back</a>
  </div>
</div>


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
			<% if(tr.getGen()>0){ %>
			<td>
				<%=  tr.getGen()%>
			</td>
			<%
			}
			else{
				%>
				<td style="color: red">Full</td>
			<%
			}
			%>
			<% if(tr.getFc()>0){ %>
			<td>
				<%=  tr.getFc() %>
			</td>
			<%
			}
			else{
				%>
				<td style="color: red">Full</td>
			<%
			}
			%>
			<% if(tr.getSlp()>0){ %>
			<td>
				<%=  tr.getSlp()%>
			</td>
			<%
			}
			else{
				%>
				<td style="color: red">Full</td>
			<%
			}
			%>
			
			<% if(tr.getAc1()>0){ %>
			<td>
				<%=  tr.getAc1()%>
			</td>
			<%
			}
			else{
				%>
				<td style="color: red">Full</td>
			<%
			}
			%>
			<% if(tr.getAc2()>0){ %>
			<td>
				<%=  tr.getAc2()%>
			</td>
			<%
			}
			else{
				%>
				<td style="color: red">Full</td>
			<%
			}
			%>
			<td>
				
			</td>
			<td>
			<a href="book_train_form.htm?trainId=<%= tr.getTrainId()%>">Book</a>
		</td>
		</tr>
<%
	}
%>
		<tr>
		<td>
			<a href="search.htm">Back</a>
		</td>
		</tr>
	</table>
	<div class="footer">
  <p>© 2020, Railway Reservation</p>
</div>
	
	
	
</body>
</html>
<%
	}else
		response.sendRedirect("index.jsp");
%>