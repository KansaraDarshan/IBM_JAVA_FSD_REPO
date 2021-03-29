import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkh=new LinkedHashSet<String>();
		linkh.add("Raone");
		linkh.add("Gone");
		linkh.add("Mona");
		linkh.add("Sona");
		
		System.out.println(linkh);
		
		HashSet<String> h=new HashSet<String>();
		h.add("Raone");
		h.add("Gone");
		h.add("Sona");
		h.add("Mona");
		
		System.out.println(h);
		System.out.println();
		System.out.println();
		//also including hasmaps also
		
		HashMap<String,Integer> hm=new HashMap<String, Integer>();
		hm.put("Adarsh",12);
		hm.put("Darsh",21);
		hm.put("Darshana",19);
		hm.put("Mona",22);
		
		
		for(String key:hm.keySet())
		{
			System.out.println(key+": "+hm.get(key));
		}
		
		System.out.println();System.out.println();
		
		//here order is maintained
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String, Integer>();
		lhm.put("Adarsh",12);
		lhm.put("Darsh",21);
		lhm.put("Darshana",19);
		lhm.put("Mona",22);
		
		
		for(String key:lhm.keySet())
		{
			System.out.println(key+": "+lhm.get(key));
		}//
	}

}
