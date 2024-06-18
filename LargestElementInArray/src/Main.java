import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(11);
		list.add(20);
		list.add(100);
		list.stream().forEach(e->System.out.println(e));
		int largest=list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)>largest) {
				largest=list.get(i);
			}
		}
		System.out.println("max no is " + largest);
		
		int small=list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)<small) {
				small=list.get(i);
			}
		}
		System.out.println("min no is " + small);
		
		int a[]= {5,7,7,1,2,3};
		Arrays.sort(a);//[1,2,3,5,7,7];
		int firLargest=a[a.length-1];
		int second=0;
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]!=firLargest) {
				second=a[i];
				break;
			}
		}
		
		System.out.println("second largest is " + second);
		
		int a1[]= {1,2,7,7,7,4,5};
		System.out.println(removeDuplicates(a1));
	}
	
	public static int removeDuplicates(int a[]){
		int i=0;
		for(int j=1;j<a.length;j++) {
			if(a[i]!=a[j]) {
				a[i+1]=a[j];
				i++;
			}
		}
		return (i+1);
		
	}
	
	
	

}
