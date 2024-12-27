import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="***gaurav&&&areuokay///good";
//		s.replaceAll("^[***&&&///]", "");
//		System.out.println(s);
		String s="gauravkkkesa";
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
//			System.out.println(key + " " + val);
			if(entry.getValue()>3) {
				System.out.println(key + " " + val);

			}

			System.out.println(key + " " + val);
		}
		
	}

}
