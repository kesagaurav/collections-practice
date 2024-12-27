import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum of the list of numbers
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 15, 234, 200, 22222020,-300, 1,
				2, 3, 4, 5,1000000000);
		int sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		// average of all nos.
		Double collect = list.stream().collect(Collectors.averagingInt(a -> a));
		System.out.println("avg is " + collect);
//		
//		double avg2=list.stream().mapToInt(a->a).average().getAsDouble();
//		System.out.println("avg is "+ avg2);

		Double d = list.stream().map(a -> a * a).filter(a -> a > 100).collect(Collectors.averagingInt(a -> a));
		System.out.println(d);
		System.out.println("--------- second case using all the three ----------------------------------");
		Double s2 = list.stream().mapToInt(a -> a * a).filter(a -> a > 100).average().getAsDouble();
		System.out.println(s2);

		long s3 = list.stream().mapToInt(a -> a * a).filter(a -> a > 100).count();
		System.out.println(" count is " + s3);

		list.stream().filter(a -> a % 2 == 0).forEach(e -> System.out.println(e));
		list.stream().filter(a -> a % 2 != 0).forEach(e -> System.out.println("odd is " + e));

		list.stream().filter(a -> a.toString().startsWith("2") || a.toString().startsWith("-2"))
				.forEach(e -> System.out.println(e));

		// printing the duplicate numbers.
		System.out.println("the duplicate ele are");
		Set<Integer> set = list.stream().filter(a -> Collections.frequency(list, a) > 1).collect(Collectors.toSet());
		System.out.println(set);
		
		//find max and min.
		int max=list.stream().collect(Collectors.maxBy(Comparator.comparing(a->a))).get();
		System.out.println(max);
		
		int min=list.stream().collect(Collectors.minBy(Comparator.comparing(a->a))).get();
		System.out.println(min);
		
		int max2=list.stream().mapToInt(a->a).max().getAsInt();
		System.out.println("second methid using max " + max2);
		
		int min2=list.stream().mapToInt(a->a).min().getAsInt();
		System.out.println("second methid using min " + min2);
		
		int max3=list.stream().max(Comparator.comparing(a->a)).get();
		System.out.println(max3);
		
		int min3=list.stream().min(Comparator.comparing(a->a)).get();
		System.out.println("thrid value is " + min3);
		
		
		//sort the nos in ascedning.
		list.stream().sorted().forEach(e->System.out.println(e));
		
		//sort the nos in desc.
		System.out.println("desc list");
		list.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
		
		
		//skip 5 nos.
		list.stream().skip(5).forEach(e->System.out.println(e));
		
		//limit 5 nos.
		int sum1=list.stream().limit(5).mapToInt(a->a).sum();
		System.out.println("the sum values after limit is " + sum1);
		
		int h=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("the hightes no is " + h);
		
		int l=list.stream().sorted().findFirst().get();
		System.out.println("the low is " + l);
		
		

	}

}
