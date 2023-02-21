
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2, 8, 3, 9, 6, 5, 4};
		int ps[]=new int[a.length];
		ps[0]=a[0];
		for(int i=1;i<a.length;i++)
			ps[i]=ps[i-1]+a[i];
		System.out.println(getSum(a, 1,3));

	}

	
	public static int getSum(int a[],int l,int r) {
		if(l==0) {
			return a[r];
		}
		return a[r]-a[l-1];
	}
}
