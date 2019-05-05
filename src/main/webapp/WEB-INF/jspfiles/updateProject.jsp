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
	<form action="savePro" method="post">
		<table>
			<tr>
				<td><label for="id">ID :</label></td>
				<td><input type="text" name="id" required value="${user.first_name}"></td>
			</tr>
			<tr>
				<td><label for="project_name">Project Name :</label></td>
				<td><input type="text" name="project_name" required value="${user.project_name}"></td>
			</tr>
			<tr>
				<td><label for="project_description">Project Description :</label></td>
				<td><input type="text" name="project_description" required value="${user.project_description}"></td>
			</tr>
			<tr>
				<td><button type="submit" value="Submit">Submit</button></td>
			</tr>
		</table>
	</form>
	

	<a href="displayProjects">View All Projects</a>
</body>
</html>