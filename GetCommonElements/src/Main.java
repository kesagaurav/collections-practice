import  java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 1, 2, 3, 5 ,4};
		int b[] = { 1, 1, 2, 2, 3, 4, 5 };

//		for (int i =0; i <a.length-1; i++) {
//			if (a[i] != a[i + 1]) {
//				System.out.println(a[i]);
//			}
//		}
//		System.out.println("b array is");
//		for (int i = 0; i < b.length - 1; i++) {
//			if (b[i] != b[i + 1]) {
//				System.out.println(b[i]);
//			}
//		}
		HashSet<Integer> set=new HashSet<>();
		for (int i =0; i <a.length; i++) {
			set.add(a[i]);
					
		}
		
		for (int i = 0; i < b.length; i++) {
			if(set.contains(b[i])) {
				set.add(b[i]);
			}
		}
		System.out.println(set);
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i],1);
			}
		}
		
		for(int i=0;i<b.length;i++) {
			if(map.containsKey(b[i])) {
				System.out.println(b[i]);
			}
		}
		
		System.out.println(map);
		
	}

}
