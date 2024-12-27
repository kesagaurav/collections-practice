import java.util.*;
public class Main {

	public static void main(String[] args) {
		int n=2932;
		List<Integer> list=new ArrayList<>();
		list.add(n);
		System.out.println(list);
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		int temp = 0,temp1=0;
		int[] c= {2,9,3,2};
		for(int i=0;i<c.length/2;i++) {
			 temp=c[i];
			System.out.println(temp);
			temp1=c[i+1];
			System.out.println(temp1);
			
		}
	
		
	}

}
