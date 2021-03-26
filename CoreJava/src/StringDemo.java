
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		//here we are not compairing content but addresses
		System.out.println("s1==s2 -"+(s1==s2));
		System.out.println("s1==s3 - "+(s1==s3));
		s1= s1+" world";// when manipuated a new memory location is assigned to modified string.
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		System.out.println(s1.replace('o','a'));
		System.out.println(s1);
		System.out.println();
       //string seprration
		String week="Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String sep_days[]=week.split("-");
		for(String str: sep_days)
		{
			System.out.println(str);
		}
	}

}
