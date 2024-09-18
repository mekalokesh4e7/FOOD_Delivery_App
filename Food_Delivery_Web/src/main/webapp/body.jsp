<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList,Lokesh_Food.RestaurantDTO,Lokesh_Food.RestaurantDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	<%@ include file="body.css" %>
</style>
</head>
<body>

<div>
	<%
	ArrayList<RestaurantDTO> ResList = RestaurantDAO.getList();
	%>
	<div id="body">
		<%
		for(RestaurantDTO res: ResList){
			String ResImage="https://media-assets.swiggy.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_660/"+res.getImage();
			int ResID = res.getRestaurant_ID();
		%>
		<a href="FoodItems.jsp?ID=<%= res.getRestaurant_ID() %>">
		<div id="RestaurantCard">
			<img alt="Restaurant Image" src="<%= ResImage %>">
			<h3><%= res.getRestaurant_Name() %> </h3>
			<h3>Rating: <%= res.getAvg_rating() %></h3>
			<p><%= res.getCuisins_List() %></p>
			<p><%= res.getRestaurant_ID() %></p>
		</div>
		</a>
		<%
		}
		%>	
	</div>
</div>
</body>
</html>