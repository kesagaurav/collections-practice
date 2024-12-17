import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "gaurav", 1));
		list.add(new Employee(2, "gaurav1", 2));
		list.add(new Employee(3, "gaurav2", 3));
		list.add(new Employee(4, "gaurav3", 4));
		list.add(new Employee(5, "gaurav4", 5));
		list.forEach(e->System.out.println(e));
		
		


	}

}
