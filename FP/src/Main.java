import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.stream().map(a->a%2==0).forEach(e->System.out.println(e));
		
		List<String> list1=new ArrayList<>();
		list1.add("gaurav");
		list1.add("deepa");
		list1.add("raju");
		list1.add("mom");
		Optional<String> reduce = list1.stream().reduce((a,b)->a.length()>b.length() ? a : b);
		System.out.println(reduce);
	}

}
