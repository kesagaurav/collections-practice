import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1, "gaurav", 43464.0));
		empList.add(new Employee(2,"deepa",32000.0));
		empList.add(new Employee(3,"omkar",45000.0));
		empList.add(new Employee(4, "sai", 90464.0));
		empList.add(new Employee(5,"rama",50000.0));
		empList.add(new Employee(6,"sri",30000.0));
		empList.forEach(e->System.out.println(e));
		
		System.out.println("==================================");
		
		
		Map<String,List<Double>> namedou=empList.stream().collect(Collectors.groupingBy(a->a.getName(),Collectors.mapping(a->a.getSalarly(), Collectors.toList())));
		System.out.println("names with respective salarly");
		System.out.println(namedou);
		
		double average=empList.stream().collect(Collectors.averagingDouble(a->a.getSalarly()));
		System.out.println("============ averageing all the salaries==============");
		System.out.println(average);
		
		Consumer<Integer> cons=(t)->{
			System.out.println("printing " + t);
		};
		cons.accept(10);
		
		Supplier<String> names=()->{
			return "gaurav";
		};
		System.out.println(names.get());
		
		
		Predicate<String> pd=(t)->t.equals("gaurav"); 
			
	
		System.out.println(pd.test("gaurav"));
		System.out.println("the name contains gaurav or not");
		
    empList.stream().findAny().ifPresent(a->a.getName().contains("gaurav"));
		
	
	}

}
