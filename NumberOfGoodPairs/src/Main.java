import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,12};
		int b[]= {2,4};
		System.out.println(numberOfGoodPairs(a, b, 3));

	}

	static int numberOfGoodPairs(int a[], int b[], int k) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]%(k*b[j])==0) {
					c++;
				}
			}
		}
		return c;
	}

}
