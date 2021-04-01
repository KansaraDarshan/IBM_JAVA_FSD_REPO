import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import javax.sound.midi.SysexMessage;

public class Stream4Demo {
			public static void process(int i)
			{
				System.out.println(i);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> numbers=new ArrayList<Integer>();
					for(int n=1;n<=1000;n++)
						numbers.add(n);
					
					long startTime=System.currentTimeMillis();
					numbers.stream().forEach(Stream4Demo::process);
					long endTime=System.currentTimeMillis();
					System.out.println("Time taken by sequential stream is "+(endTime-startTime));
					System.out.println("===================");
					startTime=System.currentTimeMillis();
					numbers.parallelStream().forEach(Stream4Demo::process);
					endTime=System.currentTimeMillis();
					System.out.println("Time taken by paralele stream is "+(endTime-startTime));
					
	}

}
