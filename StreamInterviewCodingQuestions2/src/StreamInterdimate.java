import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamInterdimate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1)given a sentence,print all the frequncy of each words
		String s = "hello my name is gaurav";
		Map<String, Long> map = Arrays.stream(s.split("\\s+"))
				.collect(Collectors.groupingBy(a -> a.toLowerCase(), Collectors.counting()));
		System.out.println("count is " + map);

		// 2)Given list of integers start all the nos starts with 1.
		List<Integer> list = Arrays.asList(1, 12, 13, 14, 22, 121, 1221, 20, 90, 0001);
		System.out.println("stats with number 1");
		list.stream().map(a -> String.valueOf(a)).filter(a -> a.startsWith("1"))
				.forEach(e -> System.out.print(e + " "));

		// 3)given list of names,group them by there first letter and print the count no
		// of names in each group.
		String[] names = { "Alice", "charlie", "bob", "bill", "Any", "Anna" };
		Map<Character, Long> count = Arrays.stream(names).map(a -> a.toString())
				.collect(Collectors.groupingBy(a -> a.charAt(0), Collectors.counting()));
		System.out.println("\n the values is " + count);
		//4) find and print duplicates if it contain duplicates then print
		int a[] = { 2, 4, 2, 3, 3, 78, 1, 1, 5, 5, 5, 5 };
		System.out.println("the values are");
		Arrays.stream(a).boxed().collect(Collectors.groupingBy(a1 -> a1, Collectors.counting())).entrySet().stream()
				.filter(a1 -> a1.getValue() > 1).forEach(e -> System.out.print(e + " "));
		//5)removing duplicates
		int a1[] = { 2, 4, 2, 3, 3, 78, 1, 1, 5, 5, 5, 5 };
		System.out.println("\n removing duplicates");
		Arrays.stream(a1).boxed().distinct().forEach(e -> System.out.print(e + " "));

		//6) given an list of words print the palindroms in list.
		List<String> list2 = List.of("world", "level", "deed", "radar", "hello");
		System.out.println("\n palindrom lists are");
		List<String> collect = list2.stream().filter(str -> str.equals(new StringBuilder(str).reverse().toString()))
				.collect(Collectors.toList());
		System.out.println(collect);
		
		//7)how do u mereg 2 soretd arrays.
		int a3[]= {1,2,3,4,90};
		int b[]= {5,6,7,8,100};
		int c[] = IntStream.concat(Arrays.stream(a3), Arrays.stream(b)).sorted().toArray();
		System.out.println(Arrays.toString(c));
		
		//8)given list of stings concat them and remove duplicates.
		List<String> list3=Arrays.asList("banana","kiwi","apple","orange");
		List<String> list4=Arrays.asList("banana","orange","grape","apple");
		System.out.println("concat using sytreasm lists");
		Stream.concat(list3.stream(), list4.stream()).distinct().forEach(e->System.out.print(e + " "));
		
		//9)given an list onf strings sotr the lenght in ase order.
		List<String> list5=Arrays.asList("Mango","apple","banana","kiwi","hip","pineapple");
		System.out.println("\n values are soretd based on the lenght");
		//list5.stream().sorted(Comparator.comparing(str->str.toString().length())).collect(Collectors.toList()).forEach(e->System.out.print(e + " "));
		list5.stream().sorted(Comparator.comparingInt(str->str.length())).collect(Collectors.toList()).forEach(e->System.out.print(e + " "));
		
		 //12.Partition a list of numbers into two groups: even and odd, using a custom predicate.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect2 = numbers1.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("\n " + collect2);
        
        //Find the squares of the first three even numbers in a list
        System.out.println("first 3 evne nos in list");
        numbers1.stream().map(d->d*d).filter(e->e%2==0).limit(3).forEach(e->System.out.print(e + " "));
        
     // 14. Flatten a list of lists

        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        System.out.println("\n values of flatten list of lists are");
        listOfLists.stream().flatMap(f->f.stream()).forEach(e->System.out.print(e + " "));
        
        
        System.out.println("first 3 sum nos in list");
       int sum3= numbers1.stream().mapToInt(d->d).limit(3).sum();
       System.out.println("anthor mehtod " + sum3);
       
       
       System.out.println("first 3 sq nos in list");
        numbers1.stream().mapToDouble(d->Math.sqrt(d)).limit(3).forEach(e->System.out.print(e + " "));
      
        String s1="121";
        System.out.println("palindrome is");
        s1.chars().boxed().filter(s2->s2.equals(new StringBuilder(s2).reverse().toString())).forEach(e->System.out.print(e + " "));
       
        
	}

}
