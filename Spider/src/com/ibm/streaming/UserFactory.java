package com.ibm.streaming;

public class UserFactory {

	
	public UserFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static User getUser(String name,int age,String gender,double balance) 
	{
		return new User(name,age,gender,balance);
	}
}
