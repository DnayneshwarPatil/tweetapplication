package com.assignment.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;
	 public static Connection createC() {
		 try {
			//Class.forName("com.mysql.jdbc.driver");
			
			String user ="root";
		   String password="pass@word1";
		   
		   String url = "jdbc:mysql://localhost:3306/studentmangdb";
		   
		   con = DriverManager.getConnection(url, user, password);
			 
			 
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 return con;
	 }
}
