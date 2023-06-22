
public class Main {

	public static void main(String[] args) {

		Tree root=new Tree(10);
    	root.left=new Tree(20);
    	root.right=new Tree(30);
    	root.right.left=new Tree(40);
    	root.right.right=new Tree(60);
	    root.right.left.left=new Tree(50);
	    root.right.right.right=new Tree(70);
    	
    	System.out.println(root.diamater(root));
	}

}
