<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login </title>
</head>
<body>
<h1>Login page</h1>
	<form action = "loginservlet" method = "post" >
<table>
        <tr><td><label>Email  : </label> </td><td><input type="Email" name="gmail"></td></tr>
        <tr><td><label>password : </label></td><td> <input type="password" name="password"></td></tr>
		<tr><td><input type="submit" value="login"></td></tr> <tr><td><input type="submit" value="Registration"></td></tr></table>	
		</form>
</body>
</html>