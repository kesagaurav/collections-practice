import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.create(2);
		ll.create(3);
		ll.create(4);
		ll.create(9);
		// ll.display();
		ll.insertAtBeginning(1);
		// ll.display();
		ll.insertAtEnd(10);
		ll.display();
		ll.count();
		ll.display();
		String s = "abcd";
		int k = 2;
		revererse(s, k);
	}

	public static String revererse(String s, int k) {
		char temp[];
		char s1[] = s.toCharArray();
		for (int i = 0; i < k; i++) {
			/*
			 * temp = s1[i]; s1[i] = s1[i + 1]; s1[i + 1] = temp;
			 */
		}
		return s1.toString();
	}
}
