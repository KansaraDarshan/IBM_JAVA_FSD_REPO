package com.ibm.emp;

public class Manager extends Employee {
	private double incentives;
	public Manager()
	{
		super();
	}
	public Manager(String empname,double salary, double incentives)
	{
		super(empname,salary);
		this.incentives=incentives;
	}
	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("incentives "+incentives);
	}
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+incentives;
	}
	

}
