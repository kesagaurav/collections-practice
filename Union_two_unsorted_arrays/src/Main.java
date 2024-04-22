import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,30,10};
		int b[]= {5,10,5};
		HashSet<Integer> set=new HashSet<>();
		for(int x:a)
			set.add(x);
		for (int x : b) {
			set.add(x);
		}
		System.out.println(set.size());
	}

}
