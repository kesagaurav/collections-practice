
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,1,0,1,1,1};
		System.out.println(MaximumOne(a));

	}

	
	public static int MaximumOne(int a[]) {
		int res=0,c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				c++;
				res=Math.max(c, res);
			}else {
				c=0;
			}
		}
		return res;
	}
		
	
}
