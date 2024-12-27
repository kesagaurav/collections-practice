import java.util.*;
public class CollectionsSort {

	public static void main(String[] args) {
		int a1=10;
		int b=5;
		int c=Math.min(a1, b);
		System.out.println(Math.subtractExact(c, b));
		List<String> stringList=new ArrayList<>();
		stringList.add("gaurav");
		stringList.add("deepa");
		stringList.add("omkar");
		stringList.forEach(e->System.out.println(e));
		Collections.sort(stringList, Comparator.reverseOrder());
		System.out.println(stringList);
		int a[]= {2,10,8,7};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//insertion sort
		for(int i=1;i<a.length;i++) {
			int temp1=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp1) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp1;

		}
		System.out.printf("\t\n insertion algo is : ");
		for(int i=0;i<a.length;i++) {
			System.out.printf("\t " + a[i]);
		}
	}
	
}
