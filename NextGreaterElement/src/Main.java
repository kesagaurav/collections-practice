
public class Main {

	public static void main(String[] args) {

		int a[]= {15,10,18,12,4,6,2,8};
		for(int i=1;i<a.length;i++) {
			int j;
			for( j=i-1;j>=a.length-1;j--) {
				if(a[j]>a[i]) {
					System.out.println(a[j]);
					break;
				}
			}
			if(j==-1) {
				System.out.println(-1);
			}
		}
		
	}

}
