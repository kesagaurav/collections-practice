import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbccde";
//		boolean uniq = true;
//		for (int i = 0; i < s.length(); i++) {
//			boolean uniq = true;
//
//			for (int j = 0; j < s.length(); j++) {
//				if (i!=j&& s.charAt(i) == s.charAt(j)) {
//					uniq = false;
//					break;
//				}
//			}
//			if (uniq) {
//				System.out.println(s.charAt(i));
//				break;
//			}
//		}

		//using map
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			
			if(val==1) {
				System.out.println(key + " " + val);
				break;
			}
			
		}
	}

}
