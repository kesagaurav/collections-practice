import java.util.*;
public class Stack1 {
	static Stack<Integer> st=new Stack();
	 static int min=0;

	public static void main(String[] args) {

		push(1);
		push(2);
		push(3);
		getMin();
		System.out.println(pop());
	}
	
	public static void push(int x) {
		 
		if(st.isEmpty()) {
			min=x;
			st.push(x);
		}else if(x<=min) {
			st.push(x-min);
			min=x;
		}else {
			st.push(x);
		}
	}
	
	public static int getMin() {
		return min;
		
	}
	
	public static int pop() {
		int res=0;
		if(st.peek()<=0) {
			res=min;
			min=min-st.peek();
			return res;
		}else {
			return st.peek();
		}
	}
}
