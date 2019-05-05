<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
				<td><input type="text" name="first_name" required></td>
			</tr>
			<tr>
				<td><label for="last_name">Last Name :</label></td>
				<td><input type="text" name="last_name" required></td>
			</tr>
			<tr>
				<td><label for="email">Email :</label></td>
				<td><input type="text" name="email" required></td>
			</tr>
			<tr>
				<td><label for="designation">Designation :</label></td>
				<td><select name="designation" required>
						<option>Select Your Designation</option>
						<option value="Software Engineer">Software Engineer</option>
						<option value="Senior Software Engineer">Senior Software Engineer</option>
						<option value="QA Engineer">QA Engineer</option>
						<option value="Senior QA Engineer">Senior QA Engineer</option>
				</select></td>
			</tr>
			<tr>
				<td><label for="password">Password :</label></td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td><label for="cpassword">Confirm Password :</label></td>
				<td><input type="password" name="cpassword" required></td>
			</tr>
			<tr>
				<td><button type="submit" value="Create Account">Submit</button></td>
			</tr>
		</table>
	</form>
	

	<a href="displayUsers">View All User</a>
</body>
</html>