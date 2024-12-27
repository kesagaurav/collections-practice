
public class Main {

	public static void main(String[] args) {

		Tree t=new Tree(10);
		t.left=new Tree(20);
		t.right=new Tree(30);
		t.left.left=new Tree(40);
		t.left.right=new Tree(50);
		t.right.left=new Tree(60);
		//t.right.right=new Tree(70);
		
		t.Inorder(t);
		//t.levelOrderTraversal(t);
		System.out.println("max value is " + t.maxwidth(t));
		
		
		
		
	}

}
