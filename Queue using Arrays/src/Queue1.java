import java.util.*;
public class Queue1 {
	private static int n = 5;
	private static int queue[] = new int[n];
	private static int front, rear = -1;
	public static Queue<Integer> q=new LinkedList<>();

	 
	public static void Enqueue(int ele) {
		if (rear == n - 1) {
			System.out.println("\n queue is full");
		} else {
			System.out.println(ele);
			if (front == -1) {
				front = 0;
			}
			rear++;
			queue[rear] = ele;
		}
	}

	public static void Dequeue() {
		int ele = 0;
		if (rear == -1) {
			System.out.println("\n underflow");
		} else {

			ele = queue[front];
			System.out.println(ele);
			front++;

		}
	}

	public static void Display() {
		int ele = 0;
		if (q.isEmpty()==false || rear==-1) {
			System.out.println("\n empty queue");
		} else {
			System.out.println("\n the values are");
			for (int i = front; i <= rear; i++) {
				System.out.println(queue[i]);
			}

		}
	}

}
