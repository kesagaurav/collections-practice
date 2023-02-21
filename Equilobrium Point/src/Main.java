
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,8,-9,-9,7};
		System.out.println(isEquilibrium(a));

	}
	
	private static boolean isEquilibrium(int a[]) {
		int rs=0;
		for(int i=0;i<a.length;i++) {
			rs+=a[i];
		}
		int ls=0;
		for(int i=0;i<a.length;i++) {
			rs-=a[i];
			if(ls==rs) 
				return true;
			ls+=a[i];
		}
		return false;
	}

}
