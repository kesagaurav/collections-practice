import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> list = new ArrayList<>();
		list.add(new Order(1, "laptop", 300000));
		list.add(new Order(2, "watch", 3000));
		list.add(new Order(3, "Tv", 400000));
		list.add(new Order(4, "refigirator", 100000));
		list.add(new Order(5, "rice cooker", 500000));
		list.forEach(e -> System.out.println(e));
		Map<Integer, List<String>> list1 = list.stream().collect(Collectors.groupingBy(a -> a.getOrderid(),
				Collectors.mapping(a -> a.getOrderName(), Collectors.toList())));

		System.out.println(list1);

		Map<String, List<Double>> list2 = list.stream().collect(Collectors.groupingBy(a -> a.getOrderName(),
				Collectors.mapping(a -> a.getAmount(), Collectors.toList())));

		System.out.println(list2);

	}

}
