import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("gaurav", 1500);
		map.put("gaurav1", 1800);
		map.put("deepa", 1200);
		map.put("deepa2", 1201);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.println(e));
		System.out.println("even values in map");
		map.entrySet().stream().filter(a -> a.getValue() % 2 == 0).forEach(e -> System.out.println(e));

		System.out.println("odd values in map");
		map.entrySet().stream().filter(a -> a.getValue() % 2 != 0).forEach(e -> System.out.println(e));
		System.out.println("starts with g and ends with v");
		map.entrySet().stream().filter(a -> a.getKey().startsWith("g") && a.getKey().endsWith("v"))
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));

		System.out.println("avg using maps values");
		double value = map.entrySet().stream().collect(Collectors.averagingDouble(a -> a.getValue()));
		System.out.println("avg is " + value);

		int sum = map.entrySet().stream().mapToInt(a -> a.getValue()).sum();
		System.out.println("sum value is " + sum);

		System.out.println("mul value is ");
		map.entrySet().stream().mapToInt(a -> a.getValue() * a.getValue()).forEach(a -> System.out.println(a));

		System.out.println("div value is");
		map.entrySet().stream().mapToInt(a -> a.getValue() / a.getValue()).forEach(a -> System.out.println(a));

		System.out.println("limit value si");
		map.entrySet().stream().mapToInt(a -> a.getValue()).limit(1).forEach(e -> System.out.println(e));

		System.out.println("skip value is");
		map.entrySet().stream().map(a -> a.getValue()).skip(1).forEach(e -> System.out.println(e));// 1500,1201
		System.out.println("sorting the values based on key");
		map.entrySet().stream().map(a -> a.getKey()).sorted().collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("sorting the values based on value");
		map.entrySet().stream().map(a -> a.getValue()).sorted().collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("some sample cases using mpa");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		Entry<String, Integer> maxEntry = map.entrySet().stream()
				.collect(Collectors.maxBy(Comparator.comparing(a -> a.getValue()))).get();

		System.out.println("max val is " + maxEntry);

		Entry<String, Integer> minEntry = map.entrySet().stream()
				.collect(Collectors.minBy(Comparator.comparing(a -> a.getValue()))).get();

		System.out.println("min val is " + minEntry);
		System.out.println("second highest from the value");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).skip(1).findFirst()
				.ifPresent(a -> System.out.println("val is present" + a));

		Map<String, Integer> map1 = Map.of("gaurav", 1, "deepa", 2, "ksp", 3, "iphone", 5);
		System.out.println("using mapof method is  " + map1);
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.println(e));
		Entry<String, Integer> entry = map1.entrySet().stream().findAny().get();
		System.out.println("find first " + entry);
		System.out.println("comparing the value");
		Optional<Entry<String, Integer>> findFirst = map1.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparing(a -> a))).skip(1).findFirst();
		System.out.println(findFirst);
		Entry<String, Integer> entry2 = map1.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
		System.out.println(" value in dexc order " + entry2);

		System.out.println("prefix starts with d");
		map.entrySet().stream().filter(a->a.getKey().startsWith("d")).forEach(e->System.out.println(e));
		
		System.out.println("sufix starts with v");
		map.entrySet().stream().filter(a->a.getKey().endsWith("v")).forEach(e->System.out.println(e));
		
		System.out.println("test using map");
		Stream<String> flatMap = map.entrySet().stream().flatMap(a->a.getKey().lines());
		System.out.println(flatMap);
		
		int size = map.entrySet().size();
		System.out.println(size);
		
		int sum2=map.values().stream().mapToInt(a->a).sum();
		System.out.println("sum2 with new mwthod " + sum2);
		
		map.values().stream().mapToInt(a->a*a).forEach(e->System.out.println(e));
		
		map.keySet().stream().filter(a->!a.startsWith("g")).filter(a->!a.endsWith("v")).forEach(e->System.out.println(e));
		
		System.out.println(map);
		
		map.values().stream().sorted(Comparator.comparing(a->a)).collect(Collectors.toList()).forEach(e->System.out.println(e));
	
		//Integer remove = map.remove("gaurav");
		//System.out.println(remove);
		System.out.println(map);
		//map.clear();
		int sum4=map.values().stream().reduce((a,b)->a+b).get();
		System.out.println("sum4 value is " + sum4);
		
		int mul4=map.values().stream().reduce((a,b)->a*b).get();
		System.out.println("mul values is " + mul4);
		
		map.values().stream().mapToInt(a->a*a).forEach(e->System.out.println(e));
		
	}
}
