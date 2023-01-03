import java.util.Arrays;
import java.util.Comparator;

public class MyClass implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1 % 2 - o2 % 2;
	}

	public static void main(String[] args) {
		Integer b1[]= {5,3,2,1,4,6};
		Arrays.sort(b1, new MyClass());
		System.out.println(Arrays.toString(b1));
	}
}
