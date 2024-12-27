import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1, 1);
		map.put(0, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		for(int i=0;i<map.size();i++) {
			map.put(i,map.get(i));
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println( entry.getKey() + " " + entry.getValue());
			
		}
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		boolean hasNext = list.stream().iterator().hasNext();
		System.out.println(hasNext);
		ListIterator<Integer> list1=list.listIterator();
		list1.next();
		System.out.println(list1.toString());
	
		String str="gaurav";
		String str1="gaurav";
		System.out.println(str + " " + str1);
		int a[]= {10,20,20,10,30};//10,10,20,20,30//10->2,20->2,30->1
		System.out.println(unSortedArray(a));


	}
	
	
	static int unSortedArray(int a[]) {
		HashMap<Integer,Integer> map=new HashMap<>();
		HashSet<Integer> set=new HashSet<>();
		//Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
				map.put(a[i], map.getOrDefault(a[i], 0)+1);
			
		}
//		int c=0,sum=0;
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//		
//			System.out.println(entry.getKey() + "  " + entry.getValue());
//			if(entry.getValue()==1) {
//				c++;
//			}
			for(int i=0;i<a.length;i++) {
				set.add(a[i]);
			
		}
			return map.size();
	}

}
