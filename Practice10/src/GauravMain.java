import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GauravMain {

	public static void main(String[] args) {

		List<Gaurav> gauList = new ArrayList<>();
		gauList.add(new Gaurav(1, "gaurav", "DSE", 43484.0));
		gauList.add(new Gaurav(2, "rama", "SE", 60000.0));
		gauList.add(new Gaurav(3, "sriram", "ASE", 45000.0));
		gauList.add(new Gaurav(4, "rohith", "DSE", 43484.0));
		gauList.add(new Gaurav(5, "pratusya", "DSE", 43484.0));
		gauList.add(new Gaurav(6, "satish", "SE", 38000.0));
		gauList.add(new Gaurav(7, "john", "ASE", 450000.0));
		gauList.forEach(e -> System.out.println(e));
		Consumer<Integer> cons = (e) -> {
			if (e % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			System.out.println("printing " + e);
		};
		cons.accept(1);

		Supplier<String> sup = () -> {
			return "gaurav";
		};
		System.out.println(sup.get());

		Predicate<Integer> pred = (e) -> {
			if (e > 10) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(pred.test(12));

		Function<String, Integer> func = (e) -> e.length();
		System.out.println(func.apply("gaurav"));
		Function<Integer, Boolean> func1 = (e) -> {
			return (e % 2 == 0 ? true : false);
		};
		System.out.println(func1.apply(10));

		System.out.println(
				" --------------- now all the operations of the list ----------------------------------------");
		Map<String, List<Double>> mapGau = gauList.stream().collect(
				Collectors.groupingBy(a -> a.getName(), Collectors.mapping(a -> a.getSalarly(), Collectors.toList())));
		System.out.println("\n the values are " + mapGau);

		double avg = gauList.stream().collect(Collectors.averagingDouble(a -> a.getSalarly()));
		System.out.println("\n the average of all salaries are " + avg);

		System.out.println("the designations with dse's");
		gauList.stream().filter(a -> a.getDesignation().contains("DSE")).forEach(e -> System.out.println(e));

		System.out.println("the designations and name");
		Map<String, List<String>> mapGau2 = gauList.stream().collect(Collectors.groupingBy(a -> a.getName(),
				Collectors.mapping(a -> a.getDesignation(), Collectors.toList())));
		System.out.println(mapGau2);

		String s = "Gaurav";
		System.out.println(Arrays.asList(s));

		String s1[] = { "ab", "c" };
		String s2[] = { "a", "bc" };
		// System.out.println(isValid(s1, s2));
		String a = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(isPanagram(a));

	}

	/*
	 * public static boolean isValid(String word1[], String word2[]) { StringBuilder
	 * sb1 = new StringBuilder(); StringBuilder sb2 = new StringBuilder(); for (int
	 * i = 0; i < word1.length; i++) { sb1.append(word1[i]); } for (int j = 0; j <
	 * word2.length; j++) { sb2.append(word2[j]); } if
	 * (sb1.toString().equals(sb2.toString())) { return true; } return false;
	 * 
	 * }
	 */

	public static boolean isPanagram(String s) {
		boolean isall = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			s = s.toLowerCase();
			if (s.contains(s.valueOf(ch))) {
			
				return true;
			}
		}
		if (isall) {
			return true;
		} else {
			return false;
		}
	}

}
