import java.util.*;
public class Inorder {
	int key;
	Inorder left;
	Inorder right;

	public Inorder(int key) {
		this.key = key;
		right = left = null;
	}
	
	public static void iterativeInorder(Inorder root) {
		Stack<Inorder> st=new Stack<Inorder>();
		Inorder curr=root;
		while(curr!=null || st.isEmpty()==false) {
			while(curr!=null) {
				st.push(curr);
				curr=curr.left;
			}
			curr = st.pop();
			System.out.println(curr.key + " ");
			curr=curr.right;
		}
	
	}
}
