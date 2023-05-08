
public class Main {

	public static void main(String[] args) {

		Tree tree=new Tree(10);
		tree.left=new Tree(4);
		tree.right=new Tree(6);
		tree.right.left=new Tree(40);
		tree.right.right=new Tree(50);
		tree.inorder(tree);
		//tree.preorder(tree);
		//tree.postorder(tree);
		//tree.height(tree);
		//tree.nodesAtKDistance(tree, 2);
		//tree.levelOrderTraversal2(tree);
		//tree.levelOrderTraversal3(tree);
		//System.out.println(tree.size(tree));
		//System.out.println(tree.MaximumOfBinaryTree(tree));
		//System.out.println(tree.sum(tree));
		//tree.left(tree);
		System.out.println(tree.childrenSum(tree));

		
	}

}
