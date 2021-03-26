package com.ibm.emp;
public class Executive extends Employee {
	private double commision;
   public Executive() {
	// TODO Auto-generated constructor stub
	   super();
}
   public Executive(String empname,double salary,double commision)
   {
	   super(empname,salary);
	   this.commision=commision;
   }
@Override
public void payslip() {
	// TODO Auto-generated method stub
	super.payslip();
	System.out.println("commision: "+commision);
}
@Override
public double getSalary() {
	// TODO Auto-generated method stub
	return super.getSalary()+commision;
}
   
}
