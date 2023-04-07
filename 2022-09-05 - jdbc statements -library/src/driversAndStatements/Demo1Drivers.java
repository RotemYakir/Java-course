package driversAndStatements;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Demo1Drivers {

	public static void main(String[] args) {

		System.out.println("List of drivers");
		
		// get a list of all loaded drivers
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		while (drivers.hasMoreElements()) {
			System.out.println(drivers.nextElement());
		}

		try {
			Class <?> clazz= Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(clazz);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
