package com.ibm.shop;

public class Payment {
	private String actNo;
	private double balance;
	public Payment() {
		
	}
	public Payment(String actNo, double balance) {
		
		this.actNo = actNo;
		this.balance = balance;
	}
	public String getActNo() {
		return actNo;
	}
	public void setActNo(String actNo) {
		this.actNo = actNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
