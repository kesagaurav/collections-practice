import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="a+b*c+d";
		String s="(A-B/C)*(A/K-L)";
		System.out.println(infixToPostfix(s));
		//abcd^e-fgh*+^*+i-
	}
	
	public static int prec(char ch) {
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
			
	}
	
	public static boolean isOperator(char c) {
		if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^') {
			return true;
		}
		return false;
	}
	
	public static String infixToPostfix(String s) {
		String output;
		StringBuilder sb=new StringBuilder();
		char ch=0;
		ArrayDeque<Character> ar=new ArrayDeque<>();
		for(int i=s.length()-1;i>=0;i--) {
			 ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				sb.append(s.charAt(i));
			}
			
			else if(s.charAt(i)==')') {
				ar.push(ch);
			}
			else if(ch=='(') {
				while(!ar.isEmpty()&&ar.peek()!='(') {
				sb.append(ar.peek());
				ar.pop();
			}
				ar.pop();
			}
			
			
			else {
				while(!ar.isEmpty() && prec(ch)>=prec(ar.peek())) {
					ar.push(s.charAt(i));
				}
				while(!ar.isEmpty() && prec(ch)<=prec(ar.peek())) {
					sb.append(ar.peek());
					ar.pop();
				}
				ar.push(ch);
			}
			
			
		}
		
		while(!ar.isEmpty()) {
			sb.append(ar.peek());
			ar.pop();
		}
		return sb.reverse().toString();
	}

}
