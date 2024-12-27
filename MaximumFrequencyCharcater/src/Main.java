import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s =  "gauraaaaaavvvvvvvvvv";
			HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0;i<s.length();i++) {
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			}
			
			System.out.println(map);
			int maxFrequency = 0;
			char maxChar = s.charAt(0);

			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			    if (entry.getValue() > maxFrequency) {
			        maxFrequency = entry.getValue();
			        maxChar = entry.getKey();
			    }
			}

			System.out.println("Character with maximum frequency: " + maxChar);
			System.out.println("Maximum frequency: " + maxFrequency);
//			char ch=s.charAt(0);
//			for(Character key:map.keySet()) {
//				if(map.get(key)>map.get(ch)) {
//					ch=key;
//				}
//			}
//			System.out.println(ch);
	}

}
