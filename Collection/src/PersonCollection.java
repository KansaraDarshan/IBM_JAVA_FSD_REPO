import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class PersonCollection {
  public static void main(String[] args) {
	Vector<Person> persons=new Vector<Person>();
	persons.add(new Person("Polo",21));
	persons.add(new Person("Lili",19));
	persons.add(new Person("Mili",17));
	
	for(Person p:persons)
	{
		System.out.println(p);
	}
	
	Map<Integer,Person> mapPerson=new HashMap<Integer,Person>();
	mapPerson.put(1,new Person("Polo",21));
	mapPerson.put(2,new Person("Lili",19));
	mapPerson.put(3,new Person("Mili",17));
	
	for(int k=1;k<=3;k++)
	{
		System.out.println(mapPerson.get(k));
	}
	
	System.out.println(mapPerson.get(1).compareTo(mapPerson.get(2))); //her we are compairing to Persons objects and the person
																	 //class is implementing comparable interface overriding the toCompare method which we use to compare according to the age of the person.
}
}
