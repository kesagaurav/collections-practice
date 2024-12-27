import java.util.*;

public class Main {
	static class Stack {
		static Deque<Integer> qa = new ArrayDeque<>();
		static Deque<Integer> qb = new ArrayDeque<>();

		public static void push(int a) {
			qa.addLast(a);

		}

		public static int pop() {
			int item=qa.getLast();
			qa.removeLast();
			return item;
		}

		public static int top() {
			if (qa.isEmpty()) {
				return -1;
			}else {
			return qa.getLast();
			}
		}

		public static int size() {
			return qa.size();
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());

		/*
		 * qa.push(10); qa.push(5); qa.push(15); System.out.println(qa);
		 */
	}

}
