import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Address_Book_Connection {
	public static void Connector() throws ClassNotFoundException, SQLException {
		String jdbcurl = "jdbc:mysql://localhost:3306/address_book";
		Connection c1 = DriverManager.getConnection(jdbcurl, "root", "Sk@7775035369");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connected sucessfully");

	}

}
