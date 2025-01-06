import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("abc", 30, "female", "IT"));
		list.add(new Employee("abc1", 25, "male", "IT"));
		list.add(new Employee("abc2", 30, "male", "HR"));
		list.add(new Employee("abc3", 28, "female", "HR"));
		
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(a->a.getDept(),Collectors.counting()));
		System.out.println("dept count is " + collect);
		
		Map<Object, Double> collect2=	list.stream().collect(Collectors.groupingBy(a->a.getGender(),Collectors.averagingInt(a->a.getAge())));
		System.out.println("\n male avg is " + collect2);
		
		Double collect3 = list.stream().filter(a->a.getGender().equals("male")).collect(Collectors.averagingInt(a->a.getAge()));
		System.out.println("\n male avg2 is " + collect3);
		
		
		
		Double collect4 = list.stream().filter(a->a.getGender().equals("female")).collect(Collectors.averagingInt(a->a.getAge()));
		System.out.println("\n female avg2 is " + collect4);
		
		
		//even nos
		List<Integer> list2=Arrays.asList(1,2,3,4,5,6,6,6,3,3,2,2);
		list2.stream().filter(a->a%2==0).forEach(e->System.out.print(e + " "));
		Map<Integer,Long> map3=list2.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
		map3.entrySet().stream().filter(a->a.getValue()>1).forEach(e->System.out.print("\n " + e + " "));
		//sort the list in desc order
		System.out.println("\n ele in desc order");
		list2.stream().sorted(Comparator.reverseOrder()).distinct().forEach(e->System.out.print(e + " "));

		
		
		String str="CloudTech";
		str=str.toLowerCase();
		System.out.println("\n lower case " + str.toLowerCase());
		StringBuilder sb=new StringBuilder(str);
		sb.toString().toLowerCase();
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='c') {
				sb.deleteCharAt(i);
			}
		}
		System.out.println("\n after removing c the value is " + sb.toString());
		
		
		int arr1[]= {1,2,5,4,7,8,11,20};
		int arr2[]=new int[arr1.length];
		Map<Boolean, List<Integer>> collect5 = Arrays.stream(arr1).boxed().collect(Collectors.partitioningBy(a->a%2==0));
		System.out.println("\n the value is " + collect5);
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				arr2[index]=arr1[i];
				index++;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2!=0) {
				arr2[index]=arr1[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + " ");
		}
		
	}
	
	

}
