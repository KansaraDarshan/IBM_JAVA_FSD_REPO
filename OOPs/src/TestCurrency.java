

import com.ibm.xe.CurrencyConvertor;
import com.ibm.xe.INR;
import com.ibm.xe.USD;

public class TestCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConvertor cr=new CurrencyConvertor();
		INR inr=new INR();
		USD usd=new USD();
		System.out.println(cr.convert(inr, usd, 100));
		System.out.println(cr.convert(usd, inr, 100));
	
	}

}
