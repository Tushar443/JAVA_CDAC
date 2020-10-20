<%@page import="com.sun.org.apache.bcel.internal.util.BCELifier.FLAGS"%>
<%@page import="DTO.Student"%>
<% 
	
	String rno = request.getParameter("rollno");
	int rno1 = Integer.parseInt(rno);
	String name = request.getParameter("name");
	String fee= request.getParameter("fee");
	float fee1 = Float.parseFloat(fee);
	String course = request.getParameter("course");
	Student s = new Student();
	s.setCourse(course);
	s.setFee(fee1);
	s.setRno(rno1);
	s.setSname(name);
	
	session.setAttribute("Student", s);
	response.sendRedirect("Show.jsp");

%>