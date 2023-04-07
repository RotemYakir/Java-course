package driversAndStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2Connection {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db2";
		String User = "root";
		String password = "1234";

		try (Connection con = DriverManager.getConnection(url, User, password);) {
			System.out.println("connected to " + url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + url);
	}

}
