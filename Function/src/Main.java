import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> ft=i->i*2;
		System.out.println(ft.apply(2));
		
		Predicate<Integer> p=i->i<18;
		System.out.println(p.test(20));
		
		Supplier<Integer> s=()->{
			return 20;
		};
		System.out.println(s.get());
		
//		Consumer<Integer> cu=(10)->{
//			
//		};
//		cu.accept();
		
		
	}

}
