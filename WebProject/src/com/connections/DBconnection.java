package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	private static DBconnection instance=null;
	
	// JDBC driver name and database URL
	    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL = "jdbc:mysql://localhost:3306/muntasirdb";
	    
	   //  Database credentials
	    final String USER = "root";
	    final String PASS = "admin";
		
	private DBconnection()
	{
		
	}
		public static synchronized DBconnection getInstance()
	{
		if(instance==null)
		{
			return new DBconnection();
		}
		else
		{
			return instance;
		}	
	}	
	public Connection getConnection()
	{
		Connection connection=null;
		try {
			Class.forName(JDBC_DRIVER);
			try {
				connection = DriverManager.getConnection(DB_URL,USER,PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
