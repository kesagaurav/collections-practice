import java.util.*;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println("first ele is " + queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		int a = queue.size();
		// System.out.println(queue.size());
		/*
		 * for(int i=0;i<a;i++) { queue.add(i); //break;
		 * 
		 * }
		 */
		/*
		 * Iterator it = queue.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

	}

}
