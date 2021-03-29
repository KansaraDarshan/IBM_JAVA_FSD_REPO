import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	public static void main(String[] args) {
		PersonAgeComparator pac=new PersonAgeComparator();//tree needs a compartor as it follows left riht thing in binary tree
		
		
		Comparator<Person>pnc=(p1,p2)->p1.getName().compareTo(p2.getName());
		TreeSet<Person> persons=new TreeSet<Person>(pnc);
		persons.add(new Person("Polo",21));
		persons.add(new Person("Lili",19));
		persons.add(new Person("Mili",17));
		
		for(Person p:persons)
		{
			System.out.println(p);
		}
	}
}


class PersonAgeComparator implements Comparator<Person>
{
					
	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getAge()-p2.getAge();
	}
		//Comparator is good when you do not wanna touch the Perfectly Woking Person class than Comparable which changes the Person class.
	
}
