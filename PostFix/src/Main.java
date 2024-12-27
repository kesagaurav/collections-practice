import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "231*+9-";
		System.out.println(postfixExpression(exp));
		String exp2="+*1023";
		System.out.println(prefixExpression(exp2));

	}

	public static int postfixExpression(String s) {
		Stack<Integer> st=new Stack<>();
	
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				st.push((int)s.charAt(i));
			}else {
				int val1=st.pop();
				int val2=st.pop();
				int result=0;
				//int a=Integer.parseInt(val1);
				//int b=Integer.parseInt(val2);
				switch(s.charAt(i)) {
				case '+':
					st.push(val1+val2);
					break;
				case  '-':
					st.push(val1-val2);
					break;
				case '*':
					st.push(val1*val2);
					break;
				case '/':
					st.push(val1/val2);
					break;
					
					
				}
		}
		
	}
		return st.pop();
		
	}
		
		public static int prefixExpression(String s) {
			Stack<Integer> st=new Stack<>();
			
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i))) {
					st.push((int)s.charAt(i));
				}else {
					int val1=st.pop();
					int val2=st.pop();
					int result=0;
					//int a=Integer.parseInt(val1);
					//int b=Integer.parseInt(val2);
					switch(s.charAt(i)) {
					case '+':
						st.push(val1+val2);
						break;
					case  '-':
						st.push(val1-val2);
						break;
					case '*':
						st.push(val1*val2);
						break;
					case '/':
						st.push(val1/val2);
						break;
						
						
					}
			}
			
		}
			return st.peek();

}
}
