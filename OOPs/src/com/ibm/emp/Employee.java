package com.ibm.emp;

public class Employee {
      private int empId;
      private String empName;
      private double salary;
      private  static int autogen;
      static
      {    //static initiliazer block , it executes at the time of class loading
    	  System.out.println("Employee class ready...");
    	  autogen=1001;
      }
      public Employee()
      {   
    	  this("Noname",-1);
      }
	
public Employee(String empName, double salary) {
	
	this.empId = autogen++;
	this.empName = empName;
	this.salary = salary;
}

public void payslip()
{
	System.out.println("Details: ");
	System.out.println("EmpID: "+empId);
	System.out.println("EmpName: "+empName);
	System.out.println("Salary: "+salary);
}

public double getSalary() {
	return salary;
}

}
