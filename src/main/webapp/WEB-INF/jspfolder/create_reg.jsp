<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="Menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h2>Register Here !</h2>
	<form action="savereg" method="post">
		<table>
			<tr>
				<th><h3>FirstName:</h3></th>
				<td><input type="text" name="firstName" required /></td>
			</tr>

			<tr>
				<th><h3>LastName:</h3></th>
				<td><input type="text" name="lastName" required /></td>
			</tr>

			<tr>
				<th><h3>Email:</h3></th>
				<td><input type="text" name="email" required /></td>
			</tr>
			<tr>
				<th><h3>Mobile:</h3></th>
				<td><input type="text" name="mobile" required /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register" /></td>
			</tr>
		</table>
		${msg}
	</form>

</body>
</html>