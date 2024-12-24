import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1)find sum of ele in list
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,1000);
		int sum = list.stream().mapToInt(a -> a).sum();
		System.out.println("sum is " + sum);
		// 2)max ele using streeams
		int max = list.stream().mapToInt(a -> a).max().getAsInt();
		System.out.println("value of max  " + max);
		int max2=list.stream().max(Comparator.comparing(a->a)).get();
		System.out.println("max2 value is " + max2);
		// 3)convert a list of strings to uppercase susing streams
		List<String> list2 = Arrays.asList("gaurav", "deepa", "kesa");
		System.out.println("list of strings to upper case using streams");
		list2.stream().map(a -> a.toUpperCase()).collect(Collectors.toList()).forEach(e -> System.out.print(e + " "));
		//4)write an program to count the no of strings that starts with specific character.
		List<String> list3=Arrays.asList("cherry","banana","coconut","barrey","cantaloupe");
		long count=list3.stream().filter(a->a.startsWith("c")).count();
		System.out.println("count values are " + count);
		long count1=list3.stream().filter(a->a.startsWith("b")).count();
		System.out.println("\n count values are b " + count1);
		//write an progrma using eceb bis of strings using streams.
		List<Integer> list4=Arrays.asList(1,2,3,4,5,6);
		list4.stream().filter(a->a%2==0).forEach(e->System.out.print(e + "  "));
		long count3=list4.stream().filter(a->a%2==0).count();
		System.out.println("\n even no count is " + count3);
		//program to find all the floating point nos usig streams.
		List<Float> list5=Arrays.asList(1F,2F,3F,4F);
		double avg=list5.stream().mapToDouble(a->a.floatValue()).average().getAsDouble();
		System.out.println("avg is " + avg);
		//how to conconcatnate all the strings in streams.
		System.out.println("concatenate using string and streasm");
		list3.stream().map(a->a.concat("-")).forEach(e->System.out.print(e + ""));
		String collect = list3.stream().collect(Collectors.joining("-"));
		System.out.println("\n 2nd way of joing is " + collect);
		//remove duplicate ele from the list.
		List<String> list6=Arrays.asList("gaurav","kesa","gaurav","gaurav","deepa");
		list6.stream().distinct().forEach(e->System.out.println(e + " "));
		//check of all the ele in the list is statisfying the all conditions.
		List<Integer> list7=Arrays.asList(2,4,6,8,10,13);
		boolean val=list7.stream().allMatch(a->a%2==0);
		System.out.println("the val is  " + val);
		boolean val1=list7.stream().anyMatch(a->a%2==0);
		System.out.println("the val is  " + val1);
	
	
	
	
	
	
	
	}

}
