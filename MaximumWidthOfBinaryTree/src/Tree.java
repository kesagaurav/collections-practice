import java.util.*;

public class Tree {
	
		int data;
		Tree left;
		Tree right;

		public Tree(int data) {
			this.data = data;
			left = right = null;
		}

	

	public static void Inorder(Tree root) {
		if (root != null) {
			Inorder(root.left);
			System.out.println(root.data + "");
			Inorder(root.right);
		}
	}

	public static void levelOrderTraversal(Tree root) {
		if (root == null) {
			return;
		} else {
			Queue<Tree> q = new ArrayDeque<>();
			q.add(root);
			while (q.isEmpty() == false) {
				int b = q.size();
				for (int i = 0; i < b; i++) {
					Tree c = q.poll();
					System.out.println(c.data + "");
					if (c.left != null) {
						q.add(c.left);
					} else if (c.right != null) {
						q.add(c.right);
					}
				}
			}
		}
		System.out.println();
	}
	
	
	
	
	public static int maxwidth(Tree root) {
		int res=0;
		if (root == null) {
			return 0;
		} else {
			Queue<Tree> q = new ArrayDeque<>();
			q.add(root);
			
			while (q.isEmpty() == false) {
				int b = q.size();
				res=Math.max(res, b);
				for (int i = 0; i < b; i++) {
					Tree c = q.poll();
					//System.out.println(c.data + "");
					if (c.left != null) {
						q.add(c.left);
					}  if (c.right != null) {
						q.add(c.right);
					}
				}
			}
			return res;
		}
		
	}
	
}
