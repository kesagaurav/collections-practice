import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,15,20,25,30,50};
		int b[]= {30,5,15,80};
		
		int c[]= {10,20};
		int d[]= {20,30};
		//using an brute force.
//		for (int i = 0; i < a.length; i++) {
//			for(int j=0;j<b.length;j++) {
//				if(a[i]==b[j]) {
//					System.out.printf(" " +  a[i]);
//				}
//			}
//		}
		
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < d.length; j++) {
//				if(c[i]==c[j]) {
//					System.out.printf(" " +  c[i]);
//
//				}
//			}
//		}
		//efficient solution 
		HashSet<Integer> set=new HashSet<>();
		for(int j=0;j<b.length;j++) {
			set.add(b[j]);
		}
		for (int i = 0; i < a.length; i++) {
			if(set.contains(a[i])) {
				System.out.printf(" " +  a[i]);
			}
		}
		
		
		//System.out.println(set);
	}

}
