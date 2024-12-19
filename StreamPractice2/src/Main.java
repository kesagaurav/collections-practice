import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(8);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(9);
		System.out.println("sorting items in asc order");
		list.stream().sorted().forEach(e->System.out.println(e));
		
		System.out.println("sorting items in desc order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
		
		System.out.println("sorting items in any order");
		list.stream().sorted(Comparator.comparing((a)->a)).forEach(e->System.out.println(e));
	
		System.out.println("sorting items in any order2");
		list.stream().sorted(Comparator.comparing(a->a, Comparator.naturalOrder())).forEach(e->System.out.println(e));
		
		System.out.println("sorting items in reverse order using comparator function");
		list.stream().sorted(Comparator.comparing(a->a, Comparator.reverseOrder())).forEach(e->System.out.println(e));
		//10,9,8,5,3,2
		System.out.println("--------------");
		Function<String, Integer> s=(a)->a.length();
		System.out.println(s.apply("gaurav"));
		//System.out.println(s);
		
		Function<Integer,Integer> a=b->b*10+10;
		System.out.println(a.apply(20));
		
		Function<Integer,String> a1=b->b%2==0 ? "even":"odd";
		System.out.println("odd aned even using functions " + a1.apply(20));
		
		
		Function<Integer,String> a2=b->b%2==0 ? "even":"odd";
		System.out.println("odd aned even using functions " + a2.apply(21));
		
		
	}

}
