import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gaurav";
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);//a=2
		}
		for(Map.Entry<Character, Integer> map1:map.entrySet()) {
			System.out.println(map1.getKey() + " couunt is   " + map1.getValue());
		}

	}

}
