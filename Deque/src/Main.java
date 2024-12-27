import java.util.*;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		/*
		 * Deque<Integer> d = new LinkedList<>(); d.offerFirst(10); d.offerLast(20);
		 * d.offerFirst(5); d.offerLast(15); System.out.println(d.peekFirst());
		 * System.out.println(d.peekLast()); d.pollFirst(); d.pollLast();
		 * System.out.println(d.peekFirst()); System.out.println(d.peekLast());
		 * ArrayDeque<Integer> li = new ArrayDeque<>(); Integer i1 = new Integer(1);
		 * Integer i2 = new Integer(2); int a = i1 == i2 ? 0 : 1; System.out.println(a);
		 */
		int a1[] = { 10, 20, 30 };
		int b[] = { 5, 15, 25 };
		MedianOfTwoArrays(a1, b);

	}

	public static void MedianOfTwoArrays(int a[], int b[]) {

		int a1 = a.length;
		int b1 = b.length;
		int c = a.length + b.length;
		int[] c1 = new int[c];
		for (int i = 0; i < a.length; i++) {
			c1[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c1[a1 + j] = b[j];
		}
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		System.out.println("\n after sorting an array the values are");

		Arrays.stream(c1).sorted().filter(e->e%2==0).forEach(e -> System.out.println(e));
		
	}

}
