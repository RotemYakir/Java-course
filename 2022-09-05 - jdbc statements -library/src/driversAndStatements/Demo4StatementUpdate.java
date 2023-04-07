package driversAndStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4StatementUpdate {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		String sql = "update book set title ='Romeo and Juliet' , price=100 where isbn = 2";

		try (Connection con = DriverManager.getConnection(url, user, password);) {
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

