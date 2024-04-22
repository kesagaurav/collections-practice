
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,4,8,3};
		int left[]=new int[a.length];
		int ans[]=new int[a.length];
		for(int i=1;i<a.length-1;i++) {
			left[i]=left[i-1]+a[i-1];
			
		}
		int right[]=new int[a.length];
		for(int i=a.length-2;i>=0;i--) {
			right[i]=right[i+1]+a[i+1];
		}
		
		
		for(int i=0;i<a.length;i++) {
			ans[i]=Math.abs(left[i]-right[i]);
			System.out.println(ans);

		}


	}

}
