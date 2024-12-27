import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Gaurav {

	public static void main(String[] args) {

		Consumer<Integer> consum=(t)->{
			System.out.println("printing " + t);
		};
		consum.accept(10);
		
		Supplier<Integer> sub=()->{
			return 10;
		};
		System.out.println(sub.get());
		
		Supplier<List<Integer>> list=()->{
			List<Integer> list2=new ArrayList<>();
			list2.add(1);
			list2.add(2);
			list2.add(3);
			list2.add(4);
			return list2;
		};
		list.get().forEach(e->System.out.println(e));
		Supplier<String> s=()->{
			return "gaurav";
		};
		System.out.println(s.get());
		
		Predicate<Integer> p=(t)->{
			if(t>0) {
				return true;
			}else {
				return false;
			}
		};
		p.test(10);
		Arrays.asList(1,2,3,4,5,6,7).stream().map(a->a.intValue()).filter(a->a%2==0).forEach(e->System.out.println(e));
		
	}

}
