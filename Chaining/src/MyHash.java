import java.util.*;
public class MyHash {
private static int b;
static ArrayList<LinkedList<Integer>> ar;
public MyHash(int b) {
	
	this.b = b;
	ar=new ArrayList<LinkedList<Integer>>();
	for(int i=0;i<b;i++) {
		ar.add(new LinkedList<>());
	}
	
}


public static void insert(int key) {
	 int a=key%b;
	 System.out.println(ar.get(key).add(a));
	
	
}

public static boolean search(int key) {
	int i=key%b;
	return ar.get(i).contains(key);
}

public static void delete(int key) {
	int i=key%b;
	ar.get(i).remove((Integer)i);
}

}
