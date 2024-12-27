import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Consumer<Integer> cDemo = (t) -> {
			System.out.println("printing " + t);
		};
		cDemo.accept(10);
		Supplier<String> sDemo = () -> {

			return "gaurav";
		};
		System.out.println("sample supplier string " + sDemo.get());

		Supplier<String> sDemo3 = () -> "gaurav1";
		List<String> ga = Arrays.asList();
		System.out.println("sample supplier string " + ga.stream().findAny().orElseGet(sDemo3));

		List<String> ga1 = Arrays.asList();
		System.out.println("sample supplier string " + ga1.stream().findAny().orElseGet(() -> "hi gaurav"));

		Supplier<Integer> snum = () -> 10;

		System.out.println("sample supplier number " + snum.get());

		Supplier<List<String>> sDemo1 = () -> {
			List<String> list = Arrays.asList("gaurav", "deepa", "omkar", "vijaya", "john", "aksahy");
			System.out.println("\nprinting using List ");
			return list;
		};
		sDemo1.get().forEach(e -> System.out.println(e));

		Supplier<List<Integer>> sDemo2 = () -> {
			List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
			System.out.println(" printing using List numbers ");
			return list;
		};
		sDemo2.get().forEach(e -> System.out.println(e));

		Predicate<Integer> pd = (i) -> {
			if (i % 2 == 0) {
				return true;
			}
			return false;

		};
		System.out.println(" predicate values are " + pd.test(11));

		Predicate<Integer> pd1 = (i) -> i % 2 == 0;
		System.out.println(" predicate values are " + pd1.test(10));
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.stream().filter(pd1).forEach(e -> System.out.println(e));

		Predicate<Integer> pd2 = (i) -> i % 2 == 0;
		System.out.println(" predicate values of pd2 " + pd1.test(10));
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 24, 30);
		list1.stream().filter(i -> i % 3 == 0).forEach(e -> System.out.println(e));

		
		Function<Integer, Integer> getok=t->t+3 + t+4;
		System.out.println("functions " + getok.apply(3));
		
		Function<Integer, Integer> getok1=t->t-3 + t-4;
		System.out.println("functions " + getok1.apply(11));
		
		List<String> gaurav=Arrays.asList("gaurav","deepa","omkar");
		gaurav.stream().map(a->a.replace("deepa", "raj")).forEach(e->System.out.println(e));
		
		
		/*
		 * SupplierDemo sDemo=new SupplierDemo();
		 * System.out.println("\n sdemo values are " + sDemo.get()); SupplierDemo1
		 * sDemo1=new SupplierDemo1(); System.out.println("\n sdemo1 values are " +
		 * sDemo1.get()); PredicateDemo pDemo=new PredicateDemo();
		 * System.out.println("predicate values " + pDemo.test(2));
		 */

	}
}
