package Lokesh_Food;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RestaurantDAO {
	
	public static int setRestaurantList(int ResID, String ResName,String ResAddress, String ResLocation, String ResOpen, String ResClose, int ResGSTNum, String ResCuisinsList, int ResContactNum, int ResBankAccNum, String ResEmail, String ResPassword, float ResAvgRating, String ResOrderAccept, String ResImageURL ) {
		int Success=0;
		try {
			Connection con = jdbc.getCon();
			PreparedStatement stmt = con.prepareStatement("insert into restaurant_owner values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, ResID);
			stmt.setString(2, ResName);
			stmt.setString(3, ResAddress);
			stmt.setString(4, ResLocation);
			stmt.setString(5, ResOpen);
			stmt.setString(6, ResClose);
			stmt.setInt(7, ResGSTNum);
			stmt.setString(8, ResCuisinsList);
			stmt.setInt(9, ResContactNum);
			stmt.setInt(10, ResBankAccNum);
			stmt.setString(11, ResEmail);
			stmt.setString(12, ResPassword);
			stmt.setFloat(13, ResAvgRating);
			stmt.setString(14, ResOrderAccept);
			stmt.setString(15, ResImageURL);
			Success= stmt.executeUpdate();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		return Success;
	}
	
	
	

	public static ArrayList<RestaurantDTO> getList(){
		ArrayList<RestaurantDTO> res= new ArrayList<>();
		try {
		Connection con = jdbc.getCon();
		PreparedStatement stmt = con.prepareStatement("select * from restaurant_owner");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			RestaurantDTO list = new RestaurantDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getFloat(13), rs.getString(14), rs.getString(15));
			res.add(list);
		}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return res;
	}
}