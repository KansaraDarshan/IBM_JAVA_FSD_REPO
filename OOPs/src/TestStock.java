

import com.ibm.stocks.Broker;
import com.ibm.stocks.Exchange;
import com.ibm.stocks.Holder;
import com.ibm.stocks.Stock;
import com.ibm.stocks.StockSingleton;
import static com.ibm.stocks.StockSingleton.*;
public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock ibm=new Stock();
		Holder h=ibm;
		h.view();
		System.out.println();
		Broker b=ibm;
		b.get();
		b.view();
		System.out.println();
		Exchange e=ibm;
		e.set();
		e.get();
		e.view();
		System.out.println();
		
		
		Holder h1=StockSingleton.getStock();
		h1.view();
		
		Broker b1=StockSingleton.getStock();
		b1.get();
		
		Exchange x1=StockSingleton.getStock();
		x1.set();
		
		System.out.println(h1==b1);
		
		//after static import
		Holder h2=getStock();//dircetly we can use getstock
		h2.view();
		
		
	}

}
