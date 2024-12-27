import java.util.*;

public class Preorder {
	int key;
	Preorder left;
	Preorder right;

	public Preorder(int key) {
		this.key = key;
		right = left = null;
	}

	public static void iterativePreorder(Preorder root) {
		if (root == null) {
			return;
		}
		Stack<Preorder> s = new Stack<Preorder>();
		s.push(root);
		while (s.isEmpty() == false) {
			Preorder curr = s.pop();
			System.out.println(curr.key + " ");
			if (curr.right != null) {
				s.push(curr.right);
			}

			if (curr.left != null) {
				s.push(curr.left);
			}

		}
	}
	public static void iterativePreorder2(Preorder root) {
		if (root == null) {
			return;
		}
		Stack<Preorder> s = new Stack<Preorder>();
		Preorder curr=root;
		while (s.isEmpty() == false || curr!=null) {
			while(curr!=null) {
				System.out.println(curr.key + " ");
				s.push(curr.right);
				curr=curr.left;
			}
			if(s.isEmpty()==false) {
				curr=s.pop();
			}

		}
	}
}
