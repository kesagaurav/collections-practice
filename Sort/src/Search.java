
public class Search {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int key=5;
		System.out.println(selectionSearch(a, key));
		
	}
	
	public static boolean selectionSearch(int a[],int key) {
		boolean b=false;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				b=true;
			}
			b=false;
		}
		return b;
	}

}
