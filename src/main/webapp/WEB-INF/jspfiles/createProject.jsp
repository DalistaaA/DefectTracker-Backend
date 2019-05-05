<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
				<td><input type="text" name="id" required></td>
			</tr>
			<tr>
				<td><label for="project_name">Project Name :</label></td>
				<td><input type="text" name="project_name" required></td>
			</tr>
			<tr>
				<td><label for="project_description">Project Description :</label></td>
				<td><input type="text" name="project_description" required></td>
			</tr>
			<tr>
				<td><button type="submit" value="Submit">Submit</button></td>
			</tr>
		</table>
	</form>
	

	<a href="displayUsers">View All Projects</a>
</body>
</html>