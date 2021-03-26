import static java.lang.Math.*;//static import
public class StaticImports {
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println();
		System.out.println(Math.PI);
		System.out.println(Math.random()*100);
		//after importing static
		System.out.println(PI);
		System.out.println(random()*100);
		
	}
}
