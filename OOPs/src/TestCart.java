

import com.ibm.shop.OutOfStockException;
import com.ibm.shop.Payment;
import com.ibm.shop.PaymentNotPossibleException;
import com.ibm.shop.Product;
import com.ibm.shop.ShoppingCart;

public class TestCart {
 public static void main(String[] args) {
	Product p=new Product("Tshirt",499,3);
	Product p1=new Product("Shirt",699,2);
	Product p2=new Product("Chinos",899,3);
	Product p3=new Product("Jeans",799,4);
	Payment pp=new Payment("124421",5000);
	ShoppingCart s=new ShoppingCart();
	try {
	
	s.addProduct(p);
	s.addProduct(p2);
	s.addProduct(p3);
	s.addProduct(p3);
	s.addProduct(p2);
	s.addProduct(p1);
	s.checkout(pp,"HOLI200");
	}
	catch (OutOfStockException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	catch(PaymentNotPossibleException e)
	{
		System.out.println(e.getMessage());
	}
}
}
