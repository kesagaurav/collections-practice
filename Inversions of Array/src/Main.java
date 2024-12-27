
public class Main {

	public static void main(String[] args) {

		int a[]= {40,30,20,10};
		int c=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					c++;
				}
			}
		}
		System.out.println(c);
	}

}
