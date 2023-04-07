package driversAndStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5StatementDelete {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db2";
		String User = "root";
		String password = "1234";
		String sql = "delete from book where isbn = 2";

		try (Connection con = DriverManager.getConnection(url, User, password);) {
			// to run sql commands we need statement object - we get it from connection
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}
	}

}
