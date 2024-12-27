import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "gaurav", 43000.0, "DSE", "good"));
		empList.add(new Employee(2, "deepa", 60000.0, "SP", "verygood"));
		empList.add(new Employee(3, "omkar", 45000.0, "Pathology", "good"));
		empList.add(new Employee(4, "saikiran", 100000.0, "Partner", "verygood"));
		empList.add(new Employee(5, "arun", 23000.0, "SE", "good"));
		empList.add(new Employee(6, "john", 50000.0, "DSE", "good"));
		empList.stream().forEach(e->System.out.println(e));
		System.out.println("\n employeess with good appresial");
		empList.stream().filter(e->!e.getAppersial().contains("verygood")).forEach(e->System.out.println(e));
		System.out.println("\n employeess with Designation DSE");
		empList.stream().filter(a->a.getDesignation().equals("DSE")).forEach(e->System.out.println(e));
		System.out.println("\n employeess with Salrly greaterthan 23000");
		empList.stream().filter(a->a.getSalarly()>23000).forEach(e->System.out.println(e));
		System.out.println("\n employeess with name and there salaries");
	Map<String, List<Double>> multimap=empList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.mapping(Employee::getSalarly,Collectors.toList())));
	System.out.println(multimap);
	System.out.println("\n employeess with name and there Ids");
	Map<String,Integer> nameId=empList.stream().collect(Collectors.toMap(Employee::getName,Employee::getId));
	System.out.println(nameId);
	System.out.println("\n average salrly for all");
	Double salarly=empList.stream().filter(a->a.getSalarly()<100000).collect(Collectors.averagingDouble(a->a.getSalarly()));
	System.out.println(salarly);
	System.out.println("employee starting wilth P and D");
	empList.stream().filter(a->a.getDesignation().startsWith("P") || a.getDesignation().startsWith("D")).forEach(e->System.out.println(e));
	System.out.println("employee starting wilth E and P");
	empList.stream().filter(a->a.getDesignation().endsWith("P") || a.getDesignation().endsWith("E")).forEach(e->System.out.println(e));
   System.out.println("\n any match of dse " + empList.stream().anyMatch(a->a.getDesignation().contains("DSE")));
   System.out.println("\n any match of dse " + empList.stream().allMatch(a->a.getDesignation().contains("DSE")));
   empList.stream().filter(a->a.getAppersial().contains("good")&&!a.getAppersial().contains("verygood")).forEach(e->System.out.println(e));
 long count=  empList.stream().map(a->a.getSalarly()).mapToDouble(a->a.doubleValue()).count();
		System.out.println(count);
	double b=	empList.stream().collect(Collectors.averagingDouble(a->a.getSalarly()));
		System.out.println("avg of all salarly is " + b);
	double ids=empList.stream().collect(Collectors.averagingInt(a->a.getId()));
	System.out.println(" ids avgs is " + ids);
	List<Long> a=new ArrayList<>();
	a.add(123L);
	a.add(23L);
	a.add(231L);
	a.add(90L);
	a.add(103L);
	a.add(230L);
	double b1=a.stream().collect(Collectors.averagingLong(c->c.longValue()));
	System.out.println("long is " + b1);
long count1=	a.stream().collect(Collectors.counting());
System.out.println("count of long num is " + count1);
	
	}

}
