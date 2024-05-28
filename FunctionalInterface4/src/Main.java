import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c=g->System.out.println("gaurav");
		c.accept("gaurav");
		Supplier<String> s=()->{
			return "gauravkesa";
		};
		System.out.println(s.get());
		Predicate<String> p=t->{
			if(t.contains("gaurav")) {
				return true;
			}else {
				return false;
			}
		};
		System.out.println(p.test("deepa"));
		
		Function<Integer, Integer> aq=t->t/100;
		System.out.println(aq.apply(200));
		

	}

}
