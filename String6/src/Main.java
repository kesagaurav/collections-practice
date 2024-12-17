import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gaurav";
		HashMap<Character, String> s1 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			s1.put(s.charAt(i), s);
		}
		for (Map.Entry<Character, String> entry : s1.entrySet()) {
			Character key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " " + val);

		}

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		list.forEach(e -> System.out.println(e));
//		list.stream().anyMatch(a->1);
		list.stream().allMatch(a -> a > 0);
		list.stream().distinct().count();
		list.stream().count();
		list.stream().findFirst();
//		list.stream().flatMapToInt(null).flatMap(null).flatMap(null).flatMap(null).flatMap(null)

		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(8);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		List<Integer> collect = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println(collect);
		Optional<Integer> a = numbers.stream().skip(2).findFirst();
		System.out.println(a);
		Optional<Integer> ab = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("second largest is " + ab);
		Optional<Integer> ab2 = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(4).findFirst();
		System.out.println("fifth largest is " + ab2);
		int max = numbers.stream().reduce((x, y) -> x > y ? x : y).get();
		System.out.println(max);
		System.out.println("creating a div of streams");
		numbers.stream().map(b -> b / b).forEach(e -> System.out.println(e));
		long count = numbers.stream().distinct().count();
		System.out.println(count);

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		map.put(6, 6);

		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if (key % 2 == 0) {
				System.out.println("even " + key);
			} else {
				System.out.println("odd " + key);

			}

		}
		
		int max2=numbers.stream().mapToInt(b->b).summaryStatistics().getMax();
		System.out.println("first largest number " + max2);
		int max3=numbers.stream().mapToInt(b->b).summaryStatistics().getMax()-1;
		System.out.println("second largest number " + max3);
		int a1[]= {1,2,3,4,5};
		int asInt = Arrays.stream(a1).max().getAsInt();
		System.out.println(asInt);
		double a4=numbers.stream().mapToDouble(a3->a3).summaryStatistics().getAverage();
		System.out.println("avg is " + a4);
		numbers.stream().skip(4).forEach(e->System.out.println(e));
	}

}
