
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {30,10,8,2};
		System.out.println(getMaximum(a));
		System.out.println(getMaximum1(a));

	}
	
	
	public static int getMaximum(int a[]) {
		int res=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(j>i) {
				int b=a[j]-a[i];
				res=Math.max(res, b);
			}
			}
		}
		return res;
		
	}
	
	
	public static int getMaximum1(int a[]) {
		int res=Integer.MIN_VALUE;
		int minval=a[0];
		
			for(int j=1;j<a.length;j++) {
				res=Math.max(res, a[j]-minval);
				minval=Math.min(minval, a[j]);
			}
	
		return res;
		
	}

}
