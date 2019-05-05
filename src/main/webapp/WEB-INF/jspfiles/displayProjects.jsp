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
			<th>Project Name</th>
			<th>Project Description</th>
		</tr>
		<c:forEach items="${projects}" var="project">
		<tr>
		<td>${project.id}</td>
		<td>${project.project_name}</td>
		<td>${project.project_description}</td>
		<td><a href="deleteProject?id=${project.id}">Delete</a></td>
		<td><a href="showUpdateProject?id=${project.id}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
	
	<a href="showProject">Add Project</a>
</body>
</html>