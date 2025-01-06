package com.gaurav;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n hello wlecome to streams practice");
		System.out.println("-------------------------------------------");
		System.out.println("\n sec max value using streams ");
		List<Integer> list = Arrays.asList(10, 100, 200, 300);
		list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
		int max2 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("\n max val is " + max2);
		System.out.println("\n limit");
		list.stream().limit(2).forEach(e -> System.out.print(e + " "));

		// print duplicate values
		int a[] = { 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 5, 7 };
		Map<Integer, Long> map2 = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(a1 -> a1, Collectors.counting()));
		System.out.println(map2);
		System.out.println("\n dup values are");
		map2.entrySet().stream().filter(a2 -> a2.getValue() > 1).map(a2 -> a2.getKey()).collect(Collectors.toList())
				.forEach(e -> System.out.print(e + " "));

		String[] fruits = { "banana", "apple", "grapes", "kiwi", "pineapple", "pine" };
		System.out.println("\n sorting based on lenght");
		Arrays.stream(fruits).sorted(Comparator.comparingInt(a4 -> a4.length()))
				.forEach(e -> System.out.print(e + " "));

		// concat 2 arrsys
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		System.out.println("\n concat val are");
		Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).forEach(e -> System.out.print(e + " "));

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
		Stream.concat(list1.stream(), list2.stream()).forEach(e -> System.out.print(e + " "));

		String[] arr3 = { "gaurav", "kesa" };
		String[] arr4 = { "deepa", "kesa" };
		System.out.println("\n merging both string arrays");
		Stream.concat(Arrays.stream(arr3), Arrays.stream(arr4)).forEach(e -> System.out.print(e + " "));

		// parttion by
		List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> collect = list5.stream().collect(Collectors.partitioningBy(a6 -> a6 > 5));
		System.out.println("\n partion value > 5 is " + collect);

		int[] arr5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Map<Boolean, List<Integer>> collect2 = Arrays.stream(arr5).boxed()
				.collect(Collectors.partitioningBy(b -> b < 5));
		System.out.println("\n val is " + collect2);
		Map<Boolean, Long> collect3 = Arrays.stream(arr5).boxed()
				.collect(Collectors.partitioningBy(b -> b < 5, Collectors.counting()));
		System.out.println("\n count is " + collect3);

		// find the vowels with stream api
		List<String> list6 = Arrays.asList("apple", "banana", "eagle", "iphone", "usgae");
		list6.stream().filter(c -> c.charAt(0) == 'a' || c.charAt(0) == 'e' || c.charAt(0) == 'i')
				.forEach(e -> System.out.print(e + " "));

		// multiple arrays
		Integer[] mul = { 1, 2, 3, 4, 5 };
		Arrays.stream(mul).forEach(e -> {
			System.out.print(Math.multiplyFull(e, 1) + "");
		});
		int mul2 = 1;
		for (int i = 0; i < mul.length; i++) {
			mul2 *= mul[i];
		}
		System.out.println("\n mul val are " + mul2);

		int val = Arrays.asList(mul).stream().reduce(1, (c, b) -> c * b);
		System.out.println("\n mul2 val using reduce is " + val);

		int val2 = Arrays.asList(mul).stream().reduce(0, (c, b) -> c + b);
		System.out.println("\n sum val using reduce is " + val2);

		String[] ar1 = { "gaurav", "apple", "ball", "call", "deepa", "egg", "gaurav", "amit", "amit", "amit" };
		Stream<String> s2 = Arrays.asList(ar1).stream();
		// s2.forEach(e->System.out.print(e + " "));

		long count = s2.filter(f -> f.contains("amit")).count();
		System.out.println("\n the count of amit is " + count);
		// using supplier interface we can use same streams.

		// find no of numbers in a list.
		List<Integer> list7 = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		Map<Integer, Long> map4 = list7.stream().collect(Collectors.groupingBy(q -> q, Collectors.counting()));
		System.out.println("\n no of values is " + map4);

		// find no of numbers in a list.
		List<String> sList = Arrays.asList("amanda", "rob", "amanda", "gaurav", "rob");
		TreeMap<String, Long> map5 = sList.stream()
				.collect(Collectors.groupingBy(w -> w, TreeMap::new, Collectors.counting()));
		System.out.println("\n no of words in a string are " + map5);

		String input = "hello hello";
		// find duplicates in string sing streams
		System.out.println("\n val is");
		input.chars().mapToObj(g -> (char) g).distinct().forEach(e -> System.out.print(e + " "));
		long count2 = input.chars().filter((x) -> {
			return (x == 'a' || x == 'i' || x == 'o' || x == 'u' || x == 'e');
		}).count();

		System.out.println("\n val of count is " + count2);
		
		
		

		Map<String, Long> input2 = input.chars().mapToObj(g -> (char) g)
				.collect(Collectors.groupingBy(r -> r.toString(), Collectors.counting()));
		System.out.println("\n the val is " + input2);

		
		
		//first non repeative character
				String input3 = "hello world";
				Map<Character, Long> collect4 = input3.chars().mapToObj(y->(char)y).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				Character entry = collect4.entrySet().stream().filter(y->y.getValue()==1).map(i->i.getKey()).findFirst().get();
				//System.out.println("\n first non-repat char is " + entry);
					System.out.println("val is " + entry);
				
		String input4="testing program is testing program";
		String[] split = input4.split("");
		Map<String,Long> map7= Arrays.stream(split).collect(Collectors.groupingBy(b->b.toLowerCase(),Collectors.counting()));
		map7.entrySet().stream().filter(w->w.getValue()>1).forEach(e->System.out.print(e.getKey() + " " + e.getValue()));
		//System.out.println(map7);
	
	}

}
