import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "kesa", "gaurav", "m", 27));
		list.add(new Employee(2, "kesa2", "deepa", "f", 53));
		list.add(new Employee(3, "john", "wick", "m", 9));
		list.add(new Employee(4, "tony", "stark", "f", 18));
		list.add(new Employee(5, "black", "widow", "f", 2));
		list.add(new Employee(6, "apple", "ok", "m", 2));
		list.add(new Employee(7, "samsung", "galaxy", "f", 21));
		list.add(new Employee(8, "vivo", "blue", "f", 100));

		System.out.println("sorted based on age");
		list.stream().filter(a->a.getAge()>18).collect(Collectors.toList()).forEach(e->System.out.println(e));

		System.out.println("sorting in asec order");
		list.stream().sorted(Comparator.comparing(Employee::getFname)).forEach(e->System.out.println(e));
		
		System.out.println("sorting in dsec order");
		list.stream().sorted(Comparator.comparing(Employee::getFname,Comparator.reverseOrder())).forEach(e->System.out.println(e));

		int sum=list.stream().mapToInt(a->a.getEid()).sum();
		System.out.println(sum);
		
		double avg=list.stream().collect(Collectors.averagingInt(a->a.getAge()));
		System.out.println("avg double is " + avg);
//		
//		Map<String, String> collect = list.stream().collect(Collectors.toMap(a->a.getGender(), a->a.getFname()));
//		System.out.println("map2 si  " + collect);
		
//		Map<String, List<Integer>> collect = list.stream().collect(Collectors.mapping(a->a.getFname(), Collectors.groupingBy(Employee::getAge, Collectors.toList())));
//		System.out.println("value is " + collect);
		
		list.stream().filter(a->a.getFname().startsWith("k")).forEach(e->System.out.println(e));
		
	}

}
