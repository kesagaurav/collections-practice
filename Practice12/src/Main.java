import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gaurav";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);

		}

		List<String> list = Arrays.asList("gaurav", "abc", "kjesa", "raju", "ron", "gaurav1", "gaurav2","gaurav");
		//list.stream().filter(a -> !a.startsWith("ga")).forEach(e -> System.out.println(e));
		//list.spliterator().trySplit().forEachRemaining(a -> System.out.println(a));
	long a=list.spliterator().estimateSize();
	System.out.println(a);
	int b=list.spliterator().DISTINCT;
	System.out.println(" distinct ele/nos are --->  " + b);
	int c=list.spliterator().characteristics();
	System.out.println(c);
//	Comparator<String> reversed = (Comparator<String>) list.spliterator().getComparator().reversed();
//	System.out.println(reversed);
	System.out.println("\n -----------------------------------------");
	list.spliterator().forEachRemaining(a1->System.out.println(a1));
	
	
	
	String s2="gauravv";
	HashSet<Character> set=new HashSet<>();
	for(int i=0;i<s2.length()-1;i++) {
		for(int j=i+1;j<s2.length()-1;j++) {
			if(s.charAt(i)==s.charAt(j)) {
				System.out.println(s.charAt(i));
			}
		}
	}
	System.out.println(set);
	
	
	List<Integer> list1=Arrays.asList(1,2,3,4,5);
	
	HashMap<Integer,Integer> map1=new HashMap<>();
	
	
	for(Integer i:list1) {
	 System.out.println(map1.put(i, i));
	}
		

	}

}
