import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// palindrom nos list using streams
		List<String> list = Arrays.asList("deepa", "ssss", "121", "radar", "deeps");
		list.stream().filter(a -> a.equals(new StringBuilder(a).reverse().toString()))
				.forEach(e -> System.out.print(e + " "));
		Map<String, Long> collect5 = list.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		System.out.println("\n val is " + collect5);
		long coint = collect5.entrySet().stream().filter(a -> a.getKey().startsWith("d")).map(Map.Entry::getKey).count();
		System.out.println("\n the count is " + coint);

		// count the first every charc.
		String[] arr = { "gaurav", "gauv", "deep", "d", "g", "apple", "banana" };
		Map<Object, Long> collect = Arrays.stream(arr)
				.collect(Collectors.groupingBy(a -> a.charAt(0), Collectors.counting()));
		System.out.println("\n count is " + collect);

		// list of sqs firts 3.
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);// 9,8,7,6,5,4,3,2,1.
		System.out.println("sqrt of first 3 nos");
		list2.stream().map(a -> Math.sqrt(a)).limit(3).forEach(e -> System.out.print(e + " "));
		// find the second highest no.
		int max = list2.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("\n second max value ins " + max);
		int max2 = list2.stream().collect(Collectors.maxBy(Comparator.comparing(a -> a))).get();
		System.out.println("\n max value is " + max2);
		// find second min
		int min = list2.stream().mapToInt(a -> a).min().getAsInt();
		System.out.println("\n min val is " + min);
		// second min value is.
		int min2 = list2.stream().skip(1).findFirst().get();
		System.out.println("min 2 is " + min2);

		String s = "gaurav";
		System.out.println("\n removing duplicates");
		s.chars().mapToObj(a -> (char) a).distinct().forEach(e -> System.out.print(e + " "));

		// partiton even and odd uisng partitonBy.
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> collect2 = list2.stream().collect(Collectors.partitioningBy(a -> a % 2 == 1));
		System.out.println("\n ysing partiton by " + collect2);

		// partionby by using diff logics
		Map<Boolean, List<Integer>> collect3 = list3.stream().collect(Collectors.partitioningBy(a -> a > 5));
		System.out.println("\n ysing partiton2 by " + collect3);

		Map<Boolean, List<String>> collect4 = list.stream()
				.collect(Collectors.partitioningBy(a -> a.startsWith("d") && a.startsWith("s")));
		System.out.println("\n ysing partiton3 by " + collect4);
		
		//contacat 2 arrsy using streams.
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,6,7,8,9};
		System.out.println("concat of 2 arrays is");
		IntStream.concat(Arrays.stream(a), Arrays.stream(b)).boxed().distinct().forEach(e->System.out.print(e + " "));

		
		//contacat 2 lists using streams.
		
		List<String> list4=Arrays.asList("banana","apple","manago","jamakaya");
		List<String> list5=Arrays.asList("banana","grapes","promogramte","pineapple","kiwi");
		System.out.println("\n merging 2 lists using streams");
		Stream.concat(list4.stream(), list5.stream()).distinct().forEach(e->System.out.print(e + " "));
		System.out.println("\n merging 2 lists using diff streams");
		Stream.concat(list4.stream(), list5.stream()).collect(Collectors.toSet()).forEach(e->System.out.print(e + " "));

		//9)given an list onf strings sotr the lenght in ase order.
		List<String> list6=Arrays.asList("Mango","apple","banana","kiwi","hip","pineapple");
		System.out.println("\n values are soretd based on the lenght");
		list6.stream().sorted(Comparator.comparingInt(b1->b1.length())).forEach(e->System.out.print(e + " "));
	
		
		//4) find and print duplicates if it contain duplicates then print
				int a2[] = { 2, 4, 2, 3, 3, 78, 1, 1, 5, 5, 5, 5 };
				System.out.println("the values are");
				Map<Integer, Long> collect6 = Arrays.stream(a2).boxed().collect(Collectors.groupingBy(c->c,Collectors.counting()));
				System.out.println("mapping vlaue si " + collect6);
				collect6.entrySet().stream().filter(e->e.getValue()>1).map(d->d.getKey()).forEach(e->System.out.print(e + " "));
		
		
	}

}
