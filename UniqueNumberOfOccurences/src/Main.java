import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2};
		System.out.println(uniqueNumberOfOccur(a));

	}
	
	static boolean uniqueNumberOfOccur(int a[]) {
		HashMap<Integer,Integer> map=new HashMap<>();
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			if(set.contains(entry.getValue())) {
//				return flag;
//			}else {
//				set.add(entry.getValue());
//				flag=true;
//			}
//			
//		}
//		return flag;
		  HashSet<Integer> set = new HashSet<>();
	        for (Integer count : map.values()) {
	            if (set.contains(count)) {
	                return false;
	            }
	            set.add(count);
	        }

	        return true;
	}

}
