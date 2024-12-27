
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(10));

	}
	
	static int fib(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

}
