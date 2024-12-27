import java.util.ArrayDeque;
import java.util.Deque;

public class LinkedList {

	class Node {
		char data;
		Node next;

		public Node(char data) {
			this.data = data;
			this.next = null;
		}

	}

	private Node head;
	private Node temp;
	private Node tail;

	public void create(char data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public boolean isPalindrome() {
		Deque<Character> dq = new ArrayDeque<Character>();
		for (Node curr = head; curr != null; curr = curr.next) {
			dq.push(curr.data);
		}
		for (Node curr = head; curr != null; curr = curr.next) {
			if (dq.pop() != curr.data) {
				return false;
			}
		}
		return true;
	}

	public void display() {
		temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
}
