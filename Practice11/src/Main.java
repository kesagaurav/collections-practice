import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Gaurav g=new Gaurav(11);
//		Gaurav g1=new Gaurav(11);
//		Gaurav g2=new Gaurav(11);
//		Gaurav g3=new Gaurav(11);
		String[] words = { "ad", "bd", "aaab", "baa", "badab" };
		String allowed = "ab";
		System.out.println(words(allowed, words));

	}

	static int words(String allowed, String[] words) {
		int c = 0;
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < allowed.length(); i++) {
			set.add(allowed.charAt(i));

		}
		for (String s : words) {
			boolean flag = true;
			for (int i = 0; i < s.length(); i++) {
				if(!set.contains(s.charAt(i)))
				flag = false;
			}
			if(flag) {
				c++;
			}
		}
		
		return c;
	}

}
