import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "gaurav", "war", 50000.00));
		list.add(new Employee(2, "deepa", "hyd", 520000.00));
		list.add(new Employee(3, "jack", "ban", 530000.00));
		list.add(new Employee(4, "omesh", "us", 50000.00));
		list.add(new Employee(5, "jeeva", "greek", 520000.00));
		list.forEach(e->System.out.println(e));
		
		List<Employee> collect = list.stream().filter(a->a.getName().equals("gaurav")).collect(Collectors.toList());
		System.out.println(collect);
		
		Map<String, String> collect2 = list.stream().collect(Collectors.toMap(a->a.getLoc(), a->a.getName()));
		System.out.println(collect2);
		
		double avg=list.stream().collect(Collectors.averagingDouble(a->a.getSalary()));
		System.out.println("value of avg is " + avg);
		
		double count=list.stream().collect(Collectors.counting());
		System.out.println("count is  " + count);
		
		Map<String, List<Employee>> collect3 = list.stream().collect(Collectors.groupingBy(a->a.getName(),Collectors.toList()));
		System.out.println(collect3);
		
		
		Map<Double, Set<String>> collect4 = list.stream().collect(Collectors.groupingBy(a->a.getSalary(),Collectors.mapping(a->a.getLoc(), Collectors.toSet())));
		System.out.println(collect4);
		
		Map<String,List<String>> collect5=list.stream().collect(Collectors.groupingBy(a->a.getName(),Collectors.mapping(a->a.getLoc(), Collectors.toList())));
		System.out.println(collect5);
		
		
		
	}

}
