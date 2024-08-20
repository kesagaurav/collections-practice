import java.util.*;
import java.util.stream.Collectors;

public class FibMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(10));
		System.out.println(fib1(10));
		System.out.println(fib2(10));
//		List<Employee> eList = new ArrayList<>();
//		eList.add(new Employee(1, "gaurav", 90000.00));
//		eList.add(new Employee(2, "ok", 1000.00));
//		System.out.println(eList);
//		eList.stream().filter(a->a.getId()==1).forEach(e->System.out.println(e));
		List<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.stream().forEach(e->System.out.println(e));
		System.out.println(list);
	}

	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	static int fib1(int n) {
		int[] fib = new int[n + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[n];
	}

	static int fib2(int n) {
		int a = 0, b = 1, c = 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		return b;
	}

}
