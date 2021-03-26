package com.ibm.customers;

public class Customer {
           private int custId;
           private String custName;
           private double creditLimit;
           private static int autogen;
           static
           {
        	   autogen=1001;
           }
           public Customer()
           {
        	   this("NoName",-1);
           }
		public Customer(String custName, double creditLimit) {
			
			this.custId = autogen++;
			this.custName = custName;
			this.creditLimit = creditLimit;
		}
         
		public void print()
		{
			System.out.println("Details of customer: ");
			System.out.println("CustId: "+custId);
			System.out.println("CustName: "+custName);
			System.out.println("CreditLimit: "+creditLimit);
		}
}
