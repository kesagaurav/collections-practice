import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		Student s=new Student();
		List<Student> stuList=new ArrayList<>();
		stuList.add(new Student(1, "gaurav", 100));
		stuList.add(new Student(2, "sai", 97));
		stuList.add(new Student(3, "joe", 98));
		stuList.add(new Student(4, "bane", 98));
		stuList.add(new Student(5, "watson", 100));
		stuList.add(new Student(6, "rahul", 97));
		stuList.forEach(e->System.out.println(e));
		System.out.println("map functions");
		Map<String,List<Integer>> mapList=stuList.stream().collect(Collectors.groupingBy(a->a.getName(),Collectors.mapping(Student::getMarks, Collectors.toList())));
		for (Map.Entry<String, List<Integer>> entry : mapList.entrySet()) {
			 String key = entry.getKey();
			List<Integer> val = entry.getValue();
			System.out.println("key is " + key + "and value is " + val);
		}
		Map<Integer,Long> collect = stuList.stream().collect(Collectors.groupingBy(a->a.getMarks(),Collectors.mapping(a->a.getMarks(), Collectors.counting())));
		
		List<String> ab=new ArrayList<>();
		ab.add("gaurav");
		ab.add("sukesh");
		ab.add("gaurav");
		ab.add("gaurav");
		ab.add("sukesh");
		ab.add("bharat");
		
		System.out.println(" the frequeny of gaurav is " + Collections.frequency(ab, "gaurav"));
		System.out.println("frequency for sukesh is " + Collections.frequency(ab,"sukesh"));
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//int frequency = Collections.frequency(list, 1);
		//System.out.println(frequency);
		/*
		 * Integer[] arr = new Integer[list.size()]; arr=list.toArray(arr); for (Integer
		 * integer : arr) { System.out.println(integer); }
		 */
		int[] array = list.stream().mapToInt(i->i).toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

}
