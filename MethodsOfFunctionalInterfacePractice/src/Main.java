import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

	}

}
