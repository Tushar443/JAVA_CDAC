<%@page import="com.sun.org.apache.bcel.internal.util.BCELifier.FLAGS"%>
<%@page import="DTO.Student"%>
<jsp:useBean id="s" class="DTO.Student" scope="session"></jsp:useBean>
<jsp:setProperty name="s" property="*"/>

<%
	response.sendRedirect("Show.jsp");
%>