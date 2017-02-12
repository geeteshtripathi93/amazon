package com.project.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {

	private Connection con = null;

	public Connection getCon() throws ClassNotFoundException, SQLException {
		// Registering Driver - Connect
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// Connect to database
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "sapient@123");
		// con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521",
		// "system", "system");
		// before executing , make the sapient connection as a comment and make
		// new connection according to yours ip and id
		return con;
	}

}
