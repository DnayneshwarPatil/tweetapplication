package com.tweetapp.tweet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TweetDao {

	public static boolean postTweet(Tweet st) {

		boolean status = false;
		try {

			Connection con = ConnectionProvider.createC();
			PreparedStatement pr = con.prepareStatement("insert into tweets(uname, tweet)" + "value(?,?)");

			pr.setString(1, st.getUserName());
			pr.setString(2, st.getTweetPass());

			pr.executeUpdate();
			status = true;

		} catch (Exception e) {
		}
		return status;
	}

	public static boolean viewAllTweets() {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.createC();
			String Query1 = "select * from tweets";
			Statement st = con.createStatement();

			ResultSet set = st.executeQuery(Query1);

			while (set.next()) {
				String name = set.getString(1);
				String tweet = set.getString(2);
				System.out.println("*************************************");
				System.out.println("User Name:" + name);
				System.out.println("Tweet:" + tweet);
				System.out.println("*************************************");
			}

			status = true;

		} catch (Exception e) {
		}
		return status;
	}

	public static boolean viewMyTweet(String userName) {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.createC();
			String Query = "select * from tweets where uname =?";
			PreparedStatement pr = con.prepareStatement(Query);
             pr.setString(1, userName);
			ResultSet set = pr.executeQuery();

			while (set.next()) {
				String name = set.getString("uname");
				String tweet = set.getString("tweet");
				System.out.println("User Name:" + name);
				System.out.println("Tweet:" + tweet);
				System.out.println("*************************************");
			}

			status = true;

		} catch (Exception e) {
		}
		return status;

	}

	public static boolean viewAllUsers() {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.createC();
			String Query = "select uname from tweets";
			Statement st = con.createStatement();

			ResultSet set = st.executeQuery(Query);

			while (set.next()) {
				String name = set.getString(1);
				System.out.println("User Name:" + name);
				System.out.println("*************************************");
			}

			status = true;

		} catch (Exception e) {
		}
		return status;
	}

}
