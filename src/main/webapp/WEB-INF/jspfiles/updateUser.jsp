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
	<form action="saveUser" method="post">
		<table>
			<tr>
				<td><label for="first_name">First Name :</label></td>
				<td><input type="text" name="first_name" required value="${user.first_name}"></td>
			</tr>
			<tr>
				<td><label for="last_name">Last Name :</label></td>
				<td><input type="text" name="last_name" required value="${user.last_name}"></td>
			</tr>
			<tr>
				<td><label for="email">Email :</label></td>
				<td><input type="text" name="email" required value="${user.email}"></td>
			</tr>
			<tr>
				<td><label for="designation">Designation :</label></td>
				<td><select name="designation" required>
						<option>Select Your Designation</option>
						<option value="Software Engineer" ${user.designation=='Software Engineer'? 'selected':'' }>Software Engineer</option>
						<option value="Senior Software Engineer" ${user.designation=='Senior Software Engineer'? 'selected':'' }>Senior Software Engineer</option>
						<option value="QA Engineer" ${user.designation=='QA Engineer'? 'selected':'' }>QA Engineer</option>
						<option value="Senior QA Engineer" ${user.designation=='Senior QA Engineer'? 'selected':'' }>Senior QA Engineer</option>
				</select></td>
			</tr>
			<tr>
				<td><label for="password">Password :</label></td>
				<td><input type="password" name="password" required value="${user.password}"></td>
			</tr>
			<tr>
				<td><label for="cpassword">Confirm Password :</label></td>
				<td><input type="password" name="cpassword" required value="${user.cpassword}"></td>
			</tr>
			<tr>
				<td><button type="submit" value="Create Account">Submit</button></td>
			</tr>
		</table>
	</form>
	

	<a href="displayUsers">View All User</a>
</body>
</html>