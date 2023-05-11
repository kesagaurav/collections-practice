
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,10,60,100};
		int b[]= {30,20,100,10};
		int c[]=new int[a.length+b.length];
		System.out.println(tour(a, b,c.length));

	}
	
	public static int tour(int p[],int d[],int n) {
		int curr_p=0,prev_p=0,start=0;
		for(int i=0;i<n;i++) {
			curr_p+=(p[i]-d[i]);
			if(curr_p<0) {
				start+=1;
				prev_p+=curr_p;
				start=0;
			}
		}
		
		return (curr_p+prev_p>=0)?start+1:-1;
	}

}
