import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hmap = new HashMap<>();
		hmap.put(null, null);
		hmap.put(1, null);
		hmap.put(2, null);
		hmap.put(2, null);
		hmap.put(3, null);
		hmap.put(null, null);


		System.out.println(hmap);
		for(int i=0;i<hmap.size();i++) {
			if(hmap.containsKey(null)) {
				System.out.println(hmap.get(i));
			}
		}
		for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
			
		}
	}

}
 