package com.ibm.shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
 private double cartTotal;
 private ArrayList<Product> items; // re[pace with arrayList
 //private int idx;
 
 
 //replace with a Hashmap<String,Double>
// String[][] coupons= {{"HOLI200","200"},{"WKND100","100"},{"APRIL150","150"}};
 
 Map<Integer,String> mapCoupons=new HashMap<Integer,String>();
      
        
     
      
 public ShoppingCart() {
	// TODO Auto-generated constructor stub
	 items=new ArrayList<Product>();
	 mapCoupons.put(200,"HOLI200");
	 mapCoupons.put(100,"WKND");
	 mapCoupons.put(150,"APRIL150");
	 
	  
	 
}
 public void addProduct(Product p) throws OutOfStockException

 {   if(p.getStock()==0)
     {
	    throw new OutOfStockException("The prod is out of stock");
     }
 	else
 	{
	 
	 if(p.getStock()>0)
     {
	 //items[idx++]=p; //it was here when we used array
		 items.add(p);
	 p.setStock(p.getStock()-1);
	 cartTotal+=p.getPrice();
     }
		/*
		 * else { System.out.println("Your Cart is full!!"); }
		 */
 	
 	}
  
  
 }
 public void checkout(Payment p,String coupons) throws PaymentNotPossibleException
 {    
	 if(p.getBalance()<cartTotal)
	 {
		 throw new PaymentNotPossibleException("Aukaat mein reh!!");
	 }
	 
	 else
	 {
	 
	 if(items.size()==0)
	 {
		 System.out.println("Cart is empty!");
	 }
	 else {
	 
	 for(int i=0;i<items.size();i++)
	 {
		 //System.out.println(items[i].getName()+" "+items[i].getPrice());
		 System.out.println(items.get(i).getName()+" "+items.get(i).getPrice());
	 }
	 System.out.println();
	 if(coupons==mapCoupons.get(200)) {
		 System.out.println("Total price is "+cartTotal);
	 System.out.println("Disc price is "+(cartTotal-200));
	 }
	 else if(coupons==mapCoupons.get(100)) {
		 System.out.println("Total price is "+cartTotal);
		 System.out.println("Disc price is "+(cartTotal-100));
		 }
	 else if(coupons==mapCoupons.get(150)) {
		 System.out.println("Total price is "+cartTotal);
		 System.out.println("Disc price is "+(cartTotal-150));
		 }
	 else
	 {
		 System.out.println("Total price is "+cartTotal);
	 }
	 
	 }
 }
 }
}
