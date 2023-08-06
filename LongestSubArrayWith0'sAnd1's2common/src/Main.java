import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = {0, 1, 0, 1, 1, 1, 1};
		int a2[] = {1, 1, 1, 1, 1, 0, 1};
		int n=a1.length;

		System.out.println(LongestSubArrayWith1And0(a1,a2,n));
		System.out.println(LongestSubArrayWith1And0Effcient(a1,a2,n));


	}

	public static int LongestSubArrayWith1And0(int a1[],int a2[],int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			int c0 = 0, c1 = 0;
			for (int j = i; j < n; j++) {
				c0+=a1[j];
				c1+=a2[j];
				if(c0==c1) {
					res=Math.max(res,j-i+1);
				}
			}
		}
		return res;
	}
	
	
	
	
	public static int LongestSubArrayWith1And0Effcient(int a1[],int a2[],int n) {
		int res = 0;
		HashMap<Integer,Integer> hs=new HashMap<>();
		int sum=0;
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			sum+=arr[i];
			
			if(sum==0) {
				res=i+1;
			}
			if(hs.containsKey(sum)) {
				res=Math.max(sum, i-hs.get(sum));
			}else {
				hs.put(sum, i);
			}
		}
		
		return res;
	}
	
	
	
	
	
	

}
