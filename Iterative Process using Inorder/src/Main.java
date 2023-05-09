
public class Main {

	public static void main(String[] args) {

		Inorder order=new Inorder(10);
		order.left=new Inorder(20);
		order.right=new Inorder(30);
		order.left.left=new Inorder(40);
		order.left.right=new Inorder(50);
		order.iterativeInorder(order);
		
	}

}
