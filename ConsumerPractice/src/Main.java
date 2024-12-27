import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		Consumer<Integer> ab=(t)->{
			System.out.println("printing " + t);
			if(t%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}

		};
		ab.accept(10);

		Supplier<String> abc=()->{
			return "gaurav";
		};
	System.out.println(abc.get());
	
	Supplier<Integer> a=()->{
		return 10;
	};
	System.out.println("The integer value is " + a.get());
		Predicate<Integer> p=(t)->{
			if(t>0) {
				return true;
			}else {
				return false;
			}
		};
		System.out.println("\n " + p.test(-10));
	}

}
