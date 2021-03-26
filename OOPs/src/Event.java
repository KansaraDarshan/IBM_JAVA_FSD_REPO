
public interface Event {
     void doSomething();
}

class EventImpl implements Event
{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("First task");
		
	}
	static class InnerEventImpl implements Event
	{

		@Override
		public void doSomething() {
			// TODO Auto-generated method stub
			System.out.println("Second Task");
		}
		
	}
	public void oneMoreImpl()
	{
		class NestedEventImpl implements Event
		{

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("Third Task");
			}
			
		}
		new NestedEventImpl().doSomething();
	}
	public void oneLastImpl()
	{
		Event e=new Event() {

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("Last one");
			}
			
		};
		e.doSomething();
	}
	
	public void finalLastImpl()
	{
		Event e=()->System.out.println("Fifth task");// Lambda Expression
		e.doSomething();
	}
	public static void main(String[] args)
	{
		EventImpl e1=new EventImpl();
		e1.doSomething();
		//InnerEventImpl inner=e1.new InnerEventImpl(); //Non-static inner class
		EventImpl.InnerEventImpl inner=new EventImpl.InnerEventImpl();
		inner.doSomething();
		e1.oneMoreImpl();
		e1.oneLastImpl();
		e1.finalLastImpl();
	}	
}
