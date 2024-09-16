package Lokesh_Food;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Food_ItemsDAO {
	public static ArrayList<Food_ItemsDTO> getFoodList(){
		ArrayList<Food_ItemsDTO> Food= new ArrayList<>();
		try {
			Connection con = jdbc.getCon();
			PreparedStatement stmt = con.prepareStatement("select * from food_items inner join restaurant_owner on food_items.Restaurant_ID=restaurant_owner.Restaurant_ID");
			ResultSet res = stmt.executeQuery();
			while(res.next()) {
				Food_ItemsDTO FoodList = new Food_ItemsDTO(res.getInt(1), res.getString(2), res.getInt(3), res.getString(4), res.getString(4), res.getString(5), res.getFloat(6), res.getInt(7));
				Food.add(FoodList);
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return Food;
		
	}
}