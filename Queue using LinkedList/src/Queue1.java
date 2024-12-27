import java.util.*;

public class Queue1 {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	private static Node front;
	private static Node rear;
	private static Node temp;
	public void Enqueue(int ele) {

		Node newNode = new Node(ele);
		if (rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public static void Dequeue() {
		if(front==null) {
			System.out.println("\n queue is empty");
		}else {
			temp=front;
			front=front.next;
			temp.next=null;
		}
	}

	public static void Display() {
		temp=front;
		if(front==null) {
			System.out.println("queue is empty");
		}
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
