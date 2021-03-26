

import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Employee e1=new Employee("Darshan",1000000);
			e1.payslip();
			Employee e2=new Employee("Darshana",2000000);
			e2.payslip();
			System.out.println(" E2 salary "+e2.getSalary());
			Manager m1=new Manager("Rajesh",1000,2000);
			m1.payslip();
			System.out.println("total manager sal: "+m1.getSalary());
			Executive ee=new Executive("Ramesh",10000,20000);
			ee.payslip();
			
		

	}

}
