import java.util.*;

public class Tree {
	int data;
	Tree left;
	Tree right;

	public Tree(int data) {
		this.data = data;
		left = right = null;
	}

	public static void spiralTraversal(Tree tree) {
		if (tree == null) {
			return;
		}
		Queue<Tree> que = new ArrayDeque<>();
		ArrayDeque<Integer> que1 = new ArrayDeque<>();
		boolean rev = false;
		que.add(tree);
		while (!que.isEmpty()) {
			int a = que.size();
			for (int i = 0; i < a; i++) {
				Tree t = que.poll();
				if (rev) {
					que1.push(t.data);
				} else {
					System.out.println(t.data + "");
				}
				if (t.left != null) {
					que.add(t.left);
				}
				if (t.right != null) {
					que.add(t.right);
				}

			}
			if (rev) {
				while (!que1.isEmpty()) {
					System.out.println(que1.pop());
				}
			}
			rev = !rev;
			System.out.println();

		}
	}

		
		public static void spiralTraversal2(Tree tree) {
			if (tree == null) {
				return;
			}
			Stack<Tree> s1 = new Stack<>();
			Stack<Tree> s2 = new Stack<>();
			ArrayDeque<Integer> que = new ArrayDeque<>();
			boolean rev = false;
			//que.add(tree);
			s1.add(tree);
			while(!s1.isEmpty() || !s2.isEmpty()) {
				while(!s1.isEmpty()) {
					Tree t=s1.peek();
					s1.pop();
					System.out.println(t.data);
					if(t.right!=null) {
						s2.add(t.right);
					}if(t.left!=null) {
						s2.add(t.left);
					}
				}
				while(!s2.isEmpty()) {
					Tree t=s2.peek();
					s2.pop();
					System.out.println(t.data);
					if(t.left!=null) {
						s1.add(t.left);
					}if(t.right!=null){
						s1.add(t.right);
					}
				}
				
			}
		

			
		
		
	}
}