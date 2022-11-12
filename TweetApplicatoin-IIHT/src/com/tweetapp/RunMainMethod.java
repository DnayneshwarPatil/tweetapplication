package com.tweetapp;

import com.tweetapp.tweet.UsersRegister;

public class RunMainMethod {

	public static void main(String[] args) {
		
		try {

			UsersRegister userRegister = new UsersRegister();
			userRegister.addUserData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
