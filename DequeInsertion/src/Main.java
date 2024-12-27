import java.util.ArrayDeque;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		System.out.println(deque_Init(arr, n));
		ArrayDeque<Integer> al = new ArrayDeque<>();
		al.add(1);
		al.add(2);
		al.add(3);
		//eraseAll(al);
		//eraseAt(al, 3);
		print(al);
	}

	public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
		// Your code here
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < arr.length; i++) {
			dq.add(arr[i]);
		}
		return dq;
	}

	public static void eraseAt(ArrayDeque<Integer> deq, int X) {
		// Your code here
		int n=deq.size();
		for (int i = 0; i < n ; i++) {
			if (i== X) {
				System.out.println(deq.pollFirst());
			}else {
				deq.offerLast(deq.pollFirst());
			}
		}

	}

	// Function to erase the elements in range start (inclusive), end (exclusive).
	public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
		// Your code here
	}

	// Function to erase all the elements in the deque.
	public static void eraseAll(ArrayDeque<Integer> deq) {
		// Your code here

		deq.clear();
	}
public static void print(ArrayDeque<Integer> deq) {
	int n=deq.size();
	for (Integer integer : deq) {
		System.out.println(integer);
	}
	for (int i = 0; i < n; i++) {
		System.out.println(deq.add(i));
	}
}
}
