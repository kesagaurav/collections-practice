import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,8,-3,6};
		int pair=3;
		System.out.println(pairWithGivenSum2(a, pair));
		
		

	}
	
	
	public static boolean pairWithGivenSum(int a[],int pair) {
		boolean flag=false;
		for (int i = 0; i < a.length-1; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==pair) {
					flag=true;
				}
			}
		}
		return flag;
	}
	
	
	
	public static boolean pairWithGivenSum2(int a[],int pair) {
		boolean flag=false;
		HashSet<Integer> set=new HashSet<>();
		for (int i :a) {
			if(set.contains(pair-i)) {
				flag=true;
			}else {
				set.add(i);
			}
		}
		return flag;
	}

}
