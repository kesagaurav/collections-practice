import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,10,30,30,20};
		int b[]= {20,20,30,40,10};
		System.out.println(intersectionOfTwoArrays(a, b));
	}
	
	static int intersectionOfTwoArrays(int a[],int b[]) {
		HashSet<Integer> set=new HashSet<>();
		int c=0;
		for(int i=0;i<a.length;i++) {
				set.add(a[i]);
			
		}
		for(int i=0;i<b.length;i++) {
			if(set.contains(b[i])) {
				c++;
				set.remove(a[i]);
			}
		}
		return c;
	}

}
