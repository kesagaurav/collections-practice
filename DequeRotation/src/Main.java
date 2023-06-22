import java.util.*;

public class Main {

	public static void main(String[] args) {

		/*
		 * dq.add(1); dq.add(2); dq.add(3);
		 * 
		 * System.out.println(dq); System.out.println(dq.remove());
		 * System.out.println(dq.peek());
		 */
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;

		Deque<Integer> dq = new ArrayDeque<>();

		for (int i : a) {

			dq.add(i);

		}

		for (int i = 0; i < k; i++) {
			int c = dq.remove();
			dq.addLast(c);
		}

		System.out.println(dq);
		
		//using strings
		String s="qwertyu";
		char[] e=s.toCharArray();
		int k1 = 2;

		ArrayDeque<Integer> dq1 = new ArrayDeque<>();
		StringBuilder sb=new StringBuilder();
		

		for (int i : a) {

			dq1.add(i);

		}

		for (int i = 0; i < k; i++) {
			dq1.addFirst(dq1.removeLast());
		}

		System.out.println(dq1);

	}
}
