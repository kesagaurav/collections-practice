import java.util.*;
public class Main {

	public static void main(String[] args) {
		int a[]= {3,5,8};
		int b[]= {2,8,9,10,15};
		isUnion(a, b);
		
	}
	
	static void isUnion(int a[],int b[]) {
		int i=0,j=0,k=0;
		Set<Integer> set=new HashSet<>();
		int res[]=new int[a.length + b.length];

		
		while(i<a.length && j<b.length) {

			if (i>0 && a[i] == a[i - 1]) {

				i++;
				continue;

			}
			
			if (j>0 && b[j] == a[j - 1]) {

				j++;
				continue;

			}
			
			if(a[i]<b[j]) {
				//res[k]=a[i];
				//i++;
				//k++;
				System.out.println(a[i]);
				i++;
			}else if(a[i]>b[j]) {
				
				/*
				 * res[k]=b[j]; j++; k++;
				 */
				System.out.println(b[j]);
				j++;
				
			}else {
				System.out.println(a[i]);
				i++;
				j++;
			}
			while(i<a.length) {
				if(i>0 && a[i] != a[i - 1]) {
					System.out.println(a[i]);
					i++;
				}
			}
			
			while(j<b.length) {
				if(j>0 && b[j] != b[j - 1]) {
					System.out.println(b[j]);
					j++;
				}
			}
		}
		
		//System.out.println(Arrays.toString(res));
	}

}
