import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int a[]= {10,3,20,12};
		System.out.println( " new  " + getDiff1(a));
		System.out.println(" old " + getDiff(a));

		
	}
	
	static int getDiff(int a[]) {
		int sub=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				sub=Math.min(sub,Math.abs(a[i]-a[j]));
			}
		}
		return sub;
	}
	
	static int getDiff1(int a[]) {
		Arrays.sort(a);
		int sub=Integer.MAX_VALUE;
		for(int i=0;i<a.length-1;i++) {
				sub=Math.min(sub,Math.abs(a[i]-a[i+1]));
			
		}
		return sub;
	}

}
