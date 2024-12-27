import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int LongestSubArrayWithGivenSum(int a[],int sum) {
		HashMap<Integer,Integer> hs=new HashMap<>();
		int prefix_sum=0,res=0;
		for(int i=0;i<a.length;i++) {
			prefix_sum+=a[i];
			if(prefix_sum==sum) {
				res=i+1;
			}
			if(((Object) hs).contains()) {
				hs.put(a[i], 1);
			}
			if(hs.)
		}
	}

}
