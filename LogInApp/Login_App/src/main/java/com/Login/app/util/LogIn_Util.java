package com.Login.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LogIn_Util {
	private static Connection connection = null;

	private static Connection getConnection() throws SQLException, Exception {
		if (connection != null) {
			return connection;
		} else {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/LogIn_App1";
			String name = "root";
			String password = "root";

			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url, name, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
}
