package com.tweetapp.tweet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLogin {
	

	
	
	public void userLogin(Object email, Object Password) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println();
			System.out.println("Enter login Details: ");
			System.out.println("-------------------------------------------");
			System.out.println("Enter user email");
			String userEmail =  br.readLine();
			
			System.out.println("Enter password");
			String password =  br.readLine();
			
			Connection con = ConnectionProvider.createC();
			PreparedStatement pr = con.prepareStatement("insert into login(email, password) values(?,?)");
			
		    
		    pr.setString(1,userEmail );
		    pr.setString(2, password);
		    
		    pr.executeUpdate();
		    
		    PreparedStatement ps = con.prepareStatement("select * from login");
		    ResultSet rs  = ps.executeQuery();
		    
		    if((email.equals(userEmail)) && (Password.equals(password))) {
		    	
		    	System.out.println("******Your Log in successfully**************");
		    	System.out.println("==========================================================================");
		    	
		    	RunApp tweet = new RunApp();
		    	tweet.tweetsPost();
		    }else {
		    	System.out.println("Enetr wrong Username And Password");
		    	System.out.println("Login again");
		    	UserLogin log = new UserLogin();
		    	log.userLogin(email, Password);
		    }
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
