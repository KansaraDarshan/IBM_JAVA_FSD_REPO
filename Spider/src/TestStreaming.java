import java.time.LocalDate;

import com.ibm.streaming.AgeRestrictionException;
import com.ibm.streaming.Movie;
import com.ibm.streaming.Series;
import com.ibm.streaming.Subscription;
import com.ibm.streaming.SubscriptionException;
import com.ibm.streaming.User;
import com.ibm.streaming.UserFactory;

public class TestStreaming {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.now();
		Subscription sub=new Subscription();
		/*
		 * User u1=new User("Darsh",22,"Male",2000); User u2=new
		 * User("Daksh",16,"Female",150);
		 */
	User u1=UserFactory.getUser("Darsh", 22, "Male", 2000);
	User u2=UserFactory.getUser("Daksh", 16, "Female", 150);
		Movie m1=new Movie("Hangover","Erotic",false);
		Movie m2=new Movie("Andheri Raat Mein dia tere haath mein","Horror",true);
		Movie m3=new Movie("Dangal","Action",false);
		
		Series s1=new Series("Death Note", "Anime", false, 7, 10);
		Series s2=new Series("GOT", "Action", false, 3, 10);
		
		u1.profile();
		System.out.println();
		u1.mySubscription();
		System.out.println();
		u2.profile();
		System.out.println();
		u2.mySubscription();
		
		
		Subscription sub1=new Subscription();
		Subscription sub2=new Subscription();
		try {
		sub1.subscribe("MONTHLY", u1);
		u1.mySubscription();
		
		m1.play(u1);
		System.out.println();
		m1.play(u2);
		System.out.println();
		m2.play(u1);
		m2.play(u2);
		System.out.println();
		
		
		
		sub2.subscribe("YEARLY",u2);
		
		}
		catch (AgeRestrictionException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch (SubscriptionException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
			
			
			
		
	}

}
