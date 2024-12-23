import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "kesa", "gaurav", 26, 'm', 8));
		list.add(new Student(2, "john", "sam", 18, 'm', 3));
		list.add(new Student(3, "max", "muler", 10, 'm', 2));
		list.add(new Student(4, "swasthik", "k", 5, 'm', 4));
		list.add(new Student(5, "akshay", "smith", 2, 'm', 11));
		list.add(new Student(6, "kesa5", "deepa", 30, 'f', 9));
		list.add(new Student(7, "kesa1", "rani", 55, 'f', 6));
		list.add(new Student(8, "kesa2", "kanu", 90, 'f', 9));
		list.add(new Student(9, "kesa3", "suryaprakash", 50, 'm', 15));
		// map of key cannot be duplicates
		System.out.println("printing all the lists");
		list.stream().forEach(e -> System.out.println(e));
		System.out.println("sorting based on age in asc order");
		list.stream().map(a -> a.getAge()).sorted(Comparator.comparing(a -> a)).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("sorting based on age is greater than 18");
		list.stream().filter(a -> a.getAge() > 18).forEach(e -> System.out.println(e));
		System.out.println("sorting based on age greater than 2nd oprtion");
		list.stream().filter(a -> a.getAge() > 18).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("sorting based on rating in asc order");
		list.stream().map(a -> a.getRating()).sorted(Comparator.comparing(a -> a)).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("sorting based on rating in asc order 2");
		list.stream().map(a -> a.getRating()).sorted(Comparator.comparing(a -> a, Comparator.reverseOrder()))
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));

		System.out.println("want only female candiates");
		list.stream().filter(a -> a.getGender() == 'f').collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("person first name starting with K");
		list.stream().filter(a -> a.getFirstName().startsWith("k")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("person first name starting with K and ends with H");
		list.stream().filter(a -> a.getFirstName().startsWith("k") && a.getLastName().endsWith("h"))
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));

		Map<String, String> collect = list.stream()
				.collect(Collectors.toMap(a -> a.getFirstName(), a -> a.getLastName()));
		System.out.println(collect);

		Map<String, List<Character>> collect2 = list.stream().collect(Collectors.groupingBy(a -> a.getFirstName(),
				Collectors.mapping(a -> a.getGender(), Collectors.toList())));
		System.out.println(collect2);

		System.out.println("person rating and its name");
		list.stream().filter(a -> a.getAge() > 18).map(a -> a.getFirstName()).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("person id in desc order");
		list.stream().sorted(Comparator.comparing(Student::getSid, Comparator.reverseOrder()))
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));

		boolean anuMathc = list.stream().allMatch(a -> a.getFirstName().equals("kesa"));
		System.out.println(anuMathc);
		Double li=list.stream().collect(Collectors.averagingInt(a->a.getRating()));
		System.out.println(li);
		
		List<String> list2=Arrays.asList("hello world");
		StringBuilder sb=new StringBuilder();
		list2.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
	
	}

}
