import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ConcurrentHashMap<String, String> chm=new ConcurrentHashMap<String, String>();
		chm.put("Hello", "Darshan");
		chm.put("Bye", "Mona");
		chm.put("Tata", "Nano");
		
		chm.values().stream().forEach(System.out::println);
		// still to b explored by removing stream thing to check concureent hashmap
		
		HashMap<String, String> hm= new HashMap<String, String>();
		hm.put("Hi","Darshan");
		hm.put("Bye","Rona");
		hm.put("Tea","Saj");
		hm.put("Key","Jack");
		
		
		
		hm.values().stream().forEach(System.out::println);
		
	}

}
