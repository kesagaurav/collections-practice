import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40 };
		int k = 2;
		System.out.println(isMinumumPages(a, k));

	}

	public static int isMinumumPages(int a[], int k) {
		int sum = 0, max = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			max = Math.max(0,a[i]);
		}
		System.out.println(max);
		int start=max;
		int end=sum;
		int res=-1;
		System.out.println( "value of start is " + start);
		System.out.println("value of start is " + end);
		
		//int binarySearch = Arrays.binarySearch(a, k);
		while(start<=end) {
			int mid=start+end/2;
			if(isValid(a, end, k,mid)==true) {
				res=mid;
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return res;
	}
	
	public static boolean isValid(int a[],int n,int k,int mid) {
		if(n<k) {
			return false;
		}
		int student=1;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(sum>a[i]) {
				student++;
				sum=a[i];
			}
			if(student>k) {
				return false;
			}
			return true;
		}
		return false;
	}

}
