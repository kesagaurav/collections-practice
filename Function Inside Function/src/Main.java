
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int b=20;
		Calculator(a, b);
		
		
	}
	
	public  static void Calculator(int a,int b) {
		if(a>b) {
			 add(a,b);
		}
			sub(a,b);
		
	}
	
	public static void add(int a,int b) {
		//return a+b;
		System.out.println(a+b);
	}
	
	public static void sub(int c,int d) {
		//return c-d;
		System.out.println(c-d);
	}
	
	

}
