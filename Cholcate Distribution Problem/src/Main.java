import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int a[]= {7,3,1,8,9,12,56};
		int m=3;
		System.out.println(getDiff(a, m));
		int b[]= {1,2,4,5};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}
	
	static int getDiff(int a[],int m) {
		if(m>a.length) {
			return -1;
		}
		Arrays.sort(a);
		int res=Integer.MAX_VALUE;
		for(int i=0;(i+m-1)<a.length;i++)
			res=Math.min(res, Math.abs(a[i+m-1]-a[i]));
		return res;
		
	}
	

}
