import java.util.*;

public class Main {

	public static void main(String[] args) {

		int a[] = { 4, -3, 2, 1 };
		System.out.println(isSubArrayWithZero1(a));
	}

	public static boolean isSubArrayWithZero(int a[]) {
		int curr_sum = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length; j++) {
				curr_sum += a[j];
				if (curr_sum == 0) {
					return true;
				}
			}

		}
		return false;
	}

	public static boolean isSubArrayWithZero1(int a[]) {
		HashSet<Integer> hs = new HashSet<>();
		int prefix_sum = 0;
		for (int i = 0; i < a.length; i++) {
			prefix_sum += a[i];
			if (hs.contains(prefix_sum)) {
				return true;
			}
			if (prefix_sum == 0)
				return true;
			hs.add(prefix_sum);

		}
		return false;
	}

}
