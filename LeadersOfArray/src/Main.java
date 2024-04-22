
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {7,10,4,3,6,5,2};
		boolean flag=false;
		for (int i = 0; i < ar.length-1; i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<=ar[j]) {
					flag=true;
					break;
				}
				if(flag==false) {
					System.out.println(ar[i]);
				}
			}
		}

	}

}
