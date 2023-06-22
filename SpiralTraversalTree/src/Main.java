
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree(1);
		t.left=new Tree(2);
		t.right=new Tree(3);
		t.left.left=new Tree(4);
		t.left.right=new Tree(5);
		t.right.left=new Tree(6);
		t.right.right=new Tree(7);
		
		//t.spiralTraversal(t);
		t.spiralTraversal2(t);

	}

}
