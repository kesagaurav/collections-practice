import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,3,1,5,-6,6,2,2};
		int sum=4;
		System.out.println(LongestSubArrayWithGivenSum(a, sum));
	}
	
	public static int LongestSubArrayWithGivenSum(int a[],int sum) {
		int prefix_sum=0;
		int res=0;
		Map<Integer,Integer> hs=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			prefix_sum+=a[i];
			if(prefix_sum==sum) {
				res=i+1;
			}
			if(hs.containsKey(prefix_sum)==false) {
				hs.put(prefix_sum, i);
			}
			
			if(hs.containsKey(prefix_sum-sum)) {
				res=Math.max(res, i-hs.get(prefix_sum-sum));
			}
		}
		return res;
	}

}
