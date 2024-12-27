
public class Tree {

	int data;
	Tree left;
	Tree right;

	public Tree(int data) {
		this.data = data;
		left = right = null;
	}
	
	public static Tree prev=null;

	public static Tree Inorder(Tree root) {
		
		if (root == null)
			return root;

		Tree head = Inorder(root.left);
		if (prev == null) {
			head = root;
		} else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;
		Inorder(root.right);

		return head;
	}

	public static void printlist(Tree head) {
		Tree curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.right;
		}

	}
}
