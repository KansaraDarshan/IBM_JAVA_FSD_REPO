import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	public static void print(Object obj)
	{
		System.out.println(obj);
	}
	public static void add(Object obj1,Object obj2)
	{
	
	}
	public static void main(String[] args) {
		Integer[] ar= {2,5,7,9,2};
		List<Integer> numbers=Arrays.asList(ar);
//		for(Integer i:numbers)
//		{
//			System.out.println(i);
//		}
		
	
		// numbers.forEach(System.out::println); //println method ref paased using scope resoution method
		
	//	numbers.forEach(StreamDemo::print); //print is the static method from stremddemo itself class
		
//		numbers.stream().distinct().forEach(System.out::println); //using stream finding the distinct elements
		
	
	Stream<Integer> str1=numbers.stream().distinct();
	//str1.forEach(System.out::println);
	
	System.out.println(str1.count());
	System.out.println();
	Stream<Integer> str2=numbers.stream().filter(n->n>=5);
	str2.forEach(System.out::println);
	
	System.out.println();
	numbers.stream().limit(3).forEach(System.out::println); //only 2,5,7 are considered as thery are fisrt 3 elements
	
	System.out.println();
	
	numbers.stream().distinct().sorted().forEach(System.out::println);
	
	System.out.println();
	System.out.println(numbers.stream().reduce(0,Integer::sum));
	System.out.println();
	System.out.println(numbers.stream().reduce(0,(a,b)->a+b));
	System.out.println();// first two methods are optimized methods to sumup
	System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
	System.out.println();
	System.out.println(numbers.stream().collect(Collectors.summingInt(Integer::intValue)));
	
	
	
	System.out.println("==========================");
	
	System.out.println(IntStream.range(1,99).count());//99 is not included
	
	IntStream.range(1,10).skip(5).forEach(System.out::println);//skips first five
	
	System.out.println(IntStream.range(1, 10).sum());
	
	IntSummaryStatistics summary=IntStream.of(7,2,19,69,8,88,99).summaryStatistics();
	System.out.println(summary);
	
	
	
	}
}
