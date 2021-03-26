
public class ChildDemo<D,A> extends NewDemo<D> {
	private A temp;
	public ChildDemo(D data, A temp) 
	{
		super(data);
		this.temp=temp;
	}
	public A getTemp() {
		return temp;
	}
	public void setTemp(A temp) {
		this.temp = temp;
	}
	public static void main(String[] args) {
		ChildDemo<String, Integer> cd=new ChildDemo<String, Integer>("Number",124);
		System.out.println(" "+cd.getData());
		System.out.println(" "+cd.getData()+" :"+cd.getTemp());
	}
}
