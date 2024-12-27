import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 5, 3, 4, 3, 5, 6 };
		firstRepeated(a);
	}

	static void firstRepeated(int a[]) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			hmap.put(a[i], hmap.getOrDefault(a[i], 0) + 1);

		}
		for (Map.Entry<Integer, Integer> map : hmap.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
	}

}
