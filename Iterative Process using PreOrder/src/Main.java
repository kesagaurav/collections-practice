
public class Main {

	public static void main(String[] args) {

		Preorder order=new Preorder(10);
		order.left=new Preorder(20);
		order.right=new Preorder(30);
		order.left.left=new Preorder(40);
		order.left.right=new Preorder(50);
		order.iterativePreorder2(order);
		
	}

}
