@FunctionalInterface 
public interface Hello {
	String sayHello(); //only one abstract method is allowed in functional interface
	default void sayHola() //this is not abstract
	{
		System.out.println("Hola Monde!");
	}
	
	static void sayBonjour()
	{
		System.out.println("Bonjour le Monde");
	}
}

class HelloDemo //you have run config and find the HelloDemo class not the interface Hello
{
	public static void main(String[] args) {
		Hello h=()->"Hello World"; //lambda
		System.out.println(h.sayHello());
		 Hello h2=()->
		 {
			String msg="Hello Again!";
			return msg;
		 };
		 System.out.println(h2.sayHello());
		 h2.sayHola();
		 
		 Hello.sayBonjour();
	}
}