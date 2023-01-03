import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		int a[]= {9,8,7,6,5,4};
		System.out.println(a.length-2);
		for(int i=0;i<a.length-1;i++) {
			System.out.printf(" " + a[i]);
		}
		//selectionSort(a);
		insertionSort(a);
	}
	
	public static void selectionSort(int a[]) {
		int temp=0;
		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("final array is");
		for (int i=0;i<a.length;i++) {

			System.out.printf(" " + a[i]);
		}
	}
	
	
	public static void insertionSort(int a[]) {
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}else {
					break;
				}
			}
		}
	}
}
