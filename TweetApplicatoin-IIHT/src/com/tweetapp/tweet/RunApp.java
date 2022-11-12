package com.tweetapp.tweet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunApp {
	
	public  void tweetsPost() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {

			System.out.println("press 1 to Post Tweet");
			System.out.println("press 2 to View My Tweet ");
			System.out.println("press 3 to View All Tweet");
			System.out.println("press 4 to view all users");
			System.out.println("press 5 to Reset Password");
			System.out.println("press 6 to logout");
			System.out.println("........................................................");

			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				// add tweet
				System.out.println("Enter user name");
				String name = br.readLine();

				System.out.println("Enter tweet massages");
				String tweet = br.readLine();


				Tweet st = new Tweet(name, tweet);
				System.out.println(st);
				boolean answer = TweetDao.postTweet(st);

				if (answer) {
					System.out.println("Tweet Add succesfully");
				} else {
					System.out.println("Tweet Fail to Post send again");
				}

			} else if (choice == 2) {
				//View My Tweet 
			System.out.println("Enter User name to view  tweet");
			String userName = br.readLine();

				boolean answer = TweetDao.viewMyTweet(userName);

				if (answer) {
				System.out.println("Tweet get succesfully");
			} else {
				System.out.println("fail");
			}
			} else if (choice == 3) {
				// View All tweets
			TweetDao.viewAllTweets();
			} else if (choice == 4) {
				// View All User
				TweetDao.viewAllUsers();
			}  else if (choice == 6) {
				// logout
				
				System.out.println("Logout successfully ");
				System.exit(0);
			} else {

			}
			System.out.println("thanks for using our management system");
		}
	}
	

}
