
public class Person {

	private String name;
	private int age;
	public Person()
	{
		
	}
	public void setState(String pname, int page)
	{
		name=pname;
		 age=page;
	}
	public void print()
	{
	  System.out.println("name:"+name+"\t age:"+age);	
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Person)
		{
			Person p=(Person)obj;
			if(p.name.equals(this.name)&& p.age==this.age)
				return true;
		}
		return false;
	}
	@Override
	public void finalize() throws Throwable
	{
		System.out.println("Person is no more");
	}
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setState("dars", 22);
		p1.print();
		
		//Object methods
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1);
		System.out.println(p1.getClass());
		
		Person p2=new Person();
		p2.setState("dars",22);
		System.out.println(p1.equals(p2));
		
		Person p3=new Person();
		p3.setState("darsh",22);
		System.out.println(p3.equals(p2));
		//Garbage coll
		Person pp=null;
		for(int c=1;c<=5;c++)
			pp=new Person();
		System.gc();
	}
	
	}


