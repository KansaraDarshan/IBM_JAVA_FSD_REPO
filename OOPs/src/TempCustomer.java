

import com.ibm.customers.Customer;

public class TempCustomer extends Customer {
	private int discount;
	public TempCustomer()
	{
		super();
	}
	public TempCustomer(String custName,double creditLimit,int discount)
	{
		super(custName,creditLimit);
		this.discount=discount;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Discount to you is: "+discount+"%");
	}
	

}
