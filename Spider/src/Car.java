
public class Car {
   private String model;
   private String[] features;
   // public Car(String model,String[] features) 
 //   {
 //   	this.model=model;
//    	this.features=features;
//    }
   public Car(String model,String...features)// varAgs, here the first thing in the strings array is gone to the first parameter of constructor
   {
	   this.model=model;
	   this.features=features;
   }
    public void specs()
    {
    	System.out.println("Features of "+model);
    	for(String f: features)
    		System.out.println( "> "+f);
    }
    public static void main(String[] args)
    {
    	String[] falto= {"Keyless","Power Steering","AC"};
    	Car alto=new Car("Suzuki Alto",falto);
    	
    	String[] fhect= {"ABS","Moon Roof","Climate Control","Cruise","Air Bages","Keyless"};
    	Car hector=new Car("MG Hector",fhect);
    	
    	alto.specs();
    	System.out.println();
    	hector.specs();
    }
}
