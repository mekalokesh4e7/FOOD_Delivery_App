package Lokesh_Food;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
	static String drive = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/food_delivery_web_app";
	static String UserName = "root";
	static String Password = "root";
	public static Connection getCon() throws SQLException, ClassNotFoundException {
		Class.forName(drive);
		Connection Con = DriverManager.getConnection(url,UserName,Password);
		return Con;
	}
}