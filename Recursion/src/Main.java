public class Main {

	public static void main(String[] args) {

	 System.out.println("Factorial of a number is " + fact(5));
	 System.out.println("Fibbanoci number is "  + fib(5));
	}

	public static int fact(int n) {

		if (n == 1 || n == 0) {
			return 1;
		}
		return n * fact(n - 1);

	}

	public static int fib(int n) {
		
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
		 
		
	}
	
	
}
