
public class Demo {
	private Object data;
	public Demo(Object data)
	{
		this.data=data;
	}
	public Object getData()
	{
		return data;
	}
	public void setData(Object data)
	{
		this.data=data;
	}
	 public static void main(String[] args) {
		 
		 Demo d=new Demo("String");
		 System.out.println("get data "+d.getData());
		 d.setData(213);
		 
		 System.out.println("after set "+d.getData());
		 d.data=123;
		 System.out.println("d get data afte int assign"+d.getData());
		 d.setData(new Car("venue","ac","ABS"));
		 System.out.println(d.getData());
				 
		 
		 
		 
		 
	}

}
