import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyDs {

	public static Deque<Integer> dq=new ArrayDeque<Integer>();

	
	
	public static void insertMin(int a) {
		dq.offerFirst(a);
	}
	
	public static void insertMax(int a) {
		dq.offerLast(a);
	}
	
	public static void getMin() {
		System.out.println(dq.peekFirst());
	}
	
	
	public static void getMax() {
		System.out.println(dq.peekLast());
	}
	
	public static int extractMin() {
		return dq.pollFirst();
	}
	
	public static int extractMax() {
		return dq.pollLast();
	}
	
}
