import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DButil {	
	public static Connection connect() throws ClassNotFoundException, SQLException{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.16.100.15:1521/orcl","e20230","e20230");

	return con;
	}
}
