import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,10,20,10,15,15,5};
		int c=1;
		int i;
//		for( i=0;i<a.length;i++) {
//			boolean flag=false;
//			for(int j=i+1;i<a.length;i++) {
//				if(a[i]==a[j]) {
////					c++;
////					System.out.println(a[i] + " " + c);
//					flag=true;
//					break;
//				}
////				else {
////					c=1;
////					System.out.println(a[i] + " " + c);
////
////				}
//				if(flag==true)
//					continue;
//				for()
//				
//			}
//		}
		boolean[] visted=new boolean[a.length];
		Arrays.fill(visted, false);
		for(i=0;i<a.length;i++) {
			if(visted[i]==true) {
				continue;
			}
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					visted[j]=true;
					c++;
				}
			}
			System.out.println(a[i] + " " + c);
			
		}
		
		
		//using an efficient approach
		System.out.println("efficient appraoch");
		HashMap<Integer,Integer> hmap=new LinkedHashMap();
		for(int b=0;b<a.length;b++) {
			hmap.put(a[b], hmap.getOrDefault(a[b], 0)+1);
		}
		//System.out.println(hmap);
		for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
			
		}
		

	}

}
