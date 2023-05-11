
public class Main {

	public static void main(String[] args) {

		Queue1 q = new Queue1();
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(4);
		System.out.println("\n the deleted items are");
		q.Dequeue();
		System.out.println("\n the deleted items are");
		q.Dequeue();

		System.out.println("displaying the values");
		q.Display();
	}

}
