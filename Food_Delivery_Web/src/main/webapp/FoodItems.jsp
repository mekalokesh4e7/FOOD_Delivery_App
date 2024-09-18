<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="Lokesh_Food.Food_ItemsDTO, Lokesh_Food.Food_ItemsDAO, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	int FID = Integer.parseInt(request.getParameter("ID"));
	ArrayList<Food_ItemsDTO> Food_List = Food_ItemsDAO.getFoodList();
	%>
		<%
		for(Food_ItemsDTO FoodL: Food_List){
			if(FID==FoodL.getRestaurant_ID()){
			%>
			<div id="FoodMenu">
				<img alt="Food Image" src="<%= FoodL.getFood_Image() %>">
				<h4> <%= FoodL.getFood_Iteam_Name() %></h4>
				<h5>Cost: <%= FoodL.getPrice_Per_Quantity() %></h5>
			</div>
			<%
			}
		}
		%>
</body>
</html>