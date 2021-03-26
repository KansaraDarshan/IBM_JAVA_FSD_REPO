import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Person p=new Person();
		//p.setState("Polo",21);
		
		//Class pc=p.getClass();
		Class pc=Class.forName("Person");
		System.out.println(pc.getName());
		System.out.println(pc.getName());
		
		Constructor[] consructors=pc.getConstructors();
		System.out.println("----List of constructors");
		for(Constructor c: consructors)
			System.out.println(c);
		
		Method[] methods=pc.getMethods();
		System.out.println("----List of methods");
		for(Method m:methods)
			System.out.println(m);
		
		Method[] decMethods=pc.getDeclaredMethods();
		System.out.println("---List of declared methods");
		for(Method m:decMethods)
		{
			System.out.println(m);
		}
			
		Field[] decFields=pc.getDeclaredFields();
		System.out.println("----List of fields");
		for(Field df:decFields)
		{
			System.out.println(df);
		}
		
	
		

	}

}
