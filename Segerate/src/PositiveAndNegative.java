import java.util.Arrays;
import java.util.Collections;

public class PositiveAndNegative {

	public static void main(String[] args) {

		int a[]= {15,-3,-2,18};
		System.out.println(segPartioning(a));
		
		
	}
	
	public static int segPartioning(int a[]) {
		int i=0;

		for(int j=1;j<a.length;j++) {
			if(a[i]<0) {
				i++;
				int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				
			}
		}
		return a.length;
		
		
		 
		
	}
	
	

}
