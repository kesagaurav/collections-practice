import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Integer.toBinaryString(n));
		List<Integer> as = Arrays.asList(10, 30, 40, 20, 50);
		System.out.println(as.stream().reduce((x, y) -> x + y));

	}

}
