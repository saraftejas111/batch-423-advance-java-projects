<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
h1 {
	color: blue
}
</style>
</head>
<body>

	<center>


		<h1 align="center">Hello... student ${std}</h1>

		<% 
	out.print("hello");
	// java code : scripplet tag , not prefered mostly
	%>

		<%!//declaration tag : variables or methods : class level 

	int a = 10;%>

		<br>
		<br> Value of a =
		<%= a   %>

		<br>
		<br> Today's Date :
		<%= LocalDate.now() %>
		
		
		
<a href="employeeForm.jsp">Go to Add Employee</a>



	</center>

</body>
</html>