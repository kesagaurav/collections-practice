import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Consumer<String> c=t -> System.out.println("gaurav");
		c.accept("gaurav");
		Supplier<String> s=() -> {
			return "gaurav";
		};
		System.out.println(s.get());
		Predicate<String> p=t -> {
			if(t.length()>5) {
				return true;
			}else {
				return false;
			}
		};
		System.out.println("predicate value is " + p.test("gaurav"));
		Function<Integer, Double> f=x->x.doubleValue();
		System.out.println(f.apply(2));
	}

}
