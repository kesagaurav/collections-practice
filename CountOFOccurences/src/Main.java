import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="olly olly in come free";
		HashMap<String,Integer> hmap=new HashMap<>();
		String ar[]=s.split("");
		System.out.println( "coming form s " + s);
//		for(int i=0;i<ar.length;i++) {
//			if(!hmap.containsKey(ar[i])) {
//				hmap.put(s, 1);
//			}else {
//				hmap.put(s, hmap.get(ar[i])+1);
//			}
//		}
		for(String word:ar) {
			if(!hmap.containsKey(word)) {
				hmap.put(word, 1);
			}else {
				hmap.put(word, hmap.get(word)+1);
			}
		}
		System.out.println(hmap);

//		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
//			String key = entry.getKey();
//			Integer val = entry.getValue();
//			System.out.println(entry);
//		}
		
		HashMap<String,Integer> hmap1=new HashMap<>();
		hmap1.put("g", 1);
		hmap1.put("d", 1);
		hmap1.put("o", 2);
		hmap1.put("o", 3);
		for(int i=0;i<hmap1.size();i++) {
			if(hmap1.containsKey(hmap1.get(i))) {
				hmap1.put(hmap1.toString(), hmap1.get(hmap1)+1);
			}else {
				hmap1.put(hmap1.toString(), 1);
			}
		}
		
		System.out.println(hmap1);
		
		Long collect = hmap.entrySet().stream().map(a->a.getValue()).collect(Collectors.counting());
		System.out.println( "value is " + collect);
	

	}

}
