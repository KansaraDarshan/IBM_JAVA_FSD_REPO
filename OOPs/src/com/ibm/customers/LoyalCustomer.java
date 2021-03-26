package com.ibm.customers;

public class LoyalCustomer extends Customer {
 private int discount;
 public LoyalCustomer() {
	// TODO Auto-generated constructor stub
	
}
 public LoyalCustomer(String custName,double creditLimit,int discount)
 {
	 super(custName,creditLimit);
	 this.discount=discount;
 }
@Override
public void print() {
	// TODO Auto-generated method stub
	super.print();
	System.out.println("Discount to your loyality: "+discount+"%");
}
 
}
