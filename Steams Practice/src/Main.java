import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String   s="gaurav";
		String str=s.replace("a","r");
		System.out.println(str);
		
		List<String> list=Arrays.asList("gaurav","deepa");
		List<String> collect = list.stream().map(x->x.replaceAll("deepa", "")).collect(Collectors.toList());
		System.out.println(collect);
		long count=collect.stream().count();
		System.out.println(count);
		collect.stream().map(a->a.replace(",", ""));
		System.out.println(collect);		System.out.println(count);


	}

}
