import java.util.*;
public class Main {
static List<Employee> employee=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1, "guarav", "DSE"));
		empList.add(new Employee(2, "keerrthana", "DSE"));
		empList.add(new Employee(3, "apkesha", "Associate Consultant"));
		empList.add(new Employee(4, "jhanavi", "Associate Consultant"));
		add(empList);
		


	}
	
	public static  void add(List<? extends Employee> list) {
		for(Employee e:list) {
			System.out.println(e);
		}
		
	}

}


