
public class Main {

	public static void main(String[] args) {

		Queue1 q = new Queue1();
		
		System.out.println("\n the items are");
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		q.Enqueue(6);
		q.Enqueue(7);
		
		q.Display();
		q.Dequeue();
		System.out.println("after removing the front element the elements are");//delete for one element
		q.Display();
		
	}

}
