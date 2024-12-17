import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "gaurav", 123456.00));
		list.add(new Employee(2, "gaurav1", 45678.00));
		list.add(new Employee(3, "gaurav2", 98191.00));
		list.add(new Employee(4, "gaurav3", 1234567.00));
		list.add(new Employee(5, "gaurav4", 1234569.00));

		list.stream().forEach(e->System.out.println(e));
		
		Consumer<Integer> con=(a)->{
			System.out.println( " value is " + a);
		};
		con.accept(10);
		
		Consumer<String> con2=(a)->{
			System.out.println( " value is " + a);
		};
		con2.accept("gaurav");
		
		Consumer<Double> con3=(a)->{
			System.out.println( " value is " + a);
		};
		con3.accept(1.980);
		
		
		Function<Integer, Integer> it=a->a*10;
		System.out.println(" value is " + it.apply(10));
		
		Function<String, Integer> it1=a->a.length();
		System.out.println(" value is " + it1.apply("gaurav"));
		
		Function<Double, Integer> it2=a->10;
		System.out.println(" value is " + it2.apply((double) 20));
		
		
		Function<String, String> it3=a->"Hello,my nmae is gaurav welcome to the world of java";
		System.out.println(" value is " + it3.apply(it3.toString()));
		
		Function<Double, Double> it4=a->a*(int)10;
		System.out.println(" value of double is " + it2.apply((double) 10));
		
		Supplier<String> s=()->{
			return "gaurav";
		};
		System.out.println(" value is  "+ s.get());
		
		
		Supplier<Boolean> s1=()->{
			int age=17;
			if(age>=18) {
				return true;
			}
			return false;
		};
		
		System.out.println(" value is  "+ s1.get());
		
		
		Supplier<String> s2=()->{
			String s3="gauravkesa";
			if(s3.length()<10 || !s3.isEmpty()) {
				return "yes";
			}else if(s3.length()<10) {
				return "no";
			}
			return "no";
		};
		System.out.println(" value is  "+ s2.get());
		
		Predicate<Integer> p=(a)->{
			//int major=18;
			if(a>=18) {
				return true;
			}
			return false;
		};
		System.out.println(" value is " + p.test(1));
		
		
		
		
		Predicate<String> p1=(a)->{
			//int major=18;
			if(a.length()>=6) {
				return true;
			}
			return false;
		};
		System.out.println(" value is " + p1.test("kesagaurav"));
		
		
		
		Map<String, Double> collect = list.stream().collect(Collectors.toMap(a->a.getName(), b->b.getAmount()));
		System.out.println(collect);
		
		
		Long collect2 = list.stream().collect(Collectors.mapping(a->a.getName(), Collectors.counting()));
		System.out.println(collect2);
		
		double avg=list.stream().collect(Collectors.averagingDouble(a->a.getAmount()));
		System.out.println(avg);
		
		Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getAmount));
		System.out.println("max amount is " + max);
		
		
		Optional<Employee> min = list.stream().min(Comparator.comparing(Employee::getAmount));
		System.out.println("min amount is " + min);
		
		
		long count=list.stream().count();
		System.out.println(count);
		
		list.stream().distinct().forEach(e->System.out.println(e));
		
		
		List<String> list1=new ArrayList<>();
		list1.add("gaurav");
		list1.add("deepa");
		list1.add("omkar");
		boolean anyMatch = list1.stream().anyMatch(a->a.contains("gaurav123"));
		System.out.println(anyMatch);
		
		Optional<String> findFirst = list1.stream().findFirst();
		System.out.println(findFirst);
		
		
		Optional<String> findLast = list1.stream().findAny().filter(a->a.contains("k"));
		System.out.println(findLast);
		
		List<Employee> list2 = list;
		Integer collect3 = list2.stream().collect(Collectors.summingInt(a->(int)a.getAmount()));
		System.out.println("sum is " + collect3);
		
		Integer collect4=list.stream().collect(Collectors.summingInt(a->a.getId()));
		System.out.println(collect4);
		
		List<Integer> list4=Arrays.asList(1,2,3,4,5,6,7,8);
		Integer findFirst2 = list4.stream().mapToInt(Integer::intValue).sum();
		System.out.println("find first is " + findFirst2);
		
	}
}
