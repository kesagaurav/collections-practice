import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a[]= {10,15,20,25,30,50}; int b[]= {30,5,15,18};
		 */
		int a[] = { 10, 30 ,10 ,40 };
		int b[] = { 40,5,10,15 };
		HashSet<Integer> set = new HashSet<>();
		System.out.println(union(a, b));
		int c[] = new int[a.length + b.length];
		//intersection
		for (int i = 0; i < b.length; i++) {
			set.add(b[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if (set.contains(a[i])) {
				set.add(a[i]);
			}
			
		}
		System.out.println(set);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}
	
	public static int union(int a[],int b[]) {
		HashSet<Integer> set = new HashSet<>();

		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
			
		}
		
		
		for(int i=0;i<b.length;i++) {
			set.add(b[i]);
			
		}
		return set.size();
		
		
	}

}
