import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));
		System.out.println(collect);

		String[] arr1 = { "abc", "abc", "def" };
		String[] arr2 = { "abc", "hyg", "hyd", "ban", "def" };
		System.out.println("\n concat of string array values are");
		Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().collect(Collectors.toList())
				.forEach(e -> System.err.print(e + " "));

		int[] arr3 = { 1, 1, 2, 3, 4 };
		int[] arr4 = { 5, 6, 6, 7, 7, 8, 9, 2 };
		System.out.println("\n concat of int array values are");
		IntStream.concat(Arrays.stream(arr3), Arrays.stream(arr4)).distinct().forEach(e -> System.out.print(e + " "));

		int[] arr5 = { 10, 20, 30, 60, 90, 100, 100, 90, 90, 30, 20 };
		System.out.println("\n printing duplicates in an array");
		Map<Integer, Long> map2 = Arrays.stream(arr5).boxed()
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		map2.entrySet().stream().filter(a -> a.getValue() > 1).collect(Collectors.toList())
				.forEach(e -> System.out.print(e + " "));
		// distinct elements in maps
		System.out.println("\n distinct elements in array are");
		map2.entrySet().stream().filter(a -> a.getValue() == 1).distinct().forEach(e -> System.out.print(e + " "));
		System.out.println("\n even values are");
		map2.entrySet().stream().filter(a -> a.getValue() % 2 == 0).forEach(e -> System.out.print(e + " "));
		System.out.println("\n adding values in map");
		long sum = map2.entrySet().stream().distinct().mapToLong(a -> a.getKey()).sum();
		System.out.println("\n the sum value is " + sum);

		int arr6[] = { 10, 20, 30, 40, 50 };
		Arrays.stream(arr6).boxed().map(a -> a * a).limit(3).forEach(e -> System.out.print(e + " "));

		List<Integer> list2 = Arrays.asList(10, 20, 30, 30, 40, 50);
		System.out.println("\n printing list ele are");
		list2.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
		int max = list2.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("\n second max is " + max);
		int min = list2.stream().sorted(Comparator.naturalOrder()).distinct().min(Comparator.comparing(a -> a)).get();
		System.out.println("\n min val is " + min);
		int min1 = list2.stream().sorted(Comparator.naturalOrder()).distinct().skip(1).findFirst().get();
		System.out.println("\n sec min val is " + min1);

		// 2)Given list of integers start all the nos starts with 1.
		List<Integer> list3 = Arrays.asList(10, 20, 30, 30, 40, 50, 121, 131, 1000002);
		System.out.println("\n starting with 1");
		list3.stream().filter(a -> a.toString().startsWith("1")).forEach(e -> System.out.println(e + " "));
		// ends with 1
		list3.stream().filter(a -> a.toString().startsWith("1") && a.toString().endsWith("1"))
				.forEach(e -> System.out.println(e + " "));

		// 3)given list of names,group them by there first letter and print the count no
		// of names in each group.
		String[] names = { "Alice", "charlie", "bob", "bill", "Any", "Anna" };
		Map<Character, Long> collect2 = Arrays.stream(names).map(a -> a.toString())
				.collect(Collectors.groupingBy(a -> a.charAt(0), Collectors.counting()));
		System.out.println("\n the count of a is " + collect2);
		System.out.println("\n last value count is ");
		Map<Character, Long> collect3 = Arrays.stream(names).map(a -> a.toString())
				.collect(Collectors.groupingBy(a -> a.charAt(a.length() - 1), Collectors.counting()));
		System.out.println("\n the count of a is " + collect3);

		// 6) given an list of words print the palindroms in list.
		List<String> list31 = List.of("world", "level", "deed", "radar", "hello");
		System.out.println("\n list of palindromes ");
		list31.stream().filter(a -> a.equals(new StringBuilder(a).reverse().toString()))
				.forEach(e -> System.out.print(e + " "));

		// 9)given an list onf strings sotr the lenght in ase order.
		List<String> list5 = Arrays.asList("Mango", "apple", "banana", "kiwi", "hip", "pineapple");
		System.out.println("\n sorting the order is");
		//list5.stream().sorted(Comparator.comparingInt(a->a.length())).forEach(e->System.out.println(e +  " "));
		list5.stream().sorted(Comparator.comparing(a->a.toString().length())).forEach(e->System.out.println(e +  " "));

        //Find the squares of the first three even numbers in a list
		int [] arr7= {1,2,3,4,5,6};
		System.out.println("\n squares of the first three even numbers in a list");
		Arrays.stream(arr7).boxed().map(a->a*a).limit(3).forEach(e->System.out.print(e +  "  "));
	
	}

}
