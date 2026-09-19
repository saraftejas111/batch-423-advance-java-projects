<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
		<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

<center>

<h1 align="center">Add Employee Form</h1>

	<form action="addemployee" method="post">

		Name : <input type="text" name="name"> <br><br> 
		
		Role : <input type="text" name="role"> <br><br> 
		
		Salary : <input type="text" name="salary"> <br><br>

		<button type="submit" >Save Employee</button>
	</form>
	
	<h3>${msg}</h3>
</center>

</body>
</html>