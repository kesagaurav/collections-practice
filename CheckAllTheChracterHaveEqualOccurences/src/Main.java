import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abab";
		System.out.println(equalOcc(s));

	}
	
	static boolean equalOcc(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
		}
		int x=map.get(s.charAt(0));
		for(int i:map.values()) {
			if(i!=x) {
				return false;
			}
		}
		return true;
	}

}
