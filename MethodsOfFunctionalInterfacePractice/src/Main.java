import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c = (a) -> {
			System.out.println(10);
		};
		c.accept(10);

		Supplier<Integer> s = () -> {
			return 100;
		};
		System.out.println(s.get());

		Function<Integer, Integer> f = x -> x * 10;
		System.out.println(" function " + f.apply(100));
		System.out.println("predicate is");
		Predicate<Integer> p = (a) -> {
			if (a > 100) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(p.test(300));

		Employee e = new Employee(1, "gaurav", 70000.00);
		Consumer<Employee> e1 = s1 -> s1.setName("gaurav1");
		e1.accept(e);
		System.out.println(e.getName());
		Supplier<Double> s2 = () -> {
			return e.getSalary();
		};
		System.out.println(s2.get());
		Predicate<Employee> id = x -> x.getName().contains("gaurav1");
		System.out.println(id.test(e));
		Function<Integer, String> f1 = x -> x * 10 + " i am ok ";
		System.out.println(f1.apply(200));
		Sample s3 = () -> {
			System.out.println("this is show method");
		};
		s3.show();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.stream().map(a -> a * 10).collect(Collectors.toList());
		System.out.println(list);

		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 1);
		hm.put(null, null);
		hm.put(2, 2);
		// hm.put(null, 2);
		System.out.println(hm);

		Map<Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder());
		tm.put(1, 1);
		// tm.put(null, null);//in treemap key cannot be null and values can be null
		tm.put(2, 2);
		tm.put(3, null);
		tm.put(4, null);
		System.out.println(tm);
		System.out.println(" keys is " + tm.keySet());
		System.out.println(" value is " + tm.values());
		System.out.println("iterating using hashset()");
		Set<Integer> set = tm.keySet();
		for (Integer integer : set) {
			System.out.println("key is " + integer + " and value is  " + tm.get(integer));
		}
		Set<Integer> ste2 = new HashSet<>();
		ste2.add(2);
		Map<Integer, Integer> hm1 = new HashMap<>();
		hm1.put(10, 10);
		hm1.put(3, 3);
		hm1.put(98, 98);
		hm1.put(null, 2);
		hm1.put(76, null);
//		for (Map.Entry<Integer, Integer> entry : hm1.entrySet()) {
//			if (entry.getKey() == null || entry.getValue() == null || entry.getKey() % 10 == 0) {
//				hm1.remove(entry.getKey());
//			}
//
//		}
		System.out.println(hm);
		Iterator<Entry<Integer, Integer>> it = hm1.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Integer> map = it.next();//read and post increment
			if (map.getKey() == null || map.getValue() == null || map.getKey() % 10 == 0) {
				it.remove();
			}

		}
		System.out.println(hm1);
		
		String s31="gaurav";
		ArrayList<String> st=new ArrayList<>(s31.length());
		for(int i=0;i<st.size();i++) {
//			if(st.get(i).charAt(i)=='a' || st.get(i).charAt(i)=='e' || st.get(i).charAt(i)=='i' || st.get(i).charAt(i)=='o' || st.get(i).charAt(i)=='u') {
//				System.out.println(st.get(i).charAt(i));
//			}
			System.out.println(st.get(i).charAt(i));
		}
		

	}

}
