class Main {  
public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	int n1=20,n2=50;
	
	    //Node ans=lca(root,n1,n2);
    	//System.out.println("LCA: "+ans.key);
    }
}