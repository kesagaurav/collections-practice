import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
	System.out.println(sumOfUnique(a));

	}
	static int sumOfUnique(int a[]) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int c=0;
		for(int i=0;i<a.length;i++) {
			map.put(a[i], map.getOrDefault(a[i],0)+1);
			
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if(entry.getValue()==1) {
				c+=entry.getKey();
			}
			
		}
		return c;
	}
}
