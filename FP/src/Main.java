import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.stream().map(a->a%2==0).forEach(e->System.out.println(e));
		
		List<String> list1=new ArrayList<>();
		list1.add("gaurav");
		list1.add("deepa");
		list1.add("raju");
		list1.add("mom");
		Optional<String> reduce = list1.stream().reduce((a,b)->a.length()>b.length() ? a : b);
		System.out.println(reduce);
		
		
		int a[]= {20,10,20,8,12};
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[i+2]) {
				break;
			}else {
			if(a[i]>a[i+2]) {
				System.out.println( "second max is " + a[i] + " and is index is at " + i);
			}
		}
		}

		int b[]= {20,10,20,8,12};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
