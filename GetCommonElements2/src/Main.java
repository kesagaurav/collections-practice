import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<>();
		int a[] = { 1, 1, 2, 2, 2, 3, 5 };
		int b[] = { 1, 1, 1, 2, 2, 3, 5 };

		for (int val : a) {
			map.put(val,1);
		}

		for (int val : b) {
			if(map.containsKey(val)&&map.get(val)>0) {
				System.out.println(val);
				map.put(val, map.get(val)-1);
			}

		}
		System.out.println(map);

	}

}
