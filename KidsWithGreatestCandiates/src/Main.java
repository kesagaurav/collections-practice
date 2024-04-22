import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,1,12};
		int extraCandiates=10;
		System.out.println(KidsWithCandiates(a, extraCandiates));

	}
	
	
	public static List<Boolean> KidsWithCandiates(int a[],int extraCandiates){
		int max=Integer.MIN_VALUE;
		List<Boolean> result=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			max=Math.max(max, a[i]);
			if(a[i]+extraCandiates>=max) {
				result.add(true);
			}else {
				result.add(false);
			}
		}
		return result;
	}

}
