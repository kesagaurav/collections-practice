import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gaurav";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);// a=2
		}
		for (Map.Entry<Character, Integer> map1 : map.entrySet()) {
			
			System.out.println(map1.getKey() + " couunt is   " + map1.getValue());
		}
//		int c = 0;
//		for (int i = 0; i < s.length() - 1; i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				if (s.charAt(i) == s.charAt(j)) {
//					System.out.println(s.charAt(i));
//					break;
//				}
//			}
//
//		}

	}

}
