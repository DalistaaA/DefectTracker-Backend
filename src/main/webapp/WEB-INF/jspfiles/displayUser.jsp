<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>User :</h2>
	<table>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Designation</th>
			<th>Password</th>
		</tr>
		<c:forEach items="${users}" var="user">
		<tr>
		<td>${user.id}</td>
		<td>${user.first_name}</td>
		<td>${user.last_name}</td>
		<td>${user.email}</td>
		<td>${user.designation}</td>
		<td>${user.password}</td>
		<td><a href="deleteUser?id=${user.id}">Delete</a></td>
		<td><a href="showUpdate?id=${user.id}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
	
	<a href="showUser">Add User</a>
</body>
</html>