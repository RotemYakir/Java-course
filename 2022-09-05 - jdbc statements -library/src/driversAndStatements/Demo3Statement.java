package driversAndStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Statement {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db2";
		String User = "root";
		String password = "1234";
		String sql = "insert into book values(2,'Java-1','Eldar',30,'2020-01-28')";

		try (Connection con = DriverManager.getConnection(url, User, password);) {
			// to run sql commands we need statement objent - we get it from connection
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}
	}

}
