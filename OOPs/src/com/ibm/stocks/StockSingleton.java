package com.ibm.stocks;

public final class StockSingleton {
	private static Stock stock;
	private StockSingleton()
	{
		
	}
	public static Stock getStock()//only one object is created so singleton
	{   
		if(stock==null)
			stock=new Stock();	
		
		return stock;
		
		
	}

}
