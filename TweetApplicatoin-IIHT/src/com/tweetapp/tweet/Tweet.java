package com.tweetapp.tweet;

public class Tweet {
	
	private String userName;
	private String tweetPass;
	
	public Tweet(String userName, String tweetPass) {
		super();
		this.userName = userName;
		this.tweetPass = tweetPass;
	}
	public Tweet() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTweetPass() {
		return tweetPass;
	}
	public void setTweetPass(String tweetPass) {
		this.tweetPass = tweetPass;
	}
	@Override
	public String toString() {
		return "Tweet [userName=" + userName + ", tweetPass=" + tweetPass + "]";
	}
	
	
	
	

}
