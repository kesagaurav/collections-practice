
public class Tree {
	int data;
	Tree left;
	Tree right;

	public Tree(int data) {
		this.data = data;
		left = right = null;
	}
	
	public static int height(Tree tree) {
		if(tree==null) {
			return 0;
		}
		return 1+Math.max(height(tree.left),height(tree.right));
	}
	
	public static int height1(Tree tree) {
		int res=0;
		if(tree==null) {
			return 0;
		}
		int lh=height(tree.left);
		int rh=height(tree.right);
		res=Math.max(res, 1+lh+rh);
		return 1+Math.max(lh,rh);
	}
	
	public static int diamater(Tree tree) {
		if(tree==null) {
			return 0;
		}
		int d1=1+height(tree.left)+height(tree.right);
		int d2=diamater(tree.left);
		int d3=diamater(tree.right);
		return Math.max(d1, Math.max(d2, d3));
		
	}
}
