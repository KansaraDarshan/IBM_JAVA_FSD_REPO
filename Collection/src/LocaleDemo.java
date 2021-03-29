import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {
		Locale french=Locale.FRENCH;  //predefined french
		
		
//		Locale desi=new Locale("hi");// becuase msgs_hi.properties
//		ResourceBundle bundle=ResourceBundle.getBundle("msgs",desi);
		
		Locale fr=new Locale("fr");// becuase msgs_hi.properties
		ResourceBundle bundle=ResourceBundle.getBundle("msgs",fr);
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
		
	}
}
