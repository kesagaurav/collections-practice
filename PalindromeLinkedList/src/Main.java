
public class Main {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.create('g');
		ll.create('f');
		ll.create('g');
		ll.display();
		ll.isPalindrome();
		if (ll.isPalindrome()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		// ll.display();

	}

}
