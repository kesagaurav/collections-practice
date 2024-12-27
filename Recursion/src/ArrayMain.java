import java.util.HashSet;

public class ArrayMain {

	public static void main(String[] args) {
		merge();
	}

	public static void merge() {
		int m[]= {1,2,3,0,0,0};
		int n[]= {5,6,7};
		int c1=m.length+n.length;
		int c[]=new int[c1];
		HashSet<Integer> set=new HashSet<>();
		/*
		 * for(int i=0;i<m.length;i++) { if(m[i]==0) { break; } c[i]=m[i]; } for(int
		 * j=0;j<n.length;j++) { if(n[j]==0) { break; } c[m.length+j]=n[j]; }
		 */
		
		
		
		for(int i=0;i<c1;i++) {
			System.out.println(c[i]);
		}
		
		
		
	}
	
}
