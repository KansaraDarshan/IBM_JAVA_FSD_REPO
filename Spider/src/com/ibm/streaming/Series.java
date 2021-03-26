package com.ibm.streaming;

public class Series extends Media {
	private int seasons;
	private int episodes;
	 public Series()
	 {
		 
	 }
	public Series(String title, String genre, boolean free,int seasons, int episodes) {
		super(title, genre, free);
		this.seasons=seasons;
		this.episodes=episodes;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void play(User user) throws SubscriptionException, AgeRestrictionException {
		// TODO Auto-generated method stub
		super.play(user);
		System.out.println("Playing epi 01 of season 01");
	}
	
	
	public void play(User user, int season, int episode) throws SubscriptionException, AgeRestrictionException {
		// TODO Auto-generated method stub
		super.play(user);
		if(season<this.seasons&&episode<=this.episodes)
			System.out.println("Playing epi "+episode+" of season "+season);
		else
			System.out.println("Cannot play req media");
	}
	
	
	
	 
}
