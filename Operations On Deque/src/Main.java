import java.util.*;

public class Main {

	public static void main(String[] args) {

		Deque<Integer> qu = new ArrayDeque<>();
		qu.add(1);
		qu.add(2);
		qu.add(3);
		qu.add(4);
		qu.add(5);
		qu.add(6);
		qu.add(7);
		qu.add(8);
		qu.add(9);
		qu.add(10);
		System.out.println(qu);
		System.out.println(qu.getFirst());
		System.out.println(qu.getLast());
		System.out.println(qu.pollFirst());
		System.out.println("the size of elements are " + qu.size());
		System.out.println(qu);
		System.out.println(qu.pollLast());
		System.out.println("the size of elements are " + qu.size());
		// System.out.println(qu);
		System.out.println(qu.removeLast());
		System.out.println(qu.remove());
		System.out.println("peek elements " + qu.peekFirst());
		System.out.println("peek last " + qu.peekLast());
		Integer[] q1 = new Integer[qu.size()];
		Integer[] q2 = qu.toArray(q1);
		System.out.println("\n the elments are");
		for (int i = 0; i < q2.length; i++) {
			System.out.println(q2[i]);
		}
		MyDs ds = new MyDs();
		ds.insertMax(5);
		ds.insertMin(1);
		System.out.println("min of values from the queue");
		ds.getMin();
		System.out.println("max of values from the queue");
		ds.getMax();
		ds.insertMin(3);
		System.out.println("min value is");
		ds.getMin();
		System.out.println("max value is");
		ds.getMax();
	}

}
