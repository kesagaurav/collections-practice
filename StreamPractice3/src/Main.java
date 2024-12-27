import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(8);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.stream().forEach(e -> System.out.println(e));
		// comparing using 2 inbuild methods
		// 1)using comparing only one method.
		System.out.println("after comparing the values are");
		list.stream().sorted(Comparator.comparingInt(a -> a)).forEach(e -> System.out.println(e));
		// 2)using the comparator with 2 methods.
		System.out.println("after comparing the values are reverse order");
		list.stream().sorted(Comparator.comparing(a -> a, Comparator.reverseOrder()))
				.forEach(e -> System.out.println(e));

		// 3)using the comparator with 2 methods.using natural order
		System.out.println("after comparing the values are natural order");
		list.stream().sorted(Comparator.comparing(a -> a, Comparator.naturalOrder()))
				.forEach(e -> System.out.println(e));
		
		System.out.println("after comparing the values are null first");
		list.stream().sorted(Comparator.comparing(a -> a, Comparator.nullsFirst(null)))
				.forEach(e -> System.out.println(e));
		
		
		List<String> list1=new ArrayList<>();
		list1.add(null);
		list1.add("gaurav");
		list1.add("deepa");
		list1.add("phantom");
		list1.add(null);
		//list1.stream().forEach(e->System.out.println(e));
		list1.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder())).forEach(e->System.out.println(e));
		System.out.println("\n last null check");
		list1.stream().sorted(Comparator.nullsLast(Comparator.comparing(a->a))).forEach(e->System.out.println("\t" + e));
	}

}
