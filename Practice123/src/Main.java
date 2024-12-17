import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> person=new ArrayList<>();
		person.add(new Person(98, "gaurav"));
		person.add(new Person(94, "gaurav1"));
		person.add(new Person(95, "gaurav2"));
		List<Person> collect = person.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		 System.out.println(collect);
		
		


	}

}
