package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/social_media";
    private final String jdbcUsername = "root";
<<<<<<< HEAD
    private final String jdbcPassword = "123456";
=======
    private final String jdbcPassword = "040313";
>>>>>>> a6bd0ac9d6fe8cf20d9f1cae4164c5f7f2c12381

    public Connection getConnection() throws SQLException {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

    }
} 
