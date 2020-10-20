<%@page import="com.sun.org.apache.bcel.internal.util.BCELifier.FLAGS"%>
<%@page import="DTO.Student"%>
<jsp:useBean id="s" class="DTO.Student" scope="session"></jsp:useBean>
<jsp:setProperty name="s" param="rollno" property="rno"/>
<jsp:setProperty name="s" param="name" property="sname"/>
<jsp:setProperty name="s" param="fee" property="fee"/>
<jsp:setProperty name="s" param="course" property="course"/>
<%
	response.sendRedirect("Show.jsp");
%>