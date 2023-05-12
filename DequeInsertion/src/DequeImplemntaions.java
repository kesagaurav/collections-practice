import java.util.*;

public class DequeImplemntaions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> de = new ArrayDeque<>();
		push_front_pf(de, 5);
		push_back_pb(de, 6);
		
	}

	public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
		// Your code here
		dq.addLast(x);
	}

	// Function to pop element from back of the deque.

	public static void pop_back_ppb(ArrayDeque<Integer> dq) { // Your code here 
		dq.removeLast();
	}
	

	// Function to return element from front of the deque.

	public static int front_dq(ArrayDeque<Integer> dq) { // Your code here
		return dq.peek();
		
	}

	// Function to push element x to the front of the deque.
	public static void push_front_pf(ArrayDeque<Integer> dq, int x) {
		// Your code here
		dq.push(x);
	}
}
