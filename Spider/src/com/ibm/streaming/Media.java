package com.ibm.streaming;

public class Media {
       protected String title;
       private String genre;
       private boolean free;
       
       public Media()
       {
    	   
       }
       public Media(String title, String genre, boolean free) {
		
		this.title = title;
		this.genre = genre;
		this.free=free;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	public void play(User user) throws SubscriptionException, AgeRestrictionException
	{
	 	if(!free && user.getSubscription()==null)
	 		throw new SubscriptionException("You are not subscribed to play "+title);
	 	else if(genre.equals("Erotic")&& user.getAge()<18 ||
	 			genre.equals("Horror")&& user.getAge()>50)
	 	{
	 		throw new AgeRestrictionException("You are not elligble to watch "+title);
	 	}
	}
       
}
