<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin-login-form</title>
</head>
<body>
<fieldset>
<legend>employee login form</legend>
<form action="./welcomeadmin">
<table>
<tr>
<td>
<label>enter your userName:</label>
</td>
</tr>
<tr>
<td>
<input type="text" name="empName">
</td>
</tr>
<tr>
<td>
<label>enter your password:</label>
</td>
</tr>
<tr>
<td>
<input type="password" name="empPassword">
</td>
</tr>
</table>
</form>
<input type="submit" value="login">
</fieldset>
</body>
</html>