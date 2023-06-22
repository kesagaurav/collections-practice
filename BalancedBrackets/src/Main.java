import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(a+b)+(c+d)";
		System.out.println(bal(s));

	}

	public static boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/') {
			return true;
		}
		return false;
	}

	public static boolean bal(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length()-1; i++) {
			while (st.isEmpty() || Character.isLetter(s.charAt(i)) || s.charAt(i) == '(' || isOperator(s.charAt(i))) {
				st.push(s.charAt(i));
			}
			if (s.charAt(i) == ')' && st.peek() == '(') {
				return true;
			} else {
				st.pop();
			}
		}
		return false;
	}

}
