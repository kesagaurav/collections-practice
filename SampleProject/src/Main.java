import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0, y=0;
		Addtion c=(a,b)-> {
			return a+b;
		};
		System.out.println(c.add(2, 3));
		
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.stream().filter(a->a%2==0).forEach(e->System.out.println(e));
		
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
