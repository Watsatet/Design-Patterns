package org.patterns.builder;

public class User {
	private final int userId;
	private final String userName;
	private final String emailId;
	
	private User(UserBuilder builder) {
		// Initialize
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.emailId = builder.emailId;
		
	}
	
	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userId+" "+this.userName+" "+this.emailId;
	}
	
	static class UserBuilder{
		private int userId;
		private String userName;
		private String emailId;
		
		public UserBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}
		
		public User Build() {
			User user = new User(this);
			return user;
		}
		
		
	}

}
