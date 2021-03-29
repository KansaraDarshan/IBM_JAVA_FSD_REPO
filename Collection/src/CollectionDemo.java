import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("App");
		list.add("Gogo");
		list.add("Orator");
		list.add(2,"MircoPhone");
		list.add("BMI");
		
		System.out.println("--Traversing over Arraylist using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("--Traversing over Arraylist using Iterator");
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--traversing over arraylist using foreach loop");
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
		System.out.println();
		LinkedList<String> linkList=new LinkedList<String>();
		linkList.add("Apache");
		linkList.addFirst("Orator");
		linkList.addLast("Eclipse");
		
		list.addAll(linkList);
		list.remove(1);
		
		System.out.println("----tarversing over using foreach");
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
		//convert Arraylist to hashset
		HashSet<String> set=new HashSet<String>(list);
		System.out.println("--Traversing over HashSet suing foreach");
		for(String s:set)
		{
			System.out.println(s);
		}
		
		TreeSet<String> tree=new TreeSet<String>(set);
		System.out.println("--tarversing treeset suing forloop");
		for(String s:tree)
		{
			System.out.println(s);
		}
		
	}

}
