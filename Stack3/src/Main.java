import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {

		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.push(1);
		ad.push(2);
		ad.push(3);
		ad.forEach(e->System.out.println(e));
		Long collect = ad.stream().collect(Collectors.counting());
		System.out.println(collect);
		String s="([{}])";
		System.out.println(isBalanced(s));
		if(isBalanced(s)) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
		
	}

	
	public static boolean isBalanced(String s) {
		ArrayDeque<Character> ad1=new ArrayDeque<>();
		for(int i=0;i<s.length();i++) {
			char t=s.charAt(i);
			if(t=='(' || t=='{'||t=='[') {
				ad1.push(t);
			}else if(t==')' || t=='}'||t==']') {
				ad1.push(t);
			}else {
				ad1.pop();
			}
		}
		return true;
	}
	
	
}
