package com.ibm.streaming;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Subscription {
   private User user;
   private String plan;
   private LocalDate expiry;
   private static final int MONTHLY=100;
   private static final int YEARLY=1000;
   
public Subscription() {
	
	// TODO Auto-generated constructor stub
}

 public String getPlan() {
	return plan;
}
public void setPlan(String plan) {
	this.plan = plan;
}
public LocalDate getExpiry() {
	return expiry;
}
public void setExpiry(LocalDate expiry) {
	this.expiry = expiry;
}
public void subscribe(String plan, User user) throws SubscriptionException
 { 	
	 if(plan.equalsIgnoreCase("Monthly") && user.getBalance()>=MONTHLY)
	 {   
		 user.setBalance(user.getBalance()-MONTHLY);
	 	user.setSubscription(this);
	 	expiry=LocalDate.now().plus(1,ChronoUnit.MONTHS);
	 	this.plan=plan;
	 }
 	 else if(plan.equalsIgnoreCase("Yearly") && user.getBalance()>=YEARLY)
		{
 		 System.out.println("user getBal: "+user.getBalance());
 		user.setBalance(user.getBalance()-YEARLY);
	 	user.setSubscription(this);
	 	expiry=LocalDate.now().plus(1,ChronoUnit.YEARS);
	 	this.plan=plan;
		}
 	 else 
 		 throw new SubscriptionException("Insuff balance against the subscription");
		
 }
 	 
		
 }
   

