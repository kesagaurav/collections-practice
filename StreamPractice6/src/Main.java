import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.stream().sorted(Comparator.comparing(a->a)).collect(Collectors.toList()).forEach(e->System.out.println(e));
		list.stream().sorted(Comparator.comparing(a->a,Comparator.reverseOrder())).collect(Collectors.toList()).forEach(e->System.out.println(e));
		List<String> list2=Arrays.asList("gaurav","john","zack");
		String s="gaurav123**&^%%%$$";
		s.chars().mapToObj(a->(char)a).filter(Character::isLetter).forEach(e->System.out.println(e));

		List<Integer> list3=new LinkedList<>();
		list3.add(1);
		
		
		String[] s1={"gaurav","gaurav","deeepa","kesa"};
		System.out.println("distinct elemenest in string");
		Arrays.toString(s1).chars().distinct().mapToObj(a->(char)a).forEach(e->System.out.println(e));
		
		String s2="gaurav";
		String s3[]=s2.split(",");
		for(String s4:s3) {
			System.out.println(s4);
		}
		
		for(String s6:s3) {
			System.out.println(s6.charAt(0));
		}
			
	
	}

}
