import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<>();
		list1.add("gaurav");
		list1.add("kesa1");
		list1.add("ok");
		list1.add("ok2");
		boolean bool=list1.stream().anyMatch(a->!a.contains("gaurav"));
		System.out.println(bool);
		list1.stream().forEach(a->System.out.println(a));
		boolean bool2=list1.stream().allMatch(a->a.contains("ok1"));
		System.out.println(bool2);
		long count=list1.stream().count();
		System.out.println(count);
		

	}

}
