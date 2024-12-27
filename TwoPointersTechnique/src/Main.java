
public class Main {

	public static void main(String[] args) {

		int a[]= {4,5,6,7,8,9};
		int diff=2;
		System.out.println(arthimeticTriplets(a, diff));
	}

	
	public static int arthimeticTriplets(int a[],int diff) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=i+2;k<a.length;k++) {
					if(a[j]-a[i]==diff && a[k]-a[j]==diff) {
						c++;
					}
				}
			}
		}
		return c;
	}
}
