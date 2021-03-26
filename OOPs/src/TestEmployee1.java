

import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Manager m1=new Manager("Rajesh",1000,2000);

		
		Executive ee=new Executive("Ramesh",10000,20000);
		showSalary(m1);
		showSalary(ee);
	}
  //private static void showSalary(Manager m1) //this is simple overloading.
  //{
//	  System.out.println("Manger sal is "+m1.getSalary());
//  }
//  private static void showSalary(Executive ee)
//  {
//	  System.out.println("Executive sal is "+ee.getSalary());
//  }

	private static void showSalary(Employee e1) { //this is polymorphism
		// TODO Auto-generated method stub
		if(e1 instanceof Manager)//Runtime Type Identification
			System.out.println("Manger sal is "+e1.getSalary());
		else
			System.out.println("Exec sal is "+e1.getSalary());
	}

}
