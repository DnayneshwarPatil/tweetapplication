package com.tweetapp.tweet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsersRegister {
	String firstName;
	
	public void addUserData() throws Exception{
		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("****Press 1 for Registration *****************************************:");
		int choice = Integer.parseInt(br.readLine());
		
		if(choice == 1) {
			System.out.println("Enter your Details: ");
			System.out.println("--------------------------------------------------------------------------------------------");

			System.out.println("Enter your First Name : ");
			firstName = br.readLine();
			System.out.println("Enter your Email Id: ");
			String email = br.readLine();
			
			System.out.println("Enter  password: ");
			String Password = br.readLine();
			
			try {
				
				Connection con = ConnectionProvider.createC();
				PreparedStatement pr = con.prepareStatement("insert into users(firstname,email,password)values(?,?,?)");
				
				pr.setString(1, firstName);
				pr.setString(2, email);
				pr.setString(3, Password);
				
				int i = pr.executeUpdate();
				System.out.println("User registered successfully...");
			}catch(Exception e) {
				e.printStackTrace();
			}
				
			UserLogin log = new UserLogin();
			log.userLogin(email, Password);
			
			
		}if(choice == 1) {
			System.out.println();
			System.out.println("Enter login Details: ");
			System.out.println("-------------------------------------------");
			System.out.println("Enter user email");
			String userEmail =  br.readLine();
			
			System.out.println("Enter password");
			String password =  br.readLine();
		}
	}

}
