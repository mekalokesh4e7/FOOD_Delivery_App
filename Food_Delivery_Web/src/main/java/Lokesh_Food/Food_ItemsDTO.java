package Lokesh_Food;

public class Food_ItemsDTO {
	int Food_ID;
	String Food_Iteam_Name;
	int Price_Per_Quantity;
	String Food_Image,
	Non_Veg;
	float Avg_Rating;
	int Restaurant_ID;
	String Veg;

	
	public Food_ItemsDTO(int food_ID, String food_Iteam_Name, int price_Per_Quantity, String food_Image, String non_Veg, float avg_Rating, int restaurant_ID,
			String veg) {
		// TODO Auto-generated constructor stub
		Food_ID = food_ID;
		Food_Iteam_Name = food_Iteam_Name;
		Price_Per_Quantity = price_Per_Quantity;
		Food_Image = food_Image;
		Non_Veg = non_Veg;
		Avg_Rating = avg_Rating;
		Restaurant_ID = restaurant_ID;
		Veg = veg;
	}
	public int getFood_ID() {
		return Food_ID;
	}
	public void setFood_ID(int food_ID) {
		Food_ID = food_ID;
	}
	public String getFood_Iteam_Name() {
		return Food_Iteam_Name;
	}
	public void setFood_Iteam_Name(String food_Iteam_Name) {
		Food_Iteam_Name = food_Iteam_Name;
	}
	public int getPrice_Per_Quantity() {
		return Price_Per_Quantity;
	}
	public void setPrice_Per_Quantity(int price_Per_Quantity) {
		Price_Per_Quantity = price_Per_Quantity;
	}
	public String getFood_Image() {
		return Food_Image;
	}
	public void setFood_Image(String food_Image) {
		Food_Image = food_Image;
	}
	public String getNon_Veg() {
		return Non_Veg;
	}
	public void setNon_Veg(String non_Veg) {
		Non_Veg = non_Veg;
	}
	public float getAvg_Rating() {
		return Avg_Rating;
	}
	public void setAvg_Rating(float avg_Rating) {
		Avg_Rating = avg_Rating;
	}
	public int getRestaurant_ID() {
		return Restaurant_ID;
	}
	public void setRestaurant_ID(int restaurant_ID) {
		Restaurant_ID = restaurant_ID;
	}
	public String getVeg() {
		return Veg;
	}
	public void setVeg(String veg) {
		Veg = veg;
	}
	@Override
	public String toString() {
		return "Food_ItemsDTO [Food_ID=" + Food_ID + ", Food_Iteam_Name=" + Food_Iteam_Name + ", Price_Per_Quantity="
				+ Price_Per_Quantity + ", Food_Image=" + Food_Image + ", Non_Veg=" + Non_Veg + ", Avg_Rating="
				+ Avg_Rating + ", Restaurant_ID=" + Restaurant_ID + ", Veg=" + Veg + "]";
	}
	
	
	
}