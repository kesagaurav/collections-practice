import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//git remote add origin https://github.com/kesagaurav/coding_journey.git
		Consumer<Integer> consumer=(a)->System.out.println(10);
		consumer.accept(10);
		String a="abc";
		Supplier<String> supp=()->a;
			System.out.println(supp.get());
			
			Predicate<Integer> pre= (t)->{
				if(t>10) {
					return true;
				}else {
					return false;
				}
			};
			System.out.println(pre.test(5));
			
			Function<String, Integer> d=o->o.length();
				System.out.println(d.apply("gaurav"));
	}

}
