import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {

		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1, "guarav", 31000.0, "dse"));
		empList.add(new Employee(2, "deepa", 91000.0, "pp"));
		empList.add(new Employee(3, "sri", 31000.0, "ase"));
		empList.add(new Employee(4, "john", 31000.0, "dse"));
		empList.stream().forEach(e->System.out.println(e));
		Map<String,List<String>> map=empList.stream().collect(Collectors.groupingBy(e->e.getName(),Collectors.mapping(a->a.getDesignation(), Collectors.toList())));
		System.out.println(map);
		empList.stream().filter(a->a.getDesignation().contains("dse")).forEach(e->System.out.println(e));
		empList.stream().filter(a->a.getDesignation().contains("pp")).forEach(e->System.out.println(e));
		Employee[] array = (Employee[]) empList.toArray();
		System.out.println(array);
		
		
	}

}
