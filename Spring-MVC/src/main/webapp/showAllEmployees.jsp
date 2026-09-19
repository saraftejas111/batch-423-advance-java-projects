<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>

		<h1>All Employees</h1>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Role</th>
				<th>Salary</th>
			</tr>

			<c:forEach var="emp" items="${empList}">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.role}</td>
					<td>${emp.salary}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>