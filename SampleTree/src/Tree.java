import java.util.*;

public class Tree {

	int key;
	Tree left;
	Tree right;

	public Tree(int key) {
		this.key = key;
		right = left = null;
	}

	public static void inorder(Tree tree) {
		if (tree != null) {
			inorder(tree.left); // left
			System.out.println(tree.key + " ");// data
			inorder(tree.right);// right
		}

	}

	public static void preorder(Tree tree) {
		if (tree != null) {
			System.out.println(tree.key + " ");// data or root
			inorder(tree.left); // left
			inorder(tree.right);// right
		}

	}

	public static void postorder(Tree tree) {
		if (tree != null) {
			inorder(tree.left); // left
			inorder(tree.right);// right
			System.out.println(tree.key + " ");// data or root
		}

	}

	public static int height(Tree tree) {
		int max;
		if (tree == null) {
			return 0;
		} else {
			max = Math.max(height(tree.left), height(tree.right)) + 1;
			System.out.println(max);
		}
		return max;
	}

	public static void nodesAtKDistance(Tree tree, int k) {
		if (tree == null) {
			return;
		}
		if (k == 0) {
			System.out.println(tree.key + " ");

		} else {

			nodesAtKDistance(tree.left, k - 1);
			nodesAtKDistance(tree.right, k - 1);
		}
	}

	public static void levelOrderTraversal(Tree tree) {
		if (tree == null) {
			return;
		}
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(tree);
		while (q.isEmpty() == false) {
			Tree t = q.poll();
			System.out.println(t.key + " ");
			if (t.left != null) {
				q.add(t.left);
			}
			if (t.right != null) {
				q.add(t.right);
			}
		}
	}

	public static void levelOrderTraversal2(Tree tree) {
		if (tree == null) {
			return;
		}
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(tree);
		q.add(null);
		while (q.size() > 1) {
			Tree t = q.poll();
			if (t == null) {
				System.out.println();
				q.add(null);
				continue;
			}
			System.out.println(t.key + " ");
			if (t.left != null) {
				q.add(t.left);
			}
			if (t.right != null) {
				q.add(t.right);
			}
		}
	}

	public static void levelOrderTraversal3(Tree tree) {
		if (tree == null) {
			return;
		}
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(tree);
		while (q.isEmpty() == false) {
			int count = q.size();
			for (int i = 0; i < count; i++) {
				Tree t = q.poll();
				System.out.println(t.key + " ");
				if (t.left != null) {
					q.add(t.left);
				}
				if (t.right != null) {
					q.add(t.right);
				}
			}
		}
		System.out.println();
	}

	public static int size(Tree tree) {
		/*
		 * Queue<Tree> t=new LinkedList<Tree>(); int count=t.size(); int a=0; for(int
		 * i=0;i<t.size();i++) { a++; } System.out.println(a); return a;
		 */

		if (tree == null)
			return 0;
		else
			return 1 + size(tree.left) + size(tree.right);
	}

	public static int MaximumOfBinaryTree(Tree tree) {

		if (tree == null)
			return Integer.MIN_VALUE;
		else
			return Math.max(tree.key, Math.max(MaximumOfBinaryTree(tree.left), MaximumOfBinaryTree(tree.right)));
	}
	
	
	public static boolean sum(Tree tree) {
		//int sum = Integer.sum(tree.left.key, tree.right.key);
		
		if(tree.key==tree.left.key+tree.right.key) {
			return true;
		}
		
		return false;
	}
	
	
	
	public static void left(Tree tree) {
		//int sum = Integer.sum(tree.left.key, tree.right.key);
		if (tree == null) {
			return;
		}
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(tree);
		while (q.isEmpty() == false) {
			int count = q.size();
			for (int i = 0; i < count; i++) {
				Tree t = q.poll();
				if(i==0)
				System.out.println(t.key + " ");
				if (t.left != null) {
					q.add(t.left);
				}
				if (t.right != null) {
					q.add(t.right);
				}
			}
		}
	}
	
	
	public static boolean childrenSum(Tree tree) {
		if(tree==null) {
			return true;
		}
		int sum=0;
		if(tree.left!=null) {
			sum+=tree.left.key;
		}else if(tree.right!=null) {
			sum+=tree.right.key;
		}
			return (tree.key==sum) && childrenSum(tree.left) && childrenSum(tree.right);
		
	}
}
