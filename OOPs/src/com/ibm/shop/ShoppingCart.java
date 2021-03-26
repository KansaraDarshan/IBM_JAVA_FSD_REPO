package com.ibm.shop;

public class ShoppingCart {
 private double cartTotal;
 private Product[] items;
 private int idx;
 
 String[][] coupons= {{"HOLI200","200"},{"WKND100","100"},{"APRIL150","150"}};
 public ShoppingCart() {
	// TODO Auto-generated constructor stub
	 items=new Product[5];
	 
}
 public void addProduct(Product p) throws OutOfStockException

 {   if(p.getStock()==0)
     {
	    throw new OutOfStockException("The prod is out of stock");
     }
 	else
 	{
	 
	 if(idx<items.length)
     {
	 items[idx++]=p;
	 p.setStock(p.getStock()-1);
	 cartTotal+=p.getPrice();
     }
 	else
 	{
 		System.out.println("Your Cart is full!!");
 	}
 	
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
	 
	 if(idx==0)
	 {
		 System.out.println("Cart is empty!");
	 }
	 else {
	 
	 for(int i=0;i<idx;i++)
	 {
		 System.out.println(items[i].getName()+" "+items[i].getPrice());
	 }
	 System.out.println();
	 if(coupons==this.coupons[0][0]) {
		 System.out.println("Total price is "+cartTotal);
	 System.out.println("Disc price is "+(cartTotal-200));
	 }
	 else if(coupons==this.coupons[1][0]) {
		 System.out.println("Total price is "+cartTotal);
		 System.out.println("Disc price is "+(cartTotal-100));
		 }
	 else if(coupons==this.coupons[2][0]) {
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
