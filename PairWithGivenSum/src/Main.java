import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,8,15,-8};
		int x=17;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==x)
				System.out.println(a[i] + " its index is " + i + a[j] + "val is "+ j);
			}
		}
		System.out.println(isPair(a, x));
		
	}
	
	public static boolean isPair(int a[],int x) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(set.contains(x-a[i])) {
				return true;
			}else {
				set.add(a[i]);
			}
		}
		return false;
	}

}
