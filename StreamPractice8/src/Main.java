import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(6, 1, 3, 4, 7, 2, 9, 8);
		list.stream().sorted().collect(Collectors.toList()).forEach(e -> System.out.print(e + " "));
		System.out.println("\n sorting the values in desc order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
		Optional<Integer> findFirst = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("\n second highest value is " + findFirst);
		Optional<Integer> findSec = list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		System.out.println("\n second highest value is " + findSec);
		int sum = list.stream().mapToInt(a -> a).sum();
		System.out.println("the sum values are " + sum);
		System.out.println("sq of values are ");
		list.stream().mapToInt(a -> a * a).forEach(e -> System.out.print(e + " "));
		int max=list.stream().map(a->a).collect(Collectors.maxBy(Comparator.comparing(a->a))).get();
		System.out.println("\n max val is " + max);
		int min=list.stream().map(a->a).collect(Collectors.minBy(Comparator.comparing(a->a))).get();
		System.out.println("min val is " + min);
		
		int max2=list.stream().mapToInt(a->a).max().getAsInt();
		System.out.println("max2 value is " + max2);
		
		int min2=list.stream().mapToInt(a->a).min().getAsInt();
		System.out.println("max2 value is " + min2);
		
		
		
		

	}

}
