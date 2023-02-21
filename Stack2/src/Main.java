import java.util.*;
public class Main {

	public static void main(String[] args) {

		Stack<Integer> s=new Stack();
		/*
		 * s.push(1); s.push(2); s.push(3); s.forEach(e->System.out.println(e));
		 */
		System.out.println(s.search(1));
		MyStack s2=new MyStack();
		s2.push(1);
		s2.push(2);
		s2.push(3);
		System.out.println(s2.peek());
		System.out.println(s2.pop());
		System.out.println(s2.size());
		System.out.println(s2.isEmpty());
		
		
		
	}

}
