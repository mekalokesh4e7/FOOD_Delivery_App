<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	<%@ include file="RestaurantLogin.css"  %>
</style>
</head>
<body>
	<form action="RestaurantLoginServlet" method="post">
		<div id="LoginPage">
			<table>
				<tr><td><h3>Restaurant Login</h3></td><td><a href="RestaurantRegistration.jsp"><h3> / Restaurant Registration</h3></a></td></tr>
				<tr><td>Enter Restaurant ID:</td><td><input type="text" name="txtID"></td></tr>
				<tr><td>Enter Password: </td><td><input type="password" name="txtPASS"></td></tr>
				<tr><td><input type="submit" value="Login"></td></tr>
			</table>
		</div>
	</form>
</body>
</html>