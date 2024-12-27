import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "gaurav", "32"));
		list.add(new Employee(2, "gaurav2", "321"));
		list.add(new Employee(3, "gaurav3", "322"));
		list.add(new Employee(4, "gaurav4", "323"));
		list.stream().map(a->String.valueOf(a.getRoolno())).forEach(e->System.out.println(e));
		Map<String,String> map=list.stream().collect(Collectors.toMap(a->a.getName(), a->a.getRoolno()));
		System.out.println(map);
		Map<String,List<Integer>> map2=list.stream().collect(Collectors.groupingBy(a->a.getName(), Collectors.mapping(Employee::getId,Collectors.toList())));
		System.out.println(map2);
	}

}
