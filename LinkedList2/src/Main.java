
public class Main {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.create(10);
		ll.create(20);
		ll.create(20);
		ll.create(30);
		ll.create(30);
		ll.display();
		ll.removeDuplicates();
		System.out.println("\n after removing duplicates the values are");
		ll.display();
		LinkedList l2=new LinkedList();
		l2.create(5);
		l2.create(15);
		l2.create(17);
		l2.create(18);
		l2.create(35);
		System.out.println("\n ele of ll2 are ");
		l2.display();
		ll.pairwiseswap();
		System.out.println("\n swapping the values");
		ll.display();
		ll.middleofLinkedList();
		System.out.println("middle of linked list");
		ll.display();
	}

}
