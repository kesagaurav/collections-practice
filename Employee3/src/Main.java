import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "gaurav", 100000.0, "bangalore"));
		list.add(new Employee(2, "deepa", 200000.0, "war"));
		list.add(new Employee(3, "gaurav", 300000.0, "bangalore"));
		list.add(new Employee(4, "gaurav", 400000.0, "war"));
		list.add(new Employee(5, "gaurav", 500000.0, "bangalore"));
		list.add(new Employee(6, "omkar", 100000.0, "hyd"));
		list.stream().forEach(e -> System.out.println(e));
		System.out.println("salary is of 1000000 ");
		list.stream().filter(a -> a.getSalary() == 100000.0).forEach(e -> System.out.println(e));
		list.stream().map(a -> a.getLoc().equals("bangalore")).forEach(e -> System.out.println(e));
		System.out.println("without any duplicate values");
		Set<Employee> collect = list.stream().filter(a->!a.getLoc().equals("bangalore")).collect(Collectors.toSet());
		System.out.println(collect);
		Double collect2 = list.stream().collect(Collectors.averagingDouble(a->a.getSalary()));
		System.out.println(collect2);
		list.stream().collect(Collectors.)
	}

}
