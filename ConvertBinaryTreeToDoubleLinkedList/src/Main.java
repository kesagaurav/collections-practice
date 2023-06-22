
public class Main {

	public static void main(String[] args) {

		
		Tree root=new Tree(10);
    	root.left=new Tree(5);
    	root.right=new Tree(20);
    	root.right.left=new Tree(30);
        root.right.right=new Tree(35);
    	
        Tree head=root.Inorder(root);
	    root.printlist(head);
	}

	

}
