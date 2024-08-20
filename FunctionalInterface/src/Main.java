import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Gaurav g=new Gaurav() {
//			
//			@Override
//			public int add(int a, int b) {
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//		};
		int x=3,y=3;
		Gaurav g=(a,b)->{ return a+b;};
		System.out.println(g.add(2, 3));
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(5);
		List<Integer> iList=list.stream().collect(Collectors.toList());
		System.out.println(iList);
		
		Set<Integer> iSet=list.stream().collect(Collectors.toSet());
		System.out.println(iSet);
		
		Double avg=list.stream().collect(Collectors.averagingInt(a->a.intValue()));
		System.out.println(avg);
		
		Set<Integer> collect = list.stream().map(a->a*2).collect(Collectors.toSet());
		System.out.println(collect);
		
		Collections.reverse(iList);
		System.out.println(iList);
		
		HashMap<String,Integer> map=new HashMap<>();
//		map.put("g", 1);
//		map.put("a", 2);
//		map.put("b", 3);
//		list.stream().collect(Collectors.toMap(a->a.intValue(), a->a.floatValue()));
//		list.stream().collect(Collectors.mapping(a->a.intValue(), Collectors.groupingBy(a->a.toString(),Collectors.toList())));

		
		long count = list.stream().distinct().count();
		System.out.println(count);
		
	
	
	}

	static int getScrabble(String word) {
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('a', 1);
		map.put('b', 1);
		map.put('c', 1);
		map.put('d', 1);
		map.put('e', 1);
		map.put('f', 1);
		map.put('g', 1);
		map.put('h', 1);
		map.put('i', 1);
		map.put('j', 1);
		map.put('k', 1);
		map.put('l', 1);
		map.put('m', 1);
		map.put('n', 1);
		map.put('o', 1);
		map.put('p', 1);
		map.put('q', 1);
		map.put('r', 1);
		map.put('s', 1);
		map.put('t', 1);
		map.put('u', 1);
		map.put('v', 1);
		map.put('w', 1);
		map.put('x', 1);
		map.put('y', 1);
		map.put('z', 1);
		return 0;

		
	}
	

}
