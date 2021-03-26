//generics now this D can have values ranging from String to Integer to Double....
public class NewDemo<D> {
    private D data;

	public NewDemo(D data) {
		
		this.data = data;
	}

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		NewDemo<String>d1=new NewDemo<String>("Hello");
		//d1.setData(100); //this will create error as the String type is fixed now
		
		System.out.println(d1.getData());
		
		NewDemo<Integer> d2=new NewDemo<Integer>(1000);
		System.out.println(d2.getData());
		System.out.println(d2.getData()+2000);
		
	}
    
}
