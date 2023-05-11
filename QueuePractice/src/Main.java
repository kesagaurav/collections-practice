import java.util.*;
public class Main {

	public static void main(String[] args) {
		Queue<Integer> qi=new LinkedList<Integer>();
		qi.add(1);
		qi.add(2);
		qi.add(3);
		qi.add(4);
		Integer[] q1=new Integer[qi.size()];
		Integer[] q2=qi.toArray(q1);
		for(int i=0;i<q2.length;i++) {
			System.out.println(q2[i]);
		}
		
		
		
	}

}
