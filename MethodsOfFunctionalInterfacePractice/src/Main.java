import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c = (a) -> {
			System.out.println(10);
		};
		c.accept(10);

		Supplier<Integer> s = () -> {
			return 100;
		};
		System.out.println(s.get());

		Function<Integer, Integer> f = x -> x * 10;
		System.out.println(" function " + f.apply(100));
		System.out.println("predicate is");
		Predicate<Integer> p = (a) -> {
			if (a > 100) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(p.test(300));

		Employee e = new Employee(1, "gaurav", 70000.00);
		Consumer<Employee> e1 = s1 -> s1.setName("gaurav1");
		e1.accept(e);
		System.out.println(e.getName());
		Supplier<Double> s2 = () -> {
			return e.getSalary();
		};
		System.out.println(s2.get());
		Predicate<Employee> id = x -> x.getName().contains("gaurav1");
		System.out.println(id.test(e));
		Function<Integer, String> f1 = x -> x * 10 + " i am ok ";
		System.out.println(f1.apply(200));
		Sample s3=()->{
			System.out.println("this is show method");
		};
		s3.show();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.stream().map(a->a*10).collect(Collectors.toList());
		System.out.println(list);
	}

}

