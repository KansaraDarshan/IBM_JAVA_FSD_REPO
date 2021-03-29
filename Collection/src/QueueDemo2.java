import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Queue<String> queue=new LinkedList<String>();
			queue.add("Darshan");
			queue.add("Mona");
			queue.add("Amaya");
			queue.add("Misha");
			for(String s:queue)
			{
				System.out.println(s);
			}
			System.out.println();
			
			queue.remove();
			for(String s:queue)
			{
				System.out.println(s);
			}
			System.out.println();
			
			queue.add("Danny");
			for(String s:queue)
			{
				System.out.println(s);
			}
			
			System.out.println();
			queue.remove("Danny");
			for(String s:queue)
			{
				System.out.println(s);
			}
			System.out.println();
			
			
			System.out.println();
			queue.clear();
		
			
				System.out.println("size of queue is : "+queue.size());
			
			System.out.println();
			
			
			
			
			Queue<String> que=new LinkedList<String>();
			que.add("Apple");
			que.offer("banana");
			que.offer("Cherry");
			System.out.println(que.peek());
			
			while(!que.isEmpty())
			{
				System.out.println(que.poll()); //poll removes the head ele
			}
			
			System.out.println("The size f que "+que.size());
			
			System.out.println();
			Deque<String> dque=new LinkedList<String>();
			
			
			dque.add("Boss!");
			dque.addFirst("Hello");
			dque.add("India");
			dque.addLast("Bye");
			
			
			while(!dque.isEmpty())
			{
				System.out.println(dque.poll()); //poll removes the head ele
			}
			
	}

}
