package Lokesh_Food;
public class RestaurantDTO {
	int Restaurant_ID;
	String Restaurant_Name;
	String Restaurant_Address, 
	Restaurant_Location,Open_time,
	Close_time;
	int GST_Number;
	String Cuisins_List;
	int Contact_Number, 
	Bank_Account_number;
	String Email,
	Login_Password;
	float Avg_rating;
	String Order_Accept_Status,
	Image;
	
	
	// Constructor for the Varisbles
	
	public RestaurantDTO(int restaurant_ID, String restaurant_Name, String restaurant_Address, String restaurant_Location,
			String open_time, String close_time, int gST_Number, String cuisins_List, int contact_Number,
			int bank_Account_number, String email, String login_Password, float avg_rating, String order_Accept_Status,
			String image) {
		super();
		Restaurant_ID = restaurant_ID;
		Restaurant_Name = restaurant_Name;
		Restaurant_Address = restaurant_Address;
		Restaurant_Location = restaurant_Location;
		Open_time = open_time;
		Close_time = close_time;
		GST_Number = gST_Number;
		Cuisins_List = cuisins_List;
		Contact_Number = contact_Number;
		Bank_Account_number = bank_Account_number;
		Email = email;
		Login_Password = login_Password;
		Avg_rating = avg_rating;
		Order_Accept_Status = order_Accept_Status;
		Image = image;
	}
	
	
	//getter and setter methods
	

	public int getRestaurant_ID() {
		return Restaurant_ID;
	}
	
	public void setRestaurant_ID(int restaurant_ID) {
		Restaurant_ID = restaurant_ID;
	}
	public int getGST_Number() {
		return GST_Number;
	}
	public void setGST_Number(int gST_Number) {
		GST_Number = gST_Number;
	}
	public int getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(int contact_Number) {
		Contact_Number = contact_Number;
	}
	public int getBank_Account_number() {
		return Bank_Account_number;
	}
	public void setBank_Account_number(int bank_Account_number) {
		Bank_Account_number = bank_Account_number;
	}
	public String getRestaurant_Name() {
		return Restaurant_Name;
	}
	public void setRestaurant_Name(String restaurant_Name) {
		Restaurant_Name = restaurant_Name;
	}
	public String getRestaurant_Address() {
		return Restaurant_Address;
	}
	public void setRestaurant_Address(String restaurant_Address) {
		Restaurant_Address = restaurant_Address;
	}
	public String getRestaurant_Location() {
		return Restaurant_Location;
	}
	public void setResturant_Location(String restaurant_Location) {
		Restaurant_Location = restaurant_Location;
	}
	public String getCuisins_List() {
		return Cuisins_List;
	}
	public void setCuisins_List(String cuisins_List) {
		Cuisins_List = cuisins_List;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getLogin_Password() {
		return Login_Password;
	}
	public void setLogin_Password(String login_Password) {
		Login_Password = login_Password;
	}
	public String getOrder_Accept_Status() {
		return Order_Accept_Status;
	}
	public void setOrder_Accept_Status(String order_Accept_Status) {
		Order_Accept_Status = order_Accept_Status;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getOpen_time() {
		return Open_time;
	}
	public void setOpen_time(String open_time) {
		Open_time = open_time;
	}
	public String getClose_time() {
		return Close_time;
	}
	public void setClose_time(String close_time) {
		Close_time = close_time;
	}
	public float getAvg_rating() {
		return Avg_rating;
	}
	public void setAvg_rating(float avg_rating) {
		Avg_rating = avg_rating;
	}


	@Override
	public String toString() {
		return "RestaurantDTO [Restaurant_ID=" + Restaurant_ID + ", Restaurant_Name=" + Restaurant_Name
				+ ", Restaurant_Address=" + Restaurant_Address + ", Restaurant_Location=" + Restaurant_Location
				+ ", Open_time=" + Open_time + ", Close_time=" + Close_time + ", GST_Number=" + GST_Number
				+ ", Cuisins_List=" + Cuisins_List + ", Contact_Number=" + Contact_Number + ", Bank_Account_number="
				+ Bank_Account_number + ", Email=" + Email + ", Login_Password=" + Login_Password + ", Avg_rating="
				+ Avg_rating + ", Order_Accept_Status=" + Order_Accept_Status + ", Image=" + Image + "]";
	}
	
	//toString
	
	
}