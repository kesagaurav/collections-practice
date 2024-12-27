import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f=i -> 2*i;
		System.out.println(f.apply(10));
		String s1="gaurav";
		Supplier<String> s=()->"abc";
		System.out.println(s.get());
		int i1=9;
		Supplier<Integer> i=()->10*i1;
		System.out.println(i.get());
		Predicate<Integer> i2=i3 -> {
			return i3<10;
					};
					System.out.println(i2.test(11));
					
					
		Predicate<String> i4=i5->{
			return i5.equals("gaurav");
		};
		System.out.println(i4.test("deepa"));
		
		Function<Integer, String> a3=a4->"abc";
		System.out.println(a3.apply(10));
		
		Function<Character, Character> a5=a6->'a';
		System.out.println(a5.apply('b'));
					
		

	}

}
