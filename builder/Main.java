package org.patterns.builder;

public class Main {

	public static void main(String[] args) {
		User user = new User.UserBuilder().setUserId(1).setUserName("Madhav").setEmailId("sharma.madhav79@gmail.com").Build();
		System.out.println(user); 
	}
}
