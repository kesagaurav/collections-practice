import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="baadccab";
		HashSet<String> str=new HashSet<>();
		System.out.println(minimizedStringLength(s));
		

	}

	public static int minimizedStringLength(String s) {
			StringBuilder sb=new StringBuilder(s);
			HashSet<Character> str=new HashSet<>();

			for(int i=0;i<s.length();i++) {
				str.add(s.charAt(i));
			}
			return str.size();
	}
}
