import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("gaurav", "kesa", "deepa");
		list.stream().sorted(Comparator.comparing(a -> a)).forEach(e -> System.out.println(e));
		System.out.println("reverse order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));

		List<Character> chars = Arrays.asList('a', 'd', 'f', 'e');
		chars.stream().sorted(Comparator.comparing(a -> a)).forEach(e -> System.out.println(e));
		System.out.println("reverse order");
		chars.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));
		// a=97,b=98,c=99,d=100,e=101,f=102 -> f,e,d,a

		List<String> list1 = Arrays.asList(/* "null" */"gaurav", "kesa", "deepa", "", "abc", "def"/* "null" */);
		System.out.println(list1);
		System.out.println(list1.indexOf("gaurav"));
		System.out.println(" the last index is  " + list1.lastIndexOf(""));
		list1.stream().sorted(Comparator.comparing(a -> a)).forEach(e -> System.out.println(e));
		System.out.println("\n in reverse order");
		list1.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));
//		System.out.println("\n null last");
//		list1.stream().sorted(Comparator.nullsLast(Comparator.comparing(a->a))).forEach(e->System.out.println(e));
//		System.out.println("\n null first");
//		list1.stream().sorted(Comparator.nullsFirst(Comparator.comparing(a->a))).forEach(e->System.out.println(e));

		List<Double> douList = new ArrayList<>();
		douList.add(12.3);
		douList.add(1.3);
		douList.add(14.3);
		douList.add(16.3);
		douList.add(17.3);
		douList.add(30.3);

		douList.forEach(e -> System.out.println(e));
		System.out.println("double numbers sorting");
		douList.stream().sorted(Comparator.comparingDouble(a -> a)).forEach(e -> System.out.println(e));

		System.out.println("double numbers sorting using desc order");
		douList.stream().sorted(Comparator.comparing(a -> a, Comparator.reverseOrder()))
				.forEach(e -> System.out.println(e));

		System.out.println("double numbers sorting ");
		douList.stream().sorted(Comparator.reverseOrder()).sorted().sorted().sorted().sorted().sorted()
				.forEach(e -> System.out.println(e));
		// soretd is an interdimate operation

		List<String> list3 = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");

// using parallelStream()  
// method for parallel stream 
		list3.parallelStream().forEach(System.out::print);
		
		//the main diff in stream and parallel stream is that stream will work in order way
		//where parallel stream will be give o/p has undorder.
		
		list.parallelStream().collect(Collectors.toList()).forEach(e->System.out.println(e));
	}

}
