import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class HashMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = Map.of("gaurav", 5, "kesa", 2, "deepa", 4, "anurag", 3, "mithelish", 1);
		map.values().stream().sorted(Comparator.comparing(a -> a)).forEach(e -> System.out.print(e + " "));
		System.out.println("\n using 2nd method sorted");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(e -> System.out.print(e.getKey() + "  " + e.getValue()));
		System.out.println("\n starts with g");
		map.keySet().stream().filter(a -> a.startsWith("g")).forEach(e -> System.out.print(e));
		String input = "kesagauravilovejavatechie";// a=5,e=4,i=2,v=3
		Map<String, Long> collect = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("\n values of all string is " + collect);
		collect.entrySet().stream().filter(a -> a.getValue() > 1).map(a -> a.getKey()).collect(Collectors.toList())
				.forEach(e -> System.out.print(e + " "));
		System.out.println("unique elements in a string");
		collect.entrySet().stream().filter(a -> a.getValue() == 1).map(a -> a.getKey()).collect(Collectors.toSet())
				.forEach(e -> System.out.print(e + " "));

		String input2 = "kesagauravkesgu";
		System.out.println("first non repeating character is ");
		Map<String, Long> collect2 = Arrays.stream(input2.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		Optional<Entry<String, Long>> findFirst = collect2.entrySet().stream().filter(a -> a.getValue() == 1)
				.findFirst();
		System.out.println("non repat char is " + findFirst);
		
		//prog to find second highest number.
		int a[]= {5,9,11,2,8,21,1};//21,11,9,8,2,1
//		OptionalInt reduce = Arrays.stream(a).reduce((a1,b)->a1>b?a1:b);
//		reduce.stream().sorted().skip(1).forEach(e->System.out.println(e));
		Optional<Integer> findFirst2 = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("highet no is " + findFirst2);
		Optional<Integer> findFirst3 = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		System.out.println("highet no is " + findFirst3);
		
		IntStream.of(1, 2,3,4,5).boxed();//it will convert primitive (int) to Object values Integer
		DoubleStream.of(1).boxed();
		LongStream.of(1,2,3).boxed().filter(a1->a1%2==0).forEach(e->System.out.println(e));
		IntStream.rangeClosed(1, 10).boxed().forEach(e->System.out.print(e + " "));
		int sum=IntStream.rangeClosed(1, 10).sum();
		System.out.println("\n sum is  " + sum);
		double aug=IntStream.range(1, 10).average().getAsDouble();
		System.out.println("aug is " + aug);
		int max=IntStream.range(100, 10000).min().getAsInt();
		System.out.println("val of max " + max);
		
		String s="123";
		System.out.println("starts with 1");
		s.chars().mapToObj(a1->String.valueOf(a1)).filter(a2->a2.startsWith("1")).forEach(e->System.out.print(e + " "));
	
	
		 IntStream.of(1, 2, 3, 4)
	            .filter(e -> e > 2)
	              .peek(e -> System.out.println("Filtered value: " + e))
	              .map(e -> e * e)
	              .peek(e -> System.out.println("Mapped value: " + e))
	              .sum();
		 
		 IntStream.of(1,2,3,4,5,6,7,8,9).filter(e->e%2==0).peek(a1->System.out.print("value evnr " + a1)).map(a3->a3).peek(a1->System.out.print("mappped value is " + a1)).forEach(e->System.out.print(e + " "));
	}

}
