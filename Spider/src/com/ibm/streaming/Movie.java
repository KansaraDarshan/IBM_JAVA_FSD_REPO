package com.ibm.streaming;

public class Movie extends Media {
  

public Movie() {
	
	// TODO Auto-generated constructor stub
}

 public Movie(String title,String genre,boolean free)
 {
	 super(title,genre,free);
 }

@Override
public void play(User user) throws SubscriptionException, AgeRestrictionException {
	// TODO Auto-generated method stub
	super.play(user);
	System.out.println("It is playiing Movie "+title);
 

  
}
}