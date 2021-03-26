import com.ibm.customers.Customer;
import com.ibm.customers.LoyalCustomer;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.print();
		System.out.println();
		Customer c2=new Customer("Darshan",25000);
		c2.print();
		System.out.println();
		Customer c3=new Customer("Darshana",50000);
		c3.print();
		
		LoyalCustomer l1=new LoyalCustomer("Jethalal",25000,10);
		l1.print();
		TempCustomer t1=new TempCustomer("Bawri",30000,5);
		t1.print();
	}

}
