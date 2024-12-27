import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		System.out.println(list);
		list.stream().skip(1).forEach(e->System.out.println(e));
		long count=list.stream().count();
		System.out.println("value " + count);
		HashMap<Integer,Integer> map=new HashMap<>(list.size());
		for(int i=0;i<list.size();i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);
		}
		System.out.println(map);
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<list.size();i++) {
			set.add(list.get(i));
		}
		System.out.println(set + " " + set.size());
	}

}
