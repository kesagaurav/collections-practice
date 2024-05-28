import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c=a->System.out.println(10);
		c.accept(10);
		String s1="deepa";
		Supplier<String> s=()->{
			if(s1.contains("gaurav")) {
				return "yes";
			}else {
				return "no";
			}
		};
		System.out.println(s.get());
		String s2="deepa";
		Predicate<String> p=t->{
			if(s2.contains(t)) {
				return true;
			}else {
				return false;
			}
		};
		System.out.println(p.test("deepa"));
		
		System.out.println("p2------------");
		Predicate<String> p1=t->{
			if(t.contains("gaurav")) {
				return true;
			}else {
				return false;
			}
		};
		System.out.println(p.test("gaurav"));
		
		
		Function<String, Integer> f=x->x.length();
		System.out.println(f.apply("gaurav"));

	}

}
