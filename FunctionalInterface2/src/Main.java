import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bus> busList = new ArrayList<>();
		busList.add(new Bus(1, "orangetravels", "gaurav", 1, 2500.00));
		busList.add(new Bus(2, "morningstartravels", "deepa", 2, 2500.00));
		busList.add(new Bus(3, "tsrtctravels", "omkar", 3, 2800.00));
		busList.add(new Bus(4, "ksrtctravels", "amal", 4, 10000.00));
		busList.add(new Bus(5, "orangetravels", "gaurav1", 2, 5000.00));
		busList.add(new Bus(6, "morningstartravels", "gaurav2", 3, 2500.00));
		Collections.sort(busList, (Bus b1, Bus b2) -> {
			Double d1 = b1.getAmount();
			Double d2 = b2.getAmount();
			return d2.compareTo(d1);

		});
		System.out.println(busList);

		busList.stream().filter(a -> a.getTravelName().contains("orangetravels")).forEach(e -> System.out.println(e));
		long count = busList.stream().filter(a -> a.getTravelName().contains("morningstartravels")).count();
		System.out.println(count);
		busList.stream().filter(a -> a.getTravelName().contains("orangetravels")).map(a -> a.getAmount())
				.forEach(e -> System.out.println(e));
		Map<String, Double> hm = busList.stream().collect(Collectors.toMap(a -> a.getPassName(), a -> a.getAmount()));
		System.out.println(hm);
		System.out.println("list without orange travels");
		busList.stream().filter(a -> !a.getTravelName().contains("orangetravels")).forEach(e -> System.out.println(e));

		HashMap<Integer, Integer> hm1 = new HashMap<>();
		hm1.put(1, 1);
		System.out.println(busList.stream().collect(Collectors.groupingBy(a -> a.getPassName(),
				Collectors.mapping(a -> a.getTravelName(), Collectors.toList()))));
		boolean match = busList.stream().anyMatch(a -> a.getTravelName().contains("orangetravels"));
		System.out.println(match);
		boolean allMatch = busList.stream().allMatch(a -> a.getTravelName().contains("orangetravels"));
		System.out.println(allMatch);
		busList.stream().filter(a->a.getTravelName().contains("orangetravles")).distinct().forEach(e->System.out.println(e));
		

	}

}
