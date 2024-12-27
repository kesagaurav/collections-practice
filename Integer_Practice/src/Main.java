import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=9;
		System.out.println(i.toBinaryString(i));
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.stream().map(a->a.toBinaryString(a)).forEach(e->System.out.printf(" " +  e));
		list.stream().map(a->a.toString().valueOf(a).startsWith("1")&&a.toString().valueOf(a).endsWith("0")).forEach(e->System.out.println(" " + e));
	}

}
