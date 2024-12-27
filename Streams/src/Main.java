import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1,"gaurav", "DSE", 43464.0, "IT"));
		empList.add(new Employee(2, "deepa","SE", 23464.0, "Business"));
		empList.add(new Employee(3, "Omkar","Pathology", 90464.0, "Pathology"));
		empList.add(new Employee(4, "niraj","DEVELOPER", 100464.0, "IT"));
		empList.add(new Employee(5, "surya","SE", 10000.0, "Business"));
		empList.add(new Employee(6, "suresh","SP", 93464.0, "ECE"));
		empList.add(new Employee(7, "rama","SP", 90464.0, "IT"));
		empList.forEach(e->System.out.println(e));
	Map<String,List<String>> named=empList.stream().collect(Collectors.groupingBy(a->a.getName(),Collectors.mapping(a->a.getDesignation(), Collectors.toList())));
	System.out.println(named);
	Map<Integer,List<Employee>> named1=empList.stream().collect(Collectors.groupingBy(a->a.getId()));
		System.out.println(named1);
	empList.stream().map(a->a.getDesignation()).filter(a->a.contains("SP")).forEach(e->System.out.println(e));	
	}

}
