import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtraction a1= (x,y)->{
			return x-y;
		};
		System.out.println(a1.sub(20, 10));
		
		a1.isDefault();
		Subtraction.iamStatic();
		
		List<String> list=Arrays.asList("abc","def","ghi");
		list.stream().sorted(Comparator.comparing(a->a)).
		collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		System.out.println("in reverse order");
		list.stream().sorted(Comparator.reverseOrder()).
		collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		list.stream().sorted(Comparator.comparing(a->a, Comparator.reverseOrder())).
		collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
		

	}

}
